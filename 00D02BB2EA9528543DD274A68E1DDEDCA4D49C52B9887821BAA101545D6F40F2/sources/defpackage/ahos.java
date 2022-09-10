package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Handler;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: ahos  reason: default package */
/* loaded from: classes2.dex */
public final class ahos implements ahqd {
    public static final /* synthetic */ int C = 0;
    private static final dcqe D = dcqe.c("ahos");
    private static final dqvj E = dqvj.WALK;
    @dzsi
    public final ahjw B;
    @dzsi
    private final ahpy F;
    private final ahpk G;
    private final ahpq H;
    private final ahpl I;
    private final ahoq J;
    private final ahor K;
    private final bqyp L;
    private final String N;
    private final dehq O;
    private ahso P;
    @dzsi
    private ahju Q;
    private int R;
    private long S;
    @dzsi
    private Location T;
    @dzsi
    private GmmLocation U;
    private GmmLocation V;
    @dzsi
    private GmmLocation W;
    private boolean X;
    private final boolean Z;
    @dzsi
    public dzke a;
    private final byte[] aa;
    private long ab;
    public long b;
    public final ahow c;
    public final ahpm d;
    public final ahoa e;
    public final ahnv f;
    public final ahnm g;
    @dzsi
    ahog h;
    public final ckcw i;
    public final cqat j;
    public final btrm k;
    public final btvo l;
    public final bvrb m;
    @dzsi
    public final ahpt n;
    @dzsi
    public final cjqy o;
    @dzsi
    public amuh r;
    public boolean u;
    public boolean v;
    long x;
    public dqvj p = E;
    public boolean q = false;
    public long t = -4611686018427387904L;
    public boolean w = true;
    public bvpk y = bvpk.a(ahoj.a);
    public final List<ahkb> z = new ArrayList();
    public boolean A = false;
    private final SecureRandom Y = new SecureRandom();
    public final ahno s = new ahno();
    private final String M = Locale.getDefault().toString();

    public ahos(Context context, ahoq ahoqVar, ahor ahorVar, btvo btvoVar, bqyp bqypVar, bwsa bwsaVar, btrm btrmVar, cqat cqatVar, bvrb bvrbVar, dehq dehqVar, ckcw ckcwVar, cjqy cjqyVar, buqb buqbVar, bttf bttfVar, ahjw ahjwVar) {
        ahpt ahptVar;
        btwd btwdVar;
        this.v = true;
        this.J = ahoqVar;
        this.K = ahorVar;
        this.k = btrmVar;
        this.l = btvoVar;
        this.L = bqypVar;
        this.m = bvrbVar;
        this.O = dehqVar;
        this.i = ckcwVar;
        this.j = cqatVar;
        this.o = cjqyVar;
        this.N = bttfVar.a();
        this.B = ahjwVar;
        btwd navigationParameters = btvoVar.getNavigationParameters();
        if (navigationParameters.D() == 0.0f && navigationParameters.E() == 0.0f) {
            ahptVar = null;
            btwdVar = navigationParameters;
        } else {
            btwdVar = navigationParameters;
            ahptVar = new ahpt(navigationParameters.D(), navigationParameters.E(), new ahok(this), cqatVar.b(), cqatVar);
        }
        this.n = ahptVar;
        this.F = new ahpy(context, bwsaVar, buqbVar);
        this.d = new ahpm(btvoVar, cqatVar, ckcwVar);
        this.e = new ahoa(btvoVar, cqatVar);
        this.f = new ahnv(btvoVar, cqatVar, ckcwVar);
        this.c = new ahow(btvoVar, cqatVar);
        this.g = new ahnm(cqatVar, btrmVar, ckcwVar, ahptVar);
        this.G = new ahpk(ckcwVar);
        this.H = new ahpq();
        this.I = new ahpl();
        this.v = ahnz.a(context);
        this.aa = new byte[0];
        this.Z = !btwdVar.a.bh;
        ahnz.b(context, new ahop(this, new Handler(bvqm.a(context, bvrj.LOCATION_DISPATCHER, bvrbVar).getLooper()), context));
    }

    protected static final GmmLocation h(GmmLocation gmmLocation, @dzsi Location location) {
        if (location == gmmLocation.o) {
            return gmmLocation;
        }
        amvs amvsVar = new amvs();
        amvsVar.j(gmmLocation);
        if (location == null) {
            amvsVar.t = null;
        } else if (location instanceof GmmLocation) {
            amvsVar.t = location;
        } else {
            try {
                amvsVar.t = new Location(location);
            } catch (Exception unused) {
                amvsVar.t = null;
            }
        }
        return amvsVar.d();
    }

