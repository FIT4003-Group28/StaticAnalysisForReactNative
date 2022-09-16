package com.facebook.react.common;

import android.os.SystemClock;
/* loaded from: classes.dex */
public class i {
    public static long a() {
        return System.currentTimeMillis();
    }

    public static long b() {
        return System.nanoTime();
    }

    public static long c() {
        return SystemClock.uptimeMillis();
    }
}
