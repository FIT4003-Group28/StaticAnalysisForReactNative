package com.google.android.gms.ads.internal.formats;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.VideoOptionsParcel;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class NativeAdOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(17);
    public final int a;
    public final boolean b;
    public final int c;
    public final boolean d;
    public final int e;
    public final VideoOptionsParcel f;
    public final boolean g;
    public final int h;

    public NativeAdOptionsParcel(int i, boolean z, int i2, boolean z2, int i3, VideoOptionsParcel videoOptionsParcel, boolean z3, int i4) {
        this.a = i;
        this.b = z;
        this.c = i2;
        this.d = z2;
        this.e = i3;
        this.f = videoOptionsParcel;
        this.g = z3;
        this.h = i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.o(parcel, 2, this.b);
        tqj.s(parcel, 3, this.c);
        tqj.o(parcel, 4, this.d);
        tqj.s(parcel, 5, this.e);
        tqj.E(parcel, 6, this.f, i);
        tqj.o(parcel, 7, this.g);
        tqj.s(parcel, 8, this.h);
        tqj.n(parcel, m);
    }
}
