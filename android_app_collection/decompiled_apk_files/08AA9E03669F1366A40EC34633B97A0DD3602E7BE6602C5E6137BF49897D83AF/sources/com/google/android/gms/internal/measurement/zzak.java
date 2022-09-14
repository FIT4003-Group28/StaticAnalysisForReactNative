package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class zzak implements Runnable {
    private final /* synthetic */ zzai zzvh;
    private final /* synthetic */ boolean zzvi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzak(zzai zzaiVar, boolean z) {
        this.zzvh = zzaiVar;
        this.zzvi = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzdi();
    }
}
