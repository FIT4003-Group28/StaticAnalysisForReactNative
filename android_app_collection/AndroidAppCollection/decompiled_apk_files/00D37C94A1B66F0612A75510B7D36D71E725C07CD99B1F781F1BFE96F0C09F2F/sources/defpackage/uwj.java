package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: uwj  reason: default package */
/* loaded from: classes4.dex */
public final class uwj extends uwf implements uvo, utx, uue, uuc {
    public static final amzy a = amzy.l("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl");
    volatile utb b;
    public final axnm c;
    public volatile boolean d;
    private final boolean f;
    private final Context g;
    private final Executor h;
    private final uvm i;
    private final ampq j;
    private final uui k;
    private final vab l;
    private final Runnable q;
    private final AtomicBoolean e = new AtomicBoolean();
    private final AtomicInteger m = new AtomicInteger();
    private final AtomicInteger n = new AtomicInteger();
    private final AtomicInteger o = new AtomicInteger();
    private final AtomicBoolean p = new AtomicBoolean(false);

    public uwj(uvn uvnVar, Context context, Executor executor, axnm axnmVar, ampq ampqVar, uui uuiVar, vab vabVar, final azqb azqbVar) {
        this.c = axnmVar;
        this.j = ampqVar;
        this.k = uuiVar;
        this.l = vabVar;
        this.i = uvnVar.a(anjk.a, axnmVar, null);
        this.g = context;
        this.h = executor;
        Boolean bool = Boolean.FALSE;
        bool.getClass();
        this.f = bool.booleanValue();
        this.q = new Runnable() { // from class: uwh
            @Override // java.lang.Runnable
            public final void run() {
                uwj.this.d = ((Boolean) azqbVar.get()).booleanValue();
            }
        };
    }

    private final void i(final baau baauVar, final AtomicInteger atomicInteger) {
        atomicInteger.getAndIncrement();
        anlz.v(new aniq() { // from class: uwg
            @Override // defpackage.aniq
            public final ankt a() {
                uwj uwjVar = uwj.this;
                AtomicInteger atomicInteger2 = atomicInteger;
                baau baauVar2 = baauVar;
                if (atomicInteger2.getAndDecrement() <= 0) {
                    return ankq.a;
                }
                return uwjVar.f(baauVar2, (uwe) uwjVar.c.get());
            }
        }, this.h);
    }

    @Override // defpackage.uvo, defpackage.ver
    public final void a() {
        ((uwk) ((azqb) ((ampv) this.j).a).get()).a(this);
        this.k.a(this);
        i(baau.PRIMES_CRASH_MONITORING_INITIALIZED, this.m);
        if (this.f) {
            e();
        }
        anlz.t(this.q, this.h);
    }

