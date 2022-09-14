package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public final class c implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: f  reason: collision with root package name */
    private static final c f6842f = new c();

    /* renamed from: b  reason: collision with root package name */
    private final AtomicBoolean f6843b = new AtomicBoolean();

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f6844c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<a> f6845d = new ArrayList<>();

    /* renamed from: e  reason: collision with root package name */
    private boolean f6846e = false;

    /* loaded from: classes.dex */
    public interface a {
        void a(boolean z);
    }

    private c() {
    }

    public static void a(Application application) {
        synchronized (f6842f) {
            if (!f6842f.f6846e) {
                application.registerActivityLifecycleCallbacks(f6842f);
                application.registerComponentCallbacks(f6842f);
                f6842f.f6846e = true;
            }
        }
    }

    public static c b() {
        return f6842f;
    }

    private final void b(boolean z) {
        synchronized (f6842f) {
            ArrayList<a> arrayList = this.f6845d;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                a aVar = arrayList.get(i);
                i++;
                aVar.a(z);
            }
        }
    }

    public final void a(a aVar) {
        synchronized (f6842f) {
            this.f6845d.add(aVar);
        }
    }

    public final boolean a() {
        return this.f6843b.get();
    }

    @TargetApi(16)
    public final boolean a(boolean z) {
        if (!this.f6844c.get()) {
            if (!com.google.android.gms.common.util.l.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f6844c.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f6843b.set(true);
            }
        }
        return a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        boolean compareAndSet = this.f6843b.compareAndSet(true, false);
        this.f6844c.set(true);
        if (compareAndSet) {
            b(false);
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
        boolean compareAndSet = this.f6843b.compareAndSet(true, false);
        this.f6844c.set(true);
        if (compareAndSet) {
            b(false);
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
        if (i != 20 || !this.f6843b.compareAndSet(false, true)) {
            return;
        }
        this.f6844c.set(true);
        b(true);
    }
}
