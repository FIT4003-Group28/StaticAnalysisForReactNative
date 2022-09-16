package defpackage;

import android.util.Base64;
import java.util.Random;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: aivl  reason: default package */
/* loaded from: classes.dex */
public final class aivl implements afkg {
    private long E;
    private final ScheduledExecutorService G;
    private ScheduledFuture H;
    private int I;

    /* renamed from: J  reason: collision with root package name */
    private long f55J;
    private int K;
    private aopa L;
    public final snc a;
    public final Executor b;
    public final afkf c;
    public final aivf d;
    public final long e;
    public final int f;
    public final float g;
    public final int h;
    public final float i;
    public volatile boolean j;
    public boolean k;
    public volatile boolean l;
    public long m;
    public volatile int n;
    public ahhx p;
    public boolean q;
    private final boolean r;
    private final int s;
    private final int t;
    private final boolean u;
    private final int v;
    private long w;
    private volatile long y;
    private volatile int z;
    private final Object x = new Object();
    private final Runnable A = new aivh(this, 1);
    private final Runnable B = new aivh(this);
    private final Runnable C = new aivh(this, 2);
    private final Runnable D = new aivh(this, 3);
    private final Runnable F = new aivh(this, 4);
    public final Object o = new Object();

    public aivl(snc sncVar, Executor executor, aivf aivfVar, afkf afkfVar, aujv aujvVar, ScheduledExecutorService scheduledExecutorService) {
        this.a = sncVar;
        this.b = executor;
        this.d = aivfVar;
        this.c = afkfVar;
        this.r = aujvVar.m;
        this.s = aujvVar.n;
        this.t = aujvVar.o;
        this.u = aujvVar.p;
        this.v = aujvVar.u;
        this.f = aujvVar.w;
        this.h = aujvVar.s;
        this.g = aujvVar.v;
        this.i = aujvVar.t;
        this.j = aujvVar.q;
        this.G = scheduledExecutorService;
        long d = sncVar.d();
        this.e = d;
        this.w = d + 30000;
        this.k = true;
        this.n = 0;
        this.L = anfv.a.createBuilder();
        this.q = false;
        this.I = 0;
        this.m = 0L;
        this.l = false;
        this.K = 1;
        this.f55J = -1L;
    }

    private final synchronized float l(long j) {
        long d;
        this.E += (this.a.d() - j) / 1000;
        return Math.round(((float) (d * 10)) / 1000.0f) / 10.0f;
    }

