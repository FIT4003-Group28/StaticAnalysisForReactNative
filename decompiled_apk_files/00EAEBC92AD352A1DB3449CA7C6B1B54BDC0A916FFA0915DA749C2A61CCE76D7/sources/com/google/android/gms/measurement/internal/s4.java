package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
/* loaded from: classes.dex */
public final class s4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7679a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f7680b;

    /* renamed from: c  reason: collision with root package name */
    private String f7681c;

    /* renamed from: d  reason: collision with root package name */
    private final /* synthetic */ m4 f7682d;

    public s4(m4 m4Var, String str, String str2) {
        this.f7682d = m4Var;
        com.google.android.gms.common.internal.s.b(str);
        this.f7679a = str;
    }

    public final String a() {
        if (!this.f7680b) {
            this.f7680b = true;
            this.f7681c = this.f7682d.s().getString(this.f7679a, null);
        }
        return this.f7681c;
    }

    public final void a(String str) {
        if (this.f7682d.l().a(r.x0) || !z9.c(str, this.f7681c)) {
            SharedPreferences.Editor edit = this.f7682d.s().edit();
            edit.putString(this.f7679a, str);
            edit.apply();
            this.f7681c = str;
        }
    }
}
