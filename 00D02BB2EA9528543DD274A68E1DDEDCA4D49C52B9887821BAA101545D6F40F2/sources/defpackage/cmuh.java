package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cmuh  reason: default package */
/* loaded from: classes5.dex */
public final class cmuh {
    private static final Lock c = new ReentrantLock();
    private static cmuh d;
    public final Lock a = new ReentrantLock();
    public final SharedPreferences b;

    public cmuh(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static cmuh a(Context context) {
        cnwc.a(context);
        Lock lock = c;
        lock.lock();
        try {
            if (d == null) {
                d = new cmuh(context.getApplicationContext());
            }
            cmuh cmuhVar = d;
            lock.unlock();
            return cmuhVar;
        } catch (Throwable th) {
            c.unlock();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str, String str2) {
        this.a.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final GoogleSignInAccount c() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = e(g("googleSignInAccount", e2))) != null) {
            try {
                if (!TextUtils.isEmpty(e)) {
                    JSONObject jSONObject = new JSONObject(e);
                    String optString = jSONObject.optString("photoUrl");
                    Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                    HashSet hashSet = new HashSet();
                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                    int length = jSONArray.length();
                    for (int i = 0; i < length; i++) {
                        hashSet.add(new Scope(jSONArray.getString(i)));
                    }
                    String optString2 = jSONObject.optString("id");
                    String optString3 = jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null;
                    String optString4 = jSONObject.has("email") ? jSONObject.optString("email") : null;
                    String optString5 = jSONObject.has("displayName") ? jSONObject.optString("displayName") : null;
                    String optString6 = jSONObject.has("givenName") ? jSONObject.optString("givenName") : null;
                    String optString7 = jSONObject.has("familyName") ? jSONObject.optString("familyName") : null;
                    Long valueOf = Long.valueOf(parseLong);
                    String string = jSONObject.getString("obfuscatedIdentifier");
                    long longValue = valueOf.longValue();
                    cnwc.l(string);
                    GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
                    googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                    return googleSignInAccount;
                }
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final GoogleSignInOptions d() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = e(g("googleSignInOptions", e2))) != null) {
            try {
                return GoogleSignInOptions.a(e);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    public final String e(String str) {
        this.a.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            this.a.unlock();
        }
    }

    public final void f(String str) {
        this.a.lock();
        try {
            this.b.edit().remove(str).apply();
        } finally {
            this.a.unlock();
        }
    }

    public final String g(String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 1 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(":");
        sb.append(str2);
        return sb.toString();
    }
}
