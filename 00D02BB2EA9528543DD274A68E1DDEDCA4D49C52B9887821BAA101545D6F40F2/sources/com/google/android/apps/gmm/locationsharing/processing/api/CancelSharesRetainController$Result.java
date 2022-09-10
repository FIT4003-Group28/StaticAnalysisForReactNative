package com.google.android.apps.gmm.locationsharing.processing.api;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public abstract class CancelSharesRetainController$Result implements Parcelable {
    public static CancelSharesRetainController$Result c(int i, dqzv dqzvVar) {
        return new AutoValue_CancelSharesRetainController_Result(i, dqzvVar);
    }

    public abstract int a();

    public abstract dqzv b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(a());
        parcel.writeByteArray(b().bS());
    }
}
