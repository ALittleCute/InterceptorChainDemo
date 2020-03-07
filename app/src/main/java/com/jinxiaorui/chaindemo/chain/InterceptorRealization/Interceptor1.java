package com.jinxiaorui.chaindemo.chain.InterceptorRealization;

import android.util.Log;

import com.jinxiaorui.chaindemo.chain.Interceptor;
import com.jinxiaorui.chaindemo.chain.Response;

/**
 * create:3.7
 * author:xiaojin
 * dec  :
 **/
public class Interceptor1 implements Interceptor {
    @Override
    public Response intercept(Chain chain) {

        chain.request().setRequestName("request1");
        Log.e("xiaojin",chain.request().getRequestName());
        Response response = chain.proceed(chain.request());
        Log.e("xiaojin",response.getResponseName()+"1" );
        return response;
    }
}
