package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzfn extends zzfm {
    private static final Object zzbcb = new Object();
    private static zzfn zzbcm;
    private Context zzbcc;
    private zzcb zzbcd;
    private volatile zzby zzbce;
    private zzfq zzbcj;
    private zzdn zzbck;
    private int zzbcf = 1800000;
    private boolean zzbcg = true;
    private boolean zzbch = false;
    private boolean connected = true;
    private boolean zzbci = true;
    private zzcc zzazv = new zzfo(this);
    private boolean zzbcl = false;

    private zzfn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPowerSaveMode() {
        return this.zzbcl || !this.connected || this.zzbcf <= 0;
    }

    public static zzfn zzox() {
        if (zzbcm == null) {
            zzbcm = new zzfn();
        }
        return zzbcm;
    }

    @Override // com.google.android.gms.tagmanager.zzfm
    public final synchronized void dispatch() {
        if (this.zzbch) {
            this.zzbce.zzh(new zzfp(this));
            return;
        }
        zzdi.v("Dispatch call queued. Dispatch will run once initialization is complete.");
        this.zzbcg = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void zza(Context context, zzby zzbyVar) {
        if (this.zzbcc != null) {
            return;
        }
        this.zzbcc = context.getApplicationContext();
        if (this.zzbce == null) {
            this.zzbce = zzbyVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    public final synchronized void zza(boolean z, boolean z2) {
        boolean isPowerSaveMode = isPowerSaveMode();
        this.zzbcl = z;
        this.connected = z2;
        if (isPowerSaveMode() == isPowerSaveMode) {
            return;
        }
        if (isPowerSaveMode()) {
            this.zzbcj.cancel();
            zzdi.v("PowerSaveMode initiated.");
            return;
        }
        this.zzbcj.zzh(this.zzbcf);
        zzdi.v("PowerSaveMode terminated.");
    }

    @Override // com.google.android.gms.tagmanager.zzfm
    public final synchronized void zzow() {
        if (!isPowerSaveMode()) {
            this.zzbcj.zzpa();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized zzcb zzoy() {
        if (this.zzbcd == null) {
            if (this.zzbcc == null) {
                throw new IllegalStateException("Cant get a store unless we have a context");
            }
            this.zzbcd = new zzeb(this.zzazv, this.zzbcc);
        }
        if (this.zzbcj == null) {
            this.zzbcj = new zzfr(this, null);
            if (this.zzbcf > 0) {
                this.zzbcj.zzh(this.zzbcf);
            }
        }
        this.zzbch = true;
        if (this.zzbcg) {
            dispatch();
            this.zzbcg = false;
        }
        if (this.zzbck == null && this.zzbci) {
            this.zzbck = new zzdn(this);
            zzdn zzdnVar = this.zzbck;
            Context context = this.zzbcc;
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
            context.registerReceiver(zzdnVar, intentFilter);
            IntentFilter intentFilter2 = new IntentFilter();
            intentFilter2.addAction("com.google.analytics.RADIO_POWERED");
            intentFilter2.addCategory(context.getPackageName());
            context.registerReceiver(zzdnVar, intentFilter2);
        }
        return this.zzbcd;
    }

    @Override // com.google.android.gms.tagmanager.zzfm
    public final synchronized void zzp(boolean z) {
        zza(this.zzbcl, z);
    }
}
