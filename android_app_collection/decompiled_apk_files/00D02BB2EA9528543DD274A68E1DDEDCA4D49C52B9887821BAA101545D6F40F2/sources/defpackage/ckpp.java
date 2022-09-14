package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.List;
/* compiled from: PG */
/* renamed from: ckpp  reason: default package */
/* loaded from: classes.dex */
final class ckpp implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ ckpr a;

    public ckpp(ckpr ckprVar) {
        this.a = ckprVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (activity instanceof ff) {
            ((ff) activity).g().am(this.a.g, false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        List<ckoy> remove;
        if (this.a.b.get(activity) == null || (remove = this.a.b.get(activity).remove(ckow.ACTIVITY_SCOPED_SPANS)) == null) {
            return;
        }
        for (ckoy ckoyVar : remove) {
            if (ckoyVar != null) {
                ckoyVar.a();
                this.a.a.remove(((ckpt) ckoyVar).a);
            }
        }
        remove.clear();
        this.a.b.remove(activity);
        onActivityStopped(activity);
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
        List<ckoy> remove;
        if (this.a.b.get(activity) == null || (remove = this.a.b.get(activity).remove(ckow.ACTIVITY_FOREGROUND_SPANS)) == null) {
            return;
        }
        for (ckoy ckoyVar : remove) {
            if (ckoyVar != null && this.a.a.remove(((ckpt) ckoyVar).a) != null) {
                ckoyVar.a();
            }
        }
    }
}
