package com.jw.firstapp.custom_view;

import android.content.Context;

public class DrawUtils {


    /**
     * dip转pix
     *
     * @param dpValue
     * @return
     */
    public static int dip2px(Context context, float dpValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dpValue * scale + 0.5f);
    }


}
