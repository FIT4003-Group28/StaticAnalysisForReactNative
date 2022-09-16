package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class PutDataResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<PutDataResponse> CREATOR = new cpjk();
    public final int a;
    public final DataItemParcelable b;

    public PutDataResponse(int i, DataItemParcelable dataItemParcelable) {
        this.a = i;
        this.b = dataItemParcelable;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
