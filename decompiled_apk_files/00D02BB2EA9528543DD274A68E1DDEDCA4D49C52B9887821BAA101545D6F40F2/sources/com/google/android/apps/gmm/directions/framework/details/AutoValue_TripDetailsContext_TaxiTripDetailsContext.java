package com.google.android.apps.gmm.directions.framework.details;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_TripDetailsContext_TaxiTripDetailsContext extends C$AutoValue_TripDetailsContext_TaxiTripDetailsContext {
    public static final Parcelable.Creator<AutoValue_TripDetailsContext_TaxiTripDetailsContext> CREATOR = new svh();

    public AutoValue_TripDetailsContext_TaxiTripDetailsContext(String str, Integer num) {
        super(str, num);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.intValue());
    }
}
