package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cwrd  reason: default package */
/* loaded from: classes.dex */
final class cwrd implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    private Boolean h;
    private volatile String i;
    private volatile Activity j;
    public final List<cwra> a = new CopyOnWriteArrayList();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();

    private final void a(Activity activity) {
        b(Boolean.valueOf(cwuu.b(activity.getApplicationContext())), activity);
    }

    private final void b(Boolean bool, Activity activity) {
        if (bool.equals(this.h)) {
            return;
        }
        this.h = bool;
        if (bool.booleanValue()) {
            for (cwra cwraVar : this.a) {
                if (cwraVar instanceof cwqy) {
                    ((cwqy) cwraVar).a(activity);
                }
            }
            return;
        }
        for (cwra cwraVar2 : this.a) {
            if (cwraVar2 instanceof cwqx) {
                ((cwqx) cwraVar2).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.c.incrementAndGet();
        this.j = null;
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqq) {
                ((cwqq) cwraVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.g.incrementAndGet();
        this.j = null;
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqr) {
                ((cwqr) cwraVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.e.incrementAndGet();
        this.i = null;
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqs) {
                ((cwqs) cwraVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.b.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqt) {
                ((cwqt) cwraVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqu) {
                ((cwqu) cwraVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqv) {
                ((cwqv) cwraVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.f.incrementAndGet();
        this.j = activity;
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqw) {
                ((cwqw) cwraVar).a();
            }
        }
        a(activity);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        for (cwra cwraVar : this.a) {
            if (cwraVar instanceof cwqz) {
                ((cwqz) cwraVar).a();
            }
        }
        if (i >= 20 && this.j != null) {
            b(false, this.j);
        }
        this.j = null;
    }
}
