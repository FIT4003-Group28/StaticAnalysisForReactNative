package defpackage;

import com.google.android.libraries.youtube.innertube.model.player.Vss3ConfigModel;
import com.google.android.libraries.youtube.player.stats.VideoStats3Client$VideoStats3ClientState;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aiul  reason: default package */
/* loaded from: classes.dex */
public final class aiul {
    public final boolean A;
    public boolean B;
    public int C;
    public aopa D;
    public aopa E;
    private final yrj F;
    private final acrr G;
    private final aoob H;
    private final boolean I;

    /* renamed from: J  reason: collision with root package name */
    private aweg f54J;
    private final ScheduledExecutorService K;
    private boolean L;
    private long M;
    public final zdl a;
    public awey b;
    public final Vss3ConfigModel c;
    public final snc d;
    public final long e;
    public long f;
    public final Runnable g;
    public ScheduledFuture h;
    public boolean i;
    public boolean j;
    public boolean k;
    public long l;
    public long m;
    public float n;
    public final String o;
    public final String p;
    public String q;
    public long r;
    public int s;
    public long t;
    public final boolean u;
    public final boolean v;
    public aijz w;
    public ahgn x;
    public long y;
    public boolean z;

    public aiul(ScheduledExecutorService scheduledExecutorService, yrj yrjVar, zdl zdlVar, snc sncVar, acrr acrrVar, aijf aijfVar, aweg awegVar, VideoStats3Client$VideoStats3ClientState videoStats3Client$VideoStats3ClientState) {
        this(scheduledExecutorService, yrjVar, acrrVar, zdlVar, sncVar, awegVar, videoStats3Client$VideoStats3ClientState.d, videoStats3Client$VideoStats3ClientState.c, videoStats3Client$VideoStats3ClientState.i, videoStats3Client$VideoStats3ClientState.b, videoStats3Client$VideoStats3ClientState.j, videoStats3Client$VideoStats3ClientState.g, videoStats3Client$VideoStats3ClientState.h, videoStats3Client$VideoStats3ClientState.f, videoStats3Client$VideoStats3ClientState.k, videoStats3Client$VideoStats3ClientState.l, aijfVar.t, aijfVar.c(), videoStats3Client$VideoStats3ClientState.m, videoStats3Client$VideoStats3ClientState.n, videoStats3Client$VideoStats3ClientState.o, videoStats3Client$VideoStats3ClientState.u, videoStats3Client$VideoStats3ClientState.v, videoStats3Client$VideoStats3ClientState.p, videoStats3Client$VideoStats3ClientState.q, videoStats3Client$VideoStats3ClientState.r, videoStats3Client$VideoStats3ClientState.s, videoStats3Client$VideoStats3ClientState.t);
        this.r = videoStats3Client$VideoStats3ClientState.e;
    }

    public static boolean i(int i) {
        return i == 0;
    }

    private static float k(long j) {
        double d = ((j + 50) / 100) * 100;
        Double.isNaN(d);
        return (float) (d / 1000.0d);
    }

    private final synchronized int l(long j) {
        int P;
        int i;
        if (this.b.isInitialized()) {
            awex awexVar = this.b.h;
            if (awexVar == null) {
                awexVar = awex.a;
            }
            if (awexVar.g > 0) {
                awex awexVar2 = this.b.h;
                if (awexVar2 == null) {
                    awexVar2 = awex.a;
                }
                return awexVar2.g;
            }
        }
        if (this.b.isInitialized() && (P = awwc.P(this.b.k)) != 0 && P == 3 && (i = this.c.e) > 0) {
            return i;
        }
        long j2 = this.M;
        if (j2 > 0) {
            Vss3ConfigModel vss3ConfigModel = this.c;
            if (((int) k(j - j2)) < vss3ConfigModel.d) {
                return vss3ConfigModel.c;
            }
        }
        return this.c.b;
    }

