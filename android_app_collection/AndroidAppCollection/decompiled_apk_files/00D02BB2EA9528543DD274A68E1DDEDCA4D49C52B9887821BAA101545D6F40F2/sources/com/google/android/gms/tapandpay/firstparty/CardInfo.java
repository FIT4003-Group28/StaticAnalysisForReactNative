package com.google.android.gms.tapandpay.firstparty;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class CardInfo extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<CardInfo> CREATOR = new cozx();
    long A;
    long B;
    boolean C;
    long D;
    String E;
    String F;
    CardRewardsInfo G;
    int H;
    public String a;
    byte[] b;
    String c;
    public String d;
    int e;
    TokenStatus f;
    String g;
    Uri h;
    int i;
    int j;
    IssuerInfo k;
    String l;
    TransactionInfo m;
    String n;
    byte[] o;
    int p;
    int q;
    int r;
    InStoreCvmConfig s;
    InAppCvmConfig t;
    String u;
    OnlineAccountCardLinkInfo[] v;
    boolean w;
    List<BadgeInfo> x;
    boolean y;
    boolean z;

    static {
        dcep.C(10, 9);
    }

    public CardInfo(String str, byte[] bArr, String str2, String str3, int i, TokenStatus tokenStatus, String str4, Uri uri, int i2, int i3, IssuerInfo issuerInfo, String str5, TransactionInfo transactionInfo, String str6, byte[] bArr2, int i4, int i5, int i6, InStoreCvmConfig inStoreCvmConfig, InAppCvmConfig inAppCvmConfig, String str7, OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr, boolean z, List<BadgeInfo> list, boolean z2, boolean z3, long j, long j2, boolean z4, long j3, String str8, String str9, CardRewardsInfo cardRewardsInfo, int i7) {
        this.a = str;
        this.b = bArr;
        this.c = str2;
        this.d = str3;
        this.e = i;
        this.f = tokenStatus;
        this.g = str4;
        this.h = uri;
        this.i = i2;
        this.j = i3;
        this.k = issuerInfo;
        this.l = str5;
        this.m = transactionInfo;
        this.n = str6;
        this.o = bArr2;
        this.p = i4;
        this.q = i5;
        this.r = i6;
        this.s = inStoreCvmConfig;
        this.t = inAppCvmConfig;
        this.u = str7;
        this.v = onlineAccountCardLinkInfoArr;
        this.w = z;
        this.x = list;
        this.y = z2;
        this.z = z3;
        this.A = j;
        this.B = j2;
        this.C = z4;
        this.D = j3;
        this.E = str8;
        this.F = str9;
        this.G = cardRewardsInfo;
        this.H = i7;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof CardInfo) {
            CardInfo cardInfo = (CardInfo) obj;
            if (cnvv.a(this.a, cardInfo.a) && Arrays.equals(this.b, cardInfo.b) && cnvv.a(this.c, cardInfo.c) && cnvv.a(this.d, cardInfo.d) && this.e == cardInfo.e && cnvv.a(this.f, cardInfo.f) && cnvv.a(this.g, cardInfo.g) && cnvv.a(this.h, cardInfo.h) && this.i == cardInfo.i && this.j == cardInfo.j && cnvv.a(this.k, cardInfo.k) && cnvv.a(this.l, cardInfo.l) && cnvv.a(this.m, cardInfo.m) && this.p == cardInfo.p && this.q == cardInfo.q && this.r == cardInfo.r && cnvv.a(this.s, cardInfo.s) && cnvv.a(this.t, cardInfo.t) && cnvv.a(this.u, cardInfo.u) && Arrays.equals(this.v, cardInfo.v) && this.w == cardInfo.w && cnvv.a(this.x, cardInfo.x) && this.y == cardInfo.y && this.z == cardInfo.z && this.A == cardInfo.A && this.C == cardInfo.C && this.D == cardInfo.D && cnvv.a(this.E, cardInfo.E) && cnvv.a(this.F, cardInfo.F) && cnvv.a(this.G, cardInfo.G) && this.H == cardInfo.H) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, Integer.valueOf(this.e), this.f, this.g, this.h, Integer.valueOf(this.i), Integer.valueOf(this.j), this.l, this.m, Integer.valueOf(this.p), Integer.valueOf(this.q), Integer.valueOf(this.r), this.s, this.t, this.u, this.v, Boolean.valueOf(this.w), this.x, Boolean.valueOf(this.y), Boolean.valueOf(this.z), Long.valueOf(this.A), Boolean.valueOf(this.C), Long.valueOf(this.D), this.E, this.F, this.G, Integer.valueOf(this.H)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("billingCardId", this.a);
        byte[] bArr = this.b;
        String str = null;
        b.a("serverToken", bArr == null ? null : Arrays.toString(bArr));
        b.a("cardholderName", this.c);
        b.a("displayName", this.d);
        b.a("cardNetwork", Integer.valueOf(this.e));
        b.a("tokenStatus", this.f);
        b.a("panLastDigits", this.g);
        b.a("cardImageUrl", this.h);
        b.a("cardColor", Integer.valueOf(this.i));
        b.a("overlayTextColor", Integer.valueOf(this.j));
        IssuerInfo issuerInfo = this.k;
        b.a("issuerInfo", issuerInfo == null ? null : issuerInfo.toString());
        b.a("tokenLastDigits", this.l);
        b.a("transactionInfo", this.m);
        byte[] bArr2 = this.o;
        b.a("inAppCardToken", bArr2 == null ? null : Arrays.toString(bArr2));
        b.a("cachedEligibility", Integer.valueOf(this.p));
        b.a("paymentProtocol", Integer.valueOf(this.q));
        b.a("tokenType", Integer.valueOf(this.r));
        b.a("inStoreCvmConfig", this.s);
        b.a("inAppCvmConfig", this.t);
        b.a("tokenDisplayName", this.u);
        OnlineAccountCardLinkInfo[] onlineAccountCardLinkInfoArr = this.v;
        if (onlineAccountCardLinkInfoArr != null) {
            str = Arrays.toString(onlineAccountCardLinkInfoArr);
        }
        b.a("onlineAccountCardLinkInfos", str);
        b.a("allowAidSelection", Boolean.valueOf(this.w));
        String join = TextUtils.join(", ", this.x);
        StringBuilder sb = new StringBuilder(String.valueOf(join).length() + 2);
        sb.append('[');
        sb.append(join);
        sb.append(']');
        b.a("badges", sb.toString());
        b.a("upgradeAvailable", Boolean.valueOf(this.y));
        b.a("requiresSignature", Boolean.valueOf(this.z));
        b.a("googleTokenId", Long.valueOf(this.A));
        b.a("isTransit", Boolean.valueOf(this.C));
        b.a("googleWalletId", Long.valueOf(this.D));
        b.a("devicePaymentMethodId", this.E);
        b.a("cloudPaymentMethodId", this.F);
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.l(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.g(parcel, 6, this.e);
        cnwn.u(parcel, 7, this.f, i);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.u(parcel, 9, this.h, i);
        cnwn.g(parcel, 10, this.i);
        cnwn.g(parcel, 11, this.j);
        cnwn.u(parcel, 12, this.k, i);
        cnwn.k(parcel, 13, this.l, false);
        cnwn.u(parcel, 15, this.m, i);
        cnwn.k(parcel, 16, this.n, false);
        cnwn.l(parcel, 17, this.o, false);
        cnwn.g(parcel, 18, this.p);
        cnwn.g(parcel, 20, this.q);
        cnwn.g(parcel, 21, this.r);
        cnwn.u(parcel, 22, this.s, i);
        cnwn.u(parcel, 23, this.t, i);
        cnwn.k(parcel, 24, this.u, false);
        cnwn.x(parcel, 25, this.v, i);
        cnwn.e(parcel, 26, this.w);
        cnwn.y(parcel, 27, this.x);
        cnwn.e(parcel, 28, this.y);
        cnwn.e(parcel, 29, this.z);
        cnwn.h(parcel, 30, this.A);
        cnwn.h(parcel, 31, this.B);
        cnwn.e(parcel, 32, this.C);
        cnwn.h(parcel, 33, this.D);
        cnwn.k(parcel, 34, this.E, false);
        cnwn.k(parcel, 35, this.F, false);
        cnwn.u(parcel, 36, this.G, i);
        cnwn.g(parcel, 37, this.H);
        cnwn.c(parcel, d);
    }
}
