package com.google.android.apps.gmm.inappsurvey;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl extends C$AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl {
    public static final Parcelable.Creator<AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl> CREATOR = new aeze();

    public AutoValue_InAppSurveyVeneerImpl_SurveyDataImpl(Intent intent) {
        super(intent);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }
}