    private final long m() {
        long j = this.m;
        long j2 = this.l;
        if (j <= j2 || j2 == 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(110);
        sb.append("Reported playback position ");
        sb.append(j);
        sb.append(" is greater than the duration of the video ");
        sb.append(j2);
        zep.l(sb.toString());
        return this.l;
    }

    private final synchronized void n(long j) {
        if (((awex) this.E.instance).d) {
            return;
        }
        awey aweyVar = (awey) this.D.instance;
        if ((aweyVar.b & 256) != 0) {
            int P = awwc.P(aweyVar.k);
            if (P == 0) {
                P = 1;
            }
            if (P == 3) {
                aopa aopaVar = this.E;
                int i = this.c.e;
                aopaVar.copyOnWrite();
                awex awexVar = (awex) aopaVar.instance;
                awexVar.b |= 32;
                awexVar.g = i;
            } else if (P == 7 || P == 9) {
            } else {
                long j2 = this.M;
                if (j2 > 0) {
                    int k = (int) k(j - j2);
                    Vss3ConfigModel vss3ConfigModel = this.c;
                    int i2 = vss3ConfigModel.c;
                    if (i2 <= 0 || k >= vss3ConfigModel.d) {
                        aopa aopaVar2 = this.E;
                        int i3 = vss3ConfigModel.b;
                        aopaVar2.copyOnWrite();
                        awex awexVar2 = (awex) aopaVar2.instance;
                        awexVar2.b |= 32;
                        awexVar2.g = i3;
                        return;
                    }
                    aopa aopaVar3 = this.E;
                    aopaVar3.copyOnWrite();
                    awex awexVar3 = (awex) aopaVar3.instance;
                    awexVar3.b |= 32;
                    awexVar3.g = i2;
                }
            }
        }
    }

    private final void o() {
        aopa aopaVar = this.E;
        boolean z = this.I;
        aopaVar.copyOnWrite();
        awex awexVar = (awex) aopaVar.instance;
        awex awexVar2 = awex.a;
        awexVar.b |= 64;
        awexVar.h = z;
        aopa aopaVar2 = this.D;
        String str = this.o;
        aopaVar2.copyOnWrite();
        awey aweyVar = (awey) aopaVar2.instance;
        awey aweyVar2 = awey.a;
        str.getClass();
        aweyVar.b |= 1;
        aweyVar.c = str;
        String str2 = this.p;
        aopaVar2.copyOnWrite();
        awey aweyVar3 = (awey) aopaVar2.instance;
        str2.getClass();
        aweyVar3.b |= 2;
        aweyVar3.d = str2;
        apwf apwfVar = apwf.values()[this.F.a()];
        aopaVar2.copyOnWrite();
        awey aweyVar4 = (awey) aopaVar2.instance;
        aweyVar4.m = apwfVar.o;
        aweyVar4.b |= 1024;
        long j = this.l;
        aopaVar2.copyOnWrite();
        awey aweyVar5 = (awey) aopaVar2.instance;
        aweyVar5.b |= 16;
        aweyVar5.g = k(j);
        int a = this.a.a();
        aopaVar2.copyOnWrite();
        awey aweyVar6 = (awey) aopaVar2.instance;
        aweyVar6.b |= 4096;
        aweyVar6.o = a;
        aoob aoobVar = this.H;
        aopaVar2.copyOnWrite();
        awey aweyVar7 = (awey) aopaVar2.instance;
        aoobVar.getClass();
        aweyVar7.b |= 64;
        aweyVar7.i = aoobVar;
        if (this.w == aijz.IS_UAO) {
            aopa aopaVar3 = this.D;
            aopaVar3.copyOnWrite();
            awey aweyVar8 = (awey) aopaVar3.instance;
            aweyVar8.b |= 8192;
            aweyVar8.p = true;
        }
        if (this.j) {
            aopa aopaVar4 = this.D;
            aopaVar4.copyOnWrite();
            awey aweyVar9 = (awey) aopaVar4.instance;
            aweyVar9.b |= 16384;
            aweyVar9.q = true;
        }
        if (this.x.e()) {
            aopa aopaVar5 = this.D;
            aopaVar5.copyOnWrite();
            awey aweyVar10 = (awey) aopaVar5.instance;
            aweyVar10.b |= 32768;
            aweyVar10.r = true;
        }
        if (this.x.d().i != aijs.REMOTE.i) {
            aopa aopaVar6 = this.D;
            int i = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 32}[this.x.d().i];
            aopaVar6.copyOnWrite();
            awey aweyVar11 = (awey) aopaVar6.instance;
            int i2 = i - 1;
            if (i == 0) {
                throw null;
            }
            aweyVar11.n = i2;
            aweyVar11.b |= 2048;
        }
        aweg awegVar = this.f54J;
        if (awegVar == null || (awegVar.b & 1) == 0) {
            return;
        }
        aopa aopaVar7 = this.D;
        aoob z2 = aoob.z(awegVar.c);
        aopaVar7.copyOnWrite();
        awey aweyVar12 = (awey) aopaVar7.instance;
        aweyVar12.b |= 128;
        aweyVar12.j = z2;
    }

