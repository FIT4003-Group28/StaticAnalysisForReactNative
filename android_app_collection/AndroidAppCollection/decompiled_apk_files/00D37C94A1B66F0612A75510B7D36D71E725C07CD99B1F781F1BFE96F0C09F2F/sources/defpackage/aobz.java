package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;
/* compiled from: PG */
/* renamed from: aobz  reason: default package */
/* loaded from: classes.dex */
public final class aobz {
    public final anwg a;
    private final aocd b;
    private final qrl c;
    private final aoaf d;
    private final aoaf e;
    private final aoal f;

    public aobz(anwg anwgVar, aocd aocdVar, qrl qrlVar, aoaf aoafVar, aoaf aoafVar2, aoal aoalVar) {
        this.a = anwgVar;
        this.b = aocdVar;
        this.c = qrlVar;
        this.d = aoafVar;
        this.e = aoafVar2;
        this.f = aoalVar;
    }

    public static final rve b(rve rveVar) {
        return rveVar.b(qrj.l, new rcb(7));
    }

    private final String c() {
        try {
            return Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(this.a.g().getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            return "[HASH-ERROR]";
        }
    }

    public final rve a(String str, String str2, Bundle bundle) {
        int a;
        try {
            bundle.putString("scope", str2);
            bundle.putString("sender", str);
            bundle.putString("subtype", str);
            bundle.putString("gmp_app_id", this.a.e().b);
            bundle.putString("gmsv", Integer.toString(this.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", this.b.c());
            bundle.putString("app_ver_name", this.b.d());
            bundle.putString("firebase-app-name-hash", c());
            try {
                String str3 = ((aoaq) rwd.d(this.f.l())).a;
                if (!TextUtils.isEmpty(str3)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", str3);
                } else {
                    Log.w("FirebaseMessaging", "FIS auth token is empty");
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseMessaging", "Failed to get FIS auth token", e);
            }
            bundle.putString("appid", (String) rwd.d(this.f.a()));
            bundle.putString("cliv", "fcm-20.1.7_1p");
            anzl anzlVar = (anzl) this.e.a();
            aodn aodnVar = (aodn) this.d.a();
            if (anzlVar != null && aodnVar != null && (a = anzlVar.a("fire-iid")) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(anzk.a(a)));
                bundle.putString("Firebase-Client", aodnVar.a());
            }
            return this.c.b(bundle);
        } catch (InterruptedException | ExecutionException e2) {
            return rwd.b(e2);
        }
    }
}
