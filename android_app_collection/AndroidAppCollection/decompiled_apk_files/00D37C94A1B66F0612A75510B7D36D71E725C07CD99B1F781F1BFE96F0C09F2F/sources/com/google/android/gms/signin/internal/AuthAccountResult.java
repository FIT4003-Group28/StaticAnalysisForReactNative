package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements qte {
    public static final Parcelable.Creator CREATOR = new ruc(1);
    final int a;
    public int b;
    public Intent c;

    public AuthAccountResult() {
        this(2, 0, null);
    }

    public AuthAccountResult(int i, int i2, Intent intent) {
        this.a = i;
        this.b = i2;
        this.c = intent;
    }

    @Override // defpackage.qte
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.s(parcel, 2, this.b);
        tqj.E(parcel, 3, this.c, i);
        tqj.n(parcel, m);
    }
}
