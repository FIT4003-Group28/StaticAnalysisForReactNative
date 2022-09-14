package com.google.android.gms.tagmanager;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfo implements zzcc {
    private final /* synthetic */ zzfn zzbcn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfo(zzfn zzfnVar) {
        this.zzbcn = zzfnVar;
    }

    @Override // com.google.android.gms.tagmanager.zzcc
    public final void zzo(boolean z) {
        boolean z2;
        zzfn zzfnVar = this.zzbcn;
        z2 = this.zzbcn.connected;
        zzfnVar.zza(z, z2);
    }
}