    @Override // defpackage.utx
    public final void b(Activity activity, Bundle bundle) {
        ((amzw) ((amzw) a.c()).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "onActivityCreated", 314, "CrashMetricServiceImpl.java")).q("onActivityCreated");
        if (!this.p.getAndSet(true)) {
            i(baau.PRIMES_FIRST_ACTIVITY_LAUNCHED, this.n);
        }
    }

    @Override // defpackage.uuc
    public final void c(Activity activity) {
        utb utbVar;
        Class<?> cls = activity.getClass();
        if (!amps.e(null)) {
            String valueOf = String.valueOf(cls.getSimpleName());
            utbVar = new utb(valueOf.length() != 0 ? "null".concat(valueOf) : new String("null"));
        } else {
            utbVar = new utb(cls.getSimpleName());
        }
        this.b = utbVar;
    }

    @Override // defpackage.uue
    public final void d(Activity activity) {
        this.b = null;
    }

    @Override // defpackage.uwf
    public final void e() {
        if (this.e.compareAndSet(false, true)) {
            Thread.setDefaultUncaughtExceptionHandler(new uwi(this, Thread.getDefaultUncaughtExceptionHandler()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ankt f(baau baauVar, uwe uweVar) {
        if (uweVar.d()) {
            float f = uweVar.a;
            vaa a2 = this.l.a(f / 100.0f);
            if (a2.b.nextFloat() >= a2.a) {
                return ankq.a;
            }
            uvm uvmVar = this.i;
            uvi a3 = uvj.a();
            aopa createBuilder = baax.a.createBuilder();
            aopa createBuilder2 = baav.a.createBuilder();
            createBuilder2.copyOnWrite();
            baav baavVar = (baav) createBuilder2.instance;
            baavVar.b |= 2;
            baavVar.d = (int) (100.0f / f);
            createBuilder2.copyOnWrite();
            baav baavVar2 = (baav) createBuilder2.instance;
            baavVar2.c = baauVar.getNumber();
            baavVar2.b |= 1;
            createBuilder.copyOnWrite();
            baax baaxVar = (baax) createBuilder.instance;
            baav baavVar3 = (baav) createBuilder2.mo39build();
            baavVar3.getClass();
            baaxVar.i = baavVar3;
            baaxVar.b |= 128;
            a3.d((baax) createBuilder.mo39build());
            return uvmVar.b(a3.a());
        }
        return ankq.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0054 A[LOOP:0: B:23:0x0054->B:30:0x009d, LOOP_START] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a3  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x00a3 -> B:32:0x004c). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(defpackage.baak r7) {
        /*
            r6 = this;
            android.os.StrictMode$ThreadPolicy r0 = android.os.StrictMode.ThreadPolicy.LAX
            android.os.StrictMode.setThreadPolicy(r0)
            android.os.StrictMode$VmPolicy r0 = android.os.StrictMode.VmPolicy.LAX
            android.os.StrictMode.setVmPolicy(r0)
            axnm r0 = r6.c
            java.lang.Object r0 = r0.get()
            uwe r0 = (defpackage.uwe) r0
            boolean r1 = r0.d()
            if (r1 != 0) goto L19
            return
        L19:
            boolean r1 = r6.d
            r2 = 0
            if (r1 == 0) goto L4b
            uvm r1 = r6.i
            utv r1 = r1.e
            java.util.WeakHashMap r3 = r1.a
            monitor-enter(r3)
            java.util.WeakHashMap r4 = r1.a     // Catch: java.lang.Throwable -> L48
            boolean r4 = r4.isEmpty()     // Catch: java.lang.Throwable -> L48
            if (r4 == 0) goto L31
            utu r1 = defpackage.utu.a     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            goto L4c
        L31:
            java.util.WeakHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L48
            java.util.Collection r1 = r1.values()     // Catch: java.lang.Throwable -> L48
            r4 = 0
            utw[] r4 = new defpackage.utw[r4]     // Catch: java.lang.Throwable -> L48
            java.lang.Object[] r1 = r1.toArray(r4)     // Catch: java.lang.Throwable -> L48
            utw[] r1 = (defpackage.utw[]) r1     // Catch: java.lang.Throwable -> L48
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            utu r3 = new utu
            r3.<init>(r1)
            r1 = r3
            goto L4c
        L48:
            r7 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L48
            throw r7
        L4b:
            r1 = r2
        L4c:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.m
            int r3 = r3.getAndDecrement()
            if (r3 > 0) goto La3
        L54:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.n
            int r3 = r3.getAndDecrement()
            if (r3 > 0) goto L9d
        L5c:
            java.util.concurrent.atomic.AtomicInteger r3 = r6.o
            int r3 = r3.getAndDecrement()
            if (r3 <= 0) goto L6a
            baau r3 = defpackage.baau.PRIMES_CUSTOM_LAUNCHED
            r6.f(r3, r0)
            goto L5c
        L6a:
            uvm r0 = r6.i
            uvi r3 = defpackage.uvj.a()
            baax r4 = defpackage.baax.a
            aopa r4 = r4.createBuilder()
            r4.copyOnWrite()
            aopi r5 = r4.instance
            baax r5 = (defpackage.baax) r5
            r7.getClass()
            r5.h = r7
            int r7 = r5.b
            r7 = r7 | 64
            r5.b = r7
            aopi r7 = r4.mo39build()
            baax r7 = (defpackage.baax) r7
            r3.d(r7)
            r3.b = r2
            r3.e = r1
            uvj r7 = r3.a()
            r0.b(r7)
            return
        L9d:
            baau r3 = defpackage.baau.PRIMES_FIRST_ACTIVITY_LAUNCHED
            r6.f(r3, r0)
            goto L54
        La3:
            baau r3 = defpackage.baau.PRIMES_CRASH_MONITORING_INITIALIZED
            r6.f(r3, r0)
            goto L4c
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.uwj.g(baak):void");
    }

    public final aopa h() {
        aopa createBuilder = baak.a.createBuilder();
        createBuilder.copyOnWrite();
        baak.a((baak) createBuilder.instance);
        utb utbVar = this.b;
        String str = utbVar == null ? null : utbVar.a;
        if (str != null) {
            createBuilder.copyOnWrite();
            baak baakVar = (baak) createBuilder.instance;
            baakVar.b |= 4;
            baakVar.e = str;
        }
        try {
            aopa createBuilder2 = baag.a.createBuilder();
            baaf f = uuo.f(this.g);
            createBuilder2.copyOnWrite();
            baag baagVar = (baag) createBuilder2.instance;
            f.getClass();
            baagVar.c = f;
            baagVar.b |= 1;
            createBuilder.copyOnWrite();
            baak baakVar2 = (baak) createBuilder.instance;
            baag baagVar2 = (baag) createBuilder2.mo39build();
            baagVar2.getClass();
            baakVar2.d = baagVar2;
            baakVar2.b |= 2;
        } catch (RuntimeException e) {
            ((amzw) ((amzw) ((amzw) a.g()).h(e)).i("com/google/android/libraries/performance/primes/metrics/crash/CrashMetricServiceImpl", "createCrashMetric", (char) 233, "CrashMetricServiceImpl.java")).q("Failed to get process stats.");
        }
        return createBuilder;
    }
}
