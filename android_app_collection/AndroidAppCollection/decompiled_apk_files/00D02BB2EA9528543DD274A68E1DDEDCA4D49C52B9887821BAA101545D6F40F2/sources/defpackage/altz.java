package defpackage;

import android.content.Context;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: altz  reason: default package */
/* loaded from: classes.dex */
public final class altz implements akpv {
    private volatile dzsj<alyx> A;
    private volatile dzsj<ambz> B;
    public final akpx a;
    public final Context b;
    public final amcp c;
    public final akpw d;
    private final dbty<akqq> e;
    private final eeu f;
    private final akpl g;
    private final alja h;
    private final akpr i;
    private volatile dzsj<dvsb> j;
    private volatile dzsj<ammc> l;
    private volatile dzsj<dwwr> m;
    private volatile dzsj<duxm> o;
    private volatile dzsj<bnsn> q;
    private volatile dzsj<amyd> r;
    private volatile dzsj<akpe> s;
    private volatile dzsj<gcg> v;
    private volatile dzsj<akor> z;
    private volatile Object k = new dxjf();
    private volatile Object n = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object t = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object w = new dxjf();
    private volatile Object x = new dxjf();
    private volatile Object y = new dxjf();
    private volatile Object C = new dxjf();
    private volatile Object D = new dxjf();
    private volatile Object E = new dxjf();
    private volatile Object F = new dxjf();

    public altz(akpx akpxVar, amcp amcpVar, akpw akpwVar, Context context, eeu eeuVar, akpl akplVar, dbty<akqq> dbtyVar, akpr akprVar, alja aljaVar) {
        this.e = dbtyVar;
        this.f = eeuVar;
        this.a = akpxVar;
        this.b = context;
        this.c = amcpVar;
        this.g = akplVar;
        this.d = akpwVar;
        this.h = aljaVar;
        this.i = akprVar;
    }

    private final dzsj<bnsn> r() {
        dzsj<bnsn> dzsjVar = this.q;
        if (dzsjVar == null) {
            alty altyVar = new alty(this, 4);
            this.q = altyVar;
            return altyVar;
        }
        return dzsjVar;
    }

    private final dzsj<akpe> s() {
        dzsj<akpe> dzsjVar = this.s;
        if (dzsjVar == null) {
            alty altyVar = new alty(this, 6);
            this.s = altyVar;
            return altyVar;
        }
        return dzsjVar;
    }

