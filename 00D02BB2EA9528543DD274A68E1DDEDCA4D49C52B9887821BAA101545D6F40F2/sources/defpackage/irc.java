package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.os.Build;
import android.os.UserManager;
import android.telephony.TelephonyManager;
import com.google.android.filament.R;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import com.google.ar.core.ImageMetadata;
import java.net.URL;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import org.chromium.net.CronetEngine;
import org.chromium.net.ExperimentalCronetEngine;
/* compiled from: PG */
/* renamed from: irc  reason: default package */
/* loaded from: classes.dex */
public final class irc implements iqz {
    public volatile dzsj<dbsg<ckcz>> A;
    public volatile Executor B;
    public volatile dzsj<Executor> C;
    public volatile dzsj D;
    public volatile dzsj<Set<cxfn>> E;
    public volatile dzsj<cwze> F;
    public volatile dzsj<cxdg> G;
    public volatile dzsj<cxai> H;
    public volatile dzsj<cwxp> I;
    public volatile dzsj<cxcg> J;
    public volatile dzsj<cwyo> K;
    public volatile dzsj<cxef> L;
    public volatile dzsj<cwvf> M;
    public volatile dzsj<Boolean> N;
    public volatile dzsj P;
    public final dzsj<bvjj> R;
    private final dbty<dbsg<ddla>> S;
    private final String T;
    private final Context U;
    private final bvrv V;
    public final bvjj a;
    private volatile dzsj<cjvc> aE;
    private volatile dzsj<dbsg<ddlj>> aF;
    private volatile dzsj<dkiy> aJ;
    private volatile cqat aL;
    private volatile bvnx aM;
    private volatile dzsj<affr> aN;
    private volatile dzsj<btur> aS;
    private volatile Boolean aZ;
    private volatile dzsj<duxm> aa;
    private volatile dzsj<btvo> ad;
    private volatile dzsj<cqat> af;
    private volatile dzsj<ckcw> ag;
    private volatile dzsj<btrq> ah;
    private volatile dzsj<awob> aj;
    private volatile dzsj<btry> ak;
    private volatile dzsj<btxc> am;
    private volatile dzsj<akcl> ao;
    private volatile dzsj<bvkx> ap;
    private volatile dzsj<ckmm> aq;
    private volatile dzsj<ckpr> ar;
    private volatile dzsj<dujz> at;
    private volatile dzsj<dusf> au;
    private volatile dzsj<ddbq> ax;
    private volatile dzsj<btze> ay;
    public final Application b;
    private volatile dzsj<dbsg<dhmr>> bA;
    private volatile dzsj<dmxf> bC;
    private volatile dzsj<buit> bF;
    private volatile dzsj<buie> bG;
    private volatile Object bH;
    private volatile dzsj<aehr> bL;
    private volatile dzsj<buhf> bN;
    private volatile dzsj<bttx> bS;
    private volatile dzsj bT;
    private volatile bubw bV;
    private volatile dzsj<bugk> bW;
    private volatile dzsj<CronetEngine> ba;
    private volatile dzsj<btvi> bb;
    private volatile Boolean bc;
    private volatile dzsj<btwr> be;
    private volatile btus bg;
    private volatile dzsj<btto> bh;
    private volatile bvtd bi;
    private volatile dzsj<bucd> bl;
    private volatile dzsj<btvd> bm;
    private volatile dzsj<btuy> bn;
    private volatile dzsj<dixz> bq;
    private volatile dzsj<bucq> bs;
    private volatile dzsj<bubp> bt;
    private volatile dzsj<djzi> bu;
    private volatile dzsj<duul> bv;
    private volatile dzsj<bszw> bx;
    private volatile dzsj<gcc> by;
    private volatile dzsj<bvow> cA;
    private volatile dzsj<crzb> cD;
    private volatile dzsj<ckbz> cF;
    private volatile dzsj<ckcl> cG;
    private volatile crzb cI;
    private volatile crzb cJ;
    private volatile crzb cK;
    private volatile crzb cL;
    private volatile crzb cM;
    private volatile crzb cN;
    private volatile dehq cO;
    private volatile dehq cP;
    private volatile dehq cQ;
    private volatile dehq cR;
    private volatile dehq cS;
    private volatile dehq cT;
    private volatile dehq cU;
    private volatile dehq cV;
    private volatile dehq cW;
    private volatile dehq cX;
    private volatile dehq cY;
    private volatile dehq cZ;
    private volatile dzsj<buhr> cc;
    private volatile dzsj<dbsg<cnjq>> cf;
    private volatile dzsj<bvrf> ch;
    private volatile dzsj<dwwr> cj;
    private volatile dzsj<dvcz> ck;
    private volatile dzsj cm;
    private volatile dzsj<btte> cn;
    private volatile dzsj<bvtd> co;
    private volatile dzsj<bvtg> cp;
    private volatile dzsj<btxo> cq;
    private volatile dzsj<PseudonymousIdToken> cr;
    private volatile dzsj cs;
    private volatile dzsj<cjvj> ct;
    private volatile dzsj<btxm> cu;
    private volatile dzsj<afdf> cv;
    private volatile dzsj<dbsg<coxz>> cy;
    private volatile dzsj<gcg> cz;
    public volatile dzsj<CronetEngine> d;
    private volatile dzsj<ktw> dA;
    private final dzsj<Application> dF;
    private volatile cqba dG;
    private volatile dzsj<dvsb> db;
    private volatile bvtg dd;
    private volatile dvoz de;
    private volatile dzsj<btmg> dj;
    private volatile dzsj<btmv> dk;
    private volatile dzsj<dkwa> dl;
    private volatile dzsj<afei> ds;
    private volatile dzsj<cwsy> dw;
    private volatile dzsj<btsf> dz;
    public volatile dzsj<Boolean> e;
    public volatile dzsj<buis> f;
    public volatile dzsj<bubw> g;
    public volatile dzsj h;
    public volatile dzsj<btvg> i;
    public volatile dzsj<bual> j;
    public volatile dzsj<dvem> k;
    public volatile dzsj<buhu> n;
    public volatile dzsj<buhv> p;
    public volatile dzsj<buhk> q;
    public volatile dzsj<buhm> r;
    public volatile dzsj<buig> t;
    public volatile dzsj<buif> v;
    public volatile dzsj<buhx> x;
    public volatile dzsj<buho> y;
    public volatile dzsj<buhq> z;
    private volatile Object W = new dxjf();
    private volatile Object X = new dxjf();
    private volatile Object Y = new dxjf();
    private volatile Object Z = new dxjf();
    private volatile Object ab = new dxjf();
    private volatile Object ac = new dxjf();
    private volatile Object ae = new dxjf();
    private volatile Object ai = new dxjf();
    private volatile Object al = new dxjf();
    private volatile Object an = new dxjf();
    private volatile Object as = new dxjf();
    private volatile Object av = new dxjf();
    private volatile Object aw = new dxjf();
    private volatile Object az = new dxjf();
    private volatile Object aA = new dxjf();
    private volatile Object aB = new dxjf();
    private volatile Object aC = new dxjf();
    private volatile Object aD = new dxjf();
    private volatile Object aG = new dxjf();
    private volatile Object aH = new dxjf();
    private volatile Object aI = new dxjf();
    private volatile Object aK = new dxjf();
    private volatile Object aO = new dxjf();
    private volatile Object aP = new dxjf();
    private volatile Object aQ = new dxjf();
    private volatile Object aR = new dxjf();
    private volatile Object aT = new dxjf();
    private volatile Object aU = new dxjf();
    private volatile Object aV = new dxjf();
    private volatile Object aW = new dxjf();
    private volatile Object aX = new dxjf();
    private volatile Object aY = new dxjf();
    public volatile Object c = new dxjf();
    private volatile Object bd = new dxjf();
    private volatile Object bf = new dxjf();
    private volatile Object bj = new dxjf();
    private volatile Object bk = new dxjf();
    private volatile Object bo = new dxjf();
    private volatile Object bp = new dxjf();
    private volatile Object br = new dxjf();
    private volatile Object bw = new dxjf();
    private volatile Object bz = new dxjf();
    private volatile Object bB = new dxjf();
    private volatile Object bD = new dxjf();
    private volatile Object bE = new dxjf();
    public volatile Object l = new dxjf();
    private volatile Object bI = new dxjf();
    private volatile Object bJ = new dxjf();
    private volatile Object bK = new dxjf();
    private volatile Object bM = new dxjf();
    private volatile Object bO = new dxjf();
    private volatile Object bP = new dxjf();
    private volatile Object bQ = new dxjf();
    private volatile Object bR = new dxjf();
    private volatile Object bU = new dxjf();
    private volatile Object bX = new dxjf();
    private volatile Object bY = new dxjf();
    private volatile Object bZ = new dxjf();
    public volatile Object m = new dxjf();
    public volatile Object o = new dxjf();
    private volatile Object ca = new dxjf();
    private volatile Object cb = new dxjf();
    public volatile Object s = new dxjf();
    public volatile Object u = new dxjf();
    public volatile Object w = new dxjf();
    private volatile Object cd = new dxjf();
    private volatile Object ce = new dxjf();
    private volatile Object cg = new dxjf();
    private volatile Object ci = new dxjf();
    private volatile Object cl = new dxjf();
    private volatile Object cw = new dxjf();
    private volatile Object cx = new dxjf();
    private volatile Object cB = new dxjf();
    private volatile Object cC = new dxjf();
    private volatile Object cE = new dxjf();
    private volatile Object cH = new dxjf();
    private volatile Object da = new dxjf();
    private volatile Object dc = new dxjf();
    private volatile Object df = new dxjf();
    private volatile Object dg = new dxjf();
    private volatile Object dh = new dxjf();
    private volatile Object di = new dxjf();
    private volatile Object dm = new dxjf();
    private volatile Object dn = new dxjf();

    /* renamed from: do  reason: not valid java name */
    private volatile Object f30do = new dxjf();
    private volatile Object dp = new dxjf();
    private volatile Object dq = new dxjf();
    private volatile Object dr = new dxjf();
    private volatile Object dt = new dxjf();
    private volatile Object du = new dxjf();
    private volatile Object dv = new dxjf();
    public volatile Object O = new dxjf();
    public volatile Object Q = new dxjf();
    private volatile Object dx = new dxjf();
    private volatile Object dy = new dxjf();
    private volatile Object dB = new dxjf();
    private volatile Object dC = new dxjf();
    private volatile Object dD = new dxjf();
    private volatile Object dE = new dxjf();

    public irc(Application application, String str, dbty<dbsg<ddla>> dbtyVar, Context context, bvrv bvrvVar, bvjj bvjjVar) {
        this.a = bvjjVar;
        this.b = application;
        this.S = dbtyVar;
        this.T = str;
        this.U = context;
        this.V = bvrvVar;
        this.dF = dxjd.b(application);
        this.R = dxjd.b(bvjjVar);
    }

    private final dzsj<btvo> bc() {
        dzsj<btvo> dzsjVar = this.ad;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 2);
            this.ad = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<btrq> bd() {
        dzsj<btrq> dzsjVar = this.ah;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 5);
            this.ah = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<akcl> be() {
        dzsj<akcl> dzsjVar = this.ao;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 1);
            this.ao = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<bvkx> bf() {
        dzsj<bvkx> dzsjVar = this.ap;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 9);
            this.ap = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<ckmm> bg() {
        dzsj<ckmm> dzsjVar = this.aq;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 10);
            this.aq = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final ckpu bh() {
        dzsj<ckmm> bg = bg();
        dzsj dzsjVar = this.ar;
        if (dzsjVar == null) {
            dzsjVar = new irb(this, 11);
            this.ar = dzsjVar;
        }
        return new ckpu(bg, dzsjVar);
    }

