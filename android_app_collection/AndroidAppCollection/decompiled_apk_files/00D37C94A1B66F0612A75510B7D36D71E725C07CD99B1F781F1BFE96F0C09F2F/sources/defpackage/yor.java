package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: yor  reason: default package */
/* loaded from: classes4.dex */
public final class yor {
    public static final amzy a = amzy.l("com/google/android/libraries/youtube/common/lifecycle/ApplicationLifecycleTracker");
    public final yoq b = new yoq();

    public final void a(Application application) {
        application.registerActivityLifecycleCallbacks(this.b);
        application.registerComponentCallbacks(this.b);
    }

    public final void b(Application application) {
        application.unregisterActivityLifecycleCallbacks(this.b);
        application.unregisterComponentCallbacks(this.b);
    }

    public final void c(yom yomVar) {
        yomVar.getClass();
        this.b.a.add(yomVar);
    }

    public final void d(yom yomVar) {
        yomVar.getClass();
        this.b.a.remove(yomVar);
    }
}
