package com.google.android.gms.tagmanager;
/* loaded from: classes.dex */
final class zzaf implements zzw {
    private final /* synthetic */ zzy zzaww;

    private zzaf(zzy zzyVar) {
        this.zzaww = zzyVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ zzaf(zzy zzyVar, zzz zzzVar) {
        this(zzyVar);
    }

    @Override // com.google.android.gms.tagmanager.zzw
    public final void zzcp(String str) {
        this.zzaww.zzcp(str);
    }

    @Override // com.google.android.gms.tagmanager.zzw
    public final String zzmk() {
        return this.zzaww.zzmk();
    }

    @Override // com.google.android.gms.tagmanager.zzw
    public final void zzmm() {
        if (zzy.zza(this.zzaww).zzes()) {
            zzy.zza(this.zzaww, 0L);
        }
    }
}
