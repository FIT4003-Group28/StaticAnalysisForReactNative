package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aqb  reason: default package */
/* loaded from: classes2.dex */
final class aqb extends apr {
    final /* synthetic */ aqc a;

    public aqb(aqc aqcVar) {
        this.a = aqcVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.a();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.b();
    }
}
