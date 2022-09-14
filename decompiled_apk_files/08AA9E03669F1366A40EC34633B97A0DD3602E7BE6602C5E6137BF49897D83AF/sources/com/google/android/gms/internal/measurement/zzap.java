package com.google.android.gms.internal.measurement;

import java.util.concurrent.Callable;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzap implements Callable<Void> {
    private final /* synthetic */ zzai zzvh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzap(zzai zzaiVar) {
        this.zzvh = zzaiVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Void call() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzdh();
        return null;
    }
}
