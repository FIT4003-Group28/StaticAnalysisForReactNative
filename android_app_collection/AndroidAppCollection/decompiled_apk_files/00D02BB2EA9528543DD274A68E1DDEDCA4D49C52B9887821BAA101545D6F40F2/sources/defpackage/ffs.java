package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ffs  reason: default package */
/* loaded from: classes6.dex */
public final class ffs implements dxis {
    public volatile dzsj<apdb> a;
    public volatile dzsj<apcl> b;
    public volatile dzsj<aphj> c;
    public volatile dzsj<apge> d;
    final /* synthetic */ ftt e;
    private final apdh f;
    private volatile dzsj<apen> g;
    private volatile dzsj<apep> h;
    private volatile dzsj<apcf> i;
    private volatile dzsj<aoxq> k;
    private volatile dzsj<apgh> l;
    private volatile dzsj<apgx> m;
    private volatile Object j = new dxjf();
    private volatile Object n = new dxjf();

    public ffs(ftt fttVar, apdh apdhVar) {
        this.e = fttVar;
        this.f = apdhVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        Object obj3;
        apdh apdhVar = (apdh) obj;
        cjqq tp = this.e.eW.a.tp();
        dxjg.e(tp);
        apdhVar.aH = tp;
        cjqy tr = this.e.eW.a.tr();
        dxjg.e(tr);
        apdhVar.aI = tr;
        apdhVar.aJ = dbsg.i(this.e.ap());
        Executor sU = this.e.eW.a.sU();
        dxjg.e(sU);
        apdhVar.aK = sU;
        apdhVar.aL = new cpv();
        apdhVar.aM = dxjc.c(this.e.eW.ie());
        apdhVar.aN = dxjc.c(this.e.eW.iU());
        dxjc.c(this.e.lx());
        bwqv rD = this.e.eW.a.rD();
        dxjg.e(rD);
        apdhVar.a = rD;
        apdhVar.b = this.e.wl();
        apdhVar.c = new cqhu();
        apdhVar.d = this.e.eW.oA();
        dzsj dzsjVar = this.g;
        if (dzsjVar == null) {
            dzsjVar = new ffr(this, 0);
            this.g = dzsjVar;
        }
        dzsj dzsjVar2 = this.h;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ffr(this, 3);
            this.h = dzsjVar2;
        }
        dzsj dzsjVar3 = this.i;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ffr(this, 5);
            this.i = dzsjVar3;
        }
        apdhVar.e = new apes(dzsjVar, dzsjVar2, dzsjVar3);
        Object obj4 = this.j;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj3 = this.j;
                if (obj3 instanceof dxjf) {
                    gga wk = this.e.wk();
                    aoxv oA = this.e.eW.oA();
                    akox ap = this.e.ap();
                    dxio c = dxjc.c(this.e.dE());
                    btrm rz = this.e.eW.a.rz();
                    dxjg.e(rz);
                    bvrb tn = this.e.eW.a.tn();
                    dxjg.e(tn);
                    Executor sU2 = this.e.eW.a.sU();
                    dxjg.e(sU2);
                    aphj c2 = c();
                    bmdv hp = this.e.eW.hp();
                    begg wj = this.e.wj();
                    gle bM = this.e.bM();
                    ahjq wf = this.e.eW.wf();
                    dxio c3 = dxjc.c(this.e.bA());
                    anhg aW = this.e.aW();
                    btvo rp = this.e.eW.a.rp();
                    dxjg.e(rp);
                    obj3 = aoxa.b(wk, oA, ap, c, rz, tn, sU2, c2, hp, wj, bM, wf, c3, aW, rp);
                    dxjc.d(this.j, obj3);
                    this.j = obj3;
                }
            }
            obj4 = obj3;
        }
        apdhVar.f = (aowy) obj4;
        dzsj<gga> ad = this.e.ad();
        dzsj dzsjVar4 = this.l;
        if (dzsjVar4 == null) {
            dzsjVar4 = new ffr(this, 6);
            this.l = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.m;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ffr(this, 9);
            this.m = dzsjVar6;
        }
        apdhVar.g = new apgv(ad, dzsjVar5, dzsjVar6, this.e.eW.il(), e());
        apdhVar.ad = this.e.wk();
        apdhVar.ae = new aphg(dxjc.c(this.e.lN()));
        apdhVar.af = this.e.cJ();
        Object obj5 = this.n;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj2 = this.n;
                if (obj2 instanceof dxjf) {
                    ftt fttVar = this.e;
                    obj2 = new gek(fttVar.a, this.f, fttVar.cJ());
                    dxjc.d(this.n, obj2);
                    this.n = obj2;
                }
            }
            obj5 = obj2;
        }
        apdhVar.ag = (gek) obj5;
        apdhVar.ah = b();
        apdhVar.ai = d();
        dxjg.e(this.e.eW.a.rz());
        dxjg.e(this.e.eW.a.sU());
    }

    public final apcl b() {
        ftt fttVar = this.e;
        rb rbVar = fttVar.a;
        bwqv rD = fttVar.eW.a.rD();
        dxjg.e(rD);
        aoxv oA = this.e.eW.oA();
        cjqq tp = this.e.eW.a.tp();
        dxjg.e(tp);
        cjqy tr = this.e.eW.a.tr();
        dxjg.e(tr);
        return new apcl(rbVar, rD, oA, tp, tr);
    }

    public final aphj c() {
        return new aphj(this.e.a);
    }

    public final aoxq d() {
        btvo rp = this.e.eW.a.rp();
        dxjg.e(rp);
        return new aoxq(rp);
    }

    public final dzsj<aoxq> e() {
        dzsj<aoxq> dzsjVar = this.k;
        if (dzsjVar == null) {
            ffr ffrVar = new ffr(this, 8);
            this.k = ffrVar;
            return ffrVar;
        }
        return dzsjVar;
    }
}
