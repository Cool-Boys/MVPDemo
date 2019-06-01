package com.iot.mvpdemo.model.bean;

import com.iot.mvpdemo.model.base.BaseBean;

public class UserBean extends BaseBean {

    /**
     * data : {"USERS_ID":1,"AREA_ID":"","DEPT_ID":"","EXT":"","APP_ID":"","AREA_IDNAME":"","CREATEDATE":"","SNAME":"admin","CITY_ID":"","EMP_ID":"","PASSWORD":"admin","DEPT_IDNAME":"","BDEL":1,"CITY_IDNAME":"","PROVINCE_ID":"","ROLE_ID":"","EMP_NO":"","TEL":"","PROVINCE_IDNAME":"","TOKEN":"","MEMO":"","BADMIN":1,"ROLE_IDNAME":"","EMP_IDNAME":""}
     */

    private DataBean data;

    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * USERS_ID : 1
         * AREA_ID :
         * DEPT_ID :
         * EXT :
         * APP_ID :
         * AREA_IDNAME :
         * CREATEDATE :
         * SNAME : admin
         * CITY_ID :
         * EMP_ID :
         * PASSWORD : admin
         * DEPT_IDNAME :
         * BDEL : 1
         * CITY_IDNAME :
         * PROVINCE_ID :
         * ROLE_ID :
         * EMP_NO :
         * TEL :
         * PROVINCE_IDNAME :
         * TOKEN :
         * MEMO :
         * BADMIN : 1
         * ROLE_IDNAME :
         * EMP_IDNAME :
         */

        private int USERS_ID;
        private String AREA_ID;
        private String DEPT_ID;
        private String EXT;
        private String APP_ID;
        private String AREA_IDNAME;
        private String CREATEDATE;
        private String SNAME;
        private String CITY_ID;
        private String EMP_ID;
        private String PASSWORD;
        private String DEPT_IDNAME;
        private int BDEL;
        private String CITY_IDNAME;
        private String PROVINCE_ID;
        private String ROLE_ID;
        private String EMP_NO;
        private String TEL;
        private String PROVINCE_IDNAME;
        private String TOKEN;
        private String MEMO;
        private int BADMIN;
        private String ROLE_IDNAME;
        private String EMP_IDNAME;

        public int getUSERS_ID() {
            return USERS_ID;
        }

        public void setUSERS_ID(int USERS_ID) {
            this.USERS_ID = USERS_ID;
        }

        public String getAREA_ID() {
            return AREA_ID;
        }

        public void setAREA_ID(String AREA_ID) {
            this.AREA_ID = AREA_ID;
        }

        public String getDEPT_ID() {
            return DEPT_ID;
        }

        public void setDEPT_ID(String DEPT_ID) {
            this.DEPT_ID = DEPT_ID;
        }

        public String getEXT() {
            return EXT;
        }

        public void setEXT(String EXT) {
            this.EXT = EXT;
        }

        public String getAPP_ID() {
            return APP_ID;
        }

        public void setAPP_ID(String APP_ID) {
            this.APP_ID = APP_ID;
        }

        public String getAREA_IDNAME() {
            return AREA_IDNAME;
        }

        public void setAREA_IDNAME(String AREA_IDNAME) {
            this.AREA_IDNAME = AREA_IDNAME;
        }

        public String getCREATEDATE() {
            return CREATEDATE;
        }

        public void setCREATEDATE(String CREATEDATE) {
            this.CREATEDATE = CREATEDATE;
        }

        public String getSNAME() {
            return SNAME;
        }

        public void setSNAME(String SNAME) {
            this.SNAME = SNAME;
        }

        public String getCITY_ID() {
            return CITY_ID;
        }

        public void setCITY_ID(String CITY_ID) {
            this.CITY_ID = CITY_ID;
        }

        public String getEMP_ID() {
            return EMP_ID;
        }

        public void setEMP_ID(String EMP_ID) {
            this.EMP_ID = EMP_ID;
        }

        public String getPASSWORD() {
            return PASSWORD;
        }

        public void setPASSWORD(String PASSWORD) {
            this.PASSWORD = PASSWORD;
        }

        public String getDEPT_IDNAME() {
            return DEPT_IDNAME;
        }

        public void setDEPT_IDNAME(String DEPT_IDNAME) {
            this.DEPT_IDNAME = DEPT_IDNAME;
        }

        public int getBDEL() {
            return BDEL;
        }

        public void setBDEL(int BDEL) {
            this.BDEL = BDEL;
        }

        public String getCITY_IDNAME() {
            return CITY_IDNAME;
        }

        public void setCITY_IDNAME(String CITY_IDNAME) {
            this.CITY_IDNAME = CITY_IDNAME;
        }

        public String getPROVINCE_ID() {
            return PROVINCE_ID;
        }

        public void setPROVINCE_ID(String PROVINCE_ID) {
            this.PROVINCE_ID = PROVINCE_ID;
        }

        public String getROLE_ID() {
            return ROLE_ID;
        }

        public void setROLE_ID(String ROLE_ID) {
            this.ROLE_ID = ROLE_ID;
        }

        public String getEMP_NO() {
            return EMP_NO;
        }

        public void setEMP_NO(String EMP_NO) {
            this.EMP_NO = EMP_NO;
        }

        public String getTEL() {
            return TEL;
        }

        public void setTEL(String TEL) {
            this.TEL = TEL;
        }

        public String getPROVINCE_IDNAME() {
            return PROVINCE_IDNAME;
        }

        public void setPROVINCE_IDNAME(String PROVINCE_IDNAME) {
            this.PROVINCE_IDNAME = PROVINCE_IDNAME;
        }

        public String getTOKEN() {
            return TOKEN;
        }

        public void setTOKEN(String TOKEN) {
            this.TOKEN = TOKEN;
        }

        public String getMEMO() {
            return MEMO;
        }

        public void setMEMO(String MEMO) {
            this.MEMO = MEMO;
        }

        public int getBADMIN() {
            return BADMIN;
        }

        public void setBADMIN(int BADMIN) {
            this.BADMIN = BADMIN;
        }

        public String getROLE_IDNAME() {
            return ROLE_IDNAME;
        }

        public void setROLE_IDNAME(String ROLE_IDNAME) {
            this.ROLE_IDNAME = ROLE_IDNAME;
        }

        public String getEMP_IDNAME() {
            return EMP_IDNAME;
        }

        public void setEMP_IDNAME(String EMP_IDNAME) {
            this.EMP_IDNAME = EMP_IDNAME;
        }
    }
}
