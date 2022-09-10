package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: eln  reason: default package */
/* loaded from: classes6.dex */
final class eln<T> implements dzsj<T> {
    final /* synthetic */ elo a;
    private final int b;

    public eln(elo eloVar, int i) {
        this.a = eloVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                elo eloVar = this.a;
                return (T) bxnu.b(eloVar.d.wk(), eloVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                elo eloVar2 = this.a;
                dzsj dzsjVar = eloVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new eln(eloVar2, 4);
                    eloVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = eloVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new eln(eloVar2, 5);
                    eloVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                elo eloVar3 = this.a;
                return (T) new bxoq(eloVar3.d.az(), eloVar3.d.aK(), eloVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                elo eloVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = eloVar4.d.eW.qO();
                akox ap = eloVar4.d.ap();
                ahjq wf = eloVar4.d.eW.wf();
                avzp il = eloVar4.d.il();
                ftt fttVar2 = eloVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = eloVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                elo eloVar5 = this.a;
                return (T) new bxqn(eloVar5.d.ad(), eloVar5.d.eW.al(), eloVar5.d.eW.K(), eloVar5.d.eW.il(), eloVar5.d.eS(), eloVar5.d.eW.R(), eloVar5.d.cS(), eloVar5.d.cl(), eloVar5.d.eW.kf(), eloVar5.d.eW.k(), eloVar5.d.J(), eloVar5.d.jp(), eloVar5.d.eW.lk(), eloVar5.d.eW.n(), dxjh.c(eloVar5.d.eW.at()), eloVar5.d.eW.V());
            case 8:
                elo eloVar6 = this.a;
                return (T) new bxpn(eloVar6.d.eW.il(), eloVar6.d.eW.ol(), eloVar6.c);
            case 9:
                elo eloVar7 = this.a;
                ftt fttVar3 = eloVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = eloVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                elo eloVar8 = this.a;
                ivj fZ = eloVar8.d.fZ();
                gga wk = eloVar8.d.wk();
                efh h = eloVar8.d.h();
                gle bM = eloVar8.d.bM();
                btvo rp2 = eloVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, eloVar8.d.cz(), eloVar8.d.gb(), new cqhu());
        }
    }
}
