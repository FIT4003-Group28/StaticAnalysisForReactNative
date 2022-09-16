package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: exs  reason: default package */
/* loaded from: classes6.dex */
public final class exs implements dxis {
    public volatile dzsj<bxoq> a;
    public volatile dzsj<bxpp> b;
    public final dzsj<cbdc> c;
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

    public exs(ftt fttVar, cbdc cbdcVar) {
        this.d = fttVar;
        this.c = dxjd.b(cbdcVar);
    }

    private final dzsj<bxqd> c() {
        dzsj<bxqd> dzsjVar = this.n;
        if (dzsjVar == null) {
            exr exrVar = new exr(this, 11);
            this.n = exrVar;
            return exrVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        cbdc cbdcVar = (cbdc) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        cbdcVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        cbdcVar.aI = tr;
        cbdcVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        cbdcVar.aK = sU;
        cbdcVar.aL = new cpv();
        cbdcVar.aM = dxjc.c(this.d.eW.ie());
        cbdcVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        cbdcVar.az = this.d.eW.bW();
        cqat rR = this.d.eW.a.rR();
        dxjg.e(rR);
        cbdcVar.aA = rR;
        cbdcVar.aB = this.d.wl();
        dxjg.e(this.d.eW.a.tr());
        cbdcVar.aC = this.d.wq();
        cbdcVar.aO = this.d.cz();
        cbdcVar.aP = this.d.ap();
        btvo rp = this.d.eW.a.rp();
        dxjg.e(rp);
        cbdcVar.aQ = rp;
        cbdcVar.aR = this.d.wd();
        btrm rz = this.d.eW.a.rz();
        dxjg.e(rz);
        cbdcVar.aS = rz;
        bwqv rD = this.d.eW.a.rD();
        dxjg.e(rD);
        cbdcVar.aT = rD;
        dzsj<btvo> V = this.d.eW.V();
        dzsj<cqat> K = this.d.eW.K();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<akox> as = this.d.as();
        dzsj<bxef> nh = this.d.eW.nh();
        dzsj<cjqy> al = this.d.eW.al();
        dzsj<cqhu> eS = this.d.eS();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new exr(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new exr(this, 1);
            this.f = dzsjVar3;
        }
        cbdcVar.aU = new bxen(V, K, il, as, nh, al, eS, dzsjVar2, dzsjVar3, this.d.eW.mj());
        dzsj<cbdc> dzsjVar4 = this.c;
        dzsj<glj> cz = this.d.cz();
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new exr(this, 2);
            this.g = dzsjVar5;
        }
        cbdcVar.aV = new bxps(dzsjVar4, cz, dxjh.c(dzsjVar5));
        dzsj<gga> ad = this.d.ad();
        dzsj<btpc> cx = this.d.eW.cx();
        dzsj dzsjVar6 = this.h;
        if (dzsjVar6 == null) {
            dzsjVar6 = new exr(this, 3);
            this.h = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj c = dxjh.c(this.d.tR());
        dzsj dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new exr(this, 6);
            this.i = dzsjVar8;
        }
        dzsj c2 = dxjh.c(dzsjVar8);
        dzsj dzsjVar9 = this.j;
        if (dzsjVar9 == null) {
            dzsjVar9 = new exr(this, 7);
            this.j = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.k;
        if (dzsjVar11 == null) {
            dzsjVar11 = new exr(this, 8);
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
            dzsjVar13 = new exr(this, 9);
            this.l = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.m;
        if (dzsjVar15 == null) {
            dzsjVar15 = new exr(this, 10);
            this.m = dzsjVar15;
        }
        cbdcVar.aW = new bxqa(ad, cx, dzsjVar7, c, c2, dzsjVar10, dzsjVar12, V2, il2, eU, u, di, dzsjVar14, dzsjVar15);
        cbdcVar.aX = new bxqi(c());
        cbdcVar.aY = this.d.cv();
        cbdcVar.aZ = new bxoo(this.d.ad(), this.d.as(), dxjh.c(this.d.cl()), this.d.eW.V());
        cbdcVar.ba = this.d.eW.io();
        cbdcVar.b = new cbde(c(), this.d.ad());
        cbdcVar.c = new cbdk(this.d.eW.er(), this.d.ad(), this.d.as(), dxjh.c(this.d.cl()), this.d.eW.V());
        cbdcVar.d = new cbqf(this.d.fq());
        bwqv rD2 = this.d.eW.a.rD();
        dxjg.e(rD2);
        cbdcVar.e = rD2;
        Executor sU2 = this.d.eW.a.sU();
        dxjg.e(sU2);
        cbdcVar.f = sU2;
    }

    public final bxnq b() {
        return bxnr.b(dxjc.c(this.d.eW.oj()));
    }
}
