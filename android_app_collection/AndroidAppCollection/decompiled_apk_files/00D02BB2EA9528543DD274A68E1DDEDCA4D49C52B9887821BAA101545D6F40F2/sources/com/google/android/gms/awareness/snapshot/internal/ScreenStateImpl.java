package com.google.android.gms.awareness.snapshot.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ScreenStateImpl extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ScreenStateImpl> CREATOR = new cmvh();
    public final int a;

    public ScreenStateImpl(int i) {
        this.a = i;
    }

    public final String toString() {
        int i = this.a;
        return i == 1 ? "ScreenState: SCREEN_OFF" : i == 2 ? "ScreenState: SCREEN_ON" : "ScreenState: UNKNOWN";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.c(parcel, d);
    }
}
