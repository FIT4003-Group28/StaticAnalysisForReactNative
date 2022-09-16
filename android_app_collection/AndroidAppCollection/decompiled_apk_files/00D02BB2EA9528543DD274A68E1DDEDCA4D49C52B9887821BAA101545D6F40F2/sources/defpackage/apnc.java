package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.io.File;
/* compiled from: PG */
/* renamed from: apnc  reason: default package */
/* loaded from: classes2.dex */
final class apnc implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ apne a;

    public apnc(apne apneVar) {
        this.a = apneVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        File file;
        apne apneVar = this.a;
        if (activity == apneVar.a && (file = apneVar.b) != null) {
            apnf.b(file);
        }
        activity.getApplication().unregisterActivityLifecycleCallbacks(this);
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
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
