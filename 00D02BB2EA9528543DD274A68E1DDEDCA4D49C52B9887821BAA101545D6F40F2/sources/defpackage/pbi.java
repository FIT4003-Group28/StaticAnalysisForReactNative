package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.apps.maps.R;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: pbi  reason: default package */
/* loaded from: classes7.dex */
public final class pbi implements pbj {
    private volatile dzsj<cvlr> H;
    private volatile dzsj<Set<drtm>> L;
    public final Context a;
    private volatile dzsj<Set<cvpv>> aB;
    private volatile dzsj<cvny> aP;
    private volatile dzsj<cvnz> aR;
    private volatile dzsj<cvoa> aT;
    private volatile dzsj<cvod> aV;
    private volatile dzsj<cvnt> aX;
    private volatile dzsj<cvnw> aZ;
    private volatile dzsj<cvma> ac;
    public final dbsg<cvtk> b;
    private final dzsj<dbsg<cvto>> bB;
    private volatile dzsj<cvnx> bb;
    private volatile dzsj<cvoc> bd;
    private volatile dzsj<SharedPreferences> bg;
    private volatile dzsj<Boolean> bn;
    private volatile dzsj<Long> bo;
    private volatile dzsj<Map<Integer, cvos>> bt;
    public final amfi c;
    public final gdo d;
    public final ckcw e;
    public final Executor f;
    private final cvjr i;
    private final String j;
    private final ped k;
    private final cvtx l;
    private final dehp m;
    private final dbsg<cvtj> n;
    private final dbsg<cvti> o;
    private volatile bvtd w;
    private volatile Object p = new dxjf();
    private volatile Object q = new dxjf();
    private volatile Object r = new dxjf();
    private volatile Object s = new dxjf();
    private volatile Object t = new dxjf();
    private volatile Object u = new dxjf();
    private volatile Object v = new dxjf();
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
    private volatile Object I = new dxjf();
    private volatile Object J = new dxjf();
    private volatile Object K = new dxjf();
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
    public volatile Object g = new dxjf();
    private volatile Object ad = new dxjf();
    private volatile Object ae = new dxjf();
    private volatile Object af = new dxjf();
    private volatile Object ag = new dxjf();
    private volatile Object ah = new dxjf();
    private volatile Object ai = new dxjf();
    private volatile Object aj = new dxjf();
    private volatile Object ak = new dxjf();
    private volatile Object al = new dxjf();
    private volatile Object am = new dxjf();
    private volatile Object an = new dxjf();
    private volatile Object ao = new dxjf();
    private volatile Object ap = new dxjf();
    private volatile Object aq = new dxjf();
    private volatile Object ar = new dxjf();
    private volatile Object as = new dxjf();
    private volatile Object at = new dxjf();
    private volatile Object au = new dxjf();
    private volatile Object av = new dxjf();
    private volatile Object aw = new dxjf();
    private volatile Object ax = new dxjf();
    private volatile Object ay = new dxjf();
    private volatile Object az = new dxjf();
    private volatile Object aA = new dxjf();
    private volatile Object aC = new dxjf();
    private volatile Object aD = new dxjf();
    private volatile Object aE = new dxjf();
    private volatile Object aF = new dxjf();
    private volatile Object aG = new dxjf();
    private volatile Object aH = new dxjf();
    private volatile Object aI = new dxjf();
    private volatile Object aJ = new dxjf();
    private volatile Object aK = new dxjf();
    private volatile Object aL = new dxjf();
    private volatile Object aM = new dxjf();
    private volatile Object aN = new dxjf();
    private volatile Object aO = new dxjf();
    private volatile Object aQ = new dxjf();
    private volatile Object aS = new dxjf();
    private volatile Object aU = new dxjf();
    private volatile Object aW = new dxjf();
    private volatile Object aY = new dxjf();
    private volatile Object ba = new dxjf();
    private volatile Object bc = new dxjf();
    private volatile Object be = new dxjf();
    private volatile Object bf = new dxjf();
    private volatile Object bh = new dxjf();
    private volatile Object bi = new dxjf();
    private volatile Object bj = new dxjf();
    private volatile Object bk = new dxjf();
    private volatile Object bl = new dxjf();
    private volatile Object bm = new dxjf();
    private volatile Object bp = new dxjf();
    private volatile Object bq = new dxjf();
    private volatile Object br = new dxjf();
    public volatile Object h = new dxjf();
    private volatile Object bs = new dxjf();
    private volatile Object bu = new dxjf();
    private volatile Object bv = new dxjf();
    private volatile Object bw = new dxjf();
    private volatile Object bx = new dxjf();
    private volatile Object by = new dxjf();
    private volatile Object bz = new dxjf();
    private volatile Object bA = new dxjf();

    public pbi(Context context, cvjr cvjrVar, ped pedVar, String str, cvtx cvtxVar, dbsg<cvto> dbsgVar, dbsg<cvtj> dbsgVar2, dbsg<cvtk> dbsgVar3, dbsg<cvti> dbsgVar4, dehp dehpVar, Executor executor, amfi amfiVar, gdo gdoVar, ckcw ckcwVar) {
        this.a = context;
        this.i = cvjrVar;
        this.j = str;
        this.k = pedVar;
        this.l = cvtxVar;
        this.m = dehpVar;
        this.n = dbsgVar2;
        this.b = dbsgVar3;
        this.o = dbsgVar4;
        this.c = amfiVar;
        this.d = gdoVar;
        this.e = ckcwVar;
        this.f = executor;
        this.bB = dxjd.b(dbsgVar);
    }

