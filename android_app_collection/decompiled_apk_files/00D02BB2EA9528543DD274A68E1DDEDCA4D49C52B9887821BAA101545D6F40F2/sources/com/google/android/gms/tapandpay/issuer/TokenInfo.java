package com.google.android.gms.tapandpay.issuer;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new cpbr();
    final String a;
    final String b;
    final String c;
    final String d;
    final int e;
    final int f;
    final int g;
    final boolean h;
    final String i;

    public TokenInfo(String str, String str2, String str3, String str4, int i, int i2, int i3, boolean z, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = i;
        this.f = i2;
        this.g = i3;
        this.h = z;
        this.i = str5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.k(parcel, 3, this.c, false);
        cnwn.k(parcel, 4, this.d, false);
        cnwn.g(parcel, 5, this.e);
        cnwn.g(parcel, 6, this.f);
        cnwn.g(parcel, 7, this.g);
        cnwn.e(parcel, 8, this.h);
        cnwn.k(parcel, 9, this.i, false);
        cnwn.c(parcel, d);
    }
}
