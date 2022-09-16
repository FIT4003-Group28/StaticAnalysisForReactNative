package com.google.android.gms.ads.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class VideoOptionsParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new pva(16);
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public VideoOptionsParcel(aitu aituVar, byte[] bArr) {
        this(aituVar.a, aituVar.c, aituVar.b);
    }

    public VideoOptionsParcel(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.o(parcel, 2, this.a);
        tqj.o(parcel, 3, this.b);
        tqj.o(parcel, 4, this.c);
        tqj.n(parcel, m);
    }
}
