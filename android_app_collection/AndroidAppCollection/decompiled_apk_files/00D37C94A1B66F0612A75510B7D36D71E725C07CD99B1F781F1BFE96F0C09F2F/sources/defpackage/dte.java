package defpackage;

import android.app.Activity;
import android.app.Application;
/* compiled from: PG */
/* renamed from: dte  reason: default package */
/* loaded from: classes3.dex */
final class dte implements dtg {
    final /* synthetic */ Activity a;
    private final /* synthetic */ int b;

    public dte(Activity activity) {
        this.a = activity;
    }

    public dte(Activity activity, int i) {
        this.b = i;
        this.a = activity;
    }

    @Override // defpackage.dtg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        int i = this.b;
        if (i == 0) {
            activityLifecycleCallbacks.onActivityResumed(this.a);
        } else if (i == 1) {
            activityLifecycleCallbacks.onActivityStarted(this.a);
        } else if (i == 2) {
            activityLifecycleCallbacks.onActivityPaused(this.a);
        } else if (i == 3) {
            activityLifecycleCallbacks.onActivityStopped(this.a);
        } else {
            activityLifecycleCallbacks.onActivityDestroyed(this.a);
        }
    }
}
