package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a  reason: collision with root package name */
    private static Object f7048a = new Object();

    /* renamed from: b  reason: collision with root package name */
    private static boolean f7049b;

    /* renamed from: c  reason: collision with root package name */
    private static String f7050c;

    /* renamed from: d  reason: collision with root package name */
    private static int f7051d;

    public static String a(Context context) {
        c(context);
        return f7050c;
    }

    public static int b(Context context) {
        c(context);
        return f7051d;
    }

    private static void c(Context context) {
        Bundle bundle;
        synchronized (f7048a) {
            if (f7049b) {
                return;
            }
            f7049b = true;
            try {
                bundle = com.google.android.gms.common.n.c.a(context).a(context.getPackageName(), 128).metaData;
            } catch (PackageManager.NameNotFoundException e2) {
                Log.wtf("MetadataValueReader", "This should never happen.", e2);
            }
            if (bundle == null) {
                return;
            }
            f7050c = bundle.getString("com.google.app.id");
            f7051d = bundle.getInt("com.google.android.gms.version");
        }
    }
}
