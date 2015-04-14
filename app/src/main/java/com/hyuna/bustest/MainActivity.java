package com.hyuna.bustest;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.orhanobut.logger.Logger;
import com.squareup.okhttp.Response;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;


public class MainActivity extends ActionBarActivity {
    public static final String TAG = MainActivity.class.getSimpleName();
    private final String url = "https://www.googleapis.com/youtube/v3/videos?part=contentDetails,snippet&id=%s&key=%s";
    private final String id = "kt0g4dWxEBo";
    private final String key = "AIzaSyBja5bJj2c7FtsWVdsp-ipNe-CkG6N33So";

    private final String createUrl(String id, String key) {
        return String.format(url, id, key);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        setSupportActionBar((Toolbar)findViewById(R.id.main_bar));
//
//        GridView grid = (GridView) findViewById(R.id.grid);
//
//        grid.setAdapter(new ImageAdapter());
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    final Response response = Util.run(createUrl(id, key));
                    final String json=response.body().string();
                    Logger.i(MainActivity.class.getSimpleName(), json);

//                    ObjectMapper mapper = new ObjectMapper();


                    Type type = new TypeToken<ArrayList<Items>>(){}.getType();
                    Gson gson=new Gson();
                    List<Items> itemses=gson.fromJson(json, type);
                    Logger.i(TAG, itemses.get(0).getId());
//                   final YoutureResponsse yrres= mapper.readValues(json, YoutureResponsse.class);
//                   Logger.i(MainActivity.class.getSimpleName(), String.format("kind %s, id %s", yrres.getKind(), yrres.getEtag()));
                } catch (IOException e) {
                    Logger.json(MainActivity.class.getSimpleName(), "IOException "+e.getMessage());
                    e.printStackTrace();
                }
            }
        }).start();
//  This do for branch one one
//        Second line.
    }


    private class ImageAdapter extends BaseAdapter {


        @Override
        public int getCount() {
            return images.length;
        }

        @Override
        public Object getItem(int position) {
            return images[position];
        }

        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(MainActivity.this);
                imageView.setBackgroundColor(getResources().getColor(android.R.color.holo_blue_dark));
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setAdjustViewBounds(false);
            } else {
                imageView = (ImageView) convertView;
            }

            imageView.setImageResource((int) getItem(position));
            return imageView;
        }

        private int[] images = {R.drawable.home_books
                , R.drawable.home_music
                , R.drawable.home_games
                , R.drawable.home_movies
                , R.drawable.home_books
                , R.drawable.home_music
                , R.drawable.home_games
                , R.drawable.home_movies
                , R.drawable.home_books
                , R.drawable.home_music
                , R.drawable.home_games
                , R.drawable.home_movies};
    }


}
