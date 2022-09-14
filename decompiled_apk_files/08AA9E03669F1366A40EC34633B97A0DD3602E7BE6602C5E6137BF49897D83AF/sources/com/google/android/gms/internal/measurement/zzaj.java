package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaj implements Runnable {
    private final /* synthetic */ int zzvg;
    private final /* synthetic */ zzai zzvh;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaj(zzai zzaiVar, int i) {
        this.zzvh = zzaiVar;
        this.zzvg = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzg(this.zzvg * 1000);
    }
}
