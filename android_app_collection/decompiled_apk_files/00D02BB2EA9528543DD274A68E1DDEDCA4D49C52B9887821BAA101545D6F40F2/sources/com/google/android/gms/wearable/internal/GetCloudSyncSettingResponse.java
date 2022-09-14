package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetCloudSyncSettingResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncSettingResponse> CREATOR = new cpil();
    public final int a;
    public final boolean b;

    public GetCloudSyncSettingResponse(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
