package com.google.android.gms.tagmanager;
/* loaded from: classes.dex */
final class zzfp implements Runnable {
    private final /* synthetic */ zzfn zzbcn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfp(zzfn zzfnVar) {
        this.zzbcn = zzfnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcb zzcbVar;
        zzcbVar = this.zzbcn.zzbcd;
        zzcbVar.dispatch();
    }
}
