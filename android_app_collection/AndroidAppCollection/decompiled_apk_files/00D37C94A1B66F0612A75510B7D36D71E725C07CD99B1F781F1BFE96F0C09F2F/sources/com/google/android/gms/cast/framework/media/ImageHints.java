package com.google.android.gms.cast.framework.media;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class ImageHints extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qjl(19);
    public final int a;
    public final int b;
    public final int c;

    public ImageHints(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.s(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
