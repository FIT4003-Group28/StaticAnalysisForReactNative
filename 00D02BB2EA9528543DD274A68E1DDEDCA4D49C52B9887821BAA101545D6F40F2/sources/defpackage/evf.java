package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: evf  reason: default package */
/* loaded from: classes6.dex */
public final class evf implements dxis {
    private volatile dzsj<askx> A;
    private final dzsj<aswz> B;
    public final aswz a;
    final /* synthetic */ ftt l;
    private volatile dzsj<atsr> s;
    private volatile dzsj<Boolean> t;
    private volatile dzsj<dbsg<asmp>> u;
    private volatile dzsj<asxm> v;
    private volatile dzsj<aswk> y;
    private volatile Object m = new dxjf();
    public volatile Object b = new dxjf();
    private volatile Object n = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    public volatile Object c = new dxjf();
    private volatile Object q = new dxjf();
    private volatile Object r = new dxjf();
    public volatile Object d = new dxjf();
    private volatile Object w = new dxjf();
    private volatile Object x = new dxjf();
    public volatile Object e = new dxjf();
    public volatile Object f = new dxjf();
    public volatile Object g = new dxjf();
    public volatile Object h = new dxjf();
    public volatile Object i = new dxjf();
    public volatile Object j = new dxjf();
    public volatile Object k = new dxjf();
    private volatile Object z = new dxjf();

    public evf(ftt fttVar, aswz aswzVar) {
        this.l = fttVar;
        this.a = aswzVar;
        this.B = dxjd.b(aswzVar);
    }

    private final dzsj<atsr> f() {
        dzsj<atsr> dzsjVar = this.s;
        if (dzsjVar == null) {
            eve eveVar = new eve(this, 1);
            this.s = eveVar;
            return eveVar;
        }
        return dzsjVar;
    }

