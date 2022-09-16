package c.e.a.b.d.e;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
/* loaded from: classes.dex */
public final class k3 extends com.google.android.gms.common.internal.x.a implements com.google.firebase.auth.v0.a.x2<Object> {
    public static final Parcelable.Creator<k3> CREATOR = new n3();

    /* renamed from: b  reason: collision with root package name */
    private String f3935b;

    /* renamed from: c  reason: collision with root package name */
    private String f3936c;

    /* renamed from: d  reason: collision with root package name */
    private String f3937d;

    /* renamed from: e  reason: collision with root package name */
    private String f3938e;

    /* renamed from: f  reason: collision with root package name */
    private String f3939f;

    /* renamed from: g  reason: collision with root package name */
    private String f3940g;

    /* renamed from: h  reason: collision with root package name */
    private String f3941h;
    private String i;
    private boolean j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private String o;
    private boolean p;
    private String q;

    public k3() {
        this.j = true;
        this.k = true;
    }

    public k3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.f3935b = "http://localhost";
        this.f3937d = str;
        this.f3938e = str2;
        this.i = str5;
        this.l = str6;
        this.o = str7;
        this.q = str8;
        this.j = true;
        if (!TextUtils.isEmpty(this.f3937d) || !TextUtils.isEmpty(this.f3938e) || !TextUtils.isEmpty(this.l)) {
            com.google.android.gms.common.internal.s.b(str3);
            this.f3939f = str3;
            this.f3940g = null;
            StringBuilder sb = new StringBuilder();
            if (!TextUtils.isEmpty(this.f3937d)) {
                sb.append("id_token=");
                sb.append(this.f3937d);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3938e)) {
                sb.append("access_token=");
                sb.append(this.f3938e);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.f3940g)) {
                sb.append("identifier=");
                sb.append(this.f3940g);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.i)) {
                sb.append("oauth_token_secret=");
                sb.append(this.i);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(this.l)) {
                sb.append("code=");
                sb.append(this.l);
                sb.append("&");
            }
            if (!TextUtils.isEmpty(str9)) {
                sb.append("nonce=");
                sb.append(str9);
                sb.append("&");
            }
            sb.append("providerId=");
            sb.append(this.f3939f);
            this.f3941h = sb.toString();
            this.k = true;
            return;
        }
        throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public k3(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.f3935b = str;
        this.f3936c = str2;
        this.f3937d = str3;
        this.f3938e = str4;
        this.f3939f = str5;
        this.f3940g = str6;
        this.f3941h = str7;
        this.i = str8;
        this.j = z;
        this.k = z2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.o = str12;
        this.p = z3;
        this.q = str13;
    }

    public final k3 a(String str) {
        this.o = str;
        return this;
    }

    public final k3 a(boolean z) {
        this.k = false;
        return this;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = com.google.android.gms.common.internal.x.c.a(parcel);
        com.google.android.gms.common.internal.x.c.a(parcel, 2, this.f3935b, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 3, this.f3936c, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 4, this.f3937d, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 5, this.f3938e, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 6, this.f3939f, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 7, this.f3940g, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 8, this.f3941h, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 9, this.i, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 10, this.j);
        com.google.android.gms.common.internal.x.c.a(parcel, 11, this.k);
        com.google.android.gms.common.internal.x.c.a(parcel, 12, this.l, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 13, this.m, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 14, this.n, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 15, this.o, false);
        com.google.android.gms.common.internal.x.c.a(parcel, 16, this.p);
        com.google.android.gms.common.internal.x.c.a(parcel, 17, this.q, false);
        com.google.android.gms.common.internal.x.c.a(parcel, a2);
    }
}
