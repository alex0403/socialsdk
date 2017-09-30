package com.dd.www.cjsdk.config;

import android.content.Context;

import com.dd.www.cjsdk.base.BaseConverter;

import java.util.HashMap;
import java.util.LinkedHashMap;

/**
 * Created by hhly-pc on 2017/9/30.
 */

public class CJConfig {
    /***
     * HttpConfig每次生成之后每次都会单独设置
     */
    private HttpConfig httpConfig;
    /***
     * 上下文内容
     */
    private Context context;
    /***
     * 请求类，用于连接动态代理类
     */
    private BaseConverter T;
    /***
     * 远程请求服务器URI
     */
    private String baseUrl;
    /***
     * MQTT IP地址
     */
    private String mqttIp;
    /***
     * MQTT 端口
     */
    private String mqttPort;

    /***
     * headers
     */
    private HashMap<String, Object> headers = new LinkedHashMap<>();

    public Context getContext () {
        return context;
    }

    public void setContext (Context context) {
        this.context = context;
    }

    public BaseConverter getConverter () {
        return T;
    }

    public void setConverter (BaseConverter t) {
        T = t;
    }

    public String getBaseUrl () {
        return baseUrl;
    }

    public void setBaseUrl (String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getMqttIp () {
        return mqttIp;
    }

    public void setMqttIp (String mqttIp) {
        this.mqttIp = mqttIp;
    }

    public String getMqttPort () {
        return mqttPort;
    }

    public void setMqttPort (String mqttPort) {
        this.mqttPort = mqttPort;
    }

    public HttpConfig getHttpConfig () {
        return httpConfig;
    }

    public void setHttpConfig (HttpConfig httpConfig) {
        this.httpConfig = httpConfig;
    }

    public HashMap<String, Object> getHeaders () {
        return headers;
    }

    public void setHeaders (HashMap<String, Object> headers) {
        this.headers = headers;
    }
}
