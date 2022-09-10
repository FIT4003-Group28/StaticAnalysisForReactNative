package com.google.android.apps.gmm.directions.transitlinespace;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState extends C$AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState {
    public static final Parcelable.Creator<AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState> CREATOR = new ygv();

    public AutoValue_TransitLineSpaceFragment_LineSpaceFragmentInstanceState(@dzsi akqi akqiVar) {
        super(akqiVar);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        if (this.a == null) {
            parcel.writeInt(1);
            return;
        }
        parcel.writeInt(0);
        parcel.writeSerializable(this.a);
    }
}
