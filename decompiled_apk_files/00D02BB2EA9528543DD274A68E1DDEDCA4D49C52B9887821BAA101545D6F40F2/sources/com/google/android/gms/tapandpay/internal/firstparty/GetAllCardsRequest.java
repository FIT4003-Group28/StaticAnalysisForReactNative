package com.google.android.gms.tapandpay.internal.firstparty;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetAllCardsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAllCardsRequest> CREATOR = new cpbm();
    boolean a;
    Account b;

    public GetAllCardsRequest(boolean z, Account account) {
        this.a = z;
        this.b = account;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.e(parcel, 2, this.a);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.c(parcel, d);
    }
}
