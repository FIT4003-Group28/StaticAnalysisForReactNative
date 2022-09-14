package com.google.android.gms.internal.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzcy;
import com.google.android.gms.stats.WakeLock;
/* loaded from: classes.dex */
public final class zzcu<T extends Context & zzcy> {
    private static Boolean zzabn;
    private final Handler handler;
    private final T zzabm;

    public zzcu(T t) {
        Preconditions.checkNotNull(t);
        this.zzabm = t;
        this.handler = new Handler();
    }

    private final void zzb(Runnable runnable) {
        zzat.zzc(this.zzabm).zzby().zza(new zzcx(this, runnable));
    }

    public static boolean zze(Context context) {
        Preconditions.checkNotNull(context);
        if (zzabn != null) {
            return zzabn.booleanValue();
        }
        boolean zzc = zzdd.zzc(context, "com.google.android.gms.analytics.AnalyticsService");
        zzabn = Boolean.valueOf(zzc);
        return zzc;
    }

    public final void onCreate() {
        zzat.zzc(this.zzabm).zzbu().zzp("Local AnalyticsService is starting up");
    }

    public final void onDestroy() {
        zzat.zzc(this.zzabm).zzbu().zzp("Local AnalyticsService is shutting down");
    }

    public final int onStartCommand(Intent intent, int i, final int i2) {
        try {
            synchronized (zzct.lock) {
                WakeLock wakeLock = zzct.zzabl;
                if (wakeLock != null && wakeLock.isHeld()) {
                    wakeLock.release();
                }
            }
        } catch (SecurityException unused) {
        }
        final zzcm zzbu = zzat.zzc(this.zzabm).zzbu();
        if (intent == null) {
            zzbu.zzs("AnalyticsService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        zzbu.zza("Local AnalyticsService called. startId, action", Integer.valueOf(i2), action);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(action)) {
            zzb(new Runnable(this, i2, zzbu) { // from class: com.google.android.gms.internal.measurement.zzcv
                private final zzcu zzabo;
                private final int zzabp;
                private final zzcm zzabq;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzabo = this;
                    this.zzabp = i2;
                    this.zzabq = zzbu;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzabo.zza(this.zzabp, this.zzabq);
                }
            });
        }
        return 2;
    }

    @TargetApi(24)
    public final boolean onStartJob(final JobParameters jobParameters) {
        final zzcm zzbu = zzat.zzc(this.zzabm).zzbu();
        String string = jobParameters.getExtras().getString("action");
        zzbu.zza("Local AnalyticsJobService called. action", string);
        if ("com.google.android.gms.analytics.ANALYTICS_DISPATCH".equals(string)) {
            zzb(new Runnable(this, zzbu, jobParameters) { // from class: com.google.android.gms.internal.measurement.zzcw
                private final zzcu zzabo;
                private final zzcm zzabr;
                private final JobParameters zzabs;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.zzabo = this;
                    this.zzabr = zzbu;
                    this.zzabs = jobParameters;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.zzabo.zza(this.zzabr, this.zzabs);
                }
            });
            return true;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(int i, zzcm zzcmVar) {
        if (this.zzabm.callServiceStopSelfResult(i)) {
            zzcmVar.zzp("Local AnalyticsService processed last dispatch request");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void zza(zzcm zzcmVar, JobParameters jobParameters) {
        zzcmVar.zzp("AnalyticsJobService processed last dispatch request");
        this.zzabm.zza(jobParameters, false);
    }
}
