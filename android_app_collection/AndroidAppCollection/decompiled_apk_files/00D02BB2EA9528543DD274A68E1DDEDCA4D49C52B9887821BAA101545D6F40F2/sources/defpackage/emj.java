package defpackage;

import android.content.res.Resources;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: emj  reason: default package */
/* loaded from: classes6.dex */
public final class emj<T> implements dzsj<T> {
    final /* synthetic */ emk a;
    private final int b;

    public emj(emk emkVar, int i) {
        this.a = emkVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r1v28, types: [T, bupa] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                emk emkVar = this.a;
                dzsj<Resources> fr = emkVar.m.eW.fr();
                dzsj<dbsg<czw>> er = emkVar.m.er();
                dzsj<btvo> V = emkVar.m.eW.V();
                dzsj dzsjVar = emkVar.a;
                if (dzsjVar == null) {
                    dzsjVar = new emj(emkVar, 1);
                    emkVar.a = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj dzsjVar3 = emkVar.b;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new emj(emkVar, 2);
                    emkVar.b = dzsjVar3;
                }
                return (T) new dpx(fr, er, V, dzsjVar2, dzsjVar3);
            case 1:
                emk emkVar2 = this.a;
                return (T) new dgu(emkVar2.m.eW.K(), emkVar2.m.eW.kh());
            case 2:
                emk emkVar3 = this.a;
                return (T) new dkj(emkVar3.m.eW.jX(), emkVar3.m.eW.al());
            case 3:
                return (T) new dmp(this.a.m.fr());
            case 4:
                emk emkVar4 = this.a;
                dzsj<rb> dzsjVar4 = emkVar4.m.eV;
                dzsj dzsjVar5 = emkVar4.c;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new emj(emkVar4, 5);
                    emkVar4.c = dzsjVar5;
                }
                return (T) new dmm(dzsjVar4, dzsjVar5, emkVar4.m.eW.k(), emkVar4.m.eW.di(), emkVar4.m.eW.u());
            case 5:
                emk emkVar5 = this.a;
                T t = (T) emkVar5.n;
                if (t != null) {
                    return t;
                }
                dxio c = dxjc.c(emkVar5.m.eW.h());
                bvrb tn = emkVar5.m.eW.a.tn();
                dxjg.e(tn);
                ?? r1 = (T) new bupa(new buoz(c, tn));
                emkVar5.n = r1;
                return r1;
            case 6:
                emk emkVar6 = this.a;
                ftt fttVar = emkVar6.m;
                dzsj<rb> dzsjVar6 = fttVar.eV;
                dzsj<ahjq> k = fttVar.eW.k();
                dzsj dzsjVar7 = emkVar6.d;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new emj(emkVar6, 7);
                    emkVar6.d = dzsjVar7;
                }
                return (T) new dmj(dzsjVar6, k, dzsjVar7, emkVar6.b(), dxjh.c(emkVar6.m.th()), emkVar6.m.eW.di(), emkVar6.c());
            case 7:
                emk emkVar7 = this.a;
                ftt fttVar2 = emkVar7.m;
                return (T) new dhk(fttVar2.eV, fttVar2.eW.kf(), emkVar7.m.eW.di());
            case 8:
                ftt fttVar3 = this.a.m;
                return (T) new dhs(fttVar3.eV, fttVar3.eW.kf());
            case 9:
                emk emkVar8 = this.a;
                return (T) new dkl(emkVar8.m.eW.jX(), emkVar8.m.eW.al());
            case 10:
                return (T) new deb();
            case 11:
                emk emkVar9 = this.a;
                ftt fttVar4 = emkVar9.m;
                return (T) new ddz(fttVar4.eV, dxjh.c(fttVar4.th()), emkVar9.b(), emkVar9.m.eW.di(), emkVar9.c(), emkVar9.m.eW.K());
            case 12:
                return (T) new dyt();
            case 13:
                emk emkVar10 = this.a;
                return (T) new dyp(emkVar10.m.eW.k(), emkVar10.d(), emkVar10.m.eW.di());
            case 14:
                emk emkVar11 = this.a;
                ftt fttVar5 = emkVar11.m;
                return (T) new dyq(fttVar5.a, dxjc.c(fttVar5.th()), dxjc.c(emkVar11.m.tg()));
            case 15:
                emk emkVar12 = this.a;
                dzsj<gga> ad = emkVar12.m.ad();
                dzsj<btrm> n = emkVar12.m.eW.n();
                dzsj<akox> as = emkVar12.m.as();
                dzsj<ahjq> k2 = emkVar12.m.eW.k();
                dzsj<araj> cl = emkVar12.m.cl();
                dzsj<gle> dF = emkVar12.m.dF();
                dzsj<cqkj> y = emkVar12.m.y();
                dzsj<btvo> V2 = emkVar12.m.eW.V();
                dzsj dzsjVar8 = emkVar12.e;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new emj(emkVar12, 16);
                    emkVar12.e = dzsjVar8;
                }
                return (T) new dry(ad, n, as, k2, cl, dF, y, V2, dzsjVar8, emkVar12.m.eW.bk());
            case 16:
                emk emkVar13 = this.a;
                return (T) new dss(emkVar13.m.as(), emkVar13.m.eW.k(), emkVar13.m.eW.di(), emkVar13.m.eW.n(), emkVar13.m.eW.fr());
            case 17:
                emk emkVar14 = this.a;
                dzsj dzsjVar9 = emkVar14.f;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new emj(emkVar14, 18);
                    emkVar14.f = dzsjVar9;
                }
                dzsj dzsjVar10 = dzsjVar9;
                dzsj<Executor> di = emkVar14.m.eW.di();
                dzsj<dyq> d = emkVar14.d();
                ftt fttVar6 = emkVar14.m;
                dzsj dzsjVar11 = fttVar6.ck;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new fns(fttVar6, 1246);
                    fttVar6.ck = dzsjVar11;
                }
                ftt fttVar7 = emkVar14.m;
                return (T) new dsg(dzsjVar10, di, d, dzsjVar11, fttVar7.eV, fttVar7.as(), emkVar14.m.eW.V(), emkVar14.m.eW.n(), emkVar14.m.eW.kf());
            case 18:
                emk emkVar15 = this.a;
                ftt fttVar8 = emkVar15.m;
                return (T) new dsk(fttVar8.eV, fttVar8.eW.K(), emkVar15.m.as(), emkVar15.m.eW.kh(), emkVar15.m.eW.n(), emkVar15.m.cl());
            case 19:
                emk emkVar16 = this.a;
                emkVar16.m.eW.n();
                emkVar16.m.as();
                emkVar16.m.eW.k();
                ftt fttVar9 = emkVar16.m;
                if (fttVar9.cl == null) {
                    fttVar9.cl = new fns(fttVar9, 1247);
                }
                emkVar16.m.H();
                return (T) new dox();
            case 20:
                emk emkVar17 = this.a;
                dzsj dzsjVar12 = emkVar17.g;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new emj(emkVar17, 21);
                    emkVar17.g = dzsjVar12;
                }
                dzsj<Resources> fr2 = emkVar17.m.eW.fr();
                dzsj dzsjVar13 = emkVar17.i;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new emj(emkVar17, 22);
                    emkVar17.i = dzsjVar13;
                }
                return (T) new drm(dzsjVar12, fr2, dzsjVar13);
            case 21:
                emk emkVar18 = this.a;
                return (T) new dqc(emkVar18.m.eW.di(), emkVar18.m.fr());
            case 22:
                emk emkVar19 = this.a;
                ftt fttVar10 = emkVar19.m;
                dzsj<rb> dzsjVar14 = fttVar10.eV;
                dzsj<dkn> jZ = fttVar10.eW.jZ();
                dzsj dzsjVar15 = emkVar19.h;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new emj(emkVar19, 23);
                    emkVar19.h = dzsjVar15;
                }
                return (T) new drh(dzsjVar14, jZ, dzsjVar15, emkVar19.m.eW.kf(), emkVar19.m.eW.fy());
            case 23:
                return (T) this.a.e();
            case 24:
                emk emkVar20 = this.a;
                dzsj dzsjVar16 = emkVar20.j;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new emj(emkVar20, 25);
                    emkVar20.j = dzsjVar16;
                }
                dzsj dzsjVar17 = emkVar20.k;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new emj(emkVar20, 26);
                    emkVar20.k = dzsjVar17;
                }
                return (T) new drb(dzsjVar16, dxjh.c(dzsjVar17), emkVar20.m.eW.kb());
            case 25:
                emk emkVar21 = this.a;
                return (T) new dpt(emkVar21.m.eW.p(), emkVar21.m.eW.di(), emkVar21.m.eW.jw(), emkVar21.m.eW.K());
            case 26:
                emk emkVar22 = this.a;
                ftt fttVar11 = emkVar22.m;
                rb rbVar = fttVar11.a;
                ahjq wf = fttVar11.eW.wf();
                dkn jY = emkVar22.m.eW.jY();
                bvsl sA = emkVar22.m.eW.sA();
                cqat rR = emkVar22.m.eW.a.rR();
                dxjg.e(rR);
                return (T) new dqw(rbVar, wf, jY, sA, rR, emkVar22.m.dn(), (dre) emkVar22.e());
            case 27:
                emk emkVar23 = this.a;
                return (T) new dyc(emkVar23.m.eW.fr(), emkVar23.m.fr(), emkVar23.m.et(), emkVar23.m.eW.di());
            default:
                emk emkVar24 = this.a;
                Object obj2 = emkVar24.l;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = emkVar24.l;
                        if (obj instanceof dxjf) {
                            obj = new dqu(emkVar24.m.a);
                            dxjc.d(emkVar24.l, obj);
                            emkVar24.l = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((dqu) obj2);
        }
    }
}
