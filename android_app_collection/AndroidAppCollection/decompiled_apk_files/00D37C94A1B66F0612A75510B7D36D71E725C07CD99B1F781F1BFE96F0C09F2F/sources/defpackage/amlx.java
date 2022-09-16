package defpackage;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: amlx  reason: default package */
/* loaded from: classes.dex */
final class amlx implements Application.ActivityLifecycleCallbacks {
    final /* synthetic */ Application.ActivityLifecycleCallbacks a;
    final /* synthetic */ amly b;

    public amlx(amly amlyVar, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.b = amlyVar;
        this.a = activityLifecycleCallbacks;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        if (amna.o()) {
            this.a.onActivityCreated(activity, bundle);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityCreated"));
        try {
            this.a.onActivityCreated(activity, bundle);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (amna.o()) {
            this.a.onActivityDestroyed(activity);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityDestroyed"));
        try {
            this.a.onActivityDestroyed(activity);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        if (amna.o()) {
            this.a.onActivityPaused(activity);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityPaused"));
        try {
            this.a.onActivityPaused(activity);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        if (amna.o()) {
            this.a.onActivityResumed(activity);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityResumed"));
        try {
            this.a.onActivityResumed(activity);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        if (amna.o()) {
            this.a.onActivitySaveInstanceState(activity, bundle);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivitySaveInstanceState"));
        try {
            this.a.onActivitySaveInstanceState(activity, bundle);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        if (amna.o()) {
            this.a.onActivityStarted(activity);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStarted"));
        try {
            this.a.onActivityStarted(activity);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (amna.o()) {
            this.a.onActivityStopped(activity);
            return;
        }
        amlv a = this.b.a(String.valueOf(activity.getClass().getName()).concat("#onActivityStopped"));
        try {
            this.a.onActivityStopped(activity);
            amna.i(a);
        } catch (Throwable th) {
            try {
                amna.i(a);
            } catch (Throwable unused) {
            }
            throw th;
        }
    }
}
