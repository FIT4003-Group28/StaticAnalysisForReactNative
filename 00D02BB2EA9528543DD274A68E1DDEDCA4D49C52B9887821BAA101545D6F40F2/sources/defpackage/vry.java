package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: vry  reason: default package */
/* loaded from: classes7.dex */
final class vry implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ vsf a;

    public vry(vsf vsfVar) {
        this.a = vsfVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (bundle != null) {
            vsf vsfVar = this.a;
            Collection collection = (Collection) bundle.getSerializable("DIRECTIONS_ICON_MANAGER_ICON_MAP_ENTRIES_KEY");
            if (collection == null) {
                return;
            }
            vsfVar.k(bvrt.d(dcdc.r(collection), dcdc.F(), (dssr) dvxl.e.cu(7), dvxl.e));
        }
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
        bundle.putSerializable("DIRECTIONS_ICON_MANAGER_ICON_MAP_ENTRIES_KEY", bvrt.c(dcdc.r(this.a.d.values()), dcdc.F()));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
