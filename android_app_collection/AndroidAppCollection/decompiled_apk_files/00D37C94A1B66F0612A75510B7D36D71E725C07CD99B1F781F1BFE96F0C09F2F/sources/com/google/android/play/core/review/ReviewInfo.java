package com.google.android.play.core.review;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: PG */
/* loaded from: classes3.dex */
public abstract class ReviewInfo implements Parcelable {
    public static final Parcelable.Creator CREATOR = new aiqg(20);

    public static ReviewInfo b(PendingIntent pendingIntent) {
        return new AutoValue_ReviewInfo(pendingIntent);
    }

    public abstract PendingIntent a();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(a(), 0);
    }
}
