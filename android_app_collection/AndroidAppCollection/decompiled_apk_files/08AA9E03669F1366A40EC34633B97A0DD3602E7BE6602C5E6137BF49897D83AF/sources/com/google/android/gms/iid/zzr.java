package com.google.android.gms.iid;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
/* loaded from: classes.dex */
public final class zzr {
    private final ScheduledExecutorService zzbz;
    private zzt zzca;
    private int zzcb;
    private final Context zzk;

    public zzr(Context context) {
        this(context, Executors.newSingleThreadScheduledExecutor());
    }

    private zzr(Context context, ScheduledExecutorService scheduledExecutorService) {
        this.zzca = new zzt(this);
        this.zzcb = 1;
        this.zzk = context.getApplicationContext();
        this.zzbz = scheduledExecutorService;
    }

    public static /* synthetic */ Context zzd(zzr zzrVar) {
        return zzrVar.zzk;
    }

    private final synchronized <T> Task<T> zzd(zzz<T> zzzVar) {
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            String valueOf = String.valueOf(zzzVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 9);
            sb.append("Queueing ");
            sb.append(valueOf);
            Log.d("MessengerIpcClient", sb.toString());
        }
        if (!this.zzca.zze(zzzVar)) {
            this.zzca = new zzt(this);
            this.zzca.zze(zzzVar);
        }
        return zzzVar.zzcl.getTask();
    }

    public static /* synthetic */ ScheduledExecutorService zze(zzr zzrVar) {
        return zzrVar.zzbz;
    }

    private final synchronized int zzq() {
        int i;
        i = this.zzcb;
        this.zzcb = i + 1;
        return i;
    }

    public final Task<Bundle> zzd(int i, Bundle bundle) {
        return zzd(new zzab(zzq(), 1, bundle));
    }
}
