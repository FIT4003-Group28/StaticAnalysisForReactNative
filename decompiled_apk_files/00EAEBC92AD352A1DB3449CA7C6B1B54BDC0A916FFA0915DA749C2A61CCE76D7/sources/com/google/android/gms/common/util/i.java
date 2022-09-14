package com.google.android.gms.common.util;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    private static Boolean f7103a;

    /* renamed from: b  reason: collision with root package name */
    private static Boolean f7104b;

    /* renamed from: c  reason: collision with root package name */
    private static Boolean f7105c;

    public static boolean a() {
        return "user".equals(Build.TYPE);
    }

    @TargetApi(21)
    public static boolean a(Context context) {
        if (f7104b == null) {
            f7104b = Boolean.valueOf(l.g() && context.getPackageManager().hasSystemFeature("cn.google"));
        }
        return f7104b.booleanValue();
    }

    @TargetApi(20)
    public static boolean b(Context context) {
        if (f7103a == null) {
            f7103a = Boolean.valueOf(l.f() && context.getPackageManager().hasSystemFeature("android.hardware.type.watch"));
        }
        return f7103a.booleanValue();
    }

    @TargetApi(26)
    public static boolean c(Context context) {
        if (b(context)) {
            if (!l.h()) {
                return true;
            }
            return a(context) && !l.i();
        }
        return false;
    }

    public static boolean d(Context context) {
        if (f7105c == null) {
            f7105c = Boolean.valueOf(context.getPackageManager().hasSystemFeature("android.hardware.type.iot") || context.getPackageManager().hasSystemFeature("android.hardware.type.embedded"));
        }
        return f7105c.booleanValue();
    }
}
