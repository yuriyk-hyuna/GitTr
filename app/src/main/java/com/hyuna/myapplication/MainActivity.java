package com.hyuna.myapplication;

import android.app.AlertDialog;
import android.app.Dialog;
import android.graphics.drawable.BitmapDrawable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.PopupWindow;


public class MainActivity extends ActionBarActivity {
private boolean isShow;
private PopupWindow left;
private PopupWindow center;
private PopupWindow right;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void start(View view) {

        PopupMenu menu = new PopupMenu(this, view);
        menu.getMenuInflater().inflate(R.menu.popup_menu,menu.getMenu());
        menu.show();
//        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
//        View inflate = LayoutInflater.from(MainActivity.this).inflate(R.layout.dialog_layout, null);
//        builder.setView(inflate);
//       final AlertDialog dialog=  builder.create();
//
//dialog.show();
//        dialog.getWindow().getDecorView().setBackgroundColor(getResources().getColor(android.R.color.transparent));
//        MyDialog dialog = new MyDialog(MainActivity.this);
//        dialog.show();

//        switch (view.getId()) {
//            case R.id.buttonBip:
//                left = switchPop(left);
//                checkout(left, view);
//                break;
//            case R.id.buttonCenter:
//                right = switchPop(right);
//                checkout(right, view);
//                break;
//            case R.id.buttonRight:
//                center = switchPop(center);
//                checkout(center, view);
//                break;
//        }


    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Log.i(MainActivity.class.getSimpleName(), String.format("On tauch event %d", ev.getAction()));
        if (ev.getAction() == MotionEvent.ACTION_DOWN) {
//            dismisAll();
        }
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        Log.i(MainActivity.class.getSimpleName(), String.format("On key down %d", keyCode));
        return super.onKeyDown(keyCode, event);
    }

    private void checkout(PopupWindow window, View view) {

        if (window.isShowing()) {
            window.dismiss();
        } else {
            window.getContentView().setMinimumWidth(view.getWidth());
            window.showAsDropDown(view, 0, -view.getHeight());
        }


    }
    private PopupWindow switchPop( PopupWindow window) {
        if (window == null) {
            View v = getLayoutInflater().inflate(R.layout.popup_window, null);
           window = new PopupWindow(v, -2, -2);
            window.setBackgroundDrawable(new BitmapDrawable());

        }

        return window;
    }

    private void dismis(PopupWindow window) {
        if (window == null) {
            window.dismiss();
        }
    }
    private void dismisAll() {
        dismis(left);
        dismis(center);
        dismis(right);

    }
}
