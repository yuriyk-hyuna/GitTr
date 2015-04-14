package com.hyuna.bustest;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import de.greenrobot.event.EventBus;


public class EventActivity extends ActionBarActivity {
    private TextView top;
    private TextView buttom;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }



    public void start(View view) {
        EventBus.getDefault().postSticky(new TEvent("Mimika", 20));
        this.finish();
    }




}