    private final dbsg<pbe> A() {
        Object obj;
        Object obj2 = this.x;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.x;
                if (obj instanceof dxjf) {
                    ped pedVar = this.k;
                    bvtd bvtdVar = this.w;
                    if (bvtdVar == null) {
                        bvtdVar = new bvtd();
                        this.w = bvtdVar;
                    }
                    obj = dbsg.i(new pbe(pedVar, bvtdVar));
                    dxjc.d(this.x, obj);
                    this.x = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }

    private final Object B() {
        Object obj;
        Object obj2 = this.y;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.y;
                if (obj instanceof dxjf) {
                    cvnj cvnjVar = new cvnj(A(), v());
                    dxjc.d(this.y, cvnjVar);
                    this.y = cvnjVar;
                    obj = cvnjVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final cvnm C() {
        Object obj;
        Object obj2 = this.z;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.z;
                if (obj instanceof dxjf) {
                    obj = new cvnm(this.a, v(), w(), (cvnj) B());
                    dxjc.d(this.z, obj);
                    this.z = obj;
                }
            }
            obj2 = obj;
        }
        return (cvnm) obj2;
    }

    private final cvor D() {
        cvox cvoxVar;
        Object obj = this.B;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.B;
                boolean z = obj2 instanceof dxjf;
                cvoxVar = obj2;
                if (z) {
                    cvox cvoxVar2 = new cvox();
                    cvoxVar2.a = this.a;
                    cvoxVar2.b = v();
                    dxjc.d(this.B, cvoxVar2);
                    this.B = cvoxVar2;
                    cvoxVar = cvoxVar2;
                }
            }
            obj = cvoxVar;
        }
        return (cvor) obj;
    }

    private final Object E() {
        Object obj;
        Object obj2 = this.D;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.D;
                if (obj instanceof dxjf) {
                    cvsk cvskVar = new cvsk(this.a);
                    dxjc.d(this.D, cvskVar);
                    this.D = cvskVar;
                    obj = cvskVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final Object F() {
        Object obj;
        Object obj2 = this.E;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.E;
                if (obj instanceof dxjf) {
                    cvsr cvsrVar = new cvsr(this.a);
                    dxjc.d(this.E, cvsrVar);
                    this.E = cvsrVar;
                    obj = cvsrVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final pbk G() {
        return new pbk(this.m);
    }

    private final cvkq H() {
        Object obj;
        Object obj2 = this.I;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.I;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    cvkf u = u();
                    dzsj dzsjVar = this.H;
                    if (dzsjVar == null) {
                        dzsjVar = new pbh(this, 1);
                        this.H = dzsjVar;
                    }
                    obj = new cvkq(context, u, dxjc.c(dzsjVar), cqau.b());
                    dxjc.d(this.I, obj);
                    this.I = obj;
                }
            }
            obj2 = obj;
        }
        return (cvkq) obj2;
    }

    private final Object I() {
        Object obj;
        Object obj2 = this.J;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.J;
                if (obj instanceof dxjf) {
                    cvss cvssVar = new cvss(this.a, u(), H());
                    dxjc.d(this.J, cvssVar);
                    this.J = cvssVar;
                    obj = cvssVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final cvng J() {
        Object obj;
        Object obj2 = this.M;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.M;
                if (obj instanceof dxjf) {
                    cvng cvngVar = new cvng(this.a);
                    dxjc.d(this.M, cvngVar);
                    this.M = cvngVar;
                    obj = cvngVar;
                }
            }
            obj2 = obj;
        }
        return (cvng) obj2;
    }

    private final cvni K() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4 = this.N;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.N;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    cvjs v = v();
                    dbsg<pbe> A = A();
                    cvor D = D();
                    Object obj5 = this.K;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.K;
                            if (obj2 instanceof dxjf) {
                                Object obj6 = this.C;
                                if (obj6 instanceof dxjf) {
                                    synchronized (obj6) {
                                        obj3 = this.C;
                                        if (obj3 instanceof dxjf) {
                                            cvrs cvrsVar = new cvrs(this.a);
                                            dxjc.d(this.C, cvrsVar);
                                            this.C = cvrsVar;
                                            obj3 = cvrsVar;
                                        }
                                    }
                                    obj6 = obj3;
                                }
                                cvsb cvsbVar = new cvsb((cvrs) obj6, (cvsc) E(), (cvsd) F(), (cvsf) I());
                                dxjc.d(this.K, cvsbVar);
                                this.K = cvsbVar;
                                obj2 = cvsbVar;
                            }
                        }
                        obj5 = obj2;
                    }
                    dbsg i = dbsg.i((cvmu) obj5);
                    dzsj dzsjVar = this.L;
                    if (dzsjVar == null) {
                        dzsjVar = new pbh(this, 2);
                        this.L = dzsjVar;
                    }
                    obj = new cvni(context, v, A, D, i, new cvmx(dzsjVar, dxjj.a), J());
                    dxjc.d(this.N, obj);
                    this.N = obj;
                }
            }
            obj4 = obj;
        }
        return (cvni) obj4;
    }

    private final Context L() {
        Context context = (Context) ((dbsu) dbsg.i(this.a)).a;
        dxjg.f(context);
        return context;
    }

    private final cvnl M() {
        Object obj;
        Object obj2 = this.X;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.X;
                if (obj instanceof dxjf) {
                    obj = new cvnl(v(), w(), K(), C(), (cvnj) B(), ak(), u(), a());
                    dxjc.d(this.X, obj);
                    this.X = obj;
                }
            }
            obj2 = obj;
        }
        return (cvnl) obj2;
    }

    private final cvmy N() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12 = this.Z;
        if (obj12 instanceof dxjf) {
            synchronized (obj12) {
                obj = this.Z;
                if (obj instanceof dxjf) {
                    Object obj13 = this.A;
                    if (obj13 instanceof dxjf) {
                        synchronized (obj13) {
                            obj11 = this.A;
                            if (obj11 instanceof dxjf) {
                                obj11 = new cvmw(v(), C());
                                dxjc.d(this.A, obj11);
                                this.A = obj11;
                            }
                        }
                        obj13 = obj11;
                    }
                    cvmw cvmwVar = (cvmw) obj13;
                    cvtx cvtxVar = this.l;
                    Object obj14 = this.O;
                    if (obj14 instanceof dxjf) {
                        synchronized (obj14) {
                            obj10 = this.O;
                            if (obj10 instanceof dxjf) {
                                cvmz cvmzVar = new cvmz(v(), C(), K());
                                dxjc.d(this.O, cvmzVar);
                                this.O = cvmzVar;
                                obj10 = cvmzVar;
                            }
                        }
                        obj14 = obj10;
                    }
                    Object obj15 = this.P;
                    if (obj15 instanceof dxjf) {
                        synchronized (obj15) {
                            obj9 = this.P;
                            if (obj9 instanceof dxjf) {
                                cvna cvnaVar = new cvna(v(), C());
                                dxjc.d(this.P, cvnaVar);
                                this.P = cvnaVar;
                                obj9 = cvnaVar;
                            }
                        }
                        obj15 = obj9;
                    }
                    Object obj16 = this.Q;
                    if (obj16 instanceof dxjf) {
                        synchronized (obj16) {
                            obj8 = this.Q;
                            if (obj8 instanceof dxjf) {
                                cvnb cvnbVar = new cvnb(v(), K(), C());
                                dxjc.d(this.Q, cvnbVar);
                                this.Q = cvnbVar;
                                obj8 = cvnbVar;
                            }
                        }
                        obj16 = obj8;
                    }
                    cvnb cvnbVar2 = (cvnb) obj16;
                    Object obj17 = this.R;
                    if (obj17 instanceof dxjf) {
                        synchronized (obj17) {
                            obj7 = this.R;
                            if (obj7 instanceof dxjf) {
                                cvnc cvncVar = new cvnc(v(), K(), C());
                                dxjc.d(this.R, cvncVar);
                                this.R = cvncVar;
                                obj7 = cvncVar;
                            }
                        }
                        obj17 = obj7;
                    }
                    cvnc cvncVar2 = (cvnc) obj17;
                    Object obj18 = this.S;
                    if (obj18 instanceof dxjf) {
                        synchronized (obj18) {
                            obj6 = this.S;
                            if (obj6 instanceof dxjf) {
                                cvnd cvndVar = new cvnd(v(), K(), C());
                                dxjc.d(this.S, cvndVar);
                                this.S = cvndVar;
                                obj6 = cvndVar;
                            }
                        }
                        obj18 = obj6;
                    }
                    cvnd cvndVar2 = (cvnd) obj18;
                    Object obj19 = this.T;
                    if (obj19 instanceof dxjf) {
                        synchronized (obj19) {
                            obj5 = this.T;
                            if (obj5 instanceof dxjf) {
                                v();
                                C();
                                obj5 = new cvne();
                                dxjc.d(this.T, obj5);
                                this.T = obj5;
                            }
                        }
                        obj19 = obj5;
                    }
                    Object obj20 = this.U;
                    if (obj20 instanceof dxjf) {
                        synchronized (obj20) {
                            obj4 = this.U;
                            if (obj4 instanceof dxjf) {
                                cvnh cvnhVar = new cvnh(v(), w(), C());
                                dxjc.d(this.U, cvnhVar);
                                this.U = cvnhVar;
                                obj4 = cvnhVar;
                            }
                        }
                        obj20 = obj4;
                    }
                    cvnh cvnhVar2 = (cvnh) obj20;
                    Object obj21 = this.V;
                    if (obj21 instanceof dxjf) {
                        synchronized (obj21) {
                            obj3 = this.V;
                            if (obj3 instanceof dxjf) {
                                cvnk cvnkVar = new cvnk(v(), C());
                                dxjc.d(this.V, cvnkVar);
                                this.V = cvnkVar;
                                obj3 = cvnkVar;
                            }
                        }
                        obj21 = obj3;
                    }
                    cvnl M = M();
                    Object obj22 = this.Y;
                    if (obj22 instanceof dxjf) {
                        synchronized (obj22) {
                            obj2 = this.Y;
                            if (obj2 instanceof dxjf) {
                                v();
                                obj2 = new cvnf();
                                dxjc.d(this.Y, obj2);
                                this.Y = obj2;
                            }
                        }
                        obj22 = obj2;
                    }
                    cvnf cvnfVar = (cvnf) obj22;
                    cvne cvneVar = (cvne) obj19;
                    obj = new cvmy(cvmwVar, cvtxVar, (cvmz) obj14, (cvna) obj15, cvnbVar2, cvncVar2, cvndVar2, cvnhVar2, (cvnk) obj21, M, a());
                    dxjc.d(this.Z, obj);
                    this.Z = obj;
                }
            }
            obj12 = obj;
        }
        return (cvmy) obj12;
    }

    private final cvoy O() {
        Object obj;
        Object obj2 = this.ab;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ab;
                if (obj instanceof dxjf) {
                    obj = new cvoy(this.a, v(), this.o);
                    dxjc.d(this.ab, obj);
                    this.ab = obj;
                }
            }
            obj2 = obj;
        }
        return (cvoy) obj2;
    }

    private final cvqk P() {
        Object obj;
        Object obj2 = this.ah;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ah;
                if (obj instanceof dxjf) {
                    obj = new cvqk(this.a, cqau.b());
                    dxjc.d(this.ah, obj);
                    this.ah = obj;
                }
            }
            obj2 = obj;
        }
        return (cvqk) obj2;
    }

    private final Object Q() {
        Object obj;
        Object obj2 = this.ai;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ai;
                if (obj instanceof dxjf) {
                    cvsx cvsxVar = new cvsx(y());
                    dxjc.d(this.ai, cvsxVar);
                    this.ai = cvsxVar;
                    obj = cvsxVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final Object R() {
        Object obj;
        Object obj2 = this.ap;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ap;
                if (obj instanceof dxjf) {
                    cvsw cvswVar = new cvsw(this.a);
                    dxjc.d(this.ap, cvswVar);
                    this.ap = cvswVar;
                    obj = cvswVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final cvrp S() {
        Object obj;
        cqat cqatVar;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17 = this.az;
        if (obj17 instanceof dxjf) {
            synchronized (obj17) {
                obj = this.az;
                if (obj instanceof dxjf) {
                    cqat b = cqau.b();
                    dsfq dsfqVar = dsfq.WEIGHTED_AVERAGE_SCHEDULE;
                    Object obj18 = this.ay;
                    if (obj18 instanceof dxjf) {
                        synchronized (obj18) {
                            obj2 = this.ay;
                            if (obj2 instanceof dxjf) {
                                Object obj19 = this.aj;
                                if (obj19 instanceof dxjf) {
                                    synchronized (obj19) {
                                        obj16 = this.aj;
                                        if (obj16 instanceof dxjf) {
                                            obj16 = new cvrr(cqau.b());
                                            dxjc.d(this.aj, obj16);
                                            this.aj = obj16;
                                        }
                                    }
                                    obj19 = obj16;
                                }
                                cvrr cvrrVar = (cvrr) obj19;
                                Object obj20 = this.ak;
                                if (obj20 instanceof dxjf) {
                                    synchronized (obj20) {
                                        obj15 = this.ak;
                                        if (obj15 instanceof dxjf) {
                                            final cvsc cvscVar = (cvsc) E();
                                            cvqn cvqnVar = cvqp.a;
                                            cvscVar.getClass();
                                            obj15 = cvqo.e(cvqnVar, new dbty(cvscVar) { // from class: cvqz
                                                private final cvsc a;

                                                {
                                                    this.a = cvscVar;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.a();
                                                }
                                            });
                                            dxjc.d(this.ak, obj15);
                                            this.ak = obj15;
                                        }
                                    }
                                    obj20 = obj15;
                                }
                                cvql cvqlVar = (cvql) obj20;
                                Object obj21 = this.al;
                                if (obj21 instanceof dxjf) {
                                    synchronized (obj21) {
                                        obj14 = this.al;
                                        if (obj14 instanceof dxjf) {
                                            final cvsc cvscVar2 = (cvsc) E();
                                            cvqn cvqnVar2 = cvra.a;
                                            cvscVar2.getClass();
                                            obj14 = cvqo.e(cvqnVar2, new dbty(cvscVar2) { // from class: cvrb
                                                private final cvsc a;

                                                {
                                                    this.a = cvscVar2;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.c();
                                                }
                                            });
                                            dxjc.d(this.al, obj14);
                                            this.al = obj14;
                                        }
                                    }
                                    obj21 = obj14;
                                }
                                cvql cvqlVar2 = (cvql) obj21;
                                Object obj22 = this.am;
                                if (obj22 instanceof dxjf) {
                                    synchronized (obj22) {
                                        obj13 = this.am;
                                        if (obj13 instanceof dxjf) {
                                            final cvsc cvscVar3 = (cvsc) E();
                                            cvrl cvrlVar = cvrc.a;
                                            cvscVar3.getClass();
                                            obj13 = cvrm.e(cvrlVar, new dbty(cvscVar3) { // from class: cvrd
                                                private final cvsc a;

                                                {
                                                    this.a = cvscVar3;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.b();
                                                }
                                            });
                                            dxjc.d(this.am, obj13);
                                            this.am = obj13;
                                        }
                                    }
                                    obj22 = obj13;
                                }
                                cvql cvqlVar3 = (cvql) obj22;
                                Object obj23 = this.an;
                                if (obj23 instanceof dxjf) {
                                    synchronized (obj23) {
                                        obj12 = this.an;
                                        if (obj12 instanceof dxjf) {
                                            final cvsd cvsdVar = (cvsd) F();
                                            cvqn cvqnVar3 = cvre.a;
                                            cvsdVar.getClass();
                                            obj12 = cvqo.e(cvqnVar3, new dbty(cvsdVar) { // from class: cvrf
                                                private final cvsd a;

                                                {
                                                    this.a = cvsdVar;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.b();
                                                }
                                            });
                                            dxjc.d(this.an, obj12);
                                            this.an = obj12;
                                        }
                                    }
                                    obj23 = obj12;
                                }
                                cvql cvqlVar4 = (cvql) obj23;
                                Object obj24 = this.ao;
                                if (obj24 instanceof dxjf) {
                                    synchronized (obj24) {
                                        obj11 = this.ao;
                                        if (obj11 instanceof dxjf) {
                                            final cvsd cvsdVar2 = (cvsd) F();
                                            cvqn cvqnVar4 = cvrg.a;
                                            cvsdVar2.getClass();
                                            obj11 = cvqo.e(cvqnVar4, new dbty(cvsdVar2) { // from class: cvrh
                                                private final cvsd a;

                                                {
                                                    this.a = cvsdVar2;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.c();
                                                }
                                            });
                                            dxjc.d(this.ao, obj11);
                                            this.ao = obj11;
                                        }
                                    }
                                    obj24 = obj11;
                                }
                                cvql cvqlVar5 = (cvql) obj24;
                                Object obj25 = this.aq;
                                if (obj25 instanceof dxjf) {
                                    synchronized (obj25) {
                                        obj10 = this.aq;
                                        if (obj10 instanceof dxjf) {
                                            final cvsg cvsgVar = (cvsg) R();
                                            cvqn cvqnVar5 = cvqq.a;
                                            cvsgVar.getClass();
                                            obj10 = cvqo.e(cvqnVar5, new dbty(cvsgVar) { // from class: cvqr
                                                private final cvsg a;

                                                {
                                                    this.a = cvsgVar;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.a();
                                                }
                                            });
                                            dxjc.d(this.aq, obj10);
                                            this.aq = obj10;
                                        }
                                    }
                                    obj25 = obj10;
                                }
                                cvql cvqlVar6 = (cvql) obj25;
                                cvql[] cvqlVarArr = new cvql[6];
                                Object obj26 = this.ar;
                                if (obj26 instanceof dxjf) {
                                    synchronized (obj26) {
                                        obj9 = this.ar;
                                        if (obj9 instanceof dxjf) {
                                            final cvsg cvsgVar2 = (cvsg) R();
                                            cvqn cvqnVar6 = cvqs.a;
                                            cvsgVar2.getClass();
                                            cqatVar = b;
                                            obj9 = cvqo.e(cvqnVar6, new dbty(cvsgVar2) { // from class: cvqt
                                                private final cvsg a;

                                                {
                                                    this.a = cvsgVar2;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.b();
                                                }
                                            });
                                            dxjc.d(this.ar, obj9);
                                            this.ar = obj9;
                                        } else {
                                            cqatVar = b;
                                        }
                                    }
                                    obj26 = obj9;
                                } else {
                                    cqatVar = b;
                                }
                                cvqlVarArr[0] = (cvql) obj26;
                                Object obj27 = this.as;
                                if (obj27 instanceof dxjf) {
                                    synchronized (obj27) {
                                        obj8 = this.as;
                                        if (obj8 instanceof dxjf) {
                                            final cvsg cvsgVar3 = (cvsg) R();
                                            cvqn cvqnVar7 = cvqu.a;
                                            cvsgVar3.getClass();
                                            obj8 = cvqo.e(cvqnVar7, new dbty(cvsgVar3) { // from class: cvqv
                                                private final cvsg a;

                                                {
                                                    this.a = cvsgVar3;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.c();
                                                }
                                            });
                                            dxjc.d(this.as, obj8);
                                            this.as = obj8;
                                        }
                                    }
                                    obj27 = obj8;
                                }
                                cvqlVarArr[1] = (cvql) obj27;
                                Object obj28 = this.at;
                                if (obj28 instanceof dxjf) {
                                    synchronized (obj28) {
                                        obj7 = this.at;
                                        if (obj7 instanceof dxjf) {
                                            final cvsf cvsfVar = (cvsf) I();
                                            obj7 = cvrm.e(cvqw.a, new dbty(cvsfVar) { // from class: cvqx
                                                private final cvsf a;

                                                {
                                                    this.a = cvsfVar;
                                                }

                                                @Override // defpackage.dbty
                                                public final Object a() {
                                                    return this.a.a().h(cvqy.a);
                                                }
                                            });
                                            dxjc.d(this.at, obj7);
                                            this.at = obj7;
                                        }
                                    }
                                    obj28 = obj7;
                                }
                                cvqlVarArr[2] = (cvql) obj28;
                                Object obj29 = this.au;
                                if (obj29 instanceof dxjf) {
                                    synchronized (obj29) {
                                        obj6 = this.au;
                                        if (obj6 instanceof dxjf) {
                                            cvrn cvrnVar = new cvrn(cqau.b());
                                            dxjc.d(this.au, cvrnVar);
                                            this.au = cvrnVar;
                                            obj6 = cvrnVar;
                                        }
                                    }
                                    obj29 = obj6;
                                }
                                cvqlVarArr[3] = (cvrn) obj29;
                                Object obj30 = this.av;
                                if (obj30 instanceof dxjf) {
                                    synchronized (obj30) {
                                        obj5 = this.av;
                                        if (obj5 instanceof dxjf) {
                                            cvrj cvrjVar = new cvrj((cvsd) F());
                                            dxjc.d(this.av, cvrjVar);
                                            this.av = cvrjVar;
                                            obj5 = cvrjVar;
                                        }
                                    }
                                    obj30 = obj5;
                                }
                                cvqlVarArr[4] = (cvrj) obj30;
                                Object obj31 = this.ax;
                                if (obj31 instanceof dxjf) {
                                    synchronized (obj31) {
                                        obj3 = this.ax;
                                        if (obj3 instanceof dxjf) {
                                            Object obj32 = this.aw;
                                            if (obj32 instanceof dxjf) {
                                                synchronized (obj32) {
                                                    obj4 = this.aw;
                                                    if (obj4 instanceof dxjf) {
                                                        cvsn cvsnVar = new cvsn(J());
                                                        dxjc.d(this.aw, cvsnVar);
                                                        this.aw = cvsnVar;
                                                        obj4 = cvsnVar;
                                                    }
                                                }
                                                obj32 = obj4;
                                            }
                                            obj3 = new cvri((cvsn) obj32);
                                            dxjc.d(this.ax, obj3);
                                            this.ax = obj3;
                                        }
                                    }
                                    obj31 = obj3;
                                }
                                cvqlVarArr[5] = (cvri) obj31;
                                cvrq cvrqVar = new cvrq(cvrrVar, dcep.G(cvqlVar, cvqlVar2, cvqlVar3, cvqlVar4, cvqlVar5, cvqlVar6, cvqlVarArr));
                                dxjc.d(this.ay, cvrqVar);
                                this.ay = cvrqVar;
                                obj2 = cvrqVar;
                            } else {
                                cqatVar = b;
                            }
                        }
                        obj18 = obj2;
                    } else {
                        cqatVar = b;
                    }
                    cvrp cvrpVar = new cvrp(cqatVar, dcdn.k(dsfqVar, (cvro) obj18));
                    dxjc.d(this.az, cvrpVar);
                    this.az = cvrpVar;
                    obj = cvrpVar;
                }
            }
            obj17 = obj;
        }
        return (cvrp) obj17;
    }

    private final Object T() {
        Object obj;
        Object obj2 = this.aC;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aC;
                if (obj instanceof dxjf) {
                    cvpb c = c();
                    dzsj dzsjVar = this.aB;
                    if (dzsjVar == null) {
                        dzsjVar = new pbh(this, 4);
                        this.aB = dzsjVar;
                    }
                    obj = new cvme(c, dxjc.c(dzsjVar), dxjc.c(this.bB), a(), cqau.b());
                    dxjc.d(this.aC, obj);
                    this.aC = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final Object U() {
        Object obj;
        Object obj2 = this.aD;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aD;
                if (obj instanceof dxjf) {
                    cvmg cvmgVar = new cvmg((cvmd) T(), a(), ak(), cqau.b());
                    dxjc.d(this.aD, cvmgVar);
                    this.aD = cvmgVar;
                    obj = cvmgVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final Object V() {
        Object obj;
        Object obj2 = this.aE;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aE;
                if (obj instanceof dxjf) {
                    cvmj cvmjVar = new cvmj(z(), u(), (cvmg) U(), y(), cqau.b());
                    dxjc.d(this.aE, cvmjVar);
                    this.aE = cvmjVar;
                    obj = cvmjVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final Object W() {
        Object obj;
        Object obj2 = this.aF;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aF;
                if (obj instanceof dxjf) {
                    cvmi cvmiVar = new cvmi(G(), (cvmg) U(), (cvmj) V());
                    dxjc.d(this.aF, cvmiVar);
                    this.aF = cvmiVar;
                    obj = cvmiVar;
                }
            }
            return obj;
        }
        return obj2;
    }

    private final dbsg<cvtl> X() {
        Object obj;
        Object obj2 = this.aJ;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aJ;
                if (obj instanceof dxjf) {
                    obj = dbpy.a;
                    dxjc.d(this.aJ, obj);
                    this.aJ = obj;
                }
            }
            obj2 = obj;
        }
        return (dbsg) obj2;
    }

    private final Map<String, cvnq> Y() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        dcdg q = dcdn.q(7);
        Object obj8 = this.aG;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                obj7 = this.aG;
                if (obj7 instanceof dxjf) {
                    obj7 = new cvoh((cvmf) W(), u(), H(), (cvmd) T(), a(), cqau.b());
                    dxjc.d(this.aG, obj7);
                    this.aG = obj7;
                }
            }
            obj8 = obj7;
        }
        q.f("FetchLatestThreadsCallback", (cvnq) obj8);
        Object obj9 = this.aH;
        if (obj9 instanceof dxjf) {
            synchronized (obj9) {
                obj6 = this.aH;
                if (obj6 instanceof dxjf) {
                    cvoi cvoiVar = new cvoi((cvmf) W(), u(), a(), cqau.b());
                    dxjc.d(this.aH, cvoiVar);
                    this.aH = cvoiVar;
                    obj6 = cvoiVar;
                }
            }
            obj9 = obj6;
        }
        q.f("FetchUpdatedThreadsCallback", (cvnq) obj9);
        Object obj10 = this.aI;
        if (obj10 instanceof dxjf) {
            synchronized (obj10) {
                obj5 = this.aI;
                if (obj5 instanceof dxjf) {
                    cvof cvofVar = new cvof(u(), c(), a());
                    dxjc.d(this.aI, cvofVar);
                    this.aI = cvofVar;
                    obj5 = cvofVar;
                }
            }
            obj10 = obj5;
        }
        q.f("BatchUpdateThreadStateCallback", (cvnq) obj10);
        Object obj11 = this.aK;
        if (obj11 instanceof dxjf) {
            synchronized (obj11) {
                obj4 = this.aK;
                if (obj4 instanceof dxjf) {
                    cvtt cvttVar = new cvtt(u(), ak(), cqau.b(), X());
                    dxjc.d(this.aK, cvttVar);
                    this.aK = cvttVar;
                    obj4 = cvttVar;
                }
            }
            obj11 = obj4;
        }
        q.f("StoreTargetCallback", (cvnq) obj11);
        Object obj12 = this.aL;
        if (obj12 instanceof dxjf) {
            synchronized (obj12) {
                obj3 = this.aL;
                if (obj3 instanceof dxjf) {
                    cvts cvtsVar = new cvts(u(), X());
                    dxjc.d(this.aL, cvtsVar);
                    this.aL = cvtsVar;
                    obj3 = cvtsVar;
                }
            }
            obj12 = obj3;
        }
        q.f("RemoveTargetCallback", (cvnq) obj12);
        Object obj13 = this.aM;
        if (obj13 instanceof dxjf) {
            synchronized (obj13) {
                obj2 = this.aM;
                if (obj2 instanceof dxjf) {
                    obj2 = new cvjk();
                    dxjc.d(this.aM, obj2);
                    this.aM = obj2;
                }
            }
            obj13 = obj2;
        }
        q.f("CreateUserSubscriptionCallback", (cvnq) obj13);
        Object obj14 = this.aN;
        if (obj14 instanceof dxjf) {
            synchronized (obj14) {
                obj = this.aN;
                if (obj instanceof dxjf) {
                    obj = new cvjl();
                    dxjc.d(this.aN, obj);
                    this.aN = obj;
                }
            }
            obj14 = obj;
        }
        q.f("DeleteUserSubscriptionCallback", (cvnq) obj14);
        return q.b();
    }

    private final cvnu Z() {
        Object obj;
        Object obj2 = this.be;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.be;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    cvnv y = y();
                    cvko z = z();
                    dzsj dzsjVar = this.aP;
                    if (dzsjVar == null) {
                        dzsjVar = new pbh(this, 0);
                        this.aP = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.aR;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new pbh(this, 5);
                        this.aR = dzsjVar2;
                    }
                    dxio c2 = dxjc.c(dzsjVar2);
                    dzsj dzsjVar3 = this.aT;
                    if (dzsjVar3 == null) {
                        dzsjVar3 = new pbh(this, 6);
                        this.aT = dzsjVar3;
                    }
                    dxjc.c(dzsjVar3);
                    dzsj dzsjVar4 = this.aV;
                    if (dzsjVar4 == null) {
                        dzsjVar4 = new pbh(this, 7);
                        this.aV = dzsjVar4;
                    }
                    dxio c3 = dxjc.c(dzsjVar4);
                    dzsj dzsjVar5 = this.aX;
                    if (dzsjVar5 == null) {
                        dzsjVar5 = new pbh(this, 8);
                        this.aX = dzsjVar5;
                    }
                    dxio c4 = dxjc.c(dzsjVar5);
                    dzsj dzsjVar6 = this.aZ;
                    if (dzsjVar6 == null) {
                        dzsjVar6 = new pbh(this, 9);
                        this.aZ = dzsjVar6;
                    }
                    dxio c5 = dxjc.c(dzsjVar6);
                    dzsj dzsjVar7 = this.bb;
                    if (dzsjVar7 == null) {
                        dzsjVar7 = new pbh(this, 10);
                        this.bb = dzsjVar7;
                    }
                    dxio c6 = dxjc.c(dzsjVar7);
                    dzsj dzsjVar8 = this.bd;
                    if (dzsjVar8 == null) {
                        dzsjVar8 = new pbh(this, 11);
                        this.bd = dzsjVar8;
                    }
                    dxjc.c(dzsjVar8);
                    obj = new cvnu(context, y, z, c, c2, c3, c4, c5, c6);
                    dxjc.d(this.be, obj);
                    this.be = obj;
                }
            }
            obj2 = obj;
        }
        return (cvnu) obj2;
    }

    private final cvpn aa() {
        cvpn cvpnVar;
        Object obj = this.bf;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.bf;
                boolean z = obj2 instanceof dxjf;
                cvpnVar = obj2;
                if (z) {
                    cvpn cvpnVar2 = new cvpn();
                    cvpnVar2.a = L();
                    dxjc.d(this.bf, cvpnVar2);
                    this.bf = cvpnVar2;
                    cvpnVar = cvpnVar2;
                }
            }
            obj = cvpnVar;
        }
        return (cvpn) obj;
    }

    private final coxz ab() {
        return coxs.a(this.a);
    }

    private final String ac() {
        String valueOf = String.valueOf(this.a.getPackageName());
        String concat = valueOf.length() != 0 ? "com.google.android.libraries.notifications#".concat(valueOf) : new String("com.google.android.libraries.notifications#");
        dxjg.f(concat);
        return concat;
    }

    private final cvpp ad() {
        int i;
        Context context = this.a;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            cvlw.d("ChimePhenotypeModule", "Package name not found. This should not happen. Send help.", new Object[0]);
            i = 0;
        }
        coxz ab = ab();
        String ac = ac();
        Context context2 = this.a;
        coxz ab2 = ab();
        String ac2 = ac();
        dzsj dzsjVar = this.bg;
        if (dzsjVar == null) {
            dzsjVar = new pbh(this, 12);
            this.bg = dzsjVar;
        }
        cvpf cvpfVar = new cvpf(ab2, ac2, dxjc.c(dzsjVar));
        cvpq cvpqVar = new cvpq();
        cvpqVar.b = cvpfVar;
        cvpqVar.c = ac;
        cvpqVar.a = Integer.valueOf(i);
        cvpqVar.d = dcep.B("CHIME");
        cvpqVar.e = new byte[0];
        String str = cvpqVar.a == null ? " appVersionCode" : "";
        if (cvpqVar.b == null) {
            str = str.concat(" phenotypeFlagCommitter");
        }
        if (cvpqVar.c == null) {
            str = String.valueOf(str).concat(" packageName");
        }
        if (cvpqVar.d == null) {
            str = String.valueOf(str).concat(" logSourceNames");
        }
        if (cvpqVar.e == null) {
            str = String.valueOf(str).concat(" deviceProperties");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cvps(ab, context2, dcep.B(new cvpr(cvpqVar.a.intValue(), cvpqVar.b, cvpqVar.c, cvpqVar.d, cvpqVar.e)));
    }

    private final cvtr ae() {
        Object obj;
        Object obj2 = this.bh;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bh;
                if (obj instanceof dxjf) {
                    obj = new cvtr(cqau.b(), x(), v(), Z(), u(), aa(), M(), X(), ad());
                    dxjc.d(this.bh, obj);
                    this.bh = obj;
                }
            }
            obj2 = obj;
        }
        return (cvtr) obj2;
    }

    private final cvln af() {
        Object obj;
        Object obj2 = this.bj;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bj;
                if (obj instanceof dxjf) {
                    obj = new cvln(u(), z(), H(), c(), a(), d());
                    dxjc.d(this.bj, obj);
                    this.bj = obj;
                }
            }
            obj2 = obj;
        }
        return (cvln) obj2;
    }

    private final cvog ag() {
        Object obj;
        Object obj2 = this.bm;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bm;
                if (obj instanceof dxjf) {
                    obj = new cvog(Z());
                    dxjc.d(this.bm, obj);
                    this.bm = obj;
                }
            }
            obj2 = obj;
        }
        return (cvog) obj2;
    }

    private final cvmc ah() {
        Object obj;
        Object obj2 = this.bp;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bp;
                if (obj instanceof dxjf) {
                    cvnv y = y();
                    cvkf u = u();
                    cvkq H = H();
                    cvlr a = a();
                    Set<cvpv> d = d();
                    dzsj dzsjVar = this.bn;
                    if (dzsjVar == null) {
                        dzsjVar = new pbh(this, 13);
                        this.bn = dzsjVar;
                    }
                    dxio c = dxjc.c(dzsjVar);
                    dzsj dzsjVar2 = this.bo;
                    if (dzsjVar2 == null) {
                        dzsjVar2 = new pbh(this, 14);
                        this.bo = dzsjVar2;
                    }
                    obj = new cvmc(y, u, H, a, d, c, dxjc.c(dzsjVar2));
                    dxjc.d(this.bp, obj);
                    this.bp = obj;
                }
            }
            obj2 = obj;
        }
        return (cvmc) obj2;
    }

    private final cvtq ai() {
        cvtq cvtqVar;
        Object obj = this.bq;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.bq;
                boolean z = obj2 instanceof dxjf;
                cvtqVar = obj2;
                if (z) {
                    cvtq cvtqVar2 = new cvtq();
                    cvtqVar2.a = ae();
                    cvtqVar2.b = ah();
                    dxjc.d(this.bq, cvtqVar2);
                    this.bq = cvtqVar2;
                    cvtqVar = cvtqVar2;
                }
            }
            obj = cvtqVar;
        }
        return (cvtq) obj;
    }

    private final cvpc aj() {
        cvmy N = N();
        cvog ag = ag();
        cvmd cvmdVar = (cvmd) T();
        dzsj dzsjVar = this.bt;
        if (dzsjVar == null) {
            dzsjVar = new pbh(this, 15);
            this.bt = dzsjVar;
        }
        return new cvpc(N, ag, cvmdVar, dxjc.c(dzsjVar));
    }

    private final cvpk ak() {
        cvpk cvpkVar;
        Object obj = this.W;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.W;
                boolean z = obj2 instanceof dxjf;
                cvpkVar = obj2;
                if (z) {
                    cvpk cvpkVar2 = new cvpk();
                    cvpkVar2.a = L();
                    dxjc.d(this.W, cvpkVar2);
                    this.W = cvpkVar2;
                    cvpkVar = cvpkVar2;
                }
            }
            obj = cvpkVar;
        }
        return (cvpk) obj;
    }

    private final cvkf u() {
        Object obj;
        Object obj2 = this.p;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.p;
                if (obj instanceof dxjf) {
                    obj = new cvkm(this.a);
                    dxjc.d(this.p, obj);
                    this.p = obj;
                }
            }
            obj2 = obj;
        }
        return (cvkf) obj2;
    }

    private final cvjs v() {
        cvjn cvjnVar;
        Object obj = this.q;
        if (obj instanceof dxjf) {
            synchronized (obj) {
                Object obj2 = this.q;
                boolean z = obj2 instanceof dxjf;
                cvjnVar = obj2;
                if (z) {
                    cvjr cvjrVar = this.i;
                    String str = this.j;
                    final ped pedVar = this.k;
                    cvjm cvjmVar = new cvjm();
                    String str2 = Build.MANUFACTURER;
                    String str3 = Build.MODEL;
                    boolean z2 = true;
                    StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + String.valueOf(str3).length());
                    sb.append(str2);
                    sb.append(" ");
                    sb.append(str3);
                    cvjmVar.a(sb.toString());
                    cvjmVar.b(cviu.a);
                    cvjmVar.h = "com.google.android.libraries.notifications.entrypoints.scheduled.ScheduledTaskService";
                    cvjmVar.j = 5;
                    cvjmVar.k = false;
                    cvjmVar.l = false;
                    cvjmVar.c = "658104395416";
                    cvjmVar.a = "gmm";
                    cvjmVar.b = dcbg.b(dcbg.b(pedVar.d.a().h(dbss.ALWAYS_TRUE)).o(new dbsl(pedVar) { // from class: pea
                        private final ped a;

                        {
                            this.a = pedVar;
                        }

                        @Override // defpackage.dbsl
                        public final boolean a(Object obj3) {
                            return this.a.b(((Integer) obj3).intValue());
                        }
                    }).z()).s(pdz.a).z();
                    if (cvjrVar != null) {
                        cvjmVar.d = cvjrVar;
                        cvjmVar.a(str);
                        cvjmVar.b(Long.valueOf(TimeUnit.DAYS.toMillis(1L)));
                        cvjmVar.h = "com.google.android.apps.gmm.cloudmessage.chime.GmmChimeTaskService";
                        cvjmVar.i = 111000000;
                        cvjo cvjoVar = new cvjo();
                        cvjoVar.d = true;
                        cvjoVar.e = true;
                        cvjoVar.f = true;
                        cvjoVar.g = true;
                        cvjoVar.h = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayActivity";
                        cvjoVar.i = "com.google.android.libraries.notifications.entrypoints.systemtray.SystemTrayBroadcastReceiver";
                        cvjoVar.m = 2;
                        cvjoVar.k = 1;
                        cvjoVar.l = false;
                        cvjoVar.h = "com.google.android.apps.gmm.notification.log.NotificationLoggingActivity$NoTaskAffinityNotificationLoggingActivity";
                        cvjoVar.i = "com.google.android.apps.gmm.notification.log.NotificationLoggingReceiver";
                        cvjoVar.b = Integer.valueOf((int) R.string.MAPS_APP_NAME);
                        cvjoVar.c = Integer.valueOf((int) R.color.quantum_googblue);
                        cvjoVar.a = 2131232784;
                        cvjoVar.j = "OtherChannel";
                        String str4 = " iconResourceId";
                        if (cvjoVar.a != null) {
                            str4 = "";
                        }
                        if (cvjoVar.b == null) {
                            str4 = str4.concat(" appNameResourceId");
                        }
                        if (cvjoVar.d == null) {
                            str4 = String.valueOf(str4).concat(" soundEnabled");
                        }
                        if (cvjoVar.e == null) {
                            str4 = String.valueOf(str4).concat(" vibrationEnabled");
                        }
                        if (cvjoVar.f == null) {
                            str4 = String.valueOf(str4).concat(" lightsEnabled");
                        }
                        if (cvjoVar.g == null) {
                            str4 = String.valueOf(str4).concat(" displayRecipientAccountName");
                        }
                        if (cvjoVar.m == 0) {
                            str4 = String.valueOf(str4).concat(" restartBehavior");
                        }
                        if (cvjoVar.k == null) {
                            str4 = String.valueOf(str4).concat(" defaultGroupThreshold");
                        }
                        if (cvjoVar.l == null) {
                            str4 = String.valueOf(str4).concat(" shouldFilterOldThreads");
                        }
                        if (!str4.isEmpty()) {
                            String valueOf = String.valueOf(str4);
                            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
                        }
                        cvjmVar.e = new cvjp(cvjoVar.a, cvjoVar.b, cvjoVar.c, cvjoVar.d.booleanValue(), cvjoVar.e.booleanValue(), cvjoVar.f.booleanValue(), cvjoVar.g.booleanValue(), cvjoVar.h, cvjoVar.i, cvjoVar.j, cvjoVar.m, cvjoVar.k.intValue(), cvjoVar.l.booleanValue());
                        String str5 = " clientId";
                        if (cvjmVar.a != null) {
                            str5 = "";
                        }
                        if (cvjmVar.c == null) {
                            str5 = str5.concat(" gcmSenderProjectId");
                        }
                        if (cvjmVar.d == null) {
                            str5 = String.valueOf(str5).concat(" environment");
                        }
                        if (cvjmVar.f == null) {
                            str5 = String.valueOf(str5).concat(" deviceName");
                        }
                        if (cvjmVar.g == null) {
                            str5 = String.valueOf(str5).concat(" registrationStalenessTimeMs");
                        }
                        if (cvjmVar.i == null) {
                            str5 = String.valueOf(str5).concat(" jobSchedulerAllowedIDsRange");
                        }
                        if (cvjmVar.j == null) {
                            str5 = String.valueOf(str5).concat(" maxChimePendingUpstreams");
                        }
                        if (cvjmVar.k == null) {
                            str5 = String.valueOf(str5).concat(" forceLogging");
                        }
                        if (cvjmVar.l == null) {
                            str5 = String.valueOf(str5).concat(" disableChimeEntrypoints");
                        }
                        if (!str5.isEmpty()) {
                            String valueOf2 = String.valueOf(str5);
                            throw new IllegalStateException(valueOf2.length() != 0 ? "Missing required properties:".concat(valueOf2) : new String("Missing required properties:"));
                        }
                        cvjn cvjnVar2 = new cvjn(cvjmVar.a, cvjmVar.b, cvjmVar.c, cvjmVar.d, cvjmVar.e, cvjmVar.f, cvjmVar.g, cvjmVar.h, cvjmVar.i, cvjmVar.j.intValue(), cvjmVar.k.booleanValue(), cvjmVar.l.booleanValue());
                        if (cvjnVar2.k() <= 0) {
                            z2 = false;
                        }
                        dbsk.l(z2);
                        cvlw.a = cvjnVar2.m();
                        cvlw.b.a = cvlw.a;
                        dxjg.f(cvjnVar2);
                        dxjc.d(this.q, cvjnVar2);
                        this.q = cvjnVar2;
                        cvjnVar = cvjnVar2;
                    } else {
                        throw new NullPointerException("Null environment");
                    }
                }
            }
            obj = cvjnVar;
        }
        return (cvjs) obj;
    }

    private final cvmn w() {
        Object obj;
        Object obj2;
        Object obj3 = this.s;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.s;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    cvjs v = v();
                    Object obj4 = this.r;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.r;
                            if (obj2 instanceof dxjf) {
                                obj2 = new cvmm(dbpy.a);
                                dxjc.d(this.r, obj2);
                                this.r = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = new cvmn(context, v, (cvmm) obj4);
                    dxjc.d(this.s, obj);
                    this.s = obj;
                }
            }
            obj3 = obj;
        }
        return (cvmn) obj3;
    }

    private final cvlo x() {
        Object obj;
        Object obj2 = this.t;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.t;
                if (obj instanceof dxjf) {
                    cvlo cvloVar = new cvlo(u());
                    dxjc.d(this.t, cvloVar);
                    this.t = cvloVar;
                    obj = cvloVar;
                }
            }
            obj2 = obj;
        }
        return (cvlo) obj2;
    }

    private final cvnv y() {
        Object obj;
        Object obj2 = this.u;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.u;
                if (obj instanceof dxjf) {
                    obj = new cvnv(this.a, v());
                    dxjc.d(this.u, obj);
                    this.u = obj;
                }
            }
            obj2 = obj;
        }
        return (cvnv) obj2;
    }

    private final cvko z() {
        Object obj;
        Object obj2 = this.v;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.v;
                if (obj instanceof dxjf) {
                    cvko cvkoVar = new cvko(this.a, u());
                    dxjc.d(this.v, cvkoVar);
                    this.v = cvkoVar;
                    obj = cvkoVar;
                }
            }
            obj2 = obj;
        }
        return (cvko) obj2;
    }

    public final cvlr a() {
        Object obj;
        Object obj2;
        Object obj3 = this.G;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.G;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    cvjs v = v();
                    cqat b = cqau.b();
                    cvnm C = C();
                    cvni K = K();
                    Object obj4 = this.F;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.F;
                            if (obj2 instanceof dxjf) {
                                obj2 = new cvlu();
                                dxjc.d(this.F, obj2);
                                this.F = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    cvlu cvluVar = (cvlu) obj4;
                    obj = new cvlr(context, v, b, C, K, D(), G());
                    dxjc.d(this.G, obj);
                    this.G = obj;
                }
            }
            obj3 = obj;
        }
        return (cvlr) obj3;
    }

    public final cvqc b() {
        Object obj;
        Object obj2 = this.af;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.af;
                if (obj instanceof dxjf) {
                    obj = new cvqc(this.a);
                    dxjc.d(this.af, obj);
                    this.af = obj;
                }
            }
            obj2 = obj;
        }
        return (cvqc) obj2;
    }

    public final cvpb c() {
        Object obj;
        Object obj2;
        Object obj3;
        cvlz cvlzVar;
        Object obj4 = this.ag;
        if (obj4 instanceof dxjf) {
            synchronized (obj4) {
                obj = this.ag;
                if (obj instanceof dxjf) {
                    Context context = this.a;
                    dbsg<cvtj> dbsgVar = this.n;
                    dbsg<cvtk> dbsgVar2 = this.b;
                    Object obj5 = this.ae;
                    if (obj5 instanceof dxjf) {
                        synchronized (obj5) {
                            obj2 = this.ae;
                            if (obj2 instanceof dxjf) {
                                Object obj6 = this.ad;
                                if (obj6 instanceof dxjf) {
                                    synchronized (obj6) {
                                        obj3 = this.ad;
                                        if (obj3 instanceof dxjf) {
                                            Context context2 = this.a;
                                            cvjs v = v();
                                            Object obj7 = this.aa;
                                            if (obj7 instanceof dxjf) {
                                                synchronized (obj7) {
                                                    Object obj8 = this.aa;
                                                    boolean z = obj8 instanceof dxjf;
                                                    cvlzVar = obj8;
                                                    if (z) {
                                                        cvlz cvlzVar2 = new cvlz();
                                                        cvlzVar2.a = this.a;
                                                        dxjc.d(this.aa, cvlzVar2);
                                                        this.aa = cvlzVar2;
                                                        cvlzVar = cvlzVar2;
                                                    }
                                                }
                                                obj7 = cvlzVar;
                                            }
                                            cvlz cvlzVar3 = (cvlz) obj7;
                                            cvoy O = O();
                                            dzsj dzsjVar = this.ac;
                                            if (dzsjVar == null) {
                                                dzsjVar = new pbh(this, 3);
                                                this.ac = dzsjVar;
                                            }
                                            obj3 = new cvow(context2, v, cvlzVar3, O, dxjc.c(dzsjVar), D(), a());
                                            dxjc.d(this.ad, obj3);
                                            this.ad = obj3;
                                        }
                                    }
                                    obj6 = obj3;
                                }
                                obj2 = new cvpa((cvow) obj6);
                                dxjc.d(this.ae, obj2);
                                this.ae = obj2;
                            }
                        }
                        obj5 = obj2;
                    }
                    cvkq H = H();
                    cvor D = D();
                    cvoy O2 = O();
                    cvlr a = a();
                    cvjs v2 = v();
                    Context context3 = this.a;
                    obj = new cvpb(context, dbsgVar, dbsgVar2, (cvpa) obj5, H, D, O2, a, v2, dcdn.k(2, new cvpy(dcep.B(new cvqd(context3, new cvqa(context3, O()))), b())), cqau.b());
                    dxjc.d(this.ag, obj);
                    this.ag = obj;
                }
            }
            obj4 = obj;
        }
        return (cvpb) obj4;
    }

    public final Set<cvpv> d() {
        Object obj;
        Object obj2 = this.aA;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aA;
                if (obj instanceof dxjf) {
                    cvqe cvqeVar = new cvqe(u(), P(), (cvsx) Q(), S());
                    dxjc.d(this.aA, cvqeVar);
                    this.aA = cvqeVar;
                    obj = cvqeVar;
                }
            }
            obj2 = obj;
        }
        return dcep.B((cvqe) obj2);
    }

    public final cvny e() {
        Object obj;
        Object obj2 = this.aO;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aO;
                if (obj instanceof dxjf) {
                    cvny cvnyVar = new cvny(N());
                    cvnyVar.a = Y();
                    dxjc.d(this.aO, cvnyVar);
                    this.aO = cvnyVar;
                    obj = cvnyVar;
                }
            }
            obj2 = obj;
        }
        return (cvny) obj2;
    }

    public final cvnz f() {
        Object obj;
        Object obj2 = this.aQ;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aQ;
                if (obj instanceof dxjf) {
                    cvnz cvnzVar = new cvnz(N(), H());
                    cvnzVar.a = Y();
                    dxjc.d(this.aQ, cvnzVar);
                    this.aQ = cvnzVar;
                    obj = cvnzVar;
                }
            }
            obj2 = obj;
        }
        return (cvnz) obj2;
    }

    public final cvoa g() {
        Object obj;
        Object obj2 = this.aS;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aS;
                if (obj instanceof dxjf) {
                    cvoa cvoaVar = new cvoa(N());
                    cvoaVar.a = Y();
                    dxjc.d(this.aS, cvoaVar);
                    this.aS = cvoaVar;
                    obj = cvoaVar;
                }
            }
            obj2 = obj;
        }
        return (cvoa) obj2;
    }

    public final cvod h() {
        Object obj;
        Object obj2 = this.aU;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aU;
                if (obj instanceof dxjf) {
                    cvod cvodVar = new cvod(N());
                    cvodVar.a = Y();
                    dxjc.d(this.aU, cvodVar);
                    this.aU = cvodVar;
                    obj = cvodVar;
                }
            }
            obj2 = obj;
        }
        return (cvod) obj2;
    }

    public final cvnt i() {
        Object obj;
        Object obj2 = this.aW;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aW;
                if (obj instanceof dxjf) {
                    cvnt cvntVar = new cvnt(N(), z());
                    cvntVar.a = Y();
                    dxjc.d(this.aW, cvntVar);
                    this.aW = cvntVar;
                    obj = cvntVar;
                }
            }
            obj2 = obj;
        }
        return (cvnt) obj2;
    }

    public final cvnw j() {
        Object obj;
        Object obj2 = this.aY;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.aY;
                if (obj instanceof dxjf) {
                    cvnw cvnwVar = new cvnw(N(), z());
                    cvnwVar.a = Y();
                    dxjc.d(this.aY, cvnwVar);
                    this.aY = cvnwVar;
                    obj = cvnwVar;
                }
            }
            obj2 = obj;
        }
        return (cvnw) obj2;
    }

    public final cvnx k() {
        Object obj;
        Object obj2 = this.ba;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.ba;
                if (obj instanceof dxjf) {
                    cvnx cvnxVar = new cvnx(N(), z());
                    cvnxVar.a = Y();
                    dxjc.d(this.ba, cvnxVar);
                    this.ba = cvnxVar;
                    obj = cvnxVar;
                }
            }
            obj2 = obj;
        }
        return (cvnx) obj2;
    }

    public final cvoc l() {
        Object obj;
        Object obj2 = this.bc;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bc;
                if (obj instanceof dxjf) {
                    cvoc cvocVar = new cvoc(N(), z());
                    cvocVar.a = Y();
                    dxjc.d(this.bc, cvocVar);
                    this.bc = cvocVar;
                    obj = cvocVar;
                }
            }
            obj2 = obj;
        }
        return (cvoc) obj2;
    }

    public final Object m() {
        Object obj;
        Object obj2 = this.bs;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bs;
                if (obj instanceof dxjf) {
                    obj = new cvua(c(), H(), u(), aj(), a());
                    dxjc.d(this.bs, obj);
                    this.bs = obj;
                }
            }
            return obj;
        }
        return obj2;
    }

    @Override // defpackage.pbj
    public final cvkt n() {
        Object obj;
        Object obj2;
        Object obj3 = this.br;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.br;
                if (obj instanceof dxjf) {
                    Object obj4 = this.bl;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.bl;
                            if (obj2 instanceof dxjf) {
                                obj2 = new cvla(u(), ak());
                                dxjc.d(this.bl, obj2);
                                this.bl = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    obj = new cvkx((cvla) obj4, (cvmf) W(), ag(), a(), ai(), u(), c(), af());
                    dxjc.d(this.br, obj);
                    this.br = obj;
                }
            }
            obj3 = obj;
        }
        return (cvkx) obj3;
    }

    @Override // defpackage.pbj
    public final cvkt o() {
        Object obj;
        Object obj2 = this.bu;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bu;
                if (obj instanceof dxjf) {
                    cvlh cvlhVar = new cvlh(aj(), u(), H(), d());
                    dxjc.d(this.bu, cvlhVar);
                    this.bu = cvlhVar;
                    obj = cvlhVar;
                }
            }
            obj2 = obj;
        }
        return (cvlh) obj2;
    }

    @Override // defpackage.pbj
    public final dcdc<pbo> p() {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5 = this.bv;
        if (obj5 instanceof dxjf) {
            synchronized (obj5) {
                obj4 = this.bv;
                if (obj4 instanceof dxjf) {
                    obj4 = new cvld(v(), ai(), (cvtz) m(), ad(), y(), d());
                    dxjc.d(this.bv, obj4);
                    this.bv = obj4;
                }
            }
            obj5 = obj4;
        }
        cvld cvldVar = (cvld) obj5;
        Object obj6 = this.bw;
        if (obj6 instanceof dxjf) {
            synchronized (obj6) {
                obj3 = this.bw;
                if (obj3 instanceof dxjf) {
                    obj3 = new cvku(u(), af(), aa(), ai(), a());
                    dxjc.d(this.bw, obj3);
                    this.bw = obj3;
                }
            }
            obj6 = obj3;
        }
        cvku cvkuVar = (cvku) obj6;
        Object obj7 = this.bx;
        if (obj7 instanceof dxjf) {
            synchronized (obj7) {
                obj2 = this.bx;
                if (obj2 instanceof dxjf) {
                    cvlb cvlbVar = new cvlb(ai(), a());
                    dxjc.d(this.bx, cvlbVar);
                    this.bx = cvlbVar;
                    obj2 = cvlbVar;
                }
            }
            obj7 = obj2;
        }
        cvlb cvlbVar2 = (cvlb) obj7;
        cvlc cvlcVar = new cvlc(this.a, ad());
        Object obj8 = this.by;
        if (obj8 instanceof dxjf) {
            synchronized (obj8) {
                obj = this.by;
                if (obj instanceof dxjf) {
                    cvli cvliVar = new cvli(ai(), a());
                    dxjc.d(this.by, cvliVar);
                    this.by = cvliVar;
                    obj = cvliVar;
                }
            }
            obj8 = obj;
        }
        cqat b = cqau.b();
        dcdc<pbo> j = dcdc.j(pbr.a(cvldVar, b), pbr.a(cvkuVar, b), pbr.a(cvlbVar2, b), pbr.a(cvlcVar, b), pbr.a((cvli) obj8, b));
        dxjg.f(j);
        return j;
    }

    @Override // defpackage.pbj
    public final cvtz q() {
        return (cvtz) m();
    }

    @Override // defpackage.pbj
    public final pbu r() {
        Object obj;
        Object obj2 = this.bA;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bA;
                if (obj instanceof dxjf) {
                    cvnu Z = Z();
                    cvkf u = u();
                    N();
                    obj = new cvjj(Z, u);
                    dxjc.d(this.bA, obj);
                    this.bA = obj;
                }
            }
            obj2 = obj;
        }
        return new pbq((cvjj) obj2);
    }

    @Override // defpackage.pbj
    public final cvtp s() {
        Object obj;
        Object obj2;
        Object obj3 = this.bk;
        if (obj3 instanceof dxjf) {
            synchronized (obj3) {
                obj = this.bk;
                if (obj instanceof dxjf) {
                    u();
                    cvmn w = w();
                    cvtr ae = ae();
                    Object obj4 = this.bi;
                    if (obj4 instanceof dxjf) {
                        synchronized (obj4) {
                            obj2 = this.bi;
                            if (obj2 instanceof dxjf) {
                                Z();
                                u();
                                x();
                                X();
                                obj2 = new cvtu();
                                dxjc.d(this.bi, obj2);
                                this.bi = obj2;
                            }
                        }
                        obj4 = obj2;
                    }
                    cvtu cvtuVar = (cvtu) obj4;
                    af();
                    obj = new cvtp(w, ae);
                    dxjc.d(this.bk, obj);
                    this.bk = obj;
                }
            }
            obj3 = obj;
        }
        return (cvtp) obj3;
    }

    @Override // defpackage.pbj
    public final pbp t() {
        Object obj;
        Object obj2 = this.bz;
        if (obj2 instanceof dxjf) {
            synchronized (obj2) {
                obj = this.bz;
                if (obj instanceof dxjf) {
                    obj = new cvsy(u(), P(), S(), N(), (cvmd) T(), (cvsx) Q());
                    dxjc.d(this.bz, obj);
                    this.bz = obj;
                }
            }
            obj2 = obj;
        }
        return new pbp(new cvlg(dcep.G((cvle) obj2, (cvle) V(), ah(), h(), g(), e(), f(), i(), j(), k(), l()), G()));
    }
}
