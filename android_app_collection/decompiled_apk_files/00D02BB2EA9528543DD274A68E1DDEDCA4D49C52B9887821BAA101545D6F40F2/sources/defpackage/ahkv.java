package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.LocationAvailability;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: ahkv  reason: default package */
/* loaded from: classes.dex */
public final class ahkv implements ahjq, ahsn, ahoq, ahor {
    public duue C;
    public volatile GmmLocation E;
    public boolean H;
    private final dxio<ahng> I;
    private final dxio<ahjv> J;
    private final dxio<ahkd> K;
    private final dxio<ckcw> L;
    private final ahjw M;
    public final Context a;
    public final bvrb b;
    public final btrm c;
    public final dxio<btpa> d;
    public final bvjj e;
    public ahos f;
    public final axru i;
    @dzsi
    public ahsp j;
    public ahsf k;
    public ahsr l;
    public ahrz m;
    public ahry n;
    public ahsi o;
    public ahkx p;
    public final cqat q;
    public final crzv<GmmLocation> h = new crzv<>(ahko.a);
    private volatile boolean N = false;
    private volatile boolean O = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    private boolean P = false;
    public boolean u = false;
    private boolean Q = false;
    private boolean R = false;
    private boolean S = false;
    private boolean T = false;
    private boolean U = false;
    private boolean V = false;
    private boolean W = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public volatile boolean z = false;
    public dqvj A = dqvj.WALK;
    private boolean X = false;
    public boolean B = false;
    private final AtomicInteger Y = new AtomicInteger(0);
    public ahso D = ahso.GPS_AND_NETWORK;
    public volatile ahjt F = new ahjt();
    public boolean G = true;
    private final ConcurrentLinkedQueue<ahkb> Z = new ConcurrentLinkedQueue<>();
    private final Runnable aa = new ahkt(this);
    private final Runnable ab = new ahku(this);
    public final List<ahsp> g = new ArrayList();

    public ahkv(Context context, bvrb bvrbVar, btrm btrmVar, dxio<btpa> dxioVar, bvjj bvjjVar, axru axruVar, cqat cqatVar, dxio<ahng> dxioVar2, dxio<ahjv> dxioVar3, dxio<ahkd> dxioVar4, dxio<ckcw> dxioVar5, ahjw ahjwVar) {
        this.q = cqatVar;
        this.a = context;
        this.b = bvrbVar;
        this.c = btrmVar;
        this.d = dxioVar;
        this.e = bvjjVar;
        this.i = axruVar;
        this.I = dxioVar2;
        this.J = dxioVar3;
        this.K = dxioVar4;
        this.L = dxioVar5;
        this.M = ahjwVar;
    }

    private final void z() {
        ahsp ahspVar;
        bvrj.LOCATION_SENSORS.c();
        Iterator<ahsp> it = this.g.iterator();
        while (true) {
            if (!it.hasNext()) {
                ahspVar = null;
                break;
            }
            ahspVar = it.next();
            if (ahspVar.e()) {
                break;
            }
        }
        if (ahspVar == null || ahspVar == this.j) {
            return;
        }
        ahspVar.a(this.D, this.L.a());
        ahsp ahspVar2 = this.j;
        if (ahspVar2 != null) {
            ahspVar2.d();
        }
        this.j = ahspVar;
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
        printWriter.write(str);
        printWriter.write("LocationController: ");
        printWriter.println(toString());
        printWriter.write(str);
        printWriter.println(this.F.toString());
        ahsp ahspVar = this.j;
        if (ahspVar != null) {
            printWriter.write(str);
            printWriter.println(ahspVar.toString());
        }
    }

    @Override // defpackage.btth
    @dzsi
    /* renamed from: a */
    public final GmmLocation y() {
        int i = ckfu.a;
        if (d()) {
            return this.E;
        }
        return null;
    }

    @Override // defpackage.ahjq
    public final crzm<GmmLocation> b() {
        return this.h.a;
    }

    @Override // defpackage.ahjq
    public final boolean d() {
        return this.F.a();
    }

    @Override // defpackage.ahjq
    public final boolean e() {
        return this.i.a("android.permission.ACCESS_BACKGROUND_LOCATION");
    }

