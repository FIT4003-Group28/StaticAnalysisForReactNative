package com.google.android.apps.gmm.directions.savedtrips.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.savedtrips.api.SavedTrip;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_SavedTrip extends C$AutoValue_SavedTrip {
    public static final Parcelable.Creator<AutoValue_SavedTrip> CREATOR = new wdm();

    public AutoValue_SavedTrip(String str, SavedTrip.Data data) {
        super(str, data);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
    }
}
