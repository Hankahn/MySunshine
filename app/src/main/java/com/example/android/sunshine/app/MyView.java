package com.example.android.sunshine.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.util.AttributeSet;
import android.view.View;


/**
 * TODO: document your custom view class.
 */
public class MyView extends View {

    Paint paint = new Paint();
    int direction = 0;
    Float azimut;

    private ShapeDrawable mDrawable;

    public MyView(Context context) {
        super(context);

        paint.setColor(0xff00ff00);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(2);
        paint.setAntiAlias(true);
    }

    public void setAzimut(Float _azimut) {
        azimut = _azimut;
    }

    public MyView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public MyView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    protected void onMeasure(int wMeasureSpec, int hMeasureSpec) {
        super.onMeasure(wMeasureSpec, hMeasureSpec);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        int width = getWidth();
        int height = getHeight();
        int centerx = width/2;
        int centery = height/2;
        canvas.rotate(azimut, centerx, centery);
        //canvas.drawLine(centerx, 0, centerx, height, paint);
        canvas.drawLine(centerx, 0, centerx - 20, height, paint);
        canvas.drawLine(centerx, 0, centerx + 20, height, paint);
        //canvas.drawLine(0, centery, width, centery, paint);
        // Rotate the canvas with the azimut
        //if (azimut != null)
        //    canvas.rotate(azimut/*-azimut*360/(2*3.14159f)*/, centerx, centery);
        /*paint.setColor(0xff0000ff);
        canvas.drawLine(centerx, -1000, centerx, +1000, paint);
        canvas.drawLine(-1000, centery, 1000, centery, paint);
        canvas.drawText("N", centerx+5, centery-10, paint);
        canvas.drawText("S", centerx-10, centery+15, paint);
        paint.setColor(0xff00ff00);*/
    }
}
