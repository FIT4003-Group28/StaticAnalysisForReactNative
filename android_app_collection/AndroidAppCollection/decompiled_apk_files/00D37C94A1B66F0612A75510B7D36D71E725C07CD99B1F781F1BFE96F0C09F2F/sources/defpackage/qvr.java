package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: qvr  reason: default package */
/* loaded from: classes4.dex */
public final class qvr extends rua implements qsv, qsw {
    private static final tzc h = rtx.d;
    public final Context a;
    public final Handler b;
    public final Set c;
    public final qwu d;
    public rty e;
    public qup f;
    public final tzc g;

    public qvr(Context context, Handler handler, qwu qwuVar) {
        tzc tzcVar = h;
        this.a = context;
        this.b = handler;
        this.d = qwuVar;
        this.c = qwuVar.b;
        this.g = tzcVar;
    }

    @Override // defpackage.qub
    public final void a(int i) {
        this.e.l();
    }

    @Override // defpackage.qub
    public final void b() {
        qvr qvrVar;
        GoogleSignInAccount googleSignInAccount;
        rty rtyVar = this.e;
        try {
            Account account = ((rud) rtyVar).a.a;
            if (account == null) {
                account = new Account("<<default account>>", "com.google");
            }
            try {
                if ("<<default account>>".equals(account.name)) {
                    try {
                        Context context = ((qwr) rtyVar).q;
                        qiy.a.lock();
                        if (qiy.b == null) {
                            qiy.b = new qiy(context.getApplicationContext());
                        }
                        qiy qiyVar = qiy.b;
                        qiy.a.unlock();
                        String a = qiyVar.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 20);
                            sb.append("googleSignInAccount");
                            sb.append(":");
                            sb.append(a);
                            String a2 = qiyVar.a(sb.toString());
                            if (a2 != null) {
                                if (!TextUtils.isEmpty(a2)) {
                                    JSONObject jSONObject = new JSONObject(a2);
                                    String optString = jSONObject.optString("photoUrl");
                                    Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
                                    long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
                                    HashSet hashSet = new HashSet();
                                    JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
                                    int i = 0;
                                    for (int length = jSONArray.length(); i < length; length = length) {
                                        hashSet.add(new Scope(jSONArray.getString(i)));
                                        i++;
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
                                    qnm.l(string);
                                    googleSignInAccount = new GoogleSignInAccount(3, optString2, optString3, optString4, optString5, parse, null, longValue, string, new ArrayList(hashSet), optString6, optString7);
                                    googleSignInAccount.g = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
                                    Integer num = ((rud) rtyVar).b;
                                    qnm.b(num);
                                    ResolveAccountRequest resolveAccountRequest = new ResolveAccountRequest(2, account, num.intValue(), googleSignInAccount);
                                    rub rubVar = (rub) ((qwr) rtyVar).D();
                                    SignInRequest signInRequest = new SignInRequest(1, resolveAccountRequest);
                                    Parcel pv = rubVar.pv();
                                    dve.g(pv, signInRequest);
                                    qvrVar = this;
                                    dve.i(pv, qvrVar);
                                    rubVar.px(12, pv);
                                    return;
                                }
                            }
                        }
                    } catch (RemoteException e) {
                        e = e;
                        qvrVar = this;
                        Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                        try {
                            qvrVar.c(new SignInResponse(1, new ConnectionResult(8, null), null));
                            return;
                        } catch (RemoteException unused) {
                            Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
                            return;
                        }
                    }
                }
                dve.i(pv, qvrVar);
                rubVar.px(12, pv);
                return;
            } catch (RemoteException e2) {
                e = e2;
                Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
                qvrVar.c(new SignInResponse(1, new ConnectionResult(8, null), null));
                return;
            }
            googleSignInAccount = null;
            Integer num2 = ((rud) rtyVar).b;
            qnm.b(num2);
            ResolveAccountRequest resolveAccountRequest2 = new ResolveAccountRequest(2, account, num2.intValue(), googleSignInAccount);
            rub rubVar2 = (rub) ((qwr) rtyVar).D();
            SignInRequest signInRequest2 = new SignInRequest(1, resolveAccountRequest2);
            Parcel pv2 = rubVar2.pv();
            dve.g(pv2, signInRequest2);
            qvrVar = this;
        } catch (RemoteException e3) {
            e = e3;
            qvrVar = this;
        }
    }

    @Override // defpackage.rua
    public final void c(SignInResponse signInResponse) {
        this.b.post(new qvq(this, signInResponse));
    }

    @Override // defpackage.qvh
    public final void i(ConnectionResult connectionResult) {
        this.f.b(connectionResult);
    }
}
