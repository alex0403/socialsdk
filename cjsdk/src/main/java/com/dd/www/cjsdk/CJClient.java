package com.dd.www.cjsdk;


import android.content.Context;

import com.dd.www.cjsdk.base.BaseConverter;
import com.dd.www.cjsdk.base.BaseListener;
import com.dd.www.cjsdk.config.CJConfig;
import com.dd.www.cjsdk.config.HttpConfig;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by hhly-pc on 2017/9/27.
 */

public final class CJClient {

    private static CJClient mInstance;
    private HttpConfig mHttpConfig;
    private CJConfig mCJConfig;

    private BaseConverter mConverter;

    /**
     * 实例化CJClient
     *
     * @return
     */
    /*public static CJClient getInstance(){
        if(mInstance == null){
            synchronized (object){
                if(mInstance == null){
                    mInstance = new CJClient();
                }
            }
        }
        return mInstance;
    }*/

    public  final class Builder{
        private BaseConverter converter;
        Context context;
        HashMap<String, Object> header = new LinkedHashMap<>();
        BaseListener listener;

        public   Builder(){
            mHttpConfig = new HttpConfig();
            mCJConfig = new CJConfig();
            mCJConfig.setHttpConfig(mHttpConfig);
        }

        /***
         * 设置上下文
         * @param context
         * @return
         */
        public Builder with(Context context){
            this.context = context;
            mCJConfig.setContext(context);
            return this;
        }

        /***
         * 设置请求类
         * @param converter
         * @return
         */
        public Builder cross(BaseConverter converter){
            this.converter = converter;
            mCJConfig.setConverter(converter);
            return this;
        }

        /***
         * 设置请求头
         * @param key
         * @param value
         * @return
         */
        public Builder header(String key, String value){
            if (!header.containsKey(key)) {
                header.put(key, value);
            }
            return this;
        }

        /***
         * 请求头集合
         * @param headers
         * @return
         */
        public Builder headerMap(HashMap headers){
            this.header = headers;
            return this;
        }

        public Builder listener(BaseListener listener){
            this.listener = listener;
            return this;
        }

        public void build(){

        }


    }

}
