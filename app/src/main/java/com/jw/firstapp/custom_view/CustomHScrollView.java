package com.jw.firstapp.custom_view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.HorizontalScrollView;

public class CustomHScrollView extends HorizontalScrollView {

    public CustomHScrollView(Context context) {
        super(context);
    }

    public CustomHScrollView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CustomHScrollView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onScrollChanged(int l, int t, int oldl, int oldt) {
        super.onScrollChanged(l, t, oldl, oldt);
        System.out.println("scroll-X:"+l);
    }
}
