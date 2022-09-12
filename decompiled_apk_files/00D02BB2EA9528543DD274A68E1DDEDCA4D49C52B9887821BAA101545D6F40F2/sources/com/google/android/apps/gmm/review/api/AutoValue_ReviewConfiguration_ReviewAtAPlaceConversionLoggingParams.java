package com.google.android.apps.gmm.review.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams extends C$AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams {
    public static final Parcelable.Creator<AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams> CREATOR = new bqit();

    public AutoValue_ReviewConfiguration_ReviewAtAPlaceConversionLoggingParams(ckdw ckdwVar) {
        super(ckdwVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
    }
}
