package defpackage;

import android.app.Application;
import android.content.Context;
import com.google.android.apps.gmm.transit.go.service.TransitTripService;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: fyn  reason: default package */
/* loaded from: classes6.dex */
public final class fyn<T> implements dzsj<T> {
    final /* synthetic */ fyr a;
    private final int b;

    public fyn(fyr fyrVar, int i) {
        this.a = fyrVar;
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r18v1, types: [java.lang.Object, buwv] */
    @Override // defpackage.dzsj
    public final T a() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        dzsj<ckoq> dzsjVar;
        dzsj dzsjVar2;
        Object obj8;
        switch (this.b) {
            case 0:
                fyr fyrVar = this.a;
                Object obj9 = fyrVar.t;
                if (obj9 instanceof dxjf) {
                    synchronized (obj9) {
                        obj = fyrVar.t;
                        if (obj instanceof dxjf) {
                            dxjg.e(fyrVar.v.a.C());
                            Object obj10 = fyrVar.b;
                            if (obj10 instanceof dxjf) {
                                synchronized (obj10) {
                                    obj7 = fyrVar.b;
                                    if (obj7 instanceof dxjf) {
                                        obj7 = new bzak(fyrVar.v.dU());
                                        dxjc.d(fyrVar.b, obj7);
                                        fyrVar.b = obj7;
                                    }
                                }
                                obj10 = obj7;
                            }
                            dcep B = dcep.B((bzak) obj10);
                            Object obj11 = fyrVar.o;
                            if (obj11 instanceof dxjf) {
                                synchronized (obj11) {
                                    obj6 = fyrVar.o;
                                    if (obj6 instanceof dxjf) {
                                        obj6 = new bzcj(fyrVar.v.dU(), dxjc.c(fyrVar.i()));
                                        dxjc.d(fyrVar.o, obj6);
                                        fyrVar.o = obj6;
                                    }
                                }
                                obj11 = obj6;
                            }
                            bzcj bzcjVar = (bzcj) obj11;
                            Object obj12 = fyrVar.p;
                            if (obj12 instanceof dxjf) {
                                synchronized (obj12) {
                                    obj5 = fyrVar.p;
                                    if (obj5 instanceof dxjf) {
                                        bzcg bzcgVar = new bzcg(fyrVar.a, fyrVar.v.dU(), fyrVar.h());
                                        dxjc.d(fyrVar.p, bzcgVar);
                                        fyrVar.p = bzcgVar;
                                        obj5 = bzcgVar;
                                    }
                                }
                                obj12 = obj5;
                            }
                            bzcg bzcgVar2 = (bzcg) obj12;
                            Object obj13 = fyrVar.q;
                            if (obj13 instanceof dxjf) {
                                synchronized (obj13) {
                                    obj4 = fyrVar.q;
                                    if (obj4 instanceof dxjf) {
                                        bzcd bzcdVar = new bzcd(fyrVar.a, fyrVar.v.dU());
                                        dxjc.d(fyrVar.q, bzcdVar);
                                        fyrVar.q = bzcdVar;
                                        obj4 = bzcdVar;
                                    }
                                }
                                obj13 = obj4;
                            }
                            bzcd bzcdVar2 = (bzcd) obj13;
                            Object obj14 = fyrVar.r;
                            if (obj14 instanceof dxjf) {
                                synchronized (obj14) {
                                    obj3 = fyrVar.r;
                                    if (obj3 instanceof dxjf) {
                                        obj3 = new bzce(fyrVar.a);
                                        dxjc.d(fyrVar.r, obj3);
                                        fyrVar.r = obj3;
                                    }
                                }
                                obj14 = obj3;
                            }
                            bzce bzceVar = (bzce) obj14;
                            Object obj15 = fyrVar.s;
                            if (obj15 instanceof dxjf) {
                                synchronized (obj15) {
                                    obj2 = fyrVar.s;
                                    if (obj2 instanceof dxjf) {
                                        obj2 = new bzcf(fyrVar.a, fyrVar.v.cu());
                                        dxjc.d(fyrVar.s, obj2);
                                        fyrVar.s = obj2;
                                    }
                                }
                                obj15 = obj2;
                            }
                            obj = new bzci(B, bzcjVar, bzcgVar2, bzcdVar2, bzceVar, (bzcf) obj15);
                            dxjc.d(fyrVar.t, obj);
                            fyrVar.t = obj;
                        }
                    }
                    obj9 = obj;
                }
                return (T) ((bzci) obj9);
            case 1:
                fyr fyrVar2 = this.a;
                dzsj<byzk> c = fyrVar2.c();
                dzsj dzsjVar3 = fyrVar2.g;
                if (dzsjVar3 == null) {
                    dzsjVar3 = new fyn(fyrVar2, 4);
                    fyrVar2.g = dzsjVar3;
                }
                dzsj dzsjVar4 = dzsjVar3;
                dzsj dzsjVar5 = fyrVar2.h;
                if (dzsjVar5 == null) {
                    dzsjVar5 = new fyn(fyrVar2, 8);
                    fyrVar2.h = dzsjVar5;
                }
                dzsj dzsjVar6 = dzsjVar5;
                dzsj dzsjVar7 = fyrVar2.j;
                if (dzsjVar7 == null) {
                    dzsjVar7 = new fyn(fyrVar2, 10);
                    fyrVar2.j = dzsjVar7;
                }
                dzsj dzsjVar8 = dzsjVar7;
                dzsj<Executor> di = fyrVar2.v.di();
                dzsj<dehq> pM = fyrVar2.v.pM();
                dzsj<btrm> n = fyrVar2.v.n();
                dzsj<ahjq> k = fyrVar2.v.k();
                dzsj<Application> m = fyrVar2.v.m();
                dzsj<bwqv> er = fyrVar2.v.er();
                dzsj<bvjj> aw = fyrVar2.v.aw();
                dzsj<btvo> V = fyrVar2.v.V();
                dzsj<ckoq> iO = fyrVar2.v.iO();
                dzsj<aufl> ax = fyrVar2.v.ax();
                dzsj<auhj> cv = fyrVar2.v.cv();
                dzsj<ausy> aB = fyrVar2.v.aB();
                fyu fyuVar = fyrVar2.v;
                dzsj dzsjVar9 = fyuVar.es;
                if (dzsjVar9 == null) {
                    dzsjVar = iO;
                    dzsjVar9 = new fxy(fyuVar, 753);
                    fyuVar.es = dzsjVar9;
                } else {
                    dzsjVar = iO;
                }
                fyu fyuVar2 = fyrVar2.v;
                dzsj dzsjVar10 = fyuVar2.et;
                if (dzsjVar10 == null) {
                    dzsjVar2 = dzsjVar9;
                    dzsjVar10 = new fxy(fyuVar2, 754);
                    fyuVar2.et = dzsjVar10;
                } else {
                    dzsjVar2 = dzsjVar9;
                }
                dzsj dzsjVar11 = dzsjVar10;
                dzsj dzsjVar12 = fyrVar2.k;
                if (dzsjVar12 == null) {
                    dzsjVar12 = new fyn(fyrVar2, 12);
                    fyrVar2.k = dzsjVar12;
                }
                dzsj dzsjVar13 = dzsjVar12;
                dzsj<cqat> K = fyrVar2.v.K();
                dzsj dzsjVar14 = fyrVar2.l;
                if (dzsjVar14 == null) {
                    dzsjVar14 = new fyn(fyrVar2, 13);
                    fyrVar2.l = dzsjVar14;
                }
                dzsj dzsjVar15 = dzsjVar14;
                dzsj<aibo> nX = fyrVar2.v.nX();
                dzsj dzsjVar16 = fyrVar2.m;
                if (dzsjVar16 == null) {
                    dzsjVar16 = new fyn(fyrVar2, 14);
                    fyrVar2.m = dzsjVar16;
                }
                dzsj dzsjVar17 = dzsjVar16;
                dzsj dzsjVar18 = fyrVar2.n;
                if (dzsjVar18 == null) {
                    dzsjVar18 = new fyn(fyrVar2, 15);
                    fyrVar2.n = dzsjVar18;
                }
                return (T) new bzfh(c, dzsjVar4, dzsjVar6, dzsjVar8, di, pM, n, k, m, er, aw, V, dzsjVar, ax, cv, aB, dzsjVar2, dzsjVar11, dzsjVar13, K, dzsjVar15, nX, dzsjVar17, dzsjVar18);
            case 2:
                return (T) this.a.b();
            case 3:
                fyr fyrVar3 = this.a;
                Object obj16 = fyrVar3.c;
                if (obj16 instanceof dxjf) {
                    synchronized (obj16) {
                        obj8 = fyrVar3.c;
                        if (obj8 instanceof dxjf) {
                            Context b = fyrVar3.v.a.b();
                            dxjg.e(b);
                            btpc sz = fyrVar3.v.a.sz();
                            dxjg.e(sz);
                            crct dX = fyrVar3.v.dX();
                            bvjj rB = fyrVar3.v.a.rB();
                            dxjg.e(rB);
                            btvo rp = fyrVar3.v.a.rp();
                            dxjg.e(rp);
                            String d = fyrVar3.v.a.d();
                            dxjg.e(d);
                            dehq tj = fyrVar3.v.a.tj();
                            dxjg.e(tj);
                            dehq tg = fyrVar3.v.a.tg();
                            dxjg.e(tg);
                            akfa rK = fyrVar3.v.a.rK();
                            dxjg.e(rK);
                            ckcw rU = fyrVar3.v.a.rU();
                            dxjg.e(rU);
                            cqat rR = fyrVar3.v.a.rR();
                            dxjg.e(rR);
                            btrm rz = fyrVar3.v.a.rz();
                            dxjg.e(rz);
                            ?? pD = fyrVar3.v.pD();
                            ahjq wf = fyrVar3.v.wf();
                            mwo cC = fyrVar3.v.cC();
                            dbpy<Object> dbpyVar = dbpy.a;
                            btyy y = fyrVar3.v.a.y();
                            dxjg.e(y);
                            obj8 = new crnz(b, sz, dX, rB, rp, d, tj, tg, rK, rU, rR, rz, pD, wf, cC, dbpyVar, y, fyrVar3.v.pE(), dbsg.i(fyrVar3.v.cG()));
                            dxjc.d(fyrVar3.c, obj8);
                            fyrVar3.c = obj8;
                        }
                    }
                    obj16 = obj8;
                }
                return (T) ((crnz) obj16);
            case 4:
                fyr fyrVar4 = this.a;
                dzsj<TransitTripService> dzsjVar19 = fyrVar4.u;
                dzsj<dehq> pM2 = fyrVar4.v.pM();
                dzsj<aufl> ax2 = fyrVar4.v.ax();
                dzsj dzsjVar20 = fyrVar4.d;
                if (dzsjVar20 == null) {
                    dzsjVar20 = new fyn(fyrVar4, 5);
                    fyrVar4.d = dzsjVar20;
                }
                dzsj dzsjVar21 = dzsjVar20;
                dzsj<byzi> oh = fyrVar4.v.oh();
                dzsj<ckoq> iO2 = fyrVar4.v.iO();
                dzsj dzsjVar22 = fyrVar4.e;
                if (dzsjVar22 == null) {
                    dzsjVar22 = new fyn(fyrVar4, 6);
                    fyrVar4.e = dzsjVar22;
                }
                dzsj dzsjVar23 = dzsjVar22;
                dzsj<cqat> K2 = fyrVar4.v.K();
                dzsj dzsjVar24 = fyrVar4.f;
                if (dzsjVar24 == null) {
                    dzsjVar24 = new fyn(fyrVar4, 7);
                    fyrVar4.f = dzsjVar24;
                }
                return (T) new bzag(dzsjVar19, pM2, ax2, dzsjVar21, oh, iO2, dzsjVar23, K2, dzsjVar24);
            case 5:
                fyr fyrVar5 = this.a;
                TransitTripService transitTripService = fyrVar5.a;
                vyl d2 = fyrVar5.d();
                vyl d3 = fyrVar5.d();
                TransitTripService transitTripService2 = fyrVar5.a;
                bvsl sA = fyrVar5.v.sA();
                btvo rp2 = fyrVar5.v.a.rp();
                dxjg.e(rp2);
                bzas bzasVar = new bzas(d3, transitTripService2, sA, rp2, fyrVar5.e());
                vyl d4 = fyrVar5.d();
                TransitTripService transitTripService3 = fyrVar5.a;
                vsf g = fyrVar5.v.g();
                btvo rp3 = fyrVar5.v.a.rp();
                dxjg.e(rp3);
                bzam bzamVar = new bzam(d4, transitTripService3, g, rp3, fyrVar5.e());
                vyl d5 = fyrVar5.d();
                TransitTripService transitTripService4 = fyrVar5.a;
                vsf g2 = fyrVar5.v.g();
                dxjg.e(fyrVar5.v.a.C());
                btvo rp4 = fyrVar5.v.a.rp();
                dxjg.e(rp4);
                dxjg.e(fyrVar5.v.a.rR());
                bzal bzalVar = new bzal(d5, transitTripService4, g2, rp4);
                vyl d6 = fyrVar5.d();
                TransitTripService transitTripService5 = fyrVar5.a;
                vsf g3 = fyrVar5.v.g();
                ckoq C = fyrVar5.v.a.C();
                dxjg.e(C);
                btvo rp5 = fyrVar5.v.a.rp();
                dxjg.e(rp5);
                dxjg.e(fyrVar5.v.a.rR());
                byzw byzwVar = new byzw(d6, transitTripService5, g3, C, rp5);
                vyl d7 = fyrVar5.d();
                TransitTripService transitTripService6 = fyrVar5.a;
                btvo rp6 = fyrVar5.v.a.rp();
                dxjg.e(rp6);
                byzo byzoVar = new byzo(d7, transitTripService6, rp6);
                vyl d8 = fyrVar5.d();
                TransitTripService transitTripService7 = fyrVar5.a;
                btvo rp7 = fyrVar5.v.a.rp();
                dxjg.e(rp7);
                byzv byzvVar = new byzv(d8, transitTripService7, rp7);
                btvo rp8 = fyrVar5.v.a.rp();
                dxjg.e(rp8);
                return (T) new byzr(transitTripService, d2, bzasVar, bzamVar, bzalVar, byzwVar, byzoVar, byzvVar, rp8);
            case 6:
                fyr fyrVar6 = this.a;
                return (T) new bzai(fyrVar6.a, fyrVar6.v.bg(), fyrVar6.f());
            case 7:
                return (T) new bzgc();
            case 8:
                fyr fyrVar7 = this.a;
                return (T) new bzgq(fyrVar7.u, fyrVar7.v.K(), fyrVar7.g(), fyrVar7.v.f(), fyrVar7.v.oh());
            case 9:
                return (T) this.a.f();
            case 10:
                fyr fyrVar8 = this.a;
                dzsj dzsjVar25 = fyrVar8.i;
                if (dzsjVar25 == null) {
                    dzsjVar25 = new fyn(fyrVar8, 11);
                    fyrVar8.i = dzsjVar25;
                }
                return (T) new bzed(dzsjVar25);
            case 11:
                return (T) new fyo(this.a);
            case 12:
                fyr fyrVar9 = this.a;
                return (T) new bzea(fyrVar9.v.nG(), fyrVar9.v.pM(), fyrVar9.c(), fyrVar9.v.V(), fyrVar9.v.nP(), fyrVar9.v.nQ());
            case 13:
                return (T) this.a.h();
            case 14:
                fyr fyrVar10 = this.a;
                return (T) new bzbe(fyrVar10.v.m(), fyrVar10.v.cv(), fyrVar10.v.ax(), fyrVar10.g(), fyrVar10.v.V(), fyrVar10.v.aB());
            default:
                fyr fyrVar11 = this.a;
                btrm rz2 = fyrVar11.v.a.rz();
                dxjg.e(rz2);
                cqat rR2 = fyrVar11.v.a.rR();
                dxjg.e(rR2);
                pag bx = fyrVar11.v.bx();
                Executor sV = fyrVar11.v.a.sV();
                dxjg.e(sV);
                ckcw rU2 = fyrVar11.v.a.rU();
                dxjg.e(rU2);
                buvq buvqVar = fyrVar11.w;
                if (buvqVar == null) {
                    dxio c2 = dxjc.c(fyrVar11.v.h());
                    bvrb tn = fyrVar11.v.a.tn();
                    dxjg.e(tn);
                    buvqVar = buvs.b(buvr.b(c2, tn));
                    fyrVar11.w = buvqVar;
                }
                return (T) new bzat(rz2, rR2, new crsq(bx, sV, rU2, buvqVar));
        }
    }
}
