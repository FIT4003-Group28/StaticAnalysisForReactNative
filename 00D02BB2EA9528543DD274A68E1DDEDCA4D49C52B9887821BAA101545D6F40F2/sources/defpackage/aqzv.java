package defpackage;

import android.location.Location;
import com.google.android.apps.gmm.location.events.CarHeadingEvent;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: aqzv  reason: default package */
/* loaded from: classes2.dex */
public final class aqzv implements aqzu {
    private final bvnx c;
    @dzsi
    private akra d;
    private GmmLocation e;
    private Location f;
    private boolean g;
    private boolean h;
    private long j;
    private long k;
    @dzsi
    private amvp m;
    @dzsi
    private akqa o;
    @dzsi
    private akqa p;
    @dzsi
    private akqa q;
    @dzsi
    private akqa r;
    private boolean s;
    private float t;
    private float u;
    private final boolean v;
    private final area a = new area();
    private final area b = new area();
    private final aqzw i = new aqzw();
    private long l = -4611686018427387904L;
    private final akqa n = new akqa(dcyn.a);

    public aqzv(bvnx bvnxVar, int i) {
        dbsk.s(bvnxVar);
        this.c = bvnxVar;
        this.d = null;
        boolean z = false;
        if (i != 3 && i != 4) {
            z = true;
        }
        this.v = z;
    }

    private final synchronized boolean p(long j) {
        if (this.g && this.s) {
            if (this.h) {
                this.i.b(j);
            }
            double d = j - this.j;
            Double.isNaN(d);
            double d2 = d / 1000.0d;
            double d3 = j - this.k;
            Double.isNaN(d3);
            s(d2, d3 / 1000.0d, this.a);
            return true;
        }
        return false;
    }

