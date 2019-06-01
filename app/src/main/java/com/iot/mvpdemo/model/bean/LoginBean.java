package com.iot.mvpdemo.model.bean;

import com.iot.mvpdemo.model.base.BaseBean;

public class LoginBean extends BaseBean {


    private DataBean data;
    public DataBean getData() {
        return data;
    }

    public void setData(DataBean data) {
        this.data = data;
    }
    public static class DataBean {
        /**
         * USERS_ID : 10
         * DEPT_ID : 0
         * APP_ID : 2
         * EMP_ID : 0
         * CITY_ID : 307
         * SNAME : km
         * ROLE_ID : 0
         * PROVINCE_ID : 25
         * TOKEN : eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJleHAiOjE1NTM4NjY4MzEzNTEsInBheWxvYWQiOiJ7XCJiZGVsXCI6MSxcImFwcF9JRFwiOjIsXCJjaXR5X0lEXCI6MzA3LFwidXNlcnNfSURcIjoxMCxcInNuYW1lXCI6XCJrbVwiLFwicHJvdmluY2VfSURcIjoyNSxcImJhZG1pblwiOjEsXCJwYXNzd29yZFwiOlwiMTIzXCIsXCJtZW1vXCI6XCLmmIbmmI7mtYvor5XnlKjmiLdcIixcImVtcF9JRFwiOjAsXCJkZXB0X0lEXCI6MCxcImFyZWFfSURcIjoyMjM2LFwicm9sZV9JRFwiOjAsXCJleHRcIjpcIlwiLFwiY3JlYXRlZGF0ZVwiOjE1NDI0NTg1OTQwMDAsXCJ0b2tlblwiOlwiXCJ9In0.-bEVwWiABhZiSXHRwLD2u9XufR4Gxszl80ZwsCKQyso
         * BADMIN : 1
         */

        private int USERS_ID;
        private int DEPT_ID;
        private int APP_ID;
        private int EMP_ID;
        private int CITY_ID;
        private String SNAME;
        private int ROLE_ID;
        private int PROVINCE_ID;
        private String TOKEN;
        private int BADMIN;

        public int getUSERS_ID() {
            return USERS_ID;
        }

        public void setUSERS_ID(int USERS_ID) {
            this.USERS_ID = USERS_ID;
        }

        public int getDEPT_ID() {
            return DEPT_ID;
        }

        public void setDEPT_ID(int DEPT_ID) {
            this.DEPT_ID = DEPT_ID;
        }

        public int getAPP_ID() {
            return APP_ID;
        }

        public void setAPP_ID(int APP_ID) {
            this.APP_ID = APP_ID;
        }

        public int getEMP_ID() {
            return EMP_ID;
        }

        public void setEMP_ID(int EMP_ID) {
            this.EMP_ID = EMP_ID;
        }

        public int getCITY_ID() {
            return CITY_ID;
        }

        public void setCITY_ID(int CITY_ID) {
            this.CITY_ID = CITY_ID;
        }

        public String getSNAME() {
            return SNAME;
        }

        public void setSNAME(String SNAME) {
            this.SNAME = SNAME;
        }

        public int getROLE_ID() {
            return ROLE_ID;
        }

        public void setROLE_ID(int ROLE_ID) {
            this.ROLE_ID = ROLE_ID;
        }

        public int getPROVINCE_ID() {
            return PROVINCE_ID;
        }

        public void setPROVINCE_ID(int PROVINCE_ID) {
            this.PROVINCE_ID = PROVINCE_ID;
        }

        public String getTOKEN() {
            return TOKEN;
        }

        public void setTOKEN(String TOKEN) {
            this.TOKEN = TOKEN;
        }

        public int getBADMIN() {
            return BADMIN;
        }

        public void setBADMIN(int BADMIN) {
            this.BADMIN = BADMIN;
        }
    }
}
