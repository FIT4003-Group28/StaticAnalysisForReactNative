package com.google.android.gms.signin.internal;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class AuthAccountResult extends AbstractSafeParcelable implements cnom {
    public static final Parcelable.Creator<AuthAccountResult> CREATOR = new cozc();
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

    @Override // defpackage.cnom
    public final Status a() {
        return this.b == 0 ? Status.a : Status.e;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.u(parcel, 3, this.c, i);
        cnwn.c(parcel, d);
    }
}
