package com.dd.www.cjsdk.internal.bean;


import com.dd.www.cjsdk.base.BaseBean;

import java.util.List;

/**
 * Created by dell on 2017/8/28.
 */

public class LYTDGroup  extends BaseBean {
    public String groupId;
    public List<String> members;


    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public List<String> getMembers() {
        return members;
    }

    public void setMembers(List<String> members) {
        this.members = members;
    }
}
