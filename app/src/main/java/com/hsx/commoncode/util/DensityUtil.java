package com.hsx.commoncode.util;


import android.content.Context;
import android.content.res.Resources;
import android.util.TypedValue;

/**
 * Created by Doraemon
 * Date: 2014/8/6
 * Time: 15:20
 * 常用单位转换
 */
public class DensityUtil {

    private DensityUtil() {
    }

    /**
     * dp转px的另一种方法(不需要context)
     *
     * @param value
     * @return
     */
    public static int dpToPx(float value) {
        return (int) (value * Resources.getSystem().getDisplayMetrics().density);
    }

    /**
     * dp转px
     *
     * @param context
     * @param dpVal
     * @return
     */
    public static int dp2px(Context context, float dpVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,
                dpVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转dp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2dp(Context context, float pxVal) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (pxVal / scale);
    }

    /**
     * sp转px
     *
     * @param context
     * @param spVal
     * @return
     */
    public static int sp2px(Context context, float spVal) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP,
                spVal, context.getResources().getDisplayMetrics());
    }

    /**
     * px转sp
     *
     * @param context
     * @param pxVal
     * @return
     */
    public static float px2sp(Context context, float pxVal) {
        return (pxVal / context.getResources().getDisplayMetrics().scaledDensity);
    }

}