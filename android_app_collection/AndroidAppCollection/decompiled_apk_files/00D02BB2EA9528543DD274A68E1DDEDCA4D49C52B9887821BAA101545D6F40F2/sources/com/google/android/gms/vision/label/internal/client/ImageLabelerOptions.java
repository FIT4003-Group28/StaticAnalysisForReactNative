package com.google.android.gms.vision.label.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class ImageLabelerOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator<ImageLabelerOptions> CREATOR = new cpgd();
    public int a;
    public int b;
    public float c;
    public int d;

    public ImageLabelerOptions(int i, int i2, float f, int i3) {
        if (i == 1) {
            this.a = 1;
            this.b = i2;
            this.c = f;
            this.d = i3;
            return;
        }
        throw new IllegalArgumentException("Unknown language.");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.i(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
