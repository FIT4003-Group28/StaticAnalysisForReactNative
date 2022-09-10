package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetActiveCardsForAccountResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetActiveCardsForAccountResponse> CREATOR = new cpac();
    CardInfo[] a;

    public GetActiveCardsForAccountResponse(CardInfo[] cardInfoArr) {
        this.a = cardInfoArr;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 2, this.a, i);
        cnwn.c(parcel, d);
    }
}
