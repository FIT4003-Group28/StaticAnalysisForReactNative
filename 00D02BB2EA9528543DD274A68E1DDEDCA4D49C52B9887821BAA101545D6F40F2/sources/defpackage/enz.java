package defpackage;

import android.app.Application;
import android.content.Context;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: enz  reason: default package */
/* loaded from: classes6.dex */
public final class enz<T> implements dzsj<T> {
    final /* synthetic */ eoa a;
    private final int b;

    public enz(eoa eoaVar, int i) {
        this.a = eoaVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        switch (this.b) {
            case 0:
                eoa eoaVar = this.a;
                ftt fttVar = eoaVar.m;
                rb rbVar = fttVar.a;
                bvjj rB = fttVar.eW.a.rB();
                dxjg.e(rB);
                dxio c = dxjc.c(eoaVar.m.eW.p());
                cqat rR = eoaVar.m.eW.a.rR();
                dxjg.e(rR);
                return (T) new yzi(rbVar, new vma(rB, c, rR), dxjc.c(eoaVar.m.m()));
            case 1:
                eoa eoaVar2 = this.a;
                return (T) new qwx(eoaVar2.m.eW.il(), eoaVar2.m.y(), eoaVar2.m.eS(), eoaVar2.m.eW.m(), dxjh.c(eoaVar2.m.aV()));
            case 2:
                eoa eoaVar3 = this.a;
                dzsj<Application> m = eoaVar3.m.eW.m();
                dzsj dzsjVar = eoaVar3.i;
                if (dzsjVar == null) {
                    dzsjVar = new enz(eoaVar3, 3);
                    eoaVar3.i = dzsjVar;
                }
                dzsj dzsjVar2 = dzsjVar;
                dzsj<cqhn> il = eoaVar3.m.eW.il();
                dzsj<xlu> g = eoaVar3.g();
                dzsj dzsjVar3 = eoaVar3.j;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new enz(eoaVar3, 13);
                    eoaVar3.j = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = eoaVar3.k;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new enz(eoaVar3, 14);
                    eoaVar3.k = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj<akox> as = eoaVar3.m.as();
                dzsj dzsjVar7 = eoaVar3.l;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new enz(eoaVar3, 15);
                    eoaVar3.l = dzsjVar7;
                }
                return (T) new qoq(m, dzsjVar2, il, g, dzsjVar4, dzsjVar6, as, dzsjVar7, eoaVar3.m.eW.al());
            case 3:
                eoa eoaVar4 = this.a;
                dzsj<Application> m2 = eoaVar4.m.eW.m();
                dzsj<Executor> di = eoaVar4.m.eW.di();
                dzsj<cqhn> il2 = eoaVar4.m.eW.il();
                dzsj nq = eoaVar4.m.eW.nq();
                dzsj<qjy> ns = eoaVar4.m.eW.ns();
                dzsj c2 = dxjh.c(eoaVar4.m.H());
                dzsj<ros> hP = eoaVar4.m.hP();
                dzsj<sic> nt = eoaVar4.m.eW.nt();
                dzsj<qsm> b = eoaVar4.b();
                dzsj dzsjVar8 = eoaVar4.a;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new enz(eoaVar4, 5);
                    eoaVar4.a = dzsjVar8;
                }
                dzsj dzsjVar9 = dzsjVar8;
                dzsj dzsjVar10 = eoaVar4.b;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new enz(eoaVar4, 6);
                    eoaVar4.b = dzsjVar10;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj<xlu> g2 = eoaVar4.g();
                dzsj<xiy> dzsjVar12 = eoaVar4.m.to();
                dzsj dzsjVar13 = eoaVar4.d;
                if (dzsjVar13 == null) {
                    dzsjVar13 = new enz(eoaVar4, 8);
                    eoaVar4.d = dzsjVar13;
                }
                dzsj dzsjVar14 = dzsjVar13;
                dzsj<btvo> V = eoaVar4.m.eW.V();
                dzsj<cqat> K = eoaVar4.m.eW.K();
                dzsj<qjk> hK = eoaVar4.m.eW.hK();
                dzsj c3 = dxjh.c(eoaVar4.m.eW.k());
                dzsj dzsjVar15 = eoaVar4.e;
                if (dzsjVar15 == null) {
                    dzsjVar15 = new enz(eoaVar4, 9);
                    eoaVar4.e = dzsjVar15;
                }
                dzsj dzsjVar16 = dzsjVar15;
                dzsj<xhy> nx = eoaVar4.m.eW.nx();
                dzsj<ckcw> at = eoaVar4.m.eW.at();
                dzsj dzsjVar17 = eoaVar4.f;
                if (dzsjVar17 == null) {
                    dzsjVar17 = new enz(eoaVar4, 10);
                    eoaVar4.f = dzsjVar17;
                }
                dzsj dzsjVar18 = dzsjVar17;
                dzsj dzsjVar19 = eoaVar4.g;
                if (dzsjVar19 == null) {
                    dzsjVar19 = new enz(eoaVar4, 11);
                    eoaVar4.g = dzsjVar19;
                }
                dzsj dzsjVar20 = dzsjVar19;
                dzsj dzsjVar21 = eoaVar4.h;
                if (dzsjVar21 == null) {
                    dzsjVar21 = new enz(eoaVar4, 12);
                    eoaVar4.h = dzsjVar21;
                }
                return (T) new qok(m2, di, il2, nq, ns, c2, hP, nt, b, dzsjVar9, dzsjVar11, g2, dzsjVar12, dzsjVar14, V, K, hK, c3, dzsjVar16, nx, at, dzsjVar18, dzsjVar20, dzsjVar21);
            case 4:
                eoa eoaVar5 = this.a;
                btrm rz = eoaVar5.m.eW.a.rz();
                dxjg.e(rz);
                return (T) new qsm(rz, eoaVar5.m.eW.dH(), eoaVar5.m.eW.ry());
            case 5:
                eoa eoaVar6 = this.a;
                wve nv = eoaVar6.m.eW.nv();
                Application a = eoaVar6.m.eW.a.a();
                dxjg.e(a);
                qse qseVar = new qse(a, eoaVar6.m.jR());
                dehq tf = eoaVar6.m.eW.a.tf();
                dxjg.e(tf);
                return (T) new qsp(nv, qseVar, tf);
            case 6:
                eoa eoaVar7 = this.a;
                Context b2 = eoaVar7.m.eW.a.b();
                dxjg.e(b2);
                return (T) new wqy(b2, eoaVar7.m.eW.g(), eoaVar7.m.jR(), new wqw(eoaVar7.m.eW.m()));
            case 7:
                eoa eoaVar8 = this.a;
                Object obj2 = eoaVar8.c;
                if (obj2 instanceof dxjf) {
                    synchronized (obj2) {
                        obj = eoaVar8.c;
                        if (obj instanceof dxjf) {
                            Application a2 = eoaVar8.m.eW.a.a();
                            dxjg.e(a2);
                            Object d = eoaVar8.d();
                            cqat rR2 = eoaVar8.m.eW.a.rR();
                            dxjg.e(rR2);
                            dxio c4 = dxjc.c(eoaVar8.m.bA());
                            btvo rp = eoaVar8.m.eW.a.rp();
                            dxjg.e(rp);
                            xlg b3 = xll.b(a2, d, rR2, c4, rp, eoaVar8.e());
                            xlc c5 = eoaVar8.c();
                            Object d2 = eoaVar8.d();
                            xkw xkwVar = new xkw(eoaVar8.m.ap(), new alen(eoaVar8.m.ap()), eoaVar8.m.bJ());
                            cjqy tr = eoaVar8.m.eW.a.tr();
                            dxjg.e(tr);
                            cjqq tp = eoaVar8.m.eW.a.tp();
                            dxjg.e(tp);
                            xmn e = eoaVar8.e();
                            akox ap = eoaVar8.m.ap();
                            akzh au = eoaVar8.m.au();
                            alhv sr = eoaVar8.m.eW.sr();
                            xmg f = eoaVar8.f();
                            crzb sO = eoaVar8.m.eW.a.sO();
                            dxjg.e(sO);
                            bvrb tn = eoaVar8.m.eW.a.tn();
                            dxjg.e(tn);
                            cqba vu = eoaVar8.m.eW.a.vu();
                            dxjg.e(vu);
                            btvo rp2 = eoaVar8.m.eW.a.rp();
                            dxjg.e(rp2);
                            obj = xlv.b(b3, c5, d2, xkwVar, tr, tp, e, ap, au, sr, f, sO, tn, vu, rp2);
                            dxjc.d(eoaVar8.c, obj);
                            eoaVar8.c = obj;
                        }
                    }
                    obj2 = obj;
                }
                return (T) ((xlu) obj2);
            case 8:
                eoa eoaVar9 = this.a;
                return (T) new ivg(eoaVar9.m.fN(), eoaVar9.m.eW.kb(), eoaVar9.m.eW.o(), eoaVar9.m.eW.K());
            case 9:
                eoa eoaVar10 = this.a;
                return (T) new gun(eoaVar10.m.eW.di(), eoaVar10.m.eW.al(), eoaVar10.m.eW.hN(), eoaVar10.m.T(), eoaVar10.m.eb(), eoaVar10.m.eW.aI());
            case 10:
                eoa eoaVar11 = this.a;
                btvo rp3 = eoaVar11.m.eW.a.rp();
                dxjg.e(rp3);
                return (T) new cjbh(rp3, dxjc.c(eoaVar11.m.eW.p()), eoaVar11.m.eW.qq());
            case 11:
                eoa eoaVar12 = this.a;
                cqat rR3 = eoaVar12.m.eW.a.rR();
                dxjg.e(rR3);
                ckcw rU = eoaVar12.m.eW.a.rU();
                dxjg.e(rU);
                return (T) new xcs(rR3, rU);
            case 12:
                eoa eoaVar13 = this.a;
                return (T) new cjbt(eoaVar13.m.ad(), eoaVar13.m.eW.il());
            case 13:
                eoa eoaVar14 = this.a;
                dxio c6 = dxjc.c(eoaVar14.m.H());
                vsf g3 = eoaVar14.m.eW.g();
                ftt fttVar2 = eoaVar14.m;
                return (T) new vox(c6, g3, fttVar2.a, fttVar2.bB());
            case 14:
                return (T) this.a.f();
            case 15:
                return (T) this.a.h();
            case 16:
                eoa eoaVar15 = this.a;
                cjqy tr2 = eoaVar15.m.eW.a.tr();
                dxjg.e(tr2);
                cqat rR4 = eoaVar15.m.eW.a.rR();
                dxjg.e(rR4);
                return (T) new qpe(tr2, rR4);
            case 17:
                return (T) new qqe();
            default:
                return (T) new qqy(this.a.m.eW.aw());
        }
    }
}
