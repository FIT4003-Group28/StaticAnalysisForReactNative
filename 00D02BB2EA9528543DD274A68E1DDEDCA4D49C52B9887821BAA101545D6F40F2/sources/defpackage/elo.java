package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: elo  reason: default package */
/* loaded from: classes6.dex */
public final class elo implements dxis {
    public volatile dzsj<bxoq> a;
    public volatile dzsj<bxpp> b;
    public final dzsj<azrm> c;
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

    public elo(ftt fttVar, azrm azrmVar) {
        this.d = fttVar;
        this.c = dxjd.b(azrmVar);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azrm azrmVar = (azrm) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        azrmVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        azrmVar.aI = tr;
        azrmVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        azrmVar.aK = sU;
        azrmVar.aL = new cpv();
        azrmVar.aM = dxjc.c(this.d.eW.ie());
        azrmVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        azrmVar.az = this.d.eW.bW();
        cqat rR = this.d.eW.a.rR();
        dxjg.e(rR);
        azrmVar.aA = rR;
        azrmVar.aB = this.d.wl();
        dxjg.e(this.d.eW.a.tr());
        azrmVar.aC = this.d.wq();
        azrmVar.aO = this.d.cz();
        azrmVar.aP = this.d.ap();
        btvo rp = this.d.eW.a.rp();
        dxjg.e(rp);
        azrmVar.aQ = rp;
        azrmVar.aR = this.d.wd();
        btrm rz = this.d.eW.a.rz();
        dxjg.e(rz);
        azrmVar.aS = rz;
        bwqv rD = this.d.eW.a.rD();
        dxjg.e(rD);
        azrmVar.aT = rD;
        dzsj<btvo> V = this.d.eW.V();
        dzsj<cqat> K = this.d.eW.K();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<akox> as = this.d.as();
        dzsj<bxef> nh = this.d.eW.nh();
        dzsj<cjqy> al = this.d.eW.al();
        dzsj<cqhu> eS = this.d.eS();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new eln(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new eln(this, 1);
            this.f = dzsjVar3;
        }
        azrmVar.aU = new bxen(V, K, il, as, nh, al, eS, dzsjVar2, dzsjVar3, this.d.eW.mj());
        dzsj<azrm> dzsjVar4 = this.c;
        dzsj<glj> cz = this.d.cz();
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new eln(this, 2);
            this.g = dzsjVar5;
        }
        azrmVar.aV = new bxps(dzsjVar4, cz, dxjh.c(dzsjVar5));
        dzsj<gga> ad = this.d.ad();
        dzsj<btpc> cx = this.d.eW.cx();
        dzsj dzsjVar6 = this.h;
        if (dzsjVar6 == null) {
            dzsjVar6 = new eln(this, 3);
            this.h = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj c = dxjh.c(this.d.tR());
        dzsj dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new eln(this, 6);
            this.i = dzsjVar8;
        }
        dzsj c2 = dxjh.c(dzsjVar8);
        dzsj dzsjVar9 = this.j;
        if (dzsjVar9 == null) {
            dzsjVar9 = new eln(this, 7);
            this.j = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.k;
        if (dzsjVar11 == null) {
            dzsjVar11 = new eln(this, 8);
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
            dzsjVar13 = new eln(this, 9);
            this.l = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.m;
        if (dzsjVar15 == null) {
            dzsjVar15 = new eln(this, 10);
            this.m = dzsjVar15;
        }
        azrmVar.aW = new bxqa(ad, cx, dzsjVar7, c, c2, dzsjVar10, dzsjVar12, V2, il2, eU, u, di, dzsjVar14, dzsjVar15);
        dzsj dzsjVar16 = this.n;
        if (dzsjVar16 == null) {
            dzsjVar16 = new eln(this, 11);
            this.n = dzsjVar16;
        }
        azrmVar.aX = new bxqi(dzsjVar16);
        azrmVar.aY = this.d.cv();
        azrmVar.aZ = new bxoo(this.d.ad(), this.d.as(), dxjh.c(this.d.cl()), this.d.eW.V());
        azrmVar.ba = this.d.eW.io();
        gcg sD = this.d.eW.a.sD();
        dxjg.e(sD);
        azrmVar.a = sD;
        bwqv rD2 = this.d.eW.a.rD();
        dxjg.e(rD2);
        azrmVar.b = rD2;
        azrmVar.c = this.d.wd();
        cztz m = this.d.eW.a.m();
        dxjg.e(m);
        azrmVar.d = m;
        bvrb tn = this.d.eW.a.tn();
        dxjg.e(tn);
        azrmVar.e = tn;
        azrmVar.f = this.d.I();
        azrmVar.g = this.d.fq();
        azrmVar.ad = this.d.eW.rG();
    }

    public final bxnq b() {
        return bxnr.b(dxjc.c(this.d.eW.oj()));
    }
}
