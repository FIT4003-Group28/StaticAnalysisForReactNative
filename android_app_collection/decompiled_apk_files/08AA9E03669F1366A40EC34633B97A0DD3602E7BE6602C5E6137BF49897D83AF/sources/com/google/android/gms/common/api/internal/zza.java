package com.google.android.gms.common.api.internal;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public final class zza extends ActivityLifecycleObserver {
    private final WeakReference<C0076zza> zzds;

    /* renamed from: com.google.android.gms.common.api.internal.zza$zza  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static class C0076zza extends LifecycleCallback {
        private List<Runnable> zzdt;

        private C0076zza(LifecycleFragment lifecycleFragment) {
            super(lifecycleFragment);
            this.zzdt = new ArrayList();
            this.mLifecycleFragment.addCallback("LifecycleObserverOnStop", this);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static C0076zza zza(Activity activity) {
            C0076zza c0076zza;
            synchronized (activity) {
                LifecycleFragment fragment = getFragment(activity);
                c0076zza = (C0076zza) fragment.getCallbackOrNull("LifecycleObserverOnStop", C0076zza.class);
                if (c0076zza == null) {
                    c0076zza = new C0076zza(fragment);
                }
            }
            return c0076zza;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final synchronized void zza(Runnable runnable) {
            this.zzdt.add(runnable);
        }

        @Override // com.google.android.gms.common.api.internal.LifecycleCallback
        public void onStop() {
            List<Runnable> list;
            synchronized (this) {
                list = this.zzdt;
                this.zzdt = new ArrayList();
            }
            for (Runnable runnable : list) {
                runnable.run();
            }
        }
    }

    public zza(Activity activity) {
        this(C0076zza.zza(activity));
    }

    private zza(C0076zza c0076zza) {
        this.zzds = new WeakReference<>(c0076zza);
    }

    @Override // com.google.android.gms.common.api.internal.ActivityLifecycleObserver
    public final ActivityLifecycleObserver onStopCallOnce(Runnable runnable) {
        C0076zza c0076zza = this.zzds.get();
        if (c0076zza == null) {
            throw new IllegalStateException("The target activity has already been GC'd");
        }
        c0076zza.zza(runnable);
        return this;
    }
}
