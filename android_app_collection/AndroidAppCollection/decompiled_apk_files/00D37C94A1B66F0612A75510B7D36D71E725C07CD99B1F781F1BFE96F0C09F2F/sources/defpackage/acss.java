package defpackage;

import android.app.Application;
import java.security.SecureRandom;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acss */
/* loaded from: classes.dex */
public final class acss implements Observer {
    static final long a = TimeUnit.SECONDS.toMillis(30);
    static final long b = TimeUnit.SECONDS.toMillis(90);
    public static final /* synthetic */ int m = 0;
    private final ScheduledExecutorService A;
    private final zah B;
    private final snc C;
    private final aadd D;
    private int F;
    private int G;
    private final yni H;
    private final afvn I;

    /* renamed from: J */
    private final yve f27J;
    private final ykw K;
    yor e;
    public volatile afvm f;
    public volatile afuq g;
    public final acrr i;
    public final String j;
    private yoj u;
    private yok v;
    private ScheduledFuture w;
    private ynk x;
    private ynk y;
    private final Application z;
    private boolean n = false;
    private boolean o = false;
    public boolean c = false;
    private boolean p = false;
    public boolean d = false;
    private long q = -1;
    private long r = -1;
    private long s = -1;
    private long t = -1;
    public int l = 1;
    public final Object h = new Object();
    private long E = 0;
    final Runnable k = new acsp(this, 1);

    public acss(acrr acrrVar, Application application, ScheduledExecutorService scheduledExecutorService, zah zahVar, snc sncVar, aadd aaddVar, yni yniVar, ykw ykwVar, afvn afvnVar, yve yveVar) {
        this.i = acrrVar;
        this.z = application;
        this.A = scheduledExecutorService;
        this.B = zahVar;
        this.C = sncVar;
        this.D = aaddVar;
        this.H = yniVar;
        this.K = ykwVar;
        this.I = afvnVar;
        this.f27J = yveVar;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        this.j = aneg.d.i(bArr);
    }

    public static /* synthetic */ void g(Throwable th) {
        afus.c(2, 12, "Failed to save the updated Heartbeat index.", th);
    }

    private final ankt m(long j) {
        return this.f27J.b(new fcp(j, 9));
    }

    public final ankt a() {
        return b(0L);
    }

    public final ankt b(long j) {
        synchronized (this.h) {
            if (this.F != 0) {
                ankt q = anlz.q(null);
                if (j > 1000000000) {
                    j = 0;
                }
                int i = this.G - 1;
                this.G = i;
                if (i <= 0) {
                    this.G = this.F;
                    q = m(j);
                }
                this.E = j;
                return q;
            }
            return m(j);
        }
    }

    public final void c() {
        asvw asvwVar;
        synchronized (this.h) {
            if (this.n) {
                afus.b(2, 12, "HeartbeatClient.configure() have been called more than once.");
                return;
            }
            arhd a2 = this.D.a();
            afuq afuqVar = null;
            if (a2 == null) {
                asvwVar = null;
            } else {
                asvx asvxVar = a2.m;
                if (asvxVar == null) {
                    asvxVar = asvx.a;
                }
                asvwVar = asvxVar.e;
                if (asvwVar == null) {
                    asvwVar = asvw.a;
                }
            }
            if (asvwVar == null || !asvwVar.c) {
                synchronized (this.h) {
                    yor yorVar = this.e;
                    if (yorVar != null) {
                        yorVar.b(this.z);
                        this.e.d(this.u);
                        this.e.d(this.v);
                        this.B.deleteObserver(this);
                        this.H.l(this.x);
                        this.H.l(this.y);
                    }
                    i();
                }
            } else {
                int i = asvwVar.h;
                this.F = i;
                if (i != 0) {
                    long j = ((awtn) this.f27J.c()).c;
                    if (j == -1) {
                        j = 0;
                    }
                    this.G = 2;
                    ylx.m(b(j + (this.F * 4)), ngc.u);
                }
                synchronized (this.h) {
                    this.B.addObserver(this);
                    this.x = this.H.a(this, afwb.class, new acso(this, 1));
                    this.y = this.H.a(this, afwd.class, new acso(this));
                    if (this.e == null) {
                        this.u = new acsq(this);
                        this.v = new acsr(this);
                        yor yorVar2 = new yor();
                        this.e = yorVar2;
                        yorVar2.a(this.z);
                    }
                    this.e.c(this.u);
                    this.e.c(this.v);
                }
                this.r = asvwVar.d <= 0 ? a : TimeUnit.SECONDS.toMillis(asvwVar.d);
                this.s = asvwVar.e <= 0 ? b : TimeUnit.SECONDS.toMillis(asvwVar.e);
                boolean z = asvwVar.f;
                this.c = z;
                this.p = asvwVar.g;
                this.d = asvwVar.i;
                this.f = z ? this.I.c() : null;
                if (this.c) {
                    afuqVar = new afuq(this.I.g(), this.I.c().g());
                }
                this.g = afuqVar;
                if (uul.c(this.z.getApplicationContext())) {
                    f();
                } else {
                    e();
                }
            }
            this.n = true;
        }
    }

