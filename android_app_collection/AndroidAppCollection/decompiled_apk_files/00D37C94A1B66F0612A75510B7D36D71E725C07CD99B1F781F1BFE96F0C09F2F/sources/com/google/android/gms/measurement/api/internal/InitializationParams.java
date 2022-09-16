package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rfn(16);
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;
    public final String h;

    public InitializationParams(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle, String str4) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
        this.h = str4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.t(parcel, 1, this.a);
        tqj.t(parcel, 2, this.b);
        tqj.o(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.v(parcel, 7, this.g);
        tqj.F(parcel, 8, this.h);
        tqj.n(parcel, m);
    }
}
