package com.google.android.apps.gmm.directions.savedtrips.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SavedTrip_Data extends C$AutoValue_SavedTrip_Data {
    public static final Parcelable.Creator<AutoValue_SavedTrip_Data> CREATOR = new wdn();

    public AutoValue_SavedTrip_Data(amvh amvhVar, amvh amvhVar2, dqvj dqvjVar, int i, dspd dspdVar, dbsg<dcdc<dspd>> dbsgVar, int i2) {
        super(amvhVar, amvhVar2, dqvjVar, i, dspdVar, dbsgVar, i2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(this.a);
        }
        parcel.writeSerializable(this.b);
        parcel.writeString(this.c.name());
        parcel.writeString(wds.a(this.f));
        if (this.d == null) {
            parcel.writeInt(1);
        } else {
            parcel.writeInt(0);
            parcel.writeSerializable(this.d);
        }
        parcel.writeSerializable(this.e);
        int i2 = this.g;
        parcel.writeString(i2 != 1 ? i2 != 2 ? "TRANSPORTATION_TAB_SUGGESTION" : "DIRECTIONS_SAVED_TRIPS" : "UNKNOWN_GENERATING_FEATURE");
    }
}
