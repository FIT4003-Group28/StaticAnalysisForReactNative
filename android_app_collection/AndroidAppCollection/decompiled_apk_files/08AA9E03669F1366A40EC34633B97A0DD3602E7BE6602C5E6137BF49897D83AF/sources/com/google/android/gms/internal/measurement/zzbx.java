package com.google.android.gms.internal.measurement;

import android.os.Looper;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbx implements Runnable {
    private final /* synthetic */ zzbw zzyf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbx(zzbw zzbwVar) {
        this.zzyf = zzbwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzat zzatVar;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            zzatVar = this.zzyf.zzvn;
            zzatVar.zzbw().zza(this);
            return;
        }
        boolean zzef = this.zzyf.zzef();
        this.zzyf.zzye = 0L;
        if (!zzef) {
            return;
        }
        this.zzyf.run();
    }
}
