package com.google.firebase.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public class m0 extends h implements Cloneable {
    public static final Parcelable.Creator<m0> CREATOR = new s1();

    /* renamed from: b  reason: collision with root package name */
    private String f8416b;

    /* renamed from: c  reason: collision with root package name */
    private String f8417c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8418d;

    /* renamed from: e  reason: collision with root package name */
    private String f8419e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f8420f;

    /* renamed from: g  reason: collision with root package name */
    private String f8421g;

    /* renamed from: h  reason: collision with root package name */
    private String f8422h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public m0(String str, String str2, boolean z, String str3, boolean z2, String str4, String str5) {
        com.google.android.gms.common.internal.s.a((z && !TextUtils.isEmpty(str3) && TextUtils.isEmpty(str5)) || (z && TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str5)) || ((!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) || (!TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4))), "Cannot create PhoneAuthCredential without either verificationProof, sessionInfo, temporary proof, or enrollment ID.");
        this.f8416b = str;
        this.f8417c = str2;
        this.f8418d = z;
        this.f8419e = str3;
        this.f8420f = z2;
        this.f8421g = str4;
        this.f8422h = str5;
    }

    public final m0 a(boolean z) {
        this.f8420f = false;
        return this;
    }

    public /* synthetic */ Object clone() {
        return new m0(this.f8416b, r(), this.f8418d, this.f8419e, this.f8420f, this.f8421g, this.f8422h);
    }

    @Override // com.google.firebase.auth.h
    public final h f() {
        return (m0) clone();
    }

    @Override // com.google.firebase.auth.h
    public String q() {
        return "phone";
    }

    public String r() {
        return this.f8417c;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 1, this.f8416b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, r(), false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f8418d);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f8419e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f8420f);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f8421g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f8422h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
