package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fll  reason: default package */
/* loaded from: classes6.dex */
public final class fll<T> implements dzsj<T> {
    final /* synthetic */ flm a;
    private final int b;

    public fll(flm flmVar, int i) {
        this.a = flmVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v24, types: [T, bxpa] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                return (T) this.a.b();
            case 1:
                flm flmVar = this.a;
                return (T) bxnu.b(flmVar.h.wk(), flmVar.b());
            case 2:
                ftt fttVar = this.a.h;
                return (T) new bxqs(fttVar.eV, dxjh.c(fttVar.cz()));
            case 3:
                flm flmVar2 = this.a;
                dzsj dzsjVar = flmVar2.a;
                if (dzsjVar == null) {
                    dzsjVar = new fll(flmVar2, 4);
                    flmVar2.a = dzsjVar;
                }
                dzsj dzsjVar2 = flmVar2.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new fll(flmVar2, 5);
                    flmVar2.b = dzsjVar2;
                }
                return (T) new bxos(dzsjVar, dzsjVar2);
            case 4:
                flm flmVar3 = this.a;
                return (T) new bxoq(flmVar3.h.az(), flmVar3.h.aK(), flmVar3.h.eW.mj());
            case 5:
                return (T) new bxpp(dxjh.c(this.a.h.aK()));
            case 6:
                flm flmVar4 = this.a;
                cqhn cqhnVar = new cqhn();
                avij qO = flmVar4.h.eW.qO();
                akox ap = flmVar4.h.ap();
                ahjq wf = flmVar4.h.eW.wf();
                avzp il = flmVar4.h.il();
                ftt fttVar2 = flmVar4.h;
                rb rbVar = fttVar2.a;
                Executor sU = fttVar2.eW.a.sU();
                dxjg.e(sU);
                cztz m = flmVar4.h.eW.a.m();
                dxjg.e(m);
                ?? r1 = (T) bxpb.b(cqhnVar, qO, ap, wf, il, rbVar, sU, m);
                r1.h();
                return r1;
            case 7:
                flm flmVar5 = this.a;
                return (T) new bxqn(flmVar5.h.ad(), flmVar5.h.eW.al(), flmVar5.h.eW.K(), flmVar5.h.eW.il(), flmVar5.h.eS(), flmVar5.h.eW.R(), flmVar5.h.cS(), flmVar5.h.cl(), flmVar5.h.eW.kf(), flmVar5.h.eW.k(), flmVar5.h.J(), flmVar5.h.jp(), flmVar5.h.eW.lk(), flmVar5.h.eW.n(), dxjh.c(flmVar5.h.eW.at()), flmVar5.h.eW.V());
            case 8:
                flm flmVar6 = this.a;
                return (T) new bxpn(flmVar6.h.eW.il(), flmVar6.h.eW.ol(), flmVar6.g);
            case 9:
                flm flmVar7 = this.a;
                ftt fttVar3 = flmVar7.h;
                rb rbVar2 = fttVar3.a;
                dxio c = dxjc.c(fttVar3.bm());
                btvo rp = flmVar7.h.eW.a.rp();
                dxjg.e(rp);
                return (T) bxou.b(rbVar2, c, rp);
            case 10:
                return (T) new bxqk();
            case 11:
                flm flmVar8 = this.a;
                ivj fZ = flmVar8.h.fZ();
                gga wk = flmVar8.h.wk();
                efh h = flmVar8.h.h();
                gle bM = flmVar8.h.bM();
                btvo rp2 = flmVar8.h.eW.a.rp();
                dxjg.e(rp2);
                return (T) new bxqd(fZ, wk, h, bM, rp2, flmVar8.h.cz(), flmVar8.h.gb(), new cqhu());
            case 12:
                flm flmVar9 = this.a;
                dzsj<cqhn> il2 = flmVar9.h.eW.il();
                dzsj c2 = dxjh.c(flmVar9.h.eW.cx());
                dzsj dzsjVar3 = flmVar9.c;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fll(flmVar9, 13);
                    flmVar9.c = dzsjVar3;
                }
                dzsj c3 = dxjh.c(dzsjVar3);
                dzsj dzsjVar4 = flmVar9.d;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fll(flmVar9, 14);
                    flmVar9.d = dzsjVar4;
                }
                dzsj c4 = dxjh.c(dzsjVar4);
                dzsj dzsjVar5 = flmVar9.f;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fll(flmVar9, 15);
                    flmVar9.f = dzsjVar5;
                }
                return (T) new bxtf(il2, c2, c3, c4, dzsjVar5, dxjh.c(flmVar9.h.J()), dxjh.c(flmVar9.h.aX()), dxjh.c(flmVar9.h.eW.oS()), flmVar9.h.ad(), flmVar9.h.eW.oN(), flmVar9.h.eW.oP(), flmVar9.h.eW.al(), flmVar9.h.eW.hN());
            case 13:
                flm flmVar10 = this.a;
                return (T) new bxtr(flmVar10.h.ad(), flmVar10.g, dxjh.c(flmVar10.h.J()), flmVar10.h.eW.V());
            case 14:
                flm flmVar11 = this.a;
                return (T) new bxtt(flmVar11.g, dxjh.c(flmVar11.h.H()), flmVar11.h.eV);
            case 15:
                flm flmVar12 = this.a;
                dzsj<gga> ad = flmVar12.h.ad();
                dzsj<cqhn> il3 = flmVar12.h.eW.il();
                dzsj c5 = dxjh.c(flmVar12.h.J());
                dzsj dzsjVar6 = flmVar12.e;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fll(flmVar12, 16);
                    flmVar12.e = dzsjVar6;
                }
                return (T) new wfx(ad, il3, c5, dxjh.c(dzsjVar6), flmVar12.h.eW.hN(), flmVar12.h.eW.al(), flmVar12.h.eW.oN(), flmVar12.h.eW.hj());
            case 16:
                flm flmVar13 = this.a;
                return (T) new wgb(flmVar13.h.ad(), flmVar13.g);
            case 17:
                cqat rR = this.a.h.eW.a.rR();
                dxjg.e(rR);
                return (T) new bato(rR);
            case 18:
                flm flmVar14 = this.a;
                return (T) new bxyu(flmVar14.h.eW.K(), flmVar14.h.eV);
            case 19:
                flm flmVar15 = this.a;
                return (T) new bxzr(bxyz.b(dxjh.c(flmVar15.h.ay()), dxjh.c(flmVar15.h.eW.dT()), flmVar15.h.eW.V(), dxjh.c(flmVar15.h.eW.k()), flmVar15.c(), flmVar15.h.eW.mj()), new bxzb(dxjh.c(flmVar15.h.ay()), flmVar15.c(), flmVar15.h.eW.lc(), flmVar15.h.eW.mj(), flmVar15.h.eW.V()), bxyj.b(dxjh.c(flmVar15.h.bo()), flmVar15.c()));
            case 20:
                ftt fttVar4 = this.a.h;
                rb rbVar3 = fttVar4.a;
                cqat rR2 = fttVar4.eW.a.rR();
                dxjg.e(rR2);
                return (T) bxyq.b(rbVar3, rR2);
            case 21:
                return (T) new bxyk(this.a.h.wk());
            default:
                return (T) new bxzc(this.a.h.wk());
        }
    }
}