    private final void j(GmmLocation gmmLocation) {
        double d;
        long j = gmmLocation.j;
        if (m(gmmLocation)) {
            if (gmmLocation.hasSpeed() && gmmLocation.hasBearing()) {
                if (!gmmLocation.hasSpeedAccuracy() || !gmmLocation.hasBearingAccuracy()) {
                    r(new ahql(j, gmmLocation.getSpeed(), gmmLocation.getBearing(), gmmLocation.getAccuracy()));
                } else {
                    r(new ahql(j, gmmLocation.getSpeed(), gmmLocation.getBearing(), gmmLocation.getSpeedAccuracyMetersPerSecond(), gmmLocation.getBearingAccuracyDegrees()));
                }
            }
            r(new ahqn(j, true, (gmmLocation.getExtras() != null && gmmLocation.getExtras().getInt("signal_possible_in_tunnels") == 1) || gmmLocation.k()));
        }
        if (gmmLocation.hasAltitude()) {
            gmmLocation.hasVerticalAccuracy();
        }
        akra C2 = gmmLocation.C();
        double accuracy = gmmLocation.getAccuracy();
        if (!m(gmmLocation)) {
            d = ahqc.f;
        } else {
            d = ahqc.e;
        }
        r(new ahqj(j, C2, accuracy, d));
    }

    @dzsi
    private final GmmLocation k(@dzsi GmmLocation gmmLocation, long j, boolean z) {
        GmmLocation a = this.h.a(Math.max(this.ab, j));
        if (a != null) {
            if (!z) {
                return a;
            }
            ((ckco) this.i.a(ckhi.aN)).a(8);
            return a;
        }
        return gmmLocation;
    }

    private final boolean l() {
        return this.p == dqvj.DRIVE || this.p == dqvj.TWO_WHEELER;
    }

    private final boolean m(GmmLocation gmmLocation) {
        if (!gmmLocation.i() && !gmmLocation.k()) {
            if (l()) {
                return false;
            }
            if (this.p == dqvj.TRANSIT) {
                return this.l.getTransitTrackingParameters().q;
            }
        }
        return true;
    }

    private static GmmLocation n(Location location) {
        if (location instanceof GmmLocation) {
            return (GmmLocation) location;
        }
        amvs amvsVar = new amvs();
        amvsVar.j(location);
        return amvsVar.d();
    }

    private final void o(@dzsi GmmLocation gmmLocation) {
        ahpt ahptVar = this.n;
        if (ahptVar != null && this.q && gmmLocation != null) {
            ahps j = ahptVar.j(5, gmmLocation);
            amvr s = gmmLocation.s();
            if (gmmLocation.r() && s != null) {
                long j2 = s.h;
                if (j2 > 0) {
                    synchronized (ahptVar.c) {
                        ahps ahpsVar = null;
                        for (ahps ahpsVar2 : ahptVar.c) {
                            if (ahpsVar2.a > j2) {
                                break;
                            } else if (ahpsVar2.j == 5) {
                                ahpsVar = ahpsVar2;
                            }
                        }
                        if (ahpsVar != null && ahptVar.b.nextFloat() < ahptVar.a) {
                            ahptVar.g(j2);
                            ahpsVar.h = true;
                        }
                    }
                }
            }
            if (gmmLocation.p() && ahptVar.d()) {
                j.c = true;
            }
            if (gmmLocation.n() && ahptVar.d()) {
                j.d = true;
            }
            if (gmmLocation.o() && ahptVar.d()) {
                j.e = true;
            }
            ahptVar.c(j);
        }
        ahod ahodVar = this.g.e;
        GmmLocation gmmLocation2 = this.W;
        if (gmmLocation2 == null) {
            this.W = gmmLocation;
        } else if (gmmLocation != null && gmmLocation.distanceTo(gmmLocation2) > 500.0f) {
            this.X = true;
        }
        if (gmmLocation != null && gmmLocation.e() && gmmLocation.hasAccuracy() && gmmLocation.getAccuracy() < 50.0f) {
            this.t = this.j.g();
        }
        this.J.p(gmmLocation);
    }

