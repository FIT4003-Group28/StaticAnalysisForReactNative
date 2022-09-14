package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class j extends h {
    public static final Parcelable.Creator<j> CREATOR = new d1();

    /* renamed from: b  reason: collision with root package name */
    private String f8405b;

    /* renamed from: c  reason: collision with root package name */
    private String f8406c;

    /* renamed from: d  reason: collision with root package name */
    private final String f8407d;

    /* renamed from: e  reason: collision with root package name */
    private String f8408e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8409f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2) {
        this(str, str2, null, null, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public j(String str, String str2, String str3, String str4, boolean z) {
        com.google.android.gms.common.internal.s.b(str);
        this.f8405b = str;
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str3)) {
            this.f8406c = str2;
            this.f8407d = str3;
            this.f8408e = str4;
            this.f8409f = z;
            return;
        }
        throw new IllegalArgumentException("Cannot create an EmailAuthCredential without a password or emailLink.");
    }

    public static boolean a(String str) {
        f a2;
        return !TextUtils.isEmpty(str) && (a2 = f.a(str)) != null && a2.a() == 4;
    }

    public final j a(z zVar) {
        this.f8408e = zVar.z();
        this.f8409f = true;
        return this;
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return new j(this.f8405b, this.f8406c, this.f8407d, this.f8408e, this.f8409f);
    }

    public final String j() {
        return this.f8405b;
    }

    public final String k() {
        return this.f8407d;
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "password";
    }

    public String r() {
        return !TextUtils.isEmpty(this.f8406c) ? "password" : "emailLink";
    }

    public final String s() {
        return this.f8406c;
    }

    public final boolean t() {
        return !TextUtils.isEmpty(this.f8407d);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8405b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f8406c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8407d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f8408e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f8409f);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
