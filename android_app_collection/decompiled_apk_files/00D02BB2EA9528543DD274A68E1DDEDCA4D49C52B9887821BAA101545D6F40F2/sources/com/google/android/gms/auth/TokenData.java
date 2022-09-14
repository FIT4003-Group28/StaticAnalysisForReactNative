package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TokenData extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<TokenData> CREATOR = new cmrk();
    final int a;
    public final String b;
    public final Long c;
    public final boolean d;
    public final boolean e;
    public final List<String> f;
    public final String g;

    public TokenData(int i, String str, Long l, boolean z, boolean z2, List<String> list, String str2) {
        this.a = i;
        cnwc.l(str);
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
        return TextUtils.equals(this.b, tokenData.b) && cnvv.a(this.c, tokenData.c) && this.d == tokenData.d && this.e == tokenData.e && cnvv.a(this.f, tokenData.f) && cnvv.a(this.g, tokenData.g);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, Boolean.valueOf(this.d), Boolean.valueOf(this.e), this.f, this.g});
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.a);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.t(parcel, 3, this.c);
        cnwn.e(parcel, 4, this.d);
        cnwn.e(parcel, 5, this.e);
        cnwn.w(parcel, 6, this.f);
        cnwn.k(parcel, 7, this.g, false);
        cnwn.c(parcel, d);
    }
}
