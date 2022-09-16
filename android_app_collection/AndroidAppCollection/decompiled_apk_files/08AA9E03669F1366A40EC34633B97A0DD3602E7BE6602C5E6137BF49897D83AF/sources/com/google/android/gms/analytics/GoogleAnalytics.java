package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.internal.measurement.zzat;
import com.google.android.gms.internal.measurement.zzcc;
import com.google.android.gms.internal.measurement.zzcl;
import com.google.android.gms.internal.measurement.zzda;
import com.google.android.gms.internal.measurement.zzdc;
import com.google.android.gms.internal.measurement.zzde;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
@VisibleForTesting
/* loaded from: classes.dex */
public final class GoogleAnalytics extends com.google.android.gms.analytics.zza {
    private static List<Runnable> zzra = new ArrayList();
    private boolean zzrb;
    private Set<zza> zzrc;
    private boolean zzrd;
    private boolean zzre;
    private volatile boolean zzrf;
    private boolean zzrg;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface zza {
        void zzc(Activity activity);

        void zzd(Activity activity);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @TargetApi(14)
    /* loaded from: classes.dex */
    public class zzb implements Application.ActivityLifecycleCallbacks {
        zzb() {
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
            GoogleAnalytics.this.zza(activity);
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            GoogleAnalytics.this.zzb(activity);
        }
    }

    @VisibleForTesting
    public GoogleAnalytics(zzat zzatVar) {
        super(zzatVar);
        this.zzrc = new HashSet();
    }

    public static GoogleAnalytics getInstance(Context context) {
        return zzat.zzc(context).zzck();
    }

    public static void zzn() {
        synchronized (GoogleAnalytics.class) {
            if (zzra != null) {
                for (Runnable runnable : zzra) {
                    runnable.run();
                }
                zzra = null;
            }
        }
    }

    public final void dispatchLocalHits() {
        zzh().zzby().zzbo();
    }

    @TargetApi(14)
    public final void enableAutoActivityReports(Application application) {
        if (!this.zzrd) {
            application.registerActivityLifecycleCallbacks(new zzb());
            this.zzrd = true;
        }
    }

    public final boolean getAppOptOut() {
        return this.zzrf;
    }

    @Deprecated
    public final Logger getLogger() {
        return zzcl.getLogger();
    }

    public final boolean isDryRunEnabled() {
        return this.zzre;
    }

    public final boolean isInitialized() {
        return this.zzrb;
    }

    public final Tracker newTracker(int i) {
        Tracker tracker;
        zzdc zzo;
        synchronized (this) {
            tracker = new Tracker(zzh(), null, null);
            if (i > 0 && (zzo = new zzda(zzh()).zzo(i)) != null) {
                tracker.zza(zzo);
            }
            tracker.zzm();
        }
        return tracker;
    }

    public final Tracker newTracker(String str) {
        Tracker tracker;
        synchronized (this) {
            tracker = new Tracker(zzh(), str, null);
            tracker.zzm();
        }
        return tracker;
    }

    public final void reportActivityStart(Activity activity) {
        if (!this.zzrd) {
            zza(activity);
        }
    }

    public final void reportActivityStop(Activity activity) {
        if (!this.zzrd) {
            zzb(activity);
        }
    }

    public final void setAppOptOut(boolean z) {
        this.zzrf = z;
        if (this.zzrf) {
            zzh().zzby().zzbn();
        }
    }

    public final void setDryRun(boolean z) {
        this.zzre = z;
    }

    public final void setLocalDispatchPeriod(int i) {
        zzh().zzby().setLocalDispatchPeriod(i);
    }

    @Deprecated
    public final void setLogger(Logger logger) {
        zzcl.setLogger(logger);
        if (!this.zzrg) {
            String str = zzcc.zzym.get();
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 112);
            sb.append("GoogleAnalytics.setLogger() is deprecated. To enable debug logging, please run:\nadb shell setprop log.tag.");
            sb.append(str);
            sb.append(" DEBUG");
            Log.i(zzcc.zzym.get(), sb.toString());
            this.zzrg = true;
        }
    }

    @VisibleForTesting
    final void zza(Activity activity) {
        for (zza zzaVar : this.zzrc) {
            zzaVar.zzc(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zza(zza zzaVar) {
        this.zzrc.add(zzaVar);
        Context context = zzh().getContext();
        if (context instanceof Application) {
            enableAutoActivityReports((Application) context);
        }
    }

    @VisibleForTesting
    final void zzb(Activity activity) {
        for (zza zzaVar : this.zzrc) {
            zzaVar.zzd(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzb(zza zzaVar) {
        this.zzrc.remove(zzaVar);
    }

    public final void zzm() {
        zzde zzca = zzh().zzca();
        zzca.zzfn();
        if (zzca.zzfo()) {
            setDryRun(zzca.zzfp());
        }
        zzca.zzfn();
        this.zzrb = true;
    }
}
