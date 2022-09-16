package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class o4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7545a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f7546b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7547c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f7548d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ m4 f7549e;

    public o4(m4 m4Var, String str, boolean z) {
        this.f7549e = m4Var;
        com.google.android.gms.common.internal.s.b(str);
        this.f7545a = str;
        this.f7546b = z;
    }

    public final void a(boolean z) {
        SharedPreferences.Editor edit = this.f7549e.s().edit();
        edit.putBoolean(this.f7545a, z);
        edit.apply();
        this.f7548d = z;
    }

    public final boolean a() {
        if (!this.f7547c) {
            this.f7547c = true;
            this.f7548d = this.f7549e.s().getBoolean(this.f7545a, this.f7546b);
        }
        return this.f7548d;
    }
}