    private final void p() {
        ahso ahsoVar;
        ahow ahowVar = this.c;
        if (ahowVar.e != Long.MIN_VALUE && ahowVar.b.e() - ahowVar.e <= 5000) {
            ahsoVar = ahso.PASSIVE;
        } else if (ahowVar.f == Long.MIN_VALUE || ahowVar.b.e() - ahowVar.f > 60000) {
            if (ahowVar.d == Long.MIN_VALUE || ahowVar.b.e() - ahowVar.d >= 10000) {
                ahsoVar = ahso.GPS_AND_NETWORK;
            } else {
                ahsoVar = ahso.GPS;
            }
        } else {
            ahsoVar = ahso.PASSIVE;
        }
        if (this.P != ahsoVar) {
            this.P = ahsoVar;
            this.K.q(ahsoVar);
        }
    }

    private final void q() {
        long g = this.j.g();
        boolean z = true;
        boolean z2 = g - this.t < ((long) this.l.getNavigationParameters().d());
        boolean z3 = !this.u ? this.X : g - this.t >= 10000;
        GmmLocation gmmLocation = this.V;
        if (gmmLocation == null || !gmmLocation.g()) {
            z = false;
        }
        f(z2, z3, z);
    }

    /* JADX WARN: Code restructure failed: missing block: B:254:0x056e, code lost:
        if (r20 > 0.95d) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0575, code lost:
        if (l() != false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0578, code lost:
        r2 = i(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x057c, code lost:
        if (r2 == null) goto L93;
     */
    /* JADX WARN: Code restructure failed: missing block: B:262:0x0582, code lost:
        if (r35.p != defpackage.dqvj.TRANSIT) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:263:0x0584, code lost:
        r2 = r2.A();
        r2.k(r3);
        r3 = r2.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0591, code lost:
        r3 = r3.A();
        r3.v(r2.getLatitude(), r2.getLongitude());
        r3.w(null);
        r3 = r3.d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x05a9, code lost:
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x019f, code lost:
        if ((r5.b.e() - r5.g) <= 4000) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x01f3, code lost:
        if ((r5.b.e() - r5.f) <= 60000) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x02f5  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0494 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:218:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x052e A[Catch: all -> 0x05af, TRY_LEAVE, TryCatch #0 {, blocks: (B:226:0x04c4, B:228:0x04d3, B:230:0x04e4, B:242:0x052e, B:234:0x04eb, B:236:0x04f3, B:237:0x04fc, B:239:0x0510, B:240:0x0519), top: B:276:0x04c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0536  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x05ac  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x05b1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x05c2  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x04c4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0172  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(android.location.Location r36) {
        /*
            Method dump skipped, instructions count: 1491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahos.c(android.location.Location):void");
    }

    public final void d() {
        ahpt ahptVar = this.n;
        if (ahptVar != null) {
            ahps j = ahptVar.j(3, null);
            if (ahptVar.e()) {
                j.f = true;
            }
            ahptVar.c(j);
        }
        ahow ahowVar = this.c;
        if (ahowVar.b.e() > ahowVar.d + ahowVar.a.d()) {
            ahowVar.c = false;
        }
        if (this.h != null) {
            long e = this.j.e();
            this.ab = e;
            r(new ahqn(e, false, false));
            dbsk.s(this.h);
            GmmLocation k = k(null, e, true);
            if (k != null) {
                this.V = k;
            }
            if (k != null) {
                o(h(k, null));
                this.T = null;
            } else {
                GmmLocation gmmLocation = this.V;
                if (gmmLocation != null && !ahnb.a(gmmLocation, this.j)) {
                    o(this.V);
                    this.T = null;
                }
            }
        }
        Location location = this.T;
        if (location != null) {
            GmmLocation n = n(location);
            ahpy ahpyVar = this.F;
            if (ahpyVar != null) {
                n = ahpyVar.a(n);
            }
            if (!this.q) {
                n = i(n);
            } else {
                ahpl ahplVar = this.I;
                if (n == null) {
                    n = null;
                } else if (n.e() || n.hasBearing() || !ahplVar.b) {
                    if (n.hasBearing()) {
                        ahplVar.a = n.getBearing();
                        ahplVar.b = true;
                    }
                } else {
                    amvs amvsVar = new amvs();
                    amvsVar.j(n);
                    amvsVar.p(ahplVar.a);
                    n = amvsVar.d();
                }
                if (l() && n != null && n.hasBearing() && !n.f()) {
                    amvs A = n.A();
                    A.l();
                    n = A.d();
                }
            }
            if (n != null) {
                n = h(n, this.T);
            }
            o(n);
            this.T = null;
        }
        e();
        q();
        p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void e() {
        bvrj.LOCATION_DISPATCHER.c();
        this.y.b();
        bvpk a = bvpk.a(new Runnable(this) { // from class: ahon
            private final ahos a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ahos ahosVar = this.a;
                if (ahosVar.v) {
                    return;
                }
                ahosVar.d();
            }
        });
        this.y = a;
        this.m.a(a, bvrj.LOCATION_DISPATCHER, 1300L);
    }

    public final void g() {
        ahog ahogVar;
        btwd navigationParameters;
        bvrj.LOCATION_DISPATCHER.c();
        boolean l = l();
        boolean z = !l;
        if (this.q) {
            ahog ahogVar2 = this.h;
            if (ahogVar2 == null) {
                this.u = false;
                this.X = false;
                this.W = null;
            }
            if (!z || (ahogVar2 instanceof ahpp)) {
                if (l && !(ahogVar2 instanceof ahpv)) {
                    if (ahogVar2 != null) {
                        ahogVar2.d();
                    }
                    cqat cqatVar = this.j;
                    bqyp bqypVar = this.L;
                    String str = this.M;
                    String str2 = this.N;
                    btwd navigationParameters2 = this.l.getNavigationParameters();
                    btrm btrmVar = this.k;
                    dehq dehqVar = this.O;
                    ckcw ckcwVar = this.i;
                    long nextLong = this.Z ? 0L : this.Y.nextLong();
                    byte[] bArr = this.aa;
                    ahpt ahptVar = this.n;
                    ahoi ahoiVar = new ahoi(bqypVar.j(), navigationParameters2.W().bS(), str, str2, navigationParameters2.c(), navigationParameters2.a.aZ, navigationParameters2.S(), navigationParameters2.a.bi, nextLong, bArr);
                    dvek dvekVar = navigationParameters2.a;
                    ahpv ahpvVar = new ahpv(cqatVar, bqypVar, ahoiVar, dvekVar.aW, dvekVar.bf, btrmVar, dehqVar, ckcwVar, ahptVar);
                    this.h = ahpvVar;
                    ahpvVar.c();
                    GmmLocation gmmLocation = this.U;
                    if (gmmLocation != null) {
                        j(gmmLocation);
                    }
                }
            } else {
                if (ahogVar2 != null) {
                    ahogVar2.d();
                }
                ahpp ahppVar = new ahpp(this.j, this.i, new ahoh(this.l.getNavigationParameters().W().bS(), navigationParameters.c()));
                this.h = ahppVar;
                ahppVar.c();
                GmmLocation gmmLocation2 = this.U;
                if (gmmLocation2 != null) {
                    j(gmmLocation2);
                }
            }
            amuh amuhVar = this.r;
            if (amuhVar == null || (ahogVar = this.h) == null) {
                return;
            }
            ahogVar.b(amuhVar);
            this.r = null;
            return;
        }
        ahog ahogVar3 = this.h;
        if (ahogVar3 == null) {
            return;
        }
        ahogVar3.d();
        this.h = null;
        this.a = null;
        this.b = -1L;
        ahpt ahptVar2 = this.n;
        if (ahptVar2 == null) {
            return;
        }
        ahptVar2.h();
    }

    @Override // defpackage.ahqd
    public final void r(ahqe ahqeVar) {
        bvrj.LOCATION_DISPATCHER.c();
        if (this.w) {
            return;
        }
        ahpt ahptVar = this.n;
        if (ahptVar != null && !(ahqeVar instanceof ahqn) && !(ahqeVar instanceof ahqh)) {
            ahptVar.a(ahqeVar);
        }
        ahog ahogVar = this.h;
        if (ahogVar == null) {
            return;
        }
        ahogVar.r(ahqeVar);
    }

    @Override // defpackage.ahqd
    public final long s() {
        throw null;
    }

    public final void f(boolean z, boolean z2, boolean z3) {
        ahju ahjuVar = this.Q;
        if (ahjuVar == null || ahjuVar.a != z || ahjuVar.b != z2 || ahjuVar.c != z3) {
            ahjuVar = new ahju(z, z2, z3);
        }
        if (ahjuVar != this.Q) {
            this.Q = ahjuVar;
            this.k.b(ahjuVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00ce  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final com.google.android.apps.gmm.map.model.location.GmmLocation i(@defpackage.dzsi com.google.android.apps.gmm.map.model.location.GmmLocation r19) {
        /*
            Method dump skipped, instructions count: 250
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahos.i(com.google.android.apps.gmm.map.model.location.GmmLocation):com.google.android.apps.gmm.map.model.location.GmmLocation");
    }
}
