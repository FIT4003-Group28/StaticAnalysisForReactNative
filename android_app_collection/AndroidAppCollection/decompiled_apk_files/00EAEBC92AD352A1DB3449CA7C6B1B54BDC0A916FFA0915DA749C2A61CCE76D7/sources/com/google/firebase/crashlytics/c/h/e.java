package com.google.firebase.crashlytics.c.h;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private final Float f8623a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f8624b;

    private e(Float f2, boolean z) {
        this.f8624b = z;
        this.f8623a = f2;
    }

    public static e a(Context context) {
        boolean z;
        Float f2 = null;
        Intent registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (registerReceiver != null) {
            z = b(registerReceiver);
            f2 = a(registerReceiver);
        } else {
            z = false;
        }
        return new e(f2, z);
    }

    private static Float a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public Float a() {
        return this.f8623a;
    }

    public int b() {
        Float f2;
        if (!this.f8624b || (f2 = this.f8623a) == null) {
            return 1;
        }
        return ((double) f2.floatValue()) < 0.99d ? 2 : 3;
    }
}
