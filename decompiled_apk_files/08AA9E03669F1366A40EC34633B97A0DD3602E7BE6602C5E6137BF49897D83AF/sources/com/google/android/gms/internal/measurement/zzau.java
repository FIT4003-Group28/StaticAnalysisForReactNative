package com.google.android.gms.internal.measurement;

import java.lang.Thread;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzau implements Thread.UncaughtExceptionHandler {
    private final /* synthetic */ zzat zzwe;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzau(zzat zzatVar) {
        this.zzwe = zzatVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(Thread thread, Throwable th) {
        zzcm zzcj = this.zzwe.zzcj();
        if (zzcj != null) {
            zzcj.zze("Job execution failed", th);
        }
    }
}
