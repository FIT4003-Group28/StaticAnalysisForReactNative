package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ConfigurationInfo;
import android.content.res.Resources;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.io.PrintWriter;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: PG */
/* renamed from: alqj  reason: default package */
/* loaded from: classes.dex */
public final class alqj implements SharedPreferences.OnSharedPreferenceChangeListener, akoq {
    public static final /* synthetic */ int x = 0;
    private volatile ckcv H;
    private final ckcw I;
    private boolean K;
    private final amyd L;
    private akpc O;
    private bnss P;
    private akyb Q;
    private final alrw R;
    private final Resources S;
    private final alwc T;
    private final btrm U;
    private final bvjj V;
    private final amfi W;
    private final Executor X;
    private final bnsn Y;
    private final alrf Z;
    public final Object a;
    private final Object aA;
    @dzsi
    private amml aB;
    private boolean aC;
    private boolean aD;
    private final AtomicBoolean aE;
    private final Context aF;
    private final amym aG;
    private final dzsj<akwx> aH;
    private final dzsj<dmxf> aI;
    private final dzsj<akwv> aJ;
    private final alsz aK;
    private final alst aL;
    private final almp aM;
    private final alyx aN;
    private final akfa aO;
    private boolean aP;
    private amwd aR;
    private final amyj aS;
    private final alqd aT;
    @dzsi
    private hvv aU;
    @dzsi
    private final akpr aa;
    private final anai ab;
    private final aljt ac;
    private final alot ad;
    private final alom ae;
    private final aljr af;
    private final alrv ag;
    private final amrg ah;
    private final alov ai;
    @dzsi
    private amml ak;
    @dzsi
    private amml al;
    @dzsi
    private amml am;
    @dzsi
    private amml an;
    @dzsi
    private amml ao;
    @dzsi
    private amml ap;
    @dzsi
    private amml aq;
    @dzsi
    private amml ar;
    @dzsi
    private amml as;
    @dzsi
    private amml at;
    @dzsi
    private amml av;
    private final Object aw;
    @dzsi
    private amml ax;
    private final Object ay;
    private amml az;
    public final akzh b;
    public alkc c;
    public final akzz d;
    public final amii e;
    public final Executor f;
    public final ambz g;
    public final almu h;
    public final Object i;
    public alqf j;
    public final Object k;
    @dzsi
    public amml l;
    public final Object m;
    @dzsi
    public amml n;
    public final Object o;
    @dzsi
    public amml p;
    public final alpo q;
    public final altp r;
    public final dzsj<akwr> s;
    public final boolean t;
    final alwb u;
    public final ammc v;
    final alqg w;
    private String z;
    private static final dcep<amxf> y = dcep.E(amxf.NO_MAP, amxf.HYBRID_LEGEND, amxf.SATELLITE_LEGEND, amxf.TERRAIN_LEGEND);
    private static final dbsl<dmpn> aQ = alpy.a;
    private boolean A = true;
    private boolean B = false;
    private boolean C = false;
    private boolean D = false;
    private boolean E = false;
    private boolean F = false;
    private boolean G = false;
    private final AtomicBoolean J = new AtomicBoolean(false);
    private final Set<akzx> M = dcnm.c();
    private final List<amjm> N = dchl.a();
    private final Map<String, amlq> aj = dcjz.d();
    private final akry au = akry.BASE;

    public alqj(Object obj, String str, almu almuVar, alrf alrfVar, bnsn bnsnVar, altp altpVar, akzh akzhVar, amyd amydVar, Context context, dzsj dzsjVar, dzsj dzsjVar2, dzsj dzsjVar3, dzsj dzsjVar4, ammc ammcVar, akzz akzzVar, almp almpVar, alpo alpoVar, final amii amiiVar, alrw alrwVar, alrv alrvVar, alom alomVar, aljr aljrVar, alot alotVar, aljt aljtVar, amix amixVar, btmv btmvVar, ckcw ckcwVar, btrm btrmVar, alwc alwcVar, bvjj bvjjVar, amfi amfiVar, amym amymVar, Executor executor, Executor executor2, ambz ambzVar, alyx alyxVar, amrg amrgVar, alov alovVar, amyj amyjVar, akpr akprVar, akfa akfaVar, boolean z, amml ammlVar, amml ammlVar2, boolean z2) {
        Object obj2 = new Object();
        this.i = obj2;
        this.aw = new Object();
        this.k = new Object();
        this.m = new Object();
        this.o = new Object();
        this.ay = new Object();
        this.aA = new Object();
        this.aC = false;
        this.aE = new AtomicBoolean(false);
        this.aP = false;
        alqa alqaVar = new alqa(this);
        this.u = alqaVar;
        this.w = new alqg(this);
        this.a = obj;
        this.z = str;
        this.I = ckcwVar;
        this.U = btrmVar;
        this.T = alwcVar;
        this.V = bvjjVar;
        this.W = amfiVar;
        this.X = executor;
        this.f = executor2;
        this.g = ambzVar;
        this.aN = alyxVar;
        this.Z = alrfVar;
        this.Y = bnsnVar;
        this.r = altpVar;
        this.b = akzhVar;
        this.L = amydVar;
        this.aF = context;
        this.aG = amymVar;
        this.S = context.getResources();
        this.H = ckcwVar.e();
        this.s = dzsjVar;
        this.aH = dzsjVar2;
        this.aI = dzsjVar3;
        this.aJ = dzsjVar4;
        this.h = almuVar;
        this.ag = alrvVar;
        this.ae = alomVar;
        this.af = aljrVar;
        this.ad = alotVar;
        this.ac = aljtVar;
        this.v = ammcVar;
        this.d = akzzVar;
        this.aM = almpVar;
        this.R = alrwVar;
        this.e = amiiVar;
        this.q = alpoVar;
        this.ab = anai.c;
        this.aa = akprVar;
        this.aO = akfaVar;
        this.t = z;
        synchronized (obj2) {
            aljw aljwVar = new aljw();
            aljwVar.b(amxf.ROADMAP);
            aljwVar.c(z2);
            this.j = aljwVar.a();
        }
        amiiVar.getClass();
        almuVar.a = new dbsz(amiiVar) { // from class: alpu
            private final amii a;

            {
                this.a = amiiVar;
            }

            @Override // defpackage.dbsz
            public final void NU(Object obj3) {
                this.a.z((amko) obj3);
            }
        };
        this.ah = amrgVar;
        this.ai = alovVar;
        this.aS = amyjVar;
        this.az = ammlVar;
        alpoVar.j(ammlVar);
        this.aB = ammlVar2;
        alsz alszVar = new alsz(btmvVar, executor2, ambzVar);
        this.aK = alszVar;
        this.aL = new alst(alszVar);
        if (z && ((akwr) dzsjVar.a()).e()) {
            this.ax = aU();
        }
        amml ammlVar3 = this.ax;
        if (ammlVar3 != null) {
            alpoVar.j(ammlVar3);
        }
        if (((akwr) dzsjVar.a()).m()) {
            amml aK = aK();
            this.l = aK;
            if (aK != null) {
                alpoVar.j(aK);
            }
        }
        if (((akwr) dzsjVar.a()).n()) {
            amml aL = aL();
            this.p = aL;
            if (aL != null) {
                alpoVar.j(aL);
            }
        }
        if (((akwr) dzsjVar.a()).o()) {
            amml aM = aM();
            this.n = aM;
            if (aM != null) {
                alpoVar.j(aM);
            }
        }
        if (amiiVar instanceof amiu) {
            amixVar.f = (amiu) amiiVar;
        }
        alomVar.h = amixVar;
        alpoVar.d();
        amxf aQ2 = aQ();
        synchronized (this.i) {
            alqe c = this.j.c();
            c.b(aQ2);
            c.c(z2);
            this.j = c.a();
            aI(false);
            alwcVar.d(alqaVar);
            alwcVar.a();
            aH(this.j.d(), true, true);
        }
        this.aT = new alqd(this.M);
    }

