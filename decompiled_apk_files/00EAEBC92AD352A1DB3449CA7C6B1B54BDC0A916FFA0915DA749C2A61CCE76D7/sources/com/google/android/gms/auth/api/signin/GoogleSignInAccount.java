package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.s;
import com.google.android.gms.common.internal.x.a;
import com.google.android.gms.common.internal.x.c;
import com.google.android.gms.common.util.e;
import com.google.android.gms.common.util.h;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInAccount extends a implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new b();
    private static e o = h.d();

    /* renamed from: b  reason: collision with root package name */
    private final int f6778b;

    /* renamed from: c  reason: collision with root package name */
    private String f6779c;

    /* renamed from: d  reason: collision with root package name */
    private String f6780d;

    /* renamed from: e  reason: collision with root package name */
    private String f6781e;

    /* renamed from: f  reason: collision with root package name */
    private String f6782f;

    /* renamed from: g  reason: collision with root package name */
    private Uri f6783g;

    /* renamed from: h  reason: collision with root package name */
    private String f6784h;
    private long i;
    private String j;
    private List<Scope> k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    /* JADX INFO: Access modifiers changed from: package-private */
    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.f6778b = i;
        this.f6779c = str;
        this.f6780d = str2;
        this.f6781e = str3;
        this.f6782f = str4;
        this.f6783g = uri;
        this.f6784h = str5;
        this.i = j;
        this.j = str6;
        this.k = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl", null);
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount a2 = a(jSONObject.optString("id"), jSONObject.optString("tokenId", null), jSONObject.optString("email", null), jSONObject.optString("displayName", null), jSONObject.optString("givenName", null), jSONObject.optString("familyName", null), parse, Long.valueOf(parseLong), jSONObject.getString("obfuscatedIdentifier"), hashSet);
        a2.f6784h = jSONObject.optString("serverAuthCode", null);
        return a2;
    }

    private static GoogleSignInAccount a(String str, String str2, String str3, String str4, String str5, String str6, Uri uri, Long l, String str7, Set<Scope> set) {
        long longValue = (l == null ? Long.valueOf(o.a() / 1000) : l).longValue();
        s.b(str7);
        s.a(set);
        return new GoogleSignInAccount(3, str, str2, str3, str4, uri, null, longValue, str7, new ArrayList(set), str5, str6);
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.j.equals(this.j) && googleSignInAccount.v().equals(v());
    }

    public Uri h() {
        return this.f6783g;
    }

    public int hashCode() {
        return ((this.j.hashCode() + 527) * 31) + v().hashCode();
    }

    public String o() {
        return this.f6781e;
    }

    public String p() {
        return this.f6782f;
    }

    public Account q() {
        String str = this.f6781e;
        if (str == null) {
            return null;
        }
        return new Account(str, "com.google");
    }

    public String r() {
        return this.m;
    }

    public String s() {
        return this.l;
    }

    public String t() {
        return this.f6779c;
    }

    public String u() {
        return this.f6780d;
    }

    public Set<Scope> v() {
        HashSet hashSet = new HashSet(this.k);
        hashSet.addAll(this.n);
        return hashSet;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = c.a(parcel);
        c.a(parcel, 1, this.f6778b);
        c.a(parcel, 2, t(), false);
        c.a(parcel, 3, u(), false);
        c.a(parcel, 4, o(), false);
        c.a(parcel, 5, p(), false);
        c.a(parcel, 6, (Parcelable) h(), i, false);
        c.a(parcel, 7, x(), false);
        c.a(parcel, 8, this.i);
        c.a(parcel, 9, this.j, false);
        c.b(parcel, 10, this.k, false);
        c.a(parcel, 11, s(), false);
        c.a(parcel, 12, r(), false);
        c.a(parcel, a2);
    }

    public String x() {
        return this.f6784h;
    }
}
