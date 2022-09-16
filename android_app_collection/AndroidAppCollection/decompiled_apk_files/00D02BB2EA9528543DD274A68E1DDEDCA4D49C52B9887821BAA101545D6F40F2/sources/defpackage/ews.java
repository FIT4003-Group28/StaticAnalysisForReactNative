package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ews  reason: default package */
/* loaded from: classes6.dex */
final class ews<T> implements dzsj<T> {
    final /* synthetic */ ewt a;
    private final int b;

    public ews(ewt ewtVar, int i) {
        this.a = ewtVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v104, types: [bvfp, bvfn, T] */
    /* JADX WARN: Type inference failed for: r1v112, types: [T, buub] */
    /* JADX WARN: Type inference failed for: r1v120, types: [T, buvc] */
    /* JADX WARN: Type inference failed for: r1v55, types: [T, buvg] */
    /* JADX WARN: Type inference failed for: r1v64, types: [T, buvu] */
    /* JADX WARN: Type inference failed for: r1v7, types: [T, buvk] */
    /* JADX WARN: Type inference failed for: r1v74, types: [T, bvev] */
    /* JADX WARN: Type inference failed for: r1v97, types: [T, bvfh, bvff] */
    @Override // defpackage.dzsj
    public final T a() {
        switch (this.b) {
            case 0:
                ewt ewtVar = this.a;
                dzsj<anhk> mf = ewtVar.m.eW.mf();
                dzsj dzsjVar = ewtVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new ews(ewtVar, 1);
                    ewtVar.a = dzsjVar;
                }
                return (T) new cefh(mf, dzsjVar, ewtVar.m.eW.pt());
            case 1:
                ewt ewtVar2 = this.a;
                T t = (T) ewtVar2.n;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(ewtVar2.m.eW.h());
                bvrb tn = ewtVar2.m.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) buvm.b(buvl.b(c, tn));
                ewtVar2.n = r1;
                return r1;
            case 2:
                ewt ewtVar3 = this.a;
                ftt fttVar = ewtVar3.m;
                dzsj<rb> dzsjVar2 = fttVar.eV;
                dzsj<cqhn> il = fttVar.eW.il();
                dzsj<bkpi> aH = ewtVar3.m.aH();
                dzsj<bqly> aJ = ewtVar3.m.aJ();
                dzsj<ceda> oe = ewtVar3.m.oe();
                dzsj dzsjVar3 = ewtVar3.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new ews(ewtVar3, 3);
                    ewtVar3.b = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj<cebm> om = ewtVar3.m.om();
                dzsj<ixf> lM = ewtVar3.m.lM();
                dzsj<blmp> os = ewtVar3.m.os();
                dzsj<cebr> lQ = ewtVar3.m.eW.lQ();
                dzsj dzsjVar5 = ewtVar3.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new ews(ewtVar3, 4);
                    ewtVar3.c = dzsjVar5;
                }
                return (T) new ceyb(dzsjVar2, il, aH, aJ, oe, dzsjVar4, om, lM, os, lQ, dzsjVar5, ewtVar3.m.eW.er());
            case 3:
                ewt ewtVar4 = this.a;
                ftt fttVar2 = ewtVar4.m;
                return (T) new cexu(fttVar2.eV, fttVar2.eW.il(), ewtVar4.m.eW.er(), ewtVar4.m.eW.k(), ewtVar4.m.eW.p(), ewtVar4.m.P(), ewtVar4.m.eW.kf(), ewtVar4.m.az(), ewtVar4.m.J(), ewtVar4.m.iW());
            case 4:
                ewt ewtVar5 = this.a;
                ftt fttVar3 = ewtVar5.m;
                return (T) new ceys(fttVar3.eV, fttVar3.aJ(), ewtVar5.m.oh(), ewtVar5.m.y());
            case 5:
                ewt ewtVar6 = this.a;
                ftt fttVar4 = ewtVar6.m;
                return (T) new ceuo(fttVar4.a, dxjc.c(fttVar4.eW.lB()), dxjc.c(ewtVar6.m.eW.iW()));
            case 6:
                ewt ewtVar7 = this.a;
                ftt fttVar5 = ewtVar7.m;
                return (T) new nvh(fttVar5.eV, fttVar5.sq(), ewtVar7.m.eW.al(), ewtVar7.m.eW.n(), ewtVar7.m.ay(), ewtVar7.m.H());
            case 7:
                ewt ewtVar8 = this.a;
                dzsj dzsjVar6 = ewtVar8.d;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new ews(ewtVar8, 8);
                    ewtVar8.d = dzsjVar6;
                }
                return (T) new cefd(dzsjVar6, ewtVar8.m.eW.pt());
            case 8:
                ewt ewtVar9 = this.a;
                T t2 = (T) ewtVar9.o;
                if (t2 != null) {
                    return t2;
                }
                dxio c2 = dxjc.c(ewtVar9.m.eW.h());
                bvrb tn2 = ewtVar9.m.eW.a.tn();
                dxjg.e(tn2);
                ?? r12 = (T) buvi.b(buvh.b(c2, tn2));
                ewtVar9.o = r12;
                return r12;
            case 9:
                ewt ewtVar10 = this.a;
                return (T) new cewg(ewtVar10.m.eW.fr(), ewtVar10.m.bf());
            case 10:
                ewt ewtVar11 = this.a;
                dzsj dzsjVar7 = ewtVar11.e;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new ews(ewtVar11, 11);
                    ewtVar11.e = dzsjVar7;
                }
                return (T) new cefb(dzsjVar7);
            case 11:
                ewt ewtVar12 = this.a;
                T t3 = (T) ewtVar12.p;
                if (t3 != null) {
                    return t3;
                }
                dxio c3 = dxjc.c(ewtVar12.m.eW.h());
                bvrb tn3 = ewtVar12.m.eW.a.tn();
                dxjg.e(tn3);
                ?? r13 = (T) buvw.b(buvv.b(c3, tn3));
                ewtVar12.p = r13;
                return r13;
            case 12:
                ewt ewtVar13 = this.a;
                return (T) bjgk.b(ewtVar13.m.wk(), dxjc.c(ewtVar13.m.ai()), ewtVar13.m.cv());
            case 13:
                ewt ewtVar14 = this.a;
                dzsj dzsjVar8 = ewtVar14.f;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new ews(ewtVar14, 14);
                    ewtVar14.f = dzsjVar8;
                }
                return (T) new ceff(dzsjVar8);
            case 14:
                ewt ewtVar15 = this.a;
                T t4 = (T) ewtVar15.q;
                if (t4 != null) {
                    return t4;
                }
                dxio c4 = dxjc.c(ewtVar15.m.eW.h());
                bvrb tn4 = ewtVar15.m.eW.a.tn();
                dxjg.e(tn4);
                ?? r14 = (T) bvex.b(bvew.b(c4, tn4));
                ewtVar15.q = r14;
                return r14;
            case 15:
                ewt ewtVar16 = this.a;
                dzsj<gga> ad = ewtVar16.m.ad();
                dzsj<efh> fN = ewtVar16.m.fN();
                dzsj<Executor> di = ewtVar16.m.eW.di();
                dzsj<anhk> mf2 = ewtVar16.m.eW.mf();
                dzsj dzsjVar9 = ewtVar16.h;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new ews(ewtVar16, 16);
                    ewtVar16.h = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<bvfk> pY = ewtVar16.m.pY();
                dzsj dzsjVar11 = ewtVar16.j;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new ews(ewtVar16, 17);
                    ewtVar16.j = dzsjVar11;
                }
                return (T) new cexb(ad, fN, di, mf2, dzsjVar10, pY, dzsjVar11, ewtVar16.m.az(), ewtVar16.m.fF(), ewtVar16.m.eW.V());
            case 16:
                ewt ewtVar17 = this.a;
                T t5 = (T) ewtVar17.g;
                if (t5 != null) {
                    return t5;
                }
                dxio c5 = dxjc.c(ewtVar17.m.eW.h());
                bvrb tn5 = ewtVar17.m.eW.a.tn();
                dxjg.e(tn5);
                ?? r15 = (T) bvfj.b(bvfi.b(c5, tn5));
                ewtVar17.g = r15;
                return r15;
            case 17:
                ewt ewtVar18 = this.a;
                T t6 = (T) ewtVar18.i;
                if (t6 != null) {
                    return t6;
                }
                dxio c6 = dxjc.c(ewtVar18.m.eW.h());
                bvrb tn6 = ewtVar18.m.eW.a.tn();
                dxjg.e(tn6);
                ?? r16 = (T) bvfr.b(bvfq.b(c6, tn6));
                ewtVar18.i = r16;
                return r16;
            case 18:
                ewt ewtVar19 = this.a;
                dzsj dzsjVar12 = ewtVar19.k;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new ews(ewtVar19, 19);
                    ewtVar19.k = dzsjVar12;
                }
                return (T) new ceex(dzsjVar12);
            case 19:
                ewt ewtVar20 = this.a;
                T t7 = (T) ewtVar20.r;
                if (t7 != null) {
                    return t7;
                }
                dxio c7 = dxjc.c(ewtVar20.m.eW.h());
                bvrb tn7 = ewtVar20.m.eW.a.tn();
                dxjg.e(tn7);
                ?? r17 = (T) buud.b(buuc.b(c7, tn7));
                ewtVar20.r = r17;
                return r17;
            case 20:
                ewt ewtVar21 = this.a;
                dzsj dzsjVar13 = ewtVar21.l;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new ews(ewtVar21, 21);
                    ewtVar21.l = dzsjVar13;
                }
                return (T) new ceev(dzsjVar13, ewtVar21.m.eW.pt());
            case 21:
                ewt ewtVar22 = this.a;
                T t8 = (T) ewtVar22.s;
                if (t8 != null) {
                    return t8;
                }
                dxio c8 = dxjc.c(ewtVar22.m.eW.h());
                bvrb tn8 = ewtVar22.m.eW.a.tn();
                dxjg.e(tn8);
                ?? r18 = (T) buve.b(buvd.b(c8, tn8));
                ewtVar22.s = r18;
                return r18;
            default:
                this.a.m.az();
                return (T) new ceyx();
        }
    }
}
