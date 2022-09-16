package defpackage;

import android.os.Parcelable;
import android.webkit.WebView;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ftd  reason: default package */
/* loaded from: classes6.dex */
final class ftd implements bvzb {
    final /* synthetic */ ftt b;
    private final WebView c;
    private final dszg d;
    private final dbsg<Parcelable> e;
    private final dcdc<bvwz> f;
    private volatile dzsj<dcdc<bvwd>> n;
    private volatile dzsj<dmim> q;
    private volatile dzsj<dcdc<bvwh>> t;
    private volatile Object g = new dxjf();
    private volatile Object h = new dxjf();
    private volatile Object i = new dxjf();
    private volatile Object j = new dxjf();
    private volatile Object k = new dxjf();
    private volatile Object l = new dxjf();
    private volatile Object m = new dxjf();
    private volatile Object o = new dxjf();
    private volatile Object p = new dxjf();
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    public volatile Object a = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object v = new dxjf();
    private volatile Object w = new dxjf();

    public ftd(ftt fttVar, WebView webView, dszg dszgVar, dbsg<Parcelable> dbsgVar, dcdc<bvwz> dcdcVar) {
        this.b = fttVar;
        this.c = webView;
        this.d = dszgVar;
        this.e = dbsgVar;
        this.f = dcdcVar;
    }

