package com.google.android.gms.tapandpay.firstparty;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class IssuerInfo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<IssuerInfo> CREATOR = new cpao();
    String a;
    String b;
    String c;
    String d;
    String e;
    String f;
    String g;
    String h;
    String i;
    String j;
    String k;
    String l;
    String m;
    long n;
    String o;
    String p;
    String q;
    String r;
    String s;
    String t;
    String u;
    int v;

    public IssuerInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, long j, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = str11;
        this.l = str12;
        this.m = str13;
        this.n = j;
        this.o = str14;
        this.p = str15;
        this.q = str16;
        this.r = str17;
        this.s = str18;
        this.t = str19;
        this.u = str20;
        this.v = i;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof IssuerInfo) {
            IssuerInfo issuerInfo = (IssuerInfo) obj;
            if (cnvv.a(this.a, issuerInfo.a) && cnvv.a(this.b, issuerInfo.b) && cnvv.a(this.c, issuerInfo.c) && cnvv.a(this.d, issuerInfo.d) && cnvv.a(this.e, issuerInfo.e) && cnvv.a(this.f, issuerInfo.f) && cnvv.a(this.g, issuerInfo.g) && cnvv.a(this.h, issuerInfo.h) && cnvv.a(this.i, issuerInfo.i) && cnvv.a(this.j, issuerInfo.j) && cnvv.a(this.k, issuerInfo.k) && cnvv.a(this.l, issuerInfo.l) && cnvv.a(this.m, issuerInfo.m) && this.n == issuerInfo.n && cnvv.a(this.o, issuerInfo.o) && cnvv.a(this.p, issuerInfo.p) && cnvv.a(this.q, issuerInfo.q) && cnvv.a(this.r, issuerInfo.r) && cnvv.a(this.s, issuerInfo.s) && cnvv.a(this.t, issuerInfo.t) && cnvv.a(this.u, issuerInfo.u) && cnvv.a(Integer.valueOf(this.v), Integer.valueOf(issuerInfo.v))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, Long.valueOf(this.n), this.o, this.p, this.q, this.r, this.s, this.t, this.u, Integer.valueOf(this.v)});
    }

    public final String toString() {
        cnvu b = cnvv.b(this);
        b.a("issuerName", this.a);
        b.a("issuerPhoneNumber", this.b);
        b.a("appLogoUrl", this.c);
        b.a("appName", this.d);
        b.a("appDeveloperName", this.e);
        b.a("appPackageName", this.f);
        b.a("privacyNoticeUrl", this.g);
        b.a("termsAndConditionsUrl", this.h);
        b.a("productShortName", this.i);
        b.a("appAction", this.j);
        b.a("appIntentExtraMessage", this.k);
        b.a("issuerMessageHeadline", this.l);
        b.a("issuerMessageBody", this.m);
        b.a("issuerMessageExpiryTimestampMillis", Long.valueOf(this.n));
        b.a("issuerMessageLinkPackageName", this.o);
        b.a("issuerMessageLinkAction", this.p);
        b.a("issuerMessageLinkExtraText", this.q);
        b.a("issuerMessageLinkUrl", this.r);
        b.a("issuerMessageLinkText", this.s);
        b.a("issuerWebLinkUrl", this.t);
        b.a("issuerWebLinkText", this.u);
        b.a("issuerMessageType", Integer.valueOf(this.v));
        return b.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d = cnwn.d(parcel);
        cnwn.k(parcel, 2, this.a, false);
        cnwn.k(parcel, 3, this.b, false);
        cnwn.k(parcel, 4, this.c, false);
        cnwn.k(parcel, 5, this.d, false);
        cnwn.k(parcel, 6, this.e, false);
        cnwn.k(parcel, 7, this.f, false);
        cnwn.k(parcel, 8, this.g, false);
        cnwn.k(parcel, 9, this.h, false);
        cnwn.k(parcel, 10, this.i, false);
        cnwn.k(parcel, 11, this.j, false);
        cnwn.k(parcel, 12, this.k, false);
        cnwn.k(parcel, 13, this.l, false);
        cnwn.k(parcel, 14, this.m, false);
        cnwn.h(parcel, 15, this.n);
        cnwn.k(parcel, 16, this.o, false);
        cnwn.k(parcel, 17, this.p, false);
        cnwn.k(parcel, 18, this.q, false);
        cnwn.k(parcel, 20, this.r, false);
        cnwn.k(parcel, 21, this.s, false);
        cnwn.k(parcel, 22, this.t, false);
        cnwn.k(parcel, 23, this.u, false);
        cnwn.g(parcel, 24, this.v);
        cnwn.c(parcel, d);
    }
}
