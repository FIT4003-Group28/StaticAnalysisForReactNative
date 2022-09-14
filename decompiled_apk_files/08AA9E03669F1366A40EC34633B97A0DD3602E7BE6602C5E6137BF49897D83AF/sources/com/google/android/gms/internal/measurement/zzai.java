package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* loaded from: classes.dex */
public final class zzai extends zzar {
    private final zzbf zzvf;

    public zzai(zzat zzatVar, zzav zzavVar) {
        super(zzatVar);
        Preconditions.checkNotNull(zzavVar);
        this.zzvf = new zzbf(zzatVar, zzavVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void onServiceConnected() {
        com.google.android.gms.analytics.zzk.zzab();
        this.zzvf.onServiceConnected();
    }

    public final void setLocalDispatchPeriod(int i) {
        zzch();
        zzb("setLocalDispatchPeriod (sec)", Integer.valueOf(i));
        zzbw().zza(new zzaj(this, i));
    }

    public final void start() {
        this.zzvf.start();
    }

    public final long zza(zzaw zzawVar) {
        zzch();
        Preconditions.checkNotNull(zzawVar);
        com.google.android.gms.analytics.zzk.zzab();
        long zza = this.zzvf.zza(zzawVar, true);
        if (zza == 0) {
            this.zzvf.zzb(zzawVar);
        }
        return zza;
    }

    public final void zza(zzca zzcaVar) {
        zzch();
        zzbw().zza(new zzao(this, zzcaVar));
    }

    public final void zza(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        zzch();
        zzb("Hit delivery requested", zzchVar);
        zzbw().zza(new zzam(this, zzchVar));
    }

    public final void zza(String str, Runnable runnable) {
        Preconditions.checkNotEmpty(str, "campaign param can't be empty");
        zzbw().zza(new zzal(this, str, runnable));
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        this.zzvf.zzm();
    }

    public final void zzbn() {
        zzch();
        zzbw().zza(new zzan(this));
    }

    public final void zzbo() {
        zzch();
        Context context = getContext();
        if (!zzct.zza(context) || !zzcu.zze(context)) {
            zza((zzca) null);
            return;
        }
        Intent intent = new Intent("com.google.android.gms.analytics.ANALYTICS_DISPATCH");
        intent.setComponent(new ComponentName(context, "com.google.android.gms.analytics.AnalyticsService"));
        context.startService(intent);
    }

    public final boolean zzbp() {
        zzch();
        try {
            zzbw().zza(new zzap(this)).get(4L, TimeUnit.SECONDS);
            return true;
        } catch (InterruptedException e) {
            zzd("syncDispatchLocalHits interrupted", e);
            return false;
        } catch (ExecutionException e2) {
            zze("syncDispatchLocalHits failed", e2);
            return false;
        } catch (TimeoutException e3) {
            zzd("syncDispatchLocalHits timed out", e3);
            return false;
        }
    }

    public final void zzbq() {
        zzch();
        com.google.android.gms.analytics.zzk.zzab();
        zzbf zzbfVar = this.zzvf;
        com.google.android.gms.analytics.zzk.zzab();
        zzbfVar.zzch();
        zzbfVar.zzp("Service disconnected");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void zzbr() {
        com.google.android.gms.analytics.zzk.zzab();
        this.zzvf.zzbr();
    }
}
