package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzam implements Runnable {
    private final /* synthetic */ zzai zzvh;
    private final /* synthetic */ zzch zzvl;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzam(zzai zzaiVar, zzch zzchVar) {
        this.zzvh = zzaiVar;
        this.zzvl = zzchVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zza(this.zzvl);
    }
}
