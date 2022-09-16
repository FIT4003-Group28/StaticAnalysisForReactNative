package com.google.android.libraries.social.populous;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.libraries.social.populous.core.SourceIdentity;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_IdentityInfo extends C$AutoValue_IdentityInfo implements Parcelable {
    public static final Parcelable.Creator<AutoValue_IdentityInfo> CREATOR = new cxxr();

    public AutoValue_IdentityInfo(Parcel parcel) {
        super(dcdc.t((SourceIdentity[]) dcdc.t(parcel.readParcelableArray(SourceIdentity.class.getClassLoader())).toArray(new SourceIdentity[0])));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelableArray((Parcelable[]) this.a.toArray(new Parcelable[0]), 0);
    }

    public AutoValue_IdentityInfo(dcdc<SourceIdentity> dcdcVar) {
        super(dcdcVar);
    }
}
