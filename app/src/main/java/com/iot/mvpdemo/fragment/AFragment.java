package com.iot.mvpdemo.fragment;

import android.app.ProgressDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.google.gson.Gson;
import com.iot.mvpdemo.R;
import com.iot.mvpdemo.adapter.SmartViewHolder;
import com.iot.mvpdemo.adapter.smartBaseRecyclerAdapter;
import com.iot.mvpdemo.base.BaseFragment;
import com.iot.mvpdemo.model.bean.DeviceByEmpIdBean;
import com.iot.mvpdemo.presenter.DevicePresenter;
import com.iot.mvpdemo.util.gson.mGson;
import com.iot.mvpdemo.view.MvpView;
import com.scwang.smartrefresh.layout.SmartRefreshLayout;
import com.scwang.smartrefresh.layout.api.RefreshLayout;
import com.scwang.smartrefresh.layout.listener.OnLoadMoreListener;
import com.scwang.smartrefresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;

public class AFragment extends BaseFragment implements AdapterView.OnItemClickListener, MvpView<DeviceByEmpIdBean> {


    @BindView(R.id.dev_list)
    RecyclerView devList;
    @BindView(R.id.refreshLayout)
    SmartRefreshLayout refreshLayout;
    private smartBaseRecyclerAdapter<DeviceByEmpIdBean.DataBean> mAdapter;
    DevicePresenter presenter;
    private static Gson gson = mGson.buildGson();
    private List<DeviceByEmpIdBean.DataBean> listDev = new ArrayList<>();

    Map<String, String> getDeviceByEmpIdParams = new HashMap<>();
    private int page = 1;
    String type = "ref";


    private void initRef() {
        getDeviceByEmpIdParams.put("appId", "2");
        getDeviceByEmpIdParams.put("typeId", "0");
        getDeviceByEmpIdParams.put("empId", "6");
        getDeviceByEmpIdParams.put("statusId", "0");
        getDeviceByEmpIdParams.put("limit", "10");
        getDeviceByEmpIdParams.put("page", page + "");

        refreshLayout.setEnableAutoLoadMore(true);//开启自动加载功能（非必须）
        refreshLayout.setOnRefreshListener(new OnRefreshListener() {
            @Override
            public void onRefresh(@NonNull final RefreshLayout refreshLayout) {
                refreshLayout.getLayout().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getDeviceByEmpIdParams.put("page", "1");
                        type = "ref";
                        presenter.getData(getDeviceByEmpIdParams);
                    }
                }, 200);
            }
        });
        refreshLayout.setOnLoadMoreListener(new OnLoadMoreListener() {
            @Override
            public void onLoadMore(@NonNull final RefreshLayout refreshLayout) {
                refreshLayout.getLayout().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        getDeviceByEmpIdParams.put("page", (++page) + "");
                        type = "more";
                        presenter.getData(getDeviceByEmpIdParams);
                    }
                }, 2000);
            }
        });

        //触发自动刷新
        refreshLayout.autoRefresh();
    }


    private void initAdapter() {

        mAdapter = new smartBaseRecyclerAdapter<DeviceByEmpIdBean.DataBean>(listDev, R.layout.device_item_layout, this) {

            @Override
            protected void onBindViewHolder(SmartViewHolder holder, DeviceByEmpIdBean.DataBean model, int position) {
                int resourceId = R.mipmap.ic_launcher;
//                if (model.getTYPE_ID() == 1) {
//                    resourceId = R.drawable.device_item;
//                } else if (model.getTYPE_ID() == 2) {
//                    resourceId = R.drawable.jinggai;
//                }

                holder.image(R.id.device_img, resourceId);
                holder.text(R.id.device_sname, model.getDEVICE_IDNAME());
                holder.text(R.id.device_state, model.getSTATUS_IDNAME());
                holder.text(R.id.device_type, "设备类型：" + model.getTYPE_IDNAME());
                holder.text(R.id.device_times, "智能门数：" + model.getDOOR_NUM());
                holder.text(R.id.device_address, "线路：" + model.getLINE_IDNAME());

            }
        };
        devList.setAdapter(mAdapter);
    }


    @Override
    public int getContentViewId() {
        return R.layout.fragment_a;
    }

    @Override
    protected void initAllMembersView(Bundle savedInstanceState) {

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        super.onCreateView(inflater, container, savedInstanceState);
        View view = getLayoutInflater().inflate(R.layout.fragment_a, null);
        ButterKnife.bind(this, view);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        devList.setHasFixedSize(true);//相关属性设置
        devList.setLayoutManager(layoutManager);
        devList.setItemAnimator(new DefaultItemAnimator());
        devList.addItemDecoration(new DividerItemDecoration(getContext(), DividerItemDecoration.VERTICAL));
        presenter = new DevicePresenter();
        presenter.attachView(this);


        initAdapter();
        initRef();
        return view;
    }


    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        DeviceByEmpIdBean.DataBean model = listDev.get(position);

        showToast("点击了" + model.getDEVICE_IDNAME());
    }

    @Override
    public void showData(String data) {

    }

    @Override
    public void setData(DeviceByEmpIdBean data) {
        if (data.getErrcode() > -1) {
            listDev = data.getData();
            String strDevs = gson.toJson(listDev);

            Log.d("devicelist", "refreshDeviceData:获取到了 " + strDevs);
            if (type.equals("more")) {

                if (mAdapter.getItemCount() >= data.getCount()) {
                    Toast.makeText(getContext(), "数据全部加载完毕", Toast.LENGTH_SHORT).show();
                    refreshLayout.finishLoadMoreWithNoMoreData();//将不会再次触发加载更多事件
                } else {
                    mAdapter.loadMore(data.getData());
                    refreshLayout.finishLoadMore();
                }
            } else {
                mAdapter.refresh(listDev);
                refreshLayout.finishRefresh();
                //  loading.showContent();
                refreshLayout.resetNoMoreData();//setNoMoreData(false);
            }
        } else {
            Toast.makeText(getContext(), data.getMessage(), Toast.LENGTH_LONG).show();
        }


    }
}
