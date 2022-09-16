package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ajw  reason: default package */
/* loaded from: classes.dex */
final class ajw implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ ajy b;

    public ajw(Application application, ajy ajyVar) {
        this.a = application;
        this.b = ajyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
