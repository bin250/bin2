package com.offcn.bean;

import com.offcn.util.PageRequest;

//封装查询条件
public class ConditionBean  extends PageRequest {
    private  String area;
    private  String type;
    private  String mname;
    private  String keyword;

    @Override
    public String toString() {
        return "ConditionBean{" +
                "area='" + area + '\'' +
                ", type='" + type + '\'' +
                ", mname='" + mname + '\'' +
                ", keyword='" + keyword + '\'' +
                '}';
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
