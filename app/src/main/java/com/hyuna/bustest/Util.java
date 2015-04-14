package com.hyuna.bustest;

import android.app.DownloadManager;

import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.Response;

import java.io.IOException;

/**
 * Created by Iurii on 3/30/2015.
 */
public class Util {


    private Util() {

    }


//    public static Response getResponse(final String url) throws IOException {
//        final OkHttpClient client = new OkHttpClient();
//        final Request request = new Request.Builder().url(url).build();
//        final Response response = client.newCall(request).execute();
//        return response;
//    }


    public static Response run(String url) throws IOException {
        final OkHttpClient client = new OkHttpClient();
        final Request request=new Request.Builder().url(url).build();
        return client.newCall(request).execute();
    }
}