    private final synchronized void m() {
        ScheduledFuture scheduledFuture = this.H;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.H = null;
        }
    }

    private final void n(boolean z) {
        aopa aopaVar;
        synchronized (this.o) {
            long j = this.f55J;
            int i = this.K;
            int i2 = this.I;
            int i3 = this.n;
            if (i3 != 5 && i3 != 9) {
                return;
            }
            boolean z2 = true;
            if (z) {
                this.f55J = this.a.d();
            } else {
                this.f55J = -1L;
                this.K = 1;
            }
            this.I++;
            if (j < 0) {
                return;
            }
            if (i2 >= this.v) {
                zep.l("We've reached the rebuffer observation threshold for this reporting interval");
                return;
            }
            int i4 = i3 == 5 ? 2 : 3;
            float l = l(j);
            if (l >= 0.0f) {
                aopaVar = anfw.a.createBuilder();
                aopaVar.copyOnWrite();
                anfw anfwVar = (anfw) aopaVar.instance;
                anfwVar.c = i4 - 1;
                anfwVar.b |= 1;
                aopaVar.copyOnWrite();
                anfw anfwVar2 = (anfw) aopaVar.instance;
                anfwVar2.b |= 4;
                anfwVar2.e = l;
                if (i != 1) {
                    if (i != 2) {
                        z2 = false;
                    }
                    aopaVar.copyOnWrite();
                    anfw anfwVar3 = (anfw) aopaVar.instance;
                    anfwVar3.b = 2 | anfwVar3.b;
                    anfwVar3.d = z2;
                }
            } else {
                aopaVar = null;
            }
            synchronized (this.o) {
                if (aopaVar != null) {
                    aopa aopaVar2 = this.L;
                    aopaVar2.copyOnWrite();
                    anfv anfvVar = (anfv) aopaVar2.instance;
                    anfw anfwVar4 = (anfw) aopaVar.mo39build();
                    anfv anfvVar2 = anfv.a;
                    anfwVar4.getClass();
                    aopu aopuVar = anfvVar.c;
                    if (!aopuVar.c()) {
                        anfvVar.c = aopi.mutableCopy(aopuVar);
                    }
                    anfvVar.c.add(anfwVar4);
                }
            }
        }
    }

    private final void o(long j, int i) {
        if (i <= 0) {
            StringBuilder sb = new StringBuilder(65);
            sb.append("bandwidthElapsed not > 0, bandwidthBytes is: ");
            sb.append(j);
            zep.l(sb.toString());
            return;
        }
        aivf aivfVar = this.d;
        aqxo.p(true);
        tip a = tiq.a();
        a.b = Long.valueOf(j);
        a.a = Long.valueOf(TimeUnit.MILLISECONDS.toMicros(i));
        aivfVar.a.a(a.a());
    }

    private final synchronized boolean p() {
        return this.H != null;
    }

    private static final boolean q(int i) {
        return (i == 3 || i == 8 || i == 7) ? false : true;
    }

    @Override // defpackage.afkg
    public final void a(afkv afkvVar) {
        synchronized (this.x) {
            this.y += afkvVar.c;
            this.z += afkvVar.b;
        }
        f(false);
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void b(Exception exc) {
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void c(int i) {
    }

    public final synchronized long e() {
        return this.E;
    }

    public final void f(boolean z) {
        if (this.r) {
            if (z) {
                this.b.execute(this.A);
            } else {
                this.b.execute(this.B);
            }
        } else if (z) {
            this.b.execute(this.C);
        } else {
            this.b.execute(this.D);
        }
    }

    public final void g(boolean z) {
        synchronized (this.x) {
            long d = this.a.d();
            if (this.y > 0 && (z || d > this.w)) {
                if (this.z <= this.s && this.y <= this.t) {
                    if (this.u) {
                        this.y = 0L;
                        this.z = 0;
                    }
                    this.w = d + 30000;
                }
                o(this.y, this.z);
                this.y = 0L;
                this.z = 0;
                this.w = d + 30000;
            }
        }
    }

    public final void h(boolean z) {
        synchronized (this.x) {
            long d = this.a.d();
            if (this.y > 0 && (z || d > this.w)) {
                if (this.z > this.s) {
                    o(this.y, this.z);
                }
                this.w = d + 30000;
                this.y = 0L;
                this.z = 0;
            }
        }
    }

    public final void i(int i) {
        if (!this.j || !this.q || this.n == i) {
            return;
        }
        boolean z = this.n == 5 || this.n == 9;
        boolean z2 = i == 5 || i == 9;
        if (z) {
            if (!z2) {
                n(false);
            } else if (i == 9) {
                n(true);
            } else {
                i = this.n;
            }
        } else if (z2) {
            synchronized (this.o) {
                if (this.f55J < 0) {
                    ahhx ahhxVar = this.p;
                    if (ahhxVar != null && ahhxVar.a() != -1 && this.p.e() != -1) {
                        this.K = this.p.a() - this.p.e() > 0 ? 2 : 3;
                        this.p = null;
                        this.f55J = this.a.d();
                    }
                    this.K = 1;
                    this.f55J = this.a.d();
                }
            }
        }
        if (q(i) && !p()) {
            k();
        }
        this.n = i;
    }

    public final void j(boolean z) {
        anfv anfvVar;
        m();
        if (this.l) {
            return;
        }
        n(true);
        synchronized (this.o) {
            aopa aopaVar = this.L;
            aopaVar.copyOnWrite();
            anfv anfvVar2 = (anfv) aopaVar.instance;
            anfv anfvVar3 = anfv.a;
            anfvVar2.b = 1 | anfvVar2.b;
            anfvVar2.d = z;
            anfvVar = (anfv) aopaVar.mo39build();
            this.I = 0;
            this.L = anfv.a.createBuilder();
        }
        try {
            final String encodeToString = Base64.encodeToString(anfvVar.toByteArray(), 0);
            this.b.execute(new Runnable() { // from class: aivj
                @Override // java.lang.Runnable
                public final void run() {
                    aivl aivlVar = aivl.this;
                    String str = encodeToString;
                    if (aivlVar.j) {
                        long j = aivlVar.m * aivlVar.h;
                        if (j <= aivlVar.f || ((float) (aivlVar.e() / j)) <= aivlVar.g) {
                            if (new Random().nextDouble() < aivlVar.i) {
                                aivf aivfVar = aivlVar.d;
                                tip a = tiq.a();
                                a.c(12);
                                a.b("rebuffers", str);
                                aivfVar.a.a(a.a());
                            }
                        } else {
                            zep.l("Threshold for long playtime and rebuffer rate have been met, ceaseing all rebuffer reports");
                            aivlVar.j = false;
                        }
                    }
                    aivlVar.m++;
                }
            });
        } catch (AssertionError unused) {
            zep.l("Error when encoding currentRebufferInfo");
        }
        if (!q(this.n) || z) {
            return;
        }
        k();
    }

    public final synchronized void k() {
        m();
        this.H = this.G.schedule(this.F, this.h, TimeUnit.SECONDS);
    }

    @Override // defpackage.afkg
    public final /* synthetic */ void rX(long j) {
    }
}
