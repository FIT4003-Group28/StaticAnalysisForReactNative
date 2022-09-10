package defpackage;

import android.app.Application;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.apps.maps.R;
import com.google.android.libraries.geo.navcore.service.base.NavigationService;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: fxl  reason: default package */
/* loaded from: classes.dex */
final class fxl implements crgu {
    private volatile dzsj<crgh> ae;
    private final dzsj<Service> af;
    private volatile buvq ag;
    final /* synthetic */ fyu b;
    private final Service c;
    private volatile dzsj<atsr> l;
    private volatile dzsj<Boolean> m;
    private volatile dzsj<dbsg<asmp>> n;
    private volatile dzsj<crlb> v;
    private volatile dzsj<pot> w;
    private volatile Object d = new dxjf();
    private volatile Object e = new dxjf();
    private volatile Object f = new dxjf();
    private volatile Object g = new dxjf();
    private volatile Object h = new dxjf();
    private volatile Object i = new dxjf();
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();
    public volatile Object a = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object q = new dxjf();
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    private volatile Object t = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object x = new dxjf();
    private volatile Object y = new dxjf();
    private volatile Object z = new dxjf();
    private volatile Object A = new dxjf();
    private volatile Object B = new dxjf();
    private volatile Object C = new dxjf();
    private volatile Object D = new dxjf();
    private volatile Object E = new dxjf();
    private volatile Object F = new dxjf();
    private volatile Object G = new dxjf();
    private volatile Object H = new dxjf();
    private volatile Object I = new dxjf();
    private volatile Object J = new dxjf();
    private volatile Object K = new dxjf();
    private volatile Object L = new dxjf();
    private volatile Object M = new dxjf();
    private volatile Object N = new dxjf();
    private volatile Object O = new dxjf();
    private volatile Object P = new dxjf();
    private volatile Object Q = new dxjf();
    private volatile Object R = new dxjf();
    private volatile Object S = new dxjf();
    private volatile Object T = new dxjf();
    private volatile Object U = new dxjf();
    private volatile Object V = new dxjf();
    private volatile Object W = new dxjf();
    private volatile Object X = new dxjf();
    private volatile Object Y = new dxjf();
    private volatile Object Z = new dxjf();
    private volatile Object aa = new dxjf();
    private volatile Object ab = new dxjf();
    private volatile Object ac = new dxjf();
    private volatile Object ad = new dxjf();

    public fxl(fyu fyuVar, Service service) {
        this.b = fyuVar;
        this.c = service;
        this.af = dxjd.b(service);
    }

