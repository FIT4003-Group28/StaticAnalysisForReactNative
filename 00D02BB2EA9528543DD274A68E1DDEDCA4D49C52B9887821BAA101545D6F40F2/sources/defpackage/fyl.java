package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.transit.TransitStationService;
import com.google.android.gms.common.api.GoogleApiClient;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fyl  reason: default package */
/* loaded from: classes6.dex */
final class fyl implements dxis {
    final /* synthetic */ fyu a;

    public fyl(fyu fyuVar) {
        this.a = fyuVar;
    }

    private final byud b() {
        return new byud(this.a.mU());
    }

    private final bytn c() {
        Application a = this.a.a.a();
        dxjg.e(a);
        bytu bytuVar = new bytu(a, this.a.mV(), this.a.hF());
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        bytc mU = this.a.mU();
        aufl cu = this.a.cu();
        auhj bg = this.a.bg();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        return new bytn(bytuVar, rp, mU, cu, bg, rR);
    }

    private final byub d() {
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        return new byub(rp);
    }

    private final byue e() {
        bzks hG = this.a.hG();
        bzkp hH = this.a.hH();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        byut byutVar = new byut(hG, hH, rR, rp, this.a.mV());
        bytg pL = this.a.pL();
        Application a = this.a.a.a();
        dxjg.e(a);
        aufl cu = this.a.cu();
        auhj bg = this.a.bg();
        bysw mV = this.a.mV();
        bytc mU = this.a.mU();
        Application a2 = this.a.a.a();
        dxjg.e(a2);
        byuc byucVar = new byuc(cu, bg, mV, mU, a2);
        aufl cu2 = this.a.cu();
        byud b = b();
        btvo rp2 = this.a.a.rp();
        dxjg.e(rp2);
        return new byue(byutVar, pL, a, byucVar, cu2, b, rp2, this.a.mU(), this.a.hD());
    }

    private final byuv f() {
        dxjg.e(this.a.a.a());
        dxjg.e(this.a.a.tn());
        dxjg.e(this.a.a.rB());
        return new byuv();
    }

    private final byui g() {
        return new byui(this.a.mU());
    }

