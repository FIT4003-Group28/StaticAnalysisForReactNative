package com.google.android.gms.car;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class DrawingSpec extends AbstractSafeParcelable {
    public static final Parcelable.Creator<DrawingSpec> CREATOR = new cmxf();
    public int a;
    public int b;
    public int c;
    public Surface d;
    public Rect e;

    public DrawingSpec(int i, int i2, int i3, Surface surface, Rect rect) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = surface;
        this.e = rect;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.u(parcel, 5, this.e, i);
        cnwn.c(parcel, d);
    }
}
