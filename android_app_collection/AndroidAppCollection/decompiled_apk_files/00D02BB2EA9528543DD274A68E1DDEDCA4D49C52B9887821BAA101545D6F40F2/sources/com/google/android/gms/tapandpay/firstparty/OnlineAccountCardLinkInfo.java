package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class OnlineAccountCardLinkInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<OnlineAccountCardLinkInfo> CREATOR = new cpaq();
    int a;
    int b;

    public OnlineAccountCardLinkInfo(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof OnlineAccountCardLinkInfo) {
            OnlineAccountCardLinkInfo onlineAccountCardLinkInfo = (OnlineAccountCardLinkInfo) obj;
            if (cnvv.a(Integer.valueOf(this.a), Integer.valueOf(onlineAccountCardLinkInfo.a)) && cnvv.a(Integer.valueOf(this.b), Integer.valueOf(onlineAccountCardLinkInfo.b))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Integer.valueOf(this.b)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("accountType", Integer.valueOf(this.a));
        b.a("status", Integer.valueOf(this.b));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.g(parcel, 2, this.b);
        cnwn.c(parcel, d);
    }
}
