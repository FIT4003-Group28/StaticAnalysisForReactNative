package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eza  reason: default package */
/* loaded from: classes6.dex */
public final class eza<T> implements dzsj<T> {
    final /* synthetic */ ezb a;
    private final int b;

    public eza(ezb ezbVar, int i) {
        this.a = ezbVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                ezb ezbVar = this.a;
                return (T) new bgyb(ezbVar.m.wk(), ezbVar.m.wl());
            case 1:
                ezb ezbVar2 = this.a;
                ftt fttVar = ezbVar2.m;
                dzsj<rb> dzsjVar = fttVar.eV;
                dzsj<cqat> K = fttVar.eW.K();
                dzsj<cqhn> il = ezbVar2.m.eW.il();
                dzsj<bgyj> c = ezbVar2.c();
                fyu fyuVar = ezbVar2.m.eW;
                dzsj dzsjVar2 = fyuVar.f28do;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fxy(fyuVar, 632);
                    fyuVar.f28do = dzsjVar2;
                }
                dzsj dzsjVar3 = ezbVar2.a;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new eza(ezbVar2, 3);
                    ezbVar2.a = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = ezbVar2.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new eza(ezbVar2, 4);
                    ezbVar2.c = dzsjVar5;
                }
                return (T) new bepf(dzsjVar, K, il, c, dzsjVar2, dzsjVar4, dzsjVar5, ezbVar2.m.eW.di());
            case 2:
                return (T) new bgyj(this.a.b());
            case 3:
                return (T) new bepq(this.a.m.eV);
            case 4:
                ezb ezbVar3 = this.a;
                dzsj<Application> m = ezbVar3.m.eW.m();
                dzsj<cqhn> il2 = ezbVar3.m.eW.il();
                dzsj dzsjVar6 = ezbVar3.b;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new eza(ezbVar3, 5);
                    ezbVar3.b = dzsjVar6;
                }
                return (T) new bgzb(m, il2, dzsjVar6);
            case 5:
                ezb ezbVar4 = this.a;
                return (T) new bgyx(ezbVar4.m.eW.bk(), ezbVar4.m.eW.m(), ezbVar4.m.eW.il(), ezbVar4.m.eS(), ezbVar4.l);
            case 6:
                ezb ezbVar5 = this.a;
                dzsj<rb> dzsjVar7 = ezbVar5.m.eV;
                dzsj dzsjVar8 = ezbVar5.d;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new eza(ezbVar5, 7);
                    ezbVar5.d = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj<cqhn> il3 = ezbVar5.m.eW.il();
                dzsj<bgyj> c2 = ezbVar5.c();
                dzsj<beik> nl = ezbVar5.m.eW.nl();
                dzsj dzsjVar10 = ezbVar5.e;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new eza(ezbVar5, 8);
                    ezbVar5.e = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj dzsjVar12 = ezbVar5.k;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new eza(ezbVar5, 9);
                    ezbVar5.k = dzsjVar12;
                }
                return (T) new bepo(dzsjVar7, dzsjVar9, il3, c2, nl, dzsjVar11, dzsjVar12, ezbVar5.m.eW.aI(), ezbVar5.m.T(), ezbVar5.m.eW.al(), ezbVar5.m.eW.di());
            case 7:
                return (T) new apnm();
            case 8:
                return (T) new beph(this.a.m.sC());
            case 9:
                ezb ezbVar6 = this.a;
                dzsj dzsjVar13 = ezbVar6.g;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new eza(ezbVar6, 10);
                    ezbVar6.g = dzsjVar13;
                }
                dzsj dzsjVar14 = dzsjVar13;
                dzsj<Application> m2 = ezbVar6.m.eW.m();
                dzsj dzsjVar15 = ezbVar6.h;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new eza(ezbVar6, 12);
                    ezbVar6.h = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj c3 = dxjh.c(ezbVar6.m.ti());
                dzsj dzsjVar17 = ezbVar6.i;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new eza(ezbVar6, 13);
                    ezbVar6.i = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj dzsjVar19 = ezbVar6.j;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new eza(ezbVar6, 14);
                    ezbVar6.j = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj<cqhn> il4 = ezbVar6.m.eW.il();
                fyu fyuVar2 = ezbVar6.m.eW;
                dzsj dzsjVar21 = fyuVar2.dp;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fxy(fyuVar2, 634);
                    fyuVar2.dp = dzsjVar21;
                }
                return (T) new bepl(dzsjVar14, m2, dzsjVar16, c3, dzsjVar18, dzsjVar20, il4, dzsjVar21, ezbVar6.m.eW.ng(), ezbVar6.m.eW.R());
            case 10:
                ezb ezbVar7 = this.a;
                dzsj<bmdq> jG = ezbVar7.m.jG();
                dzsj c4 = dxjh.c(ezbVar7.m.ti());
                dzsj<cqhn> il5 = ezbVar7.m.eW.il();
                dzsj<cqhu> eS = ezbVar7.m.eS();
                dzsj<rb> dzsjVar22 = ezbVar7.m.eV;
                dzsj dzsjVar23 = ezbVar7.f;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new eza(ezbVar7, 11);
                    ezbVar7.f = dzsjVar23;
                }
                return (T) new beor(jG, c4, il5, eS, dzsjVar22, dzsjVar23);
            case 11:
                return (T) this.a.b();
            case 12:
                ezb ezbVar8 = this.a;
                ftt fttVar2 = ezbVar8.m;
                return (T) apnz.b(fttVar2.eV, fttVar2.eW.il(), dxjh.c(ezbVar8.m.ld()), dxjh.c(ezbVar8.m.eW.p()), dxjh.c(ezbVar8.m.li()), ezbVar8.m.pw());
            case 13:
                ezb ezbVar9 = this.a;
                Application a = ezbVar9.m.eW.a.a();
                dxjg.e(a);
                cqat rR = ezbVar9.m.eW.a.rR();
                dxjg.e(rR);
                return (T) new benm(a, rR);
            case 14:
                return (T) new bgyg(this.a.m.eS());
            case 15:
                ezb ezbVar10 = this.a;
                ftt fttVar3 = ezbVar10.m;
                return (T) new bepr(fttVar3.eV, fttVar3.eW.il(), ezbVar10.m.fe());
            default:
                ezb ezbVar11 = this.a;
                return (T) new bepv(ezbVar11.m.eW.fr(), ezbVar11.m.eW.il(), dxjh.c(ezbVar11.m.ti()), ezbVar11.m.eW.R());
        }
    }
}
