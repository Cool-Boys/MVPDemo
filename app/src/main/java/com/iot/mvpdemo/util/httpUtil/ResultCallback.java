package com.iot.mvpdemo.util.httpUtil;
import com.google.gson.internal.$Gson$Types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import okhttp3.Request;

/**
 * Created by wangjitao on 15/10/16.
 * 抽象类，用于请求成功后的回调
 */
public abstract  class ResultCallback<T> {
    //这是请求数据的返回类型，包含常见的（Bean，List等）
    Type mType;

    public ResultCallback() {
        mType = getSuperclassTypeParameter(getClass());
    }

    /**
     * 通过反射想要的返回类型
     *
     * @param subclass
     * @return
     */
    static Type getSuperclassTypeParameter(Class<?> subclass) {
        Type superclass = subclass.getGenericSuperclass();
        if (superclass instanceof Class) {
            throw new RuntimeException("Missing type parameter.");
        }
        ParameterizedType parameterized = (ParameterizedType) superclass;
        return $Gson$Types.canonicalize(parameterized.getActualTypeArguments()[0]);
    }

    /**
     * 在请求之前的方法，一般用于加载框展示
     *
     * @param request
     */
    public void onBefore(Request request) {
    }

    /**
     * 在请求之后的方法，一般用于加载框隐藏
     */
    public void onAfter() {
    }

    /**
     * 请求失败的时候
     *
     * @param request
     * @param e
     */
    public abstract void onError(Request request, Exception e);

    /**
     *
     * @param response
     */
    public abstract void onResponse(T response);
}
