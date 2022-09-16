package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
/* compiled from: PG */
/* renamed from: cxbc  reason: default package */
/* loaded from: classes.dex */
public final class cxbc implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ cxbe b;

    public cxbc(cxbe cxbeVar, Application application) {
        this.b = cxbeVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        cxaz cxazVar = this.b.j.b == null ? this.b.j : this.b.k;
        cxazVar.a = activity.getClass().getSimpleName();
        cxazVar.b = Long.valueOf(elapsedRealtime);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        cxaz cxazVar = this.b.k.b == null ? this.b.j : this.b.k;
        if (cxazVar.c == null) {
            cxazVar.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        cxaz cxazVar = this.b.k.b == null ? this.b.j : this.b.k;
        if (cxazVar.d == null) {
            cxazVar.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(16908290);
            findViewById.getViewTreeObserver().addOnPreDrawListener(new cxbb(this, findViewById));
        } catch (RuntimeException unused) {
        }
    }
}
