package com.jinxiaorui.chaindemo.chain.InterceptorRealization;

import android.util.Log;

import com.jinxiaorui.chaindemo.chain.Interceptor;
import com.jinxiaorui.chaindemo.chain.Response;

/**
 * create:3.7
 * author:xiaojin
 * dec  :
 **/
public class Interceptor3 implements Interceptor {
    @Override
    public Response intercept(Chain chain) {
        chain.request().setRequestName("request3");
        Log.e("xiaojin",chain.request().getRequestName());
        Response response = new Response();
        response.setResponseName("xiaojinResponse");
        Log.e("xiaojin",response.getResponseName()+"3" );
        return response;
    }
}
