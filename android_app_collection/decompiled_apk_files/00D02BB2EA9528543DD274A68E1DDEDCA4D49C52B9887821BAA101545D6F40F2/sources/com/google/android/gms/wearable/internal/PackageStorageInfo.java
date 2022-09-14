package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PackageStorageInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PackageStorageInfo> CREATOR = new cpjj();
    public final String a;
    public final String b;
    public final long c;

    public PackageStorageInfo(String str, String str2, long j) {
        this.a = str;
        this.b = str2;
        this.c = j;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.h(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
