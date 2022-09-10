package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fei  reason: default package */
/* loaded from: classes6.dex */
public final class fei implements dxis {
    public volatile dzsj<bdvd> a;
    final /* synthetic */ ftt b;
    private final bccs c;
    private volatile dzsj<bckv> d;
    private volatile dzsj<bcnu> f;
    private volatile dzsj<bcnd> h;
    private volatile dzsj<bcmh> i;
    private volatile dzsj<bcms> l;
    private volatile dzsj<bcmv> m;
    private volatile dzsj<bcoi> n;
    private volatile dzsj<bcol> o;
    private volatile dzsj<bcot> p;
    private volatile dzsj<bcoq> q;
    private volatile Object e = new dxjf();
    private volatile Object g = new dxjf();
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();

    public fei(ftt fttVar, bccs bccsVar) {
        this.b = fttVar;
        this.c = bccsVar;
    }

    private final dzsj<bckv> i() {
        dzsj<bckv> dzsjVar = this.d;
        if (dzsjVar == null) {
            feh fehVar = new feh(this, 0);
            this.d = fehVar;
            return fehVar;
        }
        return dzsjVar;
    }

    private final bclm j() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    rb rbVar = this.b.a;
                    dzsj dzsjVar = this.h;
                    if (dzsjVar == null) {
                        dzsjVar = new feh(this, 5);
                        this.h = dzsjVar;
                    }
                    dzsj dzsjVar2 = this.i;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new feh(this, 6);
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
        bccs bccsVar = (bccs) obj;
        cjqq tp = this.b.eW.a.tp();
        dxjg.e(tp);
        bccsVar.aH = tp;
        cjqy tr = this.b.eW.a.tr();
        dxjg.e(tr);
        bccsVar.aI = tr;
        bccsVar.aJ = dbsg.i(this.b.ap());
        Executor sU = this.b.eW.a.sU();
        dxjg.e(sU);
        bccsVar.aK = sU;
        bccsVar.aL = new cpv();
        bccsVar.aM = dxjc.c(this.b.eW.ie());
        bccsVar.aN = dxjc.c(this.b.eW.iU());
        dxjc.c(this.b.lx());
        bccsVar.ar = new bgqo(this.b.eW.V());
        bwqv rD = this.b.eW.a.rD();
        dxjg.e(rD);
        bccsVar.ae = rD;
        cjqy tr2 = this.b.eW.a.tr();
        dxjg.e(tr2);
        bccsVar.af = tr2;
        bccsVar.ag = this.b.wl();
        bccsVar.ah = this.b.wq();
        bvrb tn = this.b.eW.a.tn();
        dxjg.e(tn);
        bccsVar.ai = tn;
        btvo rp = this.b.eW.a.rp();
        dxjg.e(rp);
        bccsVar.aj = rp;
        bccsVar.ak = dxjc.c(this.b.eW.bu());
        bccsVar.al = dxjc.c(this.b.bf());
        bccsVar.am = dxjc.c(this.b.eW.iW());
        ftt fttVar = this.b;
        dzsj<rb> dzsjVar = fttVar.eV;
        dzsj<btvo> V = fttVar.eW.V();
        dzsj<bckv> i = i();
        dzsj dzsjVar2 = this.m;
        if (dzsjVar2 == null) {
            dzsjVar2 = new feh(this, 1);
            this.m = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj dzsjVar4 = this.n;
        if (dzsjVar4 == null) {
            dzsjVar4 = new feh(this, 7);
            this.n = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.o;
        if (dzsjVar6 == null) {
            dzsjVar6 = new feh(this, 8);
            this.o = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.p;
        if (dzsjVar8 == null) {
            dzsjVar8 = new feh(this, 9);
            this.p = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj dzsjVar10 = this.q;
        if (dzsjVar10 == null) {
            dzsjVar10 = new feh(this, 10);
            this.q = dzsjVar10;
        }
        bccsVar.an = new bcbt(dzsjVar, V, i, dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar9, dzsjVar10);
        bccsVar.ao = new bcni(i());
        bccsVar.ap = this.b.mr();
        bccsVar.aq = new bckz(this.b.eS());
    }

    public final bckv b() {
        return bcci.b(this.c);
    }

    public final bcbw c() {
        return bcch.b(this.c);
    }

    public final bclf d() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    obj = new bclf(this.b.a, b());
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj2 = obj;
        }
        return (bclf) obj2;
    }

    public final dzsj<bcnu> e() {
        dzsj<bcnu> dzsjVar = this.f;
        if (dzsjVar == null) {
            feh fehVar = new feh(this, 3);
            this.f = fehVar;
            return fehVar;
        }
        return dzsjVar;
    }

    public final bcnd f() {
        Object obj;
        Object obj2 = this.g;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.g;
                if (obj instanceof dxjf) {
                    bcmk ms = this.b.ms();
                    cqhn cqhnVar = new cqhn();
                    cqhu cqhuVar = new cqhu();
                    Executor sU = this.b.eW.a.sU();
                    dxjg.e(sU);
                    obj = new bcnd(ms, cqhnVar, cqhuVar, sU, this.b.cJ(), b(), bccg.b(this.c), c(), d(), j());
                    dxjc.d(this.g, obj);
                    this.g = obj;
                }
            }
            obj2 = obj;
        }
        return (bcnd) obj2;
    }

    public final bcmh g() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    obj = new bcmh(j(), f());
                    dxjc.d(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (bcmh) obj2;
    }

    public final dzsj<bcms> h() {
        dzsj<bcms> dzsjVar = this.l;
        if (dzsjVar == null) {
            feh fehVar = new feh(this, 2);
            this.l = fehVar;
            return fehVar;
        }
        return dzsjVar;
    }
}
