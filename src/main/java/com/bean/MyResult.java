package com.bean;

/**
 * Created by Administrator on 2017/5/27.
 */
public class MyResult {
    private boolean isF;
    private String aid;
    private String aname;
    private String error;

    public MyResult(boolean isF, String aid, String aname, String error) {
        this.isF = isF;
        this.aid = aid;
        this.aname = aname;
        this.error = error;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getAname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    public boolean isF() {
        return isF;
    }

    public void setF(boolean f) {
        isF = f;
    }
}