    private final boolean aO() {
        boolean z;
        synchronized (this.i) {
            z = false;
            if (!o() && !p() && this.j.a() != amxf.NO_MAP) {
                z = true;
            }
        }
        return z;
    }

    private final void aP() {
        anai anaiVar = this.ab;
        if (anaiVar != null) {
            dbsk.m(Thread.currentThread() == anaiVar.a, anaiVar.b);
        }
    }

    private final amxf aQ() {
        if (this.D) {
            return amxf.BASEMAP_EDITING;
        }
        if (this.C || this.K) {
            if (!this.aP) {
                return this.B ? amxf.NAVIGATION_LOW_LIGHT : amxf.NAVIGATION;
            } else if (this.B) {
                return amxf.NAVIGATION_EMBEDDED_AUTO_LOW_LIGHT;
            } else {
                return amxf.NAVIGATION_EMBEDDED_AUTO;
            }
        } else if (this.B) {
            return amxf.NAVIGATION_LOW_LIGHT;
        } else {
            if (this.an != null) {
                return amxf.ROADMAP;
            }
            if (this.am != null || this.F) {
                return amxf.TRANSIT_FOCUSED;
            }
            if (this.as != null) {
                return amxf.ROADMAP;
            }
            if (this.E) {
                return amxf.ROUTE_OVERVIEW;
            }
            if (this.at != null) {
                return amxf.ROADMAP_INFO_LAYER;
            }
            return amxf.ROADMAP;
        }
    }

    private final void aR() {
        amml ammlVar = this.ap;
        if (ammlVar != null) {
            this.q.k(ammlVar);
            this.ap = null;
        }
        amml ammlVar2 = this.aq;
        if (ammlVar2 != null) {
            this.q.k(ammlVar2);
            this.aq = null;
        }
    }