    private final dzsj<Boolean> g() {
        dzsj<Boolean> dzsjVar = this.t;
        if (dzsjVar == null) {
            eve eveVar = new eve(this, 2);
            this.t = eveVar;
            return eveVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.dxis
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Object obj2;
        aswz aswzVar = (aswz) obj;
        cjqq tp = this.l.eW.a.tp();
        dxjg.e(tp);
        aswzVar.aH = tp;
        cjqy tr = this.l.eW.a.tr();
        dxjg.e(tr);
        aswzVar.aI = tr;
        aswzVar.aJ = dbsg.i(this.l.ap());
        Executor sU = this.l.eW.a.sU();
        dxjg.e(sU);
        aswzVar.aK = sU;
        aswzVar.aL = new cpv();
        aswzVar.aM = dxjc.c(this.l.eW.ie());
        aswzVar.aN = dxjc.c(this.l.eW.iU());
        dxjc.c(this.l.lx());
        Application a = this.l.eW.a.a();
        dxjg.e(a);
        aswzVar.a = a;
        ckcw rU = this.l.eW.a.rU();
        dxjg.e(rU);
        aswzVar.b = rU;
        btvo rp = this.l.eW.a.rp();
        dxjg.e(rp);
        aswzVar.c = rp;
        cqat rR = this.l.eW.a.rR();
        dxjg.e(rR);
        aswzVar.d = rR;
        dzsj<aswk> dzsjVar = this.y;
        if (dzsjVar == null) {
            dzsjVar = new eve<>(this, 0);
            this.y = dzsjVar;
        }
        aswzVar.e = dzsjVar;
        aswzVar.f = dxjc.c(this.l.H());
        btrm rz = this.l.eW.a.rz();
        dxjg.e(rz);
        aswzVar.g = rz;
        aswzVar.ad = this.l.wd();
        aswzVar.ae = dxjc.c(this.l.cz());
        aswzVar.af = d();
        aswzVar.ag = this.l.eW.e();
        aswzVar.ah = this.l.hE();
        aszs e = e();
        cqkj wl = this.l.wl();
        btvo rp2 = this.l.eW.a.rp();
        dxjg.e(rp2);
        cpv cpvVar = new cpv();
        Object obj3 = this.z;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj2 = this.z;
                if (obj2 instanceof dxjf) {
                    obj2 = new atlt(this.l.a);
                    dxjc.d(this.z, obj2);
                    this.z = obj2;
                }
            }
            obj3 = obj2;
        }
        aswzVar.ai = new atop(e, wl, rp2, cpvVar, (atlt) obj3);
        aswzVar.aj = new cjxo(this.l.a);
        bvjj rB = this.l.eW.a.rB();
        dxjg.e(rB);
        aswzVar.ak = rB;
        bwqv rD = this.l.eW.a.rD();
        dxjg.e(rD);
        aswzVar.al = rD;
        aswzVar.am = new asxt(this.l.wl(), this.a);
        this.l.eW.cH();
        aswzVar.an = b();
        aswzVar.ao = this.l.wq();
        aswzVar.ap = this.l.wl();
        aswzVar.aq = this.l.ga();
        aswzVar.ar = this.l.eW.qF();
        bvrb tn = this.l.eW.a.tn();
        dxjg.e(tn);
        aswzVar.as = tn;
        cjqq tp2 = this.l.eW.a.tp();
        dxjg.e(tp2);
        aswzVar.at = tp2;
        aswzVar.au = this.l.eW.fh();
        aswzVar.av = this.l.eW.cG();
        this.l.eW.jq();
        this.l.eW.kG();
        dzsj<askx> dzsjVar2 = this.A;
        if (dzsjVar2 == null) {
            dzsjVar2 = new eve<>(this, 5);
            this.A = dzsjVar2;
        }
        aswzVar.aw = dzsjVar2;
    }

    public final asxm b() {
        Object obj;
        Object obj2 = this.m;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.m;
                if (obj instanceof dxjf) {
                    aswz aswzVar = this.a;
                    btvo rp = this.l.eW.a.rp();
                    dxjg.e(rp);
                    btrm rz = this.l.eW.a.rz();
                    dxjg.e(rz);
                    obj = new asxm(aswzVar, rp, rz);
                    dxjc.d(this.m, obj);
                    this.m = obj;
                }
            }
            obj2 = obj;
        }
        return (asxm) obj2;
    }

    public final askx c() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.p;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    asvx pZ = this.l.eW.pZ();
                    asxm b = b();
                    ftt fttVar = this.l;
                    rb rbVar = fttVar.a;
                    akox ap = fttVar.ap();
                    Object obj5 = this.n;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.n;
                            if (obj3 instanceof dxjf) {
                                ftt fttVar2 = this.l;
                                rb rbVar2 = fttVar2.a;
                                akox ap2 = fttVar2.ap();
                                cqat rR = this.l.eW.a.rR();
                                dxjg.e(rR);
                                obj3 = asyc.b(rbVar2, ap2, rR);
                                dxjc.d(this.n, obj3);
                                this.n = obj3;
                            }
                        }
                        obj5 = obj3;
                    }
                    asky askyVar = (asky) obj5;
                    araj ck = this.l.ck();
                    Object obj6 = this.o;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj2 = this.o;
                            if (obj2 instanceof dxjf) {
                                obj2 = new asmk(this.l.bM(), this.l.h());
                                dxjc.d(this.o, obj2);
                                this.o = obj2;
                            }
                        }
                        obj6 = obj2;
                    }
                    btvo rp = this.l.eW.a.rp();
                    dxjg.e(rp);
                    cjqq tp = this.l.eW.a.tp();
                    dxjg.e(tp);
                    obj = asyc.f(pZ, b, rbVar, ap, askyVar, ck, (asmk) obj6, rp, tp);
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj4 = obj;
        }
        return (askx) obj4;
    }

    public final asxg d() {
        Object obj;
        Object obj2 = this.q;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.q;
                if (obj instanceof dxjf) {
                    gga wk = this.l.wk();
                    btrm rz = this.l.eW.a.rz();
                    dxjg.e(rz);
                    aswz aswzVar = this.a;
                    asxm b = b();
                    btyh sJ = this.l.eW.a.sJ();
                    dxjg.e(sJ);
                    obj = new asxg(wk, rz, aswzVar, b, sJ);
                    dxjc.d(this.q, obj);
                    this.q = obj;
                }
            }
            obj2 = obj;
        }
        return (asxg) obj2;
    }

    public final aszs e() {
        Object obj;
        btrm btrmVar;
        dzsj<ckro> dzsjVar;
        btvo btvoVar;
        Object obj2;
        Object obj3;
        Object obj4 = this.x;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.x;
                if (obj instanceof dxjf) {
                    cqhn cqhnVar = new cqhn();
                    aswz aswzVar = this.a;
                    asxm b = b();
                    akfa rK = this.l.eW.a.rK();
                    dxjg.e(rK);
                    ftt fttVar = this.l;
                    rb rbVar = fttVar.a;
                    btrm rz = fttVar.eW.a.rz();
                    dxjg.e(rz);
                    Object obj5 = this.r;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.r;
                            if (obj3 instanceof dxjf) {
                                rb rbVar2 = this.l.a;
                                cqhn cqhnVar2 = new cqhn();
                                crct dX = this.l.eW.dX();
                                btvo rp = this.l.eW.a.rp();
                                dxjg.e(rp);
                                obj3 = new asuk(rbVar2, cqhnVar2, dX, rp);
                                dxjc.d(this.r, obj3);
                                this.r = obj3;
                            }
                        }
                        obj5 = obj3;
                    }
                    asuk asukVar = (asuk) obj5;
                    btvo rp2 = this.l.eW.a.rp();
                    dxjg.e(rp2);
                    dzsj<btrm> n = this.l.eW.n();
                    dzsj<btvo> V = this.l.eW.V();
                    dzsj<crbk> f = this.l.eW.f();
                    ftt fttVar2 = this.l;
                    atvu atvuVar = new atvu(n, V, f, fttVar2.eV, fttVar2.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.jm(), this.l.eW.kb(), this.l.eW.o(), f(), this.l.eW.oG(), g());
                    ftt fttVar3 = this.l;
                    atvj atvjVar = new atvj(fttVar3.eV, fttVar3.eW.n(), this.l.eW.V(), this.l.eW.f(), this.l.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.kb(), this.l.eW.o(), f(), g());
                    dzsj dzsjVar2 = this.u;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new eve(this, 3);
                        this.u = dzsjVar2;
                    }
                    dzsj dzsjVar3 = dzsjVar2;
                    dzsj<btrm> n2 = this.l.eW.n();
                    dzsj<crbk> f2 = this.l.eW.f();
                    dzsj<pfk> cE = this.l.eW.cE();
                    dzsj<brlz> lm = this.l.eW.lm();
                    dzsj<cqat> K = this.l.eW.K();
                    ftt fttVar4 = this.l;
                    atsy atsyVar = new atsy(dzsjVar3, n2, f2, cE, lm, K, fttVar4.eV, fttVar4.eW.V(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.cD(), this.l.eW.kb(), this.l.eW.o(), f(), this.l.eW.jm(), g());
                    dzsj<btrm> n3 = this.l.eW.n();
                    dzsj<btvo> V2 = this.l.eW.V();
                    dzsj<crbk> f3 = this.l.eW.f();
                    dzsj<cqat> K2 = this.l.eW.K();
                    dzsj<cjqy> al = this.l.eW.al();
                    dzsj<cjqq> hN = this.l.eW.hN();
                    ftt fttVar5 = this.l;
                    atvm atvmVar = new atvm(n3, V2, f3, K2, al, hN, fttVar5.eV, fttVar5.eW.kb(), this.l.eW.o(), f(), g());
                    dzsj<btrm> n4 = this.l.eW.n();
                    dzsj<btvo> V3 = this.l.eW.V();
                    dzsj<crbk> f4 = this.l.eW.f();
                    ftt fttVar6 = this.l;
                    atui atuiVar = new atui(n4, V3, f4, fttVar6.eV, fttVar6.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.jm(), this.l.eW.kb(), this.l.eW.o(), f(), g());
                    dzsj<btrm> n5 = this.l.eW.n();
                    dzsj<btvo> V4 = this.l.eW.V();
                    dzsj<crbk> f5 = this.l.eW.f();
                    dzsj<cqat> K3 = this.l.eW.K();
                    dzsj<cjqy> al2 = this.l.eW.al();
                    dzsj<cjqq> hN2 = this.l.eW.hN();
                    ftt fttVar7 = this.l;
                    atum atumVar = new atum(n5, V4, f5, K3, al2, hN2, fttVar7.eV, fttVar7.eW.kb(), this.l.eW.o(), f(), g());
                    dzsj<btrm> n6 = this.l.eW.n();
                    dzsj<btvo> V5 = this.l.eW.V();
                    dzsj<crbk> f6 = this.l.eW.f();
                    dzsj<cqat> K4 = this.l.eW.K();
                    dzsj<cjqy> al3 = this.l.eW.al();
                    dzsj<cjqq> hN3 = this.l.eW.hN();
                    ftt fttVar8 = this.l;
                    atuo atuoVar = new atuo(n6, V5, f6, K4, al3, hN3, fttVar8.eV, fttVar8.eW.kb(), this.l.eW.o(), f(), g());
                    this.l.eW.n();
                    this.l.eW.V();
                    this.l.eW.f();
                    this.l.eW.K();
                    this.l.eW.al();
                    this.l.eW.hN();
                    this.l.eW.kb();
                    this.l.eW.o();
                    f();
                    g();
                    this.l.eW.n();
                    this.l.eW.V();
                    this.l.eW.f();
                    this.l.eW.K();
                    this.l.eW.al();
                    this.l.eW.hN();
                    this.l.eW.kb();
                    this.l.eW.o();
                    f();
                    g();
                    this.l.eW.cA();
                    atom atomVar = new atom(rp2, atvuVar, atvjVar, atsyVar, atvmVar, atuiVar, atumVar, atuoVar);
                    dzsj<btrm> n7 = this.l.eW.n();
                    dzsj<crbk> f7 = this.l.eW.f();
                    ftt fttVar9 = this.l;
                    atvp atvpVar = new atvp(n7, f7, fttVar9.eV, fttVar9.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.kb(), this.l.eW.o(), f(), this.l.eW.bu(), this.l.eW.kf(), g(), this.l.eW.il(), this.l.eW.V());
                    dzsj<btrm> n8 = this.l.eW.n();
                    dzsj<crbk> f8 = this.l.eW.f();
                    ftt fttVar10 = this.l;
                    atwl atwlVar = new atwl(n8, f8, fttVar10.eV, fttVar10.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.kb(), this.l.eW.o(), f(), g(), this.l.eW.il(), this.l.eW.oH(), this.l.eW.V(), this.l.eW.aw());
                    ftt fttVar11 = this.l;
                    dzsj<rb> dzsjVar4 = fttVar11.eV;
                    dzsj<btrm> n9 = fttVar11.eW.n();
                    dzsj<btvo> V6 = this.l.eW.V();
                    dzsj<crbk> f9 = this.l.eW.f();
                    dzsj<cqat> K5 = this.l.eW.K();
                    dzsj<cjqy> al4 = this.l.eW.al();
                    dzsj<cjqq> hN4 = this.l.eW.hN();
                    dzsj<vsf> jm = this.l.eW.jm();
                    dzsj<bvsl> kf = this.l.eW.kf();
                    dzsj<dehq> kb = this.l.eW.kb();
                    dzsj<Executor> o = this.l.eW.o();
                    dzsj<atsr> f10 = f();
                    dzsj<aswz> dzsjVar5 = this.B;
                    dzsj dzsjVar6 = this.v;
                    if (dzsjVar6 == null) {
                        btrmVar = rz;
                        dzsjVar6 = new eve(this, 4);
                        this.v = dzsjVar6;
                    } else {
                        btrmVar = rz;
                    }
                    atts attsVar = new atts(dzsjVar4, n9, V6, f9, K5, al4, hN4, jm, kf, kb, o, f10, dzsjVar5, dzsjVar6, g());
                    ftt fttVar12 = this.l;
                    atok atokVar = new atok(atomVar, atvpVar, atwlVar, attsVar, new attz(fttVar12.eV, fttVar12.eW.jm(), this.l.eW.n(), this.l.eW.V(), this.l.eW.f(), this.l.eW.K(), this.l.eW.al(), this.l.eW.hN(), this.l.eW.kb(), this.l.eW.o(), f(), g(), this.l.eW.il()));
                    dzsj<ckro> gb = this.l.gb();
                    btvo rp3 = this.l.eW.a.rp();
                    dxjg.e(rp3);
                    asio qF = this.l.eW.qF();
                    brlz qY = this.l.eW.qY();
                    Object obj6 = this.w;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj2 = this.w;
                            if (obj2 instanceof dxjf) {
                                brlz qY2 = this.l.eW.qY();
                                asio qF2 = this.l.eW.qF();
                                akfa rK2 = this.l.eW.a.rK();
                                dxjg.e(rK2);
                                btvoVar = rp3;
                                dzsjVar = gb;
                                ashr ashrVar = new ashr(this.l.ad(), this.l.eW.jo(), this.l.eW.iT(), this.l.eW.kb());
                                btrm rz2 = this.l.eW.a.rz();
                                dxjg.e(rz2);
                                obj2 = ashc.b(qY2, qF2, rK2, ashrVar, rz2, this.l.eA());
                                dxjc.d(this.w, obj2);
                                this.w = obj2;
                            } else {
                                dzsjVar = gb;
                                btvoVar = rp3;
                            }
                        }
                        obj6 = obj2;
                    } else {
                        dzsjVar = gb;
                        btvoVar = rp3;
                    }
                    btrm btrmVar2 = btrmVar;
                    dzsj<ckro> dzsjVar7 = dzsjVar;
                    btvo btvoVar2 = btvoVar;
                    obj = new aszs(cqhnVar, aswzVar, b, rK, rbVar, btrmVar2, asukVar, atokVar, dzsjVar7, btvoVar2, qF, qY, (ashh) obj6, this.l.eA(), new asuc(this.l.gb(), this.l.eW.V()));
                    dxjc.d(this.x, obj);
                    this.x = obj;
                }
            }
            obj4 = obj;
        }
        return (aszs) obj4;
    }
}
