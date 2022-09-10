package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GetAllCardsResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator<GetAllCardsResponse> CREATOR = new cpae();
    public CardInfo[] a;
    public AccountInfo b;
    public String c;
    String d;
    SparseArray<String> e;

    public GetAllCardsResponse(CardInfo[] cardInfoArr, AccountInfo accountInfo, String str, String str2, SparseArray<String> sparseArray) {
        this.a = cardInfoArr;
        this.b = accountInfo;
        this.c = str;
        this.d = str2;
        this.e = sparseArray;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.x(parcel, 2, this.a, i);
        cnwn.u(parcel, 3, this.b, i);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        SparseArray<String> sparseArray = this.e;
        if (sparseArray != null) {
            int b = cnwn.b(parcel, 6);
            int size = sparseArray.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                parcel.writeInt(sparseArray.keyAt(i2));
                parcel.writeString(sparseArray.valueAt(i2));
            }
            cnwn.c(parcel, b);
        }
        cnwn.c(parcel, d);
    }
}
