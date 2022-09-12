package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class InitializationParams extends AbstractSafeParcelable {
    public static final Parcelable.Creator<InitializationParams> CREATOR = new cose();
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
        int d = cnwn.d(parcel);
        cnwn.h(parcel, 1, this.a);
        cnwn.h(parcel, 2, this.b);
        cnwn.e(parcel, 3, this.c);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.k(parcel, 6, this.f, false);
        cnwn.m(parcel, 7, this.g);
        cnwn.k(parcel, 8, this.h, false);
        cnwn.c(parcel, d);
    }
}
