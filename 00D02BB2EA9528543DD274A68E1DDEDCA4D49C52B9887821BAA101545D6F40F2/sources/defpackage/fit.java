package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fit  reason: default package */
/* loaded from: classes6.dex */
public final class fit implements dxis {
    public volatile dzsj<bxoq> a;
    public volatile dzsj<bxpp> b;
    public final dzsj<bqma> c;
    final /* synthetic */ ftt d;
    private volatile dzsj<bxnq> e;
    private volatile dzsj<bxnt> f;
    private volatile dzsj<bxqs> g;
    private volatile dzsj<bxos> h;
    private volatile dzsj<bxpa> i;
    private volatile dzsj<bxqn> j;
    private volatile dzsj<bxpn> k;
    private volatile dzsj l;
    private volatile dzsj<bxqk> m;
    private volatile dzsj<bxqd> n;

    public fit(ftt fttVar, bqma bqmaVar) {
        this.d = fttVar;
        this.c = dxjd.b(bqmaVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bqma bqmaVar = (bqma) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        bqmaVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        bqmaVar.aI = tr;
        bqmaVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        bqmaVar.aK = sU;
        bqmaVar.aL = new cpv();
        bqmaVar.aM = dxjc.c(this.d.eW.ie());
        bqmaVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        bqmaVar.az = this.d.eW.bW();
        cqat rR = this.d.eW.a.rR();
        dxjg.e(rR);
        bqmaVar.aA = rR;
        bqmaVar.aB = this.d.wl();
        dxjg.e(this.d.eW.a.tr());
        bqmaVar.aC = this.d.wq();
        bqmaVar.aO = this.d.cz();
        bqmaVar.aP = this.d.ap();
        btvo rp = this.d.eW.a.rp();
        dxjg.e(rp);
        bqmaVar.aQ = rp;
        bqmaVar.aR = this.d.wd();
        btrm rz = this.d.eW.a.rz();
        dxjg.e(rz);
        bqmaVar.aS = rz;
        bwqv rD = this.d.eW.a.rD();
        dxjg.e(rD);
        bqmaVar.aT = rD;
        dzsj<btvo> V = this.d.eW.V();
        dzsj<cqat> K = this.d.eW.K();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<akox> as = this.d.as();
        dzsj<bxef> nh = this.d.eW.nh();
        dzsj<cjqy> al = this.d.eW.al();
        dzsj<cqhu> eS = this.d.eS();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new fis(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new fis(this, 1);
            this.f = dzsjVar3;
        }
        bqmaVar.aU = new bxen(V, K, il, as, nh, al, eS, dzsjVar2, dzsjVar3, this.d.eW.mj());
        dzsj<bqma> dzsjVar4 = this.c;
        dzsj<glj> cz = this.d.cz();
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new fis(this, 2);
            this.g = dzsjVar5;
        }
        bqmaVar.aV = new bxps(dzsjVar4, cz, dxjh.c(dzsjVar5));
        dzsj<gga> ad = this.d.ad();
        dzsj<btpc> cx = this.d.eW.cx();
        dzsj dzsjVar6 = this.h;
        if (dzsjVar6 == null) {
            dzsjVar6 = new fis(this, 3);
            this.h = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj c = dxjh.c(this.d.tR());
        dzsj dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new fis(this, 6);
            this.i = dzsjVar8;
        }
        dzsj c2 = dxjh.c(dzsjVar8);
        dzsj dzsjVar9 = this.j;
        if (dzsjVar9 == null) {
            dzsjVar9 = new fis(this, 7);
            this.j = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.k;
        if (dzsjVar11 == null) {
            dzsjVar11 = new fis(this, 8);
            this.k = dzsjVar11;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj<btvo> V2 = this.d.eW.V();
        dzsj<cqhn> il2 = this.d.eW.il();
        dzsj<axse> eU = this.d.eU();
        dzsj<axwq> u = this.d.eW.u();
        dzsj<Executor> di = this.d.eW.di();
        dzsj dzsjVar13 = this.l;
        if (dzsjVar13 == null) {
            dzsjVar13 = new fis(this, 9);
            this.l = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.m;
        if (dzsjVar15 == null) {
            dzsjVar15 = new fis(this, 10);
            this.m = dzsjVar15;
        }
        bqmaVar.aW = new bxqa(ad, cx, dzsjVar7, c, c2, dzsjVar10, dzsjVar12, V2, il2, eU, u, di, dzsjVar14, dzsjVar15);
        dzsj dzsjVar16 = this.n;
        if (dzsjVar16 == null) {
            dzsjVar16 = new fis(this, 11);
            this.n = dzsjVar16;
        }
        bqmaVar.aX = new bxqi(dzsjVar16);
        bqmaVar.aY = this.d.cv();
        bqmaVar.aZ = new bxoo(this.d.ad(), this.d.as(), dxjh.c(this.d.cl()), this.d.eW.V());
        bqmaVar.ba = this.d.eW.io();
        bqmaVar.a = this.d.aI();
    }

    public final bxnq b() {
        return bxnr.b(dxjc.c(this.d.eW.oj()));
    }
}
