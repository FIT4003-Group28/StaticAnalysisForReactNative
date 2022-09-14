package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: alut  reason: default package */
/* loaded from: classes2.dex */
public final class alut implements alur {
    private volatile long a;
    private volatile long b;
    private final int e;
    private final ckcp f;
    private final akzh g;
    private volatile akzh h;
    private final akzu i;
    private volatile boolean c = false;
    private boolean d = false;
    private final float[] j = new float[8];
    private int k = 0;
    private final akra l = new akra();

    public alut(akzh akzhVar, akzu akzuVar, int i, ckcw ckcwVar) {
        this.g = akzhVar;
        this.i = akzuVar;
        this.h = akzhVar.b();
        this.e = i == 0 ? 16 : 1000 / i;
        this.f = (ckcp) ckcwVar.a(ckgh.d);
        j(30L);
    }

    @Override // defpackage.btph
    public final synchronized void NX(String str, PrintWriter printWriter) {
        printWriter.println(String.valueOf(str).concat("FrameRateRegulator:"));
        long j = this.a;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 39);
        sb.append(str);
        sb.append("  targetFrameRate: ");
        sb.append(j);
        printWriter.println(sb.toString());
        long j2 = this.b;
        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 41);
        sb2.append(str);
        sb2.append("  targetFrameTimeMs: ");
        sb2.append(j2);
        printWriter.println(sb2.toString());
        boolean z = this.c;
        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 33);
        sb3.append(str);
        sb3.append("  adaptiveFrameRateEnabled: ");
        sb3.append(z);
        printWriter.println(sb3.toString());
        int i = this.k;
        StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 34);
        sb4.append(str);
        sb4.append("  renderedFramesCount: ");
        sb4.append(i);
        printWriter.println(sb4.toString());
    }

    @Override // defpackage.alur
    public final void a() {
        throw new UnsupportedOperationException("This method should never be called");
    }

    @Override // defpackage.alur
    public final void b() {
    }

    @Override // defpackage.alur
    public final void d() {
    }

    @Override // defpackage.alur
    public final void e() {
    }

    @Override // defpackage.alur
    public final boolean f() {
        throw new UnsupportedOperationException("This method should never be called");
    }

    @Override // defpackage.alur
    public final void g() {
    }

    @Override // defpackage.alur
    public final void h() {
    }

    @Override // defpackage.alur
    public final boolean i() {
        return this.d;
    }

    @Override // defpackage.alur
    public final void j(long j) {
        if (j == 0) {
            j = 30;
        }
        this.a = j;
        this.b = TimeUnit.SECONDS.toMillis(1L) / j;
    }

    @Override // defpackage.alur
    public final long k() {
        return this.a;
    }

    @Override // defpackage.alur
    public final void l(boolean z) {
        this.c = z;
    }

    @Override // defpackage.alur
    public final long m(long j, long j2, boolean z) {
        long j3;
        boolean z2 = true;
        this.k++;
        if (j2 != 0) {
            this.f.a(Math.max(0, ((int) (j - j2)) - this.e));
        }
        if (!this.c || this.i.e()) {
            j3 = (z || this.i.e()) ? this.b : 1000L;
        } else if (!akyx.r(this.g.b(), 0.0f, 0.0f, this.l, this.j)) {
            j3 = this.b;
        } else {
            int[] n = akyx.n(this.h, this.l);
            if (n == null) {
                j3 = this.b;
            } else {
                int i = n[0];
                int i2 = n[1];
                float z3 = this.g.z() * 0.01f;
                j3 = Math.min(100L, Math.max((1.0f - (((i * i) + (i2 * i2)) / (z3 * z3))) * 100.0f, this.b));
            }
        }
        long max = Math.max(0L, (j2 + j3) - j);
        if (max != 0) {
            z2 = false;
        }
        this.d = z2;
        if (max == 0) {
            this.h = this.g.b();
        }
        return max;
    }
}
