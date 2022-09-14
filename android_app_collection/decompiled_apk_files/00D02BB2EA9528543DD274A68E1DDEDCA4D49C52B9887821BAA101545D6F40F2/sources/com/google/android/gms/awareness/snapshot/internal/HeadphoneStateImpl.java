package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class HeadphoneStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<HeadphoneStateImpl> CREATOR = new cmve();
    public final int a;

    public HeadphoneStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
