package com.google.android.gms.googlehelp.internal.common;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class OverflowMenuItem extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new qxv(18);
    final int a;
    final String b;
    final Intent c;

    public OverflowMenuItem(int i, String str, Intent intent) {
        this.a = i;
        this.b = str;
        this.c = intent;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.E(parcel, 4, this.c, i);
        tqj.n(parcel, m);
    }
}
