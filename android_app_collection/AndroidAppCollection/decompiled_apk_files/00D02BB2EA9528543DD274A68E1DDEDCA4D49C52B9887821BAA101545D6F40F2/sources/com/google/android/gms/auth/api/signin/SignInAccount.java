package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<SignInAccount> CREATOR = new cmtl();
    @Deprecated
    String a;
    public GoogleSignInAccount b;
    @Deprecated
    String c;

    public SignInAccount(String str, GoogleSignInAccount googleSignInAccount, String str2) {
        this.b = googleSignInAccount;
        cnwc.m(str, "8.3 and 8.4 SDKs require non-null email");
        this.a = str;
        cnwc.m(str2, "8.3 and 8.4 SDKs require non-null userId");
        this.c = str2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 4, this.a, false);
        cnwn.u(parcel, 7, this.b, i);
        cnwn.k(parcel, 8, this.c, false);
        cnwn.c(parcel, d);
    }
}
