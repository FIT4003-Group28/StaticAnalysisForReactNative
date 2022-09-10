package defpackage;

import android.app.Application;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fmv  reason: default package */
/* loaded from: classes6.dex */
public final class fmv implements dxis {
    final /* synthetic */ ftt c;
    private volatile dzsj<ivg> d;
    private volatile dzsj<xcs> e;
    private volatile dzsj<jmn> f;
    private volatile dzsj<wqj> g;
    private volatile dzsj<wqr> h;
    private volatile dzsj<wkg> i;
    private volatile dzsj<wrc> o;
    private volatile dzsj<cjbh> p;
    private volatile dzsj<cjbt> q;
    private volatile dzsj<wrp> r;
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();
    private volatile Object l = new dxjf();
    private volatile Object m = new dxjf();
    private volatile Object n = new dxjf();
    public volatile Object a = new dxjf();
    public volatile Object b = new dxjf();

    public fmv(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        wio wioVar;
        wio wioVar2 = (wio) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        wioVar2.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        wioVar2.aI = tr;
        wioVar2.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        wioVar2.aK = sU;
        wioVar2.aL = new cpv();
        wioVar2.aM = dxjc.c(this.c.eW.ie());
        wioVar2.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        wioVar2.b = new zaa();
        wioVar2.c = this.c.wq();
        wioVar2.d = this.c.wl();
        ftt fttVar = this.c;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<efh> fN = fttVar.fN();
        dzsj dzsjVar2 = this.d;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fmu(this, 0);
            this.d = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = this.c.eW.il();
        dzsj<btrm> n = this.c.eW.n();
        dzsj<ckcw> at = this.c.eW.at();
        dzsj dzsjVar4 = this.e;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fmu(this, 1);
            this.e = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        fyu fyuVar = this.c.eW;
        dzsj dzsjVar6 = fyuVar.ds;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fxy(fyuVar, 643);
            fyuVar.ds = dzsjVar6;
        }
        dzsj dzsjVar7 = this.f;
        if (dzsjVar7 == null) {
            dzsjVar7 = new fmu(this, 2);
            this.f = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj c = dxjh.c(this.c.H());
        dzsj<vsf> jm = this.c.eW.jm();
        dzsj dzsjVar9 = this.g;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fmu(this, 3);
            this.g = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.h;
        if (dzsjVar11 == null) {
            wioVar = wioVar2;
            dzsjVar11 = new fmu(this, 4);
            this.h = dzsjVar11;
        } else {
            wioVar = wioVar2;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj dzsjVar13 = this.i;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fmu(this, 5);
            this.i = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj<btvo> V = this.c.eW.V();
        dzsj<xiy> dzsjVar15 = this.c.to();
        dzsj dzsjVar16 = this.o;
        if (dzsjVar16 == null) {
            dzsjVar16 = new fmu(this, 6);
            this.o = dzsjVar16;
        }
        dzsj dzsjVar17 = dzsjVar16;
        dzsj<xhy> nx = this.c.eW.nx();
        dzsj<bdvy> fr = this.c.fr();
        dzsj dzsjVar18 = this.p;
        if (dzsjVar18 == null) {
            dzsjVar18 = new fmu(this, 7);
            this.p = dzsjVar18;
        }
        dzsj dzsjVar19 = dzsjVar18;
        dzsj dzsjVar20 = this.q;
        if (dzsjVar20 == null) {
            dzsjVar20 = new fmu(this, 8);
            this.q = dzsjVar20;
        }
        dzsj dzsjVar21 = dzsjVar20;
        dzsj dzsjVar22 = this.r;
        if (dzsjVar22 == null) {
            dzsjVar22 = new fmu(this, 9);
            this.r = dzsjVar22;
        }
        wio wioVar3 = wioVar;
        wioVar3.e = new wsd(dzsjVar, fN, dzsjVar3, il, n, at, dzsjVar5, dzsjVar6, dzsjVar8, c, jm, dzsjVar10, dzsjVar12, dzsjVar14, V, dzsjVar15, dzsjVar17, nx, fr, dzsjVar19, dzsjVar21, dzsjVar22);
        btrm rz = this.c.eW.a.rz();
        dxjg.e(rz);
        wioVar3.f = rz;
        wioVar3.g = new bxbe(this.c.da(), this.c.eW.V(), dxjh.c(this.c.ic()));
        wioVar3.ad = new ztb(this.c.a);
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        wioVar3.ae = rp;
        wioVar3.af = dxjc.c(this.c.eW.at());
        btrm rz2 = this.c.eW.a.rz();
        dxjg.e(rz2);
        bvnx rS = this.c.eW.a.rS();
        dxjg.e(rS);
        wioVar3.ag = new vnb(rz2, rS, dxjc.c(this.c.as()), dxjc.c(this.c.av()));
        wioVar3.ah = this.c.tz();
    }

    public final xlc b() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    Application a = this.c.eW.a.a();
                    dxjg.e(a);
                    btvo rp = this.c.eW.a.rp();
                    dxjg.e(rp);
                    obj = new xlc(a, rp, dxjc.c(this.c.bH()));
                    dxjc.d(this.k, obj);
                    this.k = obj;
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
        Object obj4 = this.m;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.m;
                if (obj instanceof dxjf) {
                    Resources c = this.c.eW.a.c();
                    dxjg.e(c);
                    akox ap = this.c.ap();
                    aifb dp = this.c.dp();
                    Object obj5 = this.j;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.j;
                            if (obj2 instanceof dxjf) {
                                Resources c2 = this.c.eW.a.c();
                                dxjg.e(c2);
                                obj2 = xma.b(c2, this.c.eW.g());
                                dxjc.d(this.j, obj2);
                                this.j = obj2;
                            }
                        }
                    } else {
                        obj2 = obj5;
                    }
                    Object obj6 = this.l;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj3 = this.l;
                            if (obj3 instanceof dxjf) {
                                Application a = this.c.eW.a.a();
                                dxjg.e(a);
                                xlc b = b();
                                cqat rR = this.c.eW.a.rR();
                                dxjg.e(rR);
                                obj3 = new xla(a, b, rR);
                                dxjc.d(this.l, obj3);
                                this.l = obj3;
                            }
                        }
                        obj6 = obj3;
                    }
                    obj = xlk.b(c, ap, dp, obj2, (xla) obj6, new aiew(this.c.ap()));
                    dxjc.d(this.m, obj);
                    this.m = obj;
                }
            }
            return obj;
        }
        return obj4;
    }

    public final xmn d() {
        Object obj;
        Object obj2 = this.n;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.n;
                if (obj instanceof dxjf) {
                    cjqy tr = this.c.eW.a.tr();
                    dxjg.e(tr);
                    cqat rR = this.c.eW.a.rR();
                    dxjg.e(rR);
                    obj = new xmn(tr, rR);
                    dxjc.d(this.n, obj);
                    this.n = obj;
                }
            }
            obj2 = obj;
        }
        return (xmn) obj2;
    }
}
