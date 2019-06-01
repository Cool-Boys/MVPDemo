package com.iot.mvpdemo.model.bean;

import com.iot.mvpdemo.model.base.BaseBean;

import java.io.Serializable;
import java.util.List;

public class DeviceByEmpIdBean extends BaseBean {

    /**
     * count : 11
     * data : [{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.647968","REGION_IDNAME":"B区","LOCKDESC":" 1号锁关闭 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"设备B GJ081011","DOORSTATUS":0,"SENSORDATE":"2018-12-31 20:26:05","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"规格1","WARNSDESC":"","IMEI":"868744030984409","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"ecebcdbeef2811e8925900163e067366","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":3,"LATITUDE":"25.037444","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.665026","REGION_IDNAME":"B区","LOCKDESC":" 1号锁关闭 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":0,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"设备A GJ82019","DOORSTATUS":0,"SENSORDATE":"2018-12-28 10:47:33","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"规格1","WARNSDESC":"","IMEI":"868744036657892","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"f284982bef2811e8925900163e067366","LOCKSTATUS":0,"STATUS_ID":1,"DEVICE_ID":4,"LATITUDE":"25.039555","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.665194","REGION_IDNAME":"B区","LOCKDESC":" 1号锁关闭 2号锁被打开 ","DOOR_NUM":2,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"设备C GJ82007","DOORSTATUS":0,"SENSORDATE":"2018-12-22 23:33:32","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"规格1","WARNSDESC":"","IMEI":"868744031400058","QUAKE":0,"DOORDESC":"1号门关闭 2号门关闭","TYPE_ID":1,"CODE":"8e5bde61e10b47aa99f3f7a2c374ee05","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":38,"LATITUDE":"25.039588","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"井盖","AREA_IDNAME":"安宁市","WARNSTATUS":1,"LONGITUDE":"102.661322","REGION_IDNAME":"B区","LOCKDESC":"","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":"","CITY_IDNAME":"昆明市","SOAKING":"","TILT":"","PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"S2021N18619","DOORSTATUS":"","SENSORDATE":"2018-11-30 18:40:41","STATUS_IDNAME":"正常","BATTERYLEVEL":"","APP_ID":2,"DISTANCE":"","HUMIDITY":"","SCALE_IDNAME":"60","WARNSDESC":"温度报警","IMEI":"0868334030128619","QUAKE":"","DOORDESC":"","TYPE_ID":2,"CODE":"8b9c3f0634d14c568d0c385b4d9955cc","LOCKSTATUS":"","STATUS_ID":1,"DEVICE_ID":39,"LATITUDE":"25.040279","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.711565","REGION_IDNAME":"B区","LOCKDESC":" 1号锁被打开 2号锁被打开 ","DOOR_NUM":2,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"测试设备EF","DOORSTATUS":0,"SENSORDATE":"2019-01-04 08:42:11","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"规格1","WARNSDESC":"","IMEI":"864814042585298","QUAKE":0,"DOORDESC":"1号门关闭 2号门关闭","TYPE_ID":1,"CODE":"29aa233f8d0c44319804b23d6be4b7da","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":47,"LATITUDE":"25.091127","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"井盖","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.714955","REGION_IDNAME":"B区","LOCKDESC":"","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":"","CITY_IDNAME":"昆明市","SOAKING":"","TILT":"","PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"井盖测试RF","DOORSTATUS":"","SENSORDATE":"2018-12-01 19:05:11","STATUS_IDNAME":"正常","BATTERYLEVEL":"","APP_ID":2,"DISTANCE":"","HUMIDITY":"","SCALE_IDNAME":"60","WARNSDESC":"","IMEI":"100002","QUAKE":"","DOORDESC":"","TYPE_ID":2,"CODE":"b080ec26a4b945ad9aafe2ee1d6ca9d9","LOCKSTATUS":"","STATUS_ID":1,"DEVICE_ID":48,"LATITUDE":"25.086095","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.663229","REGION_IDNAME":"B区","LOCKDESC":" 1号锁被打开 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"测试设备2","DOORSTATUS":0,"SENSORDATE":"2019-01-24 11:17:09","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"测试111","WARNSDESC":"","IMEI":"867900047912863","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"8faf0cb694fc4406aed8c9a69a99fc15","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":50,"LATITUDE":"25.039477","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.661114","REGION_IDNAME":"B区","LOCKDESC":" 1号锁被打开 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"东电样机-1","DOORSTATUS":0,"SENSORDATE":"2019-02-25 10:45:16","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"测试111","WARNSDESC":"","IMEI":"868744036582926","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"c8ad5406852a4d58a3c2b59e4e617cd6","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":51,"LATITUDE":"24.986028","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.656692","REGION_IDNAME":"B区","LOCKDESC":" 1号锁关闭 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"东电样机-2","DOORSTATUS":0,"SENSORDATE":"2019-02-02 00:09:05","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"测试111","WARNSDESC":"","IMEI":"864814045594602","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"dca701a7eed340a99eac316057b901da","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":53,"LATITUDE":"24.999065","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":0,"LONGITUDE":"102.659398","REGION_IDNAME":"B区","LOCKDESC":" 1号锁被打开 ","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":18,"CITY_IDNAME":"昆明市","SOAKING":1,"TILT":1,"PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"东电样机-3","DOORSTATUS":0,"SENSORDATE":"2019-02-23 18:25:00","STATUS_IDNAME":"正常","BATTERYLEVEL":90,"APP_ID":2,"DISTANCE":"","HUMIDITY":45,"SCALE_IDNAME":"测试111","WARNSDESC":"","IMEI":"864814046454681","QUAKE":0,"DOORDESC":"1号门关闭","TYPE_ID":1,"CODE":"f147f3b36f6f431387ba58a39e3be721","LOCKSTATUS":1,"STATUS_ID":1,"DEVICE_ID":54,"LATITUDE":"24.990695","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"},{"TYPE_IDNAME":"光交箱","AREA_IDNAME":"安宁市","WARNSTATUS":"","LONGITUDE":"102.6612","REGION_IDNAME":"B区","LOCKDESC":"","DOOR_NUM":1,"PROTOCOL_IDNAME":"通信协议1","LINE_IDNAME":"昆明LA2","TEMPERATURE":"","CITY_IDNAME":"昆明市","SOAKING":"","TILT":"","PROVINCE_IDNAME":"云南省","DEVICE_IDNAME":"东电样机-4","DOORSTATUS":"","SENSORDATE":"","STATUS_IDNAME":"正常","BATTERYLEVEL":"","APP_ID":2,"DISTANCE":"","HUMIDITY":"","SCALE_IDNAME":"测试111","WARNSDESC":"","IMEI":"864814046558010","QUAKE":"","DOORDESC":"","TYPE_ID":1,"CODE":"c7c7b0b3d6ce49c1a0145cc567156dc4","LOCKSTATUS":"","STATUS_ID":1,"DEVICE_ID":55,"LATITUDE":"24.966188","EMP_IDNAME":"","SITE_IDNAME":"昆明B区A站"}]
     * errcode : 0
     * message :
     */

