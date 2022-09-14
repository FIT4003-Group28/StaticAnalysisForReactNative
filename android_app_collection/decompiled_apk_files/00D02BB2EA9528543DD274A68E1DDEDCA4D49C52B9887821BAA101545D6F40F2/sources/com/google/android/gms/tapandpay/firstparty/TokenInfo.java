package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TokenInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<TokenInfo> CREATOR = new cpav();
    String a;
    String b;
    int c;
    TokenStatus d;
    String e;
    Uri f;
    byte[] g;
    OnlineAccountCardLinkInfo[] h;
    int i;
    boolean j;

    public TokenInfo(String str, String str2, int i, TokenStatus tokenStatus, String str3, Uri uri, byte[] bArr, OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr, int i2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = tokenStatus;
        this.e = str3;
        this.f = uri;
        this.g = bArr;
        this.h = onlineAccountCardLinkInfoArr;
        this.i = i2;
        this.j = z;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof TokenInfo) {
            TokenInfo tokenInfo = (TokenInfo) obj;
            if (cnvv.a(this.a, tokenInfo.a) && cnvv.a(this.b, tokenInfo.b) && this.c == tokenInfo.c && cnvv.a(this.d, tokenInfo.d) && cnvv.a(this.e, tokenInfo.e) && cnvv.a(this.f, tokenInfo.f) && Arrays.equals(this.g, tokenInfo.g) && Arrays.equals(this.h, tokenInfo.h) && this.i == tokenInfo.i && this.j == tokenInfo.j) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.c), this.d, this.e, this.f, this.g, this.h, Integer.valueOf(this.i), Boolean.valueOf(this.j)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("billingCardId", this.a);
        b.a("displayName", this.b);
        b.a("cardNetwork", Integer.valueOf(this.c));
        b.a("tokenStatus", this.d);
        b.a("panLastDigits", this.e);
        b.a("cardImageUrl", this.f);
        byte[] bArr = this.g;
        String str = null;
        b.a("inAppCardToken", bArr == null ? null : Arrays.toString(bArr));
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.h;
        if (onlineAccountCardLinkInfoArr != null) {
            str = Arrays.toString(onlineAccountCardLinkInfoArr);
        }
        b.a("onlineAccountCardLinkInfos", str);
        b.a("tokenType", Integer.valueOf(this.i));
        b.a("supportsOdaTransit", Boolean.valueOf(this.j));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 1, this.a, false);
        cnwn.k(parcel, 2, this.b, false);
        cnwn.g(parcel, 3, this.c);
        cnwn.u(parcel, 4, this.d, i);
        cnwn.k(parcel, 5, this.e, false);
        cnwn.u(parcel, 6, this.f, i);
        cnwn.l(parcel, 7, this.g, false);
        cnwn.x(parcel, 8, this.h, i);
        cnwn.g(parcel, 9, this.i);
        cnwn.e(parcel, 10, this.j);
        cnwn.c(parcel, d);
    }
}
