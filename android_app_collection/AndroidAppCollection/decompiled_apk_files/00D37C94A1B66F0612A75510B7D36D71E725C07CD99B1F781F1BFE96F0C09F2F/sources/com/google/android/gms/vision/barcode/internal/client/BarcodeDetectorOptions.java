package com.google.android.gms.vision.barcode.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class BarcodeDetectorOptions extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ruc(19);
    public int a;
    public boolean b;

    public BarcodeDetectorOptions() {
    }

    public BarcodeDetectorOptions(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.o(parcel, 3, this.b);
        tqj.n(parcel, m);
    }
}
