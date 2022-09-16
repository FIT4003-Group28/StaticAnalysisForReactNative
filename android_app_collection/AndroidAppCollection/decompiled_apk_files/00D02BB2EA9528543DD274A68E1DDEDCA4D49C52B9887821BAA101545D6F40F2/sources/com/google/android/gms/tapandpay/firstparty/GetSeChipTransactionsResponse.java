package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GetSeChipTransactionsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetSeChipTransactionsResponse> CREATOR = new cpak();
    List<SeTransactionInfo> a;

    public GetSeChipTransactionsResponse(List<SeTransactionInfo> list) {
        this.a = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.y(parcel, 1, this.a);
        cnwn.c(parcel, d);
    }
}