    public final void d() {
        synchronized (this.h) {
            afvm c = this.I.c();
            afuq afuqVar = new afuq(this.I.g(), c.g());
            if (!c.d().equals(this.f.d())) {
                j(4, this.f, this.g);
                this.f = c;
                this.g = afuqVar;
                ylx.k(a(), anjk.a, new ylv() { // from class: acsi
                    @Override // defpackage.zdt
                    /* renamed from: b */
                    public final void a(Throwable th) {
                        acss acssVar = acss.this;
                        afus.c(2, 12, "Failed to reset the heartbeat index.", th);
                        acssVar.j(3, acssVar.f, acssVar.g);
                    }
                }, new ylw() { // from class: acsk
                    @Override // defpackage.ylw, defpackage.zdt
                    public final void a(Object obj) {
                        acss acssVar = acss.this;
                        Void r4 = (Void) obj;
                        acssVar.j(3, acssVar.f, acssVar.g);
                    }
                });
            }
        }
    }

    public final void e() {
        this.K.a(2, new acsp(this));
    }

    public final void f() {
        this.K.a(2, new acsp(this, 2));
    }

    public final void h() {
        synchronized (this.h) {
            i();
            long j = this.r;
            if (j > 0) {
                this.w = this.A.scheduleAtFixedRate(this.k, j, j, TimeUnit.MILLISECONDS);
                this.o = true;
            }
        }
    }

