package defpackage;

import android.app.Application;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eoa  reason: default package */
/* loaded from: classes6.dex */
public final class eoa implements dxis {
    private volatile dzsj<qqe> A;
    private volatile dzsj<qqy> B;
    public volatile dzsj<qsp> a;
    public volatile dzsj<wqy> b;
    public volatile dzsj<ivg> d;
    public volatile dzsj<gun> e;
    public volatile dzsj<cjbh> f;
    public volatile dzsj<xcs> g;
    public volatile dzsj<cjbt> h;
    public volatile dzsj<qok> i;
    public volatile dzsj<vox> j;
    public volatile dzsj<xmg> k;
    public volatile dzsj<qkc> l;
    final /* synthetic */ ftt m;
    private volatile dzsj<yzi> n;
    private volatile dzsj<qwx> o;
    private volatile dzsj<qsm> p;
    private volatile dzsj<xlu> w;
    private volatile dzsj<qoq> y;
    private volatile dzsj<qpe> z;
    private volatile Object q = new dxjf();
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    private volatile Object t = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object v = new dxjf();
    public volatile Object c = new dxjf();
    private volatile Object x = new dxjf();

    public eoa(ftt fttVar) {
        this.m = fttVar;
    }

    private final dzsj<yzi> i() {
        dzsj<yzi> dzsjVar = this.n;
        if (dzsjVar == null) {
            enz enzVar = new enz(this, 0);
            this.n = enzVar;
            return enzVar;
        }
        return dzsjVar;
    }

