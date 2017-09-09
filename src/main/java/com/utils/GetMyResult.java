package com.utils;

import com.bean.MyResult;

/**
 * Created by Administrator on 2017/5/27.
 */
public class GetMyResult {
    private static MyResult myResult = null;

    public static MyResult getResult(boolean isF, String userid, String username, String error) {
        if (myResult == null) {
            return new MyResult(isF, userid, username, error);
        } else {
            myResult.setAid(userid);
            myResult.setAname(username);
            myResult.setF(isF);
            myResult.setError(error);
            return myResult;
        }
    }
}
