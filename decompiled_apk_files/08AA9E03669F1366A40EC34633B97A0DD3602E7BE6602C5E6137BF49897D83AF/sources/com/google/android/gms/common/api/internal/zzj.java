package com.google.android.gms.common.api.internal;

import android.support.v4.i.a;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.AvailabilityException;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public final class zzj {
    private int zzek;
    private final a<zzh<?>, String> zzei = new a<>();
    private final TaskCompletionSource<Map<zzh<?>, String>> zzej = new TaskCompletionSource<>();
    private boolean zzel = false;
    private final a<zzh<?>, ConnectionResult> zzcc = new a<>();

    public zzj(Iterable<? extends GoogleApi<?>> iterable) {
        for (GoogleApi<?> googleApi : iterable) {
            this.zzcc.put(googleApi.zzm(), null);
        }
        this.zzek = this.zzcc.keySet().size();
    }

    public final Task<Map<zzh<?>, String>> getTask() {
        return this.zzej.getTask();
    }

    public final void zza(zzh<?> zzhVar, ConnectionResult connectionResult, String str) {
        this.zzcc.put(zzhVar, connectionResult);
        this.zzei.put(zzhVar, str);
        this.zzek--;
        if (!connectionResult.isSuccess()) {
            this.zzel = true;
        }
        if (this.zzek == 0) {
            if (!this.zzel) {
                this.zzej.setResult(this.zzei);
                return;
            }
            this.zzej.setException(new AvailabilityException(this.zzcc));
        }
    }

    public final Set<zzh<?>> zzs() {
        return this.zzcc.keySet();
    }
}
