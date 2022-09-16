package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fjb  reason: default package */
/* loaded from: classes6.dex */
public final class fjb implements dxis {
    public volatile dzsj<bpsj> a;
    public volatile dzsj<bpyj> b;
    public volatile dzsj<bqco> c;
    public volatile dzsj<dbsg<cfll>> d;
    public volatile dzsj<bqbf> e;
    public volatile dzsj<bpys> f;
    final /* synthetic */ ftt g;
    private final bqam h;
    private volatile dzsj<bnyd> i;
    private volatile dzsj<zzn> j;
    private volatile dzsj<bqbb> l;
    private volatile dzsj<bpzq> m;
    private volatile dzsj<bqau> n;
    private volatile burh r;
    private volatile Object k = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object q = new dxjf();

    public fjb(ftt fttVar, bqam bqamVar) {
        this.g = fttVar;
        this.h = bqamVar;
    }

    private final bpsq d() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    obj = new bpsq(dxjc.c(this.g.as()), dxjc.c(this.g.av()), dxjc.c(this.g.cu()));
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj2 = obj;
        }
        return (bpsq) obj2;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bqam bqamVar;
        Object obj2;
        Object obj3;
        bqam bqamVar2 = (bqam) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        bqamVar2.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        bqamVar2.aI = tr;
        bqamVar2.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        bqamVar2.aK = sU;
        bqamVar2.aL = new cpv();
        bqamVar2.aM = dxjc.c(this.g.eW.ie());
        bqamVar2.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        bqamVar2.a = this.g.wl();
        bqamVar2.b = this.g.wq();
        bqamVar2.c = dxjc.c(this.g.as());
        bqamVar2.d = this.g.au();
        bqamVar2.e = this.g.bC();
        bqamVar2.f = bqah.b(dxjh.c(this.g.as()), this.g.fM(), this.g.eW.K(), this.g.eW.R());
        dzsj<gga> ad = this.g.ad();
        dzsj<efh> fN = this.g.fN();
        dzsj<jmx> fO = this.g.fO();
        dzsj dzsjVar = this.i;
        if (dzsjVar == null) {
            dzsjVar = new fja(this, 0);
            this.i = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<Executor> di = this.g.eW.di();
        dzsj<jjm> kI = this.g.kI();
        dzsj<cqhn> il = this.g.eW.il();
        dzsj<jmc> lf = this.g.lf();
        dzsj dzsjVar3 = this.l;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fja(this, 1);
            this.l = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<zzn> b = b();
        dzsj<afwr> cu = this.g.cu();
        dzsj dzsjVar5 = this.m;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fja(this, 8);
            this.m = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.n;
        if (dzsjVar7 == null) {
            bqamVar = bqamVar2;
            dzsjVar7 = new fja(this, 10);
            this.n = dzsjVar7;
        } else {
            bqamVar = bqamVar2;
        }
        bqam bqamVar3 = bqamVar;
        bqamVar3.g = new bqcb(ad, fN, fO, dzsjVar2, di, kI, il, lf, dzsjVar4, b, cu, dzsjVar6, dzsjVar7, this.g.lD(), this.g.eW.bk());
        bqamVar3.ad = this.g.cJ();
        bqamVar3.ae = new cpv();
        Object obj4 = this.o;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj3 = this.o;
                if (obj3 instanceof dxjf) {
                    ftt fttVar = this.g;
                    obj3 = new gek(fttVar.a, this.h, fttVar.cJ());
                    dxjc.d(this.o, obj3);
                    this.o = obj3;
                }
            }
            obj4 = obj3;
        }
        bqamVar3.af = (gek) obj4;
        bqamVar3.ag = this.g.ck();
        bqamVar3.ah = d();
        Object obj5 = this.q;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = this.q;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsn(this.g.a, this.h, d());
                    dxjc.d(this.q, obj2);
                    this.q = obj2;
                }
            }
            obj5 = obj2;
        }
        bpsn bpsnVar = (bpsn) obj5;
    }

    public final dzsj<zzn> b() {
        dzsj<zzn> dzsjVar = this.j;
        if (dzsjVar == null) {
            fja fjaVar = new fja(this, 3);
            this.j = fjaVar;
            return fjaVar;
        }
        return dzsjVar;
    }

    public final dbsg<cfll> c() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    Executor sU = this.g.eW.a.sU();
                    dxjg.e(sU);
                    burh burhVar = this.r;
                    if (burhVar == null) {
                        dxio c = dxjc.c(this.g.eW.h());
                        bvrb tn = this.g.eW.a.tn();
                        dxjg.e(tn);
                        burhVar = burj.b(buri.b(c, tn));
                        this.r = burhVar;
                    }
                    btvo rp = this.g.eW.a.rp();
                    dxjg.e(rp);
                    cflo cfloVar = new cflo(sU, burhVar, rp, new cflq());
                    btvo rp2 = this.g.eW.a.rp();
                    dxjg.e(rp2);
                    obj = cflr.b(cfloVar, rp2);
                    dxjc.d(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }
}
