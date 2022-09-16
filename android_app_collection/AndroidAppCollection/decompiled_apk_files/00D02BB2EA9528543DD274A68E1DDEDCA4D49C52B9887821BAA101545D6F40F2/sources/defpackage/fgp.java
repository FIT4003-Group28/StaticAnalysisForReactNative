package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgp  reason: default package */
/* loaded from: classes6.dex */
public final class fgp implements dxis {
    public volatile dzsj<bjgj> a;
    public volatile dzsj<cetz> b;
    public volatile dzsj<cexn> c;
    public volatile dzsj<ceyw> d;
    public volatile dzsj<cetv> e;
    public volatile dzsj<axoi> f;
    public volatile dzsj<axnt> g;
    public volatile dzsj<axni> h;
    public volatile dzsj<cewg> i;
    public volatile dzsj<cexu> j;
    public volatile dzsj<ceys> k;
    public volatile dzsj<ceyb> l;
    public volatile dzsj<cevj> m;
    final /* synthetic */ ftt n;
    private volatile dzsj<ceun> o;
    private volatile dzsj<cfli> p;
    private volatile dzsj<cetx> q;
    private volatile dzsj<cexl> r;
    private volatile dzsj<cetk> s;
    private volatile dzsj<cexr> t;
    private volatile buos u;

    public fgp(ftt fttVar) {
        this.n = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ceec ceecVar;
        ceec ceecVar2 = (ceec) obj;
        cjqq tp = this.n.eW.a.tp();
        dxjg.e(tp);
        ceecVar2.aH = tp;
        cjqy tr = this.n.eW.a.tr();
        dxjg.e(tr);
        ceecVar2.aI = tr;
        ceecVar2.aJ = dbsg.i(this.n.ap());
        Executor sU = this.n.eW.a.sU();
        dxjg.e(sU);
        ceecVar2.aK = sU;
        ceecVar2.aL = new cpv();
        ceecVar2.aM = dxjc.c(this.n.eW.ie());
        ceecVar2.aN = dxjc.c(this.n.eW.iU());
        dxjc.c(this.n.lx());
        ceecVar2.a = this.n.wd();
        bvrb tn = this.n.eW.a.tn();
        dxjg.e(tn);
        ceecVar2.b = tn;
        akfa rK = this.n.eW.a.rK();
        dxjg.e(rK);
        ceecVar2.c = rK;
        bvjj rB = this.n.eW.a.rB();
        dxjg.e(rB);
        ceecVar2.d = rB;
        ceecVar2.e = this.n.eW.cu();
        btrm rz = this.n.eW.a.rz();
        dxjg.e(rz);
        ceecVar2.f = rz;
        ceecVar2.g = this.n.wq();
        ceecVar2.ad = this.n.wl();
        dzsj<gga> ad = this.n.ad();
        dzsj<bvrb> R = this.n.eW.R();
        dzsj<cqhn> il = this.n.eW.il();
        dzsj<cqhu> eS = this.n.eS();
        dzsj dzsjVar = this.o;
        if (dzsjVar == null) {
            dzsjVar = new fgo(this, 0);
            this.o = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj<bjgl> ps = this.n.eW.ps();
        dzsj<bwez> fh = this.n.fh();
        dzsj<axjh> cP = this.n.cP();
        dzsj<afzv> G = this.n.G();
        ftt fttVar = this.n;
        dzsj dzsjVar3 = fttVar.eA;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fns(fttVar, 1432);
            fttVar.eA = dzsjVar3;
        }
        dzsj<akfa> p = this.n.eW.p();
        dzsj dzsjVar4 = this.p;
        if (dzsjVar4 == null) {
            dzsjVar4 = new fgo(this, 2);
            this.p = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.r;
        if (dzsjVar6 == null) {
            ceecVar = ceecVar2;
            dzsjVar6 = new fgo(this, 3);
            this.r = dzsjVar6;
        } else {
            ceecVar = ceecVar2;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.s;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fgo(this, 12);
            this.s = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj<cetx> b = b();
        dzsj dzsjVar10 = this.t;
        if (dzsjVar10 == null) {
            dzsjVar10 = new fgo(this, 18);
            this.t = dzsjVar10;
        }
        ceec ceecVar3 = ceecVar;
        ceecVar3.ae = new cewd(ad, R, il, eS, dzsjVar2, ps, fh, cP, G, dzsjVar3, p, dzsjVar5, dzsjVar7, dzsjVar9, b, dzsjVar10, this.n.eW.kV(), this.n.L(), this.n.eW.ik(), this.n.eW.pt());
        buos buosVar = this.u;
        if (buosVar == null) {
            buos buosVar2 = new buos((buor) this.n.eW.kS());
            this.u = buosVar2;
            buosVar = buosVar2;
        }
        ceecVar3.aq = buosVar;
        ceecVar3.af = this.n.cO();
        ceecVar3.ag = this.n.eW.ck();
        ceecVar3.ah = this.n.eV();
        ceecVar3.ai = this.n.eW.qm();
        ceecVar3.aj = this.n.eW.kX();
        ceecVar3.ak = this.n.eW.lu();
        ceecVar3.al = this.n.eW.jc();
    }

    public final dzsj<cetx> b() {
        dzsj<cetx> dzsjVar = this.q;
        if (dzsjVar == null) {
            fgo fgoVar = new fgo(this, 4);
            this.q = fgoVar;
            return fgoVar;
        }
        return dzsjVar;
    }
}
