package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cnpf  reason: default package */
/* loaded from: classes.dex */
public final class cnpf implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {
    public static final cnpf a = new cnpf();
    public final AtomicBoolean b = new AtomicBoolean();
    public final AtomicBoolean c = new AtomicBoolean();
    private final ArrayList<cnpe> d = new ArrayList<>();
    private boolean e = false;

    private cnpf() {
    }

    public static void a(Application application) {
        cnpf cnpfVar = a;
        synchronized (cnpfVar) {
            if (!cnpfVar.e) {
                application.registerActivityLifecycleCallbacks(cnpfVar);
                application.registerComponentCallbacks(cnpfVar);
                cnpfVar.e = true;
            }
        }
    }

    private final void c(boolean z) {
        synchronized (a) {
            Iterator<cnpe> it = this.d.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public final void b(cnpe cnpeVar) {
        synchronized (a) {
            this.d.add(cnpeVar);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            c(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        boolean compareAndSet = this.b.compareAndSet(true, false);
        this.c.set(true);
        if (compareAndSet) {
            c(false);
        }
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

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        if (i != 20 || !this.b.compareAndSet(false, true)) {
            return;
        }
        this.c.set(true);
        c(true);
    }
}
