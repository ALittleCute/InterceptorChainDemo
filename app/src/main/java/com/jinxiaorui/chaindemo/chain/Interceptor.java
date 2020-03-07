package com.jinxiaorui.chaindemo.chain;

import com.jinxiaorui.chaindemo.chain.Response;

/**
 * create:3.7
 * author:xiaojin
 * dec  :
 **/
public interface Interceptor {
    Response intercept(Chain chain);

    interface Chain{
        Request request();

        Response proceed(Request request);
    }
}
