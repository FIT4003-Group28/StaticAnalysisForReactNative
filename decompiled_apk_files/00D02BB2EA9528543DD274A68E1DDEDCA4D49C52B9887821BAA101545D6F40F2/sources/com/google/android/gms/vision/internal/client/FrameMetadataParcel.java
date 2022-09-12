package com.google.android.gms.vision.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class FrameMetadataParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator<FrameMetadataParcel> CREATOR = new cpfv();
    public int a;
    public int b;
    public int c;
    public long d;
    public int e;

    public FrameMetadataParcel() {
    }

    public FrameMetadataParcel(int i, int i2, int i3, long j, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = i4;
    }

    public static FrameMetadataParcel a(cpfg cpfgVar) {
        FrameMetadataParcel frameMetadataParcel = new FrameMetadataParcel();
        cpff cpffVar = cpfgVar.a;
        frameMetadataParcel.a = cpffVar.a;
        frameMetadataParcel.b = cpffVar.b;
        frameMetadataParcel.e = 0;
        frameMetadataParcel.c = 0;
        frameMetadataParcel.d = 0L;
        return frameMetadataParcel;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.h(parcel, 5, this.d);
        cnwn.g(parcel, 6, this.e);
        cnwn.c(parcel, d);
    }
}
