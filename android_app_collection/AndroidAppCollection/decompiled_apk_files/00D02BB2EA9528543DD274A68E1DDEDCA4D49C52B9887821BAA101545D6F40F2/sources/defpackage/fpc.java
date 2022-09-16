package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fpc  reason: default package */
/* loaded from: classes6.dex */
final class fpc<T> implements dzsj<T> {
    final /* synthetic */ fpd a;
    private final int b;

    public fpc(fpd fpdVar, int i) {
        this.a = fpdVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [T, bvgj] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fpd fpdVar = this.a;
                dzsj dzsjVar = fpdVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new fpc(fpdVar, 1);
                    fpdVar.a = dzsjVar;
                }
                return (T) new byiq(dzsjVar, fpdVar.b.eW.K());
            case 1:
                fpd fpdVar2 = this.a;
                T t = (T) fpdVar2.c;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(fpdVar2.b.eW.h());
                bvrb tn = fpdVar2.b.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) new bvgj(new bvgi(c, tn));
                fpdVar2.c = r1;
                return r1;
            case 2:
                fpd fpdVar3 = this.a;
                dzsj<bvjj> aw = fpdVar3.b.eW.aw();
                dzsj<axwq> u = fpdVar3.b.eW.u();
                dzsj<btrm> n = fpdVar3.b.eW.n();
                dzsj<srv> ry = fpdVar3.b.eW.ry();
                dzsj<vxa> fq = fpdVar3.b.eW.fq();
                dzsj<adza> ij = fpdVar3.b.eW.ij();
                dzsj c2 = dxjh.c(fpdVar3.b.eW.k());
                ftt fttVar = fpdVar3.b;
                return (T) new byjf(aw, u, n, ry, fq, ij, c2, fttVar.eV, fttVar.ve(), fpdVar3.b.eW.V());
            case 3:
                fpd fpdVar4 = this.a;
                akox ap = fpdVar4.b.ap();
                ftt fttVar2 = fpdVar4.b;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                return (T) new bynx(ap, rbVar, sU);
            case 4:
                fpd fpdVar5 = this.a;
                return (T) new gun(fpdVar5.b.eW.di(), fpdVar5.b.eW.al(), fpdVar5.b.eW.hN(), fpdVar5.b.T(), fpdVar5.b.eb(), fpdVar5.b.eW.aI());
            case 5:
                return (T) new byjj(this.a.b.eW.jm());
            case 6:
                return (T) new byjm(this.a.b.eW.jm());
            case 7:
                fpd fpdVar6 = this.a;
                ftt fttVar3 = fpdVar6.b;
                return (T) new byjv(fttVar3.eV, fttVar3.eW.aw(), dxjh.c(fpdVar6.b.m()), fpdVar6.b.eW.K());
            case 8:
                fpd fpdVar7 = this.a;
                ftt fttVar4 = fpdVar7.b;
                return (T) new byjr(fttVar4.eV, fttVar4.eW.il(), dxjh.c(fpdVar7.b.eW.p()), dxjh.c(fpdVar7.b.eW.u()), dxjh.c(fpdVar7.b.J()), fpdVar7.b.eW.aw(), fpdVar7.b.eW.K());
            case 9:
                fpd fpdVar8 = this.a;
                ftt fttVar5 = fpdVar8.b;
                return (T) new byjb(fttVar5.a, fttVar5.eW.g(), dxjc.c(fpdVar8.b.H()));
            case 10:
                ftt fttVar6 = this.a.b;
                return (T) new byjs(fttVar6.a, fttVar6.hO());
            default:
                ftt fttVar7 = this.a.b;
                return (T) new byix(fttVar7.a, dxjc.c(fttVar7.r()));
        }
    }
}
