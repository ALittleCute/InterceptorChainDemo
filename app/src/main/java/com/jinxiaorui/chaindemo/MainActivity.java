package com.jinxiaorui.chaindemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.jinxiaorui.chaindemo.chain.Interceptor;
import com.jinxiaorui.chaindemo.chain.InterceptorRealization.Interceptor1;
import com.jinxiaorui.chaindemo.chain.InterceptorRealization.Interceptor2;
import com.jinxiaorui.chaindemo.chain.InterceptorRealization.Interceptor3;
import com.jinxiaorui.chaindemo.chain.RealInterceptorChain;
import com.jinxiaorui.chaindemo.chain.Request;
import com.jinxiaorui.chaindemo.chain.Response;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<Interceptor> interceptors = new ArrayList<>();
        interceptors.add(new Interceptor1());
        interceptors.add(new Interceptor2());
        interceptors.add(new Interceptor3());

        Request xiaojinRequest = new Request("xiaojin");
        RealInterceptorChain chain = new RealInterceptorChain(interceptors, 0, xiaojinRequest);

        Response response = chain.proceed(xiaojinRequest);

        Log.e("xiaojin","final"+response.getResponseName());
    }
}
