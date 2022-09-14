package com.google.android.apps.gmm.directions.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.contrib.android.ProtoParsers$ParcelableProto;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_GmmNotice extends C$AutoValue_GmmNotice {
    public static final Parcelable.Creator<AutoValue_GmmNotice> CREATOR = new qac();

    public AutoValue_GmmNotice(ProtoParsers$ParcelableProto<dozz> protoParsers$ParcelableProto, @dzsi ProtoParsers$ParcelableProto<dwag> protoParsers$ParcelableProto2) {
        super(protoParsers$ParcelableProto, protoParsers$ParcelableProto2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeParcelable(this.b, i);
    }
}
