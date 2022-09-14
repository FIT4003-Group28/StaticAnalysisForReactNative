package com.google.android.gms.tagmanager;
/* loaded from: classes.dex */
final class zzaw implements Runnable {
    private final /* synthetic */ zzat zzaxt;
    private final /* synthetic */ String zzaxv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzaw(zzat zzatVar, String str) {
        this.zzaxt = zzatVar;
        this.zzaxv = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzaxt.zzcu(this.zzaxv);
    }
}
