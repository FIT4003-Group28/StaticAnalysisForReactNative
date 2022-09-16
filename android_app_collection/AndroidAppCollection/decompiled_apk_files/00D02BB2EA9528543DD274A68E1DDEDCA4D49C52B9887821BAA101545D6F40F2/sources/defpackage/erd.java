package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: erd  reason: default package */
/* loaded from: classes6.dex */
final class erd<T> implements dzsj<T> {
    final /* synthetic */ ere a;
    private final int b;

    public erd(ere ereVar, int i) {
        this.a = ereVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                ere ereVar = this.a;
                return (T) bxnu.b(ereVar.g.wk(), ereVar.b());
            case 2:
                ftt fttVar = this.a.g;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                ere ereVar2 = this.a;
                dzsj dzsjVar = ereVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new erd(ereVar2, 4);
                    ereVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = ereVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new erd(ereVar2, 5);
                    ereVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                ere ereVar3 = this.a;
                return (T) new bxoq(ereVar3.g.az(), ereVar3.g.aK(), ereVar3.g.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.g.aK()));
            case 6:
                ere ereVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = ereVar4.g.eW.qO();
                akox ap = ereVar4.g.ap();
                ahjq wf = ereVar4.g.eW.wf();
                avzp il = ereVar4.g.il();
                ftt fttVar2 = ereVar4.g;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = ereVar4.g.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                ere ereVar5 = this.a;
                return (T) new bxqn(ereVar5.g.ad(), ereVar5.g.eW.al(), ereVar5.g.eW.K(), ereVar5.g.eW.il(), ereVar5.g.eS(), ereVar5.g.eW.R(), ereVar5.g.cS(), ereVar5.g.cl(), ereVar5.g.eW.kf(), ereVar5.g.eW.k(), ereVar5.g.J(), ereVar5.g.jp(), ereVar5.g.eW.lk(), ereVar5.g.eW.n(), dxjh.c(ereVar5.g.eW.at()), ereVar5.g.eW.V());
            case 8:
                ere ereVar6 = this.a;
                return (T) new bxpn(ereVar6.g.eW.il(), ereVar6.g.eW.ol(), ereVar6.f);
            case 9:
                ere ereVar7 = this.a;
                ftt fttVar3 = ereVar7.g;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = ereVar7.g.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                ere ereVar8 = this.a;
                ivj fZ = ereVar8.g.fZ();
                gga wk = ereVar8.g.wk();
                efh h = ereVar8.g.h();
                gle bM = ereVar8.g.bM();
                btvo rp2 = ereVar8.g.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, ereVar8.g.cz(), ereVar8.g.gb(), new cqhu());
            case 12:
                ere ereVar9 = this.a;
                dzsj<efh> fN = ereVar9.g.fN();
                ftt fttVar4 = ereVar9.g;
                return (T) new bwow(fN, fttVar4.eV, fttVar4.cz(), ereVar9.g.aK(), ereVar9.g.bT());
            case 13:
                ere ereVar10 = this.a;
                cqat rR = ereVar10.g.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar5 = ereVar10.g;
                return (T) new bwpz(rR, fttVar5.a, new bwqd(dxjh.c(fttVar5.ay())), new bwqb(dxjh.c(ereVar10.g.ay())));
            case 14:
                ere ereVar11 = this.a;
                return (T) new vrg(ereVar11.g.eW.il(), ereVar11.g.fe(), ereVar11.g.eW.ds(), ereVar11.g.eW.n());
            case 15:
                ere ereVar12 = this.a;
                dzsj<cklf> fe = ereVar12.g.fe();
                dzsj<vpd> ds = ereVar12.g.eW.ds();
                dzsj<btrm> n = ereVar12.g.eW.n();
                dzsj dzsjVar3 = ereVar12.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new erd(ereVar12, 16);
                    ereVar12.c = dzsjVar3;
                }
                return (T) new vrc(fe, ds, n, dzsjVar3, ereVar12.g.ad(), dxjh.c(ereVar12.g.aV()));
            case 16:
                return (T) new vre(this.a.g.eV);
            case 17:
                ere ereVar13 = this.a;
                dzsj<cklf> fe2 = ereVar13.g.fe();
                dzsj<vpd> ds2 = ereVar13.g.eW.ds();
                dzsj<btrm> n2 = ereVar13.g.eW.n();
                dzsj dzsjVar4 = ereVar13.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new erd(ereVar13, 18);
                    ereVar13.d = dzsjVar4;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar4, ereVar13.g.ad(), dxjh.c(ereVar13.g.aV()));
            case 18:
                return (T) new vrr(this.a.g.eV);
            case 19:
                ere ereVar14 = this.a;
                dzsj<cklf> fe3 = ereVar14.g.fe();
                dzsj<vpd> ds3 = ereVar14.g.eW.ds();
                dzsj<btrm> n3 = ereVar14.g.eW.n();
                dzsj dzsjVar5 = ereVar14.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new erd(ereVar14, 20);
                    ereVar14.e = dzsjVar5;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar5, ereVar14.g.ad(), dxjh.c(ereVar14.g.aV()));
            case 20:
                return (T) new vrk(this.a.g.eV);
            case 21:
                ere ereVar15 = this.a;
                return (T) new bwqg(ereVar15.g.cC(), ereVar15.g.eW.I());
            default:
                return (T) this.a.c();
        }
    }
}
