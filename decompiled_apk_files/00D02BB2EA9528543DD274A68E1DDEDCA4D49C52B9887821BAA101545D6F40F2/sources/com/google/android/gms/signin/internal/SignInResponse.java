package com.google.android.gms.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SignInResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SignInResponse> CREATOR = new cozk();
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
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.u(parcel, 2, this.b, i);
        cnwn.u(parcel, 3, this.c, i);
        cnwn.c(parcel, d);
    }
}
