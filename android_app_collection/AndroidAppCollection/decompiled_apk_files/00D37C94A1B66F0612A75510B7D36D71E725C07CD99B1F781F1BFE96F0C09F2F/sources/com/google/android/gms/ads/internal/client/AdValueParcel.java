package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AdValueParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(11);
    public final int a;
    public final int b;
    public final String c;
    public final long d;

    public AdValueParcel(int i, int i2, String str, long j) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.t(parcel, 4, this.d);
        tqj.n(parcel, m);
    }
}
