package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crkv  reason: default package */
/* loaded from: classes5.dex */
public final class crkv {
    static final long a = TimeUnit.SECONDS.toMillis(2);
    public final cqat b;
    public final vmy c;
    public final btrm d;
    public final cjqy e;
    @dzsi
    public final GmmLocation f;
    @dzsi
    public btzc g;
    @dzsi
    public vmd h;
    @dzsi
    public vmd i;
    private final Context j;
    private final btpc k;
    private final avnt l;
    private final bvrb m;
    @dzsi
    private final ckcq n;
    @dzsi
    private final ckcq o;
    @dzsi
    private btzc p;
    private long q;
    @dzsi
    private bttq s;
    private final ckoq v;
    private boolean r = true;
    private final btzi<dwaw, crke> t = new crkt(this);
    private final btzi<dwaw, crke> u = new crku(this);

    public crkv(Application application, cqat cqatVar, btpc btpcVar, vmy vmyVar, avnt avntVar, btrm btrmVar, bvrb bvrbVar, cjqy cjqyVar, GmmLocation gmmLocation, ckcq ckcqVar, ckcq ckcqVar2, ckoq ckoqVar) {
        this.j = application;
        this.b = cqatVar;
        this.k = btpcVar;
        this.c = vmyVar;
        this.l = avntVar;
        this.d = btrmVar;
        this.m = bvrbVar;
        this.e = cjqyVar;
        this.f = gmmLocation;
        this.n = ckcqVar;
        this.o = ckcqVar2;
        this.v = ckoqVar;
    }

    private final synchronized void i(vmd vmdVar) {
        this.i = vmdVar;
        this.q = this.b.e() + a;
    }

    private static void j(@dzsi ckcq ckcqVar) {
        if (ckcqVar != null) {
            ckcqVar.a();
        }
    }

    private static void k(@dzsi ckcq ckcqVar) {
        if (ckcqVar != null) {
            ckcqVar.b();
        }
    }

    private final void l(@dzsi crke crkeVar, @dzsi bttq bttqVar) {
        dbsk.s(this.h);
        if (crkeVar == null) {
            crkeVar = e(this.h);
        }
        dbsk.s(crkeVar);
        if (f()) {
            g(crkeVar, bttqVar);
            btzc btzcVar = this.p;
            if (btzcVar == null) {
                return;
            }
            btzcVar.a();
        }
    }

    private final synchronized long m() {
        if (this.h != null && this.s == null) {
            return Math.max(this.q - this.b.e(), 0L);
        }
        return 0L;
    }

    private final void n(dwaw dwawVar, long j) {
        a(crkc.a(this.j, dwawVar, j, false, this.t));
        this.m.b(new Runnable(this) { // from class: crks
            private final crkv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.c(null, bttq.SINGLE_REQUEST_FATAL_ERROR);
            }
        }, bvrj.NAVIGATION_INTERNAL);
    }

    public final synchronized void a(vmd vmdVar) {
        this.h = vmdVar;
    }

    public final void b() {
        btzc btzcVar;
        btzc btzcVar2;
        synchronized (this) {
            btzcVar = this.g;
            btzcVar2 = this.p;
        }
        if (btzcVar != null) {
            btzcVar.a();
        }
        if (btzcVar2 != null) {
            btzcVar2.a();
        }
    }

    public final synchronized void c(@dzsi crke crkeVar, @dzsi bttq bttqVar) {
        k(this.n);
        if (bttqVar == null || this.i == null || !this.r) {
            l(crkeVar, bttqVar);
        } else {
            this.s = bttqVar;
        }
    }

    public final synchronized void d(@dzsi final crke crkeVar, @dzsi final bttq bttqVar) {
        k(this.o);
        if (this.r) {
            if ((crkeVar != null && crkeVar.a == dovb.SUCCESS) || this.h == null) {
                this.m.a(new Runnable(this, crkeVar, bttqVar) { // from class: crkq
                    private final crkv a;
                    private final crke b;
                    private final bttq c;

                    {
                        this.a = this;
                        this.b = crkeVar;
                        this.c = bttqVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        crkv crkvVar = this.a;
                        crke crkeVar2 = this.b;
                        bttq bttqVar2 = this.c;
                        vmd vmdVar = crkvVar.i;
                        dbsk.s(vmdVar);
                        if (crkvVar.f()) {
                            if (crkeVar2 == null) {
                                crkeVar2 = crkvVar.e(vmdVar);
                            } else {
                                amsy amsyVar = crkeVar2.c;
                                if (amsyVar != null) {
                                    dwaw a2 = vmdVar.a();
                                    dwbc dwbcVar = amsyVar.a;
                                    if (a2 != null && dwbcVar != null) {
                                        crkvVar.d.b(new cros(a2, dwbcVar));
                                    }
                                }
                            }
                            crkvVar.g(crkeVar2, bttqVar2);
                            btzc btzcVar = crkvVar.g;
                            if (btzcVar != null) {
                                btzcVar.a();
                            }
                            amsy amsyVar2 = crkeVar2.c;
                            if (amsyVar2 == null) {
                                return;
                            }
                            crkvVar.e.u(new avtq(crkvVar.b, vmdVar.a(), amsyVar2.a));
                        }
                    }
                }, bvrj.BACKGROUND_THREADPOOL, m());
                return;
            }
            bttq bttqVar2 = this.s;
            if (bttqVar2 != null) {
                l(null, bttqVar2);
            }
        }
    }

    public final crke e(vmd vmdVar) {
        dwaw a2 = vmdVar.a();
        return crke.b(a2, vmdVar.d(), null, this.j, vmdVar.c(), vmg.c(a2));
    }

    public final synchronized boolean f() {
        if (this.r) {
            this.r = false;
            return true;
        }
        return false;
    }

    public final void g(crke crkeVar, @dzsi bttq bttqVar) {
        this.d.b(new crkf(this, crkeVar, bttqVar));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(dwaw dwawVar, boolean z, boolean z2) {
        long b = this.b.b();
        dvzy dvzyVar = dwawVar.b;
        if (dvzyVar == null) {
            dvzyVar = dvzy.u;
        }
        if (dvzyVar.d.size() < 2) {
            n(dwawVar, b);
            return;
        }
        boolean i = this.k.i();
        if (i) {
            vmd a2 = crkc.a(this.j, dwawVar, b, z, this.t);
            a(a2);
            j(this.n);
            this.g = this.c.a(a2);
        }
        if (z2) {
            vmd a3 = crkc.a(this.j, dwawVar, b, z, this.u);
            i(a3);
            j(this.o);
            this.p = this.l.e(a3.a(), a3.b(), a3.f(), bvrj.BACKGROUND_THREADPOOL);
        }
        if (i || z2) {
            return;
        }
        this.m.b(new Runnable(this) { // from class: crkr
            private final crkv a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.d.b(new crma());
            }
        }, bvrj.NAVIGATION_INTERNAL);
        n(dwawVar, b);
    }
}
