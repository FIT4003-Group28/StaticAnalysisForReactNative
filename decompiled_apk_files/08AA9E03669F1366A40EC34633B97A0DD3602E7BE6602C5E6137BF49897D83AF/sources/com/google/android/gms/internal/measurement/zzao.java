package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzao implements Runnable {
    private final /* synthetic */ zzai zzvh;
    private final /* synthetic */ zzca zzvm;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzao(zzai zzaiVar, zzca zzcaVar) {
        this.zzvh = zzaiVar;
        this.zzvm = zzcaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzb(this.zzvm);
    }
}
