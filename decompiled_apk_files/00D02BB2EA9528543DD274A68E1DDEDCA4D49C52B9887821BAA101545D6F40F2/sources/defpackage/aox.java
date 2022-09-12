package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: aox  reason: default package */
/* loaded from: classes2.dex */
final class aox extends aor {
    final /* synthetic */ aoy a;

    public aox(aoy aoyVar) {
        this.a = aoyVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostResumed(Activity activity) {
        this.a.a.c();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPostStarted(Activity activity) {
        this.a.a.a();
    }
}
