package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fnm  reason: default package */
/* loaded from: classes6.dex */
final class fnm<T> implements dzsj<T> {
    final /* synthetic */ fnn a;
    private final int b;

    public fnm(fnn fnnVar, int i) {
        this.a = fnnVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fnn fnnVar = this.a;
                return (T) bxnu.b(fnnVar.d.wk(), fnnVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fnn fnnVar2 = this.a;
                dzsj dzsjVar = fnnVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fnm(fnnVar2, 4);
                    fnnVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fnnVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fnm(fnnVar2, 5);
                    fnnVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fnn fnnVar3 = this.a;
                return (T) new bxoq(fnnVar3.d.az(), fnnVar3.d.aK(), fnnVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                fnn fnnVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = fnnVar4.d.eW.qO();
                akox ap = fnnVar4.d.ap();
                ahjq wf = fnnVar4.d.eW.wf();
                avzp il = fnnVar4.d.il();
                ftt fttVar2 = fnnVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = fnnVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fnn fnnVar5 = this.a;
                return (T) new bxqn(fnnVar5.d.ad(), fnnVar5.d.eW.al(), fnnVar5.d.eW.K(), fnnVar5.d.eW.il(), fnnVar5.d.eS(), fnnVar5.d.eW.R(), fnnVar5.d.cS(), fnnVar5.d.cl(), fnnVar5.d.eW.kf(), fnnVar5.d.eW.k(), fnnVar5.d.J(), fnnVar5.d.jp(), fnnVar5.d.eW.lk(), fnnVar5.d.eW.n(), dxjh.c(fnnVar5.d.eW.at()), fnnVar5.d.eW.V());
            case 8:
                fnn fnnVar6 = this.a;
                return (T) new bxpn(fnnVar6.d.eW.il(), fnnVar6.d.eW.ol(), fnnVar6.c);
            case 9:
                fnn fnnVar7 = this.a;
                ftt fttVar3 = fnnVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = fnnVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                fnn fnnVar8 = this.a;
                ivj fZ = fnnVar8.d.fZ();
                gga wk = fnnVar8.d.wk();
                efh h = fnnVar8.d.h();
                gle bM = fnnVar8.d.bM();
                btvo rp2 = fnnVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, fnnVar8.d.cz(), fnnVar8.d.gb(), new cqhu());
        }
    }
}
