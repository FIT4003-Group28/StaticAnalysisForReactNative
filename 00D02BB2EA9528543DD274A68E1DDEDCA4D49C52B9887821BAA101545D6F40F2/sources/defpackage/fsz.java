package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fsz  reason: default package */
/* loaded from: classes6.dex */
final class fsz<T> implements dzsj<T> {
    final /* synthetic */ fta a;
    private final int b;

    public fsz(fta ftaVar, int i) {
        this.a = ftaVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                fta ftaVar = this.a;
                return (T) bxnu.b(ftaVar.g.wk(), ftaVar.b());
            case 2:
                ftt fttVar = this.a.g;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                fta ftaVar2 = this.a;
                dzsj dzsjVar = ftaVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fsz(ftaVar2, 4);
                    ftaVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = ftaVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fsz(ftaVar2, 5);
                    ftaVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                fta ftaVar3 = this.a;
                return (T) new bxoq(ftaVar3.g.az(), ftaVar3.g.aK(), ftaVar3.g.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.g.aK()));
            case 6:
                fta ftaVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = ftaVar4.g.eW.qO();
                akox ap = ftaVar4.g.ap();
                ahjq wf = ftaVar4.g.eW.wf();
                avzp il = ftaVar4.g.il();
                ftt fttVar2 = ftaVar4.g;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = ftaVar4.g.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                fta ftaVar5 = this.a;
                return (T) new bxqn(ftaVar5.g.ad(), ftaVar5.g.eW.al(), ftaVar5.g.eW.K(), ftaVar5.g.eW.il(), ftaVar5.g.eS(), ftaVar5.g.eW.R(), ftaVar5.g.cS(), ftaVar5.g.cl(), ftaVar5.g.eW.kf(), ftaVar5.g.eW.k(), ftaVar5.g.J(), ftaVar5.g.jp(), ftaVar5.g.eW.lk(), ftaVar5.g.eW.n(), dxjh.c(ftaVar5.g.eW.at()), ftaVar5.g.eW.V());
            case 8:
                fta ftaVar6 = this.a;
                return (T) new bxpn(ftaVar6.g.eW.il(), ftaVar6.g.eW.ol(), ftaVar6.f);
            case 9:
                fta ftaVar7 = this.a;
                ftt fttVar3 = ftaVar7.g;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = ftaVar7.g.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                fta ftaVar8 = this.a;
                ivj fZ = ftaVar8.g.fZ();
                gga wk = ftaVar8.g.wk();
                efh h = ftaVar8.g.h();
                gle bM = ftaVar8.g.bM();
                btvo rp2 = ftaVar8.g.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, ftaVar8.g.cz(), ftaVar8.g.gb(), new cqhu());
            case 12:
                fta ftaVar9 = this.a;
                dzsj<efh> fN = ftaVar9.g.fN();
                ftt fttVar4 = ftaVar9.g;
                return (T) new bwow(fN, fttVar4.eV, fttVar4.cz(), ftaVar9.g.aK(), ftaVar9.g.bT());
            case 13:
                fta ftaVar10 = this.a;
                cqat rR = ftaVar10.g.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar5 = ftaVar10.g;
                return (T) new bwpz(rR, fttVar5.a, new bwqd(dxjh.c(fttVar5.ay())), new bwqb(dxjh.c(ftaVar10.g.ay())));
            case 14:
                fta ftaVar11 = this.a;
                return (T) new vrg(ftaVar11.g.eW.il(), ftaVar11.g.fe(), ftaVar11.g.eW.ds(), ftaVar11.g.eW.n());
            case 15:
                fta ftaVar12 = this.a;
                dzsj<cklf> fe = ftaVar12.g.fe();
                dzsj<vpd> ds = ftaVar12.g.eW.ds();
                dzsj<btrm> n = ftaVar12.g.eW.n();
                dzsj dzsjVar3 = ftaVar12.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fsz(ftaVar12, 16);
                    ftaVar12.c = dzsjVar3;
                }
                return (T) new vrc(fe, ds, n, dzsjVar3, ftaVar12.g.ad(), dxjh.c(ftaVar12.g.aV()));
            case 16:
                return (T) new vre(this.a.g.eV);
            case 17:
                fta ftaVar13 = this.a;
                dzsj<cklf> fe2 = ftaVar13.g.fe();
                dzsj<vpd> ds2 = ftaVar13.g.eW.ds();
                dzsj<btrm> n2 = ftaVar13.g.eW.n();
                dzsj dzsjVar4 = ftaVar13.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fsz(ftaVar13, 18);
                    ftaVar13.d = dzsjVar4;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar4, ftaVar13.g.ad(), dxjh.c(ftaVar13.g.aV()));
            case 18:
                return (T) new vrr(this.a.g.eV);
            case 19:
                fta ftaVar14 = this.a;
                dzsj<cklf> fe3 = ftaVar14.g.fe();
                dzsj<vpd> ds3 = ftaVar14.g.eW.ds();
                dzsj<btrm> n3 = ftaVar14.g.eW.n();
                dzsj dzsjVar5 = ftaVar14.e;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fsz(ftaVar14, 20);
                    ftaVar14.e = dzsjVar5;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar5, ftaVar14.g.ad(), dxjh.c(ftaVar14.g.aV()));
            case 20:
                return (T) new vrk(this.a.g.eV);
            default:
                fta ftaVar15 = this.a;
                return (T) new bwqg(ftaVar15.g.cC(), ftaVar15.g.eW.I());
        }
    }
}
