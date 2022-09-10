package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OpenChannelResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OpenChannelResponse> CREATOR = new cpji();
    public final int a;
    public final ChannelImpl b;

    public OpenChannelResponse(int i, ChannelImpl channelImpl) {
        this.a = i;
        this.b = channelImpl;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
