package com.google.android.gms.gass.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ProgramRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(13);
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final int e;

    public ProgramRequest(int i, int i2, int i3, String str, String str2) {
        this.a = i;
        this.b = i2;
        this.c = str;
        this.d = str2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.F(parcel, 3, this.c);
        tqj.F(parcel, 4, this.d);
        tqj.s(parcel, 5, this.e);
        tqj.n(parcel, m);
    }
}
