package com.jinxiaorui.chaindemo.chain;

/**
 * create:3.7
 * author:xiaojin
 * dec  :
 **/
public class Request {
    private String requestName;

    public Request(){}

    public Request(String requestName){
        this.setRequestName(requestName);
    }

    public String getRequestName() {
        return requestName;
    }

    public void setRequestName(String requestName) {
        this.requestName = requestName;
    }
}