    /* JADX WARN: Type inference failed for: r2v41, types: [java.lang.Object, qus] */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object, qva] */
    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        qjx qjxVar = (qjx) obj;
        cjqq tp = this.m.eW.a.tp();
        dxjg.e(tp);
        qjxVar.aH = tp;
        cjqy tr = this.m.eW.a.tr();
        dxjg.e(tr);
        qjxVar.aI = tr;
        qjxVar.aJ = dbsg.i(this.m.ap());
        Executor sU = this.m.eW.a.sU();
        dxjg.e(sU);
        qjxVar.aK = sU;
        qjxVar.aL = new cpv();
        qjxVar.aM = dxjc.c(this.m.eW.ie());
        qjxVar.aN = dxjc.c(this.m.eW.iU());
        dxjc.c(this.m.lx());
        cqat rR = this.m.eW.a.rR();
        dxjg.e(rR);
        qjxVar.a = rR;
        qjxVar.b = this.m.wq();
        qjxVar.c = this.m.wl();
        ftt fttVar = this.m;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<cqhn> il = fttVar.eW.il();
        dzsj c = dxjh.c(this.m.H());
        dzsj c2 = dxjh.c(this.m.hP());
        dzsj c3 = dxjh.c(this.m.q());
        dzsj<isd> jn = this.m.jn();
        dzsj<yzi> i = i();
        dzsj dzsjVar2 = this.o;
        if (dzsjVar2 == null) {
            dzsjVar2 = new enz(this, 1);
            this.o = dzsjVar2;
        }
        qjxVar.d = new qpn(dzsjVar, il, c, c2, c3, jn, i, dxjh.c(dzsjVar2), this.m.eW.ik(), this.m.eW.V());
        ftt fttVar2 = this.m;
        dzsj<rb> dzsjVar3 = fttVar2.eV;
        dzsj c4 = dxjh.c(fttVar2.eW.k());
        dzsj dzsjVar4 = this.y;
        if (dzsjVar4 == null) {
            dzsjVar4 = new enz(this, 2);
            this.y = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj<cqat> K = this.m.eW.K();
        dzsj<ros> hP = this.m.hP();
        dzsj<cqhn> il2 = this.m.eW.il();
        dzsj c5 = dxjh.c(this.m.H());
        dzsj<qsm> b = b();
        dzsj<cjqy> al = this.m.eW.al();
        dzsj<cjqq> hN = this.m.eW.hN();
        dzsj dzsjVar6 = this.z;
        if (dzsjVar6 == null) {
            dzsjVar6 = new enz(this, 16);
            this.z = dzsjVar6;
        }
        qjxVar.e = new qpi(dzsjVar3, c4, dzsjVar5, K, hP, il2, c5, b, al, hN, dzsjVar6, this.m.eW.aw(), this.m.eW.V(), this.m.eW.ik());
        ftt fttVar3 = this.m;
        qjxVar.f = new ivt(fttVar3.eV, dxjh.c(fttVar3.H()), this.m.eW.ik(), this.m.aV());
        qjxVar.g = this.m.eW.fk();
        qjxVar.ad = this.m.ts();
        qjxVar.ae = h();
        btvo rp = this.m.eW.a.rp();
        dxjg.e(rp);
        qjxVar.af = rp;
        qjxVar.ag = dxjc.c(this.m.fy());
        btrm rz = this.m.eW.a.rz();
        dxjg.e(rz);
        qjxVar.ah = rz;
        dzsj<gga> ad = this.m.ad();
        dzsj dzsjVar7 = this.A;
        if (dzsjVar7 == null) {
            dzsjVar7 = new enz(this, 17);
            this.A = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj<bvjj> aw = this.m.eW.aw();
        dzsj<jdj> fA = this.m.fA();
        dzsj<yzi> i2 = i();
        dzsj<cqkj> y = this.m.y();
        dzsj<cqhu> eS = this.m.eS();
        dzsj dzsjVar9 = this.B;
        if (dzsjVar9 == null) {
            dzsjVar9 = new enz(this, 18);
            this.B = dzsjVar9;
        }
        qjxVar.ai = new qqg(ad, dzsjVar8, aw, fA, i2, y, eS, dzsjVar9);
        qjxVar.aj = this.m.eW.cH();
        qjxVar.ak = this.m.tu();
        qjxVar.al = new cqhn();
        qjxVar.am = this.m.eW.bW();
        qjxVar.an = new cjxo(this.m.a);
        dehq tf = this.m.eW.a.tf();
        dxjg.e(tf);
        qjxVar.ao = tf;
    }

    public final dzsj<qsm> b() {
        dzsj<qsm> dzsjVar = this.p;
        if (dzsjVar == null) {
            enz enzVar = new enz(this, 4);
            this.p = enzVar;
            return enzVar;
        }
        return dzsjVar;
    }

    public final xlc c() {
        Object obj;
        Object obj2 = this.r;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.r;
                if (obj instanceof dxjf) {
                    Application a = this.m.eW.a.a();
                    dxjg.e(a);
                    btvo rp = this.m.eW.a.rp();
                    dxjg.e(rp);
                    obj = new xlc(a, rp, dxjc.c(this.m.bH()));
                    dxjc.d(this.r, obj);
                    this.r = obj;
                }
            }
            obj2 = obj;
        }
        return (xlc) obj2;
    }

    public final Object d() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.t;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    Resources c = this.m.eW.a.c();
                    dxjg.e(c);
                    akox ap = this.m.ap();
                    aifb dp = this.m.dp();
                    Object obj5 = this.q;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.q;
                            if (obj2 instanceof dxjf) {
                                Resources c2 = this.m.eW.a.c();
                                dxjg.e(c2);
                                obj2 = xma.b(c2, this.m.eW.g());
                                dxjc.d(this.q, obj2);
                                this.q = obj2;
                            }
                        }
                    } else {
                        obj2 = obj5;
                    }
                    Object obj6 = this.s;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj3 = this.s;
                            if (obj3 instanceof dxjf) {
                                Application a = this.m.eW.a.a();
                                dxjg.e(a);
                                xlc c3 = c();
                                cqat rR = this.m.eW.a.rR();
                                dxjg.e(rR);
                                obj3 = new xla(a, c3, rR);
                                dxjc.d(this.s, obj3);
                                this.s = obj3;
                            }
                        }
                        obj6 = obj3;
                    }
                    obj = xlk.b(c, ap, dp, obj2, (xla) obj6, new aiew(this.m.ap()));
                    dxjc.d(this.t, obj);
                    this.t = obj;
                }
            }
            return obj;
        }
        return obj4;
    }

    public final xmn e() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    cjqy tr = this.m.eW.a.tr();
                    dxjg.e(tr);
                    cqat rR = this.m.eW.a.rR();
                    dxjg.e(rR);
                    obj = new xmn(tr, rR);
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (xmn) obj2;
    }

    public final xmg f() {
        Object obj;
        Object obj2 = this.v;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.v;
                if (obj instanceof dxjf) {
                    Application a = this.m.eW.a.a();
                    dxjg.e(a);
                    obj = new xmg(a, this.m.bM(), this.m.eW.wf(), this.m.ap());
                    dxjc.d(this.v, obj);
                    this.v = obj;
                }
            }
            obj2 = obj;
        }
        return (xmg) obj2;
    }

    public final dzsj<xlu> g() {
        dzsj<xlu> dzsjVar = this.w;
        if (dzsjVar == null) {
            enz enzVar = new enz(this, 7);
            this.w = enzVar;
            return enzVar;
        }
        return dzsjVar;
    }

    public final qkc h() {
        Object obj;
        Object obj2 = this.x;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.x;
                if (obj instanceof dxjf) {
                    Application a = this.m.eW.a.a();
                    dxjg.e(a);
                    akox ap = this.m.ap();
                    dxio c = dxjc.c(this.m.H());
                    btvo rp = this.m.eW.a.rp();
                    dxjg.e(rp);
                    cjqy tr = this.m.eW.a.tr();
                    dxjg.e(tr);
                    cjqq tp = this.m.eW.a.tp();
                    dxjg.e(tp);
                    Executor sU = this.m.eW.a.sU();
                    dxjg.e(sU);
                    obj = qkd.b(a, ap, c, rp, tr, tp, sU);
                    dxjc.d(this.x, obj);
                    this.x = obj;
                }
            }
            obj2 = obj;
        }
        return (qkc) obj2;
    }
}
