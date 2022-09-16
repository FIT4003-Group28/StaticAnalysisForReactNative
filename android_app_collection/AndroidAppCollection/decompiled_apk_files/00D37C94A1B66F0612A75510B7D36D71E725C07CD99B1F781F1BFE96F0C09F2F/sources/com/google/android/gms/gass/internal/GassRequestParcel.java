package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GassRequestParcel extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(11);
    public final int a;
    public final String b;
    public final String c;

    public GassRequestParcel(int i, String str, String str2) {
        this.a = i;
        this.b = str;
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.n(parcel, m);
    }
}
