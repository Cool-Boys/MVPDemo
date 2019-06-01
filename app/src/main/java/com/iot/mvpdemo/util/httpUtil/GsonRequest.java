package com.iot.mvpdemo.util.httpUtil;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.ParseError;
import com.android.volley.Request;
import com.android.volley.Response;
import com.android.volley.toolbox.HttpHeaderParser;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.iot.mvpdemo.model.base.BaseBean;
import com.iot.mvpdemo.util.gson.mGson;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class GsonRequest<T> extends Request<T> {
    private final Response.Listener<T> mListener;
    private static Gson gson = mGson.buildGson();
    private Class<T> mClass;
    private Map<String, String> mParams;//post Params
    private TypeToken<T> mTypeToken;


    public GsonRequest(int method, Map<String, String> params, String url, Class<T> clazz, Response.Listener<T> listener,
                       Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        this.setRetryPolicy(
                new DefaultRetryPolicy(
                        10 * 1000,//默认超时时间，应设置一个稍微大点儿的
                        DefaultRetryPolicy.DEFAULT_MAX_RETRIES,//默认最大尝试次数
                        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                )
        );
        mClass = clazz;
        mListener = listener;
        mParams = params;
    }

    public GsonRequest(int method, Map<String, String> params, String url, TypeToken<T> typeToken, Response.Listener<T> listener,
                       Response.ErrorListener errorListener) {
        super(method, url, errorListener);
        mTypeToken = typeToken;
        mListener = listener;
        mParams = params;
    }


    //get
    public GsonRequest(String url, Class<T> clazz, Response.Listener<T> listener, Response.ErrorListener errorListener) {
        this(Method.GET, null, url, clazz, listener, errorListener);
        this.setRetryPolicy(
                new DefaultRetryPolicy(
                        10 * 1000,//默认超时时间，应设置一个稍微大点儿的
                        DefaultRetryPolicy.DEFAULT_MAX_RETRIES,//默认最大尝试次数
                        DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
                )
        );

    }

    public GsonRequest(String url, TypeToken<T> typeToken, Response.Listener<T> listener, Response.ErrorListener errorListener) {

        this(Method.GET, null, url, typeToken, listener, errorListener);

    }

    @Override
    protected Map<String, String> getParams() throws AuthFailureError {
        return mParams;
    }

    @Override
    protected Response<T> parseNetworkResponse(NetworkResponse response) {
        String jsonString = "";
        try {
            jsonString = new String(response.data, HttpHeaderParser.parseCharset(response.headers));
            BaseBean resultBean = gson.fromJson(jsonString, BaseBean.class);
            if (resultBean.getErrcode() == -1) {
                jsonString = jsonString.replaceFirst("\"data\":\"\"", "\"data\":null");
            }

            //解决返回的data为“”的处理方式
            if (mTypeToken == null) {
//                ResultBean resultBean = gson.fromJson(jsonString, ResultBean.class);
//                if (resultBean.getErrcode()>-1) {
                return Response.success(gson.fromJson(jsonString, mClass),
                        HttpHeaderParser.parseCacheHeaders(response));//用Gson解析返回Java对象
//                }
//                else
//                {
//                    mClass= (Class<T>) ResultBean.class;
//                    return Response.success(gson.fromJson(jsonString, mClass),
//                            HttpHeaderParser.parseCacheHeaders(response));//用Gson解析返回Java对象
//                }
            } else
                return (Response<T>) Response.success(gson.fromJson(jsonString, mTypeToken.getType()),
                        HttpHeaderParser.parseCacheHeaders(response));//通过构造TypeToken让Gson解析成自定义的对象类型

        } catch (UnsupportedEncodingException e) {
            return Response.error(new ParseError(e));
        }
    }

    @Override
    protected void deliverResponse(T response) {
        mListener.onResponse(response);
    }

}
