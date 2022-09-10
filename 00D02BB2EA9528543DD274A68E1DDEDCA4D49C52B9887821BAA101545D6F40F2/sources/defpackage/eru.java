package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eru  reason: default package */
/* loaded from: classes6.dex */
public final class eru implements dxis {
    public volatile dzsj<qhn> a;
    public volatile dzsj<twt> b;
    public volatile dzsj<twv> c;
    public volatile dzsj<twr> d;
    public volatile dzsj<twh> e;
    public volatile dzsj<tuo> f;
    final /* synthetic */ ese g;
    private volatile dzsj<twn> h;
    private volatile dzsj<suq> i;
    private volatile dzsj<twk> j;
    private volatile dzsj<twf> k;
    private volatile dzsj<ubw> l;
    private volatile dzsj<uch> m;
    private volatile dzsj<uck> n;
    private volatile dzsj<uca> o;
    private volatile dzsj<ucq> p;

    public eru(ese eseVar) {
        this.g = eseVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        tsa tsaVar = (tsa) obj;
        cjqq tp = this.g.y.eW.a.tp();
        dxjg.e(tp);
        tsaVar.aH = tp;
        cjqy tr = this.g.y.eW.a.tr();
        dxjg.e(tr);
        tsaVar.aI = tr;
        tsaVar.aJ = dbsg.i(this.g.y.ap());
        Executor sU = this.g.y.eW.a.sU();
        dxjg.e(sU);
        tsaVar.aK = sU;
        tsaVar.aL = new cpv();
        tsaVar.aM = dxjc.c(this.g.y.eW.ie());
        tsaVar.aN = dxjc.c(this.g.y.eW.iU());
        dxjc.c(this.g.y.lx());
        Executor sU2 = this.g.y.eW.a.sU();
        dxjg.e(sU2);
        tsaVar.a = sU2;
        tsaVar.b = this.g.y.wq();
        tsaVar.c = this.g.y.wl();
        tsaVar.d = this.g.j();
        dzsj<rb> dzsjVar = this.g.y.eV;
        dzsj dzsjVar2 = this.l;
        if (dzsjVar2 == null) {
            dzsjVar2 = new ert(this, 0);
            this.l = dzsjVar2;
        }
        dzsj dzsjVar3 = dzsjVar2;
        dzsj<cqhn> il = this.g.y.eW.il();
        dzsj dzsjVar4 = this.m;
        if (dzsjVar4 == null) {
            dzsjVar4 = new ert(this, 11);
            this.m = dzsjVar4;
        }
        dzsj dzsjVar5 = dzsjVar4;
        dzsj dzsjVar6 = this.n;
        if (dzsjVar6 == null) {
            dzsjVar6 = new ert(this, 12);
            this.n = dzsjVar6;
        }
        dzsj dzsjVar7 = dzsjVar6;
        dzsj dzsjVar8 = this.o;
        if (dzsjVar8 == null) {
            dzsjVar8 = new ert(this, 13);
            this.o = dzsjVar8;
        }
        dzsj dzsjVar9 = dzsjVar8;
        dzsj dzsjVar10 = this.p;
        if (dzsjVar10 == null) {
            dzsjVar10 = new ert(this, 14);
            this.p = dzsjVar10;
        }
        tsaVar.e = new ucn(dzsjVar, dzsjVar3, il, dzsjVar5, dzsjVar7, dzsjVar9, dzsjVar10, this.g.C());
        tsaVar.f = new ucs(this.g.y.eW.il());
        tsaVar.g = new uby(this.g.y.eW.il());
        tsaVar.ad = this.g.A();
        tsaVar.ae = this.g.B();
        tsaVar.af = this.g.p();
        ftt fttVar = this.g.y;
        dzsj<rb> dzsjVar11 = fttVar.eV;
        dzsj<cqhn> il2 = fttVar.eW.il();
        ese eseVar = this.g;
        dzsj dzsjVar12 = eseVar.w;
        if (dzsjVar12 == null) {
            dzsjVar12 = new erv(eseVar, 35);
            eseVar.w = dzsjVar12;
        }
        tsaVar.ag = new udp(dzsjVar11, il2, dzsjVar12);
        tsaVar.ah = this.g.o();
        tsaVar.ai = this.g.x();
        rb rbVar = this.g.y.a;
        cqhu cqhuVar = new cqhu();
        cjmt cv = this.g.y.cv();
        btvo rp = this.g.y.eW.a.rp();
        dxjg.e(rp);
        tsaVar.aj = new tsd(rbVar, cqhuVar, cv, rp);
        tsaVar.ak = this.g.y.cJ();
        tsaVar.al = dxjc.c(this.g.y.cV());
        tle b = this.g.b();
        tgi k = this.g.k();
        dxio c = dxjc.c(this.g.y.eW.p());
        udk p = this.g.p();
        Executor sU3 = this.g.y.eW.a.sU();
        dxjg.e(sU3);
        tsaVar.am = new trw(b, k, c, p, sU3);
        tsaVar.an = this.g.y.cv();
        btrm rz = this.g.y.eW.a.rz();
        dxjg.e(rz);
        tsaVar.ao = rz;
    }

    public final dzsj<twn> b() {
        dzsj<twn> dzsjVar = this.h;
        if (dzsjVar == null) {
            ert ertVar = new ert(this, 3);
            this.h = ertVar;
            return ertVar;
        }
        return dzsjVar;
    }

    public final dzsj<suq> c() {
        dzsj<suq> dzsjVar = this.i;
        if (dzsjVar == null) {
            ert ertVar = new ert(this, 4);
            this.i = ertVar;
            return ertVar;
        }
        return dzsjVar;
    }

    public final dzsj<twk> d() {
        dzsj<twk> dzsjVar = this.j;
        if (dzsjVar == null) {
            ert ertVar = new ert(this, 5);
            this.j = ertVar;
            return ertVar;
        }
        return dzsjVar;
    }

    public final dzsj<twf> e() {
        dzsj<twf> dzsjVar = this.k;
        if (dzsjVar == null) {
            ert ertVar = new ert(this, 6);
            this.k = ertVar;
            return ertVar;
        }
        return dzsjVar;
    }
}
