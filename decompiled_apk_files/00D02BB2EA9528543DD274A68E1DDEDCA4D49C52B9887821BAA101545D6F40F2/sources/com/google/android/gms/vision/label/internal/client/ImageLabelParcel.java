package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImageLabelParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageLabelParcel> CREATOR = new cpgc();
    public final String a;
    public final String b;
    public final float c;
    public final int d;

    public ImageLabelParcel(String str, String str2, float f, int i) {
        this.b = str2;
        this.c = f;
        this.a = str;
        this.d = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.i(parcel, 3, this.c);
        cnwn.k(parcel, 4, this.a, false);
        cnwn.g(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
