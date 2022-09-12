package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CardRewardsInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<CardRewardsInfo> CREATOR = new cozy();
    long a;
    String b;
    String c;
    String d;
    String e;

    public CardRewardsInfo(long j, String str, String str2, String str3, String str4) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = str3;
        this.e = str4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardRewardsInfo) {
            CardRewardsInfo cardRewardsInfo = (CardRewardsInfo) obj;
            if (cnvv.a(Long.valueOf(this.a), Long.valueOf(cardRewardsInfo.a)) && cnvv.a(this.b, cardRewardsInfo.b) && cnvv.a(this.c, cardRewardsInfo.c) && cnvv.a(this.d, cardRewardsInfo.d) && cnvv.a(this.e, cardRewardsInfo.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, this.c, this.d, this.e});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("expirationTimestamp", Long.valueOf(this.a));
        b.a("websiteUrl", this.b);
        b.a("websiteRedirectText", this.c);
        b.a("legalDisclaimer", this.d);
        b.a("summary", this.e);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.h(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.c(parcel, d);
    }
}