    public final void i() {
        synchronized (this.h) {
            ScheduledFuture scheduledFuture = this.w;
            if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
                this.w.cancel(true);
            }
            this.o = false;
        }
    }

    public final void l(int i, afvm afvmVar, afuq afuqVar, aopa aopaVar) {
        long j;
        synchronized (this.h) {
            long d = this.C.d();
            long j2 = this.t;
            long j3 = j2 == -1 ? -1L : d - j2;
            aopaVar.copyOnWrite();
            aqzo aqzoVar = (aqzo) aopaVar.instance;
            aqzo aqzoVar2 = aqzo.a;
            aqzoVar.b |= 4;
            aqzoVar.e = j3;
            long j4 = this.q;
            long j5 = j4 == -1 ? -1L : d - j4;
            aopaVar.copyOnWrite();
            aqzo aqzoVar3 = (aqzo) aopaVar.instance;
            aqzoVar3.b |= 1;
            aqzoVar3.c = j5;
            if (this.c) {
                double c = this.C.c();
                Double.isNaN(c);
                j = Math.round(c / 1000.0d) * 1000;
            } else {
                j = -1;
            }
            if (i == 4) {
                arrf a2 = arrh.a();
                a2.copyOnWrite();
                ((arrh) a2.instance).cx((aqzo) aopaVar.mo39build());
                this.i.h((arrh) a2.mo39build(), afvmVar, j, afuqVar);
            } else if (i == 3) {
                arrf a3 = arrh.a();
                a3.copyOnWrite();
                ((arrh) a3.instance).cx((aqzo) aopaVar.mo39build());
                this.i.d((arrh) a3.mo39build(), afvmVar, j, afuqVar);
                if (this.p) {
                    aopa createBuilder = aqru.a.createBuilder();
                    createBuilder.copyOnWrite();
                    aqru aqruVar = (aqru) createBuilder.instance;
                    aqruVar.b |= 1;
                    aqruVar.c = true;
                    arrf a4 = arrh.a();
                    a4.copyOnWrite();
                    ((arrh) a4.instance).cp((aqru) createBuilder.mo39build());
                    this.i.c((arrh) a4.mo39build());
                }
            } else {
                arrf a5 = arrh.a();
                a5.copyOnWrite();
                ((arrh) a5.instance).cx((aqzo) aopaVar.mo39build());
                this.i.c((arrh) a5.mo39build());
            }
            this.q = -1L;
            this.t = d;
        }
    }

    @Override // java.util.Observer
    public final void update(Observable observable, Object obj) {
        synchronized (this.h) {
            if (observable == this.B && this.q == -1) {
                this.q = ((Long) obj).longValue();
            }
        }
        if (this.l != 2 || this.o) {
            return;
        }
        h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x001e, code lost:
        if (r4 >= r6) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j(final int r12, final defpackage.afvm r13, final defpackage.afuq r14) {
        /*
            r11 = this;
            java.lang.Object r0 = r11.h
            monitor-enter(r0)
            r1 = 2
            r2 = -1
            if (r12 == r1) goto L9
            goto L25
        L9:
            zah r4 = r11.B     // Catch: java.lang.Throwable -> La6
            long r4 = r4.a()     // Catch: java.lang.Throwable -> La6
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 != 0) goto L14
            goto L20
        L14:
            long r6 = r11.s     // Catch: java.lang.Throwable -> La6
            r8 = 0
            int r10 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r10 <= 0) goto L25
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L25
        L20:
            r11.i()     // Catch: java.lang.Throwable -> La6
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return
        L25:
            aqzo r4 = defpackage.aqzo.a     // Catch: java.lang.Throwable -> La6
            aopa r4 = r4.createBuilder()     // Catch: java.lang.Throwable -> La6
            r5 = 3
            if (r12 != r5) goto L32
            r11.q = r2     // Catch: java.lang.Throwable -> La6
            r11.t = r2     // Catch: java.lang.Throwable -> La6
        L32:
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La6
            aopi r2 = r4.instance     // Catch: java.lang.Throwable -> La6
            aqzo r2 = (defpackage.aqzo) r2     // Catch: java.lang.Throwable -> La6
            int r3 = r12 + (-1)
            r2.f = r3     // Catch: java.lang.Throwable -> La6
            int r3 = r2.b     // Catch: java.lang.Throwable -> La6
            r3 = r3 | 8
            r2.b = r3     // Catch: java.lang.Throwable -> La6
            boolean r2 = r11.d     // Catch: java.lang.Throwable -> La6
            if (r2 == 0) goto L5b
            java.lang.String r2 = r11.j     // Catch: java.lang.Throwable -> La6
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La6
            aopi r3 = r4.instance     // Catch: java.lang.Throwable -> La6
            aqzo r3 = (defpackage.aqzo) r3     // Catch: java.lang.Throwable -> La6
            r2.getClass()     // Catch: java.lang.Throwable -> La6
            int r5 = r3.b     // Catch: java.lang.Throwable -> La6
            r5 = r5 | 16
            r3.b = r5     // Catch: java.lang.Throwable -> La6
            r3.g = r2     // Catch: java.lang.Throwable -> La6
        L5b:
            acsl r2 = new acsl     // Catch: java.lang.Throwable -> La6
            r5 = r2
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r4
            r5.<init>()     // Catch: java.lang.Throwable -> La6
            acsj r3 = new acsj     // Catch: java.lang.Throwable -> La6
            r5 = r3
            r6 = r11
            r7 = r12
            r8 = r13
            r9 = r14
            r10 = r4
            r5.<init>()     // Catch: java.lang.Throwable -> La6
            int r12 = r11.F     // Catch: java.lang.Throwable -> La6
            if (r12 == 0) goto L94
            long r12 = r11.E     // Catch: java.lang.Throwable -> La6
            r4.copyOnWrite()     // Catch: java.lang.Throwable -> La6
            aopi r14 = r4.instance     // Catch: java.lang.Throwable -> La6
            aqzo r14 = (defpackage.aqzo) r14     // Catch: java.lang.Throwable -> La6
            int r4 = r14.b     // Catch: java.lang.Throwable -> La6
            r1 = r1 | r4
            r14.b = r1     // Catch: java.lang.Throwable -> La6
            r14.d = r12     // Catch: java.lang.Throwable -> La6
            long r12 = r11.E     // Catch: java.lang.Throwable -> La6
            r4 = 1
            long r12 = r12 + r4
            ankt r12 = r11.b(r12)     // Catch: java.lang.Throwable -> La6
            anjk r13 = defpackage.anjk.a     // Catch: java.lang.Throwable -> La6
            defpackage.ylx.k(r12, r13, r3, r2)     // Catch: java.lang.Throwable -> La6
            goto La4
        L94:
            yve r12 = r11.f27J     // Catch: java.lang.Throwable -> La6
            acsm r13 = new acsm     // Catch: java.lang.Throwable -> La6
            r13.<init>(r4)     // Catch: java.lang.Throwable -> La6
            ankt r12 = r12.b(r13)     // Catch: java.lang.Throwable -> La6
            anjk r13 = defpackage.anjk.a     // Catch: java.lang.Throwable -> La6
            defpackage.ylx.k(r12, r13, r3, r2)     // Catch: java.lang.Throwable -> La6
        La4:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            return
        La6:
            r12 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> La6
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.acss.j(int, afvm, afuq):void");
    }
}
