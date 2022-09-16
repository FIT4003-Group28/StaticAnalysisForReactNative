package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class p0 extends h {
    public static final Parcelable.Creator<p0> CREATOR = new u1();

    /* renamed from: b  reason: collision with root package name */
    private final String f8433b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p0(String str) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8433b = str;
    }

    public static k3 a(p0 p0Var, String str) {
        com.google.android.gms.common.internal.s.a(p0Var);
        return new k3(null, null, p0Var.q(), null, null, p0Var.f8433b, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new p0(this.f8433b);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "playgames.google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8433b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
