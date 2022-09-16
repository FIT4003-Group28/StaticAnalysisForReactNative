package com.google.android.gms.wallet;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
@Deprecated
/* loaded from: classes2.dex */
public final class ProxyCard extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(9);
    String a;
    String b;
    int c;
    int d;

    public ProxyCard(String str, String str2, int i, int i2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = i2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.s(parcel, 5, this.d);
        tqj.n(parcel, m);
    }
}
