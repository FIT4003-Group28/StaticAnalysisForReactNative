package defpackage;

import android.app.Application;
import com.google.android.filament.R;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: erv  reason: default package */
/* loaded from: classes6.dex */
public final class erv<T> implements dzsj<T> {
    final /* synthetic */ ese a;
    private final int b;

    public erv(ese eseVar, int i) {
        this.a = eseVar;
        this.b = i;
    }

    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        switch (this.b) {
            case 0:
                return (T) new erw(this.a);
            case 1:
                return (T) new esc(this.a);
            case 2:
                return (T) new ers(this.a);
            case 3:
                return (T) new erz(this.a);
            case 4:
                return (T) new erp(this.a);
            case 5:
                ese eseVar = this.a;
                Object obj8 = eseVar.c;
                if (obj8 instanceof dxjf) {
                    synchronized (obj8) {
                        obj = eseVar.c;
                        if (obj instanceof dxjf) {
                            tha thaVar = new tha(eseVar.h(), dxjc.c(eseVar.y.eW.p()), (thd) eseVar.g());
                            dxjc.d(eseVar.c, thaVar);
                            eseVar.c = thaVar;
                            obj = thaVar;
                        }
                    }
                    obj8 = obj;
                }
                return (T) ((tha) obj8);
            case 6:
                ese eseVar2 = this.a;
                ftt fttVar = eseVar2.y;
                return (T) new udg(fttVar.a, fttVar.ap(), dxjc.c(eseVar2.y.tC()), dxjc.c(eseVar2.y.aK()), eseVar2.e());
            case 7:
                ese eseVar3 = this.a;
                Object obj9 = eseVar3.b;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj2 = eseVar3.b;
                        if (obj2 instanceof dxjf) {
                            vxa dH = eseVar3.y.eW.dH();
                            toz du = eseVar3.y.eW.du();
                            Object ji = eseVar3.y.eW.ji();
                            Executor sU = eseVar3.y.eW.a.sU();
                            dxjg.e(sU);
                            thp thpVar = new thp(dH, du, (tia) ji, sU);
                            dxjc.d(eseVar3.b, thpVar);
                            eseVar3.b = thpVar;
                            obj2 = thpVar;
                        }
                    }
                    obj9 = obj2;
                }
                return (T) ((tgn) obj9);
            case 8:
                return (T) new tkd(this.a.y.eV);
            case 9:
                return (T) this.a.k();
            case 10:
                return (T) new ssn();
            case 11:
                return (T) this.a.c();
            case 12:
                ese eseVar4 = this.a;
                Object obj10 = eseVar4.d;
                if (obj10 instanceof dxjf) {
                    synchronized (obj10) {
                        obj3 = eseVar4.d;
                        if (obj3 instanceof dxjf) {
                            ftt fttVar2 = eseVar4.y;
                            rb rbVar = fttVar2.a;
                            dxio c = dxjc.c(fttVar2.bU());
                            dxio c2 = dxjc.c(eseVar4.y.bT());
                            bwqv rD = eseVar4.y.eW.a.rD();
                            dxjg.e(rD);
                            bvjj rB = eseVar4.y.eW.a.rB();
                            dxjg.e(rB);
                            obj3 = new svd(rbVar, c, c2, rD, rB, eseVar4.y.eW.wf(), eseVar4.y.eW.qw(), eseVar4.q(), eseVar4.y.bv());
                            dxjc.d(eseVar4.d, obj3);
                            eseVar4.d = obj3;
                        }
                    }
                    obj10 = obj3;
                }
                return (T) ((svd) obj10);
            case 13:
                return (T) this.a.q();
            case 14:
                ese eseVar5 = this.a;
                Object obj11 = eseVar5.e;
                if (obj11 instanceof dxjf) {
                    synchronized (obj11) {
                        obj4 = eseVar5.e;
                        if (obj4 instanceof dxjf) {
                            obj4 = eseVar5.t();
                            dxjc.d(eseVar5.e, obj4);
                            eseVar5.e = obj4;
                        }
                    }
                    obj11 = obj4;
                }
                return (T) ((suw) obj11);
            case 15:
                ese eseVar6 = this.a;
                Object obj12 = eseVar6.g;
                if (obj12 instanceof dxjf) {
                    synchronized (obj12) {
                        obj5 = eseVar6.g;
                        if (obj5 instanceof dxjf) {
                            ftt fttVar3 = eseVar6.y;
                            obj5 = new suz(new svc(fttVar3.eV, fttVar3.eW.di(), eseVar6.y.eW.cx(), dxjh.c(eseVar6.y.eo()), eseVar6.y.tQ(), eseVar6.s(), eseVar6.r()));
                            dxjc.d(eseVar6.g, obj5);
                            eseVar6.g = obj5;
                        }
                    }
                    obj12 = obj5;
                }
                return (T) ((suz) obj12);
            case 16:
                ese eseVar7 = this.a;
                Object obj13 = eseVar7.i;
                if (obj13 instanceof dxjf) {
                    synchronized (obj13) {
                        obj6 = eseVar7.i;
                        if (obj6 instanceof dxjf) {
                            obj6 = eseVar7.a;
                            dxjc.d(eseVar7.i, obj6);
                            eseVar7.i = obj6;
                        }
                    }
                    obj13 = obj6;
                }
                return (T) ((suv) obj13);
            case 17:
                return (T) this.a.n();
            case 18:
                return (T) this.a.t();
            case 19:
                return (T) this.a.b();
            case 20:
                ese eseVar8 = this.a;
                return (T) tnb.b(eseVar8.y.ad(), eseVar8.y.sq(), eseVar8.y.eW.al(), eseVar8.y.aP(), eseVar8.y.eW.n(), dxjh.c(eseVar8.y.eW.p()), eseVar8.y.fN(), eseVar8.y.eW.R(), eseVar8.y.ay(), eseVar8.y.H(), eseVar8.y.eW.k(), eseVar8.y.eW.at(), eseVar8.y.tE());
            case 21:
                ese eseVar9 = this.a;
                ftt fttVar4 = eseVar9.y;
                dzsj<rb> dzsjVar = fttVar4.eV;
                dzsj<efh> fN = fttVar4.fN();
                dzsj<Application> m = eseVar9.y.eW.m();
                dzsj<cqat> K = eseVar9.y.eW.K();
                dzsj<ckcw> at = eseVar9.y.eW.at();
                dzsj<btvo> V = eseVar9.y.eW.V();
                dzsj<btpc> cx = eseVar9.y.eW.cx();
                dzsj<bvsl> kf = eseVar9.y.eW.kf();
                dzsj<ahjq> k = eseVar9.y.eW.k();
                dzsj<akdv> P = eseVar9.y.P();
                dzsj<byoc> as = eseVar9.y.eW.as();
                dzsj<glj> cz = eseVar9.y.cz();
                dzsj c3 = dxjh.c(eseVar9.y.eW.eY());
                dzsj<Executor> di = eseVar9.y.eW.di();
                dzsj<Executor> o = eseVar9.y.eW.o();
                dzsj<qbt> H = eseVar9.y.H();
                dzsj<akfa> p = eseVar9.y.eW.p();
                dzsj<awre> st = eseVar9.y.st();
                dzsj<awqp> oa = eseVar9.y.eW.oa();
                dzsj<bvjj> aw = eseVar9.y.eW.aw();
                dzsj<awtj> su = eseVar9.y.su();
                dzsj<bwpa> tF = eseVar9.y.tF();
                dzsj dzsjVar2 = eseVar9.k;
                if (dzsjVar2 == null) {
                    dzsjVar2 = new erv(eseVar9, 22);
                    eseVar9.k = dzsjVar2;
                }
                dzsj dzsjVar3 = dzsjVar2;
                dzsj dzsjVar4 = eseVar9.l;
                if (dzsjVar4 == null) {
                    dzsjVar4 = new erv(eseVar9, 23);
                    eseVar9.l = dzsjVar4;
                }
                dzsj c4 = dxjh.c(dzsjVar4);
                dzsj c5 = dxjh.c(eseVar9.y.eW.ds());
                dzsj dzsjVar5 = eseVar9.m;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new erv(eseVar9, 24);
                    eseVar9.m = dzsjVar5;
                }
                dzsj c6 = dxjh.c(dzsjVar5);
                dzsj<qeg> dz = eseVar9.y.eW.dz();
                dzsj dzsjVar6 = eseVar9.o;
                if (dzsjVar6 == null) {
                    dzsjVar6 = new erv(eseVar9, 25);
                    eseVar9.o = dzsjVar6;
                }
                dzsj c7 = dxjh.c(dzsjVar6);
                dzsj dzsjVar7 = eseVar9.q;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new erv(eseVar9, 27);
                    eseVar9.q = dzsjVar7;
                }
                dzsj c8 = dxjh.c(dzsjVar7);
                dzsj dzsjVar8 = eseVar9.s;
                if (dzsjVar8 == null) {
                    dzsjVar8 = new erv(eseVar9, 29);
                    eseVar9.s = dzsjVar8;
                }
                dzsj c9 = dxjh.c(dzsjVar8);
                dzsj dzsjVar9 = eseVar9.t;
                if (dzsjVar9 == null) {
                    dzsjVar9 = new erv(eseVar9, 31);
                    eseVar9.t = dzsjVar9;
                }
                return (T) new bwpo(dzsjVar, fN, m, K, at, V, cx, kf, k, P, as, cz, c3, di, o, H, p, st, oa, aw, su, tF, dzsjVar3, c4, c5, c6, dz, c7, c8, c9, dxjh.c(dzsjVar9), eseVar9.y.eW.il());
            case 22:
                ese eseVar10 = this.a;
                dzsj<efh> fN2 = eseVar10.y.fN();
                ftt fttVar5 = eseVar10.y;
                return (T) new bwow(fN2, fttVar5.eV, fttVar5.cz(), eseVar10.y.aK(), eseVar10.y.bT());
            case 23:
                ese eseVar11 = this.a;
                cqat rR = eseVar11.y.eW.a.rR();
                dxjg.e(rR);
                ftt fttVar6 = eseVar11.y;
                return (T) new bwpz(rR, fttVar6.a, new bwqd(dxjh.c(fttVar6.ay())), new bwqb(dxjh.c(eseVar11.y.ay())));
            case 24:
                ese eseVar12 = this.a;
                return (T) new vrg(eseVar12.y.eW.il(), eseVar12.y.fe(), eseVar12.y.eW.ds(), eseVar12.y.eW.n());
            case 25:
                ese eseVar13 = this.a;
                dzsj<cklf> fe = eseVar13.y.fe();
                dzsj<vpd> ds = eseVar13.y.eW.ds();
                dzsj<btrm> n = eseVar13.y.eW.n();
                dzsj dzsjVar10 = eseVar13.n;
                if (dzsjVar10 == null) {
                    dzsjVar10 = new erv(eseVar13, 26);
                    eseVar13.n = dzsjVar10;
                }
                return (T) new vrc(fe, ds, n, dzsjVar10, eseVar13.y.ad(), dxjh.c(eseVar13.y.aV()));
            case 26:
                return (T) new vre(this.a.y.eV);
            case 27:
                ese eseVar14 = this.a;
                dzsj<cklf> fe2 = eseVar14.y.fe();
                dzsj<vpd> ds2 = eseVar14.y.eW.ds();
                dzsj<btrm> n2 = eseVar14.y.eW.n();
                dzsj dzsjVar11 = eseVar14.p;
                if (dzsjVar11 == null) {
                    dzsjVar11 = new erv(eseVar14, 28);
                    eseVar14.p = dzsjVar11;
                }
                return (T) new vrp(fe2, ds2, n2, dzsjVar11, eseVar14.y.ad(), dxjh.c(eseVar14.y.aV()));
            case 28:
                return (T) new vrr(this.a.y.eV);
            case 29:
                ese eseVar15 = this.a;
                dzsj<cklf> fe3 = eseVar15.y.fe();
                dzsj<vpd> ds3 = eseVar15.y.eW.ds();
                dzsj<btrm> n3 = eseVar15.y.eW.n();
                dzsj dzsjVar12 = eseVar15.r;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new erv(eseVar15, 30);
                    eseVar15.r = dzsjVar12;
                }
                return (T) new vri(fe3, ds3, n3, dzsjVar12, eseVar15.y.ad(), dxjh.c(eseVar15.y.aV()));
            case R.styleable.AppCompatTheme_actionModeTheme /* 30 */:
                return (T) new vrk(this.a.y.eV);
            case R.styleable.AppCompatTheme_actionModeWebSearchDrawable /* 31 */:
                ese eseVar16 = this.a;
                return (T) new bwqg(eseVar16.y.cC(), eseVar16.y.eW.I());
            case R.styleable.AppCompatTheme_actionOverflowButtonStyle /* 32 */:
                return (T) this.a.A();
            case R.styleable.AppCompatTheme_actionOverflowMenuStyle /* 33 */:
                return (T) this.a.B();
            case R.styleable.AppCompatTheme_activityChooserViewStyle /* 34 */:
                ese eseVar17 = this.a;
                Object obj14 = eseVar17.v;
                if (obj14 instanceof dxjf) {
                    synchronized (obj14) {
                        obj7 = eseVar17.v;
                        if (obj7 instanceof dxjf) {
                            obj7 = eseVar17.a;
                            dxjc.d(eseVar17.v, obj7);
                            eseVar17.v = obj7;
                        }
                    }
                    obj14 = obj7;
                }
                return (T) ((sux) obj14);
            case 35:
                return (T) this.a.p();
            case R.styleable.AppCompatTheme_alertDialogCenterButtons /* 36 */:
                return (T) this.a.m();
            default:
                return (T) this.a.d();
        }
    }
}
