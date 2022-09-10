package defpackage;

import android.app.Application;
import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: epu  reason: default package */
/* loaded from: classes6.dex */
public final class epu implements dxis {
    public volatile dzsj<cfns> a;
    public volatile dzsj<cfos> b;
    public volatile dzsj<cfon> c;
    public volatile dzsj<cfoq> d;
    public volatile dzsj<cfoh> e;
    public volatile dzsj f;
    final /* synthetic */ ftt g;
    private volatile dzsj<cfof> h;
    private volatile dzsj<cfod> i;
    private volatile dzsj<cfpg> j;
    private volatile dzsj<cfpe> k;
    private volatile dzsj<bxbe> l;

    public epu(ftt fttVar) {
        this.g = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ascu ascuVar = (ascu) obj;
        cjqq tp = this.g.eW.a.tp();
        dxjg.e(tp);
        ascuVar.aH = tp;
        cjqy tr = this.g.eW.a.tr();
        dxjg.e(tr);
        ascuVar.aI = tr;
        ascuVar.aJ = dbsg.i(this.g.ap());
        Executor sU = this.g.eW.a.sU();
        dxjg.e(sU);
        ascuVar.aK = sU;
        ascuVar.aL = new cpv();
        ascuVar.aM = dxjc.c(this.g.eW.ie());
        ascuVar.aN = dxjc.c(this.g.eW.iU());
        dxjc.c(this.g.lx());
        ascuVar.ao = new cpv();
        bvnx rS = this.g.eW.a.rS();
        dxjg.e(rS);
        ascuVar.ap = rS;
        ascuVar.aq = this.g.eW.oE();
        ckcw rU = this.g.eW.a.rU();
        dxjg.e(rU);
        ascuVar.ar = rU;
        btvo rp = this.g.eW.a.rp();
        dxjg.e(rp);
        ascuVar.as = rp;
        cqat rR = this.g.eW.a.rR();
        dxjg.e(rR);
        ascuVar.at = rR;
        ascuVar.au = new cqhn();
        dzsj<btvo> V = this.g.eW.V();
        dzsj<bvsl> kf = this.g.eW.kf();
        dzsj<ahjq> k = this.g.eW.k();
        dzsj<bvjj> aw = this.g.eW.aw();
        dzsj<Resources> fr = this.g.eW.fr();
        dzsj<amfi> bu = this.g.eW.bu();
        dzsj<cqat> K = this.g.eW.K();
        dzsj<brwl> uk = this.g.uk();
        dzsj<bnjv> pl = this.g.pl();
        dzsj<bmef> jx = this.g.jx();
        dzsj<vwv> lH = this.g.eW.lH();
        dzsj dzsjVar = this.k;
        if (dzsjVar == null) {
            dzsjVar = new ept(this, 0);
            this.k = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.l;
        if (dzsjVar3 == null) {
            dzsjVar3 = new ept(this, 10);
            this.l = dzsjVar3;
        }
        ascuVar.av = new asdc(V, kf, k, aw, fr, bu, K, uk, pl, jx, lH, dzsjVar2, dzsjVar3, dxjh.c(this.g.tP()), this.g.eW.oF());
        this.g.eW.fr();
        ascuVar.aw = this.g.wd();
        btrm rz = this.g.eW.a.rz();
        dxjg.e(rz);
        ascuVar.ax = rz;
        bvjj rB = this.g.eW.a.rB();
        dxjg.e(rB);
        ascuVar.ay = rB;
        bwqv rD = this.g.eW.a.rD();
        dxjg.e(rD);
        ascuVar.az = rD;
        ascuVar.aA = dxjc.c(this.g.H());
        ascuVar.aB = dxjc.c(this.g.cD());
        ascuVar.aC = dxjc.c(this.g.cl());
        ascuVar.aO = dxjc.c(this.g.bT());
        ascuVar.aP = dxjc.c(this.g.st());
        ascuVar.aQ = dxjc.c(this.g.az());
        ascuVar.aR = dxjc.c(this.g.eW.nZ());
        ascuVar.aS = dxjc.c(this.g.da());
        ascuVar.aT = this.g.ap();
        ascuVar.aU = this.g.bM();
        ascuVar.aV = this.g.eW.e();
        ascuVar.aW = this.g.eW.kO();
        ascuVar.aX = this.g.bB();
        ckmm r = this.g.eW.a.r();
        dxjg.e(r);
        ascuVar.aY = r;
        Application a = this.g.eW.a.a();
        dxjg.e(a);
        cqat rR2 = this.g.eW.a.rR();
        dxjg.e(rR2);
        ascuVar.aZ = new vzg(a, rR2, this.g.eW.cC(), dxjc.c(this.g.eW.aY()));
        ascuVar.ba = this.g.cJ();
        bvrb tn = this.g.eW.a.tn();
        dxjg.e(tn);
        ascuVar.bb = tn;
        ascuVar.bc = this.g.wq();
        ascuVar.bd = this.g.wl();
    }

    public final dzsj<cfof> b() {
        dzsj<cfof> dzsjVar = this.h;
        if (dzsjVar == null) {
            ept eptVar = new ept(this, 2);
            this.h = eptVar;
            return eptVar;
        }
        return dzsjVar;
    }

    public final dzsj<cfod> c() {
        dzsj<cfod> dzsjVar = this.i;
        if (dzsjVar == null) {
            ept eptVar = new ept(this, 8);
            this.i = eptVar;
            return eptVar;
        }
        return dzsjVar;
    }

    public final dzsj<cfpg> d() {
        dzsj<cfpg> dzsjVar = this.j;
        if (dzsjVar == null) {
            ept eptVar = new ept(this, 9);
            this.j = eptVar;
            return eptVar;
        }
        return dzsjVar;
    }
}
