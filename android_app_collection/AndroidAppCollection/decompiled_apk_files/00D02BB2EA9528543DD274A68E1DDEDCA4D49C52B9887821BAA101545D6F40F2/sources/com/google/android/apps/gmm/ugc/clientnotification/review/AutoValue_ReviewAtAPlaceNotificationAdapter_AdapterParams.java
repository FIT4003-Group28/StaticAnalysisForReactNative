package com.google.android.apps.gmm.ugc.clientnotification.review;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams extends C$AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams {
    public static final Parcelable.Creator<AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams> CREATOR = new bzun();

    public AutoValue_ReviewAtAPlaceNotificationAdapter_AdapterParams(long j, String str, String str2, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<bzvt> dbsgVar4, dbsg<bzvt> dbsgVar5, boolean z, boolean z2, boolean z3, int i, dbsg<byte[]> dbsgVar6, dbsg<byte[]> dbsgVar7, boolean z4) {
        super(j, str, str2, dbsgVar, dbsgVar2, dbsgVar3, dbsgVar4, dbsgVar5, z, z2, z3, i, dbsgVar6, dbsgVar7, z4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
        parcel.writeSerializable(this.f);
        parcel.writeSerializable(this.g);
        parcel.writeSerializable(this.h);
        parcel.writeInt(this.i ? 1 : 0);
        parcel.writeInt(this.j ? 1 : 0);
        parcel.writeInt(this.k ? 1 : 0);
        parcel.writeInt(this.l);
        parcel.writeSerializable(this.m);
        parcel.writeSerializable(this.n);
        parcel.writeInt(this.o ? 1 : 0);
    }
}
