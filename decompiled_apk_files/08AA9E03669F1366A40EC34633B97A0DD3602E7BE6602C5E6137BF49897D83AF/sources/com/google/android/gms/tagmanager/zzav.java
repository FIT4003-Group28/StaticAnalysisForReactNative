package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.List;
/* loaded from: classes.dex */
final class zzav implements Runnable {
    private final /* synthetic */ zzat zzaxt;
    private final /* synthetic */ zzaq zzaxu;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzav(zzat zzatVar, zzaq zzaqVar) {
        this.zzaxt = zzatVar;
        this.zzaxu = zzaqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<DataLayer.zza> zznb;
        zzaq zzaqVar = this.zzaxu;
        zznb = this.zzaxt.zznb();
        zzaqVar.zzd(zznb);
    }
}
