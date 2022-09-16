package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class RootTelemetryConfiguration extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(3);
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public RootTelemetryConfiguration(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.o(parcel, 2, this.b);
        tqj.o(parcel, 3, this.c);
        tqj.s(parcel, 4, this.d);
        tqj.s(parcel, 5, this.e);
        tqj.n(parcel, m);
    }
}
