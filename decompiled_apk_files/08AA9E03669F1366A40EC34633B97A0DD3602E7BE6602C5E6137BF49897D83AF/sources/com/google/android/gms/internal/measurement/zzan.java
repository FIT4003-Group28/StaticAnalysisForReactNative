package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzan implements Runnable {
    private final /* synthetic */ zzai zzvh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzan(zzai zzaiVar) {
        this.zzvh = zzaiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzbn();
    }
}
