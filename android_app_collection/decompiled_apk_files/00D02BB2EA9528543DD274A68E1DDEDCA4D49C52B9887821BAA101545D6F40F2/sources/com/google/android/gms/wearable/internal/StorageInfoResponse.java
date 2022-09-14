package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class StorageInfoResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<StorageInfoResponse> CREATOR = new cpjp();
    public final int a;
    public final long b;
    public final List<PackageStorageInfo> c;

    public StorageInfoResponse(int i, long j, List<PackageStorageInfo> list) {
        this.a = i;
        this.b = j;
        this.c = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.h(parcel, 3, this.b);
        cnwn.y(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
