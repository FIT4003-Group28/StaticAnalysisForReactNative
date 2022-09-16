package com.google.vr.ndk.base;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.os.Build;
import android.util.Log;
import com.google.cardboard.sdk.deviceparams.CardboardV1DeviceParams;
import com.google.vr.sdk.proto.CardboardDevice$DeviceParams;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class DaydreamUtils {
    private static boolean sDaydreamPhoneOverrideForTesting;

    private static boolean canResolveIntent(PackageManager packageManager, ComponentName componentName, Intent intent) {
        List<ResolveInfo> queryIntentActivities = packageManager.queryIntentActivities(intent, 128);
        if (queryIntentActivities != null) {
            for (ResolveInfo resolveInfo : queryIntentActivities) {
                if (resolveInfo != null && resolveInfo.activityInfo != null && resolveInfo.activityInfo.name != null && resolveInfo.activityInfo.name.equals(componentName.getClassName())) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private static boolean checkHeadsetCompatibility(PackageManager packageManager, ComponentName componentName, String str) {
        Intent intent = new Intent();
        intent.setPackage(componentName.getPackageName());
        intent.addCategory(str);
        return canResolveIntent(packageManager, componentName, intent);
    }

    public static DaydreamCompatibility getComponentDaydreamCompatibility(Context context, ComponentName componentName) {
        return getComponentDaydreamCompatibility(context.getPackageManager(), componentName);
    }

    public static String getDeviceParamsDisplayedName(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        if (cardboardDevice$DeviceParams == null) {
            Log.e("DaydreamUtils", "Null params in getDeviceParamsDisplayedName");
            return "";
        }
        return getDeviceParamsDisplayedName(cardboardDevice$DeviceParams.getVendor(), cardboardDevice$DeviceParams.getModel());
    }

    public static boolean isDaydreamPhone(Context context) {
        if (sDaydreamPhoneOverrideForTesting) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            return context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance");
        }
        return false;
    }

    public static boolean isDaydreamViewer(CardboardDevice$DeviceParams cardboardDevice$DeviceParams) {
        return cardboardDevice$DeviceParams != null && cardboardDevice$DeviceParams.hasDaydreamInternal();
    }

    static DaydreamCompatibility getComponentDaydreamCompatibility(PackageManager packageManager, ComponentName componentName) {
        boolean checkHeadsetCompatibility = checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM");
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.CARDBOARD")) {
            checkHeadsetCompatibility = (checkHeadsetCompatibility ? 1 : 0) | true;
        }
        if (checkHeadsetCompatibility(packageManager, componentName, "com.google.intent.category.DAYDREAM_CONTROLLER_OPTIONAL")) {
            boolean z = checkHeadsetCompatibility ? 1 : 0;
            char c = checkHeadsetCompatibility ? 1 : 0;
            char c2 = checkHeadsetCompatibility ? 1 : 0;
            checkHeadsetCompatibility = z | true;
        }
        int i = checkHeadsetCompatibility ? 1 : 0;
        int i2 = checkHeadsetCompatibility ? 1 : 0;
        int i3 = checkHeadsetCompatibility ? 1 : 0;
        return new DaydreamCompatibility(i);
    }

    public static String getDeviceParamsDisplayedName(String str, String str2) {
        char c;
        if (str == null || str2 == null) {
            Log.e("DaydreamUtils", "Null vendor/model in getDeviceParamsDisplayedName");
            return str2 != null ? str2 : "";
        } else if (!str.equals(CardboardV1DeviceParams.CARDBOARD_V1_VENDOR) && !str.equals("Google")) {
            return str2;
        } else {
            int hashCode = str2.hashCode();
            if (hashCode != -2120800987) {
                if (hashCode == 1761541558 && str2.equals("Cardboard")) {
                    c = 0;
                }
                c = 65535;
            } else {
                if (str2.equals(CardboardV1DeviceParams.CARDBOARD_V1_MODEL)) {
                    c = 1;
                }
                c = 65535;
            }
            return c != 0 ? c != 1 ? str2 : "Google Cardboard" : "Google Cardboard (I/O 2015)";
        }
    }
}
