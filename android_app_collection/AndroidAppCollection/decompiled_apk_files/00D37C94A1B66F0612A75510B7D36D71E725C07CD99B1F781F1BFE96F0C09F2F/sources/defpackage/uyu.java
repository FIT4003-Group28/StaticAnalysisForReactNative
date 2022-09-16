package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: uyu  reason: default package */
/* loaded from: classes4.dex */
public final class uyu implements Application.ActivityLifecycleCallbacks {
    public final Application a;
    final /* synthetic */ uyw b;

    public uyu(uyw uywVar, Application application) {
        this.b = uywVar;
        this.a = application;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        uyo uyoVar = this.b.n.b == null ? this.b.n : this.b.o;
        uyoVar.a = activity.getClass().getSimpleName();
        uyoVar.b = Long.valueOf(elapsedRealtime);
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
        uyo uyoVar = this.b.o.b == null ? this.b.n : this.b.o;
        if (uyoVar.c == null) {
            uyoVar.c = Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        uyo uyoVar = this.b.o.b == null ? this.b.n : this.b.o;
        if (uyoVar.d == null) {
            uyoVar.d = Long.valueOf(SystemClock.elapsedRealtime());
        }
        try {
            View findViewById = activity.findViewById(16908290);
            ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            viewTreeObserver.addOnDrawListener(new uys(this, findViewById, null));
            viewTreeObserver.addOnPreDrawListener(new uyt(this, findViewById));
        } catch (RuntimeException unused) {
        }
    }
}
