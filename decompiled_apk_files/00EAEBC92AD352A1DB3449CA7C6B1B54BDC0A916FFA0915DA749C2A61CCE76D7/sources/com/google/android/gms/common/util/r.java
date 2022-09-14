package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import android.os.SystemClock;
/* loaded from: classes.dex */
public final class r {

    /* renamed from: b  reason: collision with root package name */
    private static long f7119b;

    /* renamed from: a  reason: collision with root package name */
    private static final IntentFilter f7118a = new IntentFilter("android.intent.action.BATTERY_CHANGED");

    /* renamed from: c  reason: collision with root package name */
    private static float f7120c = Float.NaN;

    @TargetApi(20)
    public static int a(Context context) {
        if (context == null || context.getApplicationContext() == null) {
            return -1;
        }
        Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f7118a);
        int i = 0;
        int i2 = ((registerReceiver == null ? 0 : registerReceiver.getIntExtra("plugged", 0)) & 7) != 0 ? 1 : 0;
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        if (powerManager == null) {
            return -1;
        }
        if (l.f() ? powerManager.isInteractive() : powerManager.isScreenOn()) {
            i = 2;
        }
        return i | i2;
    }

    public static synchronized float b(Context context) {
        synchronized (r.class) {
            if (SystemClock.elapsedRealtime() - f7119b < 60000 && !Float.isNaN(f7120c)) {
                return f7120c;
            }
            Intent registerReceiver = context.getApplicationContext().registerReceiver(null, f7118a);
            if (registerReceiver != null) {
                f7120c = registerReceiver.getIntExtra("level", -1) / registerReceiver.getIntExtra("scale", -1);
            }
            f7119b = SystemClock.elapsedRealtime();
            return f7120c;
        }
    }
}
