package com.google.android.gms.internal.measurement;

import android.os.Handler;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzcx implements zzca {
    private final /* synthetic */ Runnable zzabt;
    private final /* synthetic */ zzcu zzabu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzcx(zzcu zzcuVar, Runnable runnable) {
        this.zzabu = zzcuVar;
        this.zzabt = runnable;
    }

    @Override // com.google.android.gms.internal.measurement.zzca
    public final void zza(Throwable th) {
        Handler handler;
        handler = this.zzabu.handler;
        handler.post(this.zzabt);
    }
}
