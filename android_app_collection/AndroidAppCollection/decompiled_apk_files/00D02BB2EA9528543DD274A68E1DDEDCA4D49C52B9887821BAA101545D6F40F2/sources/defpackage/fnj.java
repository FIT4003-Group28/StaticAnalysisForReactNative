package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fnj  reason: default package */
/* loaded from: classes6.dex */
final class fnj<T> implements dzsj<T> {
    final /* synthetic */ fnk a;
    private final int b;

    public fnj(fnk fnkVar, int i) {
        this.a = fnkVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fnk fnkVar = this.a;
                return (T) bxnu.b(fnkVar.d.wk(), fnkVar.b());
            case 2:
                ftt fttVar = this.a.d;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fnk fnkVar2 = this.a;
                dzsj dzsjVar = fnkVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fnj(fnkVar2, 4);
                    fnkVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fnkVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fnj(fnkVar2, 5);
                    fnkVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fnk fnkVar3 = this.a;
                return (T) new bxoq(fnkVar3.d.az(), fnkVar3.d.aK(), fnkVar3.d.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.d.aK()));
            case 6:
                fnk fnkVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = fnkVar4.d.eW.qO();
                akox ap = fnkVar4.d.ap();
                ahjq wf = fnkVar4.d.eW.wf();
                avzp il = fnkVar4.d.il();
                ftt fttVar2 = fnkVar4.d;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = fnkVar4.d.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fnk fnkVar5 = this.a;
                return (T) new bxqn(fnkVar5.d.ad(), fnkVar5.d.eW.al(), fnkVar5.d.eW.K(), fnkVar5.d.eW.il(), fnkVar5.d.eS(), fnkVar5.d.eW.R(), fnkVar5.d.cS(), fnkVar5.d.cl(), fnkVar5.d.eW.kf(), fnkVar5.d.eW.k(), fnkVar5.d.J(), fnkVar5.d.jp(), fnkVar5.d.eW.lk(), fnkVar5.d.eW.n(), dxjh.c(fnkVar5.d.eW.at()), fnkVar5.d.eW.V());
            case 8:
                fnk fnkVar6 = this.a;
                return (T) new bxpn(fnkVar6.d.eW.il(), fnkVar6.d.eW.ol(), fnkVar6.c);
            case 9:
                fnk fnkVar7 = this.a;
                ftt fttVar3 = fnkVar7.d;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = fnkVar7.d.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            default:
                fnk fnkVar8 = this.a;
                ivj fZ = fnkVar8.d.fZ();
                gga wk = fnkVar8.d.wk();
                efh h = fnkVar8.d.h();
                gle bM = fnkVar8.d.bM();
                btvo rp2 = fnkVar8.d.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, fnkVar8.d.cz(), fnkVar8.d.gb(), new cqhu());
        }
    }
}
