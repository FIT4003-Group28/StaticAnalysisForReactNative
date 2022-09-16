package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TokenStatus extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenStatus> CREATOR = new cpbs();
    String a;
    int b;
    boolean c;

    public TokenStatus(String str, int i, boolean z) {
        this.a = str;
        this.b = i;
        this.c = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.g(parcel, 3, this.b);
        cnwn.e(parcel, 4, this.c);
        cnwn.c(parcel, d);
    }
}
