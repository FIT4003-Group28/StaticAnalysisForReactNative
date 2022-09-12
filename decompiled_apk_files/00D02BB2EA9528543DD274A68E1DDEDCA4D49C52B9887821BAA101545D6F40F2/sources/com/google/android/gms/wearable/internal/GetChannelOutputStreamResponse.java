package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetChannelOutputStreamResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetChannelOutputStreamResponse> CREATOR = new cpii();
    public final int a;
    @dzsi
    public final ParcelFileDescriptor b;

    public GetChannelOutputStreamResponse(int i, ParcelFileDescriptor parcelFileDescriptor) {
        this.a = i;
        this.b = parcelFileDescriptor;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