    private final void aS(amxf amxfVar) {
        aT(amxfVar, false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
        if ((!defpackage.alqj.y.contains(r8.j.a())) != false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void aT(defpackage.amxf r9, boolean r10) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.i
            monitor-enter(r0)
            alqf r1 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r1 = r1.a()     // Catch: java.lang.Throwable -> Lb8
            if (r9 != r1) goto L10
            if (r10 == 0) goto Le
            goto L10
        Le:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb8
            return
        L10:
            alqf r10 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r10 = r10.a()     // Catch: java.lang.Throwable -> Lb8
            amzz r10 = r10.r     // Catch: java.lang.Throwable -> Lb8
            alqf r10 = r8.j     // Catch: java.lang.Throwable -> Lb8
            alqe r10 = r10.c()     // Catch: java.lang.Throwable -> Lb8
            r10.b(r9)     // Catch: java.lang.Throwable -> Lb8
            alqf r9 = r10.a()     // Catch: java.lang.Throwable -> Lb8
            r8.j = r9     // Catch: java.lang.Throwable -> Lb8
            alwn r9 = r9.d()     // Catch: java.lang.Throwable -> Lb8
            r10 = 1
            r8.aH(r9, r10, r10)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r9 = r8.ay     // Catch: java.lang.Throwable -> Lb8
            monitor-enter(r9)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r9 = r8.z     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = ""
            boolean r9 = r9.equals(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r9 == 0) goto L4c
            alqf r9 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r9 = r9.a()     // Catch: java.lang.Throwable -> Lb8
            dcep<amxf> r1 = defpackage.alqj.y     // Catch: java.lang.Throwable -> Lb8
            boolean r9 = r1.contains(r9)     // Catch: java.lang.Throwable -> Lb8
            r9 = r9 ^ r10
            if (r9 == 0) goto L9f
        L4c:
            alyl r9 = r8.ar()     // Catch: java.lang.Throwable -> Lb8
            alyk r9 = r9.o()     // Catch: java.lang.Throwable -> Lb8
            alqf r1 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r1 = r1.a()     // Catch: java.lang.Throwable -> Lb8
            amxf r2 = defpackage.amxf.ROADMAP     // Catch: java.lang.Throwable -> Lb8
            if (r1 != r2) goto L76
            r9.e(r10)     // Catch: java.lang.Throwable -> Lb8
            dzsj<akwv> r10 = r8.aJ     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r10 = r10.a()     // Catch: java.lang.Throwable -> Lb8
            akwv r10 = (defpackage.akwv) r10     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r1 = r8.z     // Catch: java.lang.Throwable -> Lb8
            akry r2 = defpackage.akry.BASE     // Catch: java.lang.Throwable -> Lb8
            dmxl r2 = r2.H     // Catch: java.lang.Throwable -> Lb8
            java.lang.String r10 = r10.b(r1, r2)     // Catch: java.lang.Throwable -> Lb8
            r9.f(r10)     // Catch: java.lang.Throwable -> Lb8
        L76:
            alrw r1 = r8.R     // Catch: java.lang.Throwable -> Lb8
            akry r2 = r8.au     // Catch: java.lang.Throwable -> Lb8
            alyl r3 = r9.b()     // Catch: java.lang.Throwable -> Lb8
            android.content.res.Resources r4 = r8.S     // Catch: java.lang.Throwable -> Lb8
            alqf r9 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r5 = r9.a()     // Catch: java.lang.Throwable -> Lb8
            alqf r9 = r8.j     // Catch: java.lang.Throwable -> Lb8
            alwn r6 = r9.d()     // Catch: java.lang.Throwable -> Lb8
            akpr r7 = r8.aa     // Catch: java.lang.Throwable -> Lb8
            amml r9 = r1.c(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r10 = r8.ay     // Catch: java.lang.Throwable -> Lb8
            monitor-enter(r10)     // Catch: java.lang.Throwable -> Lb8
            alpo r1 = r8.q     // Catch: java.lang.Throwable -> Lb2
            amml r2 = r8.az     // Catch: java.lang.Throwable -> Lb2
            r1.l(r2, r9)     // Catch: java.lang.Throwable -> Lb2
            r8.az = r9     // Catch: java.lang.Throwable -> Lb2
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
        L9f:
            alpo r9 = r8.q     // Catch: java.lang.Throwable -> Lb8
            alqf r10 = r8.j     // Catch: java.lang.Throwable -> Lb8
            amxf r10 = r10.a()     // Catch: java.lang.Throwable -> Lb8
            alqf r1 = r8.j     // Catch: java.lang.Throwable -> Lb8
            alwn r1 = r1.d()     // Catch: java.lang.Throwable -> Lb8
            r9.o(r10, r1)     // Catch: java.lang.Throwable -> Lb8
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb8
            return
        Lb2:
            r9 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> Lb2
            throw r9     // Catch: java.lang.Throwable -> Lb8
        Lb5:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb5
            throw r10     // Catch: java.lang.Throwable -> Lb8
        Lb8:
            r9 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Lb8
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alqj.aT(amxf, boolean):void");
    }

    @dzsi
    private final amml aU() {
        amml d;
        btlu j = this.aO.j();
        if (j.l() && j != null) {
            akrw b = akrw.b(j.d);
            alyl w = this.q.w();
            synchronized (this.i) {
                d = this.R.d(b, w, this.g.d(b, w), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
            }
            return d;
        }
        return null;
    }

    @Override // defpackage.akoq
    public final void A(akry akryVar) {
        amml b;
        aP();
        switch (akryVar.ordinal()) {
            case 17:
            case 18:
            case 19:
            case 20:
                B();
                synchronized (this.i) {
                    b = this.R.b(akryVar, ar(), this.S, this.j.a(), this.j.d());
                    this.ar = b;
                }
                this.q.j(b);
                return;
            default:
                String valueOf = String.valueOf(akryVar);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 29);
                sb.append(valueOf);
                sb.append(" is not a valid explore type.");
                throw new IllegalArgumentException(sb.toString());
        }
    }

    @Override // defpackage.akoq
    public final void B() {
        aP();
        if (i()) {
            this.q.k(this.ar);
            this.ar = null;
        }
    }

    @Override // defpackage.akoq
    public final void C(boolean z) {
        aP();
        if (!z) {
            if (j()) {
                this.q.k(this.am);
                this.am = null;
            }
        } else if (!j()) {
            alrw alrwVar = this.R;
            Resources resources = this.S;
            alyl ar = ar();
            amml I = amml.I(alrwVar.b, alrwVar.a, alrwVar.m, resources, akry.TRANSIT, ar, alrwVar.c, alrwVar.d, alrwVar.e, alrwVar.f.d(akrw.a(akry.TRANSIT), ar), alrwVar.g, alrwVar.h, alrwVar.i, alrwVar.j, alrwVar.k, alrwVar.r, alrwVar.q, r());
            this.am = I;
            this.q.j(I);
        }
        if (aO()) {
            I();
        }
    }

    @Override // defpackage.akoq
    public final void D(boolean z) {
        aP();
        if (!z) {
            if (k()) {
                this.q.k(this.an);
                this.an = null;
            }
        } else if (!k()) {
            alrw alrwVar = this.R;
            Resources resources = this.S;
            alyl ar = ar();
            amml I = amml.I(alrwVar.b, alrwVar.a, alrwVar.m, resources, akry.BICYCLING_OVERLAY, ar, alrwVar.c, alrwVar.d, alrwVar.e, alrwVar.f.d(akrw.a(akry.BICYCLING_OVERLAY), ar), alrwVar.g, alrwVar.h, alrwVar.i, alrwVar.j, alrwVar.k, alrwVar.r, alrwVar.q, r());
            this.an = I;
            this.q.j(I);
        }
        if (aO()) {
            I();
        }
    }

    @Override // defpackage.akoq
    public final void E(boolean z) {
        amml b;
        aP();
        if (!z) {
            if (!l()) {
                return;
            }
            this.q.k(this.ao);
            this.ao = null;
        } else if (l()) {
        } else {
            synchronized (this.i) {
                b = this.R.b(akry.STREET_VIEW, ar(), this.S, this.j.a(), this.j.d());
                this.ao = b;
            }
            this.q.j(b);
        }
    }

    @Override // defpackage.akoq
    public final void F(boolean z) {
        amml b;
        aP();
        if (!z) {
            if (m()) {
                this.q.k(this.as);
                this.as = null;
            }
        } else if (!m()) {
            synchronized (this.i) {
                b = this.R.b(akry.BUILDING_3D, ar(), this.S, this.j.a(), this.j.d());
                this.as = b;
            }
            this.q.j(b);
        }
        if (aO()) {
            I();
        }
    }

    @Override // defpackage.akoq
    public final void G(boolean z) {
        amml b;
        aP();
        if (!z) {
            if (!n()) {
                return;
            }
            this.q.k(this.at);
            this.at = null;
        } else if (n()) {
        } else {
            synchronized (this.i) {
                b = this.R.b(akry.COVID19, ar(), this.S, this.j.a(), this.j.d());
                this.at = b;
            }
            this.q.j(b);
        }
    }

    @Override // defpackage.akoq
    public final void H() {
        aP();
        if (this.ap == null) {
            aR();
            amml a = this.R.a(akry.SATELLITE, ar(), this.S, this.aH);
            this.ap = a;
            this.q.j(a);
        }
        aN();
        aS(this.D ? amxf.HYBRID_BASEMAP_EDITING : amxf.HYBRID_LEGEND);
    }

    @Override // defpackage.akoq
    public final void I() {
        aP();
        aR();
        aN();
        aS(aQ());
    }

    @Override // defpackage.akoq
    public final void J() {
        aP();
        if (this.aq != null) {
            return;
        }
        aR();
        amml a = this.R.a(r() ? akry.TERRAIN_DARK : akry.TERRAIN, ar(), this.S, this.aH);
        this.aq = a;
        this.q.j(a);
        aN();
        aS(amxf.TERRAIN_LEGEND);
    }

    @Override // defpackage.akoq
    public final void K(boolean z) {
        amml ammlVar;
        boolean contains;
        if (!this.aD) {
            return;
        }
        aG(!z);
        synchronized (this.ay) {
            ammlVar = this.az;
        }
        ammlVar.u();
        synchronized (this.aA) {
            amml ammlVar2 = this.aB;
            if (ammlVar2 != null) {
                amyj amyjVar = this.aS;
                if (amyjVar.a() && z) {
                    if (amyjVar.b == 3) {
                        contains = amyjVar.a.contains(dwwj.PROJECTED_DRIVING_NAVIGATION);
                    } else {
                        contains = amyjVar.a.contains(dwwj.NORMAL_DRIVING_NAVIGATION);
                    }
                    if (contains) {
                        this.aC = true;
                        this.q.j(ammlVar2);
                    }
                }
                if (this.aC) {
                    this.aC = false;
                    this.q.k(ammlVar2);
                }
            }
        }
    }

    @Override // defpackage.akoq
    public final void L(String str, amlq amlqVar, boolean z) {
        amlq amlqVar2 = this.aj.get(str);
        this.aj.put(str, amlqVar);
        if (z && amlqVar2 != null) {
            this.q.m(amlqVar2, amlqVar, true);
            return;
        }
        if (amlqVar2 != null) {
            aJ(amlqVar2);
        }
        if (!this.aD) {
            return;
        }
        this.q.j(amlqVar);
    }

    @Override // defpackage.akoq
    public final void M(String str) {
        amlq remove = this.aj.remove(str);
        if (remove != null) {
            aJ(remove);
        }
    }

    @Override // defpackage.akoq
    public final void N(TextView textView) {
        if (!this.aD) {
            return;
        }
        this.q.s(textView);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("GoogleMap:"));
        String concat = String.valueOf(str).concat("  ");
        String str2 = this.aI.a().f;
        StringBuilder sb = new StringBuilder(String.valueOf(concat).length() + 42 + String.valueOf(str2).length());
        sb.append(concat);
        sb.append("PaintParameterResponse.paintServerBaseUrl ");
        sb.append(str2);
        printWriter.println(sb.toString());
        this.q.NX(concat, printWriter);
        amyd amydVar = this.L;
        printWriter.println(String.valueOf(concat).concat("GmmRenderTarget:"));
        boolean z = amydVar.h != null;
        StringBuilder sb2 = new StringBuilder(String.valueOf(concat).length() + 35);
        sb2.append(concat);
        sb2.append("  frameRateRegulator present: ");
        sb2.append(z);
        printWriter.println(sb2.toString());
        alur alurVar = amydVar.h;
        if (alurVar != null) {
            alurVar.NX(String.valueOf(concat).concat("  "), printWriter);
        }
    }

    @Override // defpackage.akoq
    public final void O() {
        alqj alqjVar;
        if (!this.aD) {
            return;
        }
        if (this.av == null) {
            alrw alrwVar = this.R;
            bnsn bnsnVar = this.Y;
            akzh akzhVar = this.b;
            Resources resources = this.S;
            alyl ar = ar();
            boolean r = r();
            dxio<amom> dxioVar = alrwVar.b;
            altp altpVar = alrwVar.n;
            ammc ammcVar = alrwVar.c;
            bvkx bvkxVar = alrwVar.d;
            amoh amohVar = alrwVar.e;
            amco d = alrwVar.f.d(akrw.a(akry.INDOOR), ar);
            cqat cqatVar = alrwVar.g;
            btvt btvtVar = alrwVar.h;
            Executor executor = alrwVar.i;
            Executor executor2 = alrwVar.j;
            alyx alyxVar = alrwVar.l;
            alvc alvcVar = alrwVar.k;
            amyj amyjVar = alrwVar.r;
            akty aktyVar = alrwVar.p;
            akrz akrzVar = alrwVar.q;
            amlv amlvVar = new amlv(bnsnVar, akzhVar, new anbe(btvtVar, cqatVar), new amox(akrw.a(akry.INDOOR), ar, new amoj(4, aluv.b(resources) * 4, false, true), altpVar, amohVar, d, cqatVar, executor2, dxioVar, false, akrzVar, r), alvcVar, 4, 256, ammcVar, bvkxVar, amohVar, d, executor, alyxVar, amyjVar, ar, aktyVar, akrzVar);
            alqjVar = this;
            alqjVar.av = amlvVar;
        } else {
            alqjVar = this;
        }
        alqjVar.q.j(alqjVar.av);
        alqjVar.r.s((amlv) alqjVar.av, alqjVar.Y, alqjVar.Z, alqjVar.b, new alqh(alqjVar.e), alqjVar.aR);
        alqjVar.ae.j(aQ);
    }

    @Override // defpackage.akoq
    public final void P() {
        amml ammlVar;
        if (!this.aD || (ammlVar = this.av) == null) {
            return;
        }
        this.q.k(ammlVar);
        this.r.l();
        this.ae.i(aQ);
    }

    @Override // defpackage.akoq
    public final void Q(boolean z) {
        if (!this.aD) {
            return;
        }
        bnsn bnsnVar = this.Y;
        bnsnVar.k = z;
        bnsnVar.q();
    }

    @Override // defpackage.akoq
    public final void R(boolean z) {
        this.aP = z;
        if (aO()) {
            I();
        }
    }

    @Override // defpackage.akoq
    public final void S(amjm amjmVar) {
        if (!this.aD) {
            this.N.remove(amjmVar);
        } else {
            this.e.i(amjmVar);
        }
    }

    @Override // defpackage.akoq
    public final void T(@dzsi amjm amjmVar, @dzsi amjm amjmVar2) {
        if (!this.aD) {
            if (amjmVar2 != null) {
                this.N.remove(amjmVar2);
            }
            if (amjmVar == null) {
                return;
            }
            this.N.add(amjmVar);
        } else if (amjmVar2 != null && amjmVar != null) {
            this.e.j(amjmVar2, amjmVar);
        } else if (amjmVar2 != null) {
            this.e.i(amjmVar2);
        } else if (amjmVar == null) {
        } else {
            this.e.h(amjmVar);
        }
    }

    @Override // defpackage.akoq
    public final void U(amkx amkxVar) {
        if (!this.aD) {
            return;
        }
        amyn.b.a();
        amky n = this.e.n();
        float f = this.S.getConfiguration().fontScale;
        if (n != null && n.a == amkxVar && n.d == f) {
            return;
        }
        amky a = amky.a(amkxVar, f);
        alom alomVar = this.ae;
        alomVar.o = a;
        ((alnc) alomVar.j).e = a;
        this.e.m(a);
    }

    @Override // defpackage.akoq
    public final boolean V() {
        return this.aD && !this.d.h() && this.q.r() && this.e.f() && !this.Y.r();
    }

    @Override // defpackage.akoq
    public final void W(boolean z) {
        if (!this.aD) {
            return;
        }
        this.L.k(z);
    }

    @Override // defpackage.akoq
    public final void X(long j) {
        final amyd amydVar = this.L;
        alur alurVar = amydVar.h;
        if (alurVar != null) {
            alurVar.j(j);
            if (amydVar.l()) {
                bnss bnssVar = amydVar.d;
                dbsk.s(bnssVar);
                bnssVar.setTimeRemainingCallback(new bnsu(amydVar) { // from class: amxy
                    private final amyd a;

                    {
                        this.a = amydVar;
                    }

                    @Override // defpackage.bnsu
                    public final long a(long j2, long j3, boolean z) {
                        alur alurVar2 = this.a.h;
                        dbsk.s(alurVar2);
                        return alurVar2.m(j2, j3, z);
                    }
                });
            }
        }
        amqs amqsVar = amydVar.e.f.get(Integer.valueOf(System.identityHashCode(amydVar)));
        if (amqsVar != null) {
            amqsVar.b = (int) j;
        }
    }

    @Override // defpackage.akoq
    public final void Y(boolean z) {
        alur alurVar = this.L.h;
        if (alurVar != null) {
            alurVar.l(z);
        }
    }

    @Override // defpackage.akoq
    public final void Z(boolean z) {
        this.G = z;
    }

    @Override // defpackage.akoq
    public final void a(akpc akpcVar, bnss bnssVar, boolean z) {
        synchronized (this.i) {
            this.q.o(this.j.a(), this.j.d());
        }
        this.d.j(this.aT);
        hvv hvvVar = this.aU;
        if (hvvVar != null) {
            bvkx a = hvvVar.a.a();
            if (!a.p(durz.EIT_SEARCH) || a.q()) {
                a.c();
            }
        }
        ampi.a = this.S.getDisplayMetrics().density;
        this.r.k(this.U, this.aK, this.aL);
        bnsn bnsnVar = this.Y;
        bnsnVar.l = this.aM;
        amyd amydVar = this.L;
        dbsk.l(bnsnVar.g == null);
        bnsnVar.g = amydVar;
        bnsn bnsnVar2 = this.Y;
        akzh akzhVar = this.b;
        dbsk.l(bnsnVar2.h == null);
        bnsnVar2.h = akzhVar;
        amyd amydVar2 = this.L;
        amydVar2.b = this.q;
        amydVar2.a(this.ag);
        this.L.a(this.ad);
        this.L.a(this.ac);
        for (amjm amjmVar : this.N) {
            this.e.h(amjmVar);
        }
        this.N.clear();
        this.e.h(this.ae.c);
        ammx ammxVar = (ammx) this.d;
        this.O = akpcVar;
        this.P = bnssVar;
        this.Q = new alqb(this, bnssVar, ammxVar);
        alkc alkcVar = new alkc(bnssVar.a(), this.b, ammxVar, new alqc(new Handler()));
        new alnd(this.d, new cqaz());
        this.O.e();
        if (z != this.K) {
            this.K = z;
            aS(aQ());
        }
        this.c = alkcVar;
        this.aD = true;
        btrm btrmVar = this.U;
        alqg alqgVar = this.w;
        dceq a2 = dcet.a();
        a2.b(alhp.class, new alre(alhp.class, alqgVar));
        btrmVar.g(alqgVar, a2.a());
        btrm btrmVar2 = this.U;
        aljt aljtVar = this.ac;
        dceq a3 = dcet.a();
        a3.b(algq.class, new alju(algq.class, aljtVar));
        btrmVar2.g(aljtVar, a3.a());
        btrm btrmVar3 = this.U;
        alot alotVar = this.ad;
        dceq a4 = dcet.a();
        a4.b(algs.class, new alou(0, algs.class, alotVar));
        a4.b(algu.class, new alou(1, algu.class, alotVar));
        btrmVar3.g(alotVar, a4.a());
        btrm btrmVar4 = this.U;
        alom alomVar = this.ae;
        dceq a5 = dcet.a();
        a5.b(alho.class, new alon(0, alho.class, alomVar, bvrj.UI_THREAD));
        a5.b(algo.class, new alon(1, algo.class, alomVar, bvrj.UI_THREAD));
        btrmVar4.g(alomVar, a5.a());
        this.V.f(this);
    }

    @Override // defpackage.akph
    public final aksp aA() {
        return this.ac;
    }

    @Override // defpackage.akph
    public final aktz aB() {
        return this.ad;
    }

    @Override // defpackage.akph
    public final akty aC() {
        return this.ae;
    }

    @Override // defpackage.akph
    public final aksn aD() {
        return this.af;
    }

    @Override // defpackage.akph
    public final akvz aE() {
        return this.ag;
    }

    @Override // defpackage.akph
    public final akto aF() {
        return this.h;
    }

    public final void aG(boolean z) {
        if (!this.t) {
            return;
        }
        synchronized (this.aw) {
            boolean z2 = false;
            if (z) {
                try {
                    if (this.s.a().e()) {
                        z2 = true;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            amml ammlVar = this.ax;
            if (ammlVar == null && z2) {
                amml aU = aU();
                this.ax = aU;
                if (aU != null) {
                    this.q.j(aU);
                }
            } else if (ammlVar != null && !z2) {
                this.q.k(ammlVar);
                this.ax = null;
            }
        }
    }

    final void aH(alwn alwnVar, boolean z, boolean z2) {
        if (!this.A || this.T.l() == alwnVar) {
            return;
        }
        this.q.p(alwnVar);
        synchronized (this.aA) {
            amml ammlVar = this.aB;
            if (ammlVar != null && ammlVar.C.b != alwnVar) {
                ammlVar.B(alwnVar);
            }
        }
        this.T.m(alwnVar);
        this.h.o(alwnVar.A);
        ambz ambzVar = this.g;
        for (akrw akrwVar : ambzVar.a.keySet()) {
            ambzVar.f(akrwVar);
        }
    }

    public final void aI(boolean z) {
        this.q.q(z);
        if (this.J.compareAndSet(z, !z)) {
            if (z) {
                this.H.a((ckcr) this.I.a(ckgh.i));
            } else {
                this.H = this.I.e();
            }
        }
    }

    public final void aJ(amlq amlqVar) {
        if (!this.aD) {
            return;
        }
        this.q.k(amlqVar);
    }

    @dzsi
    public final amml aK() {
        amml d;
        btlu j = this.aO.j();
        if (j.l()) {
            akrw c = akrw.c(j.d);
            alyl w = this.q.w();
            synchronized (this.i) {
                d = this.R.d(c, w, this.g.d(c, w), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
            }
            return d;
        }
        return null;
    }

    @dzsi
    public final amml aL() {
        amml d;
        btlu j = this.aO.j();
        if (j.l()) {
            akrw d2 = akrw.d(j.d);
            alyl w = this.q.w();
            synchronized (this.i) {
                d = this.R.d(d2, w, this.g.d(d2, w), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
            }
            return d;
        }
        return null;
    }

    @dzsi
    public final amml aM() {
        amml d;
        akrw akrwVar = new akrw(new StringBuilder("busyness").toString(), akry.BUSYNESS);
        alyl w = this.q.w();
        synchronized (this.i) {
            d = this.R.d(akrwVar, w, this.g.d(akrwVar, w), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
        }
        return d;
    }

    public final void aN() {
        if (!this.aD) {
            return;
        }
        this.e.A();
    }

    @Override // defpackage.akoq
    public final boolean aa() {
        if (!this.aD) {
            return true;
        }
        amyd amydVar = this.L;
        dbsk.s(amydVar.h);
        return amydVar.l() ? amydVar.q : amydVar.h.f();
    }

    @Override // defpackage.akoq
    public final akpq ab() {
        return this.Z;
    }

    @Override // defpackage.akoq
    @dzsi
    public final String ac() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("labels", this.e.q());
            akzh akzhVar = this.b;
            JSONObject jSONObject2 = new JSONObject();
            alad p = akzhVar.p();
            akqq S = p.j.S();
            jSONObject2.put("target_point", new JSONObject().put("lat", S.a).put("lng", S.b));
            jSONObject2.put("zoom", p.k);
            jSONObject2.put("tilt", p.l);
            jSONObject2.put("bearing", p.m);
            jSONObject.put("camera", jSONObject2);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // defpackage.akoq
    public final crzm<aktu> ad() {
        return this.e.r();
    }

    @Override // defpackage.akoq
    public final crzm<Boolean> ae() {
        return this.e.g();
    }

    @Override // defpackage.akoq
    public final void af() {
        amky n;
        if (this.aD && (n = this.e.n()) != null) {
            U(n.a);
        }
    }

    @Override // defpackage.akoq
    public final void ag(final akyc akycVar, @dzsi final akzt akztVar) {
        ConfigurationInfo deviceConfigurationInfo;
        if (!this.aD || this.c == null) {
            return;
        }
        if (!this.L.f || ((deviceConfigurationInfo = ((ActivityManager) this.aF.getSystemService("activity")).getDeviceConfigurationInfo()) != null && deviceConfigurationInfo.reqGlEsVersion < 131072)) {
            akyb akybVar = this.Q;
            if (akybVar == null) {
                return;
            }
            akycVar.a(akybVar);
        } else if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            this.X.execute(new Runnable(this, akycVar, akztVar) { // from class: alpv
                private final alqj a;
                private final akyc b;
                private final akzt c;

                {
                    this.a = this;
                    this.b = akycVar;
                    this.c = akztVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    alqj alqjVar = this.a;
                    akyc akycVar2 = this.b;
                    akzt akztVar2 = this.c;
                    alkc alkcVar = alqjVar.c;
                    if (alkcVar != null) {
                        alkcVar.c(akycVar2, akztVar2);
                    }
                }
            });
        } else {
            this.c.c(akycVar, akztVar);
        }
    }

    @Override // defpackage.akoq
    public final bntf ah() {
        return this.L.i;
    }

    @Override // defpackage.akoq
    public final synchronized void ai(boolean z) {
        if (this.G) {
            return;
        }
        if (this.aE.compareAndSet(false, true)) {
            this.v.m();
            this.q.n();
        } else if (!z) {
        } else {
            this.q.n();
        }
    }

    @Override // defpackage.akoq
    public final akxa aj() {
        almu almuVar = this.h;
        if (almuVar.b == null) {
            almuVar.b = new akxa(almuVar);
        }
        akxa akxaVar = almuVar.b;
        dbsk.s(akxaVar);
        return akxaVar;
    }

    @Override // defpackage.akoq
    public final amrg ak() {
        return this.ah;
    }

    @Override // defpackage.akoq
    public final void al(amwd amwdVar) {
        this.aR = amwdVar;
        this.r.n(amwdVar);
    }

    @Override // defpackage.akoq
    public final void am() {
        this.aG.a.a();
        alst alstVar = this.aL;
        synchronized (alstVar) {
            alstVar.d = true;
        }
        this.q.t();
    }

    @Override // defpackage.akoq
    public final void an() {
        this.f.execute(new Runnable(this) { // from class: alpw
            private final alqj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alqj alqjVar = this.a;
                try {
                    alqjVar.q.i();
                } catch (RuntimeException e) {
                    bvoo.i(e);
                }
                alqjVar.aG(alqjVar.t);
                synchronized (alqjVar.k) {
                    boolean m = alqjVar.s.a().m();
                    amml ammlVar = alqjVar.l;
                    if (ammlVar == null && m) {
                        amml aK = alqjVar.aK();
                        alqjVar.l = aK;
                        if (aK != null) {
                            alqjVar.q.j(alqjVar.l);
                        }
                    } else if (ammlVar != null && !m) {
                        alqjVar.q.k(ammlVar);
                        alqjVar.l = null;
                    }
                }
                synchronized (alqjVar.o) {
                    boolean n = alqjVar.s.a().n();
                    amml ammlVar2 = alqjVar.p;
                    if (ammlVar2 == null && n) {
                        amml aL = alqjVar.aL();
                        alqjVar.p = aL;
                        if (aL != null) {
                            alqjVar.q.j(alqjVar.p);
                        }
                    } else if (ammlVar2 != null && !n) {
                        alqjVar.q.k(ammlVar2);
                        alqjVar.p = null;
                    }
                }
                synchronized (alqjVar.m) {
                    boolean o = alqjVar.s.a().o();
                    amml ammlVar3 = alqjVar.n;
                    if (ammlVar3 == null && o) {
                        alqjVar.n = alqjVar.aM();
                        alqjVar.q.j(alqjVar.n);
                    } else if (ammlVar3 != null && !o) {
                        alqjVar.q.k(ammlVar3);
                        alqjVar.n = null;
                    }
                }
            }
        });
        try {
            this.aN.a();
        } catch (RuntimeException e) {
            bvoo.i(e);
        }
        try {
            this.T.n();
        } catch (RuntimeException e2) {
            bvoo.i(e2);
        }
        try {
            this.W.k();
        } catch (RuntimeException e3) {
            bvoo.i(e3);
        }
    }

    @Override // defpackage.akoq
    public final void ao(boolean z) {
        aP();
        if (z == this.B) {
            return;
        }
        this.B = z;
        if (!aO()) {
            return;
        }
        I();
    }

    @Override // defpackage.akoq
    public final void ap(boolean z) {
        aP();
        synchronized (this.i) {
            if (z == this.j.b()) {
                return;
            }
            alqe c = this.j.c();
            c.c(z);
            this.j = c.a();
            if (aO()) {
                aT(aQ(), true);
            } else if (p()) {
                amml a = this.R.a(this.j.b() ? akry.TERRAIN_DARK : akry.TERRAIN, ar(), this.S, this.aH);
                alpo alpoVar = this.q;
                amml ammlVar = this.aq;
                dbsk.s(ammlVar);
                alpoVar.l(ammlVar, a);
                this.aq = a;
                aT(amxf.TERRAIN_LEGEND, true);
            }
        }
    }

    @Override // defpackage.akoq
    public final void aq(@dzsi final GmmLocation gmmLocation) {
        this.X.execute(new Runnable(this, gmmLocation) { // from class: alpx
            private final alqj a;
            private final GmmLocation b;

            {
                this.a = this;
                this.b = gmmLocation;
            }

            @Override // java.lang.Runnable
            public final void run() {
                alqj alqjVar = this.a;
                GmmLocation gmmLocation2 = this.b;
                altp altpVar = alqjVar.r;
                if (!altpVar.j()) {
                    return;
                }
                altv altvVar = gmmLocation2 == null ? null : gmmLocation2.i;
                if (!altpVar.f || altvVar == null) {
                    return;
                }
                altpVar.c(altvVar.a);
            }
        });
        amrg amrgVar = this.ah;
        if (!amrgVar.f) {
            amrgVar.d.f = gmmLocation != null ? gmmLocation.C() : null;
        }
    }

    @Override // defpackage.akoq
    public final alyl ar() {
        return this.q.w();
    }

    @Override // defpackage.akoq
    public final akso as() {
        return this.e.y();
    }

    @Override // defpackage.akoq
    public final alov at() {
        return this.ai;
    }

    @Override // defpackage.akoq
    public final void au(hvv hvvVar) {
        this.aU = hvvVar;
    }

    @Override // defpackage.akoq
    public final int av() {
        if (!this.aD) {
            return 2;
        }
        if (this.d.h()) {
            return 3;
        }
        if (!this.q.r()) {
            return 4;
        }
        if (!this.e.f()) {
            return 5;
        }
        return this.Y.r() ? 6 : 1;
    }

    @Override // defpackage.akph
    public final void aw(akzy akzyVar) {
        alkc alkcVar;
        if (!this.aD || (alkcVar = this.c) == null) {
            return;
        }
        if (alkcVar.e == null) {
            alkcVar.e = dcnm.c();
        }
        if (!alkcVar.e.add(akzyVar)) {
            return;
        }
        alkcVar.a();
    }

    @Override // defpackage.akph
    public final void ax(akzy akzyVar) {
        alkc alkcVar;
        Collection<akzy> collection;
        if (!this.aD || (alkcVar = this.c) == null || (collection = alkcVar.e) == null) {
            return;
        }
        collection.remove(akzyVar);
        if (alkcVar.e.isEmpty()) {
            alkcVar.e = null;
        }
        alkcVar.a();
    }

    @Override // defpackage.akph
    public final void ay(akzx akzxVar) {
        synchronized (this.M) {
            this.M.add(akzxVar);
        }
    }

    @Override // defpackage.akph
    public final void az(akzx akzxVar) {
        synchronized (this.M) {
            this.M.remove(akzxVar);
        }
    }

    /* JADX WARN: Type inference failed for: r2v15, types: [bnsa, java.lang.Object] */
    @Override // defpackage.akoq
    public final void b() {
        dcep K;
        this.U.a(this.w);
        this.U.a(this.ac);
        this.U.a(this.ad);
        this.U.a(this.ae);
        amrg amrgVar = this.ah;
        akty aktyVar = amrgVar.a;
        aktt akttVar = amrgVar.e.e;
        aloi aloiVar = ((alom) aktyVar).c;
        synchronized (aloiVar) {
            if (aloiVar.l.contains(akttVar)) {
                aloiVar.l.remove(akttVar);
            } else if (aloiVar.h != null && aloiVar.k.contains(akttVar)) {
                aloiVar.h.v(akttVar);
                aloiVar.k.remove(akttVar);
            }
        }
        amrgVar.f = true;
        this.r.l();
        this.T.e(this.u);
        this.T.c();
        this.V.g(this);
        bnss bnssVar = this.P;
        if (bnssVar != null) {
            bnssVar.e();
        }
        this.q.h();
        this.Z.f();
        alom alomVar = this.ae;
        alomVar.b.l(alomVar.k);
        aloi aloiVar2 = alomVar.c;
        synchronized (aloiVar2) {
            K = dcep.K(aloiVar2.g);
            aloiVar2.g.clear();
        }
        dcpd it = K.iterator();
        while (it.hasNext()) {
            ((amhf) it.next()).a();
        }
        this.e.d();
        almp almpVar = this.aM;
        bvrj.UI_THREAD.c();
        Runnable runnable = almpVar.j;
        if (runnable != null) {
            almpVar.p.l(runnable);
            almpVar.j = null;
        }
        almpVar.n.a(new almn(aktn.TAP, new akra(), true));
        bnsn bnsnVar = this.Y;
        if (bnuq.i.get() != bnuq.IDLE) {
            bnuq.i.get();
        }
        bnuq.i.set(bnuq.INVALID);
        while (true) {
            bnsl a = bnsnVar.a.a();
            if (a == null) {
                this.L.b(this.ag);
                this.L.b(this.ad);
                this.L.b(this.ac);
                this.aD = false;
                return;
            } else if (a.d == 1) {
                a.a.E(true);
            }
        }
    }

    @Override // defpackage.akoq
    public final void d() {
        this.A = true;
        amyd amydVar = this.L;
        alur alurVar = amydVar.h;
        dbsk.s(alurVar);
        alurVar.d();
        bnss bnssVar = amydVar.d;
        dbsk.s(bnssVar);
        bnssVar.c();
        synchronized (this.i) {
            aH(this.j.d(), true, true);
        }
        dbsk.s(this.O);
        this.O.b();
        this.q.f();
        this.e.b(this.Y, this.b);
        this.e.e();
        almp almpVar = this.aM;
        bvrj.UI_THREAD.c();
        almo almoVar = almpVar.n;
        if (almoVar.b == null) {
            dbsk.m(true, "start() already called.");
            almoVar.b = almpVar;
            almoVar.a.execute(almoVar);
        }
        if (!this.aD || !this.q.u(this.z)) {
            return;
        }
        this.q.x(this.aJ.a().a(this.z));
        aP();
        synchronized (this.ay) {
            this.az = this.q.v(this.az);
        }
        amml ammlVar = this.ak;
        if (ammlVar != null) {
            this.ak = this.q.v(ammlVar);
        }
        amml ammlVar2 = this.al;
        if (ammlVar2 != null) {
            this.al = this.q.v(ammlVar2);
        }
        amml ammlVar3 = this.am;
        if (ammlVar3 != null) {
            this.am = this.q.v(ammlVar3);
        }
        amml ammlVar4 = this.an;
        if (ammlVar4 != null) {
            this.an = this.q.v(ammlVar4);
        }
        amml ammlVar5 = this.ar;
        if (ammlVar5 != null) {
            this.ar = this.q.v(ammlVar5);
        }
        amml ammlVar6 = this.ap;
        if (ammlVar6 != null) {
            this.ap = this.q.v(ammlVar6);
        }
        amml ammlVar7 = this.aq;
        if (ammlVar7 != null) {
            this.aq = this.q.v(ammlVar7);
        }
        amml ammlVar8 = this.as;
        if (ammlVar8 != null) {
            this.as = this.q.v(ammlVar8);
        }
        amml ammlVar9 = this.at;
        if (ammlVar9 != null) {
            this.at = this.q.v(ammlVar9);
        }
        synchronized (this.aw) {
            amml ammlVar10 = this.ax;
            if (ammlVar10 != null) {
                this.ax = this.q.v(ammlVar10);
            }
        }
        synchronized (this.k) {
            amml ammlVar11 = this.l;
            if (ammlVar11 != null) {
                this.l = this.q.v(ammlVar11);
            }
        }
        synchronized (this.m) {
            amml ammlVar12 = this.n;
            if (ammlVar12 != null) {
                this.n = this.q.v(ammlVar12);
            }
        }
        synchronized (this.o) {
            amml ammlVar13 = this.p;
            if (ammlVar13 != null) {
                this.p = this.q.v(ammlVar13);
            }
        }
        if (this.av != null && this.r.j()) {
            this.r.l();
            alpo alpoVar = this.q;
            amml ammlVar14 = this.av;
            dbsk.s(ammlVar14);
            amml v = alpoVar.v(ammlVar14);
            this.av = v;
            this.r.s((amlv) v, this.Y, this.Z, this.b, new alqh(this.e), this.aR);
        } else {
            amml ammlVar15 = this.av;
            if (ammlVar15 != null) {
                amlv amlvVar = (amlv) ammlVar15;
                alyl p = amlvVar.f.p(ar());
                if (!p.equals(amlvVar.f)) {
                    this.av = amlvVar.m(p, this.g.d(amlvVar.e, p));
                }
            }
        }
        synchronized (this.aA) {
            amml ammlVar16 = this.aB;
            if (ammlVar16 != null) {
                if (!this.aC) {
                    alyl p2 = ammlVar16.f.p(ar());
                    if (!p2.equals(ammlVar16.f)) {
                        this.aB = ammlVar16.m(p2, this.g.d(ammlVar16.e, p2));
                    }
                } else {
                    this.aB = this.q.v(ammlVar16);
                }
            }
        }
        for (Map.Entry<String, amlq> entry : this.aj.entrySet()) {
            if (entry.getValue() instanceof amml) {
                amml ammlVar17 = (amml) entry.getValue();
                if (!ammlVar17.d.equals(akry.MY_MAPS_TILE_OVERLAY)) {
                    entry.setValue(this.q.v(ammlVar17));
                }
            }
        }
    }

    @Override // defpackage.akoq
    public final void e() {
        dbsk.s(this.O);
        this.O.a();
        this.T.b();
        this.q.g();
        amyd amydVar = this.L;
        bnss bnssVar = amydVar.d;
        dbsk.s(bnssVar);
        bnssVar.d();
        alur alurVar = amydVar.h;
        dbsk.s(alurVar);
        alurVar.e();
        amydVar.g.b(new alhp(true));
        this.A = false;
    }

    @Override // defpackage.akoq
    public final void f() {
        amml d;
        amml ammlVar;
        amml ammlVar2;
        amml ammlVar3 = null;
        if (this.t && this.s.a().e()) {
            synchronized (this.aw) {
                btlu j = this.aO.j();
                akrw b = j.l() ? akrw.b(j.d) : null;
                amml ammlVar4 = this.ax;
                if ((ammlVar4 != null || b != null) && (ammlVar4 == null || !dbsd.a(ammlVar4.e, b))) {
                    if (b != null) {
                        alyl ar = ar();
                        synchronized (this.i) {
                            ammlVar2 = this.R.d(b, ar, this.g.d(b, ar), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
                        }
                    } else {
                        ammlVar2 = null;
                    }
                    if (ammlVar2 == null) {
                        amml ammlVar5 = this.ax;
                        if (ammlVar5 != null) {
                            this.q.k(ammlVar5);
                        }
                    } else {
                        amml ammlVar6 = this.ax;
                        if (ammlVar6 == null) {
                            this.q.j(ammlVar2);
                        } else {
                            this.q.l(ammlVar6, ammlVar2);
                        }
                    }
                    this.ax = ammlVar2;
                }
            }
        }
        if (this.s.a().m()) {
            synchronized (this.k) {
                btlu j2 = this.aO.j();
                akrw c = j2.l() ? akrw.c(j2.d) : null;
                amml ammlVar7 = this.l;
                if ((ammlVar7 != null || c != null) && (ammlVar7 == null || !dbsd.a(ammlVar7.e, c))) {
                    if (c != null) {
                        alyl ar2 = ar();
                        synchronized (this.i) {
                            ammlVar = this.R.d(c, ar2, this.g.d(c, ar2), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
                        }
                    } else {
                        ammlVar = null;
                    }
                    if (ammlVar == null) {
                        amml ammlVar8 = this.l;
                        if (ammlVar8 != null) {
                            this.q.k(ammlVar8);
                        }
                    } else {
                        amml ammlVar9 = this.l;
                        if (ammlVar9 == null) {
                            this.q.j(ammlVar);
                        } else {
                            this.q.l(ammlVar9, ammlVar);
                        }
                    }
                    this.l = ammlVar;
                }
            }
        }
        if (this.s.a().n()) {
            synchronized (this.o) {
                btlu j3 = this.aO.j();
                akrw d2 = j3.l() ? akrw.d(j3.d) : null;
                amml ammlVar10 = this.p;
                if ((ammlVar10 == null && d2 == null) || (ammlVar10 != null && dbsd.a(ammlVar10.e, d2))) {
                    return;
                }
                if (d2 != null) {
                    alyl ar3 = ar();
                    synchronized (this.i) {
                        d = this.R.d(d2, ar3, this.g.d(d2, ar3), this.S, amxf.ROADMAP, amxf.ROADMAP.a(this.j.b()), null);
                    }
                    ammlVar3 = d;
                }
                if (ammlVar3 == null) {
                    amml ammlVar11 = this.p;
                    if (ammlVar11 != null) {
                        this.q.k(ammlVar11);
                    }
                } else {
                    amml ammlVar12 = this.p;
                    if (ammlVar12 == null) {
                        this.q.j(ammlVar3);
                    } else {
                        this.q.l(ammlVar12, ammlVar3);
                    }
                }
                this.p = ammlVar3;
            }
        }
    }

    @Override // defpackage.akoq
    public final boolean g() {
        aP();
        return this.ak != null;
    }

    @Override // defpackage.akoq
    public final boolean h() {
        aP();
        return this.al != null;
    }

    @Override // defpackage.akoq
    public final boolean i() {
        aP();
        return this.ar != null;
    }

    @Override // defpackage.akoq
    public final boolean j() {
        aP();
        return this.am != null;
    }

    @Override // defpackage.akoq
    public final boolean k() {
        aP();
        return this.an != null;
    }

    @Override // defpackage.akoq
    public final boolean l() {
        aP();
        return this.ao != null;
    }

    @Override // defpackage.akoq
    public final boolean m() {
        aP();
        return this.as != null;
    }

    @Override // defpackage.akoq
    public final boolean n() {
        aP();
        return this.at != null;
    }

    @Override // defpackage.akoq
    public final boolean o() {
        aP();
        return this.ap != null;
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        aP();
    }

    @Override // defpackage.akoq
    public final boolean p() {
        aP();
        return this.aq != null;
    }

    @Override // defpackage.akoq
    public final boolean q() {
        aP();
        return this.B;
    }

    @Override // defpackage.akoq
    public final boolean r() {
        boolean b;
        aP();
        synchronized (this.i) {
            b = this.j.b();
        }
        return b;
    }

    @Override // defpackage.akoq
    public final void s(boolean z) {
        if (!this.aD) {
            return;
        }
        aP();
        if (this.C == z) {
            return;
        }
        this.C = z;
        if (!aO()) {
            return;
        }
        I();
    }

    @Override // defpackage.akoq
    public final void t(boolean z) {
        if (!this.aD) {
            return;
        }
        aP();
        if (this.E == z) {
            return;
        }
        this.E = z;
        if (!aO()) {
            return;
        }
        I();
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        synchronized (this.i) {
            b.b("baseMapType", this.au);
            b.b("drawingConfig", this.j);
        }
        return b.toString();
    }

    @Override // defpackage.akoq
    public final void u(boolean z) {
        if (!this.aD) {
            return;
        }
        aP();
        if (this.F == z) {
            return;
        }
        this.F = z;
        if (!aO()) {
            return;
        }
        I();
    }

    @Override // defpackage.akoq
    public final void v(boolean z) {
        if (!this.aD) {
            return;
        }
        aP();
        if (this.D == z) {
            return;
        }
        this.D = z;
        if (aO()) {
            I();
        } else {
            H();
        }
    }

    @Override // defpackage.akoq
    public final void w(boolean z) {
        aP();
        if (!z) {
            if (g()) {
                this.q.k(this.ak);
                this.ak = null;
            }
        } else if (!g()) {
            alrw alrwVar = this.R;
            Resources resources = this.S;
            long millis = TimeUnit.SECONDS.toMillis(this.aH.a().c());
            alyl ar = ar();
            boolean r = r();
            dxio<amom> dxioVar = alrwVar.b;
            bnsn bnsnVar = alrwVar.a;
            akzh akzhVar = alrwVar.m;
            akry akryVar = alrwVar.o;
            ammc ammcVar = alrwVar.c;
            bvkx bvkxVar = alrwVar.d;
            amoh amohVar = alrwVar.e;
            amco d = alrwVar.f.d(akrw.a(akryVar), ar);
            cqat cqatVar = alrwVar.g;
            btvt btvtVar = alrwVar.h;
            Executor executor = alrwVar.i;
            Executor executor2 = alrwVar.j;
            alvc alvcVar = alrwVar.k;
            amyj amyjVar = alrwVar.r;
            akrz akrzVar = alrwVar.q;
            int a = aluv.a(resources);
            ammo ammoVar = new ammo(bnsnVar, akzhVar, new anbe(btvtVar, cqatVar), new amox(akrw.a(akryVar), ar, new amoj(2, a + a, false, true), null, amohVar, d, cqatVar, executor2, dxioVar, false, akrzVar, r), alvcVar, 2, 256, true, ammcVar, bvkxVar, amohVar, d, executor, amyjVar, millis, ar, akrzVar);
            this.ak = ammoVar;
            this.q.j(ammoVar);
        }
        if (aO()) {
            I();
        }
    }

    @Override // defpackage.akoq
    public final void x(int i) {
        aP();
        ambz ambzVar = this.g;
        alzy alzyVar = ambzVar.b;
        boolean z = false;
        if (i >= 0 && i <= TimeUnit.DAYS.toSeconds(7L)) {
            z = true;
        }
        dbsk.a(z);
        if (alzyVar.a != i) {
            alzyVar.a = i;
            ambzVar.f(akrw.a(akry.TRAFFIC_V2));
        }
    }

    @Override // defpackage.akoq
    public final void y() {
        aP();
        ambz ambzVar = this.g;
        alzy alzyVar = ambzVar.b;
        if (alzyVar.a > 0) {
            alzyVar.a = -1;
            ambzVar.f(akrw.a(akry.TRAFFIC_V2));
        }
    }

    @Override // defpackage.akoq
    public final void z(boolean z) {
        aP();
        if (!z) {
            if (!h()) {
                return;
            }
            this.q.k(this.al);
            this.al = null;
        } else if (h()) {
        } else {
            alrw alrwVar = this.R;
            Resources resources = this.S;
            alyl ar = ar();
            boolean r = r();
            dxio<amom> dxioVar = alrwVar.b;
            bnsn bnsnVar = alrwVar.a;
            akzh akzhVar = alrwVar.m;
            akry akryVar = akry.REALTIME;
            ammc ammcVar = alrwVar.c;
            bvkx bvkxVar = alrwVar.d;
            amoh amohVar = alrwVar.e;
            amco d = alrwVar.f.d(akrw.a(akry.REALTIME), ar);
            cqat cqatVar = alrwVar.g;
            btvt btvtVar = alrwVar.h;
            Executor executor = alrwVar.i;
            Executor executor2 = alrwVar.j;
            alvc alvcVar = alrwVar.k;
            amyj amyjVar = alrwVar.r;
            akrz akrzVar = alrwVar.q;
            dbsk.a(false);
            akrw a = akrw.a(akryVar);
            int a2 = aluv.a(resources);
            amml ammlVar = new amml(bnsnVar, akzhVar, a, ar, new anbe(btvtVar, cqatVar), new amox(a, ar, new amoj(30, a2 + a2, false, false), null, amohVar, d, cqatVar, executor2, dxioVar, false, akrzVar, r), alvcVar, null, 30, true, 256, 256, false, true, ammcVar, bvkxVar, amohVar, d, executor, null, null, amyjVar, null, null, akrzVar);
            this.al = ammlVar;
            this.q.j(ammlVar);
        }
    }
}
