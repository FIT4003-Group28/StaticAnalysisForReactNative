package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.util.Pair;
/* loaded from: classes.dex */
public final class t4 {

    /* renamed from: a  reason: collision with root package name */
    private final String f7700a;

    /* renamed from: b  reason: collision with root package name */
    private final String f7701b;

    /* renamed from: c  reason: collision with root package name */
    private final String f7702c;

    /* renamed from: d  reason: collision with root package name */
    private final long f7703d;

    /* renamed from: e  reason: collision with root package name */
    private final /* synthetic */ m4 f7704e;

    private t4(m4 m4Var, String str, long j) {
        this.f7704e = m4Var;
        com.google.android.gms.common.internal.s.b(str);
        com.google.android.gms.common.internal.s.a(j > 0);
        this.f7700a = String.valueOf(str).concat(":start");
        this.f7701b = String.valueOf(str).concat(":count");
        this.f7702c = String.valueOf(str).concat(":value");
        this.f7703d = j;
    }

    private final void b() {
        this.f7704e.g();
        long a2 = this.f7704e.b().a();
        SharedPreferences.Editor edit = this.f7704e.s().edit();
        edit.remove(this.f7701b);
        edit.remove(this.f7702c);
        edit.putLong(this.f7700a, a2);
        edit.apply();
    }

    private final long c() {
        return this.f7704e.s().getLong(this.f7700a, 0L);
    }

    public final Pair<String, Long> a() {
        long abs;
        this.f7704e.g();
        this.f7704e.g();
        long c2 = c();
        if (c2 == 0) {
            b();
            abs = 0;
        } else {
            abs = Math.abs(c2 - this.f7704e.b().a());
        }
        long j = this.f7703d;
        if (abs < j) {
            return null;
        }
        if (abs > (j << 1)) {
            b();
            return null;
        }
        String string = this.f7704e.s().getString(this.f7702c, null);
        long j2 = this.f7704e.s().getLong(this.f7701b, 0L);
        b();
        return (string == null || j2 <= 0) ? m4.D : new Pair<>(string, Long.valueOf(j2));
    }

    public final void a(String str, long j) {
        this.f7704e.g();
        if (c() == 0) {
            b();
        }
        if (str == null) {
            str = "";
        }
        long j2 = this.f7704e.s().getLong(this.f7701b, 0L);
        if (j2 <= 0) {
            SharedPreferences.Editor edit = this.f7704e.s().edit();
            edit.putString(this.f7702c, str);
            edit.putLong(this.f7701b, 1L);
            edit.apply();
            return;
        }
        long j3 = j2 + 1;
        boolean z = (this.f7704e.j().t().nextLong() & Long.MAX_VALUE) < Long.MAX_VALUE / j3;
        SharedPreferences.Editor edit2 = this.f7704e.s().edit();
        if (z) {
            edit2.putString(this.f7702c, str);
        }
        edit2.putLong(this.f7701b, j3);
        edit2.apply();
    }
}
