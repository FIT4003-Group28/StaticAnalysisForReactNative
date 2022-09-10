package defpackage;

import android.app.Application;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fsf  reason: default package */
/* loaded from: classes6.dex */
public final class fsf implements dxis {
    public volatile dzsj<qsm> a;
    public volatile dzsj<qsp> b;
    public volatile dzsj<wqy> c;
    public volatile dzsj<ivg> e;
    public volatile dzsj<gun> f;
    public volatile dzsj<cjbh> g;
    public volatile dzsj<xcs> h;
    public volatile dzsj<cjbt> i;
    public volatile dzsj<qok> j;
    public volatile dzsj<vox> k;
    public volatile dzsj<xmg> l;
    public volatile dzsj<qkc> m;
    final /* synthetic */ ftt n;
    private volatile dzsj<xlu> u;
    private volatile dzsj<qoq> w;
    private volatile dzsj<qpe> x;
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object q = new dxjf();
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    private volatile Object t = new dxjf();
    public volatile Object d = new dxjf();
    private volatile Object v = new dxjf();

    public fsf(ftt fttVar) {
        this.n = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        xcb xcbVar = (xcb) obj;
        cjqq tp = this.n.eW.a.tp();
        dxjg.e(tp);
        xcbVar.aH = tp;
        cjqy tr = this.n.eW.a.tr();
        dxjg.e(tr);
        xcbVar.aI = tr;
        xcbVar.aJ = dbsg.i(this.n.ap());
        Executor sU = this.n.eW.a.sU();
        dxjg.e(sU);
        xcbVar.aK = sU;
        xcbVar.aL = new cpv();
        xcbVar.aM = dxjc.c(this.n.eW.ie());
        xcbVar.aN = dxjc.c(this.n.eW.iU());
        dxjc.c(this.n.lx());
        xcbVar.a = this.n.wq();
        xcbVar.b = this.n.wl();
        dzsj dzsjVar = this.w;
        if (dzsjVar == null) {
            dzsjVar = new fse(this, 0);
            this.w = dzsjVar;
        }
        dzsj dzsjVar2 = this.x;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fse(this, 14);
            this.x = dzsjVar2;
        }
        xcbVar.c = new xch(dzsjVar, dzsjVar2);
        xcbVar.d = g();
        btrm rz = this.n.eW.a.rz();
        dxjg.e(rz);
        xcbVar.e = rz;
        xcbVar.f = new vot(this.n.eV);
    }

    public final xlc b() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    Application a = this.n.eW.a.a();
                    dxjg.e(a);
                    btvo rp = this.n.eW.a.rp();
                    dxjg.e(rp);
                    obj = new xlc(a, rp, dxjc.c(this.n.bH()));
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj2 = obj;
        }
        return (xlc) obj2;
    }

    public final Object c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.r;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.r;
                if (obj instanceof dxjf) {
                    Resources c = this.n.eW.a.c();
                    dxjg.e(c);
                    akox ap = this.n.ap();
                    aifb dp = this.n.dp();
                    Object obj5 = this.o;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.o;
                            if (obj2 instanceof dxjf) {
                                Resources c2 = this.n.eW.a.c();
                                dxjg.e(c2);
                                obj2 = xma.b(c2, this.n.eW.g());
                                dxjc.d(this.o, obj2);
                                this.o = obj2;
                            }
                        }
                    } else {
                        obj2 = obj5;
                    }
                    Object obj6 = this.q;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj3 = this.q;
                            if (obj3 instanceof dxjf) {
                                Application a = this.n.eW.a.a();
                                dxjg.e(a);
                                xlc b = b();
                                cqat rR = this.n.eW.a.rR();
                                dxjg.e(rR);
                                obj3 = new xla(a, b, rR);
                                dxjc.d(this.q, obj3);
                                this.q = obj3;
                            }
                        }
                        obj6 = obj3;
                    }
                    obj = xlk.b(c, ap, dp, obj2, (xla) obj6, new aiew(this.n.ap()));
                    dxjc.d(this.r, obj);
                    this.r = obj;
                }
            }
            return obj;
        }
        return obj4;
    }

    public final xmn d() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof dxjf) {
                    cjqy tr = this.n.eW.a.tr();
                    dxjg.e(tr);
                    cqat rR = this.n.eW.a.rR();
                    dxjg.e(rR);
                    obj = new xmn(tr, rR);
                    dxjc.d(this.s, obj);
                    this.s = obj;
                }
            }
            obj2 = obj;
        }
        return (xmn) obj2;
    }

    public final xmg e() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    Application a = this.n.eW.a.a();
                    dxjg.e(a);
                    obj = new xmg(a, this.n.bM(), this.n.eW.wf(), this.n.ap());
                    dxjc.d(this.t, obj);
                    this.t = obj;
                }
            }
            obj2 = obj;
        }
        return (xmg) obj2;
    }

    public final dzsj<xlu> f() {
        dzsj<xlu> dzsjVar = this.u;
        if (dzsjVar == null) {
            fse fseVar = new fse(this, 5);
            this.u = fseVar;
            return fseVar;
        }
        return dzsjVar;
    }

    public final qkc g() {
        Object obj;
        Object obj2 = this.v;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.v;
                if (obj instanceof dxjf) {
                    Application a = this.n.eW.a.a();
                    dxjg.e(a);
                    akox ap = this.n.ap();
                    dxio c = dxjc.c(this.n.H());
                    btvo rp = this.n.eW.a.rp();
                    dxjg.e(rp);
                    cjqy tr = this.n.eW.a.tr();
                    dxjg.e(tr);
                    cjqq tp = this.n.eW.a.tp();
                    dxjg.e(tp);
                    Executor sU = this.n.eW.a.sU();
                    dxjg.e(sU);
                    obj = qkd.b(a, ap, c, rp, tr, tp, sU);
                    dxjc.d(this.v, obj);
                    this.v = obj;
                }
            }
            obj2 = obj;
        }
        return (qkc) obj2;
    }
}