    private final anax t() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    cjqy tr = this.a.tr();
                    dxjg.e(tr);
                    cjqq tp = this.a.tp();
                    dxjg.e(tp);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    dehq tg = this.a.tg();
                    dxjg.e(tg);
                    dbty<Boolean> i = this.d.i();
                    dxjg.e(i);
                    obj = new anax(tr, tp, rR, tg, i);
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (anax) obj2;
    }

    private final amyj u() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    amyj amyjVar = new amyj(p().a(), this.g.b);
                    dxjc.d(this.t, amyjVar);
                    this.t = amyjVar;
                    obj = amyjVar;
                }
            }
            obj2 = obj;
        }
        return (amyj) obj2;
    }

    @Override // defpackage.akpv
    public final akpe a() {
        Object obj;
        Object obj2;
        Object obj3 = this.n;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.n;
                if (obj instanceof dxjf) {
                    dbty<akqq> dbtyVar = this.e;
                    Object obj4 = this.k;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.k;
                            if (obj2 instanceof dxjf) {
                                eeu eeuVar = this.f;
                                bttf rX = this.a.rX();
                                dxjg.e(rX);
                                cqat rR = this.a.rR();
                                dxjg.e(rR);
                                dzsj dzsjVar = this.j;
                                if (dzsjVar == null) {
                                    dzsjVar = new alty(this, 0);
                                    this.j = dzsjVar;
                                }
                                bvju vw = this.a.vw();
                                dxjg.e(vw);
                                cjqy tr = this.a.tr();
                                dxjg.e(tr);
                                dehq tg = this.a.tg();
                                dxjg.e(tg);
                                obj2 = new alam(rR, rX, eeuVar, dzsjVar, vw, tr, tg);
                                dxjc.d(this.k, obj2);
                                this.k = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    akpj akpjVar = (akpj) obj4;
                    ckcw rU = this.a.rU();
                    dxjg.e(rU);
                    dzsj dzsjVar2 = this.l;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new alty(this, 1);
                        this.l = dzsjVar2;
                    }
                    dxio c = dxjc.c(dzsjVar2);
                    dzsj<dwwr> p = p();
                    bttf rX2 = this.a.rX();
                    dxjg.e(rX2);
                    bvjj rW = this.a.rW();
                    dxjg.e(rW);
                    cjqy tr2 = this.a.tr();
                    dxjg.e(tr2);
                    dehq tg2 = this.a.tg();
                    dxjg.e(tg2);
                    obj = new akoo(dbtyVar, akpjVar, rU, c, p, rX2, rW, tr2, tg2);
                    dxjc.d(this.n, obj);
                    this.n = obj;
                }
            }
            obj3 = obj;
        }
        return (akpe) obj3;
    }

    @Override // defpackage.akpv
    public final bnsn b() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    Context context = this.b;
                    ckcw rU = this.a.rU();
                    dxjg.e(rU);
                    bvnx rS = this.a.rS();
                    dxjg.e(rS);
                    dzsj dzsjVar = this.o;
                    if (dzsjVar == null) {
                        dzsjVar = new alty(this, 3);
                        this.o = dzsjVar;
                    }
                    bnsn bnsnVar = new bnsn(context, rU, rS, dzsjVar);
                    dxjc.d(this.p, bnsnVar);
                    this.p = bnsnVar;
                    obj = bnsnVar;
                }
            }
            obj2 = obj;
        }
        return (bnsn) obj2;
    }

    @Override // defpackage.akpv
    public final akzh c() {
        Object obj;
        Object obj2 = this.x;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.x;
                if (obj instanceof dxjf) {
                    obj = q().b();
                    dxjg.f(obj);
                    dxjc.d(this.x, obj);
                    this.x = obj;
                }
            }
            obj2 = obj;
        }
        return (akzh) obj2;
    }

    @Override // defpackage.akpv
    public final alsq d() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof dxjf) {
                    obj = new altp(new altc());
                    dxjc.d(this.y, obj);
                    this.y = obj;
                }
            }
            obj2 = obj;
        }
        return (alsq) obj2;
    }

    @Override // defpackage.akpv
    public final akpl e() {
        return this.g;
    }

    @Override // defpackage.akpv
    public final akox f() {
        Object obj;
        Object obj2 = this.C;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.C;
                if (obj instanceof dxjf) {
                    akpl akplVar = this.g;
                    amkx amkxVar = amkx.PHONES_AND_TABLETS;
                    dxjg.f(amkxVar);
                    alsq d = d();
                    dzsj dzsjVar = this.z;
                    if (dzsjVar == null) {
                        dzsjVar = new alty(this, 8);
                        this.z = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.A;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new alty(this, 9);
                        this.A = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    dzsj dzsjVar3 = this.B;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new alty(this, 10);
                        this.B = dzsjVar3;
                    }
                    dxio c3 = dxjc.c(dzsjVar3);
                    dxio c4 = dxjc.c(r());
                    akpq h = h();
                    dxio c5 = dxjc.c(s());
                    ammc i = i();
                    bvkx sN = this.a.sN();
                    dxjg.e(sN);
                    amyj u = u();
                    ckcw rU = this.a.rU();
                    dxjg.e(rU);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    btvt tq = this.a.tq();
                    dxjg.e(tq);
                    amyl f = this.d.f();
                    dxjg.e(f);
                    amoh b = this.d.b();
                    dxjg.e(b);
                    dehq tg = this.a.tg();
                    dxjg.e(tg);
                    dehq td = this.a.td();
                    dxjg.e(td);
                    final akwu rV = this.a.rV();
                    dxjg.e(rV);
                    akrz e = this.d.e();
                    dxjg.e(e);
                    rV.getClass();
                    akox akoxVar = new akox(c, akplVar, c2, c3, d, amkxVar, false, c4, h, c5, i, sN, u, rU, rR, tq, f, b, tg, td, new dzsj(rV) { // from class: akoy
                        private final akwu a;

                        {
                            this.a = rV;
                        }

                        @Override // defpackage.dzsj
                        public final Object a() {
                            return this.a.c();
                        }
                    }, e);
                    dxjc.d(this.C, akoxVar);
                    this.C = akoxVar;
                    obj = akoxVar;
                }
            }
            obj2 = obj;
        }
        return (akox) obj2;
    }

    @Override // defpackage.akpv
    public final akpn g() {
        Object obj;
        Object obj2 = this.D;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.D;
                if (obj instanceof dxjf) {
                    obj = new akpb();
                    dxjc.d(this.D, obj);
                    this.D = obj;
                }
            }
            obj2 = obj;
        }
        return (akpn) obj2;
    }

    @Override // defpackage.akpv
    public final akpq h() {
        Object obj;
        Object obj2 = this.E;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.E;
                if (obj instanceof dxjf) {
                    obj = new alrf(dxjc.c(r()));
                    dxjc.d(this.E, obj);
                    this.E = obj;
                }
            }
            obj2 = obj;
        }
        return (akpq) obj2;
    }

    @Override // defpackage.akpv
    public final ammc i() {
        Object obj;
        Object obj2 = this.F;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.F;
                if (obj instanceof dxjf) {
                    ckcw rU = this.a.rU();
                    dxjg.e(rU);
                    ammc ammcVar = new ammc(rU, ckme.PRIMARY_MAP, this.a.sL());
                    dxjc.d(this.F, ammcVar);
                    this.F = ammcVar;
                    obj = ammcVar;
                }
            }
            obj2 = obj;
        }
        return (ammc) obj2;
    }

    @Override // defpackage.akpv
    public final cjvm j() {
        cjvm g = q().g();
        dxjg.f(g);
        return g;
    }

    @Override // defpackage.akpv
    public final anat k() {
        return t();
    }

    @Override // defpackage.akpv
    public final aksn l() {
        aksn aD = q().a().aD();
        dxjg.f(aD);
        return aD;
    }

    @Override // defpackage.akpv
    public final aksp m() {
        aksp aA = q().a().aA();
        dxjg.f(aA);
        return aA;
    }

    @Override // defpackage.akpv
    public final akty n() {
        akty aC = q().a().aC();
        dxjg.f(aC);
        return aC;
    }

    @Override // defpackage.akpv
    public final akvz o() {
        akvz aE = q().a().aE();
        dxjg.f(aE);
        return aE;
    }

    public final dzsj<dwwr> p() {
        dzsj<dwwr> dzsjVar = this.m;
        if (dzsjVar == null) {
            alty altyVar = new alty(this, 2);
            this.m = altyVar;
            return altyVar;
        }
        return dzsjVar;
    }

    public final akor q() {
        Object obj;
        Context context;
        Object obj2 = this.w;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.w;
                if (obj instanceof dxjf) {
                    Object d = this.c.d();
                    dxjg.e(d);
                    alwc b = this.c.b();
                    dxjg.e(b);
                    akpl akplVar = this.g;
                    Context context2 = this.b;
                    alsq d2 = d();
                    dxio c = dxjc.c(r());
                    akpq h = h();
                    dzsj dzsjVar = this.r;
                    if (dzsjVar == null) {
                        dzsjVar = new alty(this, 5);
                        this.r = dzsjVar;
                    }
                    dxio c2 = dxjc.c(dzsjVar);
                    dxio c3 = dxjc.c(s());
                    ammc i = i();
                    Context rJ = this.a.rJ();
                    dxjg.e(rJ);
                    btmv rY = this.a.rY();
                    dxjg.e(rY);
                    ckcw rU = this.a.rU();
                    dxjg.e(rU);
                    akwu rV = this.a.rV();
                    dxjg.e(rV);
                    cqat rR = this.a.rR();
                    dxjg.e(rR);
                    btvt tq = this.a.tq();
                    dxjg.e(tq);
                    bvnx rS = this.a.rS();
                    dxjg.e(rS);
                    btrm rL = this.a.rL();
                    dxjg.e(rL);
                    cjvn rM = this.a.rM();
                    dxjg.e(rM);
                    amoh b2 = this.d.b();
                    dxjg.e(b2);
                    bvjj rW = this.a.rW();
                    dxjg.e(rW);
                    akfa rK = this.a.rK();
                    dxjg.e(rK);
                    amfi a = this.c.a();
                    dxjg.e(a);
                    amym c4 = this.d.c();
                    dxjg.e(c4);
                    bvkx sN = this.a.sN();
                    dxjg.e(sN);
                    dehq tf = this.a.tf();
                    dxjg.e(tf);
                    dehq tg = this.a.tg();
                    dxjg.e(tg);
                    dehq td = this.a.td();
                    dxjg.e(td);
                    Executor sX = this.a.sX();
                    dxjg.e(sX);
                    dehq tc = this.a.tc();
                    dxjg.e(tc);
                    ambz c5 = this.c.c();
                    dxjg.e(c5);
                    alvc d3 = this.d.d();
                    dxjg.e(d3);
                    hwv vv = this.a.vv();
                    dxjg.e(vv);
                    alja aljaVar = this.h;
                    alyx g = this.d.g();
                    dxjg.e(g);
                    dbty<Boolean> h2 = this.d.h();
                    dxjg.e(h2);
                    dbty<Boolean> i2 = this.d.i();
                    dxjg.e(i2);
                    akpr akprVar = this.i;
                    amyj u = u();
                    anax t = t();
                    akrz e = this.d.e();
                    dxjg.e(e);
                    dzsj dzsjVar2 = this.v;
                    if (dzsjVar2 == null) {
                        context = rJ;
                        dzsjVar2 = new alty(this, 7);
                        this.v = dzsjVar2;
                    } else {
                        context = rJ;
                    }
                    dxjc.c(dzsjVar2);
                    aliu aliuVar = new aliu(aljaVar);
                    obj = alrd.a(d, context2.getResources(), b, akplVar, context2, (altp) d2, akry.TRAFFIC_V2, c, h, c2, c3, i, context, rY, rU, rV, rR, tq, rS, rL, rM.a(1), b2, rW, rK, a, c4, sN, tf, tg, td, sX, tc, c5, d3, vv, g, aliuVar, h2, i2, false, akprVar, u, t, e);
                    dxjc.d(this.w, obj);
                    this.w = obj;
                }
            }
            obj2 = obj;
        }
        return (akor) obj2;
    }
}
