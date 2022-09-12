package com.google.commerce.tapandpay.android.seclient;

import android.os.Parcel;
import android.os.Parcelable;
import java.math.BigDecimal;
/* compiled from: PG */
@Deprecated
/* loaded from: classes5.dex */
public final class GetSeCardBalanceResponse implements Parcelable {
    public static final Parcelable.Creator<GetSeCardBalanceResponse> CREATOR = new dbom();
    public final BigDecimal a;
    public final int b;

    public GetSeCardBalanceResponse(Parcel parcel) {
        this.a = (BigDecimal) parcel.readSerializable();
        this.b = dbon.a()[parcel.readInt()];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.a);
        int i2 = this.b;
        int i3 = i2 - 1;
        if (i2 != 0) {
            parcel.writeInt(i3);
            return;
        }
        throw null;
    }

    public GetSeCardBalanceResponse(int i, BigDecimal bigDecimal) {
        this.b = 5;
        this.a = bigDecimal;
        String valueOf = String.valueOf(bigDecimal);
        StringBuilder sb = new StringBuilder("ERROR_PERMISSION_DENIED".length() + 18 + String.valueOf(valueOf).length());
        sb.append("Status: ");
        sb.append("ERROR_PERMISSION_DENIED");
        sb.append(" Balance: ");
        sb.append(valueOf);
        sb.toString();
    }
}
