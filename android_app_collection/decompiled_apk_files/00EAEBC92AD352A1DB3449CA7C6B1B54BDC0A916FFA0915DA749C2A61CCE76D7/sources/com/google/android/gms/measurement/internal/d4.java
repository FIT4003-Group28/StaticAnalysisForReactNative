package com.google.android.gms.measurement.internal;

import android.os.Bundle;
/* loaded from: classes.dex */
public final class d4 {

    /* renamed from: a  reason: collision with root package name */
    public String f7234a;

    /* renamed from: b  reason: collision with root package name */
    private String f7235b;

    /* renamed from: c  reason: collision with root package name */
    private long f7236c;

    /* renamed from: d  reason: collision with root package name */
    public Bundle f7237d;

    private d4(String str, String str2, Bundle bundle, long j) {
        this.f7234a = str;
        this.f7235b = str2;
        this.f7237d = bundle == null ? new Bundle() : bundle;
        this.f7236c = j;
    }

    public static d4 a(p pVar) {
        return new d4(pVar.f7569b, pVar.f7571d, pVar.f7570c.j(), pVar.f7572e);
    }

    public final p a() {
        return new p(this.f7234a, new o(new Bundle(this.f7237d)), this.f7235b, this.f7236c);
    }

    public final String toString() {
        String str = this.f7235b;
        String str2 = this.f7234a;
        String valueOf = String.valueOf(this.f7237d);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }
}
