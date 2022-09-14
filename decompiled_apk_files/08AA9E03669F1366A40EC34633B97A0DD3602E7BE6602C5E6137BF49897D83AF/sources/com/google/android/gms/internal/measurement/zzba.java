package com.google.android.gms.internal.measurement;
/* loaded from: classes.dex */
final class zzba implements Runnable {
    private final /* synthetic */ zzci zzws;
    private final /* synthetic */ zzaz zzwt;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzba(zzaz zzazVar, zzci zzciVar) {
        this.zzwt = zzazVar;
        this.zzws = zzciVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (!this.zzwt.zzwp.isConnected()) {
            this.zzwt.zzwp.zzq("Connected to service after a timeout");
            this.zzwt.zzwp.zza(this.zzws);
        }
    }
}
