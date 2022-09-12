package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetFdForAssetResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetFdForAssetResponse> CREATOR = new cpiq();
    public final int a;
    public final ParcelFileDescriptor b;

    public GetFdForAssetResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i | 1);
        cnwn.c(parcel, d);
    }
}