    private static void r(@dzsi akqa akqaVar) {
        if (akqaVar != null) {
            akqaVar.g(akqaVar.d(dcyn.a), dcyn.a, akqaVar.d(dcyn.a), dcyn.a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019 A[Catch: all -> 0x00b7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x000e, B:12:0x0019, B:14:0x0048, B:17:0x0088, B:21:0x0092, B:22:0x0096, B:23:0x00b1, B:16:0x005b), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b A[Catch: all -> 0x00b7, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x000e, B:12:0x0019, B:14:0x0048, B:17:0x0088, B:21:0x0092, B:22:0x0096, B:23:0x00b1, B:16:0x005b), top: B:29:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x008c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void s(double r11, double r13, defpackage.area r15) {
        /*
            r10 = this;
            monitor-enter(r10)
            boolean r0 = r10.v     // Catch: java.lang.Throwable -> Lb7
            r1 = 1
            if (r0 == 0) goto Ld
            akqa r0 = r10.r     // Catch: java.lang.Throwable -> Lb7
            if (r0 == 0) goto Lb
            goto Ld
        Lb:
            r0 = 0
            goto Le
        Ld:
            r0 = 1
        Le:
            r15.k = r0     // Catch: java.lang.Throwable -> Lb7
            amvp r0 = r10.m     // Catch: java.lang.Throwable -> Lb7
            r2 = 4591870180066957722(0x3fb999999999999a, double:0.1)
            if (r0 != 0) goto L5b
            akqa r0 = r10.p     // Catch: java.lang.Throwable -> Lb7
            defpackage.dbsk.s(r0)     // Catch: java.lang.Throwable -> Lb7
            akqa r4 = r10.q     // Catch: java.lang.Throwable -> Lb7
            defpackage.dbsk.s(r4)     // Catch: java.lang.Throwable -> Lb7
            akra r5 = new akra     // Catch: java.lang.Throwable -> Lb7
            double r6 = r0.d(r11)     // Catch: java.lang.Throwable -> Lb7
            int r6 = (int) r6     // Catch: java.lang.Throwable -> Lb7
            double r7 = r4.d(r11)     // Catch: java.lang.Throwable -> Lb7
            int r7 = (int) r7     // Catch: java.lang.Throwable -> Lb7
            r5.<init>(r6, r7)     // Catch: java.lang.Throwable -> Lb7
            r15.a = r5     // Catch: java.lang.Throwable -> Lb7
            double r5 = r0.f(r11)     // Catch: java.lang.Throwable -> Lb7
            double r7 = r4.f(r11)     // Catch: java.lang.Throwable -> Lb7
            double r4 = java.lang.Math.hypot(r5, r7)     // Catch: java.lang.Throwable -> Lb7
            float r0 = (float) r4     // Catch: java.lang.Throwable -> Lb7
            r15.g = r0     // Catch: java.lang.Throwable -> Lb7
            akqa r0 = r10.r     // Catch: java.lang.Throwable -> Lb7
            r4 = 0
            if (r0 == 0) goto L59
            double r4 = r0.d(r11)     // Catch: java.lang.Throwable -> Lb7
            float r4 = (float) r4     // Catch: java.lang.Throwable -> Lb7
            akqa r0 = r10.r     // Catch: java.lang.Throwable -> Lb7
            double r11 = r11 + r2
            double r11 = r0.d(r11)     // Catch: java.lang.Throwable -> Lb7
            float r11 = (float) r11     // Catch: java.lang.Throwable -> Lb7
            r9 = r4
            r4 = r11
            r11 = r9
            goto L88
        L59:
            r11 = 0
            goto L88
        L5b:
            akra r4 = new akra     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            akqa r5 = r10.n     // Catch: java.lang.Throwable -> Lb7
            double r5 = r5.d(r11)     // Catch: java.lang.Throwable -> Lb7
            double r5 = r0.a(r5, r4)     // Catch: java.lang.Throwable -> Lb7
            float r5 = (float) r5     // Catch: java.lang.Throwable -> Lb7
            r15.a = r4     // Catch: java.lang.Throwable -> Lb7
            akqa r4 = r10.n     // Catch: java.lang.Throwable -> Lb7
            double r6 = r4.f(r11)     // Catch: java.lang.Throwable -> Lb7
            float r4 = (float) r6     // Catch: java.lang.Throwable -> Lb7
            r15.g = r4     // Catch: java.lang.Throwable -> Lb7
            akqa r4 = r10.n     // Catch: java.lang.Throwable -> Lb7
            double r11 = r11 + r2
            double r11 = r4.d(r11)     // Catch: java.lang.Throwable -> Lb7
            akra r4 = new akra     // Catch: java.lang.Throwable -> Lb7
            r4.<init>()     // Catch: java.lang.Throwable -> Lb7
            double r11 = r0.a(r11, r4)     // Catch: java.lang.Throwable -> Lb7
            float r4 = (float) r11     // Catch: java.lang.Throwable -> Lb7
            r11 = r5
        L88:
            akqa r12 = r10.o     // Catch: java.lang.Throwable -> Lb7
            if (r12 == 0) goto Lb1
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 <= 0) goto L96
            r12 = 0
            r10.o = r12     // Catch: java.lang.Throwable -> Lb7
            goto Lb1
        L96:
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            double r13 = java.lang.Math.min(r13, r4)     // Catch: java.lang.Throwable -> Lb7
            double r4 = r12.d(r13)     // Catch: java.lang.Throwable -> Lb7
            float r11 = (float) r4     // Catch: java.lang.Throwable -> Lb7
            float r11 = defpackage.bvop.a(r11)     // Catch: java.lang.Throwable -> Lb7
            double r13 = r13 + r2
            double r12 = r12.d(r13)     // Catch: java.lang.Throwable -> Lb7
            float r12 = (float) r12     // Catch: java.lang.Throwable -> Lb7
            float r4 = defpackage.bvop.a(r12)     // Catch: java.lang.Throwable -> Lb7
            r15.k = r1     // Catch: java.lang.Throwable -> Lb7
        Lb1:
            r15.e = r11     // Catch: java.lang.Throwable -> Lb7
            r15.f = r4     // Catch: java.lang.Throwable -> Lb7
            monitor-exit(r10)
            return
        Lb7:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzv.s(double, double, area):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0048 A[Catch: all -> 0x0117, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x0013, B:8:0x001d, B:10:0x0025, B:12:0x0029, B:15:0x0030, B:17:0x0034, B:19:0x0044, B:21:0x0048, B:18:0x0041, B:22:0x004a, B:24:0x004e, B:26:0x0066, B:29:0x0074, B:31:0x007a, B:33:0x0081, B:35:0x0087, B:37:0x008f, B:39:0x0095, B:41:0x009b, B:42:0x00a0, B:44:0x00c2, B:46:0x00db, B:48:0x00e2, B:50:0x00ec, B:51:0x00f3, B:53:0x00fd, B:54:0x0104), top: B:64:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void t(double r23, com.google.android.apps.gmm.map.model.location.GmmLocation r25) {
        /*
            Method dump skipped, instructions count: 284
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzv.t(double, com.google.android.apps.gmm.map.model.location.GmmLocation):void");
    }

    private final synchronized void u(double d, amvp amvpVar, double d2, double d3) {
        amvp amvpVar2 = this.m;
        double d4 = this.n.d(d);
        double f = this.n.f(d);
        akra akraVar = new akra();
        amvpVar2.a(d4, akraVar);
        this.n.g(amvpVar.b(akraVar), f, d2 + d3, d3);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0029 A[Catch: all -> 0x00a6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x0010, B:12:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0040, B:20:0x0046, B:25:0x0052, B:27:0x0062, B:29:0x0068, B:31:0x006e, B:33:0x0088, B:36:0x00a2), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0033 A[Catch: all -> 0x00a6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x0010, B:12:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0040, B:20:0x0046, B:25:0x0052, B:27:0x0062, B:29:0x0068, B:31:0x006e, B:33:0x0088, B:36:0x00a2), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006e A[Catch: all -> 0x00a6, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x0010, B:12:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0040, B:20:0x0046, B:25:0x0052, B:27:0x0062, B:29:0x0068, B:31:0x006e, B:33:0x0088, B:36:0x00a2), top: B:42:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00a2 A[Catch: all -> 0x00a6, TRY_ENTER, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:10:0x0010, B:12:0x0029, B:13:0x002f, B:15:0x0033, B:17:0x003a, B:19:0x0040, B:20:0x0046, B:25:0x0052, B:27:0x0062, B:29:0x0068, B:31:0x006e, B:33:0x0088, B:36:0x00a2), top: B:42:0x0001 }] */
    @Override // defpackage.aqzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void a(defpackage.area r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.v     // Catch: java.lang.Throwable -> La6
            r1 = 1
            if (r0 == 0) goto Lf
            area r0 = r5.a     // Catch: java.lang.Throwable -> La6
            boolean r0 = r0.k     // Catch: java.lang.Throwable -> La6
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            area r2 = r5.a     // Catch: java.lang.Throwable -> La6
            akra r3 = r2.a     // Catch: java.lang.Throwable -> La6
            float r4 = r2.e     // Catch: java.lang.Throwable -> La6
            int r2 = r2.i     // Catch: java.lang.Throwable -> La6
            r6.c(r3, r4, r2, r0)     // Catch: java.lang.Throwable -> La6
            area r2 = r5.a     // Catch: java.lang.Throwable -> La6
            float r3 = r2.g     // Catch: java.lang.Throwable -> La6
            r6.g = r3     // Catch: java.lang.Throwable -> La6
            float r2 = r2.f     // Catch: java.lang.Throwable -> La6
            r6.f = r2     // Catch: java.lang.Throwable -> La6
            boolean r2 = r5.h     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L2f
            aqzw r2 = r5.i     // Catch: java.lang.Throwable -> La6
            float r2 = r2.a     // Catch: java.lang.Throwable -> La6
            r6.e = r2     // Catch: java.lang.Throwable -> La6
        L2f:
            akra r2 = r5.d     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L48
            r6.b = r2     // Catch: java.lang.Throwable -> La6
            android.location.Location r2 = r5.f     // Catch: java.lang.Throwable -> La6
            r3 = 0
            if (r2 == 0) goto L46
            boolean r2 = r2.hasBearing()     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L46
            android.location.Location r2 = r5.f     // Catch: java.lang.Throwable -> La6
            float r3 = r2.getBearing()     // Catch: java.lang.Throwable -> La6
        L46:
            r6.c = r3     // Catch: java.lang.Throwable -> La6
        L48:
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r0) goto L50
            r1 = 1061997773(0x3f4ccccd, float:0.8)
            goto L52
        L50:
            r1 = 1065353216(0x3f800000, float:1.0)
        L52:
            float r3 = r5.t     // Catch: java.lang.Throwable -> La6
            float r4 = r5.u     // Catch: java.lang.Throwable -> La6
            float r3 = defpackage.ardi.b(r3, r4)     // Catch: java.lang.Throwable -> La6
            float r1 = r1 * r3
            r6.q = r1     // Catch: java.lang.Throwable -> La6
            com.google.android.apps.gmm.map.model.location.GmmLocation r1 = r5.e     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L6c
            amvw r1 = r1.x()     // Catch: java.lang.Throwable -> La6
            if (r1 == 0) goto L6c
            java.util.List<amvl> r1 = r1.b     // Catch: java.lang.Throwable -> La6
            r6.d = r1     // Catch: java.lang.Throwable -> La6
        L6c:
            if (r0 != 0) goto La2
            bvnx r0 = r5.c     // Catch: java.lang.Throwable -> La6
            long r0 = r0.a()     // Catch: java.lang.Throwable -> La6
            r2 = 2500(0x9c4, double:1.235E-320)
            long r0 = r0 % r2
            double r0 = (double) r0
            r2 = 4618760256179416344(0x401921fb54442d18, double:6.283185307179586)
            java.lang.Double.isNaN(r0)
            double r0 = r0 * r2
            r2 = 4657715973212602368(0x40a3880000000000, double:2500.0)
            double r0 = r0 / r2
            double r0 = java.lang.Math.sin(r0)     // Catch: java.lang.Throwable -> La6
            double r0 = java.lang.Math.abs(r0)     // Catch: java.lang.Throwable -> La6
            r2 = 4594572339843380019(0x3fc3333333333333, double:0.15)
            double r0 = r0 * r2
            r2 = 4606506878855911834(0x3fed99999999999a, double:0.925)
            double r0 = r0 + r2
            float r0 = (float) r0     // Catch: java.lang.Throwable -> La6
            r6.r = r0     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return
        La2:
            r6.r = r2     // Catch: java.lang.Throwable -> La6
            monitor-exit(r5)
            return
        La6:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzv.a(area):void");
    }

    @Override // defpackage.aqzu
    public final synchronized boolean b(long j) {
        return p(j);
    }

    @Override // defpackage.aqzu
    public final void c(akzh akzhVar) {
        alad p = akzhVar.p();
        this.t = p.k;
        this.u = p.l;
    }

    @Override // defpackage.aqzu, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        aqzt.a(this);
    }

    @Override // defpackage.aqzu
    public final void d() {
    }

    @Override // defpackage.aqzu
    public final void e() {
    }

    @Override // defpackage.aqzu
    public final void f() {
    }

    @Override // defpackage.aqzu
    public final void g() {
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a8 A[Catch: all -> 0x00d5, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0027, B:10:0x0036, B:12:0x003a, B:16:0x0041, B:18:0x0047, B:19:0x004b, B:21:0x005c, B:22:0x0064, B:26:0x0071, B:28:0x0077, B:32:0x007e, B:33:0x0088, B:36:0x00a2, B:38:0x00a8, B:39:0x00b3, B:41:0x00bd, B:42:0x00d1, B:34:0x0092, B:9:0x002d), top: B:48:0x0005 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bd A[Catch: all -> 0x00d5, TryCatch #0 {, blocks: (B:4:0x0005, B:6:0x001c, B:8:0x0027, B:10:0x0036, B:12:0x003a, B:16:0x0041, B:18:0x0047, B:19:0x004b, B:21:0x005c, B:22:0x0064, B:26:0x0071, B:28:0x0077, B:32:0x007e, B:33:0x0088, B:36:0x00a2, B:38:0x00a8, B:39:0x00b3, B:41:0x00bd, B:42:0x00d1, B:34:0x0092, B:9:0x002d), top: B:48:0x0005 }] */
    @Override // defpackage.aqzu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean h(com.google.android.apps.gmm.map.model.location.GmmLocation r26) {
        /*
            Method dump skipped, instructions count: 216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqzv.h(com.google.android.apps.gmm.map.model.location.GmmLocation):boolean");
    }

    @Override // defpackage.aqzu
    public final synchronized void i(AndroidLocationEvent androidLocationEvent) {
        this.f = androidLocationEvent.getLocation();
        if (this.d != null) {
            this.d = akra.e(androidLocationEvent.getLatitude(), androidLocationEvent.getLongitude());
        }
    }

    @Override // defpackage.aqzu
    public final synchronized boolean j(CarHeadingEvent carHeadingEvent) {
        if (this.o != null || carHeadingEvent.shouldUseHeading()) {
            if (!carHeadingEvent.shouldUseHeading()) {
                this.o = null;
                return true;
            }
            akqa akqaVar = this.o;
            if (akqaVar == null) {
                akqaVar = new akqa(carHeadingEvent.getHeading());
                this.o = akqaVar;
            }
            akqa akqaVar2 = akqaVar;
            long a = this.c.a();
            double d = a - this.k;
            Double.isNaN(d);
            double d2 = d / 1000.0d;
            double rateOfTurn = carHeadingEvent.getRateOfTurn() / 2.0f;
            double heading = carHeadingEvent.getHeading();
            Double.isNaN(heading);
            Double.isNaN(rateOfTurn);
            double d3 = heading - rateOfTurn;
            double d4 = akqaVar2.d(d2);
            while (d4 < (-180.0d) + d3) {
                d3 -= 360.0d;
            }
            while (d4 > 180.0d + d3) {
                d3 += 360.0d;
            }
            akqaVar2.h(d2, d3, rateOfTurn);
            this.k = a;
            return true;
        }
        return false;
    }

    @Override // defpackage.aqzu
    public final boolean k(float f) {
        this.i.a(f);
        return this.h;
    }

    @Override // defpackage.aqzu
    public final void l(float f) {
    }

    @Override // defpackage.aqzu
    public final void m(boolean z) {
        this.h = z;
    }

    @Override // defpackage.aqzu
    public final synchronized void n() {
        this.g = false;
        this.p = null;
        this.q = null;
        this.r = null;
        this.m = null;
        this.l = -4611686018427387904L;
    }

    @Override // defpackage.aqzu
    public final void o() {
    }

    private final synchronized void q() {
        boolean z = true;
        if (this.h && !this.i.c()) {
            this.s = true;
            return;
        }
        s(1.0d, 1.0d, this.b);
        akra akraVar = this.b.a;
        dbsk.s(akraVar);
        akra akraVar2 = this.a.a;
        dbsk.s(akraVar2);
        float y = akraVar.y(akraVar2);
        float g = akrb.g(this.b.e, this.a.e);
        if (!this.v || this.a.k) {
            boolean z2 = this.b.k;
            boolean z3 = this.a.k;
            if (z2 == z3 && ((!z3 || g <= 5.0f) && y <= 60.0f)) {
                z = false;
            }
        }
        this.s = z;
    }
}
