package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ChannelSendFileResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ChannelSendFileResponse> CREATOR = new cphu();
    public final int a;

    public ChannelSendFileResponse(int i) {
        this.a = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
