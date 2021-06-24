package com.jw.firstapp.custom_view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;

import com.jw.firstapp.R;

public class DrawTestView extends View {

    private int viewHeight;
    private int viewWidth;
    private Context context;
    private Rect rect;
    private boolean isInRect;
    private boolean translate;

    public DrawTestView(Context context) {
        this(context, null);
    }

    public DrawTestView(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public DrawTestView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.context = context;
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int specWidthMode = MeasureSpec.getMode(widthMeasureSpec);
        if (specWidthMode==MeasureSpec.UNSPECIFIED || specWidthMode==MeasureSpec.AT_MOST){
            viewWidth = 300;
        }else {
            viewWidth = MeasureSpec.getSize(widthMeasureSpec);
        }
        System.out.println("specWidthMode:"+(specWidthMode==MeasureSpec.UNSPECIFIED ? "UNSPECIFIED" :specWidthMode == MeasureSpec.AT_MOST ? "AT_MOST" : "EXACTLY"));

        int specHeightMode = MeasureSpec.getMode(heightMeasureSpec);
        if (specHeightMode == MeasureSpec.AT_MOST || specHeightMode == MeasureSpec.UNSPECIFIED){
            viewHeight = 300;
        }else {
            viewHeight = MeasureSpec.getSize(heightMeasureSpec);
        }
        System.out.println("specHeightMode:"+(specHeightMode==MeasureSpec.UNSPECIFIED ? "UNSPECIFIED" :specHeightMode==MeasureSpec.AT_MOST ? "AT_MOST" : "EXACTLY"));
//        super.onMeasure(widthMeasureSpec,heightMeasureSpec);
//
        setMeasuredDimension(viewWidth,viewHeight);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawColor(context.getResources().getColor(R.color.canvas_bg_color));
        if (translate){
            canvas.translate(0,100);
        }
        Paint linePaint = new Paint();
        linePaint.setAntiAlias(true);
        linePaint.setColor(context.getResources().getColor(R.color.t4_mian_color));

        Paint strokePaint = new Paint();
        strokePaint.setColor(context.getResources().getColor(R.color.white));
        strokePaint.setStyle(Paint.Style.STROKE);
        strokePaint.setStrokeWidth(2f);
//        canvas.drawLine(0,viewHeight/2,viewWidth,viewHeight/2,linePaint);
        canvas.drawLine(0,viewHeight,viewWidth,viewHeight,linePaint);
        RectF rectF = new RectF(viewWidth/60*2,viewHeight/4,viewWidth*4/60,viewHeight);
//        canvas.drawRect(rect,linePaint);
        canvas.drawRoundRect(rectF,viewWidth/60,viewWidth/60,linePaint);
        rect = new Rect(viewWidth/60*28,viewHeight/4,viewWidth*30/60,viewHeight);
        canvas.drawRect(rect,linePaint);
        rect = new Rect(viewWidth/60*28,viewHeight/4,viewWidth*30/60,viewHeight);
        canvas.drawRect(rect,strokePaint);
        rect = new Rect(viewWidth/60*29,0,viewWidth*31/60,viewHeight);
        canvas.drawRect(rect,linePaint);
        rect = new Rect(viewWidth/60*29,0,viewWidth*31/60,viewHeight);
        canvas.drawRect(rect,strokePaint);
        rect = new Rect(viewWidth/60*49,0,viewWidth*51/60,viewHeight);
        canvas.drawRect(rect,linePaint);

        linePaint.setColor(context.getResources().getColor(R.color.colorPrimary));
        canvas.drawLine(0,viewHeight/2,viewWidth,viewHeight/2,linePaint);
        canvas.drawLine(viewWidth/2,0,viewWidth/2,viewHeight,linePaint);

        Paint textPaint = new Paint();
        textPaint.setColor(context.getResources().getColor(R.color.black));
        textPaint.setTextSize(DrawUtils.dip2px(context,20));
        canvas.drawText("测试",viewWidth/2,viewHeight/2,textPaint);



    }


    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()){
            case MotionEvent.ACTION_DOWN:
                if (!translate){
                    translate = true;
                    postInvalidate();
                }

//                isInRect = rect.contains((int) event.getX(),(int) event.getY());
                break;
            case MotionEvent.ACTION_UP:
//                if (isInRect  && rect.contains((int) event.getX(),(int) event.getY())){
//                    translate = true;
//                    postInvalidate();
//                }
                break;
        }
        return super.onTouchEvent(event);
    }
}

