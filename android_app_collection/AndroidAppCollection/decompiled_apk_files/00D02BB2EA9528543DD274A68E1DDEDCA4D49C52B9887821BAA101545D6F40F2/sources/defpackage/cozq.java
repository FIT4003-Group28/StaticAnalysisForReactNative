package defpackage;

import android.content.Context;
import android.os.PowerManager;
import android.os.SystemClock;
import android.os.WorkSource;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cozq  reason: default package */
/* loaded from: classes5.dex */
public final class cozq {
    private static final long g = TimeUnit.DAYS.toMillis(366);
    private static volatile ScheduledExecutorService o = null;
    private static final Object p = new Object();
    private static volatile cozn q = new cozn();
    public final Object a;
    public int b;
    public boolean c;
    coiw d;
    public final Map<String, cozo> e;
    public AtomicInteger f;
    private final PowerManager.WakeLock h;
    private Future<?> i;
    private long j;
    private final Set<cozp> k;
    private int l;
    private WorkSource m;
    private final ScheduledExecutorService n;

    public cozq(Context context) {
        String packageName = context.getPackageName();
        this.a = new Object();
        this.b = 0;
        this.k = new HashSet();
        this.c = true;
        this.e = new HashMap();
        this.f = new AtomicInteger(0);
        cnwc.n(context, "WakeLock: context must not be null");
        cnwc.m("wake:com.google.firebase.iid.WakeLockHolder", "WakeLock: wakeLockName must not be empty");
        context.getApplicationContext();
        this.d = null;
        "com.google.android.gms".equals(context.getPackageName());
        PowerManager powerManager = (PowerManager) context.getSystemService("power");
        dbuh.d(powerManager);
        PowerManager.WakeLock newWakeLock = powerManager.newWakeLock(1, "wake:com.google.firebase.iid.WakeLockHolder");
        this.h = newWakeLock;
        if (cnxw.b(context)) {
            WorkSource a = cnxw.a(context, cnxu.a(packageName) ? context.getPackageName() : packageName);
            this.m = a;
            if (a != null) {
                f(newWakeLock, a);
            }
        }
        ScheduledExecutorService scheduledExecutorService = o;
        if (scheduledExecutorService == null) {
            synchronized (p) {
                scheduledExecutorService = o;
                if (scheduledExecutorService == null) {
                    coiz coizVar = coja.a;
                    scheduledExecutorService = Executors.unconfigurableScheduledExecutorService(Executors.newScheduledThreadPool(1));
                    o = scheduledExecutorService;
                }
            }
        }
        this.n = scheduledExecutorService;
    }

    private static void f(PowerManager.WakeLock wakeLock, WorkSource workSource) {
        try {
            wakeLock.setWorkSource(workSource);
        } catch (ArrayIndexOutOfBoundsException | IllegalArgumentException e) {
            e.toString();
        }
    }

    public final void a(long j) {
        this.f.incrementAndGet();
        long j2 = Long.MAX_VALUE;
        long max = Math.max(Math.min(Long.MAX_VALUE, g), 1L);
        if (j > 0) {
            max = Math.min(j, max);
        }
        synchronized (this.a) {
            if (!c()) {
                this.d = coiw.a;
                this.h.acquire();
                SystemClock.elapsedRealtime();
            }
            this.b++;
            this.l++;
            e();
            cozo cozoVar = this.e.get(null);
            if (cozoVar == null) {
                cozoVar = new cozo();
                this.e.put(null, cozoVar);
            }
            cozoVar.a++;
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (Long.MAX_VALUE - elapsedRealtime > max) {
                j2 = elapsedRealtime + max;
            }
            if (j2 > this.j) {
                this.j = j2;
                Future<?> future = this.i;
                if (future != null) {
                    future.cancel(false);
                }
                this.i = this.n.schedule(new Runnable(this) { // from class: cozm
                    private final cozq a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        cozq cozqVar = this.a;
                        synchronized (cozqVar.a) {
                            if (!cozqVar.c()) {
                                return;
                            }
                            cozqVar.b();
                            if (!cozqVar.c()) {
                                return;
                            }
                            cozqVar.b = 1;
                            cozqVar.d();
                        }
                    }
                }, max, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void b() {
        if (this.k.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.k);
        this.k.clear();
        if (arrayList.size() <= 0) {
            return;
        }
        cozp cozpVar = (cozp) arrayList.get(0);
        throw null;
    }

    public final boolean c() {
        boolean z;
        synchronized (this.a) {
            z = this.b > 0;
        }
        return z;
    }

    public final void d() {
        synchronized (this.a) {
            if (!c()) {
                return;
            }
            if (this.c) {
                int i = this.b - 1;
                this.b = i;
                if (i > 0) {
                    return;
                }
            } else {
                this.b = 0;
            }
            b();
            for (cozo cozoVar : this.e.values()) {
                cozoVar.a = 0;
            }
            this.e.clear();
            Future<?> future = this.i;
            if (future != null) {
                future.cancel(false);
                this.i = null;
                this.j = 0L;
            }
            this.l = 0;
            if (this.h.isHeld()) {
                try {
                    this.h.release();
                    if (this.d != null) {
                        this.d = null;
                    }
                } catch (RuntimeException e) {
                    if (!e.getClass().equals(RuntimeException.class)) {
                        throw e;
                    }
                    if (this.d != null) {
                        this.d = null;
                    }
                }
            }
        }
    }

    public final void e() {
        if (!this.c || !TextUtils.isEmpty(null)) {
        }
    }
}
