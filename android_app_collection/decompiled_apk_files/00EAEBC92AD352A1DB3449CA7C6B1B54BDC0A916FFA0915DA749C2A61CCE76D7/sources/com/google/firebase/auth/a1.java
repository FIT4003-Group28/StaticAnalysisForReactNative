package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class a1 extends k0 {
    public static final Parcelable.Creator<a1> CREATOR = new c1();

    /* renamed from: b  reason: collision with root package name */
    private final String f8298b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8299c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8300d;

    /* renamed from: e  reason: collision with root package name */
    private final k3 f8301e;

    /* renamed from: f  reason: collision with root package name */
    private final String f8302f;

    /* renamed from: g  reason: collision with root package name */
    private final String f8303g;

    /* renamed from: h  reason: collision with root package name */
    private final String f8304h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a1(String str, String str2, String str3, k3 k3Var, String str4, String str5, String str6) {
        this.f8298b = str;
        this.f8299c = str2;
        this.f8300d = str3;
        this.f8301e = k3Var;
        this.f8302f = str4;
        this.f8303g = str5;
        this.f8304h = str6;
    }

    public static k3 a(a1 a1Var, String str) {
        com.google.android.gms.common.internal.s.a(a1Var);
        k3 k3Var = a1Var.f8301e;
        return k3Var != null ? k3Var : new k3(a1Var.s(), a1Var.r(), a1Var.q(), null, a1Var.t(), null, str, a1Var.f8302f, a1Var.f8304h);
    }

    public static a1 a(k3 k3Var) {
        com.google.android.gms.common.internal.s.a(k3Var, "Must specify a non-null webSignInCredential");
        return new a1(null, null, null, k3Var, null, null, null);
    }

    public static a1 a(String str, String str2, String str3) {
        return a(str, str2, str3, null, null);
    }

    public static a1 a(String str, String str2, String str3, String str4, String str5) {
        com.google.android.gms.common.internal.s.a(str, (Object) "Must specify a non-empty providerId");
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            return new a1(str, str2, str3, null, str4, str5, null);
        }
        throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new a1(this.f8298b, this.f8299c, this.f8300d, this.f8301e, this.f8302f, this.f8303g, this.f8304h);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return this.f8298b;
    }

    public String r() {
        return this.f8300d;
    }

    public String s() {
        return this.f8299c;
    }

    public String t() {
        return this.f8303g;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, q(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, s(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, r(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, (Parcelable) this.f8301e, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f8302f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, t(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f8304h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
