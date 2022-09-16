package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fkv  reason: default package */
/* loaded from: classes6.dex */
public final class fkv<T> implements dzsj<T> {
    final /* synthetic */ fkw a;
    private final int b;

    public fkv(fkw fkwVar, int i) {
        this.a = fkwVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v140, types: [T, burp] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fkw fkwVar = this.a;
                return (T) new bagk(fkwVar.l.aX(), fkwVar.l.J());
            case 1:
                fkw fkwVar2 = this.a;
                return (T) new aosp(fkwVar2.l.ad(), fkwVar2.l.dL(), fkwVar2.l.eW.al());
            case 2:
                fkw fkwVar3 = this.a;
                huc jf = fkwVar3.l.jf();
                cqhn cqhnVar = new cqhn();
                btpc sz = fkwVar3.l.eW.a.sz();
                dxjg.e(sz);
                btrg fl = fkwVar3.l.eW.fl();
                Executor sU = fkwVar3.l.eW.a.sU();
                dxjg.e(sU);
                return (T) new bagz(jf, cqhnVar, sz, fl, sU, fkwVar3.l.wk(), fkwVar3.l.eW.wf(), fkwVar3.l.eW.fm(), fkwVar3.l.jH(), fkwVar3.b(), fkwVar3.l.jd());
            case 3:
                fkw fkwVar4 = this.a;
                huc jf2 = fkwVar4.l.jf();
                cqat rR = fkwVar4.l.eW.a.rR();
                dxjg.e(rR);
                cqhn cqhnVar2 = new cqhn();
                btpc sz2 = fkwVar4.l.eW.a.sz();
                dxjg.e(sz2);
                btrg fl2 = fkwVar4.l.eW.fl();
                Executor sU2 = fkwVar4.l.eW.a.sU();
                dxjg.e(sU2);
                return (T) new bahj(jf2, rR, cqhnVar2, sz2, fl2, sU2, fkwVar4.l.wk(), fkwVar4.l.eW.fm(), fkwVar4.l.jH(), fkwVar4.b(), fkwVar4.l.jd());
            case 4:
                fkw fkwVar5 = this.a;
                dzsj dzsjVar = fkwVar5.a;
                if (dzsjVar == null) {
                    dzsjVar = new fkv(fkwVar5, 5);
                    fkwVar5.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<cqhn> il = fkwVar5.l.eW.il();
                dzsj<Executor> di = fkwVar5.l.eW.di();
                dzsj<gga> ad = fkwVar5.l.ad();
                dzsj<bwqv> er = fkwVar5.l.eW.er();
                dzsj c = dxjh.c(fkwVar5.l.eW.el());
                dzsj dzsjVar3 = fkwVar5.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fkv(fkwVar5, 8);
                    fkwVar5.b = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fkwVar5.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fkv(fkwVar5, 9);
                    fkwVar5.c = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fkwVar5.f;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fkv(fkwVar5, 10);
                    fkwVar5.f = dzsjVar7;
                }
                return (T) new baia(dzsjVar2, il, di, ad, er, c, dzsjVar4, dzsjVar6, dzsjVar7, fkwVar5.l.eW.V());
            case 5:
                fkw fkwVar6 = this.a;
                return (T) new baez(fkwVar6.l.ad(), fkwVar6.l.eW.er(), fkwVar6.d(), dxjh.c(fkwVar6.l.J()), dxjh.c(fkwVar6.l.aX()), fkwVar6.l.eW.hj(), fkwVar6.f());
            case 6:
                return (T) this.a.c();
            case 7:
                return (T) this.a.e();
            case 8:
                fkw fkwVar7 = this.a;
                return (T) new baib(fkwVar7.l.eW.il(), fkwVar7.l.ad());
            case 9:
                fkw fkwVar8 = this.a;
                gga wk = fkwVar8.l.wk();
                bvrb tn = fkwVar8.l.eW.a.tn();
                dxjg.e(tn);
                axwq qn = fkwVar8.l.eW.qn();
                bwqv rD = fkwVar8.l.eW.a.rD();
                dxjg.e(rD);
                return (T) bbau.b(wk, tn, qn, rD, fkwVar8.l.eW.qq(), fkwVar8.c(), fkwVar8.g(), fkwVar8.e(), fkwVar8.l.eW.fm());
            case 10:
                fkw fkwVar9 = this.a;
                dzsj<gga> ad2 = fkwVar9.l.ad();
                dzsj<bwqv> er2 = fkwVar9.l.eW.er();
                dzsj<ania> hj = fkwVar9.l.eW.hj();
                dzsj<aymh> d = fkwVar9.d();
                dzsj dzsjVar8 = fkwVar9.d;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fkv(fkwVar9, 11);
                    fkwVar9.d = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj c2 = dxjh.c(fkwVar9.l.eW());
                dzsj<batz> f = fkwVar9.f();
                dzsj<cqhn> il2 = fkwVar9.l.eW.il();
                dzsj dzsjVar10 = fkwVar9.e;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fkv(fkwVar9, 12);
                    fkwVar9.e = dzsjVar10;
                }
                return (T) new bbca(ad2, er2, hj, d, dzsjVar9, c2, f, il2, dzsjVar10, fkwVar9.l.up(), fkwVar9.l.eW.oL());
            case 11:
                return (T) this.a.g();
            case 12:
                return (T) axzf.b(this.a.l.eW.fn());
            case 13:
                fkw fkwVar10 = this.a;
                dzsj<anhg> aX = fkwVar10.l.aX();
                dzsj<btpc> cx = fkwVar10.l.eW.cx();
                dzsj<gga> ad3 = fkwVar10.l.ad();
                dzsj<bvjj> aw = fkwVar10.l.eW.aw();
                dzsj<cqhn> il3 = fkwVar10.l.eW.il();
                dzsj dzsjVar11 = fkwVar10.i;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fkv(fkwVar10, 14);
                    fkwVar10.i = dzsjVar11;
                }
                dzsj dzsjVar12 = dzsjVar11;
                dzsj dzsjVar13 = fkwVar10.j;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new fkv(fkwVar10, 17);
                    fkwVar10.j = dzsjVar13;
                }
                return (T) new aotf(aX, cx, ad3, aw, il3, dzsjVar12, dzsjVar13, fkwVar10.l.jg(), fkwVar10.l.je());
            case 14:
                fkw fkwVar11 = this.a;
                dzsj dzsjVar14 = fkwVar11.g;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fkv(fkwVar11, 15);
                    fkwVar11.g = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj<Executor> di2 = fkwVar11.l.eW.di();
                dzsj<Executor> o = fkwVar11.l.eW.o();
                dzsj<btpc> cx2 = fkwVar11.l.eW.cx();
                dzsj<babb> dzsjVar16 = fkwVar11.k;
                dzsj<btrm> n = fkwVar11.l.eW.n();
                dzsj<anhk> mf = fkwVar11.l.eW.mf();
                dzsj dzsjVar17 = fkwVar11.h;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fkv(fkwVar11, 16);
                    fkwVar11.h = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                ftt fttVar = fkwVar11.l;
                dzsj<rb> dzsjVar19 = fttVar.eV;
                dzsj<cqat> K = fttVar.eW.K();
                fyu fyuVar = fkwVar11.l.eW;
                dzsj dzsjVar20 = fyuVar.dI;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fxy(fyuVar, 707);
                    fyuVar.dI = dzsjVar20;
                }
                return (T) new aosw(dzsjVar15, di2, o, cx2, dzsjVar16, n, mf, dzsjVar18, dzsjVar19, K, dzsjVar20);
            case 15:
                fkw fkwVar12 = this.a;
                akfa rK = fkwVar12.l.eW.a.rK();
                dxjg.e(rK);
                cjns au = fkwVar12.l.eW.au();
                dehq tg = fkwVar12.l.eW.a.tg();
                dxjg.e(tg);
                return (T) new anqr(rK, au, tg);
            case 16:
                fkw fkwVar13 = this.a;
                T t = (T) fkwVar13.m;
                if (t != null) {
                    return t;
                }
                dxio c3 = dxjc.c(fkwVar13.l.eW.h());
                bvrb tn2 = fkwVar13.l.eW.a.tn();
                dxjg.e(tn2);
                ?? r1 = (T) new burp(new buro(c3, tn2));
                fkwVar13.m = r1;
                return r1;
            default:
                return (T) new aoth(this.a.l.aX());
        }
    }
}
