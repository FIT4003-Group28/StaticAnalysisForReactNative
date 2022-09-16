package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes2.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator CREATOR = new qhh(14);
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List list, String str2) {
        this.a = i;
        qnm.l(str);
        this.b = str;
        this.c = l;
        this.d = z;
        this.e = z2;
        this.f = list;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof TokenData)) {
            return false;
        }
        TokenData tokenData = (TokenData) obj;
        return TextUtils.equals(this.b, tokenData.b) && tnk.j(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && tnk.j(this.f, tokenData.f) && tnk.j(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int m = tqj.m(parcel);
        tqj.s(parcel, 1, this.a);
        tqj.F(parcel, 2, this.b);
        tqj.D(parcel, 3, this.c);
        tqj.o(parcel, 4, this.d);
        tqj.o(parcel, 5, this.e);
        tqj.H(parcel, 6, this.f);
        tqj.F(parcel, 7, this.g);
        tqj.n(parcel, m);
    }
}
