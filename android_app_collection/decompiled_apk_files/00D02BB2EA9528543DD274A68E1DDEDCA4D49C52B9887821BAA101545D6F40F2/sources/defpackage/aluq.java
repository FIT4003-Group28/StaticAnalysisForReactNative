package defpackage;

import android.view.Choreographer;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aluq  reason: default package */
/* loaded from: classes2.dex */
public final class aluq implements Choreographer.FrameCallback, alur {
    private static final long a = TimeUnit.SECONDS.toMillis(1) / 10;
    private static final alup x = new alup();
    private volatile long b;
    private volatile long c;
    private long e;
    private final int g;
    private final ckcp h;
    private volatile long j;
    private Choreographer l;
    private final akzh m;
    private volatile akzh n;
    private final akzu o;
    private boolean q;
    private boolean r;
    private final bvnx s;
    private final amya z;
    private volatile boolean d = false;
    private long f = 0;
    private boolean i = false;
    private boolean k = true;
    private final float[] p = new float[8];
    private int y = 1;
    private boolean t = false;
    private int u = 0;
    private int v = 0;
    private final akra w = new akra();

    public aluq(bvnx bvnxVar, amya amyaVar, akzh akzhVar, akzu akzuVar, int i, ckcw ckcwVar, Choreographer choreographer) {
        this.z = amyaVar;
        this.l = choreographer;
        if (choreographer == null) {
            this.l = x.a();
        }
        this.m = akzhVar;
        this.o = akzuVar;
        this.n = akzhVar.b();
        this.s = bvnxVar;
        j(30L);
        this.g = i == 0 ? 16 : 1000 / i;
        this.h = (ckcp) ckcwVar.a(ckgh.d);
    }

    private final void n() {
        if (!this.q) {
            this.q = true;
            this.l.postFrameCallback(this);
            this.j = this.s.a();
        }
    }

    private final synchronized void o(boolean z) {
        amya amyaVar = this.z;
        amyaVar.a.j(z);
        amyaVar.a.g.b(new alhp(z));
        if (this.k == z) {
            return;
        }
        if (!z) {
            this.k = false;
            this.f = 0L;
            a();
            return;
        }
        this.k = true;
        if (this.r) {
            return;
        }
        this.l.removeFrameCallback(this);
        this.q = false;
    }

    private final long p() {
        return (this.e + (q() ? Math.max(a, this.c) : this.c)) - 3;
    }

    private final boolean q() {
        return this.d && !this.o.e();
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("FrameRateRegulator:"));
        long j = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append(str);
        sb.append("  targetFrameRate: ");
        sb.append(j);
        printWriter.println(sb.toString());
        long j2 = this.c;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 41);
        sb2.append(str);
        sb2.append("  targetFrameTimeMs: ");
        sb2.append(j2);
        printWriter.println(sb2.toString());
        boolean z = this.d;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 33);
        sb3.append(str);
        sb3.append("  adaptiveFrameRateEnabled: ");
        sb3.append(z);
        printWriter.println(sb3.toString());
        boolean z2 = this.k;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 17);
        sb4.append(str);
        sb4.append("  isPaused: ");
        sb4.append(z2);
        printWriter.println(sb4.toString());
        boolean z3 = this.q;
        StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 24);
        sb5.append(str);
        sb5.append("  waitingForFrame: ");
        sb5.append(z3);
        printWriter.println(sb5.toString());
        boolean z4 = this.r;
        StringBuilder sb6 = new StringBuilder(String.valueOf(str).length() + 23);
        sb6.append(str);
        sb6.append("  forceNextFrame: ");
        sb6.append(z4);
        printWriter.println(sb6.toString());
        int i = this.y;
        String str2 = i != 1 ? i != 2 ? i != 3 ? "null" : "WAITING_FOR_FINISH" : "WAITING_FOR_START" : "IDLE";
        StringBuilder sb7 = new StringBuilder(String.valueOf(str).length() + 17 + str2.length());
        sb7.append(str);
        sb7.append("  rendererState: ");
        sb7.append(str2);
        printWriter.println(sb7.toString());
        int i2 = this.u;
        StringBuilder sb8 = new StringBuilder(String.valueOf(str).length() + 34);
        sb8.append(str);
        sb8.append("  renderedFramesCount: ");
        sb8.append(i2);
        printWriter.println(sb8.toString());
        int i3 = this.v;
        StringBuilder sb9 = new StringBuilder(String.valueOf(str).length() + 33);
        sb9.append(str);
        sb9.append("  skippedFramesCount: ");
        sb9.append(i3);
        printWriter.println(sb9.toString());
    }

    @Override // defpackage.alur
    public final synchronized void a() {
        if (this.k) {
            return;
        }
        n();
    }

    @Override // defpackage.alur
    public final synchronized void b() {
        this.r = true;
        n();
    }

    @Override // defpackage.alur
    public final void d() {
        o(false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0085, code lost:
        if (((r1 * r1) + (r0 * r0)) > (r2 * r2)) goto L21;
     */
    @Override // android.view.Choreographer.FrameCallback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void doFrame(long r12) {
        /*
            Method dump skipped, instructions count: 218
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aluq.doFrame(long):void");
    }

    @Override // defpackage.alur
    public final void e() {
        o(true);
    }

    @Override // defpackage.alur
    public final synchronized boolean f() {
        return this.k;
    }

    @Override // defpackage.alur
    public final synchronized void g() {
        this.y = 3;
    }

    @Override // defpackage.alur
    public final synchronized void h() {
        this.y = 1;
    }

    @Override // defpackage.alur
    public final synchronized boolean i() {
        return this.t;
    }

    @Override // defpackage.alur
    public final void j(long j) {
        if (j == 0) {
            j = 30;
        }
        this.b = j;
        this.c = TimeUnit.SECONDS.toMillis(1L) / j;
    }

    @Override // defpackage.alur
    public final long k() {
        return this.b;
    }

    @Override // defpackage.alur
    public final void l(boolean z) {
        this.d = z;
    }

    @Override // defpackage.alur
    public final long m(long j, long j2, boolean z) {
        throw new UnsupportedOperationException("This method should never be called");
    }
}
