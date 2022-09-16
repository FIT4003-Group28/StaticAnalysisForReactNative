package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.libraries.youtube.logging.interaction.InteractionLoggingScreen;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: akus  reason: default package */
/* loaded from: classes.dex */
public final class akus implements yoj, yok {
    public final azqb c;
    public final azqb d;
    public final azqb e;
    final Runnable f;
    private ynk g;
    private ynk h;
    private ynk i;
    private yor j;
    private akur k;
    private final Application m;
    private final yni n;
    private final snc o;
    private final ScheduledExecutorService p;
    private final azqb q;
    private final Executor r;
    private final azqb s;
    private aypg t;
    private ScheduledFuture u;
    public boolean a = false;
    private long l = -1;
    public long b = -1;

    public akus(Application application, yni yniVar, final snc sncVar, ScheduledExecutorService scheduledExecutorService, azqb azqbVar, final azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5) {
        this.m = application;
        this.n = yniVar;
        this.o = sncVar;
        this.p = scheduledExecutorService;
        this.c = azqbVar;
        this.d = azqbVar2;
        this.e = azqbVar3;
        this.q = azqbVar4;
        this.r = anlz.g(scheduledExecutorService);
        this.s = azqbVar5;
        this.f = new Runnable() { // from class: akuq
            @Override // java.lang.Runnable
            public final void run() {
                akus akusVar = akus.this;
                snc sncVar2 = sncVar;
                azqb azqbVar6 = azqbVar2;
                synchronized (akusVar) {
                    if (!akusVar.a) {
                        return;
                    }
                    akusVar.b = sncVar2.d();
                    ((akut) azqbVar6.get()).b(null);
                }
            }
        };
    }

    private final synchronized void f() {
        e();
        if (this.a) {
            ynk ynkVar = this.g;
            if (ynkVar != null) {
                this.n.l(ynkVar);
                this.g = null;
            }
            ynk ynkVar2 = this.h;
            if (ynkVar2 != null) {
                this.n.l(ynkVar2);
                this.h = null;
            }
            ynk ynkVar3 = this.i;
            if (ynkVar3 != null) {
                this.n.l(ynkVar3);
                this.i = null;
            }
            aypg aypgVar = this.t;
            if (aypgVar != null) {
                ayqi.c((AtomicReference) aypgVar);
                this.t = null;
            }
            akur akurVar = this.k;
            if (akurVar != null) {
                this.m.unregisterReceiver(akurVar);
                this.k = null;
            }
            yor yorVar = this.j;
            if (yorVar != null) {
                yorVar.b(this.m);
                this.j.d(this);
                this.j.d(this);
                this.j = null;
            }
            this.a = false;
        }
    }