    private List<DataBean> data;

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean implements Serializable {
        /**
         * TYPE_IDNAME : 光交箱
         * AREA_IDNAME : 安宁市
         * WARNSTATUS : 0
         * LONGITUDE : 102.647968
         * REGION_IDNAME : B区
         * LOCKDESC :  1号锁关闭
         * DOOR_NUM : 1
         * PROTOCOL_IDNAME : 通信协议1
         * LINE_IDNAME : 昆明LA2
         * TEMPERATURE : 18
         * CITY_IDNAME : 昆明市
         * SOAKING : 1
         * TILT : 1
         * PROVINCE_IDNAME : 云南省
         * DEVICE_IDNAME : 设备B GJ081011
         * DOORSTATUS : 0
         * SENSORDATE : 2018-12-31 20:26:05
         * STATUS_IDNAME : 正常
         * BATTERYLEVEL : 90
         * APP_ID : 2
         * DISTANCE :
         * HUMIDITY : 45
         * SCALE_IDNAME : 规格1
         * WARNSDESC :
         * IMEI : 868744030984409
         * QUAKE : 0
         * DOORDESC : 1号门关闭
         * TYPE_ID : 1
         * CODE : ecebcdbeef2811e8925900163e067366
         * LOCKSTATUS : 1
         * STATUS_ID : 1
         * DEVICE_ID : 3
         * LATITUDE : 25.037444
         * EMP_IDNAME :
         * SITE_IDNAME : 昆明B区A站
         */

        private String TYPE_IDNAME;
        private String AREA_IDNAME;
        private int WARNSTATUS;
        private String LONGITUDE;
        private String REGION_IDNAME;
        private String LOCKDESC;
        private int DOOR_NUM;
        private String PROTOCOL_IDNAME;
        private String LINE_IDNAME;
        private int TEMPERATURE;
        private String CITY_IDNAME;
        private int SOAKING;
        private int TILT;
        private String PROVINCE_IDNAME;
        private String DEVICE_IDNAME;
        private int DOORSTATUS;
        private String SENSORDATE;
        private String STATUS_IDNAME;
        private int BATTERYLEVEL;
        private int APP_ID;
        private String DISTANCE;
        private int HUMIDITY;
        private String SCALE_IDNAME;
        private String WARNSDESC;
        private String IMEI;
        private int QUAKE;
        private String DOORDESC;
        private int TYPE_ID;
        private String CODE;
        private int LOCKSTATUS;
        private int STATUS_ID;
        private int DEVICE_ID;
        private String LATITUDE;
        private String EMP_IDNAME;
        private String SITE_IDNAME;

        public String getTYPE_IDNAME() {
            return TYPE_IDNAME;
        }

        public void setTYPE_IDNAME(String TYPE_IDNAME) {
            this.TYPE_IDNAME = TYPE_IDNAME;
        }

        public String getAREA_IDNAME() {
            return AREA_IDNAME;
        }

        public void setAREA_IDNAME(String AREA_IDNAME) {
            this.AREA_IDNAME = AREA_IDNAME;
        }

        public int getWARNSTATUS() {
            return WARNSTATUS;
        }

        public void setWARNSTATUS(int WARNSTATUS) {
            this.WARNSTATUS = WARNSTATUS;
        }

        public String getLONGITUDE() {
            return LONGITUDE;
        }

        public void setLONGITUDE(String LONGITUDE) {
            this.LONGITUDE = LONGITUDE;
        }

        public String getREGION_IDNAME() {
            return REGION_IDNAME;
        }

        public void setREGION_IDNAME(String REGION_IDNAME) {
            this.REGION_IDNAME = REGION_IDNAME;
        }

        public String getLOCKDESC() {
            return LOCKDESC;
        }

        public void setLOCKDESC(String LOCKDESC) {
            this.LOCKDESC = LOCKDESC;
        }

        public int getDOOR_NUM() {
            return DOOR_NUM;
        }

        public void setDOOR_NUM(int DOOR_NUM) {
            this.DOOR_NUM = DOOR_NUM;
        }

        public String getPROTOCOL_IDNAME() {
            return PROTOCOL_IDNAME;
        }

        public void setPROTOCOL_IDNAME(String PROTOCOL_IDNAME) {
            this.PROTOCOL_IDNAME = PROTOCOL_IDNAME;
        }

        public String getLINE_IDNAME() {
            return LINE_IDNAME;
        }

        public void setLINE_IDNAME(String LINE_IDNAME) {
            this.LINE_IDNAME = LINE_IDNAME;
        }

        public int getTEMPERATURE() {
            return TEMPERATURE;
        }

        public void setTEMPERATURE(int TEMPERATURE) {
            this.TEMPERATURE = TEMPERATURE;
        }

        public String getCITY_IDNAME() {
            return CITY_IDNAME;
        }

        public void setCITY_IDNAME(String CITY_IDNAME) {
            this.CITY_IDNAME = CITY_IDNAME;
        }

        public int getSOAKING() {
            return SOAKING;
        }

        public void setSOAKING(int SOAKING) {
            this.SOAKING = SOAKING;
        }

        public int getTILT() {
            return TILT;
        }

        public void setTILT(int TILT) {
            this.TILT = TILT;
        }

        public String getPROVINCE_IDNAME() {
            return PROVINCE_IDNAME;
        }

        public void setPROVINCE_IDNAME(String PROVINCE_IDNAME) {
            this.PROVINCE_IDNAME = PROVINCE_IDNAME;
        }

        public String getDEVICE_IDNAME() {
            return DEVICE_IDNAME;
        }

        public void setDEVICE_IDNAME(String DEVICE_IDNAME) {
            this.DEVICE_IDNAME = DEVICE_IDNAME;
        }

        public int getDOORSTATUS() {
            return DOORSTATUS;
        }

        public void setDOORSTATUS(int DOORSTATUS) {
            this.DOORSTATUS = DOORSTATUS;
        }

        public String getSENSORDATE() {
            return SENSORDATE;
        }

        public void setSENSORDATE(String SENSORDATE) {
            this.SENSORDATE = SENSORDATE;
        }

        public String getSTATUS_IDNAME() {
            return STATUS_IDNAME;
        }

        public void setSTATUS_IDNAME(String STATUS_IDNAME) {
            this.STATUS_IDNAME = STATUS_IDNAME;
        }

        public int getBATTERYLEVEL() {
            return BATTERYLEVEL;
        }

        public void setBATTERYLEVEL(int BATTERYLEVEL) {
            this.BATTERYLEVEL = BATTERYLEVEL;
        }

        public int getAPP_ID() {
            return APP_ID;
        }

        public void setAPP_ID(int APP_ID) {
            this.APP_ID = APP_ID;
        }

        public String getDISTANCE() {
            return DISTANCE;
        }

        public void setDISTANCE(String DISTANCE) {
            this.DISTANCE = DISTANCE;
        }

        public int getHUMIDITY() {
            return HUMIDITY;
        }

        public void setHUMIDITY(int HUMIDITY) {
            this.HUMIDITY = HUMIDITY;
        }

        public String getSCALE_IDNAME() {
            return SCALE_IDNAME;
        }

        public void setSCALE_IDNAME(String SCALE_IDNAME) {
            this.SCALE_IDNAME = SCALE_IDNAME;
        }

        public String getWARNSDESC() {
            return WARNSDESC;
        }

        public void setWARNSDESC(String WARNSDESC) {
            this.WARNSDESC = WARNSDESC;
        }

        public String getIMEI() {
            return IMEI;
        }

        public void setIMEI(String IMEI) {
            this.IMEI = IMEI;
        }

        public int getQUAKE() {
            return QUAKE;
        }

        public void setQUAKE(int QUAKE) {
            this.QUAKE = QUAKE;
        }

        public String getDOORDESC() {
            return DOORDESC;
        }

        public void setDOORDESC(String DOORDESC) {
            this.DOORDESC = DOORDESC;
        }

        public int getTYPE_ID() {
            return TYPE_ID;
        }

        public void setTYPE_ID(int TYPE_ID) {
            this.TYPE_ID = TYPE_ID;
        }

        public String getCODE() {
            return CODE;
        }

        public void setCODE(String CODE) {
            this.CODE = CODE;
        }

        public int getLOCKSTATUS() {
            return LOCKSTATUS;
        }

        public void setLOCKSTATUS(int LOCKSTATUS) {
            this.LOCKSTATUS = LOCKSTATUS;
        }

        public int getSTATUS_ID() {
            return STATUS_ID;
        }

        public void setSTATUS_ID(int STATUS_ID) {
            this.STATUS_ID = STATUS_ID;
        }

        public int getDEVICE_ID() {
            return DEVICE_ID;
        }

        public void setDEVICE_ID(int DEVICE_ID) {
            this.DEVICE_ID = DEVICE_ID;
        }

        public String getLATITUDE() {
            return LATITUDE;
        }

        public void setLATITUDE(String LATITUDE) {
            this.LATITUDE = LATITUDE;
        }

        public String getEMP_IDNAME() {
            return EMP_IDNAME;
        }

        public void setEMP_IDNAME(String EMP_IDNAME) {
            this.EMP_IDNAME = EMP_IDNAME;
        }

        public String getSITE_IDNAME() {
            return SITE_IDNAME;
        }

        public void setSITE_IDNAME(String SITE_IDNAME) {
            this.SITE_IDNAME = SITE_IDNAME;
        }
    }
}
