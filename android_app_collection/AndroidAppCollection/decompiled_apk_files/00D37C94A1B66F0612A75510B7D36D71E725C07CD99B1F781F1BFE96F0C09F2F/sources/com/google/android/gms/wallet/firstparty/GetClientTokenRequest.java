package com.google.android.gms.wallet.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class GetClientTokenRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rwj(12);
    WalletCustomTheme a;
    boolean b;
    int c;

    GetClientTokenRequest() {
        this.c = 1;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.E(parcel, 2, this.a, i);
        tqj.o(parcel, 3, this.b);
        tqj.s(parcel, 4, this.c);
        tqj.n(parcel, m);
    }

    public GetClientTokenRequest(WalletCustomTheme walletCustomTheme, boolean z, int i) {
        this.a = walletCustomTheme;
        this.b = z;
        this.c = i;
        if (walletCustomTheme != null) {
            return;
        }
        throw new NullPointerException("WalletCustomTheme is required");
    }
}
