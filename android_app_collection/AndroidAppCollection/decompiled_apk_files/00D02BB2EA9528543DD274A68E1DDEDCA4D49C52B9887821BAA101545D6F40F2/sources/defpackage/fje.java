package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fje  reason: default package */
/* loaded from: classes6.dex */
public final class fje implements dxis {
    public volatile dzsj<bpsj> a;
    public volatile dzsj<bpyj> b;
    final /* synthetic */ ftt c;
    private volatile dzsj<bpyk> f;
    private volatile dzsj<bnyd> g;
    private volatile dzsj<bptg> h;
    private volatile dzsj<booa> i;
    private volatile dzsj<zzn> k;
    private volatile dzsj<bqco> l;
    private volatile dzsj<dbsg<cfll>> m;
    private volatile dzsj<bqbf> n;
    private volatile burh o;
    private volatile Object d = new dxjf();
    private volatile Object e = new dxjf();
    private volatile Object j = new dxjf();

    public fje(ftt fttVar) {
        this.c = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        bqbh bqbhVar = (bqbh) obj;
        cjqq tp = this.c.eW.a.tp();
        dxjg.e(tp);
        bqbhVar.aH = tp;
        cjqy tr = this.c.eW.a.tr();
        dxjg.e(tr);
        bqbhVar.aI = tr;
        bqbhVar.aJ = dbsg.i(this.c.ap());
        Executor sU = this.c.eW.a.sU();
        dxjg.e(sU);
        bqbhVar.aK = sU;
        bqbhVar.aL = new cpv();
        bqbhVar.aM = dxjc.c(this.c.eW.ie());
        bqbhVar.aN = dxjc.c(this.c.eW.iU());
        dxjc.c(this.c.lx());
        dzsj dzsjVar = this.f;
        if (dzsjVar == null) {
            dzsjVar = new fjd(this, 0);
            this.f = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.g;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fjd(this, 1);
            this.g = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        ftt fttVar = this.c;
        dzsj<rb> dzsjVar5 = fttVar.eV;
        dzsj<jmx> fO = fttVar.fO();
        dzsj<efh> fN = this.c.fN();
        dzsj dzsjVar6 = this.h;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fjd(this, 2);
            this.h = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj<bpto> uQ = this.c.uQ();
        dzsj dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fjd(this, 3);
            this.i = dzsjVar8;
        }
        bqbhVar.a = new bqbn(dzsjVar2, dzsjVar4, dzsjVar5, fO, fN, dzsjVar7, uQ, dzsjVar8);
        bqbhVar.b = this.c.bh();
        cztz m = this.c.eW.a.m();
        dxjg.e(m);
        btpc sz = this.c.eW.a.sz();
        dxjg.e(sz);
        bqbhVar.c = new bnyj(m, sz);
        bvrb tn = this.c.eW.a.tn();
        dxjg.e(tn);
        bqbhVar.d = tn;
        bqbhVar.e = this.c.ap();
        bqbhVar.f = this.c.wl();
        bqbhVar.g = this.c.wq();
        Object obj3 = this.j;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.j;
                if (obj2 instanceof dxjf) {
                    obj2 = new bpsq(dxjc.c(this.c.as()), dxjc.c(this.c.av()), dxjc.c(this.c.cu()));
                    dxjc.d(this.j, obj2);
                    this.j = obj2;
                }
            }
            obj3 = obj2;
        }
        bqbhVar.ad = (bpsq) obj3;
        bqbhVar.ae = this.c.ck();
        dzsj dzsjVar9 = this.l;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fjd(this, 4);
            this.l = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<Executor> di = this.c.eW.di();
        ftt fttVar2 = this.c;
        dzsj<rb> dzsjVar11 = fttVar2.eV;
        dzsj<jjm> kI = fttVar2.kI();
        dzsj<akzh> av = this.c.av();
        dzsj<zzn> d = d();
        dzsj<akox> as = this.c.as();
        dzsj<bqdl> uU = this.c.uU();
        dzsj dzsjVar12 = this.m;
        if (dzsjVar12 == null) {
            dzsjVar12 = new fjd(this, 8);
            this.m = dzsjVar12;
        }
        dzsj dzsjVar13 = dzsjVar12;
        dzsj<bqdk> uV = this.c.uV();
        dzsj dzsjVar14 = this.n;
        if (dzsjVar14 == null) {
            dzsjVar14 = new fjd(this, 9);
            this.n = dzsjVar14;
        }
        bqbhVar.af = new bqbb(dzsjVar10, di, dzsjVar11, kI, av, d, as, uU, dzsjVar13, uV, dzsjVar14);
        bqbhVar.ag = new cpv();
        bqbhVar.ah = c();
        bqbhVar.ai = this.c.au();
    }

    public final dbsg<cfll> b() {
        Object obj;
        Object obj2 = this.d;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.d;
                if (obj instanceof dxjf) {
                    Executor sU = this.c.eW.a.sU();
                    dxjg.e(sU);
                    burh burhVar = this.o;
                    if (burhVar == null) {
                        dxio c = dxjc.c(this.c.eW.h());
                        bvrb tn = this.c.eW.a.tn();
                        dxjg.e(tn);
                        burhVar = burj.b(buri.b(c, tn));
                        this.o = burhVar;
                    }
                    btvo rp = this.c.eW.a.rp();
                    dxjg.e(rp);
                    cflo cfloVar = new cflo(sU, burhVar, rp, new cflq());
                    btvo rp2 = this.c.eW.a.rp();
                    dxjg.e(rp2);
                    obj = cflr.b(cfloVar, rp2);
                    dxjc.d(this.d, obj);
                    this.d = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }

    public final bqdh c() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    obj = new bqdh(b(), this.c.fV());
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj2 = obj;
        }
        return (bqdh) obj2;
    }

    public final dzsj<zzn> d() {
        dzsj<zzn> dzsjVar = this.k;
        if (dzsjVar == null) {
            fjd fjdVar = new fjd(this, 5);
            this.k = fjdVar;
            return fjdVar;
        }
        return dzsjVar;
    }
}