    private final btyf bi() {
        Object obj;
        Object obj2 = this.aP;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aP;
                if (obj instanceof dxjf) {
                    btyf btyfVar = new btyf(this.b, this.a, E());
                    btyfVar.c();
                    dxjc.d(this.aP, btyfVar);
                    this.aP = btyfVar;
                    obj = btyfVar;
                }
            }
            obj2 = obj;
        }
        return (btyf) obj2;
    }

    private final pqa bj() {
        Object obj;
        Object obj2 = this.aT;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aT;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    cqat rR = rR();
                    btpc sz = sz();
                    dxio c = dxjc.c(W());
                    g();
                    obj = new pqa(application, rR, sz, c, S(), rU(), dxjc.c(bf()), new btya(sd(), this.b));
                    dxjc.d(this.aT, obj);
                    this.aT = obj;
                }
            }
            obj2 = obj;
        }
        return (pqa) obj2;
    }

    private final kly bk() {
        Object obj;
        Object obj2 = this.aU;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aU;
                if (obj instanceof dxjf) {
                    obj = new kly();
                    dxjc.d(this.aU, obj);
                    this.aU = obj;
                }
            }
            obj2 = obj;
        }
        return (kly) obj2;
    }

    private final btuh bl() {
        return new btuh(K(), rU());
    }

    private final btvf bm() {
        Object obj;
        Object obj2 = this.bd;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bd;
                if (obj instanceof dxjf) {
                    obj = Y();
                    Object btvaVar = new btva(X());
                    if (true != Z().booleanValue()) {
                        obj = btvaVar;
                    }
                    dxjc.d(this.bd, obj);
                    this.bd = obj;
                }
            }
            obj2 = obj;
        }
        return (btvf) obj2;
    }

    private final bubu bn() {
        return new bubu(bc());
    }

    private final dzsj<dixz> bo() {
        dzsj<dixz> dzsjVar = this.bq;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 33);
            this.bq = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final buxc bp() {
        Object obj;
        Object obj2 = this.br;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.br;
                if (obj instanceof dxjf) {
                    buxc buxcVar = new buxc(bo(), dxjc.c(this.R));
                    dxjc.d(this.br, buxcVar);
                    this.br = buxcVar;
                    obj = buxcVar;
                }
            }
            obj2 = obj;
        }
        return (buxc) obj2;
    }

    private final dzsj<djzi> bq() {
        dzsj<djzi> dzsjVar = this.bu;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 35);
            this.bu = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<duul> br() {
        dzsj<duul> dzsjVar = this.bv;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 36);
            this.bv = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<bszw> bs() {
        dzsj<bszw> dzsjVar = this.bx;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 37);
            this.bx = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<gcc> bt() {
        dzsj<gcc> dzsjVar = this.by;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 38);
            this.by = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final Object bu() {
        Object obj;
        Object obj2 = this.bz;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bz;
                if (obj instanceof dxjf) {
                    obj = new ktz();
                    dxjc.d(this.bz, obj);
                    this.bz = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final dzsj<dbsg<dhmr>> bv() {
        dzsj<dbsg<dhmr>> dzsjVar = this.bA;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 39);
            this.bA = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<bvtd> bw() {
        dzsj<bvtd> dzsjVar = this.co;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 71);
            this.co = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final dzsj<bvtg> bx() {
        dzsj<bvtg> dzsjVar = this.cp;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 72);
            this.cp = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    private final void by() {
        dzsj dzsjVar = this.be;
        if (dzsjVar == null) {
            dzsjVar = new irb(this, 24);
            this.be = dzsjVar;
        }
        final dxio c = dxjc.c(dzsjVar);
        new Runnable(c) { // from class: btxb
            private final dxio a;

            {
                this.a = c;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((btwr) this.a.a()).g();
            }
        };
    }

    @Override // defpackage.iqz
    public final bvju A() {
        Object obj;
        Object obj2 = this.dC;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dC;
                if (obj instanceof dxjf) {
                    affr L = L();
                    L();
                    bvju bvjuVar = new bvju(L, this.b);
                    dxjc.d(this.dC, bvjuVar);
                    this.dC = bvjuVar;
                    obj = bvjuVar;
                }
            }
            obj2 = obj;
        }
        return (bvju) obj2;
    }

    @Override // defpackage.iqz
    public final ktz B() {
        return (ktz) bu();
    }

    @Override // defpackage.iqz
    public final ckoq C() {
        Object obj;
        Object obj2 = this.dp;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dp;
                if (obj instanceof dxjf) {
                    ckoq ckoqVar = new ckoq(bvoc.a(this.b));
                    dxjc.d(this.dp, ckoqVar);
                    this.dp = ckoqVar;
                    obj = ckoqVar;
                }
            }
            obj2 = obj;
        }
        return (ckoq) obj2;
    }

    public final bvrf D() {
        Object obj;
        Object obj2 = this.X;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.X;
                if (obj instanceof dxjf) {
                    obj = new bvrf(this.b, rR());
                    dxjc.d(this.X, obj);
                    this.X = obj;
                }
            }
            obj2 = obj;
        }
        return (bvrf) obj2;
    }

    public final btrq E() {
        Object obj;
        Object obj2 = this.Y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.Y;
                if (obj instanceof dxjf) {
                    obj = new btrq(D(), C());
                    dxjc.d(this.Y, obj);
                    this.Y = obj;
                }
            }
            obj2 = obj;
        }
        return (btrq) obj2;
    }

    public final dzsj<duxm> F() {
        dzsj<duxm> dzsjVar = this.aa;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 0);
            this.aa = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final btte G() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.ae;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.ae;
                if (obj instanceof dxjf) {
                    bvjj bvjjVar = this.a;
                    Object obj5 = this.ac;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.ac;
                            if (obj2 instanceof dxjf) {
                                Application application = this.b;
                                cqat rR = rR();
                                bwrh b = bwri.b(tg(), this.b);
                                Object obj6 = this.ab;
                                if (obj6 instanceof dxjf) {
                                    synchronized (obj6) {
                                        obj3 = this.ab;
                                        if (obj3 instanceof dxjf) {
                                            bvmh bvmhVar = new bvmh(rU());
                                            dxjc.d(this.ab, bvmhVar);
                                            this.ab = bvmhVar;
                                            obj3 = bvmhVar;
                                        }
                                    }
                                    obj6 = obj3;
                                }
                                obj2 = new bvmg(application, rR, b, (bvmh) obj6, o(), tg());
                                dxjc.d(this.ac, obj2);
                                this.ac = obj2;
                            }
                        }
                        obj5 = obj2;
                    }
                    btte btteVar = new btte(bvjjVar, (bvmg) obj5, bc(), tg());
                    dxjc.d(this.ae, btteVar);
                    this.ae = btteVar;
                    obj = btteVar;
                }
            }
            obj4 = obj;
        }
        return (btte) obj4;
    }

    public final dzsj<cqat> H() {
        dzsj<cqat> dzsjVar = this.af;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 3);
            this.af = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final dzsj<ckcw> I() {
        dzsj<ckcw> dzsjVar = this.ag;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 4);
            this.ag = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final awob J() {
        Object obj;
        GoogleApiClient e;
        Object obj2 = this.ai;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ai;
                if (obj instanceof dxjf) {
                    awob awobVar = new awob(this.b);
                    if (btsj.b(awobVar.b)) {
                        couu a = couv.a();
                        a.a = 137;
                        couv a2 = a.a();
                        btsm b = btsm.b(awobVar.b);
                        if (b == null) {
                            e = null;
                        } else {
                            Api<couv> api = couw.c;
                            if (!b.f("addApi(options)")) {
                                b.a.addApi(api, a2);
                            }
                            e = b.e();
                        }
                        dbsk.s(e);
                        e.registerConnectionCallbacks(awobVar);
                        e.registerConnectionFailedListener(awobVar);
                        awobVar.a = e;
                    }
                    dxjc.d(this.ai, awobVar);
                    this.ai = awobVar;
                    obj = awobVar;
                }
            }
            obj2 = obj;
        }
        return (awob) obj2;
    }

    public final btxc K() {
        Object obj;
        Object obj2 = this.al;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.al;
                if (obj instanceof dxjf) {
                    obj = new btxc();
                    dxjc.d(this.al, obj);
                    this.al = obj;
                }
            }
            obj2 = obj;
        }
        return (btxc) obj2;
    }

    public final affr L() {
        return afbq.b(this.b);
    }

    public final akcl M() {
        Object obj;
        Object obj2 = this.an;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.an;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    akby b = akbz.b(application, this.a);
                    bvjj bvjjVar = this.a;
                    btte G = G();
                    dehq tf = tf();
                    dehq tg = tg();
                    dxio c = dxjc.c(bc());
                    btub btubVar = new btub(this.dF, H(), I(), bd(), bc());
                    dxio c2 = dxjc.c(I());
                    dzsj dzsjVar = this.aj;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 6);
                        this.aj = dzsjVar;
                    }
                    dxio c3 = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.ak;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 7);
                        this.ak = dzsjVar2;
                    }
                    dxio c4 = dxjc.c(dzsjVar2);
                    dzsj dzsjVar3 = this.am;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new irb(this, 8);
                        this.am = dzsjVar3;
                    }
                    final akcl akclVar = new akcl(application, b, bvjjVar, G, tf, tg, c, btubVar, c2, c3, c4, dxjc.c(dzsjVar3), rR(), L());
                    if (akclVar.k.a()) {
                        synchronized (akclVar) {
                            akclVar.m = btlu.c(akcl.a);
                        }
                    }
                    akclVar.e.c().Pk(new Runnable(akclVar) { // from class: akca
                        private final akcl a;

                        {
                            this.a = akclVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final akcl akclVar2 = this.a;
                            if (akclVar2.n.getAndSet(true)) {
                                return;
                            }
                            btry a = akclVar2.u.a();
                            akclVar2.C().d(new btrw(a), dege.a);
                            akclVar2.t.a.d(new btrx(a), dege.a);
                            btlu.c = akclVar2;
                            if (!akclVar2.k.a()) {
                                akclVar2.d.addOnAccountsUpdatedListener(akclVar2, null, false);
                            }
                            akclVar2.j.a().a().d(akclVar2.s, dege.a);
                            akclVar2.g.a().h(new akci(akclVar2));
                            akclVar2.r.Pk(new Runnable(akclVar2) { // from class: akcb
                                private final akcl a;

                                {
                                    this.a = akclVar2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    btlu b2;
                                    akcl akclVar3 = this.a;
                                    akclVar3.x();
                                    akclVar3.k.a();
                                    akclVar3.i();
                                    List<btlu> e = dcdc.e();
                                    if (akclVar3.k.a()) {
                                        b2 = btlu.c(akclVar3.k.b());
                                    } else if (!akclVar3.i()) {
                                        b2 = new btlu(btlt.SIGNED_OUT);
                                        b2.e = btls.AUTO_PICKED;
                                    } else {
                                        b2 = akclVar3.b(bvjk.i);
                                        e = akclVar3.t();
                                    }
                                    akclVar3.p(b2, e);
                                    akclVar3.j().l();
                                    akclVar3.i.j(null);
                                }
                            }, akclVar2.f);
                        }
                    }, akclVar.f);
                    dxjc.d(this.an, akclVar);
                    this.an = akclVar;
                    obj = akclVar;
                }
            }
            obj2 = obj;
        }
        return (akcl) obj2;
    }

    public final ckpr N() {
        Object obj;
        Object obj2 = this.as;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.as;
                if (obj instanceof dxjf) {
                    ckpr ckprVar = new ckpr(this.b, rU(), new ckpj(bh()));
                    btrq E = E();
                    ckprVar.i.registerActivityLifecycleCallbacks(ckprVar.f);
                    ckpo ckpoVar = ckprVar.h;
                    dceq a = dcet.a();
                    a.b(ckot.class, new ckps(ckot.class, ckpoVar));
                    E.g(ckpoVar, a.a());
                    dxjc.d(this.as, ckprVar);
                    this.as = ckprVar;
                    obj = ckprVar;
                }
            }
            obj2 = obj;
        }
        return (ckpr) obj2;
    }

    public final bvow O() {
        return new bvow(this.b);
    }

    public final ddbq P() {
        Object obj;
        Object obj2 = this.aw;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aw;
                if (obj instanceof dxjf) {
                    obj = cpme.a(this.b);
                    dxjg.f(obj);
                    dxjc.d(this.aw, obj);
                    this.aw = obj;
                }
            }
            obj2 = obj;
        }
        return (ddbq) obj2;
    }

    public final dzsj<btze> Q() {
        dzsj<btze> dzsjVar = this.ay;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 15);
            this.ay = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final cjvc R() {
        Object obj;
        Object obj2;
        Object obj3 = this.aD;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.aD;
                if (obj instanceof dxjf) {
                    cqat rR = rR();
                    Object obj4 = this.aC;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.aC;
                            if (obj2 instanceof dxjf) {
                                obj2 = new cjuy(tg(), F());
                                dxjc.d(this.aC, obj2);
                                this.aC = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = new cjvc(rR, (cjuy) obj4, F(), S());
                    dxjc.d(this.aD, obj);
                    this.aD = obj;
                }
            }
            obj3 = obj;
        }
        return (cjvc) obj3;
    }

    public final cjvj S() {
        Object obj;
        dbsg dbsgVar;
        cjqc cjqcVar;
        cjqh cjqhVar;
        cqat cqatVar;
        btrq btrqVar;
        dzsj<duxm> dzsjVar;
        dxio dxioVar;
        cjvn cjvnVar;
        dxio dxioVar2;
        dxio dxioVar3;
        dehq dehqVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7 = this.aG;
        if (obj7 instanceof dxjf) {
            synchronized (obj7) {
                obj = this.aG;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    btmv rY = rY();
                    cqat rR = rR();
                    btrq E = E();
                    dzsj<duxm> F = F();
                    dxio c = dxjc.c(be());
                    cjvn j = j();
                    dxio c2 = dxjc.c(bf());
                    dxio c3 = dxjc.c(I());
                    dehq tg = tg();
                    dbsg i = dbsg.i(N());
                    bvow O = O();
                    Object obj8 = this.ci;
                    if (obj8 instanceof dxjf) {
                        synchronized (obj8) {
                            obj6 = this.ci;
                            dbsgVar = i;
                            if (obj6 instanceof dxjf) {
                                obj6 = new cjqc();
                                dxjc.d(this.ci, obj6);
                                this.ci = obj6;
                            }
                        }
                        obj8 = obj6;
                    } else {
                        dbsgVar = i;
                    }
                    cjqc cjqcVar2 = (cjqc) obj8;
                    dzsj dzsjVar2 = this.at;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 12);
                        this.at = dzsjVar2;
                    }
                    dzsj dzsjVar3 = dzsjVar2;
                    dzsj dzsjVar4 = this.au;
                    if (dzsjVar4 == null) {
                        dzsjVar4 = new irb(this, 13);
                        this.au = dzsjVar4;
                    }
                    dzsj dzsjVar5 = dzsjVar4;
                    btsc w = w();
                    Object obj9 = this.av;
                    if (obj9 instanceof dxjf) {
                        synchronized (obj9) {
                            obj5 = this.av;
                            cjqcVar = cjqcVar2;
                            if (obj5 instanceof dxjf) {
                                tf();
                                tg();
                                o();
                                obj5 = cjqh.a;
                                dxjc.d(this.av, obj5);
                                this.av = obj5;
                            }
                        }
                        obj9 = obj5;
                    } else {
                        cjqcVar = cjqcVar2;
                    }
                    cjqh cjqhVar2 = (cjqh) obj9;
                    dzsj dzsjVar6 = this.ax;
                    if (dzsjVar6 == null) {
                        dzsjVar6 = new irb(this, 14);
                        this.ax = dzsjVar6;
                    }
                    dzsj dzsjVar7 = dzsjVar6;
                    Object obj10 = this.aB;
                    if (obj10 instanceof dxjf) {
                        synchronized (obj10) {
                            obj2 = this.aB;
                            cjqhVar = cjqhVar2;
                            if (obj2 instanceof dxjf) {
                                Object obj11 = this.az;
                                if (obj11 instanceof dxjf) {
                                    synchronized (obj11) {
                                        obj4 = this.az;
                                        dehqVar = tg;
                                        if (obj4 instanceof dxjf) {
                                            akcl M = M();
                                            dxioVar3 = c3;
                                            buzz buzzVar = new buzz(dxjc.c(Q()), D());
                                            dehq tg2 = tg();
                                            cqat rR2 = rR();
                                            dehq tg3 = tg();
                                            dxioVar2 = c2;
                                            bvkx o = o();
                                            cjvnVar = j;
                                            dxioVar = c;
                                            dzsjVar = F;
                                            btrqVar = E;
                                            cqatVar = rR;
                                            final cjwe cjweVar = new cjwe(rR2, F(), new cjvv(this.b, rR(), L()));
                                            o.k(new Runnable(cjweVar) { // from class: cjwm
                                                private final cjwe a;

                                                {
                                                    this.a = cjweVar;
                                                }

                                                /* JADX WARN: Removed duplicated region for block: B:45:0x00e7 A[LOOP:0: B:43:0x00e1->B:45:0x00e7, LOOP_END] */
                                                @Override // java.lang.Runnable
                                                /*
                                                    Code decompiled incorrectly, please refer to instructions dump.
                                                    To view partially-correct add '--show-bad-code' argument
                                                */
                                                public final void run() {
                                                    /*
                                                        Method dump skipped, instructions count: 267
                                                        To view this dump add '--comments-level debug' option
                                                    */
                                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.cjwm.run():void");
                                                }
                                            }, tg3, bvkw.ON_STARTUP_FULLY_COMPLETE);
                                            obj4 = new cjvx(M, buzzVar, tg2, cjweVar, rR(), F());
                                            dxjc.d(this.az, obj4);
                                            this.az = obj4;
                                        } else {
                                            cqatVar = rR;
                                            btrqVar = E;
                                            dzsjVar = F;
                                            dxioVar = c;
                                            cjvnVar = j;
                                            dxioVar2 = c2;
                                            dxioVar3 = c3;
                                        }
                                    }
                                    obj11 = obj4;
                                } else {
                                    cqatVar = rR;
                                    btrqVar = E;
                                    dzsjVar = F;
                                    dxioVar = c;
                                    cjvnVar = j;
                                    dxioVar2 = c2;
                                    dxioVar3 = c3;
                                    dehqVar = tg;
                                }
                                Object obj12 = this.aA;
                                if (obj12 instanceof dxjf) {
                                    synchronized (obj12) {
                                        obj3 = this.aA;
                                        if (obj3 instanceof dxjf) {
                                            cjvq cjvqVar = new cjvq(M(), dxjc.c(I()), F(), dxjc.c(this.R));
                                            dxjc.d(this.aA, cjvqVar);
                                            this.aA = cjvqVar;
                                            obj3 = cjvqVar;
                                        }
                                    }
                                    obj12 = obj3;
                                }
                                obj2 = new cjwk((cjwa) obj11, (cjwa) obj12, tg(), F(), dxjc.c(this.R), M());
                                dxjc.d(this.aB, obj2);
                                this.aB = obj2;
                            } else {
                                cqatVar = rR;
                                btrqVar = E;
                                dzsjVar = F;
                                dxioVar = c;
                                cjvnVar = j;
                                dxioVar2 = c2;
                                dxioVar3 = c3;
                                dehqVar = tg;
                            }
                        }
                        obj10 = obj2;
                    } else {
                        cjqhVar = cjqhVar2;
                        cqatVar = rR;
                        btrqVar = E;
                        dzsjVar = F;
                        dxioVar = c;
                        cjvnVar = j;
                        dxioVar2 = c2;
                        dxioVar3 = c3;
                        dehqVar = tg;
                    }
                    cjwl cjwlVar = (cjwl) obj10;
                    bvju A = A();
                    dzsj dzsjVar8 = this.aE;
                    if (dzsjVar8 == null) {
                        dzsjVar8 = new irb(this, 16);
                        this.aE = dzsjVar8;
                    }
                    dxio c4 = dxjc.c(dzsjVar8);
                    dzsj dzsjVar9 = this.aF;
                    if (dzsjVar9 == null) {
                        dzsjVar9 = new irb(this, 17);
                        this.aF = dzsjVar9;
                    }
                    obj = new cjvj(application, rY, cqatVar, btrqVar, dzsjVar, dxioVar, cjvnVar, dxioVar2, dxioVar3, dehqVar, dbsgVar, O, cjqcVar, dzsjVar3, dzsjVar5, w, cjqhVar, dzsjVar7, cjwlVar, A, c4, dzsjVar9);
                    dxjc.d(this.aG, obj);
                    this.aG = obj;
                }
            }
            obj7 = obj;
        }
        return (cjvj) obj7;
    }

    public final gcc T() {
        Object obj;
        Object obj2;
        Object obj3 = this.aI;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.aI;
                if (obj instanceof dxjf) {
                    bvjj bvjjVar = this.a;
                    gcg sD = sD();
                    Object obj4 = this.aH;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.aH;
                            if (obj2 instanceof dxjf) {
                                obj2 = new hui(rR(), rU(), S());
                                dxjc.d(this.aH, obj2);
                                this.aH = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = new gcc(bvjjVar, sD, (hui) obj4);
                    dxjc.d(this.aI, obj);
                    this.aI = obj;
                }
            }
            obj3 = obj;
        }
        return (gcc) obj3;
    }

    public final dzsj<dkiy> U() {
        dzsj<dkiy> dzsjVar = this.aJ;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 18);
            this.aJ = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final btur V() {
        Object obj;
        Object obj2 = this.aR;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aR;
                if (obj instanceof dxjf) {
                    cqat rR = rR();
                    ckcw rU = rU();
                    F();
                    btur bturVar = new btur(rR, rU);
                    this.b.registerActivityLifecycleCallbacks(new btuq(bturVar));
                    dxjc.d(this.aR, bturVar);
                    this.aR = bturVar;
                    obj = bturVar;
                }
            }
            obj2 = obj;
        }
        return (btur) obj2;
    }

    public final dzsj<btur> W() {
        dzsj<btur> dzsjVar = this.aS;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 20);
            this.aS = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final dzsj<btvi> X() {
        dzsj<btvi> dzsjVar = this.bb;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 23);
            this.bb = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final btuy Y() {
        dzsj dzsjVar = this.ba;
        if (dzsjVar == null) {
            dzsjVar = new irb(this, 22);
            this.ba = dzsjVar;
        }
        return new btuy(dzsjVar, X());
    }

    public final Boolean Z() {
        Boolean bool = this.bc;
        if (bool == null) {
            this.bc = true;
            return true;
        }
        return bool;
    }

    @Override // defpackage.iqz
    public final Application a() {
        return this.b;
    }

    public final dzsj aA() {
        dzsj dzsjVar = this.cm;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 68);
            this.cm = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final btxo aB() {
        Application application = this.b;
        dxio c = dxjc.c(this.R);
        dzsj dzsjVar = this.cn;
        if (dzsjVar == null) {
            dzsjVar = new irb(this, 70);
            this.cn = dzsjVar;
        }
        dxio c2 = dxjc.c(dzsjVar);
        dxio c3 = dxjc.c(bw());
        dxjc.c(bx());
        return new btxo(application.getResources().getDisplayMetrics(), c, c2, c3, dbpy.a);
    }

    public final dzsj<btxo> aC() {
        dzsj<btxo> dzsjVar = this.cq;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 69);
            this.cq = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final dzsj<cjvj> aD() {
        dzsj<cjvj> dzsjVar = this.ct;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 75);
            this.ct = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final ckbz aE() {
        Object obj;
        dxio dxioVar;
        affr affrVar;
        String str;
        cnjz cnjzVar;
        cnjz cnjzVar2;
        Object obj2 = this.cE;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.cE;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    dzsj<duxm> F = F();
                    dzsj<djzi> bq = bq();
                    btyy y = y();
                    dehq tg = tg();
                    dxio c = dxjc.c(bd());
                    dxio c2 = dxjc.c(this.R);
                    dxjc.c(bw());
                    dxio c3 = dxjc.c(bx());
                    dxio c4 = dxjc.c(be());
                    affr L = L();
                    String str2 = this.T;
                    dxio c5 = dxjc.c(au());
                    cqat rR = rR();
                    dzsj dzsjVar = this.cy;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 80);
                        this.cy = dzsjVar;
                    }
                    dzsj dzsjVar2 = dzsjVar;
                    dbsg i = dbsg.i(ax());
                    dzsj<dbsg<dhmr>> bv = bv();
                    dzsj dzsjVar3 = this.cz;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new irb(this, 81);
                        this.cz = dzsjVar3;
                    }
                    dxio c6 = dxjc.c(dzsjVar3);
                    dxio c7 = dxjc.c(bt());
                    dxio c8 = dxjc.c(bs());
                    dzsj<dkiy> U = U();
                    dzsj<duul> br = br();
                    dxio c9 = dxjc.c(ac());
                    dzsj dzsjVar4 = this.cA;
                    if (dzsjVar4 == null) {
                        dzsjVar4 = new irb(this, 82);
                        this.cA = dzsjVar4;
                    }
                    dxio c10 = dxjc.c(dzsjVar4);
                    Object obj3 = this.cB;
                    if (obj3 instanceof dxjf) {
                        synchronized (obj3) {
                            cnjzVar2 = this.cB;
                            str = str2;
                            if (cnjzVar2 instanceof dxjf) {
                                Application application2 = this.b;
                                cnkx bb = bb();
                                if (bb == null) {
                                    affrVar = L;
                                    dxioVar = c4;
                                    cnjzVar2 = new cnjz(application2, "GMM_COUNTERS", null);
                                } else {
                                    dxioVar = c4;
                                    affrVar = L;
                                    cnjzVar2 = new cnjz(application2, "GMM_COUNTERS", null, false, bb, cnxn.a, new cnjy(), new cnlh(application2));
                                }
                                dxjc.d(this.cB, cnjzVar2);
                                this.cB = cnjzVar2;
                            } else {
                                dxioVar = c4;
                                affrVar = L;
                            }
                        }
                        obj3 = cnjzVar2;
                    } else {
                        dxioVar = c4;
                        affrVar = L;
                        str = str2;
                    }
                    cnjz cnjzVar3 = (cnjz) obj3;
                    Object obj4 = this.cC;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            cnjzVar = this.cC;
                            if (cnjzVar instanceof dxjf) {
                                Application application3 = this.b;
                                cnkx bb2 = bb();
                                cnjzVar = bb2 == null ? cnjz.a(application3, "GMM_COUNTERS") : new cnjz(application3, "GMM_COUNTERS", null, true, bb2, cnxn.a, new cnjy(), new cnjt());
                                dxjc.d(this.cC, cnjzVar);
                                this.cC = cnjzVar;
                            }
                        }
                        obj4 = cnjzVar;
                    }
                    cnjz cnjzVar4 = (cnjz) obj4;
                    dxio c11 = dxjc.c(bc());
                    dzsj dzsjVar5 = this.cD;
                    if (dzsjVar5 == null) {
                        dzsjVar5 = new irb(this, 83);
                        this.cD = dzsjVar5;
                    }
                    obj = new ckbz(application, F, bq, y, tg, c, c2, c3, dxioVar, affrVar, str, c5, rR, dzsjVar2, i, bv, c6, c7, c8, U, br, c9, c10, cnjzVar3, cnjzVar4, c11, dxjc.c(dzsjVar5));
                    dxjc.d(this.cE, obj);
                    this.cE = obj;
                }
            }
            obj2 = obj;
        }
        return (ckbz) obj2;
    }

    public final cwxp aF() {
        dxio c = dxjc.c(U());
        cwxo f = cwxp.f();
        f.d(((dkiy) c.a()).E);
        cwxp c2 = f.c();
        dxjg.f(c2);
        return c2;
    }

    public final cwvf aG() {
        dxio c = dxjc.c(U());
        cwve d = cwvf.d();
        d.c(((dkiy) c.a()).D);
        cwvf a = d.a();
        dxjg.f(a);
        return a;
    }

    @Override // defpackage.jzr
    public final crzm<Boolean> aH() {
        Object obj;
        Object obj2 = this.aV;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aV;
                if (obj instanceof dxjf) {
                    obj = bk().a.a;
                    dxjc.d(this.aV, obj);
                    this.aV = obj;
                }
            }
            obj2 = obj;
        }
        return (crzm) obj2;
    }

    @Override // defpackage.jzr
    public final crzm<Boolean> aI() {
        Object obj;
        Object obj2 = this.aW;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aW;
                if (obj instanceof dxjf) {
                    obj = bk().a();
                    dxjc.d(this.aW, obj);
                    this.aW = obj;
                }
            }
            obj2 = obj;
        }
        return (crzm) obj2;
    }

    @Override // defpackage.jzr
    public final crzm<Boolean> aJ() {
        Object obj;
        Object obj2 = this.aX;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aX;
                if (obj instanceof dxjf) {
                    obj = bk().a();
                    dxjc.d(this.aX, obj);
                    this.aX = obj;
                }
            }
            obj2 = obj;
        }
        return (crzm) obj2;
    }

    @Override // defpackage.jzr
    public final crzm<jzq> aK() {
        Object obj;
        Object obj2 = this.aY;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aY;
                if (obj instanceof dxjf) {
                    obj = bk().b.a;
                    dxjc.d(this.aY, obj);
                    this.aY = obj;
                }
            }
            obj2 = obj;
        }
        return (crzm) obj2;
    }

    @Override // defpackage.bttg
    public final bttf aL() {
        return G();
    }

    @Override // defpackage.akew
    public final Boolean aM() {
        Boolean bool = this.aZ;
        if (bool == null) {
            bool = Boolean.valueOf(Build.VERSION.SDK_INT < 25 ? false : ((UserManager) this.b.getSystemService("user")).isDemoUser());
            this.aZ = Boolean.valueOf(bool.booleanValue());
        }
        return Boolean.valueOf(bool.booleanValue());
    }

    @Override // defpackage.btzf
    public final btto aN() {
        btyy btyyVar;
        Object obj = this.bP;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                try {
                    Object obj2 = this.bP;
                    if (obj2 instanceof dxjf) {
                        Application application = this.b;
                        bvjj bvjjVar = this.a;
                        btte G = G();
                        ad();
                        bvtg aV = aV();
                        dvoz aW = aW();
                        btpc sz = sz();
                        String str = this.T;
                        ctu n = n();
                        dzsj<djzi> bq = bq();
                        btyy y = y();
                        dzsj<dixz> bo = bo();
                        dzsj<dbsg<dhmr>> bv = bv();
                        long longValue = bvtd.a.longValue();
                        Resources resources = application.getResources();
                        try {
                            final dune bZ = dung.R.bZ();
                            String z = bvjjVar.z(bvjk.bu, null);
                            if (z != null) {
                                if (bZ.c) {
                                    bZ.bF();
                                    bZ.c = false;
                                }
                                dung dungVar = (dung) bZ.b;
                                z.getClass();
                                btyyVar = y;
                                dungVar.a |= 1;
                                dungVar.c = z;
                            } else {
                                btyyVar = y;
                            }
                            String a = G.a();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar2 = (dung) bZ.b;
                            a.getClass();
                            int i = dungVar2.a | 4;
                            dungVar2.a = i;
                            dungVar2.e = a;
                            dungVar2.a = i | 256;
                            dungVar2.h = true;
                            dung dungVar3 = (dung) bZ.b;
                            dungVar3.a |= 8192;
                            dungVar3.l = true;
                            boolean b = btpf.b(sz.a);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar4 = (dung) bZ.b;
                            dungVar4.a |= 67108864;
                            dungVar4.s = b;
                            boolean k = sz.k();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar5 = (dung) bZ.b;
                            dungVar5.a |= 536870912;
                            dungVar5.t = k;
                            boolean z2 = !btpc.n();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar6 = (dung) bZ.b;
                            dungVar6.a |= 1073741824;
                            dungVar6.u = z2;
                            dumu bZ2 = dumv.c.bZ();
                            int i2 = resources.getDisplayMetrics().densityDpi;
                            if (bZ2.c) {
                                bZ2.bF();
                                bZ2.c = false;
                            }
                            dumv dumvVar = (dumv) bZ2.b;
                            dumvVar.a |= 1;
                            dumvVar.b = i2;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar7 = (dung) bZ.b;
                            dumv bK = bZ2.bK();
                            bK.getClass();
                            dungVar7.p = bK;
                            dungVar7.a |= 2097152;
                            int i3 = resources.getDisplayMetrics().densityDpi;
                            int i4 = i3 > 300 ? 4 : i3 > 200 ? 3 : 1;
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar8 = (dung) bZ.b;
                            dungVar8.o = i4;
                            int i5 = dungVar8.a | ImageMetadata.SHADING_MODE;
                            dungVar8.a = i5;
                            str.getClass();
                            int i6 = i5 | 1024;
                            dungVar8.a = i6;
                            dungVar8.i = str;
                            dungVar8.a = i6 | 32768;
                            dungVar8.m = "SYSTEM";
                            String valueOf = String.valueOf(Build.VERSION.SDK_INT);
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar9 = (dung) bZ.b;
                            valueOf.getClass();
                            dungVar9.a |= 16777216;
                            dungVar9.r = valueOf;
                            cnmq cnmqVar = cnmq.a;
                            int i7 = cnnl.i(application.getApplicationContext());
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar10 = (dung) bZ.b;
                            int i8 = dungVar10.b | 1024;
                            dungVar10.b = i8;
                            dungVar10.D = i7;
                            dungVar10.b = i8 | 128;
                            dungVar10.A = longValue;
                            String a2 = G.a();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar11 = (dung) bZ.b;
                            a2.getClass();
                            dungVar11.a |= 4;
                            dungVar11.e = a2;
                            int d = aV.d();
                            if (bZ.c) {
                                bZ.bF();
                                bZ.c = false;
                            }
                            dung dungVar12 = (dung) bZ.b;
                            int i9 = d - 1;
                            if (d != 0) {
                                dungVar12.N = i9;
                                int i10 = dungVar12.b | 8388608;
                                dungVar12.b = i10;
                                dungVar12.B = aW.g;
                                dungVar12.b = i10 | 256;
                                bvor.a(aV.a(), new mw(bZ) { // from class: bttn
                                    private final dune a;

                                    {
                                        this.a = bZ;
                                    }

                                    @Override // defpackage.mw
                                    public final void a(Object obj3) {
                                        dune duneVar = this.a;
                                        String bvtfVar = ((bvtf) obj3).toString();
                                        if (duneVar.c) {
                                            duneVar.bF();
                                            duneVar.c = false;
                                        }
                                        dung dungVar13 = (dung) duneVar.b;
                                        dung dungVar14 = dung.R;
                                        bvtfVar.getClass();
                                        dungVar13.b |= 64;
                                        dungVar13.z = bvtfVar;
                                    }
                                });
                                dkgr d2 = btto.d((TelephonyManager) application.getSystemService("phone"));
                                if (d2 != null) {
                                    if (bZ.c) {
                                        bZ.bF();
                                        bZ.c = false;
                                    }
                                    dung dungVar13 = (dung) bZ.b;
                                    d2.getClass();
                                    dungVar13.g = d2;
                                    dungVar13.a |= 128;
                                }
                                btto bttoVar = new btto(bvjjVar, G, bZ, n, bq, btyyVar, bo, bv, (TelephonyManager) application.getSystemService("phone"));
                                dxjc.d(this.bP, bttoVar);
                                this.bP = bttoVar;
                                obj2 = bttoVar;
                            } else {
                                throw null;
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    obj = obj2;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return (btto) obj;
    }

    @Override // defpackage.btzf
    public final CronetEngine aO() {
        Object obj;
        Object obj2 = this.bQ;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                Object obj3 = this.bQ;
                boolean z = obj3 instanceof dxjf;
                obj = obj3;
                if (z) {
                    bufr aP = aP();
                    ckmm r = r();
                    ExperimentalCronetEngine b = aP.b();
                    if (r != null) {
                        r.c(b);
                    }
                    dxjg.f(b);
                    dxjc.d(this.bQ, b);
                    this.bQ = b;
                    obj = b;
                }
            }
            obj2 = obj;
        }
        return (CronetEngine) obj2;
    }

    @Override // defpackage.btzf
    public final bufr aP() {
        Object obj;
        Object obj2 = this.bU;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bU;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    Context context = this.U;
                    btuh bl = bl();
                    bubu bn = bn();
                    pqa bj = bj();
                    dehq tg = tg();
                    boolean booleanValue = Z().booleanValue();
                    dxio c = dxjc.c(W());
                    dzsj dzsjVar = this.bS;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 49);
                        this.bS = dzsjVar;
                    }
                    dxio c2 = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.bT;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 50);
                        this.bT = dzsjVar2;
                    }
                    dxio c3 = dxjc.c(dzsjVar2);
                    btyd btydVar = new btyd(sd(), new csdu(), this.b);
                    dxjc.c(this.R);
                    ckcw rU = rU();
                    obj = booleanValue ? new bufs(application, context, bl, bn, bj, tg, c, c2, c3, btydVar, rU) : new bufr(application, context, bl, bn, bj, tg, c, c2, c3, btydVar, rU);
                    dxjc.d(this.bU, obj);
                    this.bU = obj;
                }
            }
            obj2 = obj;
        }
        return (bufr) obj2;
    }

    @Override // defpackage.btzf
    public final cvjr aQ() {
        return buak.b();
    }

    @Override // defpackage.btzf
    public final bubw aR() {
        bubw bubwVar = this.bV;
        if (bubwVar == null) {
            bubwVar = ah();
            if (!Z().booleanValue()) {
                bubwVar = new bubx();
            }
            this.bV = bubwVar;
        }
        return bubwVar;
    }

    @Override // defpackage.btzf
    public final bugn aS() {
        Object obj;
        Object obj2 = this.bX;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bX;
                if (obj instanceof dxjf) {
                    dzsj dzsjVar = this.bW;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 51);
                        this.bW = dzsjVar;
                    }
                    bugo bugoVar = new bugo(dxjc.c(dzsjVar));
                    dxjc.d(this.bX, bugoVar);
                    this.bX = bugoVar;
                    obj = bugoVar;
                }
            }
            obj2 = obj;
        }
        return (bugn) obj2;
    }

    @Override // defpackage.btzf
    public final PseudonymousIdToken aT() {
        Object obj;
        Object obj2 = this.bY;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bY;
                if (obj instanceof dxjf) {
                    try {
                        obj = (PseudonymousIdToken) cpda.e(coym.a(this.b).a(), 2000L, TimeUnit.MILLISECONDS);
                    } catch (Exception unused) {
                        obj = null;
                    }
                    dxjc.d(this.bY, obj);
                    this.bY = obj;
                }
            }
            obj2 = obj;
        }
        return (PseudonymousIdToken) obj2;
    }

    @Override // defpackage.btzf
    public final btuu aU() {
        Object obj;
        Object obj2 = this.bZ;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bZ;
                if (obj instanceof dxjf) {
                    obj = new btuu(this.b);
                    dxjc.d(this.bZ, obj);
                    this.bZ = obj;
                }
            }
            obj2 = obj;
        }
        return (btuu) obj2;
    }

    @Override // defpackage.bvth
    public final bvtg aV() {
        bvtg bvtgVar = this.dd;
        if (bvtgVar == null) {
            bvtg c = bvtc.c(ad());
            this.dd = c;
            return c;
        }
        return bvtgVar;
    }

    @Override // defpackage.bvth
    public final dvoz aW() {
        dvoz dvozVar = this.de;
        if (dvozVar == null) {
            dvoz dvozVar2 = dvoz.RELEASE;
            dxjg.f(dvozVar2);
            this.de = dvozVar2;
            return dvozVar2;
        }
        return dvozVar;
    }

    @Override // defpackage.btmh
    public final btmg aX() {
        Object obj;
        Object obj2 = this.df;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.df;
                if (obj instanceof dxjf) {
                    obj = new btmg();
                    dxjc.d(this.df, obj);
                    this.df = obj;
                }
            }
            obj2 = obj;
        }
        return (btmg) obj2;
    }

    @Override // defpackage.jzr
    public final kly aY() {
        return bk();
    }

    @Override // defpackage.btzf
    public final bubp aZ() {
        return ai();
    }

    public final btvg aa() {
        Object obj;
        Object obj2 = this.bf;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bf;
                if (obj instanceof dxjf) {
                    btuh bl = bl();
                    btvf bm = bm();
                    btrq E = E();
                    by();
                    btvg btvgVar = new btvg(bl.a(), bm, E, bl);
                    dxjc.d(this.bf, btvgVar);
                    this.bf = btvgVar;
                    obj = btvgVar;
                }
            }
            obj2 = obj;
        }
        return (btvg) obj2;
    }

    public final btus ab() {
        btus btusVar = this.bg;
        if (btusVar == null) {
            Application application = this.b;
            btus btusVar2 = new btus(bvnz.b(), aV().b(), dbud.a(new btuk(application)));
            this.bg = btusVar2;
            return btusVar2;
        }
        return btusVar;
    }

    public final dzsj<btto> ac() {
        dzsj<btto> dzsjVar = this.bh;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 25);
            this.bh = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final bvtd ad() {
        bvtd bvtdVar = this.bi;
        if (bvtdVar == null) {
            bvtd bvtdVar2 = new bvtd();
            this.bi = bvtdVar2;
            return bvtdVar2;
        }
        return bvtdVar;
    }

    public final String ae() {
        Object obj;
        Object obj2 = this.bj;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bj;
                if (obj instanceof dxjf) {
                    ad();
                    int i = btut.a;
                    dxjc.d(this.bj, null);
                    this.bj = null;
                    obj = null;
                }
            }
            obj2 = obj;
        }
        return (String) obj2;
    }

    public final CronetEngine af() {
        Object obj;
        Object obj2 = this.bk;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bk;
                if (obj instanceof dxjf) {
                    obj = aP().c();
                    dxjg.f(obj);
                    dxjc.d(this.bk, obj);
                    this.bk = obj;
                }
            }
            obj2 = obj;
        }
        return (CronetEngine) obj2;
    }

    public final btvg ag() {
        Object obj;
        Object obj2;
        Object obj3 = this.bp;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.bp;
                if (obj instanceof dxjf) {
                    bubu bn = bn();
                    Object obj4 = this.bo;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.bo;
                            if (obj2 instanceof dxjf) {
                                if (this.bl == null) {
                                    this.bl = new irb(this, 27);
                                }
                                dzsj dzsjVar = this.bm;
                                if (dzsjVar == null) {
                                    dzsjVar = new irb(this, 30);
                                    this.bm = dzsjVar;
                                }
                                dzsj dzsjVar2 = this.bn;
                                if (dzsjVar2 == null) {
                                    dzsjVar2 = new irb(this, 31);
                                    this.bn = dzsjVar2;
                                }
                                bufr aP = aP();
                                dyyq.a(dsqa.c());
                                buew buewVar = new buew(dzsjVar, dzsjVar2, aP);
                                dxjc.d(this.bo, buewVar);
                                this.bo = buewVar;
                                obj2 = buewVar;
                            }
                        }
                        obj4 = obj2;
                    }
                    btrq E = E();
                    by();
                    btvg btvgVar = new btvg(bn.b(), (btvf) obj4, E, bn);
                    dxjc.d(this.bp, btvgVar);
                    this.bp = btvgVar;
                    obj = btvgVar;
                }
            }
            obj3 = obj;
        }
        return (btvg) obj3;
    }

    public final bucq ah() {
        return new bucq(rU(), new bubl(dcep.G(new buce(), new bucf(), new bucg(), new buch(), new buci(), new bucj(), new buck(), new bucl(), new bucn(), new buco(), new bucp(), new bucr(), new bucs(), new buct(), new bucu(), new bucv(), new bucw(), new bucx(), new bucy(), new bucz(), new buda(), new budb(), new budc(), new budd(), new bude(), new budf(), new budg(), new budh(), new budi(), new budj(), new budk(), new budl(), new budm(), new budn(), new budo(), new budp(), new budq(), new budr(), new buds(), new budt(), new budu(), new budv(), new budw(), new budx(), new budy(), new budz(), new buea(), new bueb(), new buec(), new bued(), new buee(), new buef(), new bueg(), new bueh(), new buei(), new buej(), new buek(), new buel(), new buem(), new buen(), new bueo(), new buep(), new bueq(), new buer(), new bues(), new buet(), new bueu(), new buev())), bp());
    }

    public final bubp ai() {
        return new bubp(this.b);
    }

    public final bszw aj() {
        Object obj;
        Object obj2 = this.bw;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bw;
                if (obj instanceof dxjf) {
                    bszw bszwVar = new bszw(this.a);
                    dxjc.d(this.bw, bszwVar);
                    this.bw = bszwVar;
                    obj = bszwVar;
                }
            }
            obj2 = obj;
        }
        return (bszw) obj2;
    }

    public final Object ak() {
        return new kuw(E(), p(), q(), (ktz) bu(), aI(), tg());
    }

    public final buis al() {
        Object obj;
        Object obj2 = this.bB;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bB;
                if (obj instanceof dxjf) {
                    dbsg i = dbsg.i(ag());
                    dzsj dzsjVar = this.bs;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 32);
                        this.bs = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    btus ab = ab();
                    dxio c2 = dxjc.c(ac());
                    dzsj dzsjVar2 = this.bt;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 34);
                        this.bt = dzsjVar2;
                    }
                    bubv bubvVar = new bubv(i, c, ab, c2, dxjc.c(dzsjVar2), this.a, new bucb(this.R, dxjh.c(ac()), dxjh.c(I())), bo(), bq(), U(), br(), rU(), bp(), y(), dxjc.c(bs()), sD(), dxjc.c(bt()), bv());
                    dxjc.d(this.bB, bubvVar);
                    this.bB = bubvVar;
                    obj = bubvVar;
                }
            }
            obj2 = obj;
        }
        return (buis) obj2;
    }

    public final dzsj<dmxf> am() {
        dzsj<dmxf> dzsjVar = this.bC;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 41);
            this.bC = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final btvg an() {
        Object obj;
        Object obj2 = this.bD;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bD;
                if (obj instanceof dxjf) {
                    btvf bm = bm();
                    btrq E = E();
                    by();
                    dzsj<dmxf> am = am();
                    URL a = bujj.a();
                    btvg btvgVar = new btvg(a, bm, E, new buiw(am, a));
                    dxjc.d(this.bD, btvgVar);
                    this.bD = btvgVar;
                    obj = btvgVar;
                }
            }
            obj2 = obj;
        }
        return (btvg) obj2;
    }

    public final btvg ao() {
        Object obj;
        Object obj2 = this.bE;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bE;
                if (obj instanceof dxjf) {
                    btvf bm = bm();
                    btrq E = E();
                    URL a = buaj.a(buak.b());
                    by();
                    btvg btvgVar = new btvg(a, bm, E, new buai(a));
                    dxjc.d(this.bE, btvgVar);
                    this.bE = btvgVar;
                    obj = btvgVar;
                }
            }
            obj2 = obj;
        }
        return (btvg) obj2;
    }

    public final Object ap() {
        Object obj = this.bH;
        if (obj == null) {
            buft buftVar = new buft(dxjc.c(bo()));
            this.bH = buftVar;
            return buftVar;
        }
        return obj;
    }

    public final buhf aq() {
        buhf buhfVar;
        Object obj = this.bM;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.bM;
                boolean z = obj2 instanceof dxjf;
                buhfVar = obj2;
                if (z) {
                    ckcw rU = rU();
                    btvo rp = rp();
                    btxc K = K();
                    dehq tg = tg();
                    bvjj bvjjVar = this.a;
                    dzsj dzsjVar = this.bL;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 48);
                        this.bL = dzsjVar;
                    }
                    final buhf buhfVar2 = new buhf(rU, rp, K, tg, bvjjVar, dxjc.c(dzsjVar), L(), M(), rY(), this.b, rR());
                    if (buhfVar2.g() && !buhfVar2.d.a()) {
                        if (buhfVar2.f != null) {
                            String str = buhfVar2.h;
                            if (!buhfVar2.c.z(bvjk.bJ, "").equals(str)) {
                                buhfVar2.c.ac(bvjk.bJ, str);
                                Executor executor = buhfVar2.b;
                                final bvgq bvgqVar = buhfVar2.f;
                                bvgqVar.getClass();
                                executor.execute(new Runnable(bvgqVar) { // from class: buhb
                                    private final bvgq a;

                                    {
                                        this.a = bvgqVar;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.a();
                                    }
                                });
                                buhfVar2.g.e();
                            }
                        }
                        buhfVar2.i.a().d(buhfVar2.a, buhfVar2.b);
                        buhfVar2.e.C().d(new crzp(buhfVar2) { // from class: buha
                            private final buhf a;

                            {
                                this.a = buhfVar2;
                            }

                            @Override // defpackage.crzp
                            public final void On(crzm crzmVar) {
                                buhf buhfVar3 = this.a;
                                String h = buhf.h((btlu) crzmVar.l());
                                if (!buhfVar3.h.equals(h)) {
                                    buhfVar3.c();
                                    buhfVar3.h = h;
                                    buhfVar3.c.ac(bvjk.bJ, buhfVar3.h);
                                }
                            }
                        }, buhfVar2.b);
                    }
                    dxjc.d(this.bM, buhfVar2);
                    this.bM = buhfVar2;
                    buhfVar = buhfVar2;
                }
            }
            obj = buhfVar;
        }
        return (buhf) obj;
    }

    public final bttx ar() {
        Object obj;
        Object obj2 = this.bR;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bR;
                if (obj instanceof dxjf) {
                    bttx bttxVar = new bttx(rU());
                    dxjc.d(this.bR, bttxVar);
                    this.bR = bttxVar;
                    obj = bttxVar;
                }
            }
            obj2 = obj;
        }
        return (bttx) obj2;
    }

    public final buhk as() {
        Object obj;
        Object obj2;
        Object obj3 = this.cb;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.cb;
                if (obj instanceof dxjf) {
                    Object obj4 = this.ca;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.ca;
                            if (obj2 instanceof dxjf) {
                                dxjc.d(this.ca, null);
                                this.ca = null;
                                obj2 = null;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = new buhk((bttj) obj4);
                    dxjc.d(this.cb, obj);
                    this.cb = obj;
                }
            }
            obj3 = obj;
        }
        return (buhk) obj3;
    }

    public final buhm at() {
        return new buhm(bd());
    }

    public final dzsj<buhr> au() {
        dzsj<buhr> dzsjVar = this.cc;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 56);
            this.cc = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final buho av() {
        Object obj;
        Object obj2 = this.cd;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.cd;
                if (obj instanceof dxjf) {
                    obj = new buho(rR(), this.a);
                    dxjc.d(this.cd, obj);
                    this.cd = obj;
                }
            }
            obj2 = obj;
        }
        return (buho) obj2;
    }

    public final buhq aw() {
        Object obj;
        Object obj2 = this.ce;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ce;
                if (obj instanceof dxjf) {
                    obj = new buhq(this.b, sz());
                    dxjc.d(this.ce, obj);
                    this.ce = obj;
                }
            }
            obj2 = obj;
        }
        return (buhq) obj2;
    }

    public final ckcz ax() {
        ckcj ckcjVar;
        Object obj = this.cg;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.cg;
                boolean z = obj2 instanceof dxjf;
                ckcjVar = obj2;
                if (z) {
                    final ckcj ckcjVar2 = new ckcj();
                    final Application application = this.b;
                    final dzsj dzsjVar = this.cf;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 63);
                        this.cf = dzsjVar;
                    }
                    o().k(new Runnable(ckcjVar2, application, dzsjVar) { // from class: ckcg
                        private final ckcj a;
                        private final Application b;
                        private final dzsj c;

                        {
                            this.a = ckcjVar2;
                            this.b = application;
                            this.c = dzsjVar;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            final ckcj ckcjVar3 = this.a;
                            Application application2 = this.b;
                            dzsj dzsjVar2 = this.c;
                            if (btsj.b(application2)) {
                                dbsg dbsgVar = (dbsg) dzsjVar2.a();
                                if (!dbsgVar.a()) {
                                    return;
                                }
                                cpcq<TResult> c = ((cnjq) dbsgVar.b()).c(new cnjp());
                                dege degeVar = dege.a;
                                c.p(degeVar, new cpcl(ckcjVar3) { // from class: ckch
                                    private final ckcj a;

                                    {
                                        this.a = ckcjVar3;
                                    }

                                    @Override // defpackage.cpcl
                                    public final void c(Object obj3) {
                                        this.a.a.j(dbsg.i(Integer.valueOf(((Integer) obj3).intValue())));
                                    }
                                });
                                c.o(degeVar, new cpci(ckcjVar3) { // from class: ckci
                                    private final ckcj a;

                                    {
                                        this.a = ckcjVar3;
                                    }

                                    @Override // defpackage.cpci
                                    public final void d(Exception exc) {
                                        this.a.a.j(dbpy.a);
                                    }
                                });
                                return;
                            }
                            ckcjVar3.a.j(dbpy.a);
                        }
                    }, tg(), bvkw.ON_STARTUP_FULLY_COMPLETE);
                    dxjc.d(this.cg, ckcjVar2);
                    this.cg = ckcjVar2;
                    ckcjVar = ckcjVar2;
                }
            }
            obj = ckcjVar;
        }
        return (ckcz) obj;
    }

    public final dzsj<bvrf> ay() {
        dzsj<bvrf> dzsjVar = this.ch;
        if (dzsjVar == null) {
            irb irbVar = new irb(this, 65);
            this.ch = irbVar;
            return irbVar;
        }
        return dzsjVar;
    }

    public final Object az() {
        return bukd.b(dxjc.c(Q()), D());
    }

    @Override // defpackage.iqz
    public final Context b() {
        return this.b;
    }

    @Override // defpackage.bvth
    public final bvtd ba() {
        return ad();
    }

    @Override // defpackage.ckcb
    public final cnkx bb() {
        Object obj;
        Object obj2 = this.aO;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aO;
                if (obj instanceof dxjf) {
                    dzsj dzsjVar = this.aN;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 19);
                        this.aN = dzsjVar;
                    }
                    dxjc.c(dzsjVar);
                    tg();
                    dxjc.d(this.aO, null);
                    this.aO = null;
                    obj = null;
                }
            }
            obj2 = obj;
        }
        return (cnkx) obj2;
    }

    @Override // defpackage.iqz
    public final Resources c() {
        Resources resources = this.b.getResources();
        dxjg.f(resources);
        return resources;
    }

    @Override // defpackage.iqz
    public final String d() {
        return this.T;
    }

    @Override // defpackage.iqz
    public final bvrv e() {
        return this.V;
    }

    @Override // defpackage.iqz
    public final cvgz f() {
        Object obj;
        Object obj2 = this.dg;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dg;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    cvgz cvgzVar = new cvgz(new bvqp(application, bvrj.BATTERY_MONITOR_THREAD), application);
                    dxjc.d(this.dg, cvgzVar);
                    this.dg = cvgzVar;
                    obj = cvgzVar;
                }
            }
            obj2 = obj;
        }
        return (cvgz) obj2;
    }

    @Override // defpackage.iqz
    public final csso g() {
        Object obj;
        Object obj2 = this.dh;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dh;
                if (obj instanceof dxjf) {
                    csso cssoVar = new csso(new bvqp(this.b, bvrj.MEMORY_MONITOR_THREAD));
                    dxjc.d(this.dh, cssoVar);
                    this.dh = cssoVar;
                    obj = cssoVar;
                }
            }
            obj2 = obj;
        }
        return (csso) obj2;
    }

    @Override // defpackage.iqz
    public final cvhf h() {
        Object obj;
        Object obj2 = this.di;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.di;
                if (obj instanceof dxjf) {
                    cvhf cvhfVar = new cvhf(V(), new bvqp(this.b, bvrj.NETWORK_MONITOR_THREAD));
                    dxjc.d(this.di, cvhfVar);
                    this.di = cvhfVar;
                    obj = cvhfVar;
                }
            }
            obj2 = obj;
        }
        return (cvhf) obj2;
    }

    @Override // defpackage.iqz
    public final bvsb i() {
        Object obj;
        Object obj2 = this.dm;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dm;
                if (obj instanceof dxjf) {
                    csso g = g();
                    dxio c = dxjc.c(I());
                    dxio c2 = dxjc.c(bf());
                    dxio c3 = dxjc.c(ay());
                    dxio c4 = dxjc.c(bg());
                    dzsj dzsjVar = this.dj;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 86);
                        this.dj = dzsjVar;
                    }
                    dxio c5 = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.dk;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 87);
                        this.dk = dzsjVar2;
                    }
                    dxjc.c(dzsjVar2);
                    dzsj<duxm> F = F();
                    dzsj dzsjVar3 = this.dl;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new irb(this, 88);
                        this.dl = dzsjVar3;
                    }
                    obj = new bvsb(g, c, c2, c3, c4, c5, F, dzsjVar3);
                    dxjc.d(this.dm, obj);
                    this.dm = obj;
                }
            }
            obj2 = obj;
        }
        return (bvsb) obj2;
    }

    @Override // defpackage.iqz
    public final cjvn j() {
        Object obj;
        Object obj2 = this.dn;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dn;
                if (obj instanceof dxjf) {
                    obj = new cjvn(rR(), rU());
                    dxjc.d(this.dn, obj);
                    this.dn = obj;
                }
            }
            obj2 = obj;
        }
        return (cjvn) obj2;
    }

    @Override // defpackage.iqz
    public final amqu k() {
        Object obj;
        Object obj2 = this.f30do;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.f30do;
                if (obj instanceof dxjf) {
                    amqu amquVar = new amqu(rR(), rU(), this.b, D());
                    amquVar.d.registerActivityLifecycleCallbacks(amquVar.h);
                    dxjc.d(this.f30do, amquVar);
                    this.f30do = amquVar;
                    obj = amquVar;
                }
            }
            obj2 = obj;
        }
        return (amqu) obj2;
    }

    @Override // defpackage.iqz
    public final awoe l() {
        return J();
    }

    @Override // defpackage.iqz
    public final cztz m() {
        Object obj;
        Object obj2 = this.dq;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dq;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    cztz cztzVar = new cztz(application);
                    application.registerActivityLifecycleCallbacks(new jbz(cztzVar));
                    dxjc.d(this.dq, cztzVar);
                    this.dq = cztzVar;
                    obj = cztzVar;
                }
            }
            obj2 = obj;
        }
        return (cztz) obj2;
    }

    @Override // defpackage.iqz
    public final ctu n() {
        Object obj;
        Object obj2 = this.dr;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dr;
                if (obj instanceof dxjf) {
                    obj = new ctu(this.b, tg());
                    dxjc.d(this.dr, obj);
                    this.dr = obj;
                }
            }
            obj2 = obj;
        }
        return (ctu) obj2;
    }

    @Override // defpackage.iqz
    public final bvkx o() {
        bvkx bvkxVar;
        Object obj = this.dt;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.dt;
                boolean z = obj2 instanceof dxjf;
                bvkxVar = obj2;
                if (z) {
                    bvrf D = D();
                    btrq E = E();
                    btxc K = K();
                    dxio c = dxjc.c(bc());
                    dzsj dzsjVar = this.ds;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 89);
                        this.ds = dzsjVar;
                    }
                    final bvkx bvkxVar2 = new bvkx(D, E, K, c, dxjc.c(dzsjVar));
                    if (bvkxVar2.k.getCount() == 0) {
                        bvkxVar2.f.b();
                        bvkxVar2.k = new CountDownLatch(1);
                    }
                    bvkxVar2.i.b();
                    if (bvkxVar2.e.a().a()) {
                        bvkxVar2.l();
                        bvkxVar2.n.b();
                    }
                    btrm btrmVar = bvkxVar2.d;
                    dceq a = dcet.a();
                    a.b(bvkb.class, new bvky(bvkb.class, bvkxVar2, bvrj.UI_THREAD));
                    btrmVar.g(bvkxVar2, a.a());
                    bvkxVar2.o.a().j().Pk(new Runnable(bvkxVar2) { // from class: bvkm
                        private final bvkx a;

                        {
                            this.a = bvkxVar2;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bvkx bvkxVar3 = this.a;
                            bvmn bvmnVar = bvmo.a;
                            bvkxVar3.f();
                        }
                    }, dege.a);
                    dxjc.d(this.dt, bvkxVar2);
                    this.dt = bvkxVar2;
                    bvkxVar = bvkxVar2;
                }
            }
            obj = bvkxVar;
        }
        return (bvkx) obj;
    }

    @Override // defpackage.iqz
    public final ktw p() {
        Object obj;
        Object obj2 = this.du;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.du;
                if (obj instanceof dxjf) {
                    obj = new ktw(rU());
                    dxjc.d(this.du, obj);
                    this.du = obj;
                }
            }
            obj2 = obj;
        }
        return (ktw) obj2;
    }

    @Override // defpackage.iqz
    public final ktx q() {
        Object obj;
        Object obj2 = this.dv;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dv;
                if (obj instanceof dxjf) {
                    obj = new ktx(y());
                    dxjc.d(this.dv, obj);
                    this.dv = obj;
                }
            }
            obj2 = obj;
        }
        return (ktx) obj2;
    }

    @Override // defpackage.iqz
    public final ckmm r() {
        Object obj;
        Object obj2 = this.dx;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dx;
                if (obj instanceof dxjf) {
                    dzsj dzsjVar = this.dw;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 90);
                        this.dw = dzsjVar;
                    }
                    ckmj ckmjVar = new ckmj(dzsjVar, dxjc.c(U()), F(), rR());
                    dxjc.d(this.dx, ckmjVar);
                    this.dx = ckmjVar;
                    obj = ckmjVar;
                }
            }
            obj2 = obj;
        }
        return (ckmm) obj2;
    }

    @Override // defpackage.bvjq
    public final bvjj rB() {
        return this.a;
    }

    @Override // defpackage.bvjq
    public final auf rC() {
        auf h = this.a.h();
        dxjg.f(h);
        return h;
    }

    @Override // defpackage.bwqz
    public final bwqv rD() {
        Object obj;
        Object obj2;
        Object obj3 = this.dc;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.dc;
                if (obj instanceof dxjf) {
                    final Application application = this.b;
                    Object obj4 = this.da;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.da;
                            if (obj2 instanceof dxjf) {
                                obj2 = new bwqy(this.b, L());
                                dxjc.d(this.da, obj2);
                                this.da = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    bwqw bwqwVar = (bwqw) obj4;
                    final bvrf D = D();
                    dzsj dzsjVar = this.db;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 85);
                        this.db = dzsjVar;
                    }
                    cqat rR = rR();
                    o();
                    bwqv bwqvVar = new bwqv(bwqwVar, dbud.a(new dbty(D, application) { // from class: bwqk
                        private final bvrb a;
                        private final Application b;

                        {
                            this.a = D;
                            this.b = application;
                        }

                        @Override // defpackage.dbty
                        public final Object a() {
                            bvrb bvrbVar = this.a;
                            Application application2 = this.b;
                            if (bvrbVar.g(bvrj.GMM_STORAGE) == null) {
                                bvqm.a(application2, bvrj.GMM_STORAGE, bvrbVar);
                            }
                            return bvrbVar;
                        }
                    }), dzsjVar, rR, Long.toString(bvoc.c(application)));
                    dxjc.d(this.dc, bwqvVar);
                    this.dc = bwqvVar;
                    obj = bwqvVar;
                }
            }
            obj3 = obj;
        }
        return (bwqv) obj3;
    }

    @Override // defpackage.btzd
    public final btze rE() {
        Object obj;
        dehq dehqVar;
        ckcw ckcwVar;
        cqat cqatVar;
        bugn bugnVar;
        bvkx bvkxVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.bO;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj = this.bO;
                if (obj instanceof dxjf) {
                    dzsj dzsjVar = this.bF;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 21);
                        this.bF = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.bG;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, 46);
                        this.bG = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    btuu aU = aU();
                    ckcw rU = rU();
                    cqat rR = rR();
                    bugn aS = aS();
                    bvkx o = o();
                    dehq tk = tk();
                    btpc sz = sz();
                    dcdc j = dcdc.j(dunb.class.getSimpleName(), dviq.class.getSimpleName(), dwaw.class.getSimpleName(), dwir.class.getSimpleName(), dvzj.class.getSimpleName());
                    dxjg.f(j);
                    akcl M = M();
                    boolean booleanValue = Z().booleanValue();
                    Object ap = ap();
                    dehq tk2 = tk();
                    cqat rR2 = rR();
                    Object obj6 = this.bI;
                    if (obj6 instanceof dxjf) {
                        synchronized (obj6) {
                            obj4 = this.bI;
                            dehqVar = tk;
                            if (obj4 instanceof dxjf) {
                                obj4 = bugh.a;
                                dxjc.d(this.bI, obj4);
                                this.bI = obj4;
                            }
                        }
                        obj6 = obj4;
                    } else {
                        dehqVar = tk;
                    }
                    Object obj7 = this.bK;
                    if (obj7 instanceof dxjf) {
                        synchronized (obj7) {
                            obj2 = this.bK;
                            bvkxVar = o;
                            if (obj2 instanceof dxjf) {
                                Application application = this.b;
                                Object obj8 = this.bJ;
                                bugnVar = aS;
                                if (obj8 instanceof dxjf) {
                                    synchronized (obj8) {
                                        obj3 = this.bJ;
                                        cqatVar = rR;
                                        if (obj3 instanceof dxjf) {
                                            obj3 = new bugi(sz());
                                            dxjc.d(this.bJ, obj3);
                                            this.bJ = obj3;
                                        }
                                    }
                                    obj8 = obj3;
                                } else {
                                    cqatVar = rR;
                                }
                                ckcwVar = rU;
                                bufm bufmVar = new bufm((ConnectivityManager) application.getSystemService("connectivity"), (bugi) obj8, rR());
                                dxjc.d(this.bK, bufmVar);
                                this.bK = bufmVar;
                                obj2 = bufmVar;
                            } else {
                                ckcwVar = rU;
                                cqatVar = rR;
                                bugnVar = aS;
                            }
                        }
                        obj7 = obj2;
                    } else {
                        ckcwVar = rU;
                        cqatVar = rR;
                        bugnVar = aS;
                        bvkxVar = o;
                    }
                    dbsg i = booleanValue ? !((buft) ap).a.optBoolean("migrate_sessions_early_v2", false) ? dbpy.a : dbsg.i(new bugz(tk2, (bugh) obj6, rR2, (bugq) obj7)) : dbpy.a;
                    dzsj<dixz> bo = bo();
                    dzsj dzsjVar3 = this.bN;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new irb(this, 47);
                        this.bN = dzsjVar3;
                    }
                    bugg buggVar = new bugg(c, c2, aU, ckcwVar, cqatVar, bugnVar, bvkxVar, dehqVar, sz, j, M, i, bo, dcdn.k(dvzj.class, dzsjVar3));
                    dxjc.d(this.bO, buggVar);
                    this.bO = buggVar;
                    obj = buggVar;
                }
            }
            obj5 = obj;
        }
        return (btze) obj5;
    }

    @Override // defpackage.akfb, defpackage.akpx
    public final akfa rK() {
        return M();
    }

    @Override // defpackage.bvjq
    public final bwsa rO() {
        bwsa e = this.a.e();
        dxjg.f(e);
        return e;
    }

    @Override // defpackage.bvpg, defpackage.akpx
    public final cqat rR() {
        cqat cqatVar = this.aL;
        if (cqatVar == null) {
            bvnu b = bvnw.b();
            this.aL = b;
            return b;
        }
        return cqatVar;
    }

    @Override // defpackage.bvpg, defpackage.akpx
    public final bvnx rS() {
        bvnx bvnxVar = this.aM;
        if (bvnxVar == null) {
            bvnu b = bvnw.b();
            this.aM = b;
            return b;
        }
        return bvnxVar;
    }

    @Override // defpackage.ckcu, defpackage.affs, defpackage.akpx
    public final ckcw rU() {
        Object obj;
        Object obj2 = this.cH;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.cH;
                if (obj instanceof dxjf) {
                    dzsj dzsjVar = this.cF;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 79);
                        this.cF = dzsjVar;
                    }
                    if (this.cG == null) {
                        this.cG = new irb(this, 84);
                    }
                    ckbg ckbgVar = new ckbg(dzsjVar, tg());
                    dxjc.d(this.cH, ckbgVar);
                    this.cH = ckbgVar;
                    obj = ckbgVar;
                }
            }
            obj2 = obj;
        }
        return (ckcw) obj2;
    }

    @Override // defpackage.btmw, defpackage.akpx
    public final btmv rY() {
        btmv btmvVar;
        Object obj = this.cl;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.cl;
                boolean z = obj2 instanceof dxjf;
                btmvVar = obj2;
                if (z) {
                    Application application = this.b;
                    csso g = g();
                    ckcw rU = rU();
                    dzsj dzsjVar = this.cj;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 66);
                        this.cj = dzsjVar;
                    }
                    dzsj dzsjVar2 = dzsjVar;
                    dzsj dzsjVar3 = this.ck;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new irb(this, 67);
                        this.ck = dzsjVar3;
                    }
                    btmv btmvVar2 = new btmv(application, g, rU, dzsjVar2, dzsjVar3, tg());
                    btnh.b = btmvVar2;
                    dxjc.d(this.cl, btmvVar2);
                    this.cl = btmvVar2;
                    btmvVar = btmvVar2;
                }
            }
            obj = btmvVar;
        }
        return (btmv) obj;
    }

    @Override // defpackage.btvq
    public final btvo rp() {
        btvo a = sx().a();
        dxjg.f(a);
        return a;
    }

    @Override // defpackage.btvq
    public final dujz rq() {
        dujz adsParameters = rp().getAdsParameters();
        dxjg.f(adsParameters);
        return adsParameters;
    }

    @Override // defpackage.btvq
    public final dklz rr() {
        dklz homeScreenParameters = rp().getHomeScreenParameters();
        dxjg.f(homeScreenParameters);
        return homeScreenParameters;
    }

    @Override // defpackage.btvq
    public final dvme rs() {
        dvme placeListsParameters = rp().getPlaceListsParameters();
        dxjg.f(placeListsParameters);
        return placeListsParameters;
    }

    @Override // defpackage.btvq
    public final dvsm rt() {
        dvsm searchParameters = rp().getSearchParameters();
        dxjg.f(searchParameters);
        return searchParameters;
    }

    @Override // defpackage.btvq
    public final duul ru() {
        duul hotelBookingModuleParameters = rp().getHotelBookingModuleParameters();
        dxjg.f(hotelBookingModuleParameters);
        return hotelBookingModuleParameters;
    }

    @Override // defpackage.btvq
    public final duod rv() {
        duod directionsExperimentsParameters = rp().getDirectionsExperimentsParameters();
        dxjg.f(directionsExperimentsParameters);
        return directionsExperimentsParameters;
    }

    @Override // defpackage.btpg
    public final btpa rx() {
        return bj();
    }

    @Override // defpackage.btri
    public final btrm rz() {
        return E();
    }

    @Override // defpackage.iqz
    public final ckmp s() {
        Object obj;
        Object obj2 = this.dy;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dy;
                if (obj instanceof dxjf) {
                    obj = new ckmp(D(), r());
                    dxjc.d(this.dy, obj);
                    this.dy = obj;
                }
            }
            obj2 = obj;
        }
        return (ckmp) obj2;
    }

    @Override // defpackage.aufd
    public final aufc sB() {
        Object obj;
        Object obj2;
        Object obj3 = this.Z;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.Z;
                if (obj instanceof dxjf) {
                    bvjj bvjjVar = this.a;
                    Object obj4 = this.W;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.W;
                            if (obj2 instanceof dxjf) {
                                obj2 = new crzo();
                                dxjc.d(this.W, obj2);
                                this.W = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    final aueu aueuVar = new aueu(bvjjVar, (crzo) obj4, new btsa(E()));
                    bvor.a(aueuVar.a, new mw(aueuVar) { // from class: auep
                        private final aueu a;

                        {
                            this.a = aueuVar;
                        }

                        @Override // defpackage.mw
                        public final void a(Object obj5) {
                            aueu aueuVar2 = this.a;
                            aueuVar2.i().d(((btsa) obj5).a, dege.a);
                            aueuVar2.b = true;
                        }
                    });
                    aueuVar.g();
                    dxjc.d(this.Z, aueuVar);
                    this.Z = aueuVar;
                    obj = aueuVar;
                }
            }
            obj3 = obj;
        }
        return (aueu) obj3;
    }

    @Override // defpackage.gch
    public final gce sC() {
        return T();
    }

    @Override // defpackage.gch
    public final gcg sD() {
        Object obj;
        Object obj2 = this.aK;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aK;
                if (obj instanceof dxjf) {
                    gcg gcgVar = new gcg(dxjc.c(U()));
                    dxjc.d(this.aK, gcgVar);
                    this.aK = gcgVar;
                    obj = gcgVar;
                }
            }
            obj2 = obj;
        }
        return (gcg) obj2;
    }

    @Override // defpackage.btyg
    public final btyh sJ() {
        return bi();
    }

    @Override // defpackage.bvrk
    public final crzb sO() {
        crzb crzbVar = this.cI;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.UI_THREAD);
            this.cI = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final crzb sP() {
        crzb crzbVar = this.cJ;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.BACKGROUND_THREADPOOL);
            this.cJ = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final crzb sQ() {
        crzb crzbVar = this.cK;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.TILE_PREP_THREADPOOL);
            this.cK = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final crzb sR() {
        crzb crzbVar = this.cL;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.LABELING_THREAD);
            this.cL = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final crzb sS() {
        crzb crzbVar = this.cM;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.GMM_PICKER);
            this.cM = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final crzb sT() {
        crzb crzbVar = this.cN;
        if (crzbVar == null) {
            bvqe bvqeVar = new bvqe(bvrj.LOCATION_SENSORS);
            this.cN = bvqeVar;
            return bvqeVar;
        }
        return crzbVar;
    }

    @Override // defpackage.bvrk
    public final Executor sU() {
        return tf();
    }

    @Override // defpackage.bvrk
    public final Executor sV() {
        return tg();
    }

    @Override // defpackage.bvrk
    public final Executor sW() {
        dehq dehqVar = this.cO;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.DOWNLOADER_THREADPOOL, rR()));
            dxjg.f(d);
            this.cO = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final Executor sX() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new bvqp(this.b, bvrj.GMM_PICKER));
        dxjg.f(newSingleThreadExecutor);
        return newSingleThreadExecutor;
    }

    @Override // defpackage.bvrk
    public final Executor sY() {
        dehq dehqVar = this.cP;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.LOW_PRIORITY_BACKGROUND_THREADPOOL, rR()));
            dxjg.f(d);
            this.cP = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq sZ() {
        dehq dehqVar = this.cQ;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.OFFLINE_REGION_PROCESSING_THREADPOOL, rR()));
            dxjg.f(d);
            this.cQ = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final btwd sb() {
        btwd navigationParameters = rp().getNavigationParameters();
        dxjg.f(navigationParameters);
        return navigationParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dkiy sc() {
        dkiy enableFeatureParameters = rp().getEnableFeatureParameters();
        dxjg.f(enableFeatureParameters);
        return enableFeatureParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final duxm sd() {
        duxm loggingParameters = rp().getLoggingParameters();
        dxjg.f(loggingParameters);
        return loggingParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dkks se() {
        dkks exploreMapParametersWithoutLogging = rp().getExploreMapParametersWithoutLogging();
        dxjg.f(exploreMapParametersWithoutLogging);
        return exploreMapParametersWithoutLogging;
    }

    @Override // defpackage.btvq
    public final dkux sf() {
        dkux passiveAssistParameters = rp().getPassiveAssistParameters();
        dxjg.f(passiveAssistParameters);
        return passiveAssistParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dvsb sg() {
        dvsb savedStateExpirationParameters = rp().getSavedStateExpirationParameters();
        dxjg.f(savedStateExpirationParameters);
        return savedStateExpirationParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dvtk sh() {
        dvtk sqliteTileCacheParameters = rp().getSqliteTileCacheParameters();
        dxjg.f(sqliteTileCacheParameters);
        return sqliteTileCacheParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dwwr si() {
        dwwr vectorMapsParameters = rp().getVectorMapsParameters();
        dxjg.f(vectorMapsParameters);
        return vectorMapsParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dvcz sj() {
        dvcz memoryManagementParameters = rp().getMemoryManagementParameters();
        dxjg.f(memoryManagementParameters);
        return memoryManagementParameters;
    }

    @Override // defpackage.btvq
    public final duov sk() {
        duov directionsPageParameters = rp().getDirectionsPageParameters();
        dxjg.f(directionsPageParameters);
        return directionsPageParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final duxu sl() {
        duxu mapLayersParameters = rp().getMapLayersParameters();
        dxjg.f(mapLayersParameters);
        return mapLayersParameters;
    }

    @Override // defpackage.btvq
    public final duwy sm() {
        duwy locationParameters = rp().getLocationParameters();
        dxjg.f(locationParameters);
        return locationParameters;
    }

    @Override // defpackage.btvq
    public final dkog sn() {
        dkog locationSharingParameters = rp().getLocationSharingParameters();
        dxjg.f(locationSharingParameters);
        return locationSharingParameters;
    }

    @Override // defpackage.btvq, defpackage.akpx
    public final dkwa so() {
        dkwa systemHealthParameters = rp().getSystemHealthParameters();
        dxjg.f(systemHealthParameters);
        return systemHealthParameters;
    }

    @Override // defpackage.btxr
    public final btwr sx() {
        Object obj = this.cw;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                try {
                    Object obj2 = this.cw;
                    boolean z = obj2 instanceof dxjf;
                    btxa btxaVar = obj2;
                    if (z) {
                        Application application = this.b;
                        dehq tg = tg();
                        cqat rR = rR();
                        bvjj bvjjVar = this.a;
                        dxio c = dxjc.c(aA());
                        dxio c2 = dxjc.c(I());
                        dxio c3 = dxjc.c(aC());
                        dzsj dzsjVar = this.cr;
                        if (dzsjVar == null) {
                            dzsjVar = new irb(this, 73);
                            this.cr = dzsjVar;
                        }
                        dxio c4 = dxjc.c(dzsjVar);
                        dxio c5 = dxjc.c(be());
                        btwk btwkVar = new btwk(E(), K());
                        dzsj dzsjVar2 = this.cs;
                        if (dzsjVar2 == null) {
                            dzsjVar2 = new irb(this, 74);
                            this.cs = dzsjVar2;
                        }
                        dxjc.c(dzsjVar2);
                        dxio c6 = dxjc.c(aD());
                        dzsj dzsjVar3 = this.cu;
                        if (dzsjVar3 == null) {
                            dzsjVar3 = new irb(this, 76);
                            this.cu = dzsjVar3;
                        }
                        dxio c7 = dxjc.c(dzsjVar3);
                        dzsj dzsjVar4 = this.cv;
                        if (dzsjVar4 == null) {
                            dzsjVar4 = new irb(this, 77);
                            this.cv = dzsjVar4;
                        }
                        dxio c8 = dxjc.c(dzsjVar4);
                        affr L = L();
                        btwj btwjVar = new btwj(rR, tg, c2, c6);
                        try {
                            final btxa btxaVar2 = new btxa(c5, new btwm(application, rR, c2, tg, L), new btxk(new btwo(application, c, c2, c3, c4, btwjVar), application, tg, rR, c2, c5, btwjVar), btwkVar, btwjVar, tg, c8, c7, L, bvjjVar, c2, rR);
                            tg.execute(new Runnable(btxaVar2) { // from class: btws
                                private final btxa a;

                                {
                                    this.a = btxaVar2;
                                }

                                /* JADX WARN: Removed duplicated region for block: B:17:0x003e A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:9:0x0026, B:13:0x002f, B:15:0x003a, B:17:0x003e, B:18:0x0040, B:20:0x0057, B:22:0x0064, B:23:0x0067, B:21:0x005f, B:14:0x0038), top: B:33:0x0026 }] */
                                /* JADX WARN: Removed duplicated region for block: B:20:0x0057 A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:9:0x0026, B:13:0x002f, B:15:0x003a, B:17:0x003e, B:18:0x0040, B:20:0x0057, B:22:0x0064, B:23:0x0067, B:21:0x005f, B:14:0x0038), top: B:33:0x0026 }] */
                                /* JADX WARN: Removed duplicated region for block: B:21:0x005f A[Catch: all -> 0x00a9, TryCatch #0 {, blocks: (B:9:0x0026, B:13:0x002f, B:15:0x003a, B:17:0x003e, B:18:0x0040, B:20:0x0057, B:22:0x0064, B:23:0x0067, B:21:0x005f, B:14:0x0038), top: B:33:0x0026 }] */
                                @Override // java.lang.Runnable
                                /*
                                    Code decompiled incorrectly, please refer to instructions dump.
                                    To view partially-correct add '--show-bad-code' argument
                                */
                                public final void run() {
                                    /*
                                        r10 = this;
                                        btxa r0 = r10.a
                                        cqat r1 = r0.f
                                        long r1 = r1.e()
                                        affr r3 = r0.d
                                        boolean r3 = r3.a()
                                        if (r3 == 0) goto L1f
                                        affr r3 = r0.d
                                        boolean r3 = r3.c()
                                        if (r3 != 0) goto L1f
                                        btwm r3 = r0.b
                                        btyu r3 = r3.e()
                                        goto L25
                                    L1f:
                                        btwm r3 = r0.b
                                        btyu r3 = r3.a()
                                    L25:
                                        monitor-enter(r0)
                                        int r4 = r0.k     // Catch: java.lang.Throwable -> La9
                                        r5 = 1
                                        r6 = 3
                                        if (r4 == r6) goto L38
                                        if (r3 != 0) goto L2f
                                        goto L38
                                    L2f:
                                        boolean r4 = defpackage.btwz.c(r4)     // Catch: java.lang.Throwable -> La9
                                        r4 = r4 ^ r5
                                        defpackage.dbsk.a(r4)     // Catch: java.lang.Throwable -> La9
                                        goto L3a
                                    L38:
                                        btyu r3 = defpackage.btyu.f     // Catch: java.lang.Throwable -> La9
                                    L3a:
                                        dund r4 = r3.e     // Catch: java.lang.Throwable -> La9
                                        if (r4 != 0) goto L40
                                        dund r4 = defpackage.dund.c     // Catch: java.lang.Throwable -> La9
                                    L40:
                                        java.lang.String r7 = r3.b     // Catch: java.lang.Throwable -> La9
                                        java.lang.String r7 = defpackage.dbsj.f(r7)     // Catch: java.lang.Throwable -> La9
                                        dspd r8 = r4.b     // Catch: java.lang.Throwable -> La9
                                        dsrj<dvgo> r4 = r4.a     // Catch: java.lang.Throwable -> La9
                                        btwj r9 = r0.g     // Catch: java.lang.Throwable -> La9
                                        r9.d(r7, r8, r4)     // Catch: java.lang.Throwable -> La9
                                        btyu r4 = defpackage.btyu.f     // Catch: java.lang.Throwable -> La9
                                        boolean r4 = r3.equals(r4)     // Catch: java.lang.Throwable -> La9
                                        if (r4 != 0) goto L5f
                                        r0.j = r5     // Catch: java.lang.Throwable -> La9
                                        long r7 = r3.d     // Catch: java.lang.Throwable -> La9
                                        r0.h = r7     // Catch: java.lang.Throwable -> La9
                                        r4 = 2
                                        goto L64
                                    L5f:
                                        r7 = 0
                                        r0.h = r7     // Catch: java.lang.Throwable -> La9
                                        r4 = 3
                                    L64:
                                        r0.k(r4)     // Catch: java.lang.Throwable -> La9
                                        monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
                                        btwk r7 = r0.l
                                        btwj r8 = r0.g
                                        if (r4 != r6) goto L6f
                                        goto L70
                                    L6f:
                                        r5 = 0
                                    L70:
                                        r7.a(r8, r5)
                                        cqat r4 = r0.f
                                        long r4 = r4.e()
                                        java.util.concurrent.Executor r6 = r0.c
                                        btwv r7 = new btwv
                                        long r4 = r4 - r1
                                        r7.<init>(r0, r4)
                                        r6.execute(r7)
                                        java.util.concurrent.Executor r1 = r0.c
                                        btwt r2 = new btwt
                                        r2.<init>(r0, r3)
                                        r1.execute(r2)
                                        dxio<akfa> r1 = r0.a
                                        java.lang.Object r1 = r1.a()
                                        akfa r1 = (defpackage.akfa) r1
                                        dehn r1 = r1.l()
                                        btwu r2 = new btwu
                                        r2.<init>(r0, r3)
                                        degu r0 = defpackage.bvqj.b(r2)
                                        dege r2 = defpackage.dege.a
                                        defpackage.deha.q(r1, r0, r2)
                                        return
                                    La9:
                                        r1 = move-exception
                                        monitor-exit(r0)     // Catch: java.lang.Throwable -> La9
                                        throw r1
                                    */
                                    throw new UnsupportedOperationException("Method not decompiled: defpackage.btws.run():void");
                                }
                            });
                            dxjc.d(this.cw, btxaVar2);
                            this.cw = btxaVar2;
                            btxaVar = btxaVar2;
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                    obj = btxaVar;
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        }
        return (btwr) obj;
    }

    @Override // defpackage.btxr
    public final dbsg sy() {
        Object obj;
        Object obj2 = this.cx;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.cx;
                if (obj instanceof dxjf) {
                    sx();
                    obj = dbpy.a;
                    dxjc.d(this.cx, obj);
                    this.cx = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }

    @Override // defpackage.btpd
    public final btpc sz() {
        Object obj;
        Object obj2 = this.aQ;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aQ;
                if (obj instanceof dxjf) {
                    btpc btpcVar = new btpc(this.b, bi());
                    btpcVar.h();
                    dxjc.d(this.aQ, btpcVar);
                    this.aQ = btpcVar;
                    obj = btpcVar;
                }
            }
            obj2 = obj;
        }
        return (btpc) obj2;
    }

    @Override // defpackage.iqz
    public final ckov t() {
        return N();
    }

    @Override // defpackage.bvrk
    public final Executor ta() {
        return tk();
    }

    @Override // defpackage.bvrk
    public final Executor tb() {
        dehq dehqVar = this.cR;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.ALERT_CONTROLLER, rR()));
            dxjg.f(d);
            this.cR = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq tc() {
        dehq d = dehx.d(Executors.newSingleThreadScheduledExecutor(new bvqp(this.b, bvrj.LABELING_THREAD)));
        dxjg.f(d);
        return d;
    }

    @Override // defpackage.bvrk
    public final dehq td() {
        dehq dehqVar = this.cS;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.TILE_PREP_THREADPOOL, rR()));
            dxjg.f(d);
            this.cS = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq te() {
        dehq dehqVar = this.cT;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.ROAD_GRAPH_TILE_PREP_THREADPOOL, rR()));
            dxjg.f(d);
            this.cT = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq tf() {
        dehq dehqVar = this.cU;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.UI_THREAD, rR()));
            dxjg.f(d);
            this.cU = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq tg() {
        dehq dehqVar = this.cV;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.BACKGROUND_THREADPOOL, rR()));
            dxjg.f(d);
            this.cV = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq th() {
        dehq dehqVar = this.cW;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.LAYOUT_INFLATER_THREADPOOL, rR()));
            dxjg.f(d);
            this.cW = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq ti() {
        dehq dehqVar = this.cX;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.LOCATION_DISPATCHER, rR()));
            dxjg.f(d);
            this.cX = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq tj() {
        dehq dehqVar = this.cY;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.NAVIGATION_INTERNAL, rR()));
            dxjg.f(d);
            this.cY = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehq tk() {
        dehq dehqVar = this.cZ;
        if (dehqVar == null) {
            dehq d = dehx.d(bvpw.a(dxjc.c(ay()), bvrj.NETWORK_THREADPOOL, rR()));
            dxjg.f(d);
            this.cZ = d;
            return d;
        }
        return dehqVar;
    }

    @Override // defpackage.bvrk
    public final dehp tl() {
        return tg();
    }

    @Override // defpackage.bvrk
    public final dehp tm() {
        return th();
    }

    @Override // defpackage.bvrk
    public final bvrb tn() {
        return D();
    }

    @Override // defpackage.cjqr
    public final cjqq tp() {
        return R();
    }

    @Override // defpackage.btvu
    public final btvt tq() {
        return S();
    }

    @Override // defpackage.cjqz
    public final cjqy tr() {
        return S();
    }

    @Override // defpackage.iqz
    public final ckox u() {
        return bh();
    }

    @Override // defpackage.iqz
    public final btxn v() {
        return aB();
    }

    @Override // defpackage.btvq
    public final btxc vt() {
        return K();
    }

    @Override // defpackage.bvpg
    public final cqba vu() {
        cqba cqbaVar = this.dG;
        if (cqbaVar == null) {
            cqba cqbaVar2 = new cqba(this.b);
            this.dG = cqbaVar2;
            return cqbaVar2;
        }
        return cqbaVar;
    }

    @Override // defpackage.iqz
    public final btsc w() {
        Object obj;
        Object obj2 = this.dB;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dB;
                if (obj instanceof dxjf) {
                    Application application = this.b;
                    dzsj dzsjVar = this.dz;
                    if (dzsjVar == null) {
                        dzsjVar = new irb(this, 102);
                        this.dz = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dxio c2 = dxjc.c(be());
                    dxio c3 = dxjc.c(I());
                    dxio c4 = dxjc.c(aD());
                    dzsj dzsjVar2 = this.dA;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new irb(this, R.styleable.AppCompatTheme_textAppearanceListItem);
                        this.dA = dzsjVar2;
                    }
                    obj = new btsc(application, c, c2, c3, c4, dxjc.c(dzsjVar2), O(), dxjc.c(bc()));
                    dxjc.d(this.dB, obj);
                    this.dB = obj;
                }
            }
            obj2 = obj;
        }
        return (btsc) obj2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kuu] */
    @Override // defpackage.iqz
    public final kuu x() {
        return ak();
    }

    @Override // defpackage.iqz
    public final btyy y() {
        Object obj;
        Object obj2 = this.dD;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.dD;
                if (obj instanceof dxjf) {
                    obj = new btyy();
                    dxjc.d(this.dD, obj);
                    this.dD = obj;
                }
            }
            obj2 = obj;
        }
        return (btyy) obj2;
    }

    @Override // defpackage.iqz
    public final dbsg<ddlj> z() {
        dbsg<ddlj> a = ((kuw) ak()).a.a();
        dxjg.f(a);
        return a;
    }
}
