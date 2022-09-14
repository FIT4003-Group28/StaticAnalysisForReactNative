package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aoy  reason: default package */
/* loaded from: classes.dex */
public final class aoy extends aor {
    final /* synthetic */ aoz a;

    public aoy(aoz aozVar) {
        this.a = aozVar;
    }

    @Override // defpackage.aor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = apb.b;
            ((apb) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }

    @Override // defpackage.aor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        aoz aozVar = this.a;
        int i = aozVar.b - 1;
        aozVar.b = i;
        if (i == 0) {
            aozVar.d.postDelayed(aozVar.f, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new aox(this));
    }

    @Override // defpackage.aor, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        aoz aozVar;
        aozVar.a--;
        this.a.d();
    }
}
