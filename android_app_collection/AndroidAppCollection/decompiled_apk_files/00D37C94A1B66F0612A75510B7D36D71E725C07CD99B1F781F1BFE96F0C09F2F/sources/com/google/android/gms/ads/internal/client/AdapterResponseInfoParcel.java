package com.google.android.gms.ads.internal.client;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdapterResponseInfoParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(12);
    public String a;
    public long b;
    public AdErrorParcel c;
    public Bundle d;

    public AdapterResponseInfoParcel(String str, long j, AdErrorParcel adErrorParcel, Bundle bundle) {
        this.a = str;
        this.b = j;
        this.c = adErrorParcel;
        this.d = bundle;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 1, this.a);
        tqj.t(parcel, 2, this.b);
        tqj.E(parcel, 3, this.c, i);
        tqj.v(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
