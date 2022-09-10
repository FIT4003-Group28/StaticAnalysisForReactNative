package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: eou  reason: default package */
/* loaded from: classes6.dex */
public final class eou<T> implements dzsj<T> {
    final /* synthetic */ eov a;
    private final int b;

    public eou(eov eovVar, int i) {
        this.a = eovVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r2v116, types: [T, bvev] */
    /* JADX WARN: Type inference failed for: r2v146, types: [T, bvfh, bvff] */
    /* JADX WARN: Type inference failed for: r2v153, types: [bvfp, bvfn, T] */
    @Override // defpackage.dzsj
    public final T a() {
        dzsj<bzph> dzsjVar;
        switch (this.b) {
            case 0:
                eov eovVar = this.a;
                dzsj dzsjVar2 = eovVar.b;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new eou(eovVar, 1);
                    eovVar.b = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj dzsjVar4 = eovVar.c;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new eou(eovVar, 4);
                    eovVar.c = dzsjVar4;
                }
                dzsj dzsjVar5 = dzsjVar4;
                dzsj dzsjVar6 = eovVar.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new eou(eovVar, 5);
                    eovVar.d = dzsjVar6;
                }
                dzsj dzsjVar7 = dzsjVar6;
                dzsj dzsjVar8 = eovVar.f;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new eou(eovVar, 6);
                    eovVar.f = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj<caez> c = eovVar.c();
                dzsj<blpp> tk = eovVar.t.tk();
                dzsj<cjns> bm = eovVar.t.eW.bm();
                dzsj<bsvm> aV = eovVar.t.aV();
                dzsj<caym> rn = eovVar.t.rn();
                dzsj<Resources> fr = eovVar.t.eW.fr();
                dzsj<btrm> n = eovVar.t.eW.n();
                dzsj<bvrb> R = eovVar.t.eW.R();
                dzsj<bvjj> aw = eovVar.t.eW.aw();
                dzsj dzsjVar10 = eovVar.g;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new eou(eovVar, 9);
                    eovVar.g = dzsjVar10;
                }
                return (T) new cael(dzsjVar3, dzsjVar5, dzsjVar7, dzsjVar9, c, tk, bm, aV, rn, fr, n, R, aw, dzsjVar10, eovVar.t.eW.V(), eovVar.t.eW.mL(), eovVar.t.ad(), eovVar.t.aR(), eovVar.t.cQ());
            case 1:
                eov eovVar2 = this.a;
                ftt fttVar = eovVar2.t;
                dzsj<rb> dzsjVar11 = fttVar.eV;
                dzsj<akfa> p = fttVar.eW.p();
                dzsj<bvrb> R2 = eovVar2.t.eW.R();
                dzsj<begg> az = eovVar2.t.az();
                dzsj<anhg> aX = eovVar2.t.aX();
                dzsj<bbut> bf = eovVar2.t.bf();
                dzsj<bqly> aJ = eovVar2.t.aJ();
                dzsj c2 = dxjh.c(eovVar2.t.eW.jB());
                dzsj<anhk> mf = eovVar2.t.eW.mf();
                dzsj<Resources> fr2 = eovVar2.t.eW.fr();
                ftt fttVar2 = eovVar2.t;
                dzsj dzsjVar12 = fttVar2.cn;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fns(fttVar2, 1250);
                    fttVar2.cn = dzsjVar12;
                }
                dzsj<bvjj> aw2 = eovVar2.t.eW.aw();
                dzsj<bzph> dL = eovVar2.t.dL();
                dzsj<ania> hj = eovVar2.t.eW.hj();
                dzsj<bmdv> lL = eovVar2.t.eW.lL();
                dzsj<cjqy> al = eovVar2.t.eW.al();
                dzsj<btvo> V = eovVar2.t.eW.V();
                dzsj<cqhn> il = eovVar2.t.eW.il();
                ftt fttVar3 = eovVar2.t;
                dzsj dzsjVar13 = fttVar3.co;
                if (dzsjVar13 == null) {
                    dzsjVar = dL;
                    dzsjVar13 = new fns(fttVar3, 1251);
                    fttVar3.co = dzsjVar13;
                } else {
                    dzsjVar = dL;
                }
                dzsj<aufl> ax = eovVar2.t.eW.ax();
                dzsj<auju> bh = eovVar2.t.eW.bh();
                dzsj<cafz> b = eovVar2.b();
                dzsj<bbpv> ba = eovVar2.t.eW.ba();
                dzsj dzsjVar14 = eovVar2.a;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new eou(eovVar2, 3);
                    eovVar2.a = dzsjVar14;
                }
                return (T) new cady(dzsjVar11, p, R2, az, aX, bf, aJ, c2, mf, fr2, dzsjVar12, aw2, dzsjVar, hj, lL, al, V, il, dzsjVar13, ax, bh, b, ba, dzsjVar14, eovVar2.t.eW.bk());
            case 2:
                btvo rp = this.a.t.eW.a.rp();
                dxjg.e(rp);
                return (T) new cafz(rp);
            case 3:
                return (T) new caeb(dxjh.c(this.a.t.eW.fr()));
            case 4:
                return (T) new cabt(this.a.t.bs());
            case 5:
                eov eovVar3 = this.a;
                return (T) new caeo(eovVar3.t.fD(), eovVar3.t.cQ(), eovVar3.t.eW.fr(), eovVar3.t.eW.V());
            case 6:
                eov eovVar4 = this.a;
                dzsj dzsjVar15 = eovVar4.e;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new eou(eovVar4, 7);
                    eovVar4.e = dzsjVar15;
                }
                return (T) new caeq(dzsjVar15, eovVar4.t.eV);
            case 7:
                return (T) new caes(this.a.t.gA());
            case 8:
                eov eovVar5 = this.a;
                return (T) new caez(eovVar5.t.eW.bu(), eovVar5.t.eV);
            case 9:
                return (T) this.a.d();
            case 10:
                eov eovVar6 = this.a;
                dzsj<bvjj> aw3 = eovVar6.t.eW.aw();
                dzsj<cafi> aR = eovVar6.t.aR();
                dzsj c3 = dxjh.c(eovVar6.t.eW.p());
                dzsj dzsjVar16 = eovVar6.h;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new eou(eovVar6, 11);
                    eovVar6.h = dzsjVar16;
                }
                dzsj dzsjVar17 = dzsjVar16;
                dzsj dzsjVar18 = eovVar6.i;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new eou(eovVar6, 12);
                    eovVar6.i = dzsjVar18;
                }
                dzsj dzsjVar19 = dzsjVar18;
                dzsj dzsjVar20 = eovVar6.j;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new eou(eovVar6, 13);
                    eovVar6.j = dzsjVar20;
                }
                return (T) new cabi(aw3, aR, c3, dzsjVar17, dzsjVar19, dzsjVar20, eovVar6.c(), dxjh.c(eovVar6.t.rn()), eovVar6.t.eW.V(), eovVar6.t.eW.mL(), eovVar6.t.ad(), eovVar6.t.ro());
            case 11:
                eov eovVar7 = this.a;
                dzsj<amfi> bu = eovVar7.t.eW.bu();
                ftt fttVar4 = eovVar7.t;
                return (T) new cagk(bu, fttVar4.eV, fttVar4.fe());
            case 12:
                ftt fttVar5 = this.a.t;
                return (T) new cavc(fttVar5.eV, fttVar5.jn());
            case 13:
                ftt fttVar6 = this.a.t;
                return (T) new cave(fttVar6.eV, fttVar6.jn());
            case 14:
                eov eovVar8 = this.a;
                dzsj<gga> ad = eovVar8.t.ad();
                dzsj<cafi> aR2 = eovVar8.t.aR();
                dzsj<cqhn> il2 = eovVar8.t.eW.il();
                dzsj dzsjVar21 = eovVar8.r;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new eou(eovVar8, 15);
                    eovVar8.r = dzsjVar21;
                }
                return (T) new cacd(ad, aR2, il2, dzsjVar21, eovVar8.c(), eovVar8.t.eW.V());
            case 15:
                eov eovVar9 = this.a;
                dzsj dzsjVar22 = eovVar9.k;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new eou(eovVar9, 16);
                    eovVar9.k = dzsjVar22;
                }
                dzsj<Executor> di = eovVar9.t.eW.di();
                dzsj dzsjVar23 = eovVar9.q;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new eou(eovVar9, 17);
                    eovVar9.q = dzsjVar23;
                }
                return (T) new caui(dzsjVar22, di, dzsjVar23);
            case 16:
                eov eovVar10 = this.a;
                T t = (T) eovVar10.u;
                if (t != null) {
                    return t;
                }
                dxio c4 = dxjc.c(eovVar10.t.eW.h());
                bvrb tn = eovVar10.t.eW.a.tn();
                dxjg.e(tn);
                ?? r2 = (T) bvex.b(bvew.b(c4, tn));
                eovVar10.u = r2;
                return r2;
            case 17:
                eov eovVar11 = this.a;
                dzsj<gga> ad2 = eovVar11.t.ad();
                dzsj<Resources> fr3 = eovVar11.t.eW.fr();
                dzsj<begg> az2 = eovVar11.t.az();
                dzsj<Executor> di2 = eovVar11.t.eW.di();
                dzsj<anhk> mf2 = eovVar11.t.eW.mf();
                dzsj dzsjVar24 = eovVar11.m;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new eou(eovVar11, 18);
                    eovVar11.m = dzsjVar24;
                }
                dzsj dzsjVar25 = dzsjVar24;
                dzsj<bvfk> pY = eovVar11.t.pY();
                dzsj dzsjVar26 = eovVar11.o;
                if (dzsjVar26 == null) {
                    dzsjVar26 = new eou(eovVar11, 19);
                    eovVar11.o = dzsjVar26;
                }
                dzsj dzsjVar27 = dzsjVar26;
                dzsj<cqhn> il3 = eovVar11.t.eW.il();
                dzsj<efh> fN = eovVar11.t.fN();
                dzsj<bjbu> fF = eovVar11.t.fF();
                dzsj dzsjVar28 = eovVar11.p;
                if (dzsjVar28 == null) {
                    dzsjVar28 = new eou(eovVar11, 20);
                    eovVar11.p = dzsjVar28;
                }
                return (T) new cauv(ad2, fr3, az2, di2, mf2, dzsjVar25, pY, dzsjVar27, il3, fN, fF, dzsjVar28);
            case 18:
                eov eovVar12 = this.a;
                T t2 = (T) eovVar12.l;
                if (t2 != null) {
                    return t2;
                }
                dxio c5 = dxjc.c(eovVar12.t.eW.h());
                bvrb tn2 = eovVar12.t.eW.a.tn();
                dxjg.e(tn2);
                ?? r22 = (T) bvfj.b(bvfi.b(c5, tn2));
                eovVar12.l = r22;
                return r22;
            case 19:
                eov eovVar13 = this.a;
                T t3 = (T) eovVar13.n;
                if (t3 != null) {
                    return t3;
                }
                dxio c6 = dxjc.c(eovVar13.t.eW.h());
                bvrb tn3 = eovVar13.t.eW.a.tn();
                dxjg.e(tn3);
                ?? r23 = (T) bvfr.b(bvfq.b(c6, tn3));
                eovVar13.n = r23;
                return r23;
            case 20:
                return (T) new caux(this.a.t.eW.fr());
            case 21:
                return (T) new cabl(this.a.t.eW.mL());
            case 22:
                eov eovVar14 = this.a;
                return (T) new bzyq(eovVar14.t.eW.bu(), eovVar14.t.bb());
            case 23:
                eov eovVar15 = this.a;
                dzsj<Resources> fr4 = eovVar15.t.eW.fr();
                dzsj dzsjVar29 = eovVar15.s;
                if (dzsjVar29 == null) {
                    dzsjVar29 = new eou(eovVar15, 24);
                    eovVar15.s = dzsjVar29;
                }
                return (T) new ech(fr4, dzsjVar29, eovVar15.t.tl());
            case 24:
                eov eovVar16 = this.a;
                return (T) new eco(eovVar16.t.ad(), eovVar16.t.eW.il(), eovVar16.t.lf(), eovVar16.t.eW.R());
            default:
                eov eovVar17 = this.a;
                dxio c7 = dxjc.c(eovVar17.t.eW.at());
                dxio c8 = dxjc.c(eovVar17.t.eW.V());
                dxio c9 = dxjc.c(eovVar17.t.T());
                dxio c10 = dxjc.c(eovVar17.t.eW.p());
                ftt fttVar7 = eovVar17.t;
                return (T) new cacl(c7, c8, c9, c10, fttVar7.a, fttVar7.eW.aH(), dxjc.c(eovVar17.t.lD()), dxjc.c(eovVar17.t.eW.aw()));
        }
    }
}
