package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class oa extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<oa> CREATOR = new ra();

    /* renamed from: b  reason: collision with root package name */
    public String f7562b;

    /* renamed from: c  reason: collision with root package name */
    public String f7563c;

    /* renamed from: d  reason: collision with root package name */
    public y9 f7564d;

    /* renamed from: e  reason: collision with root package name */
    public long f7565e;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7566f;

    /* renamed from: g  reason: collision with root package name */
    public String f7567g;

    /* renamed from: h  reason: collision with root package name */
    public p f7568h;
    public long i;
    public p j;
    public long k;
    public p l;

    /* JADX INFO: Access modifiers changed from: package-private */
    public oa(oa oaVar) {
        com.google.android.gms.common.internal.s.a(oaVar);
        this.f7562b = oaVar.f7562b;
        this.f7563c = oaVar.f7563c;
        this.f7564d = oaVar.f7564d;
        this.f7565e = oaVar.f7565e;
        this.f7566f = oaVar.f7566f;
        this.f7567g = oaVar.f7567g;
        this.f7568h = oaVar.f7568h;
        this.i = oaVar.i;
        this.j = oaVar.j;
        this.k = oaVar.k;
        this.l = oaVar.l;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public oa(String str, String str2, y9 y9Var, long j, boolean z, String str3, p pVar, long j2, p pVar2, long j3, p pVar3) {
        this.f7562b = str;
        this.f7563c = str2;
        this.f7564d = y9Var;
        this.f7565e = j;
        this.f7566f = z;
        this.f7567g = str3;
        this.f7568h = pVar;
        this.i = j2;
        this.j = pVar2;
        this.k = j3;
        this.l = pVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7562b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f7563c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, (Parcelable) this.f7564d, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f7565e);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f7566f);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f7567g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, (Parcelable) this.f7568h, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, this.i);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, (Parcelable) this.j, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, (Parcelable) this.l, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
