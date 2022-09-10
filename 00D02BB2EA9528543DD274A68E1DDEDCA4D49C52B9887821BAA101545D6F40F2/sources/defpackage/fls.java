package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fls  reason: default package */
/* loaded from: classes6.dex */
public final class fls implements dxis {
    public volatile dzsj<aojt> a;
    public volatile dzsj b;
    public volatile apkf c;
    public volatile dzsj<apkf> d;
    public volatile dzsj e;
    public volatile dzsj<aofe> f;
    public final dzsj<aoqj> g;
    final /* synthetic */ ftt h;
    private final aoqj i;
    private volatile dzsj<anpc> l;
    private volatile dzsj<apjv> m;
    private volatile dzsj<anqx> n;
    private volatile dzsj<anru> o;
    private volatile dzsj<aoiw> p;
    private volatile dzsj<aojq> q;
    private volatile dzsj<anpb> r;
    private volatile dzsj<anqv> s;
    private volatile dzsj<anrz> t;
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object v = new dxjf();

    public fls(ftt fttVar, aoqj aoqjVar) {
        this.h = fttVar;
        this.i = aoqjVar;
        this.g = dxjd.b(aoqjVar);
    }

    private final Object i() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    obj = new aoqh();
                    dxjc.d(this.j, obj);
                    this.j = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final aotx j() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    obj = new aotx(this.h.dH());
                    dxjc.d(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (aotx) obj2;
    }

    private final dzsj<apjv> k() {
        dzsj<apjv> dzsjVar = this.m;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 1);
            this.m = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    private final aorm l() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    dzsj<Application> m = this.h.eW.m();
                    dzsj<jjm> kI = this.h.kI();
                    dzsj<anpc> b = b();
                    dzsj<apjv> k = k();
                    dzsj dzsjVar = this.r;
                    if (dzsjVar == null) {
                        dzsjVar = new flr(this, 2);
                        this.r = dzsjVar;
                    }
                    aoqf aoqfVar = new aoqf(m, kI, b, k, dzsjVar);
                    dzsj<Application> m2 = this.h.eW.m();
                    dzsj dzsjVar2 = this.s;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new flr(this, 9);
                        this.s = dzsjVar2;
                    }
                    obj = new aorm(aoqfVar, new aoru(m2, dzsjVar2, this.g, this.h.kI(), k(), e(), h()), c());
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (aorm) obj2;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        aoqj aoqjVar = (aoqj) obj;
        cjqq tp = this.h.eW.a.tp();
        dxjg.e(tp);
        aoqjVar.aH = tp;
        cjqy tr = this.h.eW.a.tr();
        dxjg.e(tr);
        aoqjVar.aI = tr;
        aoqjVar.aJ = dbsg.i(this.h.ap());
        Executor sU = this.h.eW.a.sU();
        dxjg.e(sU);
        aoqjVar.aK = sU;
        aoqjVar.aL = new cpv();
        aoqjVar.aM = dxjc.c(this.h.eW.ie());
        aoqjVar.aN = dxjc.c(this.h.eW.iU());
        dxjc.c(this.h.lx());
        bwqv rD = this.h.eW.a.rD();
        dxjg.e(rD);
        aoqjVar.a = new anpf(rD);
        ftt fttVar = this.h;
        aoqjVar.b = new apjy(fttVar.a, dxjc.c(fttVar.kI()), dxjc.c(this.h.sw()));
        aoqjVar.c = this.h.eW.rw();
        aoqjVar.d = (aoqh) i();
        aoqjVar.e = this.h.eW.jD();
        ftt fttVar2 = this.h;
        rb rbVar = fttVar2.a;
        aoqj aoqjVar2 = this.i;
        gfq wd = fttVar2.wd();
        aotx j = j();
        angv jD = this.h.eW.jD();
        aorm l = l();
        aoha q = this.i.q();
        dxjg.f(q);
        aoqjVar.f = new aoqi(rbVar, aoqjVar2, wd, j, jD, l, q, (aoqh) i());
        aoqjVar.g = j();
        bwqv rD2 = this.h.eW.a.rD();
        dxjg.e(rD2);
        aoqjVar.ad = rD2;
        aoqjVar.ae = new apke(this.i, this.h.dH(), l());
        Object obj3 = this.v;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.v;
                if (obj2 instanceof dxjf) {
                    aoqj aoqjVar3 = this.i;
                    cqat rR = this.h.eW.a.rR();
                    dxjg.e(rR);
                    obj2 = new anqs(aoqjVar3, rR);
                    dxjc.d(this.v, obj2);
                    this.v = obj2;
                }
            }
            obj3 = obj2;
        }
        aoqjVar.af = (anqs) obj3;
        aoqjVar.ag = l();
        ftt fttVar3 = this.h;
        aoqjVar.ah = new apkv(fttVar3.eV, fttVar3.sw(), this.h.y());
        aoqjVar.ai = this.h.wl();
        aoqjVar.aj = this.h.wq();
        bvjj rB = this.h.eW.a.rB();
        dxjg.e(rB);
        aoqjVar.ak = rB;
        aoqjVar.al = this.h.cJ();
        aoqjVar.am = new aplg(this.h.cv());
        aoqjVar.an = new aoug(this.h.eW.m(), this.h.eW.aw(), this.h.eW.ax(), this.h.eW.an(), this.h.eW.R());
    }

    public final dzsj<anpc> b() {
        dzsj<anpc> dzsjVar = this.l;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 0);
            this.l = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    public final apjv c() {
        gga wk = this.h.wk();
        anhg aW = this.h.aW();
        dxio c = dxjc.c(this.h.bh());
        apkm dN = this.h.dN();
        dxjg.e(this.h.eW.a.rB());
        this.h.eW.am();
        cpv cpvVar = new cpv();
        this.h.eW.jJ();
        dxjg.e(this.h.eW.a.rp());
        return new apjv(wk, aW, c, dN, cpvVar);
    }

    public final dzsj<anqx> d() {
        dzsj<anqx> dzsjVar = this.n;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 3);
            this.n = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    public final dzsj<anru> e() {
        dzsj<anru> dzsjVar = this.o;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 4);
            this.o = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    public final dzsj<aoiw> f() {
        dzsj<aoiw> dzsjVar = this.p;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 5);
            this.p = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    public final dzsj<aojq> g() {
        dzsj<aojq> dzsjVar = this.q;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 8);
            this.q = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }

    public final dzsj<anrz> h() {
        dzsj<anrz> dzsjVar = this.t;
        if (dzsjVar == null) {
            flr flrVar = new flr(this, 10);
            this.t = flrVar;
            return flrVar;
        }
        return dzsjVar;
    }
}
