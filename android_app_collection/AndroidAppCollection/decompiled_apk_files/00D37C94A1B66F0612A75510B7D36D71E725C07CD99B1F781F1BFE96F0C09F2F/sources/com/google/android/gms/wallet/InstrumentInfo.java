package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class InstrumentInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(3);
    public String a;
    public String b;
    private int c;

    private InstrumentInfo() {
    }

    public InstrumentInfo(String str, String str2, int i) {
        this.a = str;
        this.b = str2;
        this.c = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        int i2 = this.c;
        if (i2 != 1 && i2 != 2 && i2 != 3) {
            i2 = 0;
        }
        tqj.s(parcel, 4, i2);
        tqj.n(parcel, m);
    }
}
