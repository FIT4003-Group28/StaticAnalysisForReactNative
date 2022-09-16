package com.google.android.apps.gmm.directions.framework.fetch.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.gmm.directions.framework.fetch.api.FetchState;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_FetchState extends C$AutoValue_FetchState {
    public static final Parcelable.Creator<AutoValue_FetchState> CREATOR = new tgc();

    public AutoValue_FetchState(FetchState.Fetch fetch) {
        super(fetch);
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
