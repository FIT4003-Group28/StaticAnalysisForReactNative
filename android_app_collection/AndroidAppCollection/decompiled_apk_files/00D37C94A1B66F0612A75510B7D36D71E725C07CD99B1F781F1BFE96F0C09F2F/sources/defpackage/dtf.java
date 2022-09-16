package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: dtf  reason: default package */
/* loaded from: classes3.dex */
final class dtf implements dtg {
    final /* synthetic */ Activity a;
    final /* synthetic */ Bundle b;
    private final /* synthetic */ int c;

    public dtf(Activity activity, Bundle bundle) {
        this.a = activity;
        this.b = bundle;
    }

    public dtf(Activity activity, Bundle bundle, int i) {
        this.c = i;
        this.a = activity;
        this.b = bundle;
    }

    @Override // defpackage.dtg
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        if (this.c == 0) {
            activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.b);
        } else {
            activityLifecycleCallbacks.onActivityCreated(this.a, this.b);
        }
    }
}
