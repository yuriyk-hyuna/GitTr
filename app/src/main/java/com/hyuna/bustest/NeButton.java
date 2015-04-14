package com.hyuna.bustest;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.Button;

public class NeButton extends Button {

    public static final int PADDING = 16;
    public static final int STROKE_WIDTH = 2;

    public NeButton(Context context) {
        super(context);
    }

    public NeButton(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public NeButton(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        final CharSequence text = getText();
        final int color = getTextColors().getDefaultColor();
        final Paint textPaint = getPaint();
        final Paint rectPaint = new Paint();

        textPaint.setColor(color);
        rectPaint.setColor(color);

        float xLength = textPaint.measureText(getText(), 0, getText().length());
        float yLength = getTextSize();

        final int x = getWidth() / 2 - (int) xLength / 2;
        final int y = getHeight() / 2 + (int) yLength / 2;

        canvas.drawText(text, 0, text.length(), x, y, textPaint);

        rectPaint.setStrokeWidth(STROKE_WIDTH);
        rectPaint.setStyle(Paint.Style.STROKE);

        canvas.drawRect(x - PADDING, y - (int) yLength - (int) yLength / 2, x + xLength + PADDING, y + yLength, rectPaint);


    }
}
