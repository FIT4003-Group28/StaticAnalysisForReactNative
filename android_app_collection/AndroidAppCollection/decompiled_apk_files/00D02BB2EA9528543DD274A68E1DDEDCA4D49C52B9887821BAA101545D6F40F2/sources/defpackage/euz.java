package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: euz  reason: default package */
/* loaded from: classes6.dex */
public final class euz implements dxis {
    final /* synthetic */ ftt a;
    private volatile dzsj<brzk> b;
    private volatile dzsj<bsih> c;
    private volatile dzsj<bsjf> d;
    private volatile dzsj<bsif> e;
    private volatile dzsj<bsjg> f;
    private volatile dzsj<bsip> g;
    private volatile dzsj<bsiy> h;

    public euz(ftt fttVar) {
        this.a = fttVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        brzg brzgVar;
        brzg brzgVar2 = (brzg) obj;
        cjqq tp = this.a.eW.a.tp();
        dxjg.e(tp);
        brzgVar2.aH = tp;
        cjqy tr = this.a.eW.a.tr();
        dxjg.e(tr);
        brzgVar2.aI = tr;
        brzgVar2.aJ = dbsg.i(this.a.ap());
        Executor sU = this.a.eW.a.sU();
        dxjg.e(sU);
        brzgVar2.aK = sU;
        brzgVar2.aL = new cpv();
        brzgVar2.aM = dxjc.c(this.a.eW.ie());
        brzgVar2.aN = dxjc.c(this.a.eW.iU());
        dxjc.c(this.a.lx());
        brzgVar2.f = dxjc.c(this.a.cz());
        brzgVar2.a = this.a.wl();
        ckcw rU = this.a.eW.a.rU();
        dxjg.e(rU);
        brzgVar2.b = rU;
        dzsj dzsjVar = this.b;
        if (dzsjVar == null) {
            dzsjVar = new euy(this, 0);
            this.b = dzsjVar;
        }
        dzsj dzsjVar2 = dzsjVar;
        dzsj dzsjVar3 = this.c;
        if (dzsjVar3 == null) {
            dzsjVar3 = new euy(this, 1);
            this.c = dzsjVar3;
        }
        dzsj dzsjVar4 = dzsjVar3;
        dzsj<bsjd> rM = this.a.rM();
        dzsj<bshj> rO = this.a.rO();
        dzsj<bshy> uW = this.a.uW();
        dzsj<bsid> uX = this.a.uX();
        dzsj<bsim> uY = this.a.uY();
        dzsj<bsiq> uZ = this.a.uZ();
        dzsj dzsjVar5 = this.d;
        if (dzsjVar5 == null) {
            dzsjVar5 = new euy(this, 2);
            this.d = dzsjVar5;
        }
        dzsj dzsjVar6 = dzsjVar5;
        dzsj dzsjVar7 = this.e;
        if (dzsjVar7 == null) {
            dzsjVar7 = new euy(this, 3);
            this.e = dzsjVar7;
        }
        dzsj dzsjVar8 = dzsjVar7;
        dzsj dzsjVar9 = this.f;
        if (dzsjVar9 == null) {
            dzsjVar9 = new euy(this, 4);
            this.f = dzsjVar9;
        }
        dzsj dzsjVar10 = dzsjVar9;
        dzsj<bshe> rJ = this.a.rJ();
        dzsj dzsjVar11 = this.g;
        if (dzsjVar11 == null) {
            brzgVar = brzgVar2;
            dzsjVar11 = new euy(this, 5);
            this.g = dzsjVar11;
        } else {
            brzgVar = brzgVar2;
        }
        dzsj dzsjVar12 = dzsjVar11;
        dzsj dzsjVar13 = this.h;
        if (dzsjVar13 == null) {
            dzsjVar13 = new euy(this, 6);
            this.h = dzsjVar13;
        }
        dzsj dzsjVar14 = dzsjVar13;
        dzsj<bshp> rP = this.a.rP();
        dzsj<bshc> rX = this.a.rX();
        dzsj<btvo> V = this.a.eW.V();
        dzsj<gga> ad = this.a.ad();
        dzsj<cjmt> gW = this.a.gW();
        ftt fttVar = this.a;
        dzsj dzsjVar15 = fttVar.dH;
        if (dzsjVar15 == null) {
            dzsjVar15 = new fns(fttVar, 1385);
            fttVar.dH = dzsjVar15;
        }
        brzg brzgVar3 = brzgVar;
        brzgVar3.c = new brzu(dzsjVar2, dzsjVar4, rM, rO, uW, uX, uY, uZ, dzsjVar6, dzsjVar8, dzsjVar10, rJ, dzsjVar12, dzsjVar14, rP, rX, V, ad, gW, dzsjVar15);
        brzgVar3.d = this.a.eW.io();
    }
}
