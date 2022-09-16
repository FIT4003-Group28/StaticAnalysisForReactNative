package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ffj  reason: default package */
/* loaded from: classes6.dex */
final class ffj<T> implements dzsj<T> {
    final /* synthetic */ ffk a;
    private final int b;

    public ffj(ffk ffkVar, int i) {
        this.a = ffkVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                ffk ffkVar = this.a;
                return (T) bxnu.b(ffkVar.g.wk(), ffkVar.b());
            case 2:
                ftt fttVar = this.a.g;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                ffk ffkVar2 = this.a;
                dzsj dzsjVar = ffkVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new ffj(ffkVar2, 4);
                    ffkVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = ffkVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new ffj(ffkVar2, 5);
                    ffkVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                ffk ffkVar3 = this.a;
                return (T) new bxoq(ffkVar3.g.az(), ffkVar3.g.aK(), ffkVar3.g.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.g.aK()));
            case 6:
                ffk ffkVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = ffkVar4.g.eW.qO();
                akox ap = ffkVar4.g.ap();
                ahjq wf = ffkVar4.g.eW.wf();
                avzp il = ffkVar4.g.il();
                ftt fttVar2 = ffkVar4.g;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = ffkVar4.g.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                ffk ffkVar5 = this.a;
                return (T) new bxqn(ffkVar5.g.ad(), ffkVar5.g.eW.al(), ffkVar5.g.eW.K(), ffkVar5.g.eW.il(), ffkVar5.g.eS(), ffkVar5.g.eW.R(), ffkVar5.g.cS(), ffkVar5.g.cl(), ffkVar5.g.eW.kf(), ffkVar5.g.eW.k(), ffkVar5.g.J(), ffkVar5.g.jp(), ffkVar5.g.eW.lk(), ffkVar5.g.eW.n(), dxjh.c(ffkVar5.g.eW.at()), ffkVar5.g.eW.V());
            case 8:
                ffk ffkVar6 = this.a;
                return (T) new bxpn(ffkVar6.g.eW.il(), ffkVar6.g.eW.ol(), ffkVar6.f);
            case 9:
                ffk ffkVar7 = this.a;
                ftt fttVar3 = ffkVar7.g;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = ffkVar7.g.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                ffk ffkVar8 = this.a;
                ivj fZ = ffkVar8.g.fZ();
                gga wk = ffkVar8.g.wk();
                efh h = ffkVar8.g.h();
                gle bM = ffkVar8.g.bM();
                btvo rp2 = ffkVar8.g.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, ffkVar8.g.cz(), ffkVar8.g.gb(), new cqhu());
            case 12:
                ffk ffkVar9 = this.a;
                dzsj<efh> fN = ffkVar9.g.fN();
                ftt fttVar4 = ffkVar9.g;
                return (T) new bwow(fN, fttVar4.eV, fttVar4.cz(), ffkVar9.g.aK(), ffkVar9.g.bT());
            case 13:
                ffk ffkVar10 = this.a;
                cqat rR = ffkVar10.g.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar5 = ffkVar10.g;
                return (T) new bwpz(rR, fttVar5.a, new bwqd(dxjh.c(fttVar5.ay())), new bwqb(dxjh.c(ffkVar10.g.ay())));
            case 14:
                ffk ffkVar11 = this.a;
                return (T) new vrg(ffkVar11.g.eW.il(), ffkVar11.g.fe(), ffkVar11.g.eW.ds(), ffkVar11.g.eW.n());
            case 15:
                ffk ffkVar12 = this.a;
                dzsj<cklf> fe = ffkVar12.g.fe();
                dzsj<vpd> ds = ffkVar12.g.eW.ds();
                dzsj<btrm> n = ffkVar12.g.eW.n();
                dzsj dzsjVar3 = ffkVar12.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ffj(ffkVar12, 16);
                    ffkVar12.c = dzsjVar3;
                }
                return (T) new vrc(fe, ds, n, dzsjVar3, ffkVar12.g.ad(), dxjh.c(ffkVar12.g.aV()));
            case 16:
                return (T) new vre(this.a.g.eV);
            case 17:
                ffk ffkVar13 = this.a;
                dzsj<cklf> fe2 = ffkVar13.g.fe();
                dzsj<vpd> ds2 = ffkVar13.g.eW.ds();
                dzsj<btrm> n2 = ffkVar13.g.eW.n();
                dzsj dzsjVar4 = ffkVar13.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new ffj(ffkVar13, 18);
                    ffkVar13.d = dzsjVar4;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar4, ffkVar13.g.ad(), dxjh.c(ffkVar13.g.aV()));
            case 18:
                return (T) new vrr(this.a.g.eV);
            case 19:
                ffk ffkVar14 = this.a;
                dzsj<cklf> fe3 = ffkVar14.g.fe();
                dzsj<vpd> ds3 = ffkVar14.g.eW.ds();
                dzsj<btrm> n3 = ffkVar14.g.eW.n();
                dzsj dzsjVar5 = ffkVar14.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ffj(ffkVar14, 20);
                    ffkVar14.e = dzsjVar5;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar5, ffkVar14.g.ad(), dxjh.c(ffkVar14.g.aV()));
            case 20:
                return (T) new vrk(this.a.g.eV);
            default:
                ffk ffkVar15 = this.a;
                return (T) new bwqg(ffkVar15.g.cC(), ffkVar15.g.eW.I());
        }
    }
}
