package defpackage;

import android.app.Application;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fpq  reason: default package */
/* loaded from: classes6.dex */
public final class fpq implements dxis {
    final /* synthetic */ ftt c;
    public volatile buuf d;
    private volatile dzsj<ivg> e;
    private volatile dzsj<jmn> f;
    private volatile dzsj<ydu> g;
    private volatile dzsj<ygu> h;
    private volatile dzsj<yfu> n;
    private volatile Object i = new dxjf();
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();
    private volatile Object l = new dxjf();
    private volatile Object m = new dxjf();
    public volatile Object a = new dxjf();
    public volatile Object b = new dxjf();

    public fpq(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ydq ydqVar = (ydq) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        ydqVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        ydqVar.aI = tr;
        ydqVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        ydqVar.aK = sU;
        ydqVar.aL = new cpv();
        ydqVar.aM = dxjc.c(this.c.eW.ie());
        ydqVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        ydqVar.a = new zaa();
        ydqVar.b = this.c.wq();
        ydqVar.c = this.c.wl();
        dzsj<rb> dzsjVar = this.c.eV;
        dzsj dzsjVar2 = this.e;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fpp(this, 0);
            this.e = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = this.c.eW.il();
        dzsj dzsjVar4 = this.f;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fpp(this, 1);
            this.f = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.g;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fpp(this, 2);
            this.g = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.h;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fpp(this, 3);
            this.h = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj dzsjVar10 = this.n;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fpp(this, 4);
            this.n = dzsjVar10;
        }
        ydqVar.d = new ygi(dzsjVar, dzsjVar3, il, dzsjVar5, dzsjVar7, dzsjVar9, dzsjVar10, this.c.eW.jm(), this.c.eW.R(), this.c.eW.at(), this.c.H());
        btrm rz = this.c.eW.a.rz();
        dxjg.e(rz);
        ydqVar.e = rz;
        ydqVar.f = new cpv();
        ydqVar.g = new ztb(this.c.a);
    }

    public final xlc b() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    Application a = this.c.eW.a.a();
                    dxjg.e(a);
                    btvo rp = this.c.eW.a.rp();
                    dxjg.e(rp);
                    obj = new xlc(a, rp, dxjc.c(this.c.bH()));
                    dxjc.d(this.j, obj);
                    this.j = obj;
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
        Object obj4 = this.l;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.l;
                if (obj instanceof dxjf) {
                    Resources c = this.c.eW.a.c();
                    dxjg.e(c);
                    akox ap = this.c.ap();
                    aifb dp = this.c.dp();
                    Object obj5 = this.i;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.i;
                            if (obj2 instanceof dxjf) {
                                Resources c2 = this.c.eW.a.c();
                                dxjg.e(c2);
                                obj2 = xma.b(c2, this.c.eW.g());
                                dxjc.d(this.i, obj2);
                                this.i = obj2;
                            }
                        }
                    } else {
                        obj2 = obj5;
                    }
                    Object obj6 = this.k;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj3 = this.k;
                            if (obj3 instanceof dxjf) {
                                Application a = this.c.eW.a.a();
                                dxjg.e(a);
                                xlc b = b();
                                cqat rR = this.c.eW.a.rR();
                                dxjg.e(rR);
                                obj3 = new xla(a, b, rR);
                                dxjc.d(this.k, obj3);
                                this.k = obj3;
                            }
                        }
                        obj6 = obj3;
                    }
                    obj = xlk.b(c, ap, dp, obj2, (xla) obj6, new aiew(this.c.ap()));
                    dxjc.d(this.l, obj);
                    this.l = obj;
                }
            }
            return obj;
        }
        return obj4;
    }

    public final xmn d() {
        Object obj;
        Object obj2 = this.m;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.m;
                if (obj instanceof dxjf) {
                    cjqy tr = this.c.eW.a.tr();
                    dxjg.e(tr);
                    cqat rR = this.c.eW.a.rR();
                    dxjg.e(rR);
                    obj = new xmn(tr, rR);
                    dxjc.d(this.m, obj);
                    this.m = obj;
                }
            }
            obj2 = obj;
        }
        return (xmn) obj2;
    }
}
