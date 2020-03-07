package com.jinxiaorui.chaindemo.chain;

import java.util.List;

/**
 * create:3.7
 * author:xiaojin
 * dec  :
 **/
public class RealInterceptorChain implements Interceptor.Chain {
    private Request request;

    private List<Interceptor> interceptors;

    private int index;

    public RealInterceptorChain(List<Interceptor> interceptors, int index , Request request){
        this.interceptors = interceptors;
        this.index = index;
        this.request = request;
    }
    @Override
    public Request request() {
        return request;
    }

    @Override
    public Response proceed(Request request) {

        return proceed(request, index);
    }

    /**
     * 用于给Interceptor调用下一个Interceptor返回Response
     * @param request
     * @param index
     * @return
     */
    public Response proceed(Request request, int index){

        RealInterceptorChain realInterceptorChain = new RealInterceptorChain(interceptors,index+1,request);

        Interceptor interceptor = interceptors.get(index);

        Response response = interceptor.intercept(realInterceptorChain);

        return response;
    }

}
