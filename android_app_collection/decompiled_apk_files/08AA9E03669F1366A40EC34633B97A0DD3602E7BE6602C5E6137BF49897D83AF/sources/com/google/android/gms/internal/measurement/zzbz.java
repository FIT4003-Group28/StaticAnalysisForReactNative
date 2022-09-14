package com.google.android.gms.internal.measurement;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.PersistableBundle;
import com.google.android.gms.common.internal.Preconditions;
/* loaded from: classes.dex */
public final class zzbz extends zzar {
    private boolean zzyg;
    private boolean zzyh;
    private final AlarmManager zzyi;
    private Integer zzyj;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzbz(zzat zzatVar) {
        super(zzatVar);
        this.zzyi = (AlarmManager) getContext().getSystemService("alarm");
    }

    private final int getJobId() {
        if (this.zzyj == null) {
            String valueOf = String.valueOf(getContext().getPackageName());
            this.zzyj = Integer.valueOf((valueOf.length() != 0 ? "analytics".concat(valueOf) : new String("analytics")).hashCode());
        }
        return this.zzyj.intValue();
    }

    private final PendingIntent zzek() {
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"));
        return PendingIntent.getBroadcast(getContext(), 0, intent, 0);
    }

    public final void cancel() {
        this.zzyh = false;
        this.zzyi.cancel(zzek());
        if (Build.VERSION.SDK_INT >= 24) {
            zza("Cancelling job. JobID", Integer.valueOf(getJobId()));
            ((JobScheduler) getContext().getSystemService("jobscheduler")).cancel(getJobId());
        }
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        ActivityInfo receiverInfo;
        try {
            cancel();
            if (zzbu.zzdw() <= 0 || (receiverInfo = getContext().getPackageManager().getReceiverInfo(new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsReceiver"), 2)) == null || !receiverInfo.enabled) {
                return;
            }
            zzp("Receiver registered for local dispatch.");
            this.zzyg = true;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final boolean zzef() {
        return this.zzyh;
    }

    public final boolean zzei() {
        return this.zzyg;
    }

    public final void zzej() {
        zzch();
        Preconditions.checkState(this.zzyg, "Receiver not registered");
        long zzdw = zzbu.zzdw();
        if (zzdw > 0) {
            cancel();
            long elapsedRealtime = zzbt().elapsedRealtime() + zzdw;
            this.zzyh = true;
            if (Build.VERSION.SDK_INT < 24) {
                zzp("Scheduling upload with AlarmManager");
                this.zzyi.setInexactRepeating(2, elapsedRealtime, zzdw, zzek());
                return;
            }
            zzp("Scheduling upload with JobScheduler");
            JobInfo.Builder builder = new JobInfo.Builder(getJobId(), new ComponentName(getContext(), "com.google.android.gms.analytics.AnalyticsJobService"));
            builder.setMinimumLatency(zzdw);
            builder.setOverrideDeadline(zzdw << 1);
            PersistableBundle persistableBundle = new PersistableBundle();
            persistableBundle.putString("action", "com.google.android.gms.analytics.ANALYTICS_DISPATCH");
            builder.setExtras(persistableBundle);
            JobInfo build = builder.build();
            zza("Scheduling job. JobID", Integer.valueOf(getJobId()));
            ((JobScheduler) getContext().getSystemService("jobscheduler")).schedule(build);
        }
    }
}
