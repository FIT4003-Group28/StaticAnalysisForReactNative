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
/* renamed from: yoq  reason: default package */
/* loaded from: classes4.dex */
final class yoq implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public Boolean b;
    private volatile String i;
    private volatile Activity j;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger c = new AtomicInteger();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();

    private final void a(Activity activity) {
        b(Boolean.valueOf(uul.c(activity.getApplicationContext())));
    }

    private final void b(Boolean bool) {
        if (bool.equals(this.b)) {
            ((amzw) ((amzw) yor.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 246, "ApplicationLifecycleTracker.java")).s("App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.b = bool;
        if (bool.booleanValue()) {
            ((amzw) ((amzw) yor.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 251, "ApplicationLifecycleTracker.java")).q("App transition to foreground");
            for (yom yomVar : this.a) {
                if (yomVar instanceof yok) {
                    ((yok) yomVar).a();
                }
            }
            return;
        }
        ((amzw) ((amzw) yor.a.d()).i("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker$Callbacks", "setForegroundState", 258, "ApplicationLifecycleTracker.java")).q("App transition to background");
        for (yom yomVar2 : this.a) {
            if (yomVar2 instanceof yoj) {
                ((yoj) yomVar2).g();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.c.incrementAndGet();
        this.j = null;
        for (yom yomVar : this.a) {
            if (yomVar instanceof yoc) {
                ((yoc) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.h.incrementAndGet();
        this.j = null;
        for (yom yomVar : this.a) {
            if (yomVar instanceof yod) {
                ((yod) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.f.incrementAndGet();
        this.i = null;
        for (yom yomVar : this.a) {
            if (yomVar instanceof yoe) {
                ((yoe) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.e.incrementAndGet();
        this.j = null;
        this.i = activity.getClass().getSimpleName();
        for (yom yomVar : this.a) {
            if (yomVar instanceof yof) {
                ((yof) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (yom yomVar : this.a) {
            if (yomVar instanceof yog) {
                ((yog) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.d.incrementAndGet();
        this.j = null;
        a(activity);
        for (yom yomVar : this.a) {
            if (yomVar instanceof yoh) {
                ((yoh) yomVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.g.incrementAndGet();
        this.j = activity;
        for (yom yomVar : this.a) {
            if (yomVar instanceof yoi) {
                ((yoi) yomVar).a();
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
        for (yom yomVar : this.a) {
            if (yomVar instanceof yol) {
                ((yol) yomVar).a();
            }
        }
        if (i >= 20 && this.j != null) {
            b(false);
        }
        this.j = null;
    }
}
