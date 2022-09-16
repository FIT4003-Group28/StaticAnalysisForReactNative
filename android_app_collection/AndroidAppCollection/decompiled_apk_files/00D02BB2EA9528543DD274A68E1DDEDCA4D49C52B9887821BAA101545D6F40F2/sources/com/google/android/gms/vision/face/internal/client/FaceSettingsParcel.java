package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FaceSettingsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FaceSettingsParcel> CREATOR = new cpfq();
    public int a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public float f;

    public FaceSettingsParcel() {
    }

    public FaceSettingsParcel(int i, int i2, int i3, boolean z, boolean z2, float f) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = z;
        this.e = z2;
        this.f = f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.e(parcel, 5, this.d);
        cnwn.e(parcel, 6, this.e);
        cnwn.i(parcel, 7, this.f);
        cnwn.c(parcel, d);
    }
}
