package com.google.android.apps.gmm.locationsharing.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_Profile extends C$AutoValue_Profile {
    public static final Parcelable.Creator<AutoValue_Profile> CREATOR = new ahvd();

    public AutoValue_Profile(PersonId personId, dbsg<String> dbsgVar, dbsg<String> dbsgVar2, dbsg<String> dbsgVar3, dbsg<String> dbsgVar4) {
        super(personId, dbsgVar, dbsgVar2, dbsgVar3, dbsgVar4);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        parcel.writeSerializable(this.b);
        parcel.writeSerializable(this.c);
        parcel.writeSerializable(this.d);
        parcel.writeSerializable(this.e);
    }
}
