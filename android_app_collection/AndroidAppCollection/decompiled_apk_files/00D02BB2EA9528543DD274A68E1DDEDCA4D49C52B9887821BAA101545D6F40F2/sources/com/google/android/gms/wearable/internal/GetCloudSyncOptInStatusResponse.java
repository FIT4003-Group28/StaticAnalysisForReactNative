package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetCloudSyncOptInStatusResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetCloudSyncOptInStatusResponse> CREATOR = new cpik();
    public final int a;
    public final boolean b;
    public final boolean c;

    public GetCloudSyncOptInStatusResponse(int i, boolean z, boolean z2) {
        this.a = i;
        this.b = z;
        this.c = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.e(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
