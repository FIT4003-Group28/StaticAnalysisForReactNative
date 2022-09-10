package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: jbz  reason: default package */
/* loaded from: classes.dex */
public final class jbz implements Application.ActivityLifecycleCallbacks {
    private final cztz a;
    @dzsi
    private Activity b;

    public jbz(cztz cztzVar) {
        this.a = cztzVar;
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
        this.b = activity;
        this.a.b(false);
        cztz cztzVar = this.a;
        Activity activity2 = this.b;
        dbsk.s(activity2);
        cztzVar.d(activity2.getWindowManager(), true);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.b) {
            this.b = null;
            this.a.b(true);
            this.a.d((WindowManager) activity.getApplicationContext().getSystemService("window"), false);
        }
    }
}
