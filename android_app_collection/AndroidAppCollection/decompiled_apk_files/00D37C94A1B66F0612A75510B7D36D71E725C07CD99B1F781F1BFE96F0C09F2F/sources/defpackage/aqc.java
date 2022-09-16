package defpackage;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: aqc  reason: default package */
/* loaded from: classes2.dex */
public final class aqc extends apr {
    final /* synthetic */ aqd a;

    public aqc(aqd aqdVar) {
        this.a = aqdVar;
    }

    @Override // defpackage.apr, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (Build.VERSION.SDK_INT < 29) {
            int i = aqf.b;
            ((aqf) activity.getFragmentManager().findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag")).a = this.a.h;
        }
    }

    @Override // defpackage.apr, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        aqd aqdVar = this.a;
        int i = aqdVar.c - 1;
        aqdVar.c = i;
        if (i == 0) {
            aqdVar.e.postDelayed(aqdVar.g, 700L);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPreCreated(Activity activity, Bundle bundle) {
        activity.registerActivityLifecycleCallbacks(new aqb(this));
    }

    @Override // defpackage.apr, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        aqd aqdVar;
        aqdVar.b--;
        this.a.c();
    }
}