    @Override // defpackage.ahjq
    public final void f() {
        this.O = true;
        v();
    }

    @Override // defpackage.ahjq
    public final void g() {
        this.O = false;
        v();
    }

    @Override // defpackage.ahjq
    public final ahjt h() {
        return this.F;
    }

    @Override // defpackage.ahjq
    @dzsi
    public final LocationAvailability i() {
        GoogleApiClient googleApiClient;
        ahsf ahsfVar = this.k;
        if (ahsfVar == null || (googleApiClient = ahsfVar.a) == null) {
            return null;
        }
        return ahsfVar.b.getLocationAvailability(googleApiClient);
    }

    @Override // defpackage.ahjq
    public final void j(boolean z) {
        this.N = z;
        v();
    }

    @Override // defpackage.ahjq
    public final void k() {
        this.Y.incrementAndGet();
        v();
    }

    @Override // defpackage.ahjq
    public final void l() {
        dbsk.l(this.Y.decrementAndGet() >= 0);
        v();
    }

    @Override // defpackage.ahjq
    public final void m() {
        this.b.b(this.ab, bvrj.LOCATION_SENSORS);
    }

    @Override // defpackage.ahjq
    public final void n() {
        ahkx ahkxVar = this.p;
        if (ahkxVar != null) {
            ahkxVar.a();
        }
    }

    @Override // defpackage.ahjq
    public final void o() {
    }

    @Override // defpackage.ahoq
    public final void p(@dzsi GmmLocation gmmLocation) {
        bvrj.LOCATION_DISPATCHER.c();
        if (gmmLocation == null || !d()) {
            return;
        }
        this.E = gmmLocation;
        this.c.b(new amqo(gmmLocation));
        this.h.a();
        QuantizedDeviceLocation quantizedDeviceLocation = gmmLocation.e;
        if (!this.z || quantizedDeviceLocation == null) {
            return;
        }
        this.e.al(bvjk.he, quantizedDeviceLocation.a());
    }

    @Override // defpackage.ahor
    public final void q(ahso ahsoVar) {
        bvrj.LOCATION_DISPATCHER.c();
        this.b.b(new ahks(this, ahsoVar), bvrj.LOCATION_SENSORS);
    }

    @Override // defpackage.btth
    public final boolean r() {
        return this.F.a == ahjs.ENABLED;
    }

    @Override // defpackage.btth
    public final boolean s() {
        return this.i.a("android.permission.ACCESS_FINE_LOCATION") || this.i.a("android.permission.ACCESS_COARSE_LOCATION");
    }

    @Override // defpackage.btth
    public final boolean t() {
        return this.i.a("android.permission.ACCESS_FINE_LOCATION");
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isActivityAttached", this.O);
        b.h("isEnabled()", d());
        b.h("isNavigating", this.r);
        b.b("currentTravelMode", this.A);
        b.h("isTransitGuiding", this.s);
        b.h("isCarConnected", this.t);
        b.h("isSemanticLocationScanningStarted", this.N);
        b.b("genericClientCount", this.Y);
        b.h("phoneInertialSensorsForNavEnabled", this.w);
        b.h("areActivitySensorsStarted", this.P);
        b.h("areLocationSensorsStarted", this.R);
        b.h("areInertialSensorsStarted", this.T);
        b.h("inertialSensorsWorking", this.U);
        b.h("isCarBearingEventPosterStarted", false);
        b.h("areBleBeaconSensorsStarted", this.W);
        b.h("isPressureSensorStarted", this.V);
        b.b("lastLocation", this.E);
        return b.toString();
    }

    public final void u() {
        int i = ckfu.a;
        dxio<ahjv> dxioVar = this.J;
        if (dxioVar != null) {
            dxioVar.a().b();
            this.u = false;
        }
    }

    public final void v() {
        this.b.b(this.aa, bvrj.LOCATION_SENSORS);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0063, code lost:
        if (r0 == false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x031d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0323  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x032e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0345  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0401 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0440  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0459 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:272:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void w() {
        /*
            Method dump skipped, instructions count: 1145
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahkv.w():void");
    }

    @Override // defpackage.ahsn
    public final void x() {
        bvrj.LOCATION_SENSORS.c();
        if (this.R) {
            z();
        }
    }
}