    private final crgv A() {
        Object obj;
        Object obj2 = this.Y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.Y;
                if (obj instanceof dxjf) {
                    ckox u = this.b.a.u();
                    dxjg.e(u);
                    obj = new crgv(dbsg.i(u));
                    dxjc.d(this.Y, obj);
                    this.Y = obj;
                }
            }
            obj2 = obj;
        }
        return (crgv) obj2;
    }

    private final arzw e() {
        Object obj;
        Object obj2 = this.e;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.e;
                if (obj instanceof dxjf) {
                    Application a = this.b.a.a();
                    dxjg.e(a);
                    dxio c = dxjc.c(this.b.kf());
                    dxio c2 = dxjc.c(this.b.bu());
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    obj = new arzw(a, c, c2, rR);
                    dxjc.d(this.e, obj);
                    this.e = obj;
                }
            }
            obj2 = obj;
        }
        return (arzw) obj2;
    }

    private final Object f() {
        Object obj;
        Object obj2 = this.f;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.f;
                if (obj instanceof dxjf) {
                    dcmr<Object> dcmrVar = dcmr.a;
                    obj = new asbl();
                    dxjc.d(this.f, obj);
                    this.f = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final crka g() {
        Object obj;
        Object obj2 = this.h;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.h;
                if (obj instanceof dxjf) {
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    obj = new crka(rB, this.b.qd());
                    dxjc.d(this.h, obj);
                    this.h = obj;
                }
            }
            obj2 = obj;
        }
        return (crka) obj2;
    }

    private final dzsj<atsr> h() {
        dzsj<atsr> dzsjVar = this.l;
        if (dzsjVar == null) {
            fxk fxkVar = new fxk(this, 0);
            this.l = fxkVar;
            return fxkVar;
        }
        return dzsjVar;
    }

    private final dzsj<Boolean> i() {
        dzsj<Boolean> dzsjVar = this.m;
        if (dzsjVar == null) {
            fxk fxkVar = new fxk(this, 1);
            this.m = fxkVar;
            return fxkVar;
        }
        return dzsjVar;
    }

    private final arzn j() {
        Object obj;
        btrm btrmVar;
        Executor executor;
        Executor executor2;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8 = this.p;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    Executor sU = this.b.a.sU();
                    dxjg.e(sU);
                    Executor sV = this.b.a.sV();
                    dxjg.e(sV);
                    Object obj9 = this.k;
                    if (obj9 instanceof dxjf) {
                        synchronized (obj9) {
                            obj3 = this.k;
                            if (obj3 instanceof dxjf) {
                                cqat rR = this.b.a.rR();
                                dxjg.e(rR);
                                Object obj10 = this.j;
                                if (obj10 instanceof dxjf) {
                                    synchronized (obj10) {
                                        obj4 = this.j;
                                        if (obj4 instanceof dxjf) {
                                            dxio c = dxjc.c(this.b.f());
                                            Application a = this.b.a.a();
                                            dxjg.e(a);
                                            Intent putExtra = new Intent(a, NavigationService.class).putExtra("abortcurrentsession", true);
                                            dxjg.f(putExtra);
                                            Object obj11 = this.i;
                                            if (obj11 instanceof dxjf) {
                                                synchronized (obj11) {
                                                    obj7 = this.i;
                                                    if (obj7 instanceof dxjf) {
                                                        Application a2 = this.b.a.a();
                                                        dxjg.e(a2);
                                                        executor2 = sV;
                                                        this.b.pC();
                                                        obj7 = new arzu(a2);
                                                        dxjc.d(this.i, obj7);
                                                        this.i = obj7;
                                                    } else {
                                                        executor2 = sV;
                                                    }
                                                }
                                                obj11 = obj7;
                                            } else {
                                                executor2 = sV;
                                            }
                                            arzu arzuVar = (arzu) obj11;
                                            arzw e = e();
                                            mwo cC = this.b.cC();
                                            asio qF = this.b.qF();
                                            fyu fyuVar = this.b;
                                            Object obj12 = fyuVar.dU;
                                            if (obj12 instanceof dxjf) {
                                                synchronized (obj12) {
                                                    obj6 = fyuVar.dU;
                                                    executor = sU;
                                                    if (obj6 instanceof dxjf) {
                                                        Application a3 = fyuVar.a.a();
                                                        dxjg.e(a3);
                                                        btrmVar = rz;
                                                        obj6 = new arzh(a3.getResources().getColor(R.color.qu_google_green_500));
                                                        dxjc.d(fyuVar.dU, obj6);
                                                        fyuVar.dU = obj6;
                                                    } else {
                                                        btrmVar = rz;
                                                    }
                                                }
                                                obj12 = obj6;
                                            } else {
                                                btrmVar = rz;
                                                executor = sU;
                                            }
                                            arzh arzhVar = (arzh) obj12;
                                            Service service = this.c;
                                            aukk qG = this.b.qG();
                                            ausy cp = this.b.cp();
                                            fyu fyuVar2 = this.b;
                                            Object obj13 = fyuVar2.dV;
                                            if (obj13 instanceof dxjf) {
                                                synchronized (obj13) {
                                                    obj5 = fyuVar2.dV;
                                                    if (obj5 instanceof dxjf) {
                                                        Application a4 = fyuVar2.a.a();
                                                        dxjg.e(a4);
                                                        fyuVar2.pC();
                                                        obj5 = new crba(a4);
                                                        dxjc.d(fyuVar2.dV, obj5);
                                                        fyuVar2.dV = obj5;
                                                    }
                                                }
                                                obj13 = obj5;
                                            }
                                            crba crbaVar = (crba) obj13;
                                            this.b.pC();
                                            Executor sU2 = this.b.a.sU();
                                            dxjg.e(sU2);
                                            obj4 = new arzd(c, putExtra, arzuVar, e, cC, qF, arzhVar, service, qG, cp, sU2);
                                            dxjc.d(this.j, obj4);
                                            this.j = obj4;
                                        } else {
                                            btrmVar = rz;
                                            executor = sU;
                                            executor2 = sV;
                                        }
                                    }
                                    obj10 = obj4;
                                } else {
                                    btrmVar = rz;
                                    executor = sU;
                                    executor2 = sV;
                                }
                                obj3 = new arzg(rR, (arzd) obj10, this.b.qF(), this.b.cC());
                                dxjc.d(this.k, obj3);
                                this.k = obj3;
                            } else {
                                btrmVar = rz;
                                executor = sU;
                                executor2 = sV;
                            }
                        }
                        obj9 = obj3;
                    } else {
                        btrmVar = rz;
                        executor = sU;
                        executor2 = sV;
                    }
                    arzg arzgVar = (arzg) obj9;
                    Object obj14 = this.o;
                    if (obj14 instanceof dxjf) {
                        synchronized (obj14) {
                            obj2 = this.o;
                            if (obj2 instanceof dxjf) {
                                arzw e2 = e();
                                btvo rp = this.b.a.rp();
                                dxjg.e(rp);
                                atvu atvuVar = new atvu(this.b.n(), this.b.V(), this.b.f(), this.af, this.b.K(), this.b.al(), this.b.hN(), this.b.jm(), this.b.kb(), this.b.o(), h(), this.b.oG(), i());
                                atvj atvjVar = new atvj(this.af, this.b.n(), this.b.V(), this.b.f(), this.b.K(), this.b.al(), this.b.hN(), this.b.kb(), this.b.o(), h(), i());
                                dzsj dzsjVar = this.n;
                                if (dzsjVar == null) {
                                    dzsjVar = new fxk(this, 2);
                                    this.n = dzsjVar;
                                }
                                atsy atsyVar = new atsy(dzsjVar, this.b.n(), this.b.f(), this.b.cE(), this.b.lm(), this.b.K(), this.af, this.b.V(), this.b.al(), this.b.hN(), this.b.cD(), this.b.kb(), this.b.o(), h(), this.b.jm(), i());
                                atvm atvmVar = new atvm(this.b.n(), this.b.V(), this.b.f(), this.b.K(), this.b.al(), this.b.hN(), this.af, this.b.kb(), this.b.o(), h(), i());
                                atui atuiVar = new atui(this.b.n(), this.b.V(), this.b.f(), this.af, this.b.K(), this.b.al(), this.b.hN(), this.b.jm(), this.b.kb(), this.b.o(), h(), i());
                                atum atumVar = new atum(this.b.n(), this.b.V(), this.b.f(), this.b.K(), this.b.al(), this.b.hN(), this.af, this.b.kb(), this.b.o(), h(), i());
                                atuo atuoVar = new atuo(this.b.n(), this.b.V(), this.b.f(), this.b.K(), this.b.al(), this.b.hN(), this.af, this.b.kb(), this.b.o(), h(), i());
                                this.b.n();
                                this.b.V();
                                this.b.f();
                                this.b.K();
                                this.b.al();
                                this.b.hN();
                                this.b.kb();
                                this.b.o();
                                h();
                                i();
                                this.b.n();
                                this.b.V();
                                this.b.f();
                                this.b.K();
                                this.b.al();
                                this.b.hN();
                                this.b.kb();
                                this.b.o();
                                h();
                                i();
                                this.b.cA();
                                atom atomVar = new atom(rp, atvuVar, atvjVar, atsyVar, atvmVar, atuiVar, atumVar, atuoVar);
                                mwo cC2 = this.b.cC();
                                Service service2 = this.c;
                                cjqy tr = this.b.a.tr();
                                dxjg.e(tr);
                                obj2 = new arzs(e2, atomVar, cC2, service2, tr, this.b.qG(), this.b.cp());
                                dxjc.d(this.o, obj2);
                                this.o = obj2;
                            }
                        }
                        obj14 = obj2;
                    }
                    btwd sb = this.b.a.sb();
                    dxjg.e(sb);
                    obj = new arzn(btrmVar, executor, executor2, arzgVar, (arzs) obj14, sb);
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj8 = obj;
        }
        return (arzn) obj8;
    }

    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, buwv] */
    private final crnz k() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof dxjf) {
                    Context b = this.b.a.b();
                    dxjg.e(b);
                    btpc sz = this.b.a.sz();
                    dxjg.e(sz);
                    crct dX = this.b.dX();
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    btvo rp = this.b.a.rp();
                    dxjg.e(rp);
                    String d = this.b.a.d();
                    dxjg.e(d);
                    dehq tj = this.b.a.tj();
                    dxjg.e(tj);
                    dehq tg = this.b.a.tg();
                    dxjg.e(tg);
                    akfa rK = this.b.a.rK();
                    dxjg.e(rK);
                    ckcw rU = this.b.a.rU();
                    dxjg.e(rU);
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    ?? pD = this.b.pD();
                    ahjq wf = this.b.wf();
                    mwo cC = this.b.cC();
                    dbpy<Object> dbpyVar = dbpy.a;
                    btyy y = this.b.a.y();
                    dxjg.e(y);
                    obj = new crnz(b, sz, dX, rB, rp, d, tj, tg, rK, rU, rR, rz, pD, wf, cC, dbpyVar, y, this.b.pE(), dbsg.i(this.b.cG()));
                    dxjc.d(this.s, obj);
                    this.s = obj;
                }
            }
            obj2 = obj;
        }
        return (crnz) obj2;
    }

    private final crle l() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    ckcw rU = this.b.a.rU();
                    dxjg.e(rU);
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    fyu fyuVar = this.b;
                    dzsj dzsjVar = fyuVar.dX;
                    if (dzsjVar == null) {
                        dzsjVar = new fxy(fyuVar, 739);
                        fyuVar.dX = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    fyu fyuVar2 = this.b;
                    dzsj dzsjVar2 = fyuVar2.dY;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new fxy(fyuVar2, 740);
                        fyuVar2.dY = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    Application a = this.b.a.a();
                    dxjg.e(a);
                    Executor sV = this.b.a.sV();
                    dxjg.e(sV);
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    crrj crrjVar = new crrj(a, sV, rR);
                    dzsj<Application> m = this.b.m();
                    dzsj<cqat> K = this.b.K();
                    dzsj<btpc> cx = this.b.cx();
                    fyu fyuVar3 = this.b;
                    dzsj dzsjVar3 = fyuVar3.dZ;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new fxy(fyuVar3, 741);
                        fyuVar3.dZ = dzsjVar3;
                    }
                    crkw crkwVar = new crkw(m, K, cx, dzsjVar3, this.b.eX(), this.b.n(), this.b.R(), this.b.al(), this.b.iO());
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    bttf aL = this.b.a.aL();
                    dxjg.e(aL);
                    bvrb tn = this.b.a.tn();
                    dxjg.e(tn);
                    duov sk = this.b.a.sk();
                    dxjg.e(sk);
                    obj = new crle(rU, rz, c, c2, crrjVar, crkwVar, rB, aL, tn, sk, this.b.dp());
                    dxjc.d(this.t, obj);
                    this.t = obj;
                }
            }
            obj2 = obj;
        }
        return (crle) obj2;
    }

    private final crlg m() {
        return new crlg(this.b.n(), this.b.po(), this.b.oH());
    }

    private final dzsj<crlb> n() {
        dzsj<crlb> dzsjVar = this.v;
        if (dzsjVar == null) {
            fxk fxkVar = new fxk(this, 3);
            this.v = fxkVar;
            return fxkVar;
        }
        return dzsjVar;
    }

    private final crms o() {
        bwqv rD = this.b.a.rD();
        dxjg.e(rD);
        return new crms(rD);
    }

    private final crmt p() {
        bwqv rD = this.b.a.rD();
        dxjg.e(rD);
        Context b = this.b.a.b();
        dxjg.e(b);
        Executor sU = this.b.a.sU();
        dxjg.e(sU);
        Executor sV = this.b.a.sV();
        dxjg.e(sV);
        dxio c = dxjc.c(this.b.cD());
        cqat rR = this.b.a.rR();
        dxjg.e(rR);
        return new crmt(rD, b, sU, sV, c, rR);
    }

    private final croa q() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.z;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.z;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    crox dZ = this.b.dZ();
                    cjqy tr = this.b.a.tr();
                    dxjg.e(tr);
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    crow jO = this.b.jO();
                    Object obj5 = this.x;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.x;
                            if (obj3 instanceof dxjf) {
                                pnn jL = this.b.jL();
                                bvjj rB2 = this.b.a.rB();
                                dxjg.e(rB2);
                                dkiy sc = this.b.a.sc();
                                dxjg.e(sc);
                                asbm asbmVar = new asbm(jL, rB2, sc);
                                dxjc.d(this.x, asbmVar);
                                this.x = asbmVar;
                                obj3 = asbmVar;
                            }
                        }
                        obj5 = obj3;
                    }
                    asbm asbmVar2 = (asbm) obj5;
                    Object obj6 = this.y;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj2 = this.y;
                            if (obj2 instanceof dxjf) {
                                cqat rR2 = this.b.a.rR();
                                dxjg.e(rR2);
                                Executor sV = this.b.a.sV();
                                dxjg.e(sV);
                                obj2 = new asbo(rR2, sV, this.b.oI());
                                dxjc.d(this.y, obj2);
                                this.y = obj2;
                            }
                        }
                        obj6 = obj2;
                    }
                    obj = new croa(rz, rR, dZ, tr, rB, jO, dcep.C(asbmVar2, (asbo) obj6), this.b.vi());
                    dxjc.d(this.z, obj);
                    this.z = obj;
                }
            }
            obj4 = obj;
        }
        return (croa) obj4;
    }

    private final Object r() {
        Object obj;
        Object obj2 = this.A;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.A;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    btvo rp = this.b.a.rp();
                    dxjg.e(rp);
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    crlm crlmVar = new crlm(rz, rB, rp, rR);
                    dxjc.d(this.A, crlmVar);
                    this.A = crlmVar;
                    obj = crlmVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final crjw s() {
        Object obj;
        Object obj2 = this.B;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.B;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    crgt e = this.b.e();
                    mwo cC = this.b.cC();
                    cjqy tr = this.b.a.tr();
                    dxjg.e(tr);
                    crlb a = a();
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    crlg m = m();
                    dzsj<btrm> n = this.b.n();
                    dzsj<pnn> lZ = this.b.lZ();
                    dzsj<btvo> V = this.b.V();
                    dzsj<crlb> n2 = n();
                    dzsj<Executor> di = this.b.di();
                    dzsj dzsjVar = this.w;
                    if (dzsjVar == null) {
                        dzsjVar = new fxk(this, 4);
                        this.w = dzsjVar;
                    }
                    asbg asbgVar = new asbg(n, lZ, V, n2, di, dzsjVar);
                    crms o = o();
                    crmt p = p();
                    bwqv rD = this.b.a.rD();
                    dxjg.e(rD);
                    crmu crmuVar = new crmu(rD);
                    croa q = q();
                    Application a2 = this.b.a.a();
                    dxjg.e(a2);
                    cqat rR2 = this.b.a.rR();
                    dxjg.e(rR2);
                    vzg vzgVar = new vzg(a2, rR2, this.b.cC(), dxjc.c(this.b.aY()));
                    Object r = r();
                    btvo rp = this.b.a.rp();
                    dxjg.e(rp);
                    alhv sr = this.b.sr();
                    Executor pH = this.b.pH();
                    asio qF = this.b.qF();
                    ckcw rU = this.b.a.rU();
                    dxjg.e(rU);
                    asac oE = this.b.oE();
                    obj = r15;
                    crjw crjwVar = new crjw(rz, rB, e, new Handler(), cC, tr, a, rR, m, asbgVar, o, p, crmuVar, q, vzgVar, (crlm) r, rp, sr, pH, qF, rU, oE);
                    dxjc.d(this.B, obj);
                    this.B = obj;
                }
            }
            obj2 = obj;
        }
        return (crjw) obj2;
    }

    private final crlp t() {
        Object obj;
        Object obj2 = this.C;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.C;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    obj = new crlp(rz);
                    dxjc.d(this.C, obj);
                    this.C = obj;
                }
            }
            obj2 = obj;
        }
        return (crlp) obj2;
    }

    private final crkm u() {
        Object obj;
        Object obj2;
        Object obj3 = this.D;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.D;
                if (obj instanceof dxjf) {
                    Application a = this.b.a.a();
                    dxjg.e(a);
                    fyu fyuVar = this.b;
                    dzsj dzsjVar = fyuVar.dW;
                    if (dzsjVar == null) {
                        dzsjVar = new fxy(fyuVar, 737);
                        fyuVar.dW = dzsjVar;
                    }
                    dxjc.c(dzsjVar);
                    dxio c = dxjc.c(this.b.f());
                    ckcw rU = this.b.a.rU();
                    dxjg.e(rU);
                    ckrh fh = this.b.fh();
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    vsf g = this.b.g();
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    crka g2 = g();
                    btwd sb = this.b.a.sb();
                    dxjg.e(sb);
                    Object obj4 = this.r;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.r;
                            if (obj2 instanceof dxjf) {
                                cqat rR2 = this.b.a.rR();
                                dxjg.e(rR2);
                                btrm rz2 = this.b.a.rz();
                                dxjg.e(rz2);
                                bvjj rB = this.b.a.rB();
                                dxjg.e(rB);
                                crkp crkpVar = new crkp(rB, rz2, rR2);
                                dxjc.d(this.r, crkpVar);
                                this.r = crkpVar;
                                obj2 = crkpVar;
                            }
                        }
                        obj4 = obj2;
                    }
                    mwo cC = this.b.cC();
                    crnz k = k();
                    vxm vxmVar = new vxm();
                    crle l = l();
                    crjw s = s();
                    bvjj rB2 = this.b.a.rB();
                    dxjg.e(rB2);
                    crlp t = t();
                    vxo dw = this.b.dw();
                    asio qF = this.b.qF();
                    Object r = r();
                    cjqy tr = this.b.a.tr();
                    dxjg.e(tr);
                    bvrb tn = this.b.a.tn();
                    dxjg.e(tn);
                    obj = new crkm(a, c, rU, fh, rR, g, rz, g2, sb, (crkp) obj4, cC, k, vxmVar, l, s, rB2, t, dw, qF, (crlm) r, tr, tn, this.b.oE(), dxjc.c(this.b.cx()), this.b.pI());
                    dxjc.d(this.D, obj);
                    this.D = obj;
                }
            }
            obj3 = obj;
        }
        return (crkm) obj3;
    }

    private final crlr v() {
        Object obj;
        Object obj2 = this.H;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.H;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    obj = new crlr(rz);
                    dxjc.d(this.H, obj);
                    this.H = obj;
                }
            }
            obj2 = obj;
        }
        return (crlr) obj2;
    }

    private final crcx w() {
        Object obj;
        Object obj2 = this.J;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.J;
                if (obj instanceof dxjf) {
                    dxio c = dxjc.c(this.b.f());
                    crct dX = this.b.dX();
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    crer dY = this.b.dY();
                    dxio c2 = dxjc.c(this.b.iO());
                    arne jp = this.b.jp();
                    dxjg.e(this.b.a.rB());
                    Executor sU = this.b.a.sU();
                    dxjg.e(sU);
                    obj = new crcx(c, dX, rz, dY, c2, jp, sU);
                    dxjc.d(this.J, obj);
                    this.J = obj;
                }
            }
            obj2 = obj;
        }
        return (crcx) obj2;
    }

    private final dcdc<crgy> x() {
        crjy crjyVar;
        croo crooVar;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8 = this.O;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                try {
                    Object obj9 = this.O;
                    if (obj9 instanceof dxjf) {
                        Object obj10 = this.F;
                        if (obj10 instanceof dxjf) {
                            synchronized (obj10) {
                                obj7 = this.F;
                                if (obj7 instanceof dxjf) {
                                    btpa rx = this.b.a.rx();
                                    dxjg.e(rx);
                                    dxio c = dxjc.c(this.b.k());
                                    ckcw rU = this.b.a.rU();
                                    dxjg.e(rU);
                                    obj7 = new crgg(rx, c, rU);
                                    dxjc.d(this.F, obj7);
                                    this.F = obj7;
                                }
                            }
                            obj10 = obj7;
                        }
                        crgg crggVar = (crgg) obj10;
                        Object obj11 = this.G;
                        if (obj11 instanceof dxjf) {
                            synchronized (obj11) {
                                obj6 = this.G;
                                if (obj6 instanceof dxjf) {
                                    dxio c2 = dxjc.c(this.b.k());
                                    ckcw rU2 = this.b.a.rU();
                                    dxjg.e(rU2);
                                    obj6 = new crgl(c2, rU2);
                                    dxjc.d(this.G, obj6);
                                    this.G = obj6;
                                }
                            }
                            obj11 = obj6;
                        }
                        crgl crglVar = (crgl) obj11;
                        croa q = q();
                        crgt e = this.b.e();
                        Object obj12 = this.I;
                        if (obj12 instanceof dxjf) {
                            synchronized (obj12) {
                                obj5 = this.I;
                                if (obj5 instanceof dxjf) {
                                    btrm rz = this.b.a.rz();
                                    dxjg.e(rz);
                                    obj5 = new crjy(rz, dxjc.c(this.b.k()), this.b.cC(), v(), l(), t(), k());
                                    dxjc.d(this.I, obj5);
                                    this.I = obj5;
                                }
                            }
                            obj12 = obj5;
                        }
                        crjy crjyVar2 = (crjy) obj12;
                        crcx w = w();
                        Object obj13 = this.K;
                        if (obj13 instanceof dxjf) {
                            synchronized (obj13) {
                                obj4 = this.K;
                                if (obj4 instanceof dxjf) {
                                    dxio c3 = dxjc.c(this.b.jo());
                                    dehq tf = this.b.a.tf();
                                    dxjg.e(tf);
                                    Executor sU = this.b.a.sU();
                                    dxjg.e(sU);
                                    btrm rz2 = this.b.a.rz();
                                    dxjg.e(rz2);
                                    cjqq tp = this.b.a.tp();
                                    dxjg.e(tp);
                                    cjqy tr = this.b.a.tr();
                                    dxjg.e(tr);
                                    dbsg i = dbsg.i(this.b.cG());
                                    brlz qY = this.b.qY();
                                    asio qF = this.b.qF();
                                    cjyh jq = this.b.jq();
                                    arnd kG = this.b.kG();
                                    dxio c4 = dxjc.c(this.b.iT());
                                    akfa rK = this.b.a.rK();
                                    dxjg.e(rK);
                                    dxjg.e(this.b.a.rp());
                                    obj4 = new asam(c3, tf, sU, rz2, tp, tr, i, qY, qF, jq, kG, c4, rK);
                                    dxjc.d(this.K, obj4);
                                    this.K = obj4;
                                }
                            }
                            obj13 = obj4;
                        }
                        asam asamVar = (asam) obj13;
                        crlb a = a();
                        Object obj14 = this.L;
                        if (obj14 instanceof dxjf) {
                            synchronized (obj14) {
                                obj3 = this.L;
                                if (obj3 instanceof dxjf) {
                                    Application a2 = this.b.a.a();
                                    dxjg.e(a2);
                                    btrm rz3 = this.b.a.rz();
                                    dxjg.e(rz3);
                                    obj3 = new croo(a2, rz3);
                                    dxjc.d(this.L, obj3);
                                    this.L = obj3;
                                }
                            }
                            obj14 = obj3;
                        }
                        croo crooVar2 = (croo) obj14;
                        Object obj15 = this.M;
                        if (obj15 instanceof dxjf) {
                            synchronized (obj15) {
                                obj2 = this.M;
                                if (obj2 instanceof dxjf) {
                                    btrm rz4 = this.b.a.rz();
                                    dxjg.e(rz4);
                                    obj2 = new crsd(rz4);
                                    dxjc.d(this.M, obj2);
                                    this.M = obj2;
                                }
                            }
                            obj15 = obj2;
                        }
                        crsd crsdVar = (crsd) obj15;
                        crlp t = t();
                        Object obj16 = this.N;
                        if (obj16 instanceof dxjf) {
                            synchronized (obj16) {
                                obj = this.N;
                                if (obj instanceof dxjf) {
                                    btrm rz5 = this.b.a.rz();
                                    dxjg.e(rz5);
                                    crooVar = crooVar2;
                                    cqat rR = this.b.a.rR();
                                    dxjg.e(rR);
                                    crjyVar = crjyVar2;
                                    dxjg.e(this.b.a.rB());
                                    obj = new crsc(rz5, rR);
                                    dxjc.d(this.N, obj);
                                    this.N = obj;
                                } else {
                                    crjyVar = crjyVar2;
                                    crooVar = crooVar2;
                                }
                            }
                            obj16 = obj;
                        } else {
                            crjyVar = crjyVar2;
                            crooVar = crooVar2;
                        }
                        crsc crscVar = (crsc) obj16;
                        crlr v = v();
                        crsh pA = this.b.pA();
                        crsn jk = this.b.jk();
                        crnz k = k();
                        try {
                            dccx dccxVar = new dccx();
                            dccxVar.g(q);
                            dccxVar.g(crggVar);
                            dccxVar.g(k);
                            dccxVar.g(crglVar);
                            dccxVar.g(asamVar);
                            dccxVar.g(e);
                            dccxVar.g(w);
                            dccxVar.g(t);
                            dccxVar.g(a);
                            dccxVar.g(crscVar);
                            dccxVar.g(crsdVar);
                            dccxVar.g(crjyVar);
                            dccxVar.g(v);
                            dccxVar.g(crooVar);
                            dccxVar.g(pA);
                            dccxVar.g(jk);
                            obj9 = dccxVar.f();
                            dxjg.f(obj9);
                            dxjc.d(this.O, obj9);
                            this.O = obj9;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    obj8 = obj9;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return (dcdc) obj8;
    }

    private final criw y() {
        crlb crlbVar;
        arpm arpmVar;
        Object obj;
        Object obj2;
        cqat rR = this.b.a.rR();
        dxjg.e(rR);
        btrm rz = this.b.a.rz();
        dxjg.e(rz);
        bvrb tn = this.b.a.tn();
        dxjg.e(tn);
        crjk crjkVar = new crjk();
        crlb a = a();
        arpm qv = this.b.qv();
        Object obj3 = this.V;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.V;
                if (obj instanceof dxjf) {
                    bvjj rB = this.b.a.rB();
                    dxjg.e(rB);
                    arpn dV = this.b.dV();
                    Object obj4 = this.U;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.U;
                            if (obj2 instanceof dxjf) {
                                btrm rz2 = this.b.a.rz();
                                dxjg.e(rz2);
                                cqat rR2 = this.b.a.rR();
                                dxjg.e(rR2);
                                arpmVar = qv;
                                btwd sb = this.b.a.sb();
                                dxjg.e(sb);
                                crlbVar = a;
                                obj2 = new crjp(rz2, rR2, sb, this.b.pI());
                                dxjc.d(this.U, obj2);
                                this.U = obj2;
                            } else {
                                crlbVar = a;
                                arpmVar = qv;
                            }
                        }
                        obj4 = obj2;
                    } else {
                        crlbVar = a;
                        arpmVar = qv;
                    }
                    obj = new crjn(rB, dV, (crjp) obj4);
                    dxjc.d(this.V, obj);
                    this.V = obj;
                } else {
                    crlbVar = a;
                    arpmVar = qv;
                }
            }
            obj3 = obj;
        } else {
            crlbVar = a;
            arpmVar = qv;
        }
        crlp t = t();
        cjqy tr = this.b.a.tr();
        dxjg.e(tr);
        return new criw(rR, rz, tn, crjkVar, crlbVar, arpmVar, (crjn) obj3, t, tr);
    }

    private final crji z() {
        Object obj;
        mwo mwoVar;
        Object obj2 = this.W;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.W;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    crgt e = this.b.e();
                    crka g = g();
                    crlb a = a();
                    criw y = y();
                    criw y2 = y();
                    mwo cC = this.b.cC();
                    dzsj<Application> m = this.b.m();
                    dzsj<btrm> n = this.b.n();
                    dzsj<bvjj> aw = this.b.aw();
                    dzsj<crlb> n2 = n();
                    dzsj<vxa> fq = this.b.fq();
                    dzsj<ahjq> k = this.b.k();
                    dzsj<srv> ry = this.b.ry();
                    dzsj<bvrb> R = this.b.R();
                    fyu fyuVar = this.b;
                    dzsj dzsjVar = fyuVar.ea;
                    if (dzsjVar == null) {
                        mwoVar = cC;
                        dzsjVar = new fxy(fyuVar, 742);
                        fyuVar.ea = dzsjVar;
                    } else {
                        mwoVar = cC;
                    }
                    obj = new crji(rz, e, g, a, y, y2, mwoVar, new crje(m, n, aw, n2, fq, k, ry, R, dzsjVar), m(), p(), o(), this.b.pH());
                    dxjc.d(this.W, obj);
                    this.W = obj;
                }
            }
            obj2 = obj;
        }
        return (crji) obj2;
    }

    public final crlb a() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    bvrb tn = this.b.a.tn();
                    dxjg.e(tn);
                    cqat rR = this.b.a.rR();
                    dxjg.e(rR);
                    obj = new crlb(rz, tn, rR, this.b.qS());
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (crlb) obj2;
    }

    public final pot b() {
        btvo rp = this.b.a.rp();
        dxjg.e(rp);
        bvjj rB = this.b.a.rB();
        dxjg.e(rB);
        return pou.b(rp, rB);
    }

    public final crgj c() {
        Object obj;
        Application application;
        btrm btrmVar;
        crkm crkmVar;
        Object obj2;
        Object obj3;
        bvrb bvrbVar;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9 = this.Z;
        if (obj9 instanceof dxjf) {
            synchronized (obj9) {
                obj = this.Z;
                if (obj instanceof dxjf) {
                    Application a = this.b.a.a();
                    dxjg.e(a);
                    btrm rz = this.b.a.rz();
                    dxjg.e(rz);
                    dxjg.e(this.b.a.C());
                    crkm u = u();
                    Object obj10 = this.T;
                    if (obj10 instanceof dxjf) {
                        synchronized (obj10) {
                            obj3 = this.T;
                            if (obj3 instanceof dxjf) {
                                bvrb tn = this.b.a.tn();
                                dxjg.e(tn);
                                Object obj11 = this.E;
                                if (obj11 instanceof dxjf) {
                                    synchronized (obj11) {
                                        obj8 = this.E;
                                        if (obj8 instanceof dxjf) {
                                            btrm rz2 = this.b.a.rz();
                                            dxjg.e(rz2);
                                            dxio c = dxjc.c(this.b.f());
                                            pnn jL = this.b.jL();
                                            Executor sU = this.b.a.sU();
                                            dxjg.e(sU);
                                            bvjj rB = this.b.a.rB();
                                            dxjg.e(rB);
                                            cjqq tp = this.b.a.tp();
                                            dxjg.e(tp);
                                            obj8 = new asbj(rz2, c, jL, sU, rB, tp, b());
                                            dxjc.d(this.E, obj8);
                                            this.E = obj8;
                                        }
                                    }
                                    obj11 = obj8;
                                }
                                dcep B = dcep.B((asbj) obj11);
                                dcdc<crgy> x = x();
                                crkm u2 = u();
                                Object obj12 = this.P;
                                if (obj12 instanceof dxjf) {
                                    synchronized (obj12) {
                                        obj7 = this.P;
                                        if (obj7 instanceof dxjf) {
                                            dxjg.e(this.b.a.a());
                                            btvo rp = this.b.a.rp();
                                            dxjg.e(rp);
                                            cqat rR = this.b.a.rR();
                                            dxjg.e(rR);
                                            dxjg.e(this.b.a.sU());
                                            btrm rz3 = this.b.a.rz();
                                            dxjg.e(rz3);
                                            bvjj rB2 = this.b.a.rB();
                                            dxjg.e(rB2);
                                            ckcw rU = this.b.a.rU();
                                            dxjg.e(rU);
                                            crsh pA = this.b.pA();
                                            pag bx = this.b.bx();
                                            crkmVar = u;
                                            Executor sV = this.b.a.sV();
                                            dxjg.e(sV);
                                            btrmVar = rz;
                                            ckcw rU2 = this.b.a.rU();
                                            dxjg.e(rU2);
                                            application = a;
                                            buvq buvqVar = this.ag;
                                            if (buvqVar == null) {
                                                dxio c2 = dxjc.c(this.b.h());
                                                bvrbVar = tn;
                                                bvrb tn2 = this.b.a.tn();
                                                dxjg.e(tn2);
                                                buvqVar = buvs.b(buvr.b(c2, tn2));
                                                this.ag = buvqVar;
                                            } else {
                                                bvrbVar = tn;
                                            }
                                            obj7 = new crsi(rp, rR, rz3, rB2, rU, pA, new crsq(bx, sV, rU2, buvqVar));
                                            dxjc.d(this.P, obj7);
                                            this.P = obj7;
                                        } else {
                                            bvrbVar = tn;
                                            application = a;
                                            btrmVar = rz;
                                            crkmVar = u;
                                        }
                                    }
                                    obj12 = obj7;
                                } else {
                                    bvrbVar = tn;
                                    application = a;
                                    btrmVar = rz;
                                    crkmVar = u;
                                }
                                crsi crsiVar = (crsi) obj12;
                                crjw s = s();
                                Object obj13 = this.Q;
                                if (obj13 instanceof dxjf) {
                                    synchronized (obj13) {
                                        obj6 = this.Q;
                                        if (obj6 instanceof dxjf) {
                                            obj6 = new crga(s(), w());
                                            dxjc.d(this.Q, obj6);
                                            this.Q = obj6;
                                        }
                                    }
                                    obj13 = obj6;
                                }
                                crga crgaVar = (crga) obj13;
                                Object obj14 = this.R;
                                if (obj14 instanceof dxjf) {
                                    synchronized (obj14) {
                                        obj5 = this.R;
                                        if (obj5 instanceof dxjf) {
                                            Application a2 = this.b.a.a();
                                            dxjg.e(a2);
                                            bvjj rB3 = this.b.a.rB();
                                            dxjg.e(rB3);
                                            btrm rz4 = this.b.a.rz();
                                            dxjg.e(rz4);
                                            cqat rR2 = this.b.a.rR();
                                            dxjg.e(rR2);
                                            bvrb tn3 = this.b.a.tn();
                                            dxjg.e(tn3);
                                            akfa rK = this.b.a.rK();
                                            dxjg.e(rK);
                                            Executor sU2 = this.b.a.sU();
                                            dxjg.e(sU2);
                                            Executor sV2 = this.b.a.sV();
                                            dxjg.e(sV2);
                                            obj5 = new crfy(a2, rB3, rz4, rR2, tn3, rK, sU2, sV2);
                                            dxjc.d(this.R, obj5);
                                            this.R = obj5;
                                        }
                                    }
                                    obj14 = obj5;
                                }
                                crfy crfyVar = (crfy) obj14;
                                Object obj15 = this.S;
                                if (obj15 instanceof dxjf) {
                                    synchronized (obj15) {
                                        obj4 = this.S;
                                        if (obj4 instanceof dxjf) {
                                            btrm rz5 = this.b.a.rz();
                                            dxjg.e(rz5);
                                            cqat rR3 = this.b.a.rR();
                                            dxjg.e(rR3);
                                            ckcw rU3 = this.b.a.rU();
                                            dxjg.e(rU3);
                                            obj4 = new croe(rz5, rR3, rU3, dbsg.i(this.b.cG()), this.b.jq());
                                            dxjc.d(this.S, obj4);
                                            this.S = obj4;
                                        }
                                    }
                                    obj15 = obj4;
                                }
                                dccx dccxVar = new dccx();
                                dccxVar.g(s);
                                dccxVar.i(x);
                                dccxVar.g(u2);
                                dccxVar.g(crgaVar);
                                dccxVar.g(crfyVar);
                                dccxVar.g((croe) obj15);
                                dccxVar.g(crsiVar);
                                dccxVar.i(B);
                                obj3 = new crnc(bvrbVar, dccxVar.f());
                                dxjc.d(this.T, obj3);
                                this.T = obj3;
                            } else {
                                application = a;
                                btrmVar = rz;
                                crkmVar = u;
                            }
                        }
                        obj10 = obj3;
                    } else {
                        application = a;
                        btrmVar = rz;
                        crkmVar = u;
                    }
                    crgy crgyVar = (crgy) obj10;
                    crji z = z();
                    Object obj16 = this.X;
                    if (obj16 instanceof dxjf) {
                        synchronized (obj16) {
                            obj2 = this.X;
                            if (obj2 instanceof dxjf) {
                                bvrb tn4 = this.b.a.tn();
                                dxjg.e(tn4);
                                dcdc<crgy> x2 = x();
                                crji z2 = z();
                                dccx dccxVar2 = new dccx();
                                dccxVar2.i(x2);
                                dccxVar2.g(z2);
                                crnc crncVar = new crnc(tn4, dccxVar2.f());
                                dxjc.d(this.X, crncVar);
                                this.X = crncVar;
                                obj2 = crncVar;
                            }
                        }
                        obj16 = obj2;
                    }
                    crgv A = A();
                    ckcw rU4 = this.b.a.rU();
                    dxjg.e(rU4);
                    obj = new crgj(application, btrmVar, crkmVar, crgyVar, z, (crgy) obj16, A, rU4, this.b.pI());
                    dxjc.d(this.Z, obj);
                    this.Z = obj;
                }
            }
            obj9 = obj;
        }
        return (crgj) obj9;
    }

    @Override // defpackage.crgu
    public final void d(NavigationService navigationService) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        navigationService.a = this.b.pB();
        Object obj8 = this.ad;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                obj = this.ad;
                if (obj instanceof dxjf) {
                    bvrb tn = this.b.a.tn();
                    dxjg.e(tn);
                    Object obj9 = this.d;
                    if (obj9 instanceof dxjf) {
                        synchronized (obj9) {
                            obj7 = this.d;
                            if (obj7 instanceof dxjf) {
                                btvo rp = this.b.a.rp();
                                dxjg.e(rp);
                                bqyf ei = this.b.ei();
                                dzsj<btrm> n = this.b.n();
                                dzsj<btvo> V = this.b.V();
                                dzsj<btwd> ny = this.b.ny();
                                dzsj<bvrb> R = this.b.R();
                                fyu fyuVar = this.b;
                                dzsj dzsjVar = fyuVar.dT;
                                if (dzsjVar == null) {
                                    dzsjVar = new fxy(fyuVar, 736);
                                    fyuVar.dT = dzsjVar;
                                }
                                obj7 = new crrm(rp, ei, new crrp(n, V, ny, R, dzsjVar), this.b.to());
                                dxjc.d(this.d, obj7);
                                this.d = obj7;
                            }
                        }
                        obj9 = obj7;
                    }
                    crrm crrmVar = (crrm) obj9;
                    crss crssVar = new crss(this.b.dW(), e());
                    dcen O = dcep.O(3);
                    Object obj10 = this.g;
                    if (obj10 instanceof dxjf) {
                        synchronized (obj10) {
                            obj6 = this.g;
                            if (obj6 instanceof dxjf) {
                                asbl asblVar = (asbl) f();
                                obj6 = dcmr.a;
                                dxjg.f(obj6);
                                dxjc.d(this.g, obj6);
                                this.g = obj6;
                            }
                        }
                        obj10 = obj6;
                    }
                    O.i((Set) obj10);
                    Object obj11 = this.ab;
                    if (obj11 instanceof dxjf) {
                        synchronized (obj11) {
                            obj3 = this.ab;
                            if (obj3 instanceof dxjf) {
                                crka g = g();
                                arzn j = j();
                                Object obj12 = this.q;
                                if (obj12 instanceof dxjf) {
                                    synchronized (obj12) {
                                        obj5 = this.q;
                                        if (obj5 instanceof dxjf) {
                                            btwd sb = this.b.a.sb();
                                            dxjg.e(sb);
                                            obj5 = new crgw(sb, this.b.dX());
                                            dxjc.d(this.q, obj5);
                                            this.q = obj5;
                                        }
                                    }
                                    obj12 = obj5;
                                }
                                crgw crgwVar = (crgw) obj12;
                                crgj c = c();
                                Object obj13 = this.aa;
                                if (obj13 instanceof dxjf) {
                                    synchronized (obj13) {
                                        obj4 = this.aa;
                                        if (obj4 instanceof dxjf) {
                                            btrm rz = this.b.a.rz();
                                            dxjg.e(rz);
                                            obj4 = new crfs(rz, this.b.e(), this.b.qF());
                                            dxjc.d(this.aa, obj4);
                                            this.aa = obj4;
                                        }
                                    }
                                    obj13 = obj4;
                                }
                                dcen dcenVar = new dcen();
                                dcenVar.b(g);
                                dcenVar.b(j);
                                dcenVar.b(crgwVar);
                                dcenVar.b(c);
                                dcenVar.b((crfs) obj13);
                                obj3 = dcenVar.f();
                                dxjg.f(obj3);
                                dxjc.d(this.ab, obj3);
                                this.ab = obj3;
                            }
                        }
                        obj11 = obj3;
                    }
                    O.i((Set) obj11);
                    Object obj14 = this.ac;
                    if (obj14 instanceof dxjf) {
                        synchronized (obj14) {
                            obj2 = this.ac;
                            if (obj2 instanceof dxjf) {
                                cqat rR = this.b.a.rR();
                                dxjg.e(rR);
                                Context b = this.b.a.b();
                                dxjg.e(b);
                                btrm rz2 = this.b.a.rz();
                                dxjg.e(rz2);
                                Executor sV = this.b.a.sV();
                                dxjg.e(sV);
                                dxio c2 = dxjc.c(this.b.p());
                                cqat rR2 = this.b.a.rR();
                                dxjg.e(rR2);
                                obj2 = new asaq(rR, b, rz2, sV, c2, new asas(rR2));
                                dxjc.d(this.ac, obj2);
                                this.ac = obj2;
                            }
                        }
                        obj14 = obj2;
                    }
                    O.b((crgx) obj14);
                    dcep f = O.f();
                    dccx dccxVar = new dccx();
                    dccxVar.g(crssVar);
                    dccxVar.g(crrmVar);
                    dccxVar.i(f);
                    crmz crmzVar = new crmz(tn, dccxVar.f());
                    dxjc.d(this.ad, crmzVar);
                    this.ad = crmzVar;
                    obj = crmzVar;
                }
            }
            obj8 = obj;
        }
        navigationService.b = (crgx) obj8;
        navigationService.c = c();
        navigationService.d = dxjc.c(this.b.f());
        ckcw rU = this.b.a.rU();
        dxjg.e(rU);
        navigationService.e = rU;
        btrm rz3 = this.b.a.rz();
        dxjg.e(rz3);
        navigationService.f = rz3;
        bwqv rD = this.b.a.rD();
        dxjg.e(rD);
        navigationService.g = rD;
        navigationService.h = j();
        bvrb tn2 = this.b.a.tn();
        dxjg.e(tn2);
        navigationService.i = tn2;
        navigationService.j = A();
        dzsj dzsjVar2 = this.ae;
        if (dzsjVar2 == null) {
            dzsjVar2 = new fxk(this, 5);
            this.ae = dzsjVar2;
        }
        navigationService.k = dxjc.c(dzsjVar2);
        navigationService.l = dxjc.c(this.b.cD());
        navigationService.m = this.b.pH();
        navigationService.n = (dbty) f();
    }
}
