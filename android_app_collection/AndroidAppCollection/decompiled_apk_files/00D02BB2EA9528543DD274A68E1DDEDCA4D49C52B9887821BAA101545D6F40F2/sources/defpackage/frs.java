package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: frs  reason: default package */
/* loaded from: classes6.dex */
public final class frs<T> implements dzsj<T> {
    final /* synthetic */ frt a;
    private final int b;

    public frs(frt frtVar, int i) {
        this.a = frtVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                frt frtVar = this.a;
                return (T) new bdqe(frtVar.k.ad(), frtVar.k.eW.V(), frtVar.k.eW.hN());
            case 1:
                frt frtVar2 = this.a;
                ftt fttVar = frtVar2.k;
                return (T) new bdto(fttVar.eV, fttVar.eW.aI(), frtVar2.k.eW.il());
            case 2:
                frt frtVar3 = this.a;
                ftt fttVar2 = frtVar3.k;
                dzsj<rb> dzsjVar = fttVar2.eV;
                dzsj<cqhn> il = fttVar2.eW.il();
                dzsj<Executor> o = frtVar3.k.eW.o();
                dzsj<Executor> di = frtVar3.k.eW.di();
                dzsj<axrg> aI = frtVar3.k.eW.aI();
                dzsj dzsjVar2 = frtVar3.a;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new frs(frtVar3, 3);
                    frtVar3.a = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj dzsjVar4 = frtVar3.b;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new frs(frtVar3, 4);
                    frtVar3.b = dzsjVar4;
                }
                return (T) new bdlc(dzsjVar, il, o, di, aI, dzsjVar3, dzsjVar4, frtVar3.k.eW.ba(), frtVar3.k.bf(), frtVar3.k.eW.al(), frtVar3.k.eW.pf(), dxjh.c(frtVar3.k.eW.iW()));
            case 3:
                frt frtVar4 = this.a;
                dzsj<bbpv> ba = frtVar4.k.eW.ba();
                ftt fttVar3 = frtVar4.k;
                return (T) new bdlr(ba, fttVar3.eV, dxjh.c(fttVar3.eW.iW()));
            case 4:
                frt frtVar5 = this.a;
                ftt fttVar4 = frtVar5.k;
                return (T) new bdlx(fttVar4.eV, fttVar4.eW.ba(), frtVar5.k.pw(), dxjh.c(frtVar5.k.eW.iW()));
            case 5:
                frt frtVar6 = this.a;
                ftt fttVar5 = frtVar6.k;
                dzsj<rb> dzsjVar5 = fttVar5.eV;
                dzsj<btvo> V = fttVar5.eW.V();
                dzsj c = dxjh.c(frtVar6.k.m());
                dzsj<Executor> di2 = frtVar6.k.eW.di();
                dzsj<axrg> aI2 = frtVar6.k.eW.aI();
                dzsj<cjqy> al = frtVar6.k.eW.al();
                dzsj<bbpv> ba2 = frtVar6.k.eW.ba();
                dzsj dzsjVar6 = frtVar6.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new frs(frtVar6, 6);
                    frtVar6.d = dzsjVar6;
                }
                dzsj dzsjVar7 = dzsjVar6;
                dzsj dzsjVar8 = frtVar6.e;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new frs(frtVar6, 9);
                    frtVar6.e = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj dzsjVar10 = frtVar6.f;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new frs(frtVar6, 10);
                    frtVar6.f = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj dzsjVar12 = frtVar6.g;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new frs(frtVar6, 11);
                    frtVar6.g = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj dzsjVar14 = frtVar6.h;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new frs(frtVar6, 12);
                    frtVar6.h = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj dzsjVar16 = frtVar6.i;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new frs(frtVar6, 13);
                    frtVar6.i = dzsjVar16;
                }
                return (T) new bdpf(dzsjVar5, V, c, di2, aI2, al, ba2, dzsjVar7, dzsjVar9, dzsjVar11, dzsjVar13, dzsjVar15, dzsjVar16);
            case 6:
                frt frtVar7 = this.a;
                dzsj dzsjVar17 = frtVar7.c;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new frs(frtVar7, 7);
                    frtVar7.c = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj c2 = dxjh.c(frtVar7.k.eW.iW());
                dzsj<cqhn> il2 = frtVar7.k.eW.il();
                ftt fttVar6 = frtVar7.k;
                dzsj dzsjVar19 = fttVar6.cX;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fns(fttVar6, 1331);
                    fttVar6.cX = dzsjVar19;
                }
                return (T) new bdod(dzsjVar18, c2, il2, dzsjVar19, frtVar7.b());
            case 7:
                frt frtVar8 = this.a;
                ftt fttVar7 = frtVar8.k;
                return (T) new bdph(fttVar7.eV, fttVar7.eW.V(), frtVar8.k.pw());
            case 8:
                return (T) new bdrt(this.a.k.eW.R());
            case 9:
                return (T) new jmq();
            case 10:
                frt frtVar9 = this.a;
                return (T) new bdml(frtVar9.k.ad(), frtVar9.k.eW.o());
            case 11:
                frt frtVar10 = this.a;
                return (T) new bdmr(frtVar10.k.eW.di(), frtVar10.b());
            case 12:
                return (T) new bdpg(this.a.k.ut());
            case 13:
                return (T) new bdpi(this.a.k.eW.er());
            case 14:
                frt frtVar11 = this.a;
                return (T) new bduo(frtVar11.k.eW.m(), dxjh.c(frtVar11.k.eW.V()), dxjh.c(frtVar11.k.eW.jb()), dxjh.c(frtVar11.k.lD()), dxjh.c(frtVar11.k.eW.al()), frtVar11.k.tx(), dxjh.c(frtVar11.k.lf()));
            case 15:
                return (T) new bdrf(this.a.k.eW.il());
            case 16:
                frt frtVar12 = this.a;
                dzsj<ckcw> at = frtVar12.k.eW.at();
                dzsj<bbpv> ba3 = frtVar12.k.eW.ba();
                dzsj<bvjj> aw = frtVar12.k.eW.aw();
                dzsj<aesb> ef = frtVar12.k.ef();
                dzsj<auju> bh = frtVar12.k.eW.bh();
                dzsj<bbrq> jb = frtVar12.k.eW.jb();
                dzsj<cjqy> al2 = frtVar12.k.eW.al();
                dzsj dzsjVar20 = frtVar12.j;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new frs(frtVar12, 17);
                    frtVar12.j = dzsjVar20;
                }
                return (T) new bdql(at, ba3, aw, ef, bh, jb, al2, dzsjVar20, dxjh.c(frtVar12.k.eW.pd()), frtVar12.k.eW.o(), frtVar12.k.eW.di());
            case 17:
                return (T) new appz(this.a.k.wk());
            case 18:
                frt frtVar13 = this.a;
                cqhn cqhnVar = new cqhn();
                ccgr fc = frtVar13.k.eW.fc();
                Executor sU = frtVar13.k.eW.a.sU();
                dxjg.e(sU);
                caxo ff = frtVar13.k.ff();
                caxa caxaVar = caxa.PHOTOS;
                dxjg.f(caxaVar);
                return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
            default:
                frt frtVar14 = this.a;
                return (T) bdge.b(frtVar14.k.eW.m(), frtVar14.k.eW.ba(), dxjh.c(frtVar14.k.eW.iW()), frtVar14.k.eW.V());
        }
    }
}