    private final Object h() {
        btvo rp = this.a.a.rp();
        dxjg.e(rp);
        bytc mU = this.a.mU();
        aufl cu = this.a.cu();
        auhj bg = this.a.bg();
        bysw mV = this.a.mV();
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        bzle hE = this.a.hE();
        Application a = this.a.a.a();
        dxjg.e(a);
        return new byun(rp, mU, cu, bg, mV, rR, hE, a);
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        GoogleApiClient e;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        TransitStationService transitStationService = (TransitStationService) obj;
        transitStationService.o = this.a.mS();
        fyu fyuVar = this.a;
        bwqv rD = fyuVar.a.rD();
        dxjg.e(rD);
        btvo rp = fyuVar.a.rp();
        dxjg.e(rp);
        dxjg.e(fyuVar.a.rB());
        transitStationService.p = new bytb(rD, rp, bwrj.TRANSIT_SCHEMATIC_MAP_NOTIFICATION_DATA);
        btvo rp2 = this.a.a.rp();
        dxjg.e(rp2);
        transitStationService.q = rp2;
        cqat rR = this.a.a.rR();
        dxjg.e(rR);
        transitStationService.r = rR;
        bvrv e2 = this.a.a.e();
        dxjg.e(e2);
        transitStationService.s = e2;
        ckcw rU = this.a.a.rU();
        dxjg.e(rU);
        transitStationService.t = rU;
        transitStationService.u = this.a.hC();
        transitStationService.v = this.a.mU();
        transitStationService.w = b();
        transitStationService.x = this.a.qc();
        bvjj rB = this.a.a.rB();
        dxjg.e(rB);
        transitStationService.y = rB;
        transitStationService.z = this.a.cu();
        transitStationService.A = c();
        transitStationService.B = this.a.mT();
        Application a = this.a.a.a();
        dxjg.e(a);
        transitStationService.C = a;
        bvrb tn = this.a.a.tn();
        dxjg.e(tn);
        transitStationService.D = tn;
        fyu fyuVar2 = this.a;
        Object obj11 = fyuVar2.ej;
        if (obj11 instanceof dxjf) {
            synchronized (obj11) {
                obj10 = fyuVar2.ej;
                if (obj10 instanceof dxjf) {
                    bvrb tn2 = fyuVar2.a.tn();
                    dxjg.e(tn2);
                    byvr byvrVar = new byvr(tn2);
                    dxjc.d(fyuVar2.ej, byvrVar);
                    fyuVar2.ej = byvrVar;
                    obj10 = byvrVar;
                }
            }
            obj11 = obj10;
        }
        transitStationService.E = (byvr) obj11;
        Application a2 = this.a.a.a();
        dxjg.e(a2);
        transitStationService.F = new byvs(a2);
        transitStationService.G = new bytz(this.a.mU(), d());
        btrm rz = this.a.a.rz();
        dxjg.e(rz);
        transitStationService.H = rz;
        fyu fyuVar3 = this.a;
        Object obj12 = fyuVar3.dj;
        if (obj12 instanceof dxjf) {
            synchronized (obj12) {
                obj9 = fyuVar3.dj;
                if (obj9 instanceof dxjf) {
                    bwqv rD2 = fyuVar3.a.rD();
                    dxjg.e(rD2);
                    btvo rp3 = fyuVar3.a.rp();
                    dxjg.e(rp3);
                    cqat rR2 = fyuVar3.a.rR();
                    dxjg.e(rR2);
                    bytd bytdVar = new bytd(rD2, rp3, rR2);
                    dxjc.d(fyuVar3.dj, bytdVar);
                    fyuVar3.dj = bytdVar;
                    obj9 = bytdVar;
                }
            }
            obj12 = obj9;
        }
        transitStationService.I = (bytd) obj12;
        dxjg.e(this.a.a.rD());
        fyu fyuVar4 = this.a;
        Object obj13 = fyuVar4.dk;
        if (obj13 instanceof dxjf) {
            synchronized (obj13) {
                obj8 = fyuVar4.dk;
                if (obj8 instanceof dxjf) {
                    bwqv rD3 = fyuVar4.a.rD();
                    dxjg.e(rD3);
                    btvo rp4 = fyuVar4.a.rp();
                    dxjg.e(rp4);
                    cqat rR3 = fyuVar4.a.rR();
                    dxjg.e(rR3);
                    obj8 = new byuu(rD3, rp4, rR3, fyuVar4.mU());
                    dxjc.d(fyuVar4.dk, obj8);
                    fyuVar4.dk = obj8;
                }
            }
            obj13 = obj8;
        }
        transitStationService.J = (byuu) obj13;
        transitStationService.K = this.a.md();
        transitStationService.L = this.a.hD();
        transitStationService.M = e();
        transitStationService.N = this.a.pL();
        fyu fyuVar5 = this.a;
        Application a3 = fyuVar5.a.a();
        dxjg.e(a3);
        dxio c = dxjc.c(fyuVar5.p());
        btvo rp5 = fyuVar5.a.rp();
        dxjg.e(rp5);
        Object obj14 = fyuVar5.ek;
        if (obj14 instanceof dxjf) {
            synchronized (obj14) {
                obj7 = fyuVar5.ek;
                if (obj7 instanceof dxjf) {
                    btvo rp6 = fyuVar5.a.rp();
                    dxjg.e(rp6);
                    dxjg.e(fyuVar5.a.rB());
                    obj7 = new byvu(rp6);
                    dxjc.d(fyuVar5.ek, obj7);
                    fyuVar5.ek = obj7;
                }
            }
            obj14 = obj7;
        }
        byvu byvuVar = (byvu) obj14;
        bytc mU = fyuVar5.mU();
        btsm b = btsm.b(a3);
        if (b == null) {
            e = null;
        } else {
            b.g(cool.c);
            b.g(cool.d);
            b.h(btsm.b);
            b.i(btsm.c);
            dkqz dkqzVar = byvuVar.a.getNotificationsParameters().m;
            if (dkqzVar == null) {
                dkqzVar = dkqz.ap;
            }
            if (dkqzVar.ao) {
                mU.a(256);
                byvw.a(b, c, rp5, mU);
            } else {
                mU.a(257);
            }
            e = b.e();
        }
        GoogleApiClient googleApiClient = e;
        copm copmVar = cool.e;
        dxjg.f(copmVar);
        axrg aH = this.a.aH();
        bytc mU2 = this.a.mU();
        btvo rp7 = this.a.a.rp();
        dxjg.e(rp7);
        transitStationService.O = new byuk(googleApiClient, copmVar, aH, mU2, rp7);
        transitStationService.P = this.a.mV();
        fyu fyuVar6 = this.a;
        Object obj15 = fyuVar6.el;
        if (obj15 instanceof dxjf) {
            synchronized (obj15) {
                obj6 = fyuVar6.el;
                if (obj6 instanceof dxjf) {
                    btvo rp8 = fyuVar6.a.rp();
                    dxjg.e(rp8);
                    obj6 = new bytw(rp8, fyuVar6.qn());
                    dxjc.d(fyuVar6.el, obj6);
                    fyuVar6.el = obj6;
                }
            }
            obj15 = obj6;
        }
        transitStationService.Q = (bytw) obj15;
        fyu fyuVar7 = this.a;
        Object obj16 = fyuVar7.em;
        if (obj16 instanceof dxjf) {
            synchronized (obj16) {
                obj5 = fyuVar7.em;
                if (obj5 instanceof dxjf) {
                    btvo rp9 = fyuVar7.a.rp();
                    dxjg.e(rp9);
                    obj5 = new byty(rp9, fyuVar7.au());
                    dxjc.d(fyuVar7.em, obj5);
                    fyuVar7.em = obj5;
                }
            }
            obj16 = obj5;
        }
        transitStationService.R = (byty) obj16;
        f();
        transitStationService.S = g();
        dzsj<ania> hj = this.a.hj();
        dzsj<angp> jB = this.a.jB();
        fyu fyuVar8 = this.a;
        dzsj dzsjVar = fyuVar8.en;
        if (dzsjVar == null) {
            dzsjVar = new fxy(fyuVar8, 750);
            fyuVar8.en = dzsjVar;
        }
        dzsj<Executor> di = this.a.di();
        fyu fyuVar9 = this.a;
        dzsj dzsjVar2 = fyuVar9.eo;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxy(fyuVar9, 751);
            fyuVar9.eo = dzsjVar2;
        }
        transitStationService.T = new byuz(hj, jB, dzsjVar, di, dzsjVar2);
        transitStationService.U = new bmpi(this.a.V(), this.a.m(), this.a.K(), dxjh.c(this.a.at()), dxjh.c(this.a.p()), this.a.kb(), this.a.aI(), this.a.mb());
        fyu fyuVar10 = this.a;
        Object obj17 = fyuVar10.eq;
        if (obj17 instanceof dxjf) {
            synchronized (obj17) {
                obj3 = fyuVar10.eq;
                if (obj3 instanceof dxjf) {
                    bysw mV = fyuVar10.mV();
                    bytc mU3 = fyuVar10.mU();
                    bysv hC = fyuVar10.hC();
                    dxjg.e(fyuVar10.a.a());
                    dxjg.e(fyuVar10.a.tn());
                    dxjg.e(fyuVar10.a.rB());
                    Object obj18 = fyuVar10.ep;
                    if (obj18 instanceof dxjf) {
                        synchronized (obj18) {
                            obj4 = fyuVar10.ep;
                            if (obj4 instanceof dxjf) {
                                btvo rp10 = fyuVar10.a.rp();
                                dxjg.e(rp10);
                                obj4 = new bytv(rp10, fyuVar10.qn(), fyuVar10.mV());
                                dxjc.d(fyuVar10.ep, obj4);
                                fyuVar10.ep = obj4;
                            }
                        }
                        obj18 = obj4;
                    }
                    obj3 = new byuj(mV, mU3, hC, (bytv) obj18, fyuVar10.mT());
                    dxjc.d(fyuVar10.eq, obj3);
                    fyuVar10.eq = obj3;
                }
            }
            obj17 = obj3;
        }
        transitStationService.V = (byuj) obj17;
        transitStationService.W = (byun) h();
        transitStationService.X = d();
        byue e3 = e();
        bvjj rB2 = this.a.a.rB();
        dxjg.e(rB2);
        aufl cu = this.a.cu();
        Application a4 = this.a.a.a();
        dxjg.e(a4);
        cqat rR4 = this.a.a.rR();
        dxjg.e(rR4);
        transitStationService.Y = new byum(e3, rB2, cu, a4, rR4, (byun) h(), c());
        transitStationService.Z = this.a.au();
        transitStationService.aa = dxjc.c(this.a.p());
        fyu fyuVar11 = this.a;
        Object obj19 = fyuVar11.er;
        if (obj19 instanceof dxjf) {
            synchronized (obj19) {
                obj2 = fyuVar11.er;
                if (obj2 instanceof dxjf) {
                    bwqv rD4 = fyuVar11.a.rD();
                    dxjg.e(rD4);
                    byuo byuoVar = new byuo(rD4);
                    dxjc.d(fyuVar11.er, byuoVar);
                    fyuVar11.er = byuoVar;
                    obj2 = byuoVar;
                }
            }
            obj19 = obj2;
        }
        transitStationService.ab = (byuo) obj19;
        bytc mU4 = this.a.mU();
        bytc mU5 = this.a.mU();
        btvo rp11 = this.a.a.rp();
        dxjg.e(rp11);
        wkg wkgVar = new wkg(this.a.nD(), this.a.fr(), this.a.V());
        Executor sU = this.a.a.sU();
        dxjg.e(sU);
        byur byurVar = new byur(mU5, rp11, wkgVar, sU);
        bytc mU6 = this.a.mU();
        axbv dQ = this.a.dQ();
        btvo rp12 = this.a.a.rp();
        dxjg.e(rp12);
        f();
        byus byusVar = new byus(mU6, dQ, rp12, (byun) h());
        cqat rR5 = this.a.a.rR();
        dxjg.e(rR5);
        byta bytaVar = new byta(this.a.mU(), this.a.dL());
        byuv f = f();
        byui g = g();
        Application a5 = this.a.a.a();
        dxjg.e(a5);
        transitStationService.ac = new byva(mU4, byurVar, byusVar, rR5, bytaVar, f, g, a5);
    }
}
