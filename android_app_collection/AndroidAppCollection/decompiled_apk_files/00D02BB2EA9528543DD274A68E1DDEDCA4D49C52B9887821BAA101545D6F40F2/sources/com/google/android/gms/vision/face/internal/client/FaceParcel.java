package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FaceParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceParcel> CREATOR = new cpfp();
    public final int a;
    public final int b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final LandmarkParcel[] j;
    public final float k;
    public final float l;
    public final float m;
    public final ContourParcel[] n;
    public final float o;

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, float f7, LandmarkParcel[] landmarkParcelArr, float f8, float f9, float f10, ContourParcel[] contourParcelArr, float f11) {
        this.a = i;
        this.b = i2;
        this.c = f;
        this.d = f2;
        this.e = f3;
        this.f = f4;
        this.g = f5;
        this.h = f6;
        this.i = f7;
        this.j = landmarkParcelArr;
        this.k = f8;
        this.l = f9;
        this.m = f10;
        this.n = contourParcelArr;
        this.o = f11;
    }

    public FaceParcel(int i, int i2, float f, float f2, float f3, float f4, float f5, float f6, LandmarkParcel[] landmarkParcelArr, float f7, float f8, float f9) {
        this(i, i2, f, f2, f3, f4, f5, f6, 0.0f, landmarkParcelArr, f7, f8, f9, new ContourParcel[0], -1.0f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.i(parcel, 3, this.c);
        cnwn.i(parcel, 4, this.d);
        cnwn.i(parcel, 5, this.e);
        cnwn.i(parcel, 6, this.f);
        cnwn.i(parcel, 7, this.g);
        cnwn.i(parcel, 8, this.h);
        cnwn.x(parcel, 9, this.j, i);
        cnwn.i(parcel, 10, this.k);
        cnwn.i(parcel, 11, this.l);
        cnwn.i(parcel, 12, this.m);
        cnwn.x(parcel, 13, this.n, i);
        cnwn.i(parcel, 14, this.i);
        cnwn.i(parcel, 15, this.o);
        cnwn.c(parcel, d);
    }
}
