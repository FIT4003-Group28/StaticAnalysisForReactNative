package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fse  reason: default package */
/* loaded from: classes6.dex */
public final class fse<T> implements dzsj<T> {
    final /* synthetic */ fsf a;
    private final int b;

    public fse(fsf fsfVar, int i) {
        this.a = fsfVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                fsf fsfVar = this.a;
                dzsj<Application> m = fsfVar.n.eW.m();
                dzsj dzsjVar = fsfVar.j;
                if (dzsjVar == null) {
                    dzsjVar = new fse(fsfVar, 1);
                    fsfVar.j = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<cqhn> il = fsfVar.n.eW.il();
                dzsj<xlu> f = fsfVar.f();
                dzsj dzsjVar3 = fsfVar.k;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fse(fsfVar, 11);
                    fsfVar.k = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fsfVar.l;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fse(fsfVar, 12);
                    fsfVar.l = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<akox> as = fsfVar.n.as();
                dzsj dzsjVar7 = fsfVar.m;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fse(fsfVar, 13);
                    fsfVar.m = dzsjVar7;
                }
                return (T) new qoq(m, dzsjVar2, il, f, dzsjVar4, dzsjVar6, as, dzsjVar7, fsfVar.n.eW.al());
            case 1:
                fsf fsfVar2 = this.a;
                dzsj<Application> m2 = fsfVar2.n.eW.m();
                dzsj<Executor> di = fsfVar2.n.eW.di();
                dzsj<cqhn> il2 = fsfVar2.n.eW.il();
                dzsj nq = fsfVar2.n.eW.nq();
                dzsj<qjy> ns = fsfVar2.n.eW.ns();
                dzsj c = dxjh.c(fsfVar2.n.H());
                dzsj<ros> hP = fsfVar2.n.hP();
                dzsj<sic> nt = fsfVar2.n.eW.nt();
                dzsj dzsjVar8 = fsfVar2.a;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new fse(fsfVar2, 2);
                    fsfVar2.a = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj dzsjVar10 = fsfVar2.b;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new fse(fsfVar2, 3);
                    fsfVar2.b = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj dzsjVar12 = fsfVar2.c;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fse(fsfVar2, 4);
                    fsfVar2.c = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj<xlu> f2 = fsfVar2.f();
                dzsj<xiy> dzsjVar14 = fsfVar2.n.to();
                dzsj dzsjVar15 = fsfVar2.e;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new fse(fsfVar2, 6);
                    fsfVar2.e = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj<btvo> V = fsfVar2.n.eW.V();
                dzsj<cqat> K = fsfVar2.n.eW.K();
                dzsj<qjk> hK = fsfVar2.n.eW.hK();
                dzsj c2 = dxjh.c(fsfVar2.n.eW.k());
                dzsj dzsjVar17 = fsfVar2.f;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new fse(fsfVar2, 7);
                    fsfVar2.f = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj<xhy> nx = fsfVar2.n.eW.nx();
                dzsj<ckcw> at = fsfVar2.n.eW.at();
                dzsj dzsjVar19 = fsfVar2.g;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new fse(fsfVar2, 8);
                    fsfVar2.g = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj dzsjVar21 = fsfVar2.h;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new fse(fsfVar2, 9);
                    fsfVar2.h = dzsjVar21;
                }
                dzsj dzsjVar22 = dzsjVar21;
                dzsj dzsjVar23 = fsfVar2.i;
                if (dzsjVar23 == null) {
                    dzsjVar23 = new fse(fsfVar2, 10);
                    fsfVar2.i = dzsjVar23;
                }
                return (T) new qok(m2, di, il2, nq, ns, c, hP, nt, dzsjVar9, dzsjVar11, dzsjVar13, f2, dzsjVar14, dzsjVar16, V, K, hK, c2, dzsjVar18, nx, at, dzsjVar20, dzsjVar22, dzsjVar23);
            case 2:
                fsf fsfVar3 = this.a;
                btrm rz = fsfVar3.n.eW.a.rz();
                dxjg.e(rz);
                return (T) new qsm(rz, fsfVar3.n.eW.dH(), fsfVar3.n.eW.ry());
            case 3:
                fsf fsfVar4 = this.a;
                wve nv = fsfVar4.n.eW.nv();
                Application a = fsfVar4.n.eW.a.a();
                dxjg.e(a);
                qse qseVar = new qse(a, fsfVar4.n.jR());
                dehq tf = fsfVar4.n.eW.a.tf();
                dxjg.e(tf);
                return (T) new qsp(nv, qseVar, tf);
            case 4:
                fsf fsfVar5 = this.a;
                Context b = fsfVar5.n.eW.a.b();
                dxjg.e(b);
                return (T) new wqy(b, fsfVar5.n.eW.g(), fsfVar5.n.jR(), new wqw(fsfVar5.n.eW.m()));
            case 5:
                fsf fsfVar6 = this.a;
                Object obj2 = fsfVar6.d;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = fsfVar6.d;
                        if (obj instanceof dxjf) {
                            Application a2 = fsfVar6.n.eW.a.a();
                            dxjg.e(a2);
                            Object c3 = fsfVar6.c();
                            cqat rR = fsfVar6.n.eW.a.rR();
                            dxjg.e(rR);
                            dxio c4 = dxjc.c(fsfVar6.n.bA());
                            btvo rp = fsfVar6.n.eW.a.rp();
                            dxjg.e(rp);
                            xlg b2 = xll.b(a2, c3, rR, c4, rp, fsfVar6.d());
                            xlc b3 = fsfVar6.b();
                            Object c5 = fsfVar6.c();
                            xkw xkwVar = new xkw(fsfVar6.n.ap(), new alen(fsfVar6.n.ap()), fsfVar6.n.bJ());
                            cjqy tr = fsfVar6.n.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = fsfVar6.n.eW.a.tp();
                            dxjg.e(tp);
                            xmn d = fsfVar6.d();
                            akox ap = fsfVar6.n.ap();
                            akzh au = fsfVar6.n.au();
                            alhv sr = fsfVar6.n.eW.sr();
                            xmg e = fsfVar6.e();
                            crzb sO = fsfVar6.n.eW.a.sO();
                            dxjg.e(sO);
                            bvrb tn = fsfVar6.n.eW.a.tn();
                            dxjg.e(tn);
                            cqba vu = fsfVar6.n.eW.a.vu();
                            dxjg.e(vu);
                            btvo rp2 = fsfVar6.n.eW.a.rp();
                            dxjg.e(rp2);
                            obj = xlv.b(b2, b3, c5, xkwVar, tr, tp, d, ap, au, sr, e, sO, tn, vu, rp2);
                            dxjc.d(fsfVar6.d, obj);
                            fsfVar6.d = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((xlu) obj2);
            case 6:
                fsf fsfVar7 = this.a;
                return (T) new ivg(fsfVar7.n.fN(), fsfVar7.n.eW.kb(), fsfVar7.n.eW.o(), fsfVar7.n.eW.K());
            case 7:
                fsf fsfVar8 = this.a;
                return (T) new gun(fsfVar8.n.eW.di(), fsfVar8.n.eW.al(), fsfVar8.n.eW.hN(), fsfVar8.n.T(), fsfVar8.n.eb(), fsfVar8.n.eW.aI());
            case 8:
                fsf fsfVar9 = this.a;
                btvo rp3 = fsfVar9.n.eW.a.rp();
                dxjg.e(rp3);
                return (T) new cjbh(rp3, dxjc.c(fsfVar9.n.eW.p()), fsfVar9.n.eW.qq());
            case 9:
                fsf fsfVar10 = this.a;
                cqat rR2 = fsfVar10.n.eW.a.rR();
                dxjg.e(rR2);
                ckcw rU = fsfVar10.n.eW.a.rU();
                dxjg.e(rU);
                return (T) new xcs(rR2, rU);
            case 10:
                fsf fsfVar11 = this.a;
                return (T) new cjbt(fsfVar11.n.ad(), fsfVar11.n.eW.il());
            case 11:
                fsf fsfVar12 = this.a;
                dxio c6 = dxjc.c(fsfVar12.n.H());
                vsf g = fsfVar12.n.eW.g();
                ftt fttVar = fsfVar12.n;
                return (T) new vox(c6, g, fttVar.a, fttVar.bB());
            case 12:
                return (T) this.a.e();
            case 13:
                return (T) this.a.g();
            default:
                fsf fsfVar13 = this.a;
                cjqy tr2 = fsfVar13.n.eW.a.tr();
                dxjg.e(tr2);
                cqat rR3 = fsfVar13.n.eW.a.rR();
                dxjg.e(rR3);
                return (T) new qpe(tr2, rR3);
        }
    }
}
