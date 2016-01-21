package com.hsx.commoncode.util;


import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by Doraemon
 * Date: 2014/8/6
 * Time: 15:20
 * 设备屏幕尺寸相关
 */
public class DensityUtil {

    /**
     * dip转px的方法
     *
     * @param context
     * @param value
     * @return int
     * @author Doraemon
     * @time 2014年8月6日上午11:05:23
     */
    public static int dipToPx(Context context, float value) {
        Float displayDensity = Float.valueOf(context.getResources().getDisplayMetrics().density);
        float rawPx = value * displayDensity.floatValue();
        return (int) (0.5F + rawPx);
    }

    /**
     * dip转px的另一种方法
     *
     * @param value
     * @return
     */
    public static int dpToPx(float value) {
        return (int) (value * Resources.getSystem().getDisplayMetrics().density);
    }


    /**
     * 获取屏幕的宽高
     *
     * @param context
     * @return
     */
    @TargetApi(13)
    public static Point getDevicePoint(Context context) {

        WindowManager manager = (WindowManager) context.getSystemService(Context.WINDOW_SERVICE);
        Display display = manager.getDefaultDisplay();
        Point point = new Point();
        if (Build.VERSION.SDK_INT >= 13) {
            display.getSize(point);
        } else {
            point.set(display.getWidth(), display.getHeight());
        }
        return point;
    }

    /**
     * 获取当前设备高，单位px
     *
     * @param context
     * @return
     */
    public static int getDeviceHeight(Context context) {
        return getDevicePoint(context).y;
    }

    /**
     * 获取当前设备宽，单位px
     *
     * @param context
     * @return
     */
    public static int getDeviceWidth(Context context) {
        return getDevicePoint(context).x;
    }
}