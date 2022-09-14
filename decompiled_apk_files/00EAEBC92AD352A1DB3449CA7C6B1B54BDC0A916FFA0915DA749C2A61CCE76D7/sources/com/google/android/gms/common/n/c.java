package com.google.android.gms.common.n;

import android.content.Context;
/* loaded from: classes.dex */
public class c {

    /* renamed from: b  reason: collision with root package name */
    private static c f7078b = new c();

    /* renamed from: a  reason: collision with root package name */
    private b f7079a = null;

    public static b a(Context context) {
        return f7078b.b(context);
    }

    private final synchronized b b(Context context) {
        if (this.f7079a == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.f7079a = new b(context);
        }
        return this.f7079a;
    }
}
