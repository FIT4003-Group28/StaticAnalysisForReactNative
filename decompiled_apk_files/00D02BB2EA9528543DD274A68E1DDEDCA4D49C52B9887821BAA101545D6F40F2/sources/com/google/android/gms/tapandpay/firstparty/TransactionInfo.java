package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TransactionInfo> CREATOR = new cpay();
    int a;
    int b;
    int c;
    int d;

    public TransactionInfo(int i, int i2, int i3, int i4) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TransactionInfo) {
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            if (this.a == transactionInfo.a && this.b == transactionInfo.b && this.c == transactionInfo.c && this.d == transactionInfo.d) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.c), Integer.valueOf(this.d)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("transactionDelivery", Integer.valueOf(this.a));
        b.a("transactionLimit", Integer.valueOf(this.b));
        b.a("supportedTransactions", Integer.valueOf(this.c));
        b.a("deliveryPreference", Integer.valueOf(this.d));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 2, this.a);
        cnwn.g(parcel, 3, this.b);
        cnwn.g(parcel, 4, this.c);
        cnwn.g(parcel, 5, this.d);
        cnwn.c(parcel, d);
    }
}
