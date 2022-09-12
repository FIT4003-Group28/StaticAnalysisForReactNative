package com.google.android.apps.gmm.ugc.intent;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_ReviewIntent_MinimalPlacemark extends C$AutoValue_ReviewIntent_MinimalPlacemark {
    public static final Parcelable.Creator<AutoValue_ReviewIntent_MinimalPlacemark> CREATOR = new ccei();

    public AutoValue_ReviewIntent_MinimalPlacemark(String str, String str2, boolean z) {
        super(str, str2, z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c ? 1 : 0);
    }
}
