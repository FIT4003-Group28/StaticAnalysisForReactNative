package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class LandmarkParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<LandmarkParcel> CREATOR = new cpft();
    public final int a;
    public final float b;
    public final float c;
    public final int d;

    public LandmarkParcel(int i, float f, float f2, int i2) {
        this.a = i;
        this.b = f;
        this.c = f2;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.i(parcel, 2, this.b);
        cnwn.i(parcel, 3, this.c);
        cnwn.g(parcel, 4, this.d);
        cnwn.c(parcel, d);
    }
}
