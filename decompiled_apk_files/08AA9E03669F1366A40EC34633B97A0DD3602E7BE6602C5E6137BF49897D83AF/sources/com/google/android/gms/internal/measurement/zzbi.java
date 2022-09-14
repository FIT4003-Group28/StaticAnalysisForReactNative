package com.google.android.gms.internal.measurement;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzbi implements Runnable {
    private final /* synthetic */ zzbf zzxk;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbi(zzbf zzbfVar) {
        this.zzxk = zzbfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzxk.zzdc();
    }
}
