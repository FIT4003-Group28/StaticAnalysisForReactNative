package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzal implements Runnable {
    private final /* synthetic */ zzai zzvh;
    private final /* synthetic */ String zzvj;
    private final /* synthetic */ Runnable zzvk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzal(zzai zzaiVar, String str, Runnable runnable) {
        this.zzvh = zzaiVar;
        this.zzvj = str;
        this.zzvk = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbf zzbfVar;
        zzbfVar = this.zzvh.zzvf;
        zzbfVar.zzx(this.zzvj);
        if (this.zzvk != null) {
            this.zzvk.run();
        }
    }
}
