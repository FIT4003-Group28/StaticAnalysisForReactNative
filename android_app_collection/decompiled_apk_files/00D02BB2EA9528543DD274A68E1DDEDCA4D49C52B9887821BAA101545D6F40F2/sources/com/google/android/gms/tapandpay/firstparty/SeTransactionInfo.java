package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.math.BigDecimal;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class SeTransactionInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<SeTransactionInfo> CREATOR = new cpau();
    long a;
    BigDecimal b;
    String c;
    long d;
    int e;

    public SeTransactionInfo(long j, BigDecimal bigDecimal, String str, long j2, int i) {
        this.a = j;
        this.b = bigDecimal;
        this.c = str;
        this.d = j2;
        this.e = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof SeTransactionInfo) {
            SeTransactionInfo seTransactionInfo = (SeTransactionInfo) obj;
            if (this.a == seTransactionInfo.a && cnvv.a(this.b, seTransactionInfo.b) && cnvv.a(this.c, seTransactionInfo.c) && this.d == seTransactionInfo.d && this.e == seTransactionInfo.e) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("transactionId", Long.valueOf(this.a));
        b.a("amount", this.b);
        b.a("currency", this.c);
        b.a("transactionTimeMillis", Long.valueOf(this.d));
        b.a("type", Integer.valueOf(this.e));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.h(parcel, 1, this.a);
        BigDecimal bigDecimal = this.b;
        if (bigDecimal != null) {
            int b = cnwn.b(parcel, 2);
            parcel.writeByteArray(bigDecimal.unscaledValue().toByteArray());
            parcel.writeInt(bigDecimal.scale());
            cnwn.c(parcel, b);
        }
        cnwn.k(parcel, 3, this.c, false);
        cnwn.h(parcel, 4, this.d);
        cnwn.g(parcel, 5, this.e);
        cnwn.c(parcel, d);
    }
}
