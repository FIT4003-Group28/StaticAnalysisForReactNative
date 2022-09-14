package com.google.android.gms.common.api.internal;

import android.app.Activity;
/* loaded from: classes.dex */
public class g {

    /* renamed from: a  reason: collision with root package name */
    private final Object f6887a;

    public g(Activity activity) {
        com.google.android.gms.common.internal.s.a(activity, "Activity must not be null");
        this.f6887a = activity;
    }

    public Activity a() {
        return (Activity) this.f6887a;
    }

    public androidx.fragment.app.c b() {
        return (androidx.fragment.app.c) this.f6887a;
    }

    public boolean c() {
        return this.f6887a instanceof androidx.fragment.app.c;
    }

    public final boolean d() {
        return this.f6887a instanceof Activity;
    }
}
