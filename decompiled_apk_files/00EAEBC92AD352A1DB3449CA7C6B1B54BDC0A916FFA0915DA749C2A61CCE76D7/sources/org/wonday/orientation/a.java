package org.wonday.orientation;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
import java.util.concurrent.atomic.AtomicInteger;
/* loaded from: classes.dex */
public class a implements Application.ActivityLifecycleCallbacks {

    /* renamed from: c  reason: collision with root package name */
    private static AtomicInteger f10369c = new AtomicInteger(0);

    /* renamed from: d  reason: collision with root package name */
    private static a f10370d;

    /* renamed from: b  reason: collision with root package name */
    private b f10371b;

    private a() {
    }

    public static a a() {
        if (f10370d == null) {
            f10370d = new a();
        }
        return f10370d;
    }

    public void a(b bVar) {
        this.f10371b = bVar;
        if (f10369c.get() == 1) {
            this.f10371b.start();
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivityCreated");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityDestroyed");
        if (f10369c.get() != 0 || (bVar = this.f10371b) == null) {
            return;
        }
        bVar.release();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        Log.d("OrientationModule", "onActivityPaused");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        Log.d("OrientationModule", "onActivityResumed");
        if (f10369c.incrementAndGet() != 1 || this.f10371b == null) {
            return;
        }
        Log.d("OrientationModule", "Start orientation");
        this.f10371b.start();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Log.d("OrientationModule", "onActivitySaveInstanceState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        Log.d("OrientationModule", "onActivityStarted");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        b bVar;
        Log.d("OrientationModule", "onActivityStopped");
        if (f10369c.decrementAndGet() != 0 || (bVar = this.f10371b) == null) {
            return;
        }
        bVar.stop();
    }
}
