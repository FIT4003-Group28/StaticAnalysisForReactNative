package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: crgj  reason: default package */
/* loaded from: classes5.dex */
public final class crgj implements crgx, btph {
    public final crkm a;
    public final crji b;
    public final craw c;
    @dzsi
    public volatile arym d = null;
    @dzsi
    public GmmLocation e = null;
    private final Context f;
    private final btrm g;
    private final crgy h;
    private final crgy i;
    private final crgv j;
    private final ckcw k;
    @dzsi
    private crfo l;

    public crgj(Application application, btrm btrmVar, crkm crkmVar, crgy crgyVar, crji crjiVar, crgy crgyVar2, crgv crgvVar, ckcw ckcwVar, craw crawVar) {
        this.f = application;
        this.g = btrmVar;
        dbsk.t(crkmVar, "navigationInternal");
        this.a = crkmVar;
        dbsk.t(crgyVar, "guidedNavLifecycle");
        this.h = crgyVar;
        dbsk.t(crjiVar, "freeNavInternal");
        this.b = crjiVar;
        dbsk.t(crgyVar2, "freeNavLifecycle");
        this.i = crgyVar2;
        dbsk.t(crgvVar, "navigationSystemHealthTracker");
        this.j = crgvVar;
        this.k = ckcwVar;
        dbsk.s(crawVar);
        this.c = crawVar;
    }

    private final void j(crgz crgzVar) {
        bvmn bvmnVar = bvmo.a;
        boolean z = false;
        k(false);
        if (this.d == null) {
            z = true;
        }
        dbsk.l(z);
        this.j.c(crgzVar.a);
        this.d = crgzVar.a;
        arym arymVar = arym.FREE_NAV;
        int ordinal = crgzVar.a.ordinal();
        if (ordinal == 0) {
            this.i.a(crgzVar);
            GmmLocation gmmLocation = this.e;
            if (gmmLocation == null) {
                return;
            }
            this.b.d(gmmLocation);
        } else if (ordinal != 1) {
        } else {
            this.h.a(crgzVar);
            GmmLocation gmmLocation2 = this.e;
            if (gmmLocation2 == null) {
                return;
            }
            this.a.k(gmmLocation2);
        }
    }

    private final void k(boolean z) {
        if (this.d == null) {
            return;
        }
        arym arymVar = arym.FREE_NAV;
        int ordinal = this.d.ordinal();
        if (ordinal == 0) {
            crji crjiVar = this.b;
            synchronized (crjiVar.m) {
                crjiVar.n = false;
            }
            this.i.b(z);
        } else if (ordinal == 1) {
            this.a.f();
            this.h.b(z);
        }
        this.d = null;
        this.g.b(new crhs());
        this.j.d(z);
    }

