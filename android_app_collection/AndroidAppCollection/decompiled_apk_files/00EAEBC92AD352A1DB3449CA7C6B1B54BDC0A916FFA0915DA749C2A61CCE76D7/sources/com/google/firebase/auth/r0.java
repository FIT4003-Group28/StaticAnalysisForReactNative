package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class r0 extends h {
    public static final Parcelable.Creator<r0> CREATOR = new x0();

    /* renamed from: b  reason: collision with root package name */
    private String f8438b;

    /* renamed from: c  reason: collision with root package name */
    private String f8439c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public r0(String str, String str2) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8438b = str;
        com.google.android.gms.common.internal.s.b(str2);
        this.f8439c = str2;
    }

    public static k3 a(r0 r0Var, String str) {
        com.google.android.gms.common.internal.s.a(r0Var);
        return new k3(null, r0Var.f8438b, r0Var.q(), null, r0Var.f8439c, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new r0(this.f8438b, this.f8439c);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "twitter.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8438b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f8439c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
