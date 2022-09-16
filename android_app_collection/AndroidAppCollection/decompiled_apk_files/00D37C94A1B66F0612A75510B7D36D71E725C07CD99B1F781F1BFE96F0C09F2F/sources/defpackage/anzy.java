package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import com.google.firebase.iid.FirebaseInstanceId;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: anzy  reason: default package */
/* loaded from: classes.dex */
public final class anzy {
    public final Map a = new afw();
    private final Executor b;

    public anzy(Executor executor) {
        this.b = executor;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized rve a(String str, String str2, anzs anzsVar) {
        int a;
        final Pair pair = new Pair(str, str2);
        rve rveVar = (rve) this.a.get(pair);
        if (rveVar == null) {
            final FirebaseInstanceId firebaseInstanceId = anzsVar.a;
            String str3 = anzsVar.b;
            final String str4 = anzsVar.c;
            final String str5 = anzsVar.d;
            final aoaa aoaaVar = anzsVar.e;
            anzt anztVar = firebaseInstanceId.f;
            Bundle bundle = new Bundle();
            bundle.putString("scope", str5);
            bundle.putString("sender", str4);
            bundle.putString("subtype", str4);
            bundle.putString("appid", str3);
            bundle.putString("gmp_app_id", anztVar.a.e().b);
            bundle.putString("gmsv", Integer.toString(anztVar.b.a()));
            bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
            bundle.putString("app_ver", anztVar.b.c());
            bundle.putString("app_ver_name", anztVar.b.d());
            bundle.putString("firebase-app-name-hash", anztVar.a());
            try {
                String str6 = ((aoaq) rwd.d(anztVar.f.l())).a;
                if (!TextUtils.isEmpty(str6)) {
                    bundle.putString("Goog-Firebase-Installations-Auth", str6);
                } else {
                    Log.w("FirebaseInstanceId", "FIS auth token is empty");
                }
            } catch (InterruptedException | ExecutionException e) {
                Log.e("FirebaseInstanceId", "Failed to get FIS auth token", e);
            }
            bundle.putString("cliv", "fiid-21.1.1");
            anzl anzlVar = (anzl) anztVar.e.a();
            aodn aodnVar = (aodn) anztVar.d.a();
            if (anzlVar != null && aodnVar != null && (a = anzlVar.a("fire-iid")) != 1) {
                bundle.putString("Firebase-Client-Log-Type", Integer.toString(anzk.a(a)));
                bundle.putString("Firebase-Client", aodnVar.a());
            }
            rve e2 = anztVar.c.b(bundle).b(anzn.a, new rcb(3)).e(firebaseInstanceId.c, new rvd() { // from class: anzr
                @Override // defpackage.rvd
                public final rve a(Object obj) {
                    FirebaseInstanceId firebaseInstanceId2 = FirebaseInstanceId.this;
                    String str7 = (String) obj;
                    FirebaseInstanceId.a.c(firebaseInstanceId2.d(), str4, str5, str7, firebaseInstanceId2.e.c());
                    return rwd.c(new anzu(str7));
                }
            });
            e2.p(qrj.h, new ruz() { // from class: anzq
                @Override // defpackage.ruz
                public final void d(Object obj) {
                    FirebaseInstanceId firebaseInstanceId2 = FirebaseInstanceId.this;
                    aoaa aoaaVar2 = aoaaVar;
                    String str7 = ((anzu) obj).a;
                    if (aoaaVar2 == null || !str7.equals(aoaaVar2.b)) {
                        for (aobu aobuVar : firebaseInstanceId2.i) {
                            aobuVar.a.f(str7);
                        }
                    }
                }
            });
            rve c = e2.c(this.b, new rui() { // from class: anzx
                @Override // defpackage.rui
                public final Object a(rve rveVar2) {
                    anzy anzyVar = anzy.this;
                    Pair pair2 = pair;
                    synchronized (anzyVar) {
                        anzyVar.a.remove(pair2);
                    }
                    return rveVar2;
                }
            });
            this.a.put(pair, c);
            return c;
        }
        return rveVar;
    }
}
