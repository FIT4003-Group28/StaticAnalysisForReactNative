package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class c0 extends h {
    public static final Parcelable.Creator<c0> CREATOR = new q1();

    /* renamed from: b  reason: collision with root package name */
    private String f8307b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public c0(String str) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8307b = str;
    }

    public static k3 a(c0 c0Var, String str) {
        com.google.android.gms.common.internal.s.a(c0Var);
        return new k3(null, c0Var.f8307b, c0Var.q(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new c0(this.f8307b);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "github.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8307b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
