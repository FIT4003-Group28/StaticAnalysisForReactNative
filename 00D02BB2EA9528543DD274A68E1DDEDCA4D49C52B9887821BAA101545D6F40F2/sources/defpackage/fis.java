package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fis  reason: default package */
/* loaded from: classes6.dex */
final class fis<T> implements dzsj<T> {
    final /* synthetic */ fit a;
    private final int b;

    public fis(fit fitVar, int i) {
        this.a = fitVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fit fitVar = this.a;
                return (T) bxnu.b(fitVar.d.wk(), fitVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fit fitVar2 = this.a;
                dzsj dzsjVar = fitVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fis(fitVar2, 4);
                    fitVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fitVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fis(fitVar2, 5);
                    fitVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fit fitVar3 = this.a;
                return (T) new bxoq(fitVar3.d.az(), fitVar3.d.aK(), fitVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                fit fitVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = fitVar4.d.eW.qO();
                akox ap = fitVar4.d.ap();
                ahjq wf = fitVar4.d.eW.wf();
                avzp il = fitVar4.d.il();
                ftt fttVar2 = fitVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = fitVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fit fitVar5 = this.a;
                return (T) new bxqn(fitVar5.d.ad(), fitVar5.d.eW.al(), fitVar5.d.eW.K(), fitVar5.d.eW.il(), fitVar5.d.eS(), fitVar5.d.eW.R(), fitVar5.d.cS(), fitVar5.d.cl(), fitVar5.d.eW.kf(), fitVar5.d.eW.k(), fitVar5.d.J(), fitVar5.d.jp(), fitVar5.d.eW.lk(), fitVar5.d.eW.n(), dxjh.c(fitVar5.d.eW.at()), fitVar5.d.eW.V());
            case 8:
                fit fitVar6 = this.a;
                return (T) new bxpn(fitVar6.d.eW.il(), fitVar6.d.eW.ol(), fitVar6.c);
            case 9:
                fit fitVar7 = this.a;
                ftt fttVar3 = fitVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = fitVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                fit fitVar8 = this.a;
                ivj fZ = fitVar8.d.fZ();
                gga wk = fitVar8.d.wk();
                efh h = fitVar8.d.h();
                gle bM = fitVar8.d.bM();
                btvo rp2 = fitVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, fitVar8.d.cz(), fitVar8.d.gb(), new cqhu());
        }
    }
}
