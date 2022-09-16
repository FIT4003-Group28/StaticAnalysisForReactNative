package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fef  reason: default package */
/* loaded from: classes6.dex */
public final class fef implements dxis {
    public volatile dzsj<bdvd> a;
    public volatile dzsj<bcms> b;
    final /* synthetic */ ftt c;
    private final bccn d;
    private volatile dzsj<bcnd> g;
    private volatile dzsj<bcmh> i;
    private volatile dzsj<cknm> k;
    private volatile dzsj<cknb> l;
    private volatile dzsj<bcnu> m;
    private volatile dzsj<bcmv> n;
    private volatile dzsj<bckv> o;
    private volatile dzsj<bcof> p;
    private volatile dzsj<afxw> q;
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object h = new dxjf();
    private volatile Object j = new dxjf();

    public fef(ftt fttVar, bccn bccnVar) {
        this.c = fttVar;
        this.d = bccnVar;
    }

    private final bclm i() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    rb rbVar = this.c.a;
                    dzsj dzsjVar = this.g;
                    if (dzsjVar == null) {
                        dzsjVar = new fee(this, 0);
                        this.g = dzsjVar;
                    }
                    dzsj dzsjVar2 = this.i;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new fee(this, 1);
                        this.i = dzsjVar2;
                    }
                    obj = new bclm(rbVar, dzsjVar, dzsjVar2, b());
                    dxjc.d(this.j, obj);
                    this.j = obj;
                }
            }
            obj2 = obj;
        }
        return (bclm) obj2;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bccn bccnVar = (bccn) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        bccnVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        bccnVar.aI = tr;
        bccnVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        bccnVar.aK = sU;
        bccnVar.aL = new cpv();
        bccnVar.aM = dxjc.c(this.c.eW.ie());
        bccnVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        bccnVar.ar = new bgqo(this.c.eW.V());
        bwqv rD = this.c.eW.a.rD();
        dxjg.e(rD);
        bccnVar.g = rD;
        bccnVar.ad = this.c.wl();
        bccnVar.ae = this.c.wq();
        bvrb tn = this.c.eW.a.tn();
        dxjg.e(tn);
        bccnVar.af = tn;
        bccnVar.ag = dxjc.c(this.c.eW.bu());
        bccnVar.ah = dxjc.c(this.c.eW.iW());
        bccnVar.ai = i();
        btvo rp = this.c.eW.a.rp();
        dxjg.e(rp);
        bccnVar.aj = rp;
        this.c.lS();
        dzsj<rb> dzsjVar = this.c.eV;
        dzsj dzsjVar2 = this.k;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fee(this, 2);
            this.k = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<buti> my = this.c.eW.my();
        dzsj<bcmm> mq = this.c.mq();
        dzsj dzsjVar4 = this.l;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fee(this, 3);
            this.l = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.n;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fee(this, 4);
            this.n = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.p;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fee(this, 8);
            this.p = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj<btvo> V = this.c.eW.V();
        dzsj<bckv> h = h();
        dzsj<bhhf> l = this.c.l();
        dzsj dzsjVar10 = this.q;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fee(this, 10);
            this.q = dzsjVar10;
        }
        bccnVar.ak = new bccd(dzsjVar, dzsjVar3, my, mq, dzsjVar5, dzsjVar7, dzsjVar9, V, h, l, dzsjVar10);
        bccnVar.al = e();
        bccnVar.am = this.c.wj();
    }

    public final bckv b() {
        return bcci.b(this.d);
    }

    public final bcbw c() {
        return bcch.b(this.d);
    }

    public final bclf d() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    obj = new bclf(this.c.a, b());
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj2 = obj;
        }
        return (bclf) obj2;
    }

    public final bcnd e() {
        Object obj;
        Object obj2 = this.f;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.f;
                if (obj instanceof dxjf) {
                    bcmk ms = this.c.ms();
                    cqhn cqhnVar = new cqhn();
                    cqhu cqhuVar = new cqhu();
                    Executor sU = this.c.eW.a.sU();
                    dxjg.e(sU);
                    obj = new bcnd(ms, cqhnVar, cqhuVar, sU, this.c.cJ(), b(), bccg.b(this.d), c(), d(), i());
                    dxjc.d(this.f, obj);
                    this.f = obj;
                }
            }
            obj2 = obj;
        }
        return (bcnd) obj2;
    }

    public final bcmh f() {
        Object obj;
        Object obj2 = this.h;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.h;
                if (obj instanceof dxjf) {
                    obj = new bcmh(i(), e());
                    dxjc.d(this.h, obj);
                    this.h = obj;
                }
            }
            obj2 = obj;
        }
        return (bcmh) obj2;
    }

    public final dzsj<bcnu> g() {
        dzsj<bcnu> dzsjVar = this.m;
        if (dzsjVar == null) {
            fee feeVar = new fee(this, 6);
            this.m = feeVar;
            return feeVar;
        }
        return dzsjVar;
    }

    public final dzsj<bckv> h() {
        dzsj<bckv> dzsjVar = this.o;
        if (dzsjVar == null) {
            fee feeVar = new fee(this, 9);
            this.o = feeVar;
            return feeVar;
        }
        return dzsjVar;
    }
}
