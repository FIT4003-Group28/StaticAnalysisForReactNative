package com.google.vr.ndk.base;

import android.app.Activity;
import android.os.PowerManager;
import android.util.Log;
import android.view.Window;
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class AndroidCompat {
    private AndroidCompat() {
    }

    public static void setSustainedPerformanceMode(Activity activity, boolean z) {
        if (axdq.a() && ((PowerManager) activity.getSystemService("power")).isSustainedPerformanceModeSupported()) {
            Window window = activity.getWindow();
            if (window == null) {
                Log.e(axdq.a, "Activity does not have a window");
            } else {
                window.setSustainedPerformanceMode(z);
            }
        }
    }

    public static boolean setVrModeEnabled(Activity activity, boolean z) {
        return axdq.b(activity, z);
    }
}
