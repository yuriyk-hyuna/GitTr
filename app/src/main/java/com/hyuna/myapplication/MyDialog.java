package com.hyuna.myapplication;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Window;
import android.view.WindowManager;

public class MyDialog extends Dialog {
    public MyDialog(Context context) {
        super(context);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.dialog_layout);
        MyDialog.this.setCancelable(true);
        if (Build.VERSION.SDK_INT > Build.VERSION_CODES.ICE_CREAM_SANDWICH_MR1) {
            final Window window = getWindow();
            window.getDecorView().setBackground(new ColorDrawable(Color.TRANSPARENT));
            WindowManager.LayoutParams wParams = new WindowManager.LayoutParams();
            wParams.copyFrom(window.getAttributes());
            wParams.width = WindowManager.LayoutParams.MATCH_PARENT;
            wParams.height = -2;
            wParams.gravity = Gravity.BOTTOM;
            wParams.horizontalMargin=0;
            
            window.setAttributes(wParams);

        }

    }
}
