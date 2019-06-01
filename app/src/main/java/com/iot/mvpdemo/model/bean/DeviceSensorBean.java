package com.iot.mvpdemo.model.bean;

import com.iot.mvpdemo.model.base.BaseBean;

import java.util.List;

public class DeviceSensorBean extends BaseBean {

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * VAL : 关
         * SNAME : 门磁
         * SENSOR_ID : 1
         */

        private String VAL;
        private String SNAME;
        private int SENSOR_ID;

        public String getVAL() {
            return VAL;
        }

        public void setVAL(String VAL) {
            this.VAL = VAL;
        }

        public String getSNAME() {
            return SNAME;
        }

        public void setSNAME(String SNAME) {
            this.SNAME = SNAME;
        }

        public int getSENSOR_ID() {
            return SENSOR_ID;
        }

        public void setSENSOR_ID(int SENSOR_ID) {
            this.SENSOR_ID = SENSOR_ID;
        }
    }
}
