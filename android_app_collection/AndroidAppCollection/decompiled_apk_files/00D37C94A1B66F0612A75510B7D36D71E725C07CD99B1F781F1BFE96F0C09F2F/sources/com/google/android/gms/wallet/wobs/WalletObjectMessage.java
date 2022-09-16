package com.google.android.gms.wallet.wobs;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WalletObjectMessage extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rxi(7);
    String a;
    String b;
    TimeInterval c;
    @Deprecated
    UriData d;
    @Deprecated
    UriData e;

    WalletObjectMessage() {
    }

    public WalletObjectMessage(String str, String str2, TimeInterval timeInterval, UriData uriData, UriData uriData2) {
        this.a = str;
        this.b = str2;
        this.c = timeInterval;
        this.d = uriData;
        this.e = uriData2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.F(parcel, 2, this.a);
        tqj.F(parcel, 3, this.b);
        tqj.E(parcel, 4, this.c, i);
        tqj.E(parcel, 5, this.d, i);
        tqj.E(parcel, 6, this.e, i);
        tqj.n(parcel, m);
    }
}
