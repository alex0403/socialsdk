package com.dd.www.cjsdk.api.impl;

import android.content.Context;

import com.dd.www.cjsdk.api.IApplicationApi;
import com.dd.www.cjsdk.base.BaseModuleApi;
import com.dd.www.cjsdk.callback.DataCallBack;


/**
 * Created by hhly-pc on 2017/9/26.
 */

public class ApplicationApi extends BaseModuleApi implements IApplicationApi {

    private static ApplicationApi mInstance = new ApplicationApi();

    public ApplicationApi(){

    }

    /***
     * 实例化类对象
     * @return
     */

    public synchronized  static ApplicationApi getInstance (Context context) {
        if(mInstance == null){
            mInstance = new ApplicationApi();
        }
        return mInstance;
    }

    /**
     * 获取动态Token（登录之后调用）
     * 需要静态获取用户接入平台类型{@link APP_SDK_TYPE}
     * @param sccret
     * @param userId
     */
    public  void getToken (String sccret, String userId, DataCallBack callBack){

    }

    @Override
    public void getPushConfig () {

    }
}
