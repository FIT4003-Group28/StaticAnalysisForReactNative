package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class AccountInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<AccountInfo> CREATOR = new cozv();
    public String a;
    public String b;

    public AccountInfo(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof AccountInfo) {
            AccountInfo accountInfo = (AccountInfo) obj;
            if (cnvv.a(this.a, accountInfo.a) && cnvv.a(this.b, accountInfo.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("accountId", this.a);
        b.a("accountName", this.b);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.c(parcel, d);
    }
}
