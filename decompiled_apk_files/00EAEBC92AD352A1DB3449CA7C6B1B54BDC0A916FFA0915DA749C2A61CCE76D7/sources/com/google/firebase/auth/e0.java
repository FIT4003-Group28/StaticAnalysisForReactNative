package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class e0 extends h {
    public static final Parcelable.Creator<e0> CREATOR = new r1();

    /* renamed from: b  reason: collision with root package name */
    private final String f8322b;

    /* renamed from: c  reason: collision with root package name */
    private final String f8323c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public e0(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        a(str, "idToken");
        this.f8322b = str;
        a(str2, "accessToken");
        this.f8323c = str2;
    }

    public static k3 a(e0 e0Var, String str) {
        com.google.android.gms.common.internal.s.a(e0Var);
        return new k3(e0Var.f8322b, e0Var.f8323c, e0Var.q(), null, null, null, str, null, null);
    }

    private static String a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new e0(this.f8322b, this.f8323c);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "google.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8322b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f8323c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
