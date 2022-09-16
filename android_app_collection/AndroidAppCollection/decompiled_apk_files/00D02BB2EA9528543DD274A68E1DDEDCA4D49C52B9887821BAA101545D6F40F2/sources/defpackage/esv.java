package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: esv  reason: default package */
/* loaded from: classes6.dex */
final class esv<T> implements dzsj<T> {
    final /* synthetic */ esw a;
    private final int b;

    public esv(esw eswVar, int i) {
        this.a = eswVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                esw eswVar = this.a;
                return (T) bxnu.b(eswVar.d.wk(), eswVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                esw eswVar2 = this.a;
                dzsj dzsjVar = eswVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new esv(eswVar2, 4);
                    eswVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = eswVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new esv(eswVar2, 5);
                    eswVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                esw eswVar3 = this.a;
                return (T) new bxoq(eswVar3.d.az(), eswVar3.d.aK(), eswVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                esw eswVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = eswVar4.d.eW.qO();
                akox ap = eswVar4.d.ap();
                ahjq wf = eswVar4.d.eW.wf();
                avzp il = eswVar4.d.il();
                ftt fttVar2 = eswVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = eswVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                esw eswVar5 = this.a;
                return (T) new bxqn(eswVar5.d.ad(), eswVar5.d.eW.al(), eswVar5.d.eW.K(), eswVar5.d.eW.il(), eswVar5.d.eS(), eswVar5.d.eW.R(), eswVar5.d.cS(), eswVar5.d.cl(), eswVar5.d.eW.kf(), eswVar5.d.eW.k(), eswVar5.d.J(), eswVar5.d.jp(), eswVar5.d.eW.lk(), eswVar5.d.eW.n(), dxjh.c(eswVar5.d.eW.at()), eswVar5.d.eW.V());
            case 8:
                esw eswVar6 = this.a;
                return (T) new bxpn(eswVar6.d.eW.il(), eswVar6.d.eW.ol(), eswVar6.c);
            case 9:
                esw eswVar7 = this.a;
                ftt fttVar3 = eswVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = eswVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                esw eswVar8 = this.a;
                ivj fZ = eswVar8.d.fZ();
                gga wk = eswVar8.d.wk();
                efh h = eswVar8.d.h();
                gle bM = eswVar8.d.bM();
                btvo rp2 = eswVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, eswVar8.d.cz(), eswVar8.d.gb(), new cqhu());
        }
    }
}
