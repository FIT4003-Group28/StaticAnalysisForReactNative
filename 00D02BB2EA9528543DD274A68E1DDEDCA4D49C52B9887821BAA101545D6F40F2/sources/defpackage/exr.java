package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: exr  reason: default package */
/* loaded from: classes6.dex */
final class exr<T> implements dzsj<T> {
    final /* synthetic */ exs a;
    private final int b;

    public exr(exs exsVar, int i) {
        this.a = exsVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                exs exsVar = this.a;
                return (T) bxnu.b(exsVar.d.wk(), exsVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                exs exsVar2 = this.a;
                dzsj dzsjVar = exsVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new exr(exsVar2, 4);
                    exsVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = exsVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new exr(exsVar2, 5);
                    exsVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                exs exsVar3 = this.a;
                return (T) new bxoq(exsVar3.d.az(), exsVar3.d.aK(), exsVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                exs exsVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = exsVar4.d.eW.qO();
                akox ap = exsVar4.d.ap();
                ahjq wf = exsVar4.d.eW.wf();
                avzp il = exsVar4.d.il();
                ftt fttVar2 = exsVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = exsVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                exs exsVar5 = this.a;
                return (T) new bxqn(exsVar5.d.ad(), exsVar5.d.eW.al(), exsVar5.d.eW.K(), exsVar5.d.eW.il(), exsVar5.d.eS(), exsVar5.d.eW.R(), exsVar5.d.cS(), exsVar5.d.cl(), exsVar5.d.eW.kf(), exsVar5.d.eW.k(), exsVar5.d.J(), exsVar5.d.jp(), exsVar5.d.eW.lk(), exsVar5.d.eW.n(), dxjh.c(exsVar5.d.eW.at()), exsVar5.d.eW.V());
            case 8:
                exs exsVar6 = this.a;
                return (T) new bxpn(exsVar6.d.eW.il(), exsVar6.d.eW.ol(), exsVar6.c);
            case 9:
                exs exsVar7 = this.a;
                ftt fttVar3 = exsVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = exsVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                exs exsVar8 = this.a;
                ivj fZ = exsVar8.d.fZ();
                gga wk = exsVar8.d.wk();
                efh h = exsVar8.d.h();
                gle bM = exsVar8.d.bM();
                btvo rp2 = exsVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, exsVar8.d.cz(), exsVar8.d.gb(), new cqhu());
        }
    }
}
