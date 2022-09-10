package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: feu  reason: default package */
/* loaded from: classes6.dex */
public final class feu<T> implements dzsj<T> {
    final /* synthetic */ fev a;
    private final int b;

    public feu(fev fevVar, int i) {
        this.a = fevVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [T, bvap, bvan] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fev fevVar = this.a;
                return (T) new bdfc(fevVar.i.eW.fr(), fevVar.b());
            case 1:
                return (T) bcqk.b(this.a.a);
            case 2:
                fev fevVar2 = this.a;
                T t = (T) fevVar2.b;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(fevVar2.i.eW.h());
                bvrb tn = fevVar2.i.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) bvar.b(bvaq.b(c, tn));
                fevVar2.b = r2;
                return r2;
            case 3:
                return (T) new bdfe(this.a.i.eW.il());
            case 4:
                fev fevVar3 = this.a;
                dzsj dzsjVar = fevVar3.c;
                if (dzsjVar == null) {
                    dzsjVar = new feu(fevVar3, 5);
                    fevVar3.c = dzsjVar;
                }
                return (T) new bdcm(dzsjVar);
            case 5:
                return (T) this.a.c();
            case 6:
                return (T) new bdcj(this.a.i.ux());
            case 7:
                fev fevVar4 = this.a;
                return (T) new bddz(fevVar4.i.eW.at(), fevVar4.i.eW.hN(), fevVar4.i.eW.lK(), fevVar4.i.eW.m(), fevVar4.i.da());
            case 8:
                fev fevVar5 = this.a;
                rb rbVar = fevVar5.i.a;
                cqhn cqhnVar = new cqhn();
                apqe le = fevVar5.i.le();
                cjqy tr = fevVar5.i.eW.a.tr();
                dxjg.e(tr);
                return (T) new bddb(rbVar, cqhnVar, le, tr, fevVar5.a, fevVar5.c(), bcql.b(fevVar5.a), bcqh.b(fevVar5.a));
            case 9:
                fev fevVar6 = this.a;
                ftt fttVar = fevVar6.i;
                return (T) bdcq.b(fttVar.a, fttVar.aQ(), dxjc.c(fevVar6.i.m()), bcqg.b(fevVar6.a));
            case 10:
                return (T) bcqe.b(this.a.a);
            case 11:
                return (T) bcqd.b(this.a.a);
            case 12:
                return (T) bcqi.b(this.a.a);
            case 13:
                return (T) bcqj.b(this.a.a);
            case 14:
                fev fevVar7 = this.a;
                return (T) new bdew(fevVar7.i.a, fevVar7.a);
            case 15:
                fev fevVar8 = this.a;
                ftt fttVar2 = fevVar8.i;
                return (T) new bdbp(fttVar2.eV, fttVar2.eW.er(), fevVar8.h);
            case 16:
                fev fevVar9 = this.a;
                ftt fttVar3 = fevVar9.i;
                return (T) new bdbr(fttVar3.a, dxjc.c(fttVar3.aX()), fevVar9.a);
            case 17:
                fev fevVar10 = this.a;
                ftt fttVar4 = fevVar10.i;
                return (T) new bddk(fttVar4.a, dxjc.c(fttVar4.aX()), fevVar10.a);
            case 18:
                fev fevVar11 = this.a;
                return (T) new bddi(fevVar11.i.a, fevVar11.a);
            case 19:
                fev fevVar12 = this.a;
                dzsj<rb> dzsjVar2 = fevVar12.i.eV;
                dzsj dzsjVar3 = fevVar12.d;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new feu(fevVar12, 20);
                    fevVar12.d = dzsjVar3;
                }
                return (T) new bdbi(dzsjVar2, dzsjVar3, fevVar12.h);
            case 20:
                return (T) bcbb.b();
            case 21:
                fev fevVar13 = this.a;
                ftt fttVar5 = fevVar13.i;
                return (T) new bddt(fttVar5.eV, fttVar5.eW.il(), fevVar13.i.y(), fevVar13.i.uy(), fevVar13.i.eW.R(), fevVar13.h);
            case 22:
                fev fevVar14 = this.a;
                return (T) new afxz(fevVar14.i.eW.I(), fevVar14.i.eW.V(), fevVar14.i.ux(), fevVar14.i.eW.pg());
            case 23:
                fev fevVar15 = this.a;
                afxv uw = fevVar15.i.uw();
                btvo rp = fevVar15.i.eW.a.rp();
                dxjg.e(rp);
                return (T) new bcro(uw, rp);
            case 24:
                fev fevVar16 = this.a;
                return (T) new bdcf(fevVar16.i.eW.I(), fevVar16.d(), fevVar16.e());
            case 25:
                return (T) new bcqy(dxjh.c(this.a.i.bf()));
            case 26:
                return (T) new bdez(this.a.h);
            case 27:
                fev fevVar17 = this.a;
                dzsj<rb> dzsjVar4 = fevVar17.i.eV;
                dzsj dzsjVar5 = fevVar17.g;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new feu(fevVar17, 28);
                    fevVar17.g = dzsjVar5;
                }
                return (T) new bdes(dzsjVar4, dzsjVar5);
            case 28:
                fev fevVar18 = this.a;
                dzsj<Application> m = fevVar18.i.eW.m();
                dzsj<bvjj> aw = fevVar18.i.eW.aw();
                dzsj c2 = dxjh.c(fevVar18.i.eW.p());
                dzsj<bfgx> nu = fevVar18.i.nu();
                dzsj<cqhn> il = fevVar18.i.eW.il();
                dzsj<gga> ad = fevVar18.i.ad();
                dzsj<ahjq> k = fevVar18.i.eW.k();
                dzsj<bwqv> er = fevVar18.i.eW.er();
                dzsj<brvm> sG = fevVar18.i.sG();
                dzsj<aeqg> jA = fevVar18.i.jA();
                dzsj<bmmq> sI = fevVar18.i.sI();
                dzsj dzsjVar6 = fevVar18.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new feu(fevVar18, 29);
                    fevVar18.e = dzsjVar6;
                }
                dzsj dzsjVar7 = dzsjVar6;
                dzsj<akox> as = fevVar18.i.as();
                dzsj<bdvy> fr = fevVar18.i.fr();
                dzsj<bfhu> sR = fevVar18.i.sR();
                dzsj<bnjv> pl = fevVar18.i.pl();
                dzsj<begg> az = fevVar18.i.az();
                dzsj<brwc> sU = fevVar18.i.sU();
                dzsj dzsjVar8 = fevVar18.f;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new feu(fevVar18, 30);
                    fevVar18.f = dzsjVar8;
                }
                return (T) new bdcz(m, aw, c2, nu, il, ad, k, er, sG, jA, sI, dzsjVar7, as, fr, sR, pl, az, sU, dzsjVar8, fevVar18.i.sY());
            case 29:
                fev fevVar19 = this.a;
                return (T) new bdct(fevVar19.i.pl(), fevVar19.i.J(), fevVar19.i.bf(), fevVar19.i.iW());
            default:
                fev fevVar20 = this.a;
                return (T) new aaaf(fevVar20.i.uz(), fevVar20.i.ui(), fevVar20.i.az(), fevVar20.i.eW.lY());
        }
    }
}
