package com.google.android.gms.mobiledataplan;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class WalletBalanceInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = new rra(8);
    public long a;
    public String b;
    public int c;
    public Long d;
    public String e;
    public String f;
    public Long g;
    public Long h;
    public Long i;
    public String j;

    private WalletBalanceInfo() {
    }

    public WalletBalanceInfo(long j, String str, int i, Long l, String str2, String str3, Long l2, Long l3, Long l4, String str4) {
        this.a = j;
        this.b = str;
        this.c = i;
        this.d = l;
        this.e = str2;
        this.f = str3;
        this.g = l2;
        this.h = l3;
        this.i = l4;
        this.j = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof WalletBalanceInfo) {
            WalletBalanceInfo walletBalanceInfo = (WalletBalanceInfo) obj;
            if (tnk.j(Long.valueOf(this.a), Long.valueOf(walletBalanceInfo.a)) && tnk.j(this.b, walletBalanceInfo.b) && tnk.j(Integer.valueOf(this.c), Integer.valueOf(walletBalanceInfo.c)) && tnk.j(this.d, walletBalanceInfo.d) && tnk.j(this.e, walletBalanceInfo.e) && tnk.j(this.f, walletBalanceInfo.f) && tnk.j(this.g, walletBalanceInfo.g) && tnk.j(this.h, walletBalanceInfo.h) && tnk.j(this.i, walletBalanceInfo.i) && tnk.j(this.j, walletBalanceInfo.j)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.a), this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, this.i, this.j});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.t(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.s(parcel, 3, this.c);
        tqj.D(parcel, 4, this.d);
        tqj.F(parcel, 5, this.e);
        tqj.F(parcel, 6, this.f);
        tqj.D(parcel, 7, this.g);
        tqj.D(parcel, 8, this.h);
        tqj.D(parcel, 9, this.i);
        tqj.F(parcel, 10, this.j);
        tqj.n(parcel, m);
    }
}
