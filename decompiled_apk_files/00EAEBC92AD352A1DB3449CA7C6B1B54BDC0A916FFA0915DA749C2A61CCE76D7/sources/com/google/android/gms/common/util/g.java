package com.google.android.gms.common.util;

import android.content.Context;
import android.util.Log;
/* loaded from: classes.dex */
public final class g {
    static {
        new String[]{"android.", "com.android.", "dalvik.", "java.", "javax."};
    }

    public static boolean a(Context context, Throwable th) {
        return a(context, th, 536870912);
    }

    private static boolean a(Context context, Throwable th, int i) {
        try {
            com.google.android.gms.common.internal.s.a(context);
            com.google.android.gms.common.internal.s.a(th);
            return false;
        } catch (Exception e2) {
            Log.e("CrashUtils", "Error adding exception to DropBox!", e2);
            return false;
        }
    }
}