    private final synchronized void p(int i) {
        if (i > 0) {
            if (this.h != null) {
                return;
            }
            long j = i;
            this.h = this.K.scheduleAtFixedRate(this.g, j, j, TimeUnit.MILLISECONDS);
            return;
        }
        StringBuilder sb = new StringBuilder(70);
        sb.append("ERROR: maxSegmentLengthMillis ");
        sb.append(i);
        sb.append(" <= 0 and cannot be scheduled");
        zep.b(sb.toString());
    }

    public final synchronized void a() {
        ScheduledFuture scheduledFuture = this.h;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
            this.h = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x01ac, code lost:
        if (r11.e <= 0.0f) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(boolean r10, long r11) {
        /*
            Method dump skipped, instructions count: 493
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiul.b(boolean, long):void");
    }

    public final synchronized void c() {
        if (this.z) {
            a();
            return;
        }
        b(false, this.d.d());
        h(this.d.d());
    }

    public final synchronized void d(long j) {
        this.C = 6;
        b(false, this.d.d());
        this.m = j;
        h(this.d.d());
    }

    public final synchronized void e(long j) {
        if (this.i) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("Warning: unexpected playback play ");
            sb.append(j);
            sb.append(" surpressed");
            zep.l(sb.toString());
            return;
        }
        long d = this.d.d();
        this.i = true;
        if (!this.L) {
            this.L = true;
            this.M = d;
        }
        this.C = 2;
        this.m = j;
        h(d);
    }

    public final void f() {
        this.C = 9;
        b(false, this.d.d());
    }

    public final synchronized void g() {
        if (this.B) {
            zep.n("VSS3 client called release more than once.", new Exception());
            return;
        }
        if (this.k) {
            zep.n("VSS3 client released unexpectedly", new Exception());
            f();
        }
        this.B = true;
    }

    public final synchronized void h(long j) {
        if (!this.i || this.k) {
            return;
        }
        this.f = j;
        aopa createBuilder = awey.a.createBuilder();
        long m = m();
        createBuilder.copyOnWrite();
        awey aweyVar = (awey) createBuilder.instance;
        aweyVar.b |= 4;
        aweyVar.e = k(m);
        this.D = createBuilder;
        this.E = awex.a.createBuilder();
        awey aweyVar2 = this.b;
        if ((aweyVar2.b & 32) != 0) {
            awex awexVar = aweyVar2.h;
            if (awexVar == null) {
                awexVar = awex.a;
            }
            if (awexVar.g > 0) {
                aopa aopaVar = this.E;
                awex awexVar2 = this.b.h;
                if (awexVar2 == null) {
                    awexVar2 = awex.a;
                }
                int i = awexVar2.g;
                aopaVar.copyOnWrite();
                awex awexVar3 = (awex) aopaVar.instance;
                awexVar3.b |= 16;
                awexVar3.f = i;
            }
        }
        p(l(j) * 1000);
        this.C = 2;
        this.k = true;
        o();
    }

    public final boolean j() {
        return this.t != -1;
    }

    public aiul(ScheduledExecutorService scheduledExecutorService, yrj yrjVar, acrr acrrVar, zdl zdlVar, snc sncVar, aweg awegVar, String str, String str2, float f, long j, String str3, int i, long j2, boolean z, boolean z2, boolean z3, aijz aijzVar, ahgn ahgnVar, Vss3ConfigModel vss3ConfigModel, boolean z4, long j3, aopa aopaVar, aopa aopaVar2, awey aweyVar, long j4, boolean z5, boolean z6, int i2) {
        this.g = new Runnable() { // from class: aiuk
            @Override // java.lang.Runnable
            public final void run() {
                aiul.this.c();
            }
        };
        this.h = null;
        this.K = scheduledExecutorService;
        this.F = yrjVar;
        this.G = acrrVar;
        this.a = zdlVar;
        this.d = sncVar;
        this.f54J = awegVar;
        this.o = str;
        this.p = str2;
        this.n = f;
        this.l = j;
        this.q = str3;
        this.s = i;
        this.t = j2;
        this.j = z;
        this.u = z2;
        this.v = z3;
        this.w = aijzVar;
        this.x = ahgnVar;
        this.r = 0L;
        this.c = vss3ConfigModel;
        this.z = z4;
        this.e = j3;
        this.E = aopaVar;
        this.D = aopaVar2;
        this.b = aweyVar;
        this.f = j4;
        this.H = vss3ConfigModel.f;
        this.I = vss3ConfigModel.a;
        this.A = z5;
        this.B = z6;
        this.C = i2;
    }
}
