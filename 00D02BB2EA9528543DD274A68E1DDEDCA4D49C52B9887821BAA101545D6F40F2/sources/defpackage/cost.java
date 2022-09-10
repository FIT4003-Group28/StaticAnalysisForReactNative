package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cost  reason: default package */
/* loaded from: classes5.dex */
public final class cost implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ cosu a;

    public cost(cosu cosuVar) {
        this.a = cosuVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        this.a.a(new cosm(this, bundle, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        this.a.a(new coss(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        this.a.a(new cosp(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        this.a.a(new coso(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        cosa cosaVar = new cosa();
        this.a.a(new cosr(this, activity, cosaVar));
        synchronized (cosaVar.a) {
            if (!cosaVar.b) {
                try {
                    cosaVar.a.wait(50L);
                } catch (InterruptedException unused) {
                    bundle2 = null;
                }
            }
            bundle3 = cosaVar.a.get();
        }
        bundle2 = bundle3;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        this.a.a(new cosn(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        this.a.a(new cosq(this, activity));
    }
}
