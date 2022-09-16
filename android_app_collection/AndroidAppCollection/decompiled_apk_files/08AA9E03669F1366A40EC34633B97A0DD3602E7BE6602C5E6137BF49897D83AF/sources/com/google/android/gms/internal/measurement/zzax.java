package com.google.android.gms.internal.measurement;

import android.content.ComponentName;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.stats.ConnectionTracker;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzax extends zzar {
    private final zzaz zzwl;
    private zzci zzwm;
    private final zzbw zzwn;
    private final zzcz zzwo;

    /* JADX INFO: Access modifiers changed from: protected */
    public zzax(zzat zzatVar) {
        super(zzatVar);
        this.zzwo = new zzcz(zzatVar.zzbt());
        this.zzwl = new zzaz(this);
        this.zzwn = new zzay(this, zzatVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onServiceDisconnected(ComponentName componentName) {
        com.google.android.gms.analytics.zzk.zzab();
        if (this.zzwm != null) {
            this.zzwm = null;
            zza("Disconnected from device AnalyticsService", componentName);
            zzby().zzbq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zza(zzci zzciVar) {
        com.google.android.gms.analytics.zzk.zzab();
        this.zzwm = zzciVar;
        zzcu();
        zzby().onServiceConnected();
    }

    private final void zzcu() {
        this.zzwo.start();
        this.zzwn.zzh(zzcc.zzzu.get().longValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void zzcv() {
        com.google.android.gms.analytics.zzk.zzab();
        if (!isConnected()) {
            return;
        }
        zzp("Inactivity, disconnecting from device AnalyticsService");
        disconnect();
    }

    public final boolean connect() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        if (this.zzwm != null) {
            return true;
        }
        zzci zzcw = this.zzwl.zzcw();
        if (zzcw == null) {
            return false;
        }
        this.zzwm = zzcw;
        zzcu();
        return true;
    }

    public final void disconnect() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        try {
            ConnectionTracker.getInstance().unbindService(getContext(), this.zzwl);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.zzwm != null) {
            this.zzwm = null;
            zzby().zzbq();
        }
    }

    public final boolean isConnected() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        return this.zzwm != null;
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
    }

    public final boolean zzb(zzch zzchVar) {
        Preconditions.checkNotNull(zzchVar);
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        zzci zzciVar = this.zzwm;
        if (zzciVar == null) {
            return false;
        }
        try {
            zzciVar.zza(zzchVar.zzcs(), zzchVar.zzen(), zzchVar.zzep() ? zzbu.zzdz() : zzbu.zzea(), Collections.emptyList());
            zzcu();
            return true;
        } catch (RemoteException unused) {
            zzp("Failed to send hits to AnalyticsService");
            return false;
        }
    }

    public final boolean zzct() {
        com.google.android.gms.analytics.zzk.zzab();
        zzch();
        zzci zzciVar = this.zzwm;
        if (zzciVar == null) {
            return false;
        }
        try {
            zzciVar.zzbn();
            zzcu();
            return true;
        } catch (RemoteException unused) {
            zzp("Failed to clear hits from AnalyticsService");
            return false;
        }
    }
}
