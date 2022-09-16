package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: esw  reason: default package */
/* loaded from: classes6.dex */
public final class esw implements dxis {
    public volatile dzsj<bxoq> a;
    public volatile dzsj<bxpp> b;
    public final dzsj<azsu> c;
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

    public esw(ftt fttVar, azsu azsuVar) {
        this.d = fttVar;
        this.c = dxjd.b(azsuVar);
    }

    private final dzsj<bxqd> c() {
        dzsj<bxqd> dzsjVar = this.n;
        if (dzsjVar == null) {
            esv esvVar = new esv(this, 11);
            this.n = esvVar;
            return esvVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        azsu azsuVar = (azsu) obj;
        cjqq tp = this.d.eW.a.tp();
        dxjg.e(tp);
        azsuVar.aH = tp;
        cjqy tr = this.d.eW.a.tr();
        dxjg.e(tr);
        azsuVar.aI = tr;
        azsuVar.aJ = dbsg.i(this.d.ap());
        Executor sU = this.d.eW.a.sU();
        dxjg.e(sU);
        azsuVar.aK = sU;
        azsuVar.aL = new cpv();
        azsuVar.aM = dxjc.c(this.d.eW.ie());
        azsuVar.aN = dxjc.c(this.d.eW.iU());
        dxjc.c(this.d.lx());
        azsuVar.az = this.d.eW.bW();
        cqat rR = this.d.eW.a.rR();
        dxjg.e(rR);
        azsuVar.aA = rR;
        azsuVar.aB = this.d.wl();
        dxjg.e(this.d.eW.a.tr());
        azsuVar.aC = this.d.wq();
        azsuVar.aO = this.d.cz();
        azsuVar.aP = this.d.ap();
        btvo rp = this.d.eW.a.rp();
        dxjg.e(rp);
        azsuVar.aQ = rp;
        azsuVar.aR = this.d.wd();
        btrm rz = this.d.eW.a.rz();
        dxjg.e(rz);
        azsuVar.aS = rz;
        bwqv rD = this.d.eW.a.rD();
        dxjg.e(rD);
        azsuVar.aT = rD;
        dzsj<btvo> V = this.d.eW.V();
        dzsj<cqat> K = this.d.eW.K();
        dzsj<cqhn> il = this.d.eW.il();
        dzsj<akox> as = this.d.as();
        dzsj<bxef> nh = this.d.eW.nh();
        dzsj<cjqy> al = this.d.eW.al();
        dzsj<cqhu> eS = this.d.eS();
        dzsj dzsjVar = this.e;
        if (dzsjVar == null) {
            dzsjVar = new esv(this, 0);
            this.e = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.f;
        if (dzsjVar3 == null) {
            dzsjVar3 = new esv(this, 1);
            this.f = dzsjVar3;
        }
        azsuVar.aU = new bxen(V, K, il, as, nh, al, eS, dzsjVar2, dzsjVar3, this.d.eW.mj());
        dzsj<azsu> dzsjVar4 = this.c;
        dzsj<glj> cz = this.d.cz();
        dzsj dzsjVar5 = this.g;
        if (dzsjVar5 == null) {
            dzsjVar5 = new esv(this, 2);
            this.g = dzsjVar5;
        }
        azsuVar.aV = new bxps(dzsjVar4, cz, dxjh.c(dzsjVar5));
        dzsj<gga> ad = this.d.ad();
        dzsj<btpc> cx = this.d.eW.cx();
        dzsj dzsjVar6 = this.h;
        if (dzsjVar6 == null) {
            dzsjVar6 = new esv(this, 3);
            this.h = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj c = dxjh.c(this.d.tR());
        dzsj dzsjVar8 = this.i;
        if (dzsjVar8 == null) {
            dzsjVar8 = new esv(this, 6);
            this.i = dzsjVar8;
        }
        dzsj c2 = dxjh.c(dzsjVar8);
        dzsj dzsjVar9 = this.j;
        if (dzsjVar9 == null) {
            dzsjVar9 = new esv(this, 7);
            this.j = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj dzsjVar11 = this.k;
        if (dzsjVar11 == null) {
            dzsjVar11 = new esv(this, 8);
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
            dzsjVar13 = new esv(this, 9);
            this.l = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj dzsjVar15 = this.m;
        if (dzsjVar15 == null) {
            dzsjVar15 = new esv(this, 10);
            this.m = dzsjVar15;
        }
        azsuVar.aW = new bxqa(ad, cx, dzsjVar7, c, c2, dzsjVar10, dzsjVar12, V2, il2, eU, u, di, dzsjVar14, dzsjVar15);
        azsuVar.aX = new bxqi(c());
        azsuVar.aY = this.d.cv();
        azsuVar.aZ = new bxoo(this.d.ad(), this.d.as(), dxjh.c(this.d.cl()), this.d.eW.V());
        azsuVar.ba = this.d.eW.io();
        ckcw rU = this.d.eW.a.rU();
        dxjg.e(rU);
        azsuVar.a = rU;
        azsuVar.b = this.d.fq();
        bwqv rD2 = this.d.eW.a.rD();
        dxjg.e(rD2);
        azsuVar.c = rD2;
        azsuVar.d = this.d.eC();
        azsuVar.e = this.d.wl();
        azsuVar.f = dxjc.c(this.d.J());
        azsuVar.g = dxjc.c(this.d.aK());
        bvrb tn = this.d.eW.a.tn();
        dxjg.e(tn);
        azsuVar.ad = tn;
        azsuVar.ae = new azsz(c(), this.d.ad(), this.d.eW.V(), this.d.eZ());
        azsuVar.af = dxjc.c(this.d.eW.dd());
        azsuVar.ag = new cjxo(this.d.a);
        azsuVar.ah = this.d.eX();
        azsuVar.ai = this.d.eY();
        azsuVar.aj = this.d.wd();
        azsuVar.ak = this.d.fb();
    }

    public final bxnq b() {
        return bxnr.b(dxjc.c(this.d.eW.oj()));
    }
}
