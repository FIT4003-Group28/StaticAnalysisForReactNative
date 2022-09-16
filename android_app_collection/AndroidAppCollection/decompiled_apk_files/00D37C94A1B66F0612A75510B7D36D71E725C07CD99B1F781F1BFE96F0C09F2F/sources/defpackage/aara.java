package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: aara  reason: default package */
/* loaded from: classes.dex */
public final class aara implements Application.ActivityLifecycleCallbacks {
    public aaqz a;
    private final zer b;

    public aara(Context context) {
        this.b = new aaqy(context);
    }

    public static final DisplayMetrics c(Context context) {
        DisplayMetrics displayMetrics;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager != null) {
            displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        } else {
            displayMetrics = null;
        }
        return displayMetrics != null ? displayMetrics : context.getResources().getDisplayMetrics();
    }

    public final aaqz a() {
        return (aaqz) this.b.get();
    }

    public final void b(Activity activity) {
        this.a = new aaqz(c(activity), false);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
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
        b(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}
