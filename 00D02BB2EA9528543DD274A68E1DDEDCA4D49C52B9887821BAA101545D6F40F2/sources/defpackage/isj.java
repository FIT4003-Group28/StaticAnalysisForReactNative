package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: isj  reason: default package */
/* loaded from: classes.dex */
public final class isj implements Application.ActivityLifecycleCallbacks {
    private static final long c = TimeUnit.SECONDS.toMillis(20);
    public final dxio<ckcw> a;
    public boolean b = false;
    private final List<WeakReference<Activity>> d = new ArrayList();
    private final dehq e;

    public isj(dehq dehqVar, dxio<ckcw> dxioVar) {
        this.e = dehqVar;
        this.a = dxioVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        for (WeakReference<Activity> weakReference : this.d) {
            if (weakReference.get() != null) {
                i++;
            } else {
                arrayList.add(weakReference);
            }
        }
        this.d.removeAll(arrayList);
        ((ckco) this.a.a().a(ckja.M)).a(i);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        final WeakReference<Activity> weakReference = new WeakReference<>(activity);
        if (this.d.size() < 100) {
            this.d.add(weakReference);
        }
        bvqd.a(this.e.d(new Runnable(this, weakReference) { // from class: isi
            private final isj a;
            private final WeakReference b;

            {
                this.a = this;
                this.b = weakReference;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ((ckcm) this.a.a.a().a(ckja.L)).a(this.b.get() != null);
            }
        }, c, TimeUnit.MILLISECONDS), this.e);
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
    }
}