    @Override // defpackage.crgx, defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        bvrj.UI_THREAD.c();
        printWriter.println("".concat("NavigationModeController:"));
        String valueOf = String.valueOf(this.d);
        StringBuilder sb = new StringBuilder(20 + String.valueOf(valueOf).length());
        sb.append("");
        sb.append("  currentlyRunning: ");
        sb.append(valueOf);
        printWriter.println(sb.toString());
    }

    @Override // defpackage.crgx
    public final void a() {
        btrm btrmVar = this.g;
        dceq a = dcet.a();
        a.b(crid.class, new crgk(0, crid.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(amqo.class, new crgk(1, amqo.class, this, bvrj.NAVIGATION_INTERNAL));
        a.b(crie.class, new crgk(2, crie.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a.a());
    }

    @Override // defpackage.crgx
    public final void b() {
        this.g.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(@dzsi crfo crfoVar) {
        if (crfoVar != null) {
            dbsk.a(crfoVar.a.equals(arym.FREE_NAV));
        }
        this.l = crfoVar;
        if (crfoVar != null && this.d == null) {
            e(crfoVar);
        }
    }

    public final void e(crfo crfoVar) {
        bvmn bvmnVar = bvmo.a;
        bvrj.NAVIGATION_INTERNAL.c();
        if (crfoVar.a != arym.GUIDED_NAV || !crfoVar.a().j().b) {
            this.g.b(crhr.b(false));
        } else {
            this.g.b(crhr.b(true));
        }
        int ordinal = crfoVar.a.ordinal();
        if (ordinal == 0) {
            i(crfoVar);
        } else if (ordinal != 1) {
        } else {
            amte a = crfoVar.a();
            amuh g = amuh.g(a, this.f, crfoVar.d);
            if (this.d == arym.FREE_NAV && !a.h()) {
                amtq<cqzw> c = this.b.c(a.f());
                if (c.isEmpty()) {
                    ((ckco) this.k.a(ckhi.aL)).a(crgi.a(1));
                } else {
                    cqzw b = c.b();
                    if (b == null) {
                        b = c.get(0);
                    }
                    amub k = g.k();
                    dspd dspdVar = k.Q;
                    dspd dspdVar2 = b.g.Q;
                    if (dspdVar == null || dspdVar2 == null || !dspdVar.equals(dspdVar2)) {
                        ((ckco) this.k.a(ckhi.aL)).a(crgi.a(2));
                    } else {
                        crap crapVar = b.a;
                        akqq akqqVar = crapVar == null ? null : new akqq(((crad) crapVar).a.a(), ((crad) b.a).a.b());
                        if (akqqVar == null) {
                            ((ckco) this.k.a(ckhi.aL)).a(crgi.a(3));
                        } else if (!vxm.b(k, b.g, akra.f(akqqVar))) {
                            ((ckco) this.k.a(ckhi.aL)).a(crgi.a(4));
                        } else {
                            g(b, c, crfoVar.k, crfoVar);
                            return;
                        }
                    }
                }
            }
            h(g, g.k().h, crfoVar.k, crfoVar);
        }
    }

    public final void f(boolean z) {
        bvrj.NAVIGATION_INTERNAL.c();
        k(z);
        crfo crfoVar = this.l;
        if (crfoVar != null) {
            i(crfoVar);
        }
    }

    public final void g(cqzw cqzwVar, List<cqzw> list, @dzsi dspd dspdVar, @dzsi crfo crfoVar) {
        j(new crgz(arym.GUIDED_NAV, cqzwVar.g.h, crfoVar));
        crkm crkmVar = this.a;
        bvrj.NAVIGATION_INTERNAL.c();
        dbsk.a(!list.isEmpty());
        crkmVar.e(cqzwVar.g, dspdVar);
        crkp crkpVar = crkmVar.j;
        if (crkpVar != null) {
            crkpVar.a();
        }
        crkmVar.t.clear();
        crkmVar.t.addAll(list);
        crkmVar.C(cqzwVar, false, false, 1);
    }

    public final void h(amuh amuhVar, dqvj dqvjVar, @dzsi dspd dspdVar, @dzsi crfo crfoVar) {
        boolean z = amuhVar.b() != 0;
        j(new crgz(arym.GUIDED_NAV, dqvjVar, crfoVar));
        crkm crkmVar = this.a;
        bvmn bvmnVar = bvmo.a;
        bvrj.NAVIGATION_INTERNAL.c();
        crkmVar.e(amuhVar.k(), dspdVar);
        crkp crkpVar = crkmVar.j;
        if (crkpVar != null) {
            crkpVar.a();
        }
        crkmVar.A(amuhVar, false, z, 1);
        crkmVar.m.c.b(new ahmu(null));
    }

    public final void i(crfo crfoVar) {
        boolean z = this.d == arym.GUIDED_NAV && this.a.o.b != null;
        j(new crgz(crfoVar.a, crfoVar.b().a(), crfoVar));
        crji crjiVar = this.b;
        asbz b = crfoVar.b();
        crjiVar.b.e();
        criy criyVar = crjiVar.d;
        criyVar.a = null;
        criyVar.b = false;
        crjiVar.c.f = b.a();
        crjiVar.c.c = true;
        crjiVar.j.i = b.a();
        crjiVar.j.n = z;
        crjiVar.k.i = b.a();
        crjiVar.k.n = false;
        crjiVar.l = b.c();
        synchronized (crjiVar.m) {
            crjiVar.n = true;
        }
        crjiVar.a.b(new crhb(b));
        crjiVar.h(crjiVar.j);
        criw criwVar = crjiVar.k;
        if (criwVar.j) {
            crjiVar.h(criwVar);
        }
        amte a = crjiVar.h.a();
        if (!((mwo) crjiVar.f).a) {
            if (a != null && a.h() && crjiVar.i.a() != null) {
                amte a2 = yyt.a(a);
                crjiVar.h.c(a2, true);
                amvh[] amvhVarArr = a2.c;
                ArrayList arrayList = new ArrayList();
                for (int i = 1; i < amvhVarArr.length; i++) {
                    arrayList.add(amvhVarArr[i]);
                }
                crjiVar.g(arrayList, null, true, null);
            }
            crjiVar.h.d();
            crjiVar.i.b();
        }
    }
}
