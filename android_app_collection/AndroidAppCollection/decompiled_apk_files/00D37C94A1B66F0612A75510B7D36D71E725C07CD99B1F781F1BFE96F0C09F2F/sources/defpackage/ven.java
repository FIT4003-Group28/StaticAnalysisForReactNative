package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ven  reason: default package */
/* loaded from: classes4.dex */
final class ven implements Application.ActivityLifecycleCallbacks {
    boolean a = false;
    final /* synthetic */ Application b;
    final /* synthetic */ azqb c;
    final /* synthetic */ ampq d;

    public ven(Application application, azqb azqbVar, ampq ampqVar) {
        this.b = application;
        this.c = azqbVar;
        this.d = ampqVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.b.unregisterActivityLifecycleCallbacks(this);
        if (!this.a) {
            this.a = true;
            for (Application.ActivityLifecycleCallbacks activityLifecycleCallbacks : (Set) this.c.get()) {
                Application.ActivityLifecycleCallbacks activityLifecycleCallbacks2 = (Application.ActivityLifecycleCallbacks) ((ampg) ((ampv) this.d).a).apply(activityLifecycleCallbacks);
                this.b.registerActivityLifecycleCallbacks(activityLifecycleCallbacks2);
                activityLifecycleCallbacks2.onActivityCreated(activity, bundle);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        aqxo.y(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        aqxo.y(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        aqxo.y(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        aqxo.y(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        aqxo.y(this.a);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        aqxo.y(this.a);
    }
}
