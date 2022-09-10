package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class BadgeInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<BadgeInfo> CREATOR = new cozw();
    String a;
    byte[] b;
    int c;
    TokenStatus d;
    String e;
    TransactionInfo f;

    public BadgeInfo(String str, byte[] bArr, int i, TokenStatus tokenStatus, String str2, TransactionInfo transactionInfo) {
        this.a = str;
        this.b = bArr;
        this.c = i;
        this.d = tokenStatus;
        this.e = str2;
        this.f = transactionInfo;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof BadgeInfo) {
            BadgeInfo badgeInfo = (BadgeInfo) obj;
            if (this.c == badgeInfo.c && cnvv.a(this.a, badgeInfo.a) && Arrays.equals(this.b, badgeInfo.b) && cnvv.a(this.d, badgeInfo.d) && cnvv.a(this.e, badgeInfo.e) && cnvv.a(this.f, badgeInfo.f)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("clientTokenId", this.a);
        byte[] bArr = this.b;
        b.a("serverToken", bArr == null ? null : Arrays.toString(bArr));
        b.a("cardNetwork", Integer.valueOf(this.c));
        b.a("tokenStatus", this.d);
        b.a("tokenLastDigits", this.e);
        b.a("transactionInfo", this.f);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.l(parcel, 2, this.b, false);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.u(parcel, 6, this.f, i);
        cnwn.c(parcel, d);
    }
}
