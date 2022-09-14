package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import c.e.a.b.d.e.k3;
/* loaded from: classes.dex */
public class l extends h {
    public static final Parcelable.Creator<l> CREATOR = new e1();

    /* renamed from: b  reason: collision with root package name */
    private final String f8413b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(String str) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8413b = str;
    }

    public static k3 a(l lVar, String str) {
        com.google.android.gms.common.internal.s.a(lVar);
        return new k3(null, lVar.f8413b, lVar.q(), null, null, null, str, null, null);
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new l(this.f8413b);
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "facebook.com";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8413b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
