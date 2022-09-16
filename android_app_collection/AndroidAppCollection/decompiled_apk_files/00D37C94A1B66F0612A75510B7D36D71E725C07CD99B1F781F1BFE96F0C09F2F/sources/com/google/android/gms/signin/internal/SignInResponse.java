package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new ruc(3);
    final int a;
    public final ConnectionResult b;
    public final ResolveAccountResponse c;

    public SignInResponse(int i, ConnectionResult connectionResult, ResolveAccountResponse resolveAccountResponse) {
        this.a = i;
        this.b = connectionResult;
        this.c = resolveAccountResponse;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.E(parcel, 2, this.b, i);
        tqj.E(parcel, 3, this.c, i);
        tqj.n(parcel, m);
    }
}
