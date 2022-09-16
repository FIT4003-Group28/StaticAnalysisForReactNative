package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetActiveAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetActiveAccountResponse> CREATOR = new cpab();
    public AccountInfo a;

    public GetActiveAccountResponse(AccountInfo accountInfo) {
        this.a = accountInfo;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.u(parcel, 2, this.a, i);
        cnwn.c(parcel, d);
    }
}
