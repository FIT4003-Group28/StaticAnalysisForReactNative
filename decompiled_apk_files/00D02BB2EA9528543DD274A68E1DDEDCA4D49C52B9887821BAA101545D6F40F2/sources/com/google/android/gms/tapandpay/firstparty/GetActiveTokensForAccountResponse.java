package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetActiveTokensForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetActiveTokensForAccountResponse> CREATOR = new cpad();
    TokenInfo[] a;

    public GetActiveTokensForAccountResponse(TokenInfo[] tokenInfoArr) {
        this.a = tokenInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 1, this.a, i);
        cnwn.c(parcel, d);
    }
}
