package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fng  reason: default package */
/* loaded from: classes6.dex */
final class fng<T> implements dzsj<T> {
    final /* synthetic */ fnh a;
    private final int b;

    public fng(fnh fnhVar, int i) {
        this.a = fnhVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fnh fnhVar = this.a;
                ftt fttVar = fnhVar.e;
                return (T) new bqub(fttVar.eV, fttVar.eW.il(), fnhVar.e.eW.bk());
            case 1:
                fnh fnhVar2 = this.a;
                dzsj dzsjVar = fnhVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fng(fnhVar2, 2);
                    fnhVar2.a = dzsjVar;
                }
                return (T) new bqus(dzsjVar);
            case 2:
                fnh fnhVar3 = this.a;
                ftt fttVar2 = fnhVar3.e;
                return (T) new bqxj(fttVar2.eV, fttVar2.eW.il(), fnhVar3.e.eW.V());
            case 3:
                fnh fnhVar4 = this.a;
                dzsj dzsjVar2 = fnhVar4.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fng(fnhVar4, 4);
                    fnhVar4.b = dzsjVar2;
                }
                return (T) new bquj(dzsjVar2);
            case 4:
                ftt fttVar3 = this.a.e;
                return (T) new bqto(fttVar3.eV, fttVar3.eW.il());
            case 5:
                fnh fnhVar5 = this.a;
                dzsj<cqhn> il = fnhVar5.e.eW.il();
                dzsj dzsjVar3 = fnhVar5.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fng(fnhVar5, 6);
                    fnhVar5.c = dzsjVar3;
                }
                return (T) new bqvi(il, dzsjVar3);
            case 6:
                fnh fnhVar6 = this.a;
                ftt fttVar4 = fnhVar6.e;
                dzsj<rb> dzsjVar4 = fttVar4.eV;
                dzsj<cqkj> y = fttVar4.y();
                dzsj<btvo> V = fnhVar6.e.eW.V();
                ftt fttVar5 = fnhVar6.e;
                dzsj dzsjVar5 = fttVar5.dG;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fns(fttVar5, 1380);
                    fttVar5.dG = dzsjVar5;
                }
                return (T) new bqvd(dzsjVar4, y, V, dzsjVar5, fnhVar6.e.eW.il());
            case 7:
                return (T) bqtw.b(new cqhn());
            case 8:
                fnh fnhVar7 = this.a;
                dzsj dzsjVar6 = fnhVar7.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fng(fnhVar7, 9);
                    fnhVar7.d = dzsjVar6;
                }
                ftt fttVar6 = fnhVar7.e;
                return (T) new bqvv(dzsjVar6, fttVar6.eV, fttVar6.eW.V());
            case 9:
                return (T) new bqsn();
            case 10:
                return (T) this.a.b();
            default:
                fnh fnhVar8 = this.a;
                cqhn cqhnVar = new cqhn();
                ccgr fc = fnhVar8.e.eW.fc();
                Executor sU = fnhVar8.e.eW.a.sU();
                dxjg.e(sU);
                caxo ff = fnhVar8.e.ff();
                caxa caxaVar = caxa.REVIEW;
                dxjg.f(caxaVar);
                return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
        }
    }
}
