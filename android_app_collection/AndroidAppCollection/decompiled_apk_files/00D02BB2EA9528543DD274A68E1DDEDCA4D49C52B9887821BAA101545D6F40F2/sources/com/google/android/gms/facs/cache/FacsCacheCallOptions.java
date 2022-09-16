package com.google.android.gms.facs.cache;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FacsCacheCallOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FacsCacheCallOptions> CREATOR = new cobu();
    public final String a;
    public final long b;

    public FacsCacheCallOptions(String str, long j) {
        this.a = str;
        this.b = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.h(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
