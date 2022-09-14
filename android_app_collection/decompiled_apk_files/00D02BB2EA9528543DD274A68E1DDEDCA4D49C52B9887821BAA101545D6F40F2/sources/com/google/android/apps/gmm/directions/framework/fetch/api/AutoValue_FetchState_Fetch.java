package com.google.android.apps.gmm.directions.framework.fetch.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_FetchState_Fetch extends C$AutoValue_FetchState_Fetch {
    public static final Parcelable.Creator<AutoValue_FetchState_Fetch> CREATOR = new tgd();

    public AutoValue_FetchState_Fetch(tgk tgkVar, dbsg<bttq> dbsgVar) {
        super(tgkVar, dbsgVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a.name());
        parcel.writeSerializable(this.b);
    }
}
