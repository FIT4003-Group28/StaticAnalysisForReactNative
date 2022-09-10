package com.google.ar.core;

import android.app.Activity;
import android.content.Context;
import com.google.ar.core.ArCoreApk;
import com.google.ar.core.exceptions.ResourceExhaustedException;
import com.google.ar.core.exceptions.UnavailableApkTooOldException;
import com.google.ar.core.exceptions.UnavailableArcoreNotInstalledException;
import com.google.ar.core.exceptions.UnavailableDeviceNotCompatibleException;
import com.google.ar.core.exceptions.UnavailableSdkTooOldException;
import com.google.ar.core.exceptions.UnavailableUserDeclinedInstallationException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* loaded from: classes5.dex */
class ArCoreApkJniAdapter {
    private static final Map<Class<? extends Throwable>, Integer> a;

    static {
        HashMap hashMap = new HashMap();
        a = hashMap;
        hashMap.put(IllegalArgumentException.class, Integer.valueOf(dbbl.ERROR_INVALID_ARGUMENT.G));
        hashMap.put(ResourceExhaustedException.class, Integer.valueOf(dbbl.ERROR_RESOURCE_EXHAUSTED.G));
        hashMap.put(UnavailableArcoreNotInstalledException.class, Integer.valueOf(dbbl.UNAVAILABLE_ARCORE_NOT_INSTALLED.G));
        hashMap.put(UnavailableDeviceNotCompatibleException.class, Integer.valueOf(dbbl.UNAVAILABLE_DEVICE_NOT_COMPATIBLE.G));
        hashMap.put(UnavailableApkTooOldException.class, Integer.valueOf(dbbl.UNAVAILABLE_APK_TOO_OLD.G));
        hashMap.put(UnavailableSdkTooOldException.class, Integer.valueOf(dbbl.UNAVAILABLE_SDK_TOO_OLD.G));
        hashMap.put(UnavailableUserDeclinedInstallationException.class, Integer.valueOf(dbbl.UNAVAILABLE_USER_DECLINED_INSTALLATION.G));
    }

    ArCoreApkJniAdapter() {
    }

    private static int a(Throwable th) {
        Class<?> cls = th.getClass();
        Map<Class<? extends Throwable>, Integer> map = a;
        if (map.containsKey(cls)) {
            return map.get(cls).intValue();
        }
        return dbbl.ERROR_FATAL.G;
    }

    static int checkAvailability(Context context) {
        try {
            return ArCoreApk.getInstance().checkAvailability(context).nativeCode;
        } catch (Throwable th) {
            a(th);
            return ArCoreApk.Availability.UNKNOWN_ERROR.nativeCode;
        }
    }

    static int requestInstall(Activity activity, boolean z, int[] iArr) {
        ArCoreApk.UserMessageType userMessageType;
        try {
            ArCoreApk arCoreApk = ArCoreApk.getInstance();
            ArCoreApk.InstallBehavior installBehavior = ((dbao) arCoreApk).d(activity) ? ArCoreApk.InstallBehavior.REQUIRED : ArCoreApk.InstallBehavior.OPTIONAL;
            if (!((dbao) arCoreApk).d(activity)) {
                userMessageType = ArCoreApk.UserMessageType.USER_ALREADY_INFORMED;
            } else {
                userMessageType = ArCoreApk.UserMessageType.APPLICATION;
            }
            iArr[0] = arCoreApk.requestInstall(activity, z, installBehavior, userMessageType).nativeCode;
            return dbbl.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }

    static int requestInstallCustom(Activity activity, boolean z, int i, int i2, int[] iArr) {
        try {
            iArr[0] = ArCoreApk.getInstance().requestInstall(activity, z, ArCoreApk.InstallBehavior.forNumber(i), ArCoreApk.UserMessageType.forNumber(i2)).nativeCode;
            return dbbl.SUCCESS.G;
        } catch (Throwable th) {
            return a(th);
        }
    }
}
