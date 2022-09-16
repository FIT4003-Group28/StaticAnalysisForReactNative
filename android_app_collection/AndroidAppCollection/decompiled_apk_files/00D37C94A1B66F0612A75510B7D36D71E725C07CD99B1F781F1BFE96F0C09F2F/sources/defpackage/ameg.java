package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ameg  reason: default package */
/* loaded from: classes.dex */
final class ameg implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ameh a;

    public ameg(ameh amehVar) {
        this.a = amehVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        ameh amehVar = this.a;
        int i = amehVar.b + 1;
        amehVar.b = i;
        if (i == 1) {
            amehVar.a(true);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        ameh amehVar = this.a;
        int i = amehVar.b - 1;
        amehVar.b = i;
        if (i == 0) {
            amehVar.a(false);
        }
    }
}
