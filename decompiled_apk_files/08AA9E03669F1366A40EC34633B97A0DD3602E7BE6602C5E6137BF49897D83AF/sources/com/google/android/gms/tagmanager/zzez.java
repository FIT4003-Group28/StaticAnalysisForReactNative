package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzvz;
/* loaded from: classes.dex */
final class zzez implements Runnable {
    private final /* synthetic */ zzex zzbbb;
    private final /* synthetic */ zzvz zzbbc;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzez(zzex zzexVar, zzvz zzvzVar) {
        this.zzbbb = zzexVar;
        this.zzbbc = zzvzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzbbb.zzb(this.zzbbc);
    }
}
