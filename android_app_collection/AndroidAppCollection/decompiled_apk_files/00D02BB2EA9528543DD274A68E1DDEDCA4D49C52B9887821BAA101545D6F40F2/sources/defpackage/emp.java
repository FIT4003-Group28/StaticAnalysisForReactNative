package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: emp  reason: default package */
/* loaded from: classes6.dex */
final class emp implements dxis {
    final /* synthetic */ ftt a;
    private final arju b;
    private volatile arlc h;
    private volatile dzsj<dlf> j;
    private volatile Object c = new dxjf();
    private volatile Object d = new dxjf();
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();
    private volatile Object i = new dxjf();
    private volatile Object k = new dxjf();
    private volatile Object l = new dxjf();
    private volatile Object m = new dxjf();
    private volatile Object n = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object q = new dxjf();

    public emp(ftt fttVar, arju arjuVar) {
        this.a = fttVar;
        this.b = arjuVar;
    }

    private final armt b() {
        Object obj;
        Object obj2 = this.c;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.c;
                if (obj instanceof dxjf) {
                    obj = new armt(new cqhn(), this.a.wd(), this.b, this.a.eW.e(), this.a.h());
                    dxjc.d(this.c, obj);
                    this.c = obj;
                }
            }
            obj2 = obj;
        }
        return (armt) obj2;
    }

    private final czz c() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.d;
                if (obj instanceof dxjf) {
                    arle em = this.a.em();
                    czz czzVar = em.e;
                    if (czzVar == null) {
                        czx a = em.b.a(em.a, czh.WALKING_NAVIGATION);
                        a.e(em.f);
                        a.c(true);
                        a.d(em.c);
                        czzVar = a.a();
                        em.e = czzVar;
                    }
                    obj = czzVar;
                    dxjg.f(obj);
                    dxjc.d(this.d, obj);
                    this.d = obj;
                }
            }
            obj2 = obj;
        }
        return (czz) obj2;
    }

    private final armu d() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    rb rbVar = this.a.a;
                    bwqv rD = this.a.eW.a.rD();
                    dxjg.e(rD);
                    armu armuVar = new armu(rbVar, rD, dxjc.c(this.a.az()));
                    dxjc.d(this.e, armuVar);
                    this.e = armuVar;
                    obj = armuVar;
                }
            }
            obj2 = obj;
        }
        return (armu) obj2;
    }

    private final armx e() {
        Object obj;
        Object obj2 = this.f;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.f;
                if (obj instanceof dxjf) {
                    obj = new armx(c(), new cqhn(), this.a.eW.kE(), d());
                    dxjc.d(this.f, obj);
                    this.f = obj;
                }
            }
            obj2 = obj;
        }
        return (armx) obj2;
    }

    private final arkr f() {
        Object obj;
        Object obj2 = this.g;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.g;
                if (obj instanceof dxjf) {
                    btrm rz = this.a.eW.a.rz();
                    dxjg.e(rz);
                    bwqv rD = this.a.eW.a.rD();
                    dxjg.e(rD);
                    arkr arkrVar = new arkr(rz, new atlo(), rD);
                    dxjc.d(this.g, arkrVar);
                    this.g = arkrVar;
                    obj = arkrVar;
                }
            }
            obj2 = obj;
        }
        return (arkr) obj2;
    }

    private final czt g() {
        Object obj;
        Object obj2 = this.i;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.i;
                if (obj instanceof dxjf) {
                    dbsg<czc> dbsgVar = this.a.eW.kF().a;
                    dbsk.a(dbsgVar.a());
                    obj = dbsgVar.b().b();
                    dxjg.f(obj);
                    dxjc.d(this.i, obj);
                    this.i = obj;
                }
            }
            obj2 = obj;
        }
        return (czt) obj2;
    }

    private final arku h() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    arju arjuVar = this.b;
                    dxio c = dxjc.c(this.a.H());
                    czt g = g();
                    btvo rp = this.a.eW.a.rp();
                    dxjg.e(rp);
                    btrm rz = this.a.eW.a.rz();
                    dxjg.e(rz);
                    arjz kE = this.a.eW.kE();
                    dzsj<akox> as = this.a.as();
                    dzsj dzsjVar = this.j;
                    if (dzsjVar == null) {
                        dzsjVar = new emo();
                        this.j = dzsjVar;
                    }
                    obj = new arku(arjuVar, c, g, rp, rz, kE, new dle(as, dzsjVar, this.a.eW.K(), this.a.eW.Q()));
                    dxjc.d(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (arku) obj2;
    }

    private final cze i() {
        Object obj;
        Object obj2 = this.l;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.l;
                if (obj instanceof dxjf) {
                    Application a = this.a.eW.a.a();
                    dxjg.e(a);
                    dbsg<czc> dbsgVar = this.a.eW.kF().a;
                    dbsk.a(dbsgVar.a());
                    obj = dbsgVar.b().a().a(a);
                    dxjg.f(obj);
                    dxjc.d(this.l, obj);
                    this.l = obj;
                }
            }
            obj2 = obj;
        }
        return (cze) obj2;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        arju arjuVar = (arju) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        arjuVar.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        arjuVar.aI = tr;
        arjuVar.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        arjuVar.aK = sU;
        arjuVar.aL = new cpv();
        arjuVar.aM = dxjc.c(this.a.eW.ie());
        arjuVar.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        arjuVar.b = this.a.wq();
        arjuVar.c = this.a.wl();
        arjuVar.d = b();
        arjuVar.e = e();
        Object obj7 = this.q;
        if (obj7 instanceof dxjf) {
            synchronized (obj7) {
                obj2 = this.q;
                if (obj2 instanceof dxjf) {
                    arkr f = f();
                    armt b = b();
                    armu d = d();
                    Object obj8 = this.m;
                    if (obj8 instanceof dxjf) {
                        synchronized (obj8) {
                            obj6 = this.m;
                            if (obj6 instanceof dxjf) {
                                btvo rp = this.a.eW.a.rp();
                                dxjg.e(rp);
                                arlc arlcVar = this.h;
                                if (arlcVar == null) {
                                    arlcVar = new arlc(this.a.bE(), this.a.eW.kE());
                                    this.h = arlcVar;
                                }
                                czt g = g();
                                czz c = c();
                                arku h = h();
                                cze i = i();
                                dbsg<czo> eu = this.a.eu();
                                cjqq tp2 = this.a.eW.a.tp();
                                dxjg.e(tp2);
                                obj6 = new arko(rp, arlcVar, g, c, h, i, eu, tp2);
                                dxjc.d(this.m, obj6);
                                this.m = obj6;
                            }
                        }
                        obj8 = obj6;
                    }
                    arko arkoVar = (arko) obj8;
                    arku h2 = h();
                    armx e = e();
                    Object obj9 = this.n;
                    if (obj9 instanceof dxjf) {
                        synchronized (obj9) {
                            obj5 = this.n;
                            if (obj5 instanceof dxjf) {
                                obj5 = new arki(i());
                                dxjc.d(this.n, obj5);
                                this.n = obj5;
                            }
                        }
                        obj9 = obj5;
                    }
                    arki arkiVar = (arki) obj9;
                    Object obj10 = this.o;
                    if (obj10 instanceof dxjf) {
                        synchronized (obj10) {
                            obj4 = this.o;
                            if (obj4 instanceof dxjf) {
                                obj4 = new arkl(c(), this.a.ep());
                                dxjc.d(this.o, obj4);
                                this.o = obj4;
                            }
                        }
                        obj10 = obj4;
                    }
                    arkl arklVar = (arkl) obj10;
                    Object obj11 = this.p;
                    if (obj11 instanceof dxjf) {
                        synchronized (obj11) {
                            obj3 = this.p;
                            if (obj3 instanceof dxjf) {
                                obj3 = new arkj(this.a.wk(), this.a.eW.kF(), this.a.eu());
                                dxjc.d(this.p, obj3);
                                this.p = obj3;
                            }
                        }
                        obj11 = obj3;
                    }
                    dccx F = dcdc.F();
                    F.g(b);
                    F.g(d);
                    F.g(arkoVar);
                    F.g(h2);
                    F.g(e);
                    F.g(arkiVar);
                    F.g((arkj) obj11);
                    F.g(f);
                    F.g(arklVar);
                    obj2 = new arkp(F.f());
                    dxjc.d(this.q, obj2);
                    this.q = obj2;
                }
            }
            obj7 = obj2;
        }
        arjuVar.f = (arkp) obj7;
        ftt fttVar = this.a;
        dzsj dzsjVar = fttVar.cm;
        if (dzsjVar == null) {
            dzsjVar = new fns(fttVar, 1248);
            fttVar.cm = dzsjVar;
        }
        arjuVar.g = dxjc.c(dzsjVar);
        arjuVar.ad = f();
        arjuVar.ae = new cjxo(this.a.a);
        btrm rz = this.a.eW.a.rz();
        dxjg.e(rz);
        arjuVar.af = rz;
        arjuVar.ag = this.a.eW.jO();
        arjuVar.ah = c();
    }
}
