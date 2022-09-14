package com.google.android.gms.measurement.internal;

import android.os.Parcel;
import android.os.Parcelable;
/* loaded from: classes.dex */
public final class p extends com.google.android.gms.common.internal.x.a {
    public static final Parcelable.Creator<p> CREATOR = new s();

    /* renamed from: b  reason: collision with root package name */
    public final String f7569b;

    /* renamed from: c  reason: collision with root package name */
    public final o f7570c;

    /* renamed from: d  reason: collision with root package name */
    public final String f7571d;

    /* renamed from: e  reason: collision with root package name */
    public final long f7572e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public p(p pVar, long j) {
        com.google.android.gms.common.internal.s.a(pVar);
        this.f7569b = pVar.f7569b;
        this.f7570c = pVar.f7570c;
        this.f7571d = pVar.f7571d;
        this.f7572e = j;
    }

    public p(String str, o oVar, String str2, long j) {
        this.f7569b = str;
        this.f7570c = oVar;
        this.f7571d = str2;
        this.f7572e = j;
    }

    public final String toString() {
        String str = this.f7571d;
        String str2 = this.f7569b;
        String valueOf = String.valueOf(this.f7570c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(str2).length() + String.valueOf(valueOf).length());
        sb.append("origin=");
        sb.append(str);
        sb.append(",name=");
        sb.append(str2);
        sb.append(",params=");
        sb.append(valueOf);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f7569b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, (Parcelable) this.f7570c, i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f7571d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f7572e);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
