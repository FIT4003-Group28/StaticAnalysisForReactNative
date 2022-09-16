package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: bzfx  reason: default package */
/* loaded from: classes4.dex */
public final class bzfx<T> extends btrh<T> {
    public bzfx(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        bzfq<T> bzfqVar;
        crnz crnzVar;
        crpi crpiVar;
        amqo amqoVar = (amqo) obj;
        bzfw bzfwVar = ((bzfv) this.a).a;
        try {
            synchronized (bzfwVar) {
                GmmLocation a = amqoVar.a();
                if (a != null && bzfwVar.g != null) {
                    craw.a(a);
                    bzfwVar.g.d(a);
                    cray n = bzfwVar.g.n();
                    byzk byzkVar = bzfwVar.e;
                    if (byzkVar != null && (crnzVar = byzkVar.e) != null && (crpiVar = crnzVar.d) != null) {
                        bvrj.NAVIGATION_INTERNAL.c();
                        crpiVar.f.d(a);
                        crpiVar.c("onTransitNavGuidanceStateChanged", a, crpiVar.f.f(n));
                    }
                    amuo amuoVar = n.b;
                    if (amuoVar == null) {
                        bzfwVar.g.m();
                    } else {
                        amuoVar.g();
                        bvrj.a();
                    }
                    if (!bzfwVar.g.m()) {
                        if (!bzfwVar.h.getTransitTrackingParameters().j) {
                            bzfwVar.f.a(a, true);
                        }
                    } else if (amuoVar != null) {
                        for (bzfr<T> bzfrVar : bzfwVar.a) {
                            synchronized (bzfrVar) {
                                bzfqVar = bzfrVar.a;
                            }
                            if (bzfqVar != null) {
                                bzfqVar.a(n);
                            }
                        }
                    }
                }
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
