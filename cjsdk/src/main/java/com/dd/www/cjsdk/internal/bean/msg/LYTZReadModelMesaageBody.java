package com.dd.www.cjsdk.internal.bean.msg;


import com.dd.www.cjsdk.internal.bean.msg.base.LYTZMessageBody;

import java.io.Serializable;

/**
 * Created by dell on 2017/6/8.
 */

public class LYTZReadModelMesaageBody extends LYTZMessageBody implements Serializable {

    private String messageType;

    @Override
    public String getMessageType() {

        return messageType;
    }


    public LYTZReadModelMesaageBody(String messageType) {
        this.messageType = messageType;

    }
}
