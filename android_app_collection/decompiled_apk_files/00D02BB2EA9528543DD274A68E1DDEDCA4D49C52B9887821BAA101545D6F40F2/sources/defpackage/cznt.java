package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: cznt  reason: default package */
/* loaded from: classes.dex */
public final class cznt implements Application.ActivityLifecycleCallbacks, cznj {
    private static final long c = TimeUnit.MINUTES.toMillis(1);
    public cznn a;
    private final ScheduledExecutorService d;
    private final cznl e;
    private ScheduledFuture<?> h;
    private final AtomicLong g = new AtomicLong(0);
    private final long f = c;
    protected final Object b = new Object();

    private cznt(cznn cznnVar, ScheduledExecutorService scheduledExecutorService, cznl cznlVar) {
        this.a = cznnVar;
        this.d = scheduledExecutorService;
        this.e = cznlVar;
    }

    public static cznt b(cznn cznnVar, ScheduledExecutorService scheduledExecutorService, cznl cznlVar, Application application) {
        cznt czntVar = new cznt(cznnVar, scheduledExecutorService, cznlVar);
        if (application != null) {
            application.registerActivityLifecycleCallbacks(czntVar);
        }
        cznlVar.a = czntVar;
        return czntVar;
    }

    private final void d() {
        synchronized (this.b) {
            ScheduledFuture<?> scheduledFuture = this.h;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
                this.h = null;
            }
        }
    }

    @Override // defpackage.cznj
    public final void a() {
        if (this.g.incrementAndGet() >= 100) {
            synchronized (this.b) {
                if (this.g.get() >= 100) {
                    synchronized (this.b) {
                        ScheduledFuture<?> scheduledFuture = this.h;
                        if (scheduledFuture != null && !scheduledFuture.isDone() && !this.h.isCancelled()) {
                            if (this.h.getDelay(TimeUnit.MILLISECONDS) > 100) {
                                d();
                                this.h = this.d.schedule(new Runnable(this) { // from class: cznr
                                    private final cznt a;

                                    {
                                        this.a = this;
                                    }

                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.a.c();
                                    }
                                }, 1L, TimeUnit.MILLISECONDS);
                            }
                        }
                        this.h = this.d.schedule(new Runnable(this) { // from class: cznq
                            private final cznt a;

                            {
                                this.a = this;
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                this.a.c();
                            }
                        }, 1L, TimeUnit.MILLISECONDS);
                    }
                    return;
                }
            }
        }
        synchronized (this.b) {
            ScheduledFuture<?> scheduledFuture2 = this.h;
            if (scheduledFuture2 == null || scheduledFuture2.isDone() || this.h.isCancelled()) {
                this.h = this.d.schedule(new Runnable(this) { // from class: czns
                    private final cznt a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.c();
                    }
                }, this.f, TimeUnit.MILLISECONDS);
            }
        }
    }

    public final void c() {
        this.g.set(0L);
        this.a.a(this.e);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        synchronized (this.b) {
            c();
            d();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
