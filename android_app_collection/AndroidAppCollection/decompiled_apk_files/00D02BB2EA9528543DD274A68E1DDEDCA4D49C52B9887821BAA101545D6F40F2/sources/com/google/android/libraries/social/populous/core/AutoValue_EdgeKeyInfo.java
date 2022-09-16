package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_EdgeKeyInfo extends C$AutoValue_EdgeKeyInfo implements Parcelable {
    public static final Parcelable.Creator<AutoValue_EdgeKeyInfo> CREATOR = new cycv();

    public AutoValue_EdgeKeyInfo(Parcel parcel) {
        super(parcel.readString(), duej.b(parcel.readInt()));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.p);
    }

    public AutoValue_EdgeKeyInfo(String str, duej duejVar) {
        super(str, duejVar);
    }
}
