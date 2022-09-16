package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.wearable.ConnectionConfiguration;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetConfigsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetConfigsResponse> CREATOR = new cpin();
    public final int a;
    public final ConnectionConfiguration[] b;

    public GetConfigsResponse(int i, ConnectionConfiguration[] connectionConfigurationArr) {
        this.a = i;
        this.b = connectionConfigurationArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.x(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
