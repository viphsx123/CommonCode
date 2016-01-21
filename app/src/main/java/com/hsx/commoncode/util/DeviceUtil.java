package com.hsx.commoncode.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.view.Display;
import android.view.WindowManager;

/**
 * Created by Doraemon
 * Date: 16/1/21
 * Time: 下午4:21
 * Summary:设备硬件信息相关
 */
public class DeviceUtil {

    private DeviceUtil() {

    }

    /**
     * 判断当前设备是否为手机
     *
     * @param context
     * @return true表示当前设备是手机
     */
    public static boolean isPhone(Context context) {
        TelephonyManager telephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
        if (telephony.getPhoneType() == TelephonyManager.PHONE_TYPE_NONE) {
            return false;
        } else {
            return true;
        }
    }

    /**
     * 获取当前设备的IMEI
     *
     * @param context
     * @return
     */
    @TargetApi(Build.VERSION_CODES.CUPCAKE)
    public static String getDeviceIMEI(Context context) {
        String deviceId;
        if (isPhone(context)) {
            TelephonyManager telephony = (TelephonyManager) context.getSystemService(Context.TELEPHONY_SERVICE);
            deviceId = telephony.getDeviceId();
        } else {
            deviceId = Settings.Secure.getString(context.getContentResolver(), Settings.Secure.ANDROID_ID);
        }
        return deviceId;
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
