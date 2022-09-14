package com.google.android.libraries.social.populous.core;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AutoValue_AutocompletionCallbackMetadata extends C$AutoValue_AutocompletionCallbackMetadata implements Parcelable {
    public static final Parcelable.Creator<AutoValue_AutocompletionCallbackMetadata> CREATOR = new cyco();

    public AutoValue_AutocompletionCallbackMetadata(Parcel parcel) {
        super(new int[]{1, 2, 3, 4, 5}[parcel.readInt()], new int[]{1, 2, 3}[parcel.readInt()], cyds.values()[parcel.readInt()]);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b - 1);
        parcel.writeInt(this.c - 1);
        parcel.writeInt(this.a.ordinal());
    }

    public AutoValue_AutocompletionCallbackMetadata(int i, int i2, cyds cydsVar) {
        super(i, i2, cydsVar);
    }
}
