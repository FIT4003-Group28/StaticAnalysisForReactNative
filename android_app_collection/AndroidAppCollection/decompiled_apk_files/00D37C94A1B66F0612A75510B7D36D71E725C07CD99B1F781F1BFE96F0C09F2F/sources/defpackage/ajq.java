package defpackage;

import android.app.Application;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ajq  reason: default package */
/* loaded from: classes.dex */
public final class ajq implements Runnable {
    final /* synthetic */ Application a;
    final /* synthetic */ ajs b;

    public ajq(Application application, ajs ajsVar) {
        this.a = application;
        this.b = ajsVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.unregisterActivityLifecycleCallbacks(this.b);
    }
}
