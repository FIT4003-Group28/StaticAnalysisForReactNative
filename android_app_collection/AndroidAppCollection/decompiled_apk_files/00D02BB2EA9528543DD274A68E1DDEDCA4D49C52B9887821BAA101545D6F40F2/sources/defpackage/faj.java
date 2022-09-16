package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: faj  reason: default package */
/* loaded from: classes6.dex */
final class faj<T> implements dzsj<T> {
    final /* synthetic */ fak a;
    private final int b;

    public faj(fak fakVar, int i) {
        this.a = fakVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fak fakVar = this.a;
                return (T) bxnu.b(fakVar.g.wk(), fakVar.b());
            case 2:
                ftt fttVar = this.a.g;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fak fakVar2 = this.a;
                dzsj dzsjVar = fakVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new faj(fakVar2, 4);
                    fakVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = fakVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new faj(fakVar2, 5);
                    fakVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fak fakVar3 = this.a;
                return (T) new bxoq(fakVar3.g.az(), fakVar3.g.aK(), fakVar3.g.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.g.aK()));
            case 6:
                fak fakVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = fakVar4.g.eW.qO();
                akox ap = fakVar4.g.ap();
                ahjq wf = fakVar4.g.eW.wf();
                avzp il = fakVar4.g.il();
                ftt fttVar2 = fakVar4.g;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = fakVar4.g.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fak fakVar5 = this.a;
                return (T) new bxqn(fakVar5.g.ad(), fakVar5.g.eW.al(), fakVar5.g.eW.K(), fakVar5.g.eW.il(), fakVar5.g.eS(), fakVar5.g.eW.R(), fakVar5.g.cS(), fakVar5.g.cl(), fakVar5.g.eW.kf(), fakVar5.g.eW.k(), fakVar5.g.J(), fakVar5.g.jp(), fakVar5.g.eW.lk(), fakVar5.g.eW.n(), dxjh.c(fakVar5.g.eW.at()), fakVar5.g.eW.V());
            case 8:
                fak fakVar6 = this.a;
                return (T) new bxpn(fakVar6.g.eW.il(), fakVar6.g.eW.ol(), fakVar6.f);
            case 9:
                fak fakVar7 = this.a;
                ftt fttVar3 = fakVar7.g;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = fakVar7.g.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                fak fakVar8 = this.a;
                ivj fZ = fakVar8.g.fZ();
                gga wk = fakVar8.g.wk();
                efh h = fakVar8.g.h();
                gle bM = fakVar8.g.bM();
                btvo rp2 = fakVar8.g.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, fakVar8.g.cz(), fakVar8.g.gb(), new cqhu());
            case 12:
                fak fakVar9 = this.a;
                dzsj<efh> fN = fakVar9.g.fN();
                ftt fttVar4 = fakVar9.g;
                return (T) new bwow(fN, fttVar4.eV, fttVar4.cz(), fakVar9.g.aK(), fakVar9.g.bT());
            case 13:
                fak fakVar10 = this.a;
                cqat rR = fakVar10.g.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar5 = fakVar10.g;
                return (T) new bwpz(rR, fttVar5.a, new bwqd(dxjh.c(fttVar5.ay())), new bwqb(dxjh.c(fakVar10.g.ay())));
            case 14:
                fak fakVar11 = this.a;
                return (T) new vrg(fakVar11.g.eW.il(), fakVar11.g.fe(), fakVar11.g.eW.ds(), fakVar11.g.eW.n());
            case 15:
                fak fakVar12 = this.a;
                dzsj<cklf> fe = fakVar12.g.fe();
                dzsj<vpd> ds = fakVar12.g.eW.ds();
                dzsj<btrm> n = fakVar12.g.eW.n();
                dzsj dzsjVar3 = fakVar12.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new faj(fakVar12, 16);
                    fakVar12.c = dzsjVar3;
                }
                return (T) new vrc(fe, ds, n, dzsjVar3, fakVar12.g.ad(), dxjh.c(fakVar12.g.aV()));
            case 16:
                return (T) new vre(this.a.g.eV);
            case 17:
                fak fakVar13 = this.a;
                dzsj<cklf> fe2 = fakVar13.g.fe();
                dzsj<vpd> ds2 = fakVar13.g.eW.ds();
                dzsj<btrm> n2 = fakVar13.g.eW.n();
                dzsj dzsjVar4 = fakVar13.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new faj(fakVar13, 18);
                    fakVar13.d = dzsjVar4;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar4, fakVar13.g.ad(), dxjh.c(fakVar13.g.aV()));
            case 18:
                return (T) new vrr(this.a.g.eV);
            case 19:
                fak fakVar14 = this.a;
                dzsj<cklf> fe3 = fakVar14.g.fe();
                dzsj<vpd> ds3 = fakVar14.g.eW.ds();
                dzsj<btrm> n3 = fakVar14.g.eW.n();
                dzsj dzsjVar5 = fakVar14.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new faj(fakVar14, 20);
                    fakVar14.e = dzsjVar5;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar5, fakVar14.g.ad(), dxjh.c(fakVar14.g.aV()));
            case 20:
                return (T) new vrk(this.a.g.eV);
            default:
                fak fakVar15 = this.a;
                return (T) new bwqg(fakVar15.g.cC(), fakVar15.g.eW.I());
        }
    }
}
