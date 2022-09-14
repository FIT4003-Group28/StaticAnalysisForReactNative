package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class q4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7599a;

    /* renamed from: b  reason: collision with root package name */
    private final long f7600b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f7601c;

    /* renamed from: d  reason: collision with root package name */
    private long f7602d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ m4 f7603e;

    public q4(m4 m4Var, String str, long j) {
        this.f7603e = m4Var;
        com.google.android.gms.common.internal.s.b(str);
        this.f7599a = str;
        this.f7600b = j;
    }

    public final long a() {
        if (!this.f7601c) {
            this.f7601c = true;
            this.f7602d = this.f7603e.s().getLong(this.f7599a, this.f7600b);
        }
        return this.f7602d;
    }

    public final void a(long j) {
        SharedPreferences.Editor edit = this.f7603e.s().edit();
        edit.putLong(this.f7599a, j);
        edit.apply();
        this.f7602d = j;
    }
}
