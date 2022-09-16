package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fgo  reason: default package */
/* loaded from: classes6.dex */
public final class fgo<T> implements dzsj<T> {
    final /* synthetic */ fgp a;
    private final int b;

    public fgo(fgp fgpVar, int i) {
        this.a = fgpVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fgp fgpVar = this.a;
                fgpVar.n.ad();
                if (fgpVar.a == null) {
                    fgpVar.a = new fgo(fgpVar, 1);
                }
                return (T) new ceun();
            case 1:
                fgp fgpVar2 = this.a;
                return (T) bjgk.b(fgpVar2.n.wk(), dxjc.c(fgpVar2.n.ai()), fgpVar2.n.cv());
            case 2:
                fgp fgpVar3 = this.a;
                return (T) new cfli(fgpVar3.n.wk(), dxjc.c(fgpVar3.n.eW.p()), fgpVar3.n.eW.mz(), dxjc.c(fgpVar3.n.m()));
            case 3:
                fgp fgpVar4 = this.a;
                dzsj<gga> ad = fgpVar4.n.ad();
                dzsj<cqhn> il = fgpVar4.n.eW.il();
                dzsj<Executor> di = fgpVar4.n.eW.di();
                dzsj c = dxjh.c(fgpVar4.n.m());
                dzsj<cavs> tl = fgpVar4.n.tl();
                dzsj<axjh> cP = fgpVar4.n.cP();
                dzsj<ceet> cN = fgpVar4.n.cN();
                dzsj<cetx> b = fgpVar4.b();
                dzsj dzsjVar = fgpVar4.b;
                if (dzsjVar == null) {
                    dzsjVar = new fgo(fgpVar4, 5);
                    fgpVar4.b = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fgpVar4.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fgo(fgpVar4, 6);
                    fgpVar4.c = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fgpVar4.d;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fgo(fgpVar4, 7);
                    fgpVar4.d = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fgpVar4.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fgo(fgpVar4, 8);
                    fgpVar4.e = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj dzsjVar9 = fgpVar4.h;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new fgo(fgpVar4, 9);
                    fgpVar4.h = dzsjVar9;
                }
                return (T) new cexl(ad, il, di, c, tl, cP, cN, b, dzsjVar2, dzsjVar4, dzsjVar6, dzsjVar8, dzsjVar9, fgpVar4.n.eW.pt());
            case 4:
                fgp fgpVar5 = this.a;
                ftt fttVar = fgpVar5.n;
                return (T) new cetx(fttVar.eV, fttVar.cQ(), fgpVar5.n.eW.pt());
            case 5:
                ftt fttVar2 = this.a.n;
                return (T) new cetz(fttVar2.eV, fttVar2.cN());
            case 6:
                return (T) new cexn(this.a.n.ad());
            case 7:
                return (T) new ceyw(this.a.n.cN());
            case 8:
                fgp fgpVar6 = this.a;
                return (T) new cetv(fgpVar6.n.ad(), fgpVar6.n.eW.il(), fgpVar6.n.cP(), fgpVar6.n.eW.kV(), fgpVar6.n.eW.cl());
            case 9:
                fgp fgpVar7 = this.a;
                dzsj<cqhn> il2 = fgpVar7.n.eW.il();
                dzsj dzsjVar10 = fgpVar7.g;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fgo(fgpVar7, 10);
                    fgpVar7.g = dzsjVar10;
                }
                return (T) new axni(new axnk(il2, dzsjVar10));
            case 10:
                fgp fgpVar8 = this.a;
                dzsj<gga> ad2 = fgpVar8.n.ad();
                dzsj<axjh> cP2 = fgpVar8.n.cP();
                dzsj dzsjVar11 = fgpVar8.f;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fgo(fgpVar8, 11);
                    fgpVar8.f = dzsjVar11;
                }
                return (T) new axnt(ad2, cP2, dzsjVar11, fgpVar8.n.eS());
            case 11:
                return (T) new axoi(dxjh.c(this.a.n.cN()));
            case 12:
                fgp fgpVar9 = this.a;
                ftt fttVar3 = fgpVar9.n;
                dzsj<rb> dzsjVar12 = fttVar3.eV;
                dzsj<akzh> av = fttVar3.av();
                dzsj<ceet> cN2 = fgpVar9.n.cN();
                dzsj<bbut> bf = fgpVar9.n.bf();
                dzsj dzsjVar13 = fgpVar9.i;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fgo(fgpVar9, 13);
                    fgpVar9.i = dzsjVar13;
                }
                cewk cewkVar = new cewk(dzsjVar12, av, cN2, bf, dzsjVar13, fgpVar9.n.eW.pt());
                ftt fttVar4 = fgpVar9.n;
                dzsj<rb> dzsjVar14 = fttVar4.eV;
                dzsj<ceet> cN3 = fttVar4.cN();
                dzsj<bqly> aJ = fgpVar9.n.aJ();
                dzsj dzsjVar15 = fgpVar9.l;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fgo(fgpVar9, 14);
                    fgpVar9.l = dzsjVar15;
                }
                ceyd ceydVar = new ceyd(dzsjVar14, cN3, aJ, dzsjVar15, fgpVar9.n.eW.pt(), fgpVar9.n.eW.lQ());
                dzsj<gga> ad3 = fgpVar9.n.ad();
                dzsj<cqhn> il3 = fgpVar9.n.eW.il();
                dzsj<ceet> cN4 = fgpVar9.n.cN();
                dzsj<axwo> eW = fgpVar9.n.eW();
                dzsj dzsjVar16 = fgpVar9.m;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new fgo(fgpVar9, 17);
                    fgpVar9.m = dzsjVar16;
                }
                return (T) new cetk(cewkVar, ceydVar, new cevm(ad3, il3, cN4, eW, dzsjVar16, fgpVar9.n.eW.pt()), new ceyu(fgpVar9.n.cN()));
            case 13:
                fgp fgpVar10 = this.a;
                return (T) new cewg(fgpVar10.n.eW.fr(), fgpVar10.n.bf());
            case 14:
                fgp fgpVar11 = this.a;
                ftt fttVar5 = fgpVar11.n;
                dzsj<rb> dzsjVar17 = fttVar5.eV;
                dzsj<cqhn> il4 = fttVar5.eW.il();
                dzsj<bkpi> aH = fgpVar11.n.aH();
                dzsj<bqly> aJ2 = fgpVar11.n.aJ();
                dzsj<ceda> oe = fgpVar11.n.oe();
                dzsj dzsjVar18 = fgpVar11.j;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fgo(fgpVar11, 15);
                    fgpVar11.j = dzsjVar18;
                }
                dzsj dzsjVar19 = dzsjVar18;
                dzsj<cebm> om = fgpVar11.n.om();
                dzsj<ixf> lM = fgpVar11.n.lM();
                dzsj<blmp> os = fgpVar11.n.os();
                dzsj<cebr> lQ = fgpVar11.n.eW.lQ();
                dzsj dzsjVar20 = fgpVar11.k;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fgo(fgpVar11, 16);
                    fgpVar11.k = dzsjVar20;
                }
                return (T) new ceyb(dzsjVar17, il4, aH, aJ2, oe, dzsjVar19, om, lM, os, lQ, dzsjVar20, fgpVar11.n.eW.er());
            case 15:
                fgp fgpVar12 = this.a;
                ftt fttVar6 = fgpVar12.n;
                return (T) new cexu(fttVar6.eV, fttVar6.eW.il(), fgpVar12.n.eW.er(), fgpVar12.n.eW.k(), fgpVar12.n.eW.p(), fgpVar12.n.P(), fgpVar12.n.eW.kf(), fgpVar12.n.az(), fgpVar12.n.J(), fgpVar12.n.iW());
            case 16:
                fgp fgpVar13 = this.a;
                ftt fttVar7 = fgpVar13.n;
                return (T) new ceys(fttVar7.eV, fttVar7.aJ(), fgpVar13.n.oh(), fgpVar13.n.y());
            case 17:
                return (T) new cevj(this.a.n.J());
            default:
                fgp fgpVar14 = this.a;
                ftt fttVar8 = fgpVar14.n;
                return (T) new cexr(fttVar8.eV, fttVar8.eW.il(), fgpVar14.n.eS());
        }
    }
}
