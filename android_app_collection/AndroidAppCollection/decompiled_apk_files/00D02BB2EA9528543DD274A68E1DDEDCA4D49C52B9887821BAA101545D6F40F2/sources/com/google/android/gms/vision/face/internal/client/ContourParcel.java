package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ContourParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ContourParcel> CREATOR = new cpfn();
    public final PointF[] a;
    public final int b;

    public ContourParcel(PointF[] pointFArr, int i) {
        this.a = pointFArr;
        this.b = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 2, this.a, i);
        cnwn.g(parcel, 3, this.b);
        cnwn.c(parcel, d);
    }
}