    private final bwan q() {
        Object obj;
        Object obj2 = this.i;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.i;
                if (obj instanceof dxjf) {
                    obj = new bwan();
                    dxjc.d(this.i, obj);
                    this.i = obj;
                }
            }
            obj2 = obj;
        }
        return (bwan) obj2;
    }

    private final Object r() {
        Object obj;
        Object obj2 = this.j;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.j;
                if (obj instanceof dxjf) {
                    obj = new bwas();
                    dxjc.d(this.j, obj);
                    this.j = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final bvze s() {
        Object obj;
        Object obj2 = this.m;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.m;
                if (obj instanceof dxjf) {
                    Executor sU = this.b.eW.a.sU();
                    dxjg.e(sU);
                    bvze bvzeVar = new bvze(sU, a());
                    dxjc.d(this.m, bvzeVar);
                    this.m = bvzeVar;
                    obj = bvzeVar;
                }
            }
            obj2 = obj;
        }
        return (bvze) obj2;
    }

    public final bvys a() {
        Object obj;
        Object obj2 = this.g;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.g;
                if (obj instanceof dxjf) {
                    dehq tg = this.b.eW.a.tg();
                    dxjg.e(tg);
                    Executor sU = this.b.eW.a.sU();
                    dxjg.e(sU);
                    dehn<Void> f = f();
                    cqat rR = this.b.eW.a.rR();
                    dxjg.e(rR);
                    obj = new bvys(tg, sU, f, rR, this.c, e());
                    dxjc.d(this.g, obj);
                    this.g = obj;
                }
            }
            obj2 = obj;
        }
        return (bvys) obj2;
    }

    public final Object b() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    gga wk = this.b.wk();
                    egk i = i();
                    AtomicInteger h = h();
                    double l = l();
                    dxjg.e(this.b.eW.a.rB());
                    obj = new bwbb(wk, i, h, l);
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    public final bvyk c() {
        Object obj;
        Object obj2 = this.s;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.s;
                if (obj instanceof dxjf) {
                    akox ap = this.b.ap();
                    Executor sV = this.b.eW.a.sV();
                    dxjg.e(sV);
                    Executor sU = this.b.eW.a.sU();
                    dxjg.e(sU);
                    obj = new bvyk(ap, sV, sU, this.b.wk(), a());
                    dxjc.d(this.s, obj);
                    this.s = obj;
                }
            }
            obj2 = obj;
        }
        return (bvyk) obj2;
    }

    @Override // defpackage.bvwv
    public final bvws d() {
        return a();
    }

    @Override // defpackage.bvwv
    public final bvwq e() {
        Object obj;
        Object obj2 = this.h;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.h;
                if (obj instanceof dxjf) {
                    ckcw rU = this.b.eW.a.rU();
                    dxjg.e(rU);
                    bvwq bvwqVar = new bvwq(rU, this.d);
                    dxjc.d(this.h, bvwqVar);
                    this.h = bvwqVar;
                    obj = bvwqVar;
                }
            }
            obj2 = obj;
        }
        return (bvwq) obj2;
    }

    @Override // defpackage.bvwv
    public final dehn<Void> f() {
        return q().b;
    }

    @Override // defpackage.bvwv
    public final dspd g() {
        dspd h = ((bwas) r()).h();
        dxjg.f(h);
        return h;
    }

    @Override // defpackage.bvwv
    public final AtomicInteger h() {
        Object obj;
        Object obj2 = this.k;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.k;
                if (obj instanceof dxjf) {
                    obj = new AtomicInteger();
                    dxjc.d(this.k, obj);
                    this.k = obj;
                }
            }
            obj2 = obj;
        }
        return (AtomicInteger) obj2;
    }

    @Override // defpackage.bvwv
    public final egk i() {
        Object obj;
        Object obj2 = this.l;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.l;
                if (obj instanceof dxjf) {
                    obj = new egk();
                    dxjc.d(this.l, obj);
                    this.l = obj;
                }
            }
            obj2 = obj;
        }
        return (egk) obj2;
    }

    @Override // defpackage.bvwv
    public final bwcb j() {
        return s();
    }

    @Override // defpackage.bvwv
    public final bvwd k() {
        Object obj;
        Object obj2 = this.o;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.o;
                if (obj instanceof dxjf) {
                    dcep B = dcep.B(new bvzg(this.b.wk(), this.b.eW(), a()));
                    dszg dszgVar = dszg.TIMELINE;
                    dzsj dzsjVar = this.n;
                    if (dzsjVar == null) {
                        dzsjVar = new ftc(this, 0);
                        this.n = dzsjVar;
                    }
                    bvzc bvzcVar = new bvzc(B, dcdn.k(dszgVar, dzsjVar), this.d);
                    dxjc.d(this.o, bvzcVar);
                    this.o = bvzcVar;
                    obj = bvzcVar;
                }
            }
            obj2 = obj;
        }
        return (bvwd) obj2;
    }

    @Override // defpackage.bvwv
    public final double l() {
        return this.b.wk().getResources().getDisplayMetrics().densityDpi / 160.0f;
    }

    @Override // defpackage.bvwv
    public final dzsj<dmim> m() {
        dzsj<dmim> dzsjVar = this.q;
        if (dzsjVar == null) {
            ftc ftcVar = new ftc(this, 1);
            this.q = ftcVar;
            return ftcVar;
        }
        return dzsjVar;
    }

    @Override // defpackage.bvwv
    public final bvwu n() {
        Object obj;
        Object obj2 = this.r;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.r;
                if (obj instanceof dxjf) {
                    btrm rz = this.b.eW.a.rz();
                    dxjg.e(rz);
                    bvye bvyeVar = new bvye(rz, a());
                    dxjc.d(this.r, bvyeVar);
                    this.r = bvyeVar;
                    obj = bvyeVar;
                }
            }
            obj2 = obj;
        }
        return new bvyg((bvye) obj2, c(), p());
    }

    @Override // defpackage.bvwv
    public final dbsg<Parcelable> o() {
        return this.e;
    }

    @Override // defpackage.bvzb
    public final bvyz p() {
        Object obj;
        dcdn dcdnVar;
        Executor executor;
        Object obj2;
        Object obj3;
        Object obj4 = this.w;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.w;
                if (obj instanceof dxjf) {
                    Executor sV = this.b.eW.a.sV();
                    dxjg.e(sV);
                    Executor sU = this.b.eW.a.sU();
                    dxjg.e(sU);
                    dszg dszgVar = dszg.TIMELINE;
                    dzsj dzsjVar = this.t;
                    if (dzsjVar == null) {
                        dzsjVar = new ftc(this, 2);
                        this.t = dzsjVar;
                    }
                    dcdn k = dcdn.k(dszgVar, dzsjVar);
                    bvzi bvziVar = new bvzi(this.b.wk());
                    Object obj5 = this.u;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj3 = this.u;
                            if (obj3 instanceof dxjf) {
                                bvzj bvzjVar = new bvzj(this.b.wk(), this.b.eW());
                                dxjc.d(this.u, bvzjVar);
                                this.u = bvzjVar;
                                obj3 = bvzjVar;
                            }
                        }
                        obj5 = obj3;
                    }
                    bvzj bvzjVar2 = (bvzj) obj5;
                    bvzk bvzkVar = new bvzk(c());
                    bvzp bvzpVar = new bvzp(this.b.eW.qn(), this.b.wk());
                    bvzq bvzqVar = new bvzq();
                    bvzr bvzrVar = new bvzr(this.b.eW.kf());
                    bvwh[] bvwhVarArr = new bvwh[26];
                    bvwhVarArr[0] = new bvzs(dxjc.c(this.b.eW.s()));
                    bvwhVarArr[1] = new bvzv(this.b.eW.qm());
                    bvwhVarArr[2] = new bvzy(this.b.wk());
                    bvwhVarArr[3] = new bvzz(dxjc.c(this.b.eW.aw()), dxjc.c(this.b.eW.p()));
                    bvwhVarArr[4] = new bwaa(this.b.eW.qm());
                    gga wk = this.b.wk();
                    cqat rR = this.b.eW.a.rR();
                    dxjg.e(rR);
                    bvwhVarArr[5] = new bwae(wk, rR, a());
                    bvwhVarArr[6] = new bwaf(dxjc.c(this.b.fe()));
                    bvwhVarArr[7] = new bwah(this.b.be(), this.b.wk());
                    bvwhVarArr[8] = new bwai(dxjc.c(this.b.az()));
                    bvwhVarArr[9] = new bwak(this.b.wk(), a());
                    bvwhVarArr[10] = q();
                    bvwhVarArr[11] = new bwao(dxjc.c(this.b.eW.aw()), dxjc.c(this.b.eW.p()));
                    bvwhVarArr[12] = new bwal(this.b.wk(), dxjc.c(this.b.m()));
                    bvwhVarArr[13] = (bvwh) r();
                    dzsj<axwy> J = this.b.J();
                    btrm rz = this.b.eW.a.rz();
                    dxjg.e(rz);
                    bvwhVarArr[14] = new bwaq(J, rz, a());
                    bvwhVarArr[15] = new bwat(c());
                    bvwhVarArr[16] = new bwau(dxjc.c(this.b.cl()));
                    bvwhVarArr[17] = new bwaw(dxjc.c(this.b.eW.ax()));
                    bvwhVarArr[18] = new bwax(dxjc.c(this.b.eW.aw()), dxjc.c(this.b.eW.p()));
                    bvwhVarArr[19] = new bway(dxjc.c(this.b.fh()));
                    bvwhVarArr[20] = new bwaz(dxjc.c(this.b.bh()));
                    bvwhVarArr[21] = (bvwh) b();
                    Object obj6 = this.v;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj2 = this.v;
                            if (obj2 instanceof dxjf) {
                                Executor sV2 = this.b.eW.a.sV();
                                dxjg.e(sV2);
                                dcdnVar = k;
                                executor = sU;
                                bvzm bvzmVar = new bvzm(sV2, dxjc.c(this.b.eW.at()), s(), this.f);
                                dxjc.d(this.v, bvzmVar);
                                this.v = bvzmVar;
                                obj2 = bvzmVar;
                            } else {
                                dcdnVar = k;
                                executor = sU;
                            }
                        }
                        obj6 = obj2;
                    } else {
                        dcdnVar = k;
                        executor = sU;
                    }
                    bvwhVarArr[22] = (bvzm) obj6;
                    bvwhVarArr[23] = new bwba(this.b.kZ());
                    bvwhVarArr[24] = new bwag(dxjc.c(this.b.aV()));
                    bvwhVarArr[25] = new bvzu(dxjc.c(this.b.eW.p()), dxjc.c(this.b.eW.bm()));
                    dcep G = dcep.G(bvziVar, bvzjVar2, bvzkVar, bvzpVar, bvzqVar, bvzrVar, bvwhVarArr);
                    bvwq e = e();
                    cqat rR2 = this.b.eW.a.rR();
                    dxjg.e(rR2);
                    obj = new bvyz(sV, executor, dcdnVar, G, e, rR2, this.c, this.d);
                    dxjc.d(this.w, obj);
                    this.w = obj;
                }
            }
            obj4 = obj;
        }
        return (bvyz) obj4;
    }
}
