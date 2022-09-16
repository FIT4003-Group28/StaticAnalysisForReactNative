package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: riq  reason: default package */
/* loaded from: classes4.dex */
final class riq implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ rir a;

    public riq(rir rirVar) {
        this.a = rirVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.c(new rij(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.c(new rip(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.c(new rim(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.c(new ril(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        rhi rhiVar = new rhi(null);
        this.a.c(new rio(this, activity, rhiVar));
        Bundle b = rhiVar.b(50L);
        if (b != null) {
            bundle.putAll(b);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.a.c(new rik(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.c(new rin(this, activity));
    }
}
