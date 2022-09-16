package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: rns  reason: default package */
/* loaded from: classes4.dex */
public final class rns extends riw {
    public volatile rnm b;
    public volatile rnm c;
    protected rnm d;
    public final Map e;
    public Activity f;
    public volatile boolean g;
    public volatile rnm h;
    public rnm i;
    public boolean j;
    public final Object k;
    public String l;

    public rns(rlx rlxVar) {
        super(rlxVar);
        this.k = new Object();
        this.e = new ConcurrentHashMap();
    }

    @Override // defpackage.riw
    protected final boolean d() {
        return false;
    }

    public final rnm e(Activity activity) {
        qnm.b(activity);
        rnm rnmVar = (rnm) this.e.get(activity);
        if (rnmVar == null) {
            rnm rnmVar2 = new rnm(null, u(activity.getClass()), N().r());
            this.e.put(activity, rnmVar2);
            rnmVar = rnmVar2;
        }
        return this.h != null ? this.h : rnmVar;
    }

    public final rnm f() {
        return o(false);
    }

    public final rnm o(boolean z) {
        a();
        n();
        if (!z) {
            return this.d;
        }
        rnm rnmVar = this.d;
        return rnmVar != null ? rnmVar : this.i;
    }

    public final void q(rnm rnmVar, rnm rnmVar2, long j, boolean z, Bundle bundle) {
        long j2;
        long j3;
        n();
        boolean z2 = false;
        boolean z3 = rnmVar2 == null || rnmVar2.c != rnmVar.c || !rps.aq(rnmVar2.b, rnmVar.b) || !rps.aq(rnmVar2.a, rnmVar.a);
        if (z && this.d != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            rps.E(rnmVar, bundle2, true);
            if (rnmVar2 != null) {
                String str = rnmVar2.a;
                if (str != null) {
                    bundle2.putString("_pn", str);
                }
                String str2 = rnmVar2.b;
                if (str2 != null) {
                    bundle2.putString("_pc", str2);
                }
                bundle2.putLong("_pi", rnmVar2.c);
            }
            if (z2) {
                long e = m().e(j);
                if (e > 0) {
                    N().D(bundle2, e);
                }
            }
            if (!J().r()) {
                bundle2.putLong("_mst", 1L);
            }
            String str3 = true != rnmVar.e ? "auto" : "app";
            Q();
            long currentTimeMillis = System.currentTimeMillis();
            if (rnmVar.e) {
                j2 = currentTimeMillis;
                long j4 = rnmVar.f;
                if (j4 != 0) {
                    j3 = j4;
                    j().v(str3, "_vs", j3, bundle2);
                }
            } else {
                j2 = currentTimeMillis;
            }
            j3 = j2;
            j().v(str3, "_vs", j3, bundle2);
        }
        if (z2) {
            s(this.d, true, j);
        }
        this.d = rnmVar;
        if (rnmVar.e) {
            this.i = rnmVar;
        }
        l().w(rnmVar);
    }

    public final void r(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (!J().r() || bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.e.put(activity, new rnm(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    public final void s(rnm rnmVar, boolean z, long j) {
        riu g = g();
        Q();
        g.e(SystemClock.elapsedRealtime());
        if (!m().o(rnmVar != null && rnmVar.d, z, j) || rnmVar == null) {
            return;
        }
        rnmVar.d = false;
    }

    public final void t(String str, rnm rnmVar) {
        n();
        synchronized (this) {
            String str2 = this.l;
            if (str2 == null || str2.equals(str) || rnmVar != null) {
                this.l = str;
            }
        }
    }

    public final String u(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : "";
        int length2 = str.length();
        J();
        if (length2 <= 100) {
            return str;
        }
        J();
        return str.substring(0, 100);
    }

    public final void p(Activity activity, rnm rnmVar, boolean z) {
        rnm rnmVar2;
        rnm rnmVar3 = this.b == null ? this.c : this.b;
        if (rnmVar.b == null) {
            rnmVar2 = new rnm(rnmVar.a, activity != null ? u(activity.getClass()) : null, rnmVar.c, rnmVar.e, rnmVar.f);
        } else {
            rnmVar2 = rnmVar;
        }
        this.c = this.b;
        this.b = rnmVar2;
        Q();
        aH().g(new rno(this, rnmVar2, rnmVar3, SystemClock.elapsedRealtime(), z));
    }
}
