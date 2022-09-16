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
/* renamed from: uuj  reason: default package */
/* loaded from: classes4.dex */
public final class uuj implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final /* synthetic */ int c = 0;
    private Boolean i;
    private volatile String j;
    private volatile Activity k;
    private final vgt m;
    public final List a = new CopyOnWriteArrayList();
    private final AtomicInteger d = new AtomicInteger();
    private final AtomicInteger e = new AtomicInteger();
    public final AtomicInteger b = new AtomicInteger();
    private final AtomicInteger f = new AtomicInteger();
    private final AtomicInteger g = new AtomicInteger();
    private final AtomicInteger h = new AtomicInteger();
    private boolean l = false;

    public uuj(vgt vgtVar, byte[] bArr) {
        this.m = vgtVar;
    }

    private final void a(Activity activity) {
        c(Boolean.valueOf(uul.c(activity.getApplicationContext())), activity);
    }

    private final void b() {
        if (!this.l && this.d.get() == 0) {
            vgt vgtVar = this.m;
            if (vgtVar.a()) {
                this.l = true;
            } else {
                String valueOf = String.valueOf(vgtVar.a);
                throw new IllegalStateException(valueOf.length() != 0 ? "Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: ".concat(valueOf) : new String("Primes did not observe lifecycle events in the expected order. This is usually because Primes is not being initialized properly (i.e. from the main thread and in onCreate). Send a cl to the Primes team requesting your app to be allowlisted for your package: "));
            }
        }
    }

    private final void c(Boolean bool, Activity activity) {
        if (bool.equals(this.i)) {
            ((amzw) ((amzw) uuk.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 286, "AppLifecycleTracker.java")).s("App foreground state unchanged: inForeground ? %b", bool);
            return;
        }
        this.i = bool;
        if (bool.booleanValue()) {
            ((amzw) ((amzw) uuk.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 291, "AppLifecycleTracker.java")).q("App transition to foreground");
            for (uuh uuhVar : this.a) {
                if (uuhVar instanceof uuf) {
                    ((uuf) uuhVar).c(activity);
                }
            }
            return;
        }
        ((amzw) ((amzw) uuk.a.d()).i("com/google/android/libraries/performance/primes/lifecycle/AppLifecycleTracker$Callbacks", "setForegroundState", 298, "AppLifecycleTracker.java")).q("App transition to background");
        for (uuh uuhVar2 : this.a) {
            if (uuhVar2 instanceof uue) {
                ((uue) uuhVar2).d(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.d.incrementAndGet();
        this.k = null;
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof utx) {
                ((utx) uuhVar).b(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (this.h.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uty) {
                ((uty) uuhVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (this.f.getAndIncrement() == 0) {
            b();
        }
        this.j = null;
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof utz) {
                ((utz) uuhVar).b(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (this.b.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        this.j = activity.getClass().getSimpleName();
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uua) {
                ((uua) uuhVar).a(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uub) {
                ((uub) uuhVar).a();
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (this.e.getAndIncrement() == 0) {
            b();
        }
        this.k = null;
        a(activity);
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uuc) {
                ((uuc) uuhVar).c(activity);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (this.g.getAndIncrement() == 0) {
            b();
        }
        this.k = activity;
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uud) {
                ((uud) uuhVar).a();
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
        for (uuh uuhVar : this.a) {
            if (uuhVar instanceof uug) {
                ((uug) uuhVar).a();
            }
        }
        if (i >= 20 && this.k != null) {
            c(false, this.k);
        }
        this.k = null;
    }
}