    private final synchronized void h(avff avffVar) {
        if (!this.a) {
            this.g = this.n.a(this, akua.class, new akun(this, 1));
            this.h = this.n.a(this, akub.class, new akun(this));
            this.i = this.n.a(this, akuc.class, new akun(this, 2));
            avfd avfdVar = avffVar.e;
            if (avfdVar == null) {
                avfdVar = avfd.a;
            }
            if (avfdVar.r) {
                this.t = ((aktl) this.s.get()).c.as(new ayqb() { // from class: akuo
                    @Override // defpackage.ayqb
                    public final void a(Object obj) {
                        akus.this.c((akuc) obj);
                    }
                });
            }
            yor yorVar = new yor();
            this.j = yorVar;
            yorVar.a(this.m);
            this.j.c(this);
            this.j.c(this);
            ((aktp) this.c.get()).a(this.m.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED")));
            IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.BATTERY_CHANGED");
            akur akurVar = new akur(this);
            this.k = akurVar;
            this.m.registerReceiver(akurVar, intentFilter);
            this.a = true;
        }
    }

    @Override // defpackage.yok
    public final void a() {
        this.r.execute(new akup(this));
        akut akutVar = (akut) this.d.get();
        synchronized (akutVar.a) {
            for (aktk aktkVar : akutVar.e.values()) {
                if (aktkVar.e()) {
                    Context context = akutVar.b;
                    aktkVar.c();
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0074, code lost:
        if (r0.c != false) goto L56;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void b(defpackage.avff r6) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r6.c     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto La
            r5.f()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        La:
            azqb r0 = r5.d     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            akut r0 = (defpackage.akut) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> Lb4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r2 = r0.e     // Catch: java.lang.Throwable -> Lb1
            java.util.Collection r2 = r2.values()     // Catch: java.lang.Throwable -> Lb1
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> Lb1
        L1f:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L3c
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> Lb1
            aktk r3 = (defpackage.aktk) r3     // Catch: java.lang.Throwable -> Lb1
            r3.d(r6)     // Catch: java.lang.Throwable -> Lb1
            boolean r4 = r3 instanceof defpackage.akti     // Catch: java.lang.Throwable -> Lb1
            if (r4 == 0) goto L1f
            boolean r3 = r3.e()     // Catch: java.lang.Throwable -> Lb1
            if (r3 == 0) goto L1f
            r3 = 1
            r0.f = r3     // Catch: java.lang.Throwable -> Lb1
            goto L1f
        L3c:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            azqb r0 = r5.e     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            akuu r0 = (defpackage.akuu) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r1 = r0.a     // Catch: java.lang.Throwable -> Lb4
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb4
            java.util.Map r0 = r0.b     // Catch: java.lang.Throwable -> Lae
            java.util.Collection r0 = r0.values()     // Catch: java.lang.Throwable -> Lae
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> Lae
        L52:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L62
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> Lae
            akwl r2 = (defpackage.akwl) r2     // Catch: java.lang.Throwable -> Lae
            r2.a(r6)     // Catch: java.lang.Throwable -> Lae
            goto L52
        L62:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            r5.h(r6)     // Catch: java.lang.Throwable -> Lb4
            int r0 = r6.b     // Catch: java.lang.Throwable -> Lb4
            r0 = r0 & 64
            if (r0 == 0) goto L76
            avey r0 = r6.f     // Catch: java.lang.Throwable -> Lb4
            if (r0 != 0) goto L72
            avey r0 = defpackage.avey.a     // Catch: java.lang.Throwable -> Lb4
        L72:
            boolean r0 = r0.c     // Catch: java.lang.Throwable -> Lb4
            if (r0 == 0) goto L87
        L76:
            azqb r0 = r5.q     // Catch: java.lang.Throwable -> Lb4
            java.lang.Object r0 = r0.get()     // Catch: java.lang.Throwable -> Lb4
            akwq r0 = (defpackage.akwq) r0     // Catch: java.lang.Throwable -> Lb4
            java.lang.Thread$UncaughtExceptionHandler r1 = java.lang.Thread.getDefaultUncaughtExceptionHandler()     // Catch: java.lang.Throwable -> Lb4
            r0.b = r1     // Catch: java.lang.Throwable -> Lb4
            java.lang.Thread.setDefaultUncaughtExceptionHandler(r0)     // Catch: java.lang.Throwable -> Lb4
        L87:
            int r0 = r6.b     // Catch: java.lang.Throwable -> Lb4
            r0 = r0 & 2
            if (r0 == 0) goto L98
            avfa r6 = r6.d     // Catch: java.lang.Throwable -> Lb4
            if (r6 != 0) goto L93
            avfa r6 = defpackage.avfa.a     // Catch: java.lang.Throwable -> Lb4
        L93:
            int r6 = r6.b     // Catch: java.lang.Throwable -> Lb4
            long r0 = (long) r6     // Catch: java.lang.Throwable -> Lb4
            r5.l = r0     // Catch: java.lang.Throwable -> Lb4
        L98:
            android.app.Application r6 = r5.m     // Catch: java.lang.Throwable -> Lb4
            android.content.Context r6 = r6.getApplicationContext()     // Catch: java.lang.Throwable -> Lb4
            boolean r6 = defpackage.uul.c(r6)     // Catch: java.lang.Throwable -> Lb4
            if (r6 == 0) goto La9
            r5.a()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        La9:
            r5.g()     // Catch: java.lang.Throwable -> Lb4
            monitor-exit(r5)
            return
        Lae:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lae
            throw r6     // Catch: java.lang.Throwable -> Lb4
        Lb1:
            r6 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lb1
            throw r6     // Catch: java.lang.Throwable -> Lb4
        Lb4:
            r6 = move-exception
            monitor-exit(r5)
            goto Lb8
        Lb7:
            throw r6
        Lb8:
            goto Lb7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akus.b(avff):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(akuc akucVar) {
        InteractionLoggingScreen c;
        akut akutVar = (akut) this.d.get();
        aveo a = akucVar.a();
        baax b = akucVar.b();
        boolean c2 = akucVar.c();
        String str = ((akwq) this.q.get()).a;
        aopa createBuilder = aven.a.createBuilder();
        if (a != null) {
            createBuilder.copyOnWrite();
            aven avenVar = (aven) createBuilder.instance;
            avenVar.c = a.c;
            avenVar.b |= 1;
        }
        if ((b.b & 64) != 0) {
            baak baakVar = b.h;
            if (baakVar == null) {
                baakVar = baak.a;
            }
            if (baakVar.c) {
                aopa createBuilder2 = avej.a.createBuilder();
                if (str != null) {
                    createBuilder2.copyOnWrite();
                    avej avejVar = (avej) createBuilder2.instance;
                    avejVar.b |= 1;
                    avejVar.c = str;
                }
                aveq aveqVar = ((aacz) akutVar.d.get()).b().u;
                if (aveqVar == null) {
                    aveqVar = aveq.a;
                }
                if (aveqVar.q && (c = ((acud) akutVar.c.get()).c()) != null) {
                    int i = c.f;
                    createBuilder2.copyOnWrite();
                    avej avejVar2 = (avej) createBuilder2.instance;
                    avejVar2.b |= 2;
                    avejVar2.d = i;
                }
                int i2 = ((avej) createBuilder2.instance).b;
                if ((i2 & 1) != 0 || (i2 & 2) != 0) {
                    createBuilder.copyOnWrite();
                    aven avenVar2 = (aven) createBuilder.instance;
                    avej avejVar3 = (avej) createBuilder2.mo39build();
                    avejVar3.getClass();
                    avenVar2.g = avejVar3;
                    avenVar2.b |= 64;
                }
            }
        }
        aoob byteString = b.toByteString();
        createBuilder.copyOnWrite();
        aven avenVar3 = (aven) createBuilder.instance;
        avenVar3.b |= 8;
        avenVar3.f = byteString;
        akutVar.c(createBuilder, c2, akutVar.f);
    }

    public final synchronized void d() {
        if (this.a) {
            long j = 0;
            if (this.l >= 0) {
                e();
                long d = this.o.d();
                long j2 = this.b;
                if (j2 >= 0) {
                    j = Math.max(0L, (j2 + this.l) - d);
                }
                this.u = this.p.scheduleAtFixedRate(this.f, j, this.l, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final synchronized void e() {
        ScheduledFuture scheduledFuture = this.u;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.u.cancel(true);
        }
        this.u = null;
    }

    @Override // defpackage.yoj
    public final void g() {
        this.r.execute(new akup(this, 1));
        akut akutVar = (akut) this.d.get();
        synchronized (akutVar.a) {
            for (aktk aktkVar : akutVar.e.values()) {
                if (aktkVar.e()) {
                    Context context = akutVar.b;
                    aktkVar.b();
                }
            }
        }
    }
}
