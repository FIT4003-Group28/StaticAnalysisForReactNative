package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;
/* compiled from: PG */
/* renamed from: rms  reason: default package */
/* loaded from: classes4.dex */
public final class rms implements Runnable {
    final /* synthetic */ rng a;
    private final /* synthetic */ int b;

    public rms(rng rngVar) {
        this.a = rngVar;
    }

    public /* synthetic */ rms(rng rngVar, int i) {
        this.b = i;
        this.a = rngVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Pair pair;
        NetworkInfo networkInfo = null;
        if (this.b == 0) {
            rli rliVar = this.a.f;
            rliVar.a.r();
            if (!rliVar.c()) {
                return;
            }
            if (rliVar.d()) {
                rliVar.a.h().t.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                rliVar.a.l().u("auto", "_cmpx", bundle);
            } else {
                String a = rliVar.a.h().t.a();
                if (TextUtils.isEmpty(a)) {
                    rliVar.a.aG().d.a("Cache still valid but referrer not found");
                } else {
                    long a2 = ((rliVar.a.h().u.a() / 3600000) - 1) * 3600000;
                    Uri parse = Uri.parse(a);
                    Bundle bundle2 = new Bundle();
                    Pair pair2 = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair2.second).putLong("_cc", a2);
                    rliVar.a.l().u(pair2.first == null ? "app" : (String) pair2.first, "_cmp", (Bundle) pair2.second);
                }
                rliVar.a.h().t.b(null);
            }
            rliVar.a.h().u.b(0L);
            return;
        }
        rng rngVar = this.a;
        rngVar.n();
        if (rngVar.M().q.b()) {
            rngVar.aG().j.a("Deferred Deep Link already retrieved. Not fetching again.");
            return;
        }
        long a3 = rngVar.M().r.a();
        rngVar.M().r.b(1 + a3);
        rngVar.J();
        if (a3 >= 5) {
            rngVar.aG().f.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
            rngVar.M().q.a(true);
            return;
        }
        rlx rlxVar = rngVar.w;
        rlxVar.r();
        rlx.A(rlxVar.m());
        String p = rlxVar.d().p();
        rlf h = rlxVar.h();
        h.n();
        h.Q();
        long elapsedRealtime = SystemClock.elapsedRealtime();
        String str2 = h.g;
        if (str2 == null || elapsedRealtime >= h.i) {
            h.i = elapsedRealtime + h.J().g(p);
            try {
                qaa a4 = qab.a(h.I());
                h.g = "";
                String str3 = a4.a;
                if (str3 != null) {
                    h.g = str3;
                }
                h.h = a4.b;
            } catch (Exception e) {
                h.aG().j.b("Unable to get advertising id", e);
                h.g = "";
            }
            pair = new Pair(h.g, Boolean.valueOf(h.h));
        } else {
            pair = new Pair(str2, Boolean.valueOf(h.h));
        }
        if (!rlxVar.g.m() || ((Boolean) pair.second).booleanValue() || TextUtils.isEmpty((CharSequence) pair.first)) {
            rlxVar.aG().j.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            return;
        }
        rnk m = rlxVar.m();
        m.j();
        ConnectivityManager connectivityManager = (ConnectivityManager) m.I().getSystemService("connectivity");
        if (connectivityManager != null) {
            try {
                networkInfo = connectivityManager.getActiveNetworkInfo();
            } catch (SecurityException unused) {
            }
        }
        if (networkInfo == null || !networkInfo.isConnected()) {
            rlxVar.aG().f.a("Network is not available for Deferred Deep Link request. Skipping");
            return;
        }
        rps q = rlxVar.q();
        rlxVar.d().s();
        URL aB = q.aB(p, (String) pair.first, rlxVar.h().r.a() - 1);
        if (aB == null) {
            return;
        }
        rnk m2 = rlxVar.m();
        rlv rlvVar = new rlv(rlxVar);
        m2.n();
        m2.j();
        m2.aH().e(new rnj(m2, p, aB, rlvVar));
    }
}
