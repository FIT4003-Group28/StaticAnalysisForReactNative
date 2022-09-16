package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbm implements Callable<String> {
    private final /* synthetic */ zzbl zzxt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbm(zzbl zzblVar) {
        this.zzxt = zzblVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ String call() {
        return this.zzxt.zzdp();
    }
}
