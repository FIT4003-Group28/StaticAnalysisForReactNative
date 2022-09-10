package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: cmtx  reason: default package */
/* loaded from: classes5.dex */
public final class cmtx {
    private static cmtx b;
    final cmuh a;

    private cmtx(Context context) {
        cmuh a = cmuh.a(context);
        this.a = a;
        a.c();
        a.d();
    }

    public static synchronized cmtx a(Context context) {
        cmtx d;
        synchronized (cmtx.class) {
            d = d(context.getApplicationContext());
        }
        return d;
    }

    private static synchronized cmtx d(Context context) {
        synchronized (cmtx.class) {
            cmtx cmtxVar = b;
            if (cmtxVar != null) {
                return cmtxVar;
            }
            cmtx cmtxVar2 = new cmtx(context);
            b = cmtxVar2;
            return cmtxVar2;
        }
    }

    public final synchronized void b() {
        cmuh cmuhVar = this.a;
        cmuhVar.a.lock();
        cmuhVar.b.edit().clear().apply();
        cmuhVar.a.unlock();
    }

    public final synchronized void c(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        cmuh cmuhVar = this.a;
        cnwc.a(googleSignInOptions);
        cmuhVar.b("defaultGoogleSignInAccount", googleSignInAccount.i);
        cnwc.a(googleSignInOptions);
        String str = googleSignInAccount.i;
        String g = cmuhVar.g("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.k;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.l;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.g;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", googleSignInAccount.i);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = googleSignInAccount.j;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, cmtf.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            cmuhVar.b(g, jSONObject.toString());
            String g2 = cmuhVar.g("googleSignInOptions", str);
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(googleSignInOptions.g, GoogleSignInOptions.p);
                Iterator<Scope> it = googleSignInOptions.g.iterator();
                while (it.hasNext()) {
                    jSONArray2.put(it.next().b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.h;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.i);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.k);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.j);
                if (!TextUtils.isEmpty(googleSignInOptions.l)) {
                    jSONObject2.put("serverClientId", googleSignInOptions.l);
                }
                if (!TextUtils.isEmpty(googleSignInOptions.m)) {
                    jSONObject2.put("hostedDomain", googleSignInOptions.m);
                }
                cmuhVar.b(g2, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e2) {
            throw new RuntimeException(e2);
        }
    }
}
