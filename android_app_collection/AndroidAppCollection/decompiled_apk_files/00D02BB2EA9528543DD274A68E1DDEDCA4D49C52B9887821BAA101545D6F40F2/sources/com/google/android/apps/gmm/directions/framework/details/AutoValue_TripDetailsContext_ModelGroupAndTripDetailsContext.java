package com.google.android.apps.gmm.directions.framework.details;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext extends C$AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext {
    public static final Parcelable.Creator<AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext> CREATOR = new svg();

    public AutoValue_TripDetailsContext_ModelGroupAndTripDetailsContext(String str, dbsg<Integer> dbsgVar) {
        super(str, dbsgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeSerializable(this.b);
    }
}
