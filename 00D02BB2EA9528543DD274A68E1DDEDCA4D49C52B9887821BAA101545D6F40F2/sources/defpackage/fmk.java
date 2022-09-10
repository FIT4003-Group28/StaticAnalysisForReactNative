package defpackage;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fmk  reason: default package */
/* loaded from: classes6.dex */
public final class fmk<T> implements dzsj<T> {
    final /* synthetic */ fml a;
    private final int b;

    public fmk(fml fmlVar, int i) {
        this.a = fmlVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v27, types: [T, bvfh, bvff] */
    /* JADX WARN: Type inference failed for: r2v37, types: [bvfp, bvfn, T] */
    /* JADX WARN: Type inference failed for: r2v45, types: [T, bvel] */
    /* JADX WARN: Type inference failed for: r2v68, types: [T, bvez] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                fml fmlVar = this.a;
                dzsj<gga> ad = fmlVar.m.ad();
                dzsj<cqhn> il = fmlVar.m.eW.il();
                dzsj<bjgo> pX = fmlVar.m.pX();
                dzsj<afgy> cx = fmlVar.m.cx();
                dzsj c = dxjh.c(fmlVar.m.m());
                dzsj<btrm> n = fmlVar.m.eW.n();
                dzsj<btvo> V = fmlVar.m.eW.V();
                dzsj<bvff> b = fmlVar.b();
                dzsj<bjgi> qa = fmlVar.m.qa();
                dzsj<bjgy> qb = fmlVar.m.qb();
                dzsj<bkak> qd = fmlVar.m.qd();
                dzsj<bjyl> qf = fmlVar.m.qf();
                dzsj<bjyr> qh = fmlVar.m.qh();
                dzsj dzsjVar = fmlVar.g;
                if (dzsjVar == null) {
                    dzsjVar = new fmk(fmlVar, 2);
                    fmlVar.g = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = fmlVar.h;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fmk(fmlVar, 8);
                    fmlVar.h = dzsjVar3;
                }
                return (T) new bjxm(ad, il, pX, cx, c, n, V, b, qa, qb, qd, qf, qh, dzsjVar2, dzsjVar3);
            case 1:
                fml fmlVar2 = this.a;
                T t = (T) fmlVar2.a;
                if (t != null) {
                    return t;
                }
                dxio c2 = dxjc.c(fmlVar2.m.eW.h());
                bvrb tn = fmlVar2.m.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) bvfj.b(bvfi.b(c2, tn));
                fmlVar2.a = r2;
                return r2;
            case 2:
                fml fmlVar3 = this.a;
                fmlVar3.m.ad();
                fmlVar3.m.eW.il();
                if (fmlVar3.d == null) {
                    fmlVar3.d = new fmk(fmlVar3, 3);
                }
                if (fmlVar3.e == null) {
                    fmlVar3.e = new fmk(fmlVar3, 6);
                }
                if (fmlVar3.f == null) {
                    fmlVar3.f = new fmk(fmlVar3, 7);
                }
                fmlVar3.m.qa();
                fmlVar3.m.eW.di();
                return (T) new bjzs();
            case 3:
                fml fmlVar4 = this.a;
                fmlVar4.m.ad();
                if (fmlVar4.b == null) {
                    fmlVar4.b = new fmk(fmlVar4, 4);
                }
                fmlVar4.m.qa();
                fmlVar4.c();
                fmlVar4.m.eW.di();
                fmlVar4.m.qb();
                return (T) new bjyn();
            case 4:
                return (T) new bjxv(this.a.m.ad());
            case 5:
                fml fmlVar5 = this.a;
                T t2 = (T) fmlVar5.c;
                if (t2 != null) {
                    return t2;
                }
                dxio c3 = dxjc.c(fmlVar5.m.eW.h());
                bvrb tn2 = fmlVar5.m.eW.a.tn();
                dxjg.e(tn2);
                ?? r22 = (T) bvfr.b(bvfq.b(c3, tn2));
                fmlVar5.c = r22;
                return r22;
            case 6:
                fml fmlVar6 = this.a;
                fmlVar6.m.ad();
                fmlVar6.m.pT();
                fmlVar6.m.cN();
                return (T) new bjym();
            case 7:
                fml fmlVar7 = this.a;
                T t3 = (T) fmlVar7.n;
                if (t3 != null) {
                    return t3;
                }
                dxio c4 = dxjc.c(fmlVar7.m.eW.h());
                bvrb tn3 = fmlVar7.m.eW.a.tn();
                dxjg.e(tn3);
                ?? r23 = (T) bven.b(bvem.b(c4, tn3));
                fmlVar7.n = r23;
                return r23;
            case 8:
                fml fmlVar8 = this.a;
                fmlVar8.m.ad();
                fmlVar8.m.eW.il();
                return (T) new bjzt();
            case 9:
                fml fmlVar9 = this.a;
                dzsj<gga> ad2 = fmlVar9.m.ad();
                dzsj<bjgu> pO = fmlVar9.m.pO();
                dzsj dzsjVar4 = fmlVar9.i;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new fmk(fmlVar9, 10);
                    fmlVar9.i = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = fmlVar9.j;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new fmk(fmlVar9, 11);
                    fmlVar9.j = dzsjVar6;
                }
                return (T) new bjxq(ad2, pO, dzsjVar5, dzsjVar6, fmlVar9.m.eW.n(), fmlVar9.m.qa(), fmlVar9.m.eW.di(), fmlVar9.m.lf());
            case 10:
                fml fmlVar10 = this.a;
                return (T) new bjxt(fmlVar10.m.ad(), fmlVar10.m.eW.il(), fmlVar10.m.eW.bk());
            case 11:
                fml fmlVar11 = this.a;
                T t4 = (T) fmlVar11.o;
                if (t4 != null) {
                    return t4;
                }
                dxio c5 = dxjc.c(fmlVar11.m.eW.h());
                bvrb tn4 = fmlVar11.m.eW.a.tn();
                dxjg.e(tn4);
                ?? r24 = (T) bvfb.b(bvfa.b(c5, tn4));
                fmlVar11.o = r24;
                return r24;
            case 12:
                fml fmlVar12 = this.a;
                dzsj<cqhn> il2 = fmlVar12.m.eW.il();
                dzsj<bjgu> pO2 = fmlVar12.m.pO();
                dzsj<bvff> b2 = fmlVar12.b();
                dzsj<btrm> n2 = fmlVar12.m.eW.n();
                dzsj<chhr> uu = fmlVar12.m.uu();
                dzsj<chht> fP = fmlVar12.m.fP();
                dzsj<bjhc> pT = fmlVar12.m.pT();
                dzsj<cafi> aR = fmlVar12.m.aR();
                dzsj<bjgi> qa2 = fmlVar12.m.qa();
                dzsj dzsjVar7 = fmlVar12.k;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fmk(fmlVar12, 13);
                    fmlVar12.k = dzsjVar7;
                }
                return (T) new bjje(il2, pO2, b2, n2, uu, fP, pT, aR, qa2, dzsjVar7);
            case 13:
                fml fmlVar13 = this.a;
                cqhn cqhnVar = new cqhn();
                ccgr fc = fmlVar13.m.eW.fc();
                Executor sU = fmlVar13.m.eW.a.sU();
                dxjg.e(sU);
                caxo ff = fmlVar13.m.ff();
                caxa caxaVar = caxa.QA;
                dxjg.f(caxaVar);
                return (T) cayk.b(cqhnVar, fc, sU, ff, caxaVar);
            case 14:
                return (T) new bjhs(this.a.m.pQ());
            case 15:
                fml fmlVar14 = this.a;
                return (T) new bjze(fmlVar14.m.ad(), fmlVar14.m.eW.il(), fmlVar14.m.eW.er(), fmlVar14.m.qh(), fmlVar14.m.qd(), fmlVar14.m.qj(), fmlVar14.m.eW.n(), fmlVar14.m.pY(), fmlVar14.m.eW.di(), fmlVar14.m.qa(), dxjh.c(fmlVar14.m.m()), fmlVar14.m.qb());
            case 16:
                fml fmlVar15 = this.a;
                if (fmlVar15.l == null) {
                    fmlVar15.l = new fmk(fmlVar15, 17);
                }
                return (T) new bjzu();
            default:
                fml fmlVar16 = this.a;
                fmlVar16.m.eW.il();
                fmlVar16.m.ad();
                fmlVar16.m.pT();
                fmlVar16.m.cN();
                fmlVar16.c();
                fmlVar16.m.qa();
                fmlVar16.m.eW.di();
                return (T) new bjzv();
        }
    }
}
