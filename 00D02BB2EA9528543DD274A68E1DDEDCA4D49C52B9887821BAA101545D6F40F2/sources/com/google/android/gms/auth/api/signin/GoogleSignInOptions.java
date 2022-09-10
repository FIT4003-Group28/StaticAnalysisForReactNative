package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements ReflectedParcelable, cnnu, cnnw {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;
    public static final Scope a;
    public static final Scope b;
    public static final Scope c;
    public static final Scope d;
    public static final GoogleSignInOptions e;
    public static Comparator<Scope> p;
    final int f;
    public final ArrayList<Scope> g;
    public Account h;
    public boolean i;
    public final boolean j;
    public final boolean k;
    public String l;
    public String m;
    public ArrayList<GoogleSignInOptionsExtensionParcelable> n;
    public String o;

    static {
        Scope scope = new Scope("profile");
        a = scope;
        new Scope("email");
        b = new Scope("openid");
        Scope scope2 = new Scope("https://www.googleapis.com/auth/games_lite");
        c = scope2;
        d = new Scope("https://www.googleapis.com/auth/games");
        cmtj cmtjVar = new cmtj();
        cmtjVar.b();
        cmtjVar.a.add(scope);
        e = cmtjVar.a();
        cmtj cmtjVar2 = new cmtj();
        cmtjVar2.c(scope2, new Scope[0]);
        cmtjVar2.a();
        CREATOR = new cmtk();
        p = new cmti();
    }

    public GoogleSignInOptions(int i, ArrayList<Scope> arrayList, Account account, boolean z, boolean z2, boolean z3, String str, String str2, Map<Integer, GoogleSignInOptionsExtensionParcelable> map, String str3) {
        this.f = i;
        this.g = arrayList;
        this.h = account;
        this.i = z;
        this.j = z2;
        this.k = z3;
        this.l = str;
        this.m = str2;
        this.n = new ArrayList<>(map.values());
        this.o = str3;
    }

    public static GoogleSignInOptions a(String str) {
        String str2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("scopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        String optString = jSONObject.has("accountName") ? jSONObject.optString("accountName") : null;
        Account account = !TextUtils.isEmpty(optString) ? new Account(optString, "com.google") : null;
        ArrayList arrayList = new ArrayList(hashSet);
        boolean z = jSONObject.getBoolean("idTokenRequested");
        boolean z2 = jSONObject.getBoolean("serverAuthRequested");
        boolean z3 = jSONObject.getBoolean("forceCodeForRefreshToken");
        String optString2 = jSONObject.has("serverClientId") ? jSONObject.optString("serverClientId") : null;
        if (jSONObject.has("hostedDomain")) {
            str2 = jSONObject.optString("hostedDomain");
        }
        return new GoogleSignInOptions(3, arrayList, account, z, z2, z3, optString2, str2, new HashMap(), null);
    }

    public static Map<Integer, GoogleSignInOptionsExtensionParcelable> c(List<GoogleSignInOptionsExtensionParcelable> list) {
        HashMap hashMap = new HashMap();
        if (list == null) {
            return hashMap;
        }
        for (GoogleSignInOptionsExtensionParcelable googleSignInOptionsExtensionParcelable : list) {
            hashMap.put(Integer.valueOf(googleSignInOptionsExtensionParcelable.b), googleSignInOptionsExtensionParcelable);
        }
        return hashMap;
    }

    public final ArrayList<Scope> b() {
        return new ArrayList<>(this.g);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
        if (r1.equals(r4.h) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r4) {
        /*
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L4
            return r0
        L4:
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r4 = (com.google.android.gms.auth.api.signin.GoogleSignInOptions) r4     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r3.n     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 > 0) goto L7f
            java.util.ArrayList<com.google.android.gms.auth.api.signin.internal.GoogleSignInOptionsExtensionParcelable> r1 = r4.n     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 <= 0) goto L17
            goto L7f
        L17:
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.g     // Catch: java.lang.ClassCastException -> L7f
            int r1 = r1.size()     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.b()     // Catch: java.lang.ClassCastException -> L7f
            int r2 = r2.size()     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.util.ArrayList<com.google.android.gms.common.api.Scope> r1 = r3.g     // Catch: java.lang.ClassCastException -> L7f
            java.util.ArrayList r2 = r4.b()     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.containsAll(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L34
            goto L7f
        L34:
            android.accounts.Account r1 = r3.h     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L3d
            android.accounts.Account r1 = r4.h     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L7f
            goto L45
        L3d:
            android.accounts.Account r2 = r4.h     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
        L45:
            java.lang.String r1 = r3.l     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L56
            java.lang.String r1 = r4.l     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 == 0) goto L7f
            goto L61
        L56:
            java.lang.String r1 = r3.l     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r2 = r4.l     // Catch: java.lang.ClassCastException -> L7f
            boolean r1 = r1.equals(r2)     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != 0) goto L61
            goto L7f
        L61:
            boolean r1 = r3.k     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.k     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.i     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.i     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            boolean r1 = r3.j     // Catch: java.lang.ClassCastException -> L7f
            boolean r2 = r4.j     // Catch: java.lang.ClassCastException -> L7f
            if (r1 != r2) goto L7f
            java.lang.String r1 = r3.o     // Catch: java.lang.ClassCastException -> L7f
            java.lang.String r4 = r4.o     // Catch: java.lang.ClassCastException -> L7f
            boolean r4 = android.text.TextUtils.equals(r1, r4)     // Catch: java.lang.ClassCastException -> L7f
            if (r4 == 0) goto L7f
            r4 = 1
            return r4
        L7f:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.auth.api.signin.GoogleSignInOptions.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        ArrayList arrayList = new ArrayList();
        ArrayList<Scope> arrayList2 = this.g;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(arrayList2.get(i).b);
        }
        Collections.sort(arrayList);
        cmty cmtyVar = new cmty();
        cmtyVar.b(arrayList);
        cmtyVar.b(this.h);
        cmtyVar.b(this.l);
        cmtyVar.a(this.k);
        cmtyVar.a(this.i);
        cmtyVar.a(this.j);
        cmtyVar.b(this.o);
        return cmtyVar.a;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int d2 = cnwn.d(parcel);
        cnwn.g(parcel, 1, this.f);
        cnwn.y(parcel, 2, b());
        cnwn.u(parcel, 3, this.h, i);
        cnwn.e(parcel, 4, this.i);
        cnwn.e(parcel, 5, this.j);
        cnwn.e(parcel, 6, this.k);
        cnwn.k(parcel, 7, this.l, false);
        cnwn.k(parcel, 8, this.m, false);
        cnwn.y(parcel, 9, this.n);
        cnwn.k(parcel, 10, this.o, false);
        cnwn.c(parcel, d2);
    }
}
