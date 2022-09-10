package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fbh  reason: default package */
/* loaded from: classes6.dex */
final class fbh<T> implements dzsj<T> {
    final /* synthetic */ fbi a;
    private final int b;

    public fbh(fbi fbiVar, int i) {
        this.a = fbiVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fbi fbiVar = this.a;
                return (T) bxnu.b(fbiVar.g.wk(), fbiVar.b());
            case 2:
                ftt fttVar = this.a.g;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fbi fbiVar2 = this.a;
                dzsj dzsjVar = fbiVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fbh(fbiVar2, 4);
                    fbiVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fbiVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fbh(fbiVar2, 5);
                    fbiVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fbi fbiVar3 = this.a;
                return (T) new bxoq(fbiVar3.g.az(), fbiVar3.g.aK(), fbiVar3.g.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.g.aK()));
            case 6:
                fbi fbiVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = fbiVar4.g.eW.qO();
                akox ap = fbiVar4.g.ap();
                ahjq wf = fbiVar4.g.eW.wf();
                avzp il = fbiVar4.g.il();
                ftt fttVar2 = fbiVar4.g;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = fbiVar4.g.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fbi fbiVar5 = this.a;
                return (T) new bxqn(fbiVar5.g.ad(), fbiVar5.g.eW.al(), fbiVar5.g.eW.K(), fbiVar5.g.eW.il(), fbiVar5.g.eS(), fbiVar5.g.eW.R(), fbiVar5.g.cS(), fbiVar5.g.cl(), fbiVar5.g.eW.kf(), fbiVar5.g.eW.k(), fbiVar5.g.J(), fbiVar5.g.jp(), fbiVar5.g.eW.lk(), fbiVar5.g.eW.n(), dxjh.c(fbiVar5.g.eW.at()), fbiVar5.g.eW.V());
            case 8:
                fbi fbiVar6 = this.a;
                return (T) new bxpn(fbiVar6.g.eW.il(), fbiVar6.g.eW.ol(), fbiVar6.f);
            case 9:
                fbi fbiVar7 = this.a;
                ftt fttVar3 = fbiVar7.g;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = fbiVar7.g.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                fbi fbiVar8 = this.a;
                ivj fZ = fbiVar8.g.fZ();
                gga wk = fbiVar8.g.wk();
                efh h = fbiVar8.g.h();
                gle bM = fbiVar8.g.bM();
                btvo rp2 = fbiVar8.g.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, fbiVar8.g.cz(), fbiVar8.g.gb(), new cqhu());
            case 12:
                fbi fbiVar9 = this.a;
                dzsj<efh> fN = fbiVar9.g.fN();
                ftt fttVar4 = fbiVar9.g;
                return (T) new bwow(fN, fttVar4.eV, fttVar4.cz(), fbiVar9.g.aK(), fbiVar9.g.bT());
            case 13:
                fbi fbiVar10 = this.a;
                cqat rR = fbiVar10.g.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar5 = fbiVar10.g;
                return (T) new bwpz(rR, fttVar5.a, new bwqd(dxjh.c(fttVar5.ay())), new bwqb(dxjh.c(fbiVar10.g.ay())));
            case 14:
                fbi fbiVar11 = this.a;
                return (T) new vrg(fbiVar11.g.eW.il(), fbiVar11.g.fe(), fbiVar11.g.eW.ds(), fbiVar11.g.eW.n());
            case 15:
                fbi fbiVar12 = this.a;
                dzsj<cklf> fe = fbiVar12.g.fe();
                dzsj<vpd> ds = fbiVar12.g.eW.ds();
                dzsj<btrm> n = fbiVar12.g.eW.n();
                dzsj dzsjVar3 = fbiVar12.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fbh(fbiVar12, 16);
                    fbiVar12.c = dzsjVar3;
                }
                return (T) new vrc(fe, ds, n, dzsjVar3, fbiVar12.g.ad(), dxjh.c(fbiVar12.g.aV()));
            case 16:
                return (T) new vre(this.a.g.eV);
            case 17:
                fbi fbiVar13 = this.a;
                dzsj<cklf> fe2 = fbiVar13.g.fe();
                dzsj<vpd> ds2 = fbiVar13.g.eW.ds();
                dzsj<btrm> n2 = fbiVar13.g.eW.n();
                dzsj dzsjVar4 = fbiVar13.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fbh(fbiVar13, 18);
                    fbiVar13.d = dzsjVar4;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar4, fbiVar13.g.ad(), dxjh.c(fbiVar13.g.aV()));
            case 18:
                return (T) new vrr(this.a.g.eV);
            case 19:
                fbi fbiVar14 = this.a;
                dzsj<cklf> fe3 = fbiVar14.g.fe();
                dzsj<vpd> ds3 = fbiVar14.g.eW.ds();
                dzsj<btrm> n3 = fbiVar14.g.eW.n();
                dzsj dzsjVar5 = fbiVar14.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fbh(fbiVar14, 20);
                    fbiVar14.e = dzsjVar5;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar5, fbiVar14.g.ad(), dxjh.c(fbiVar14.g.aV()));
            case 20:
                return (T) new vrk(this.a.g.eV);
            default:
                fbi fbiVar15 = this.a;
                return (T) new bwqg(fbiVar15.g.cC(), fbiVar15.g.eW.I());
        }
    }
}
