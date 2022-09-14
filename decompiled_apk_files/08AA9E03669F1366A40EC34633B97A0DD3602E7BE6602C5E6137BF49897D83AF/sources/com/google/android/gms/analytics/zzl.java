package com.google.android.gms.analytics;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzl implements Runnable {
    private final /* synthetic */ zzg zzsh;
    private final /* synthetic */ zzk zzsi;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzl(zzk zzkVar, zzg zzgVar) {
        this.zzsi = zzkVar;
        this.zzsh = zzgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List<zzn> list;
        this.zzsh.zzv().zza(this.zzsh);
        list = this.zzsi.zzsc;
        for (zzn zznVar : list) {
            zznVar.zza(this.zzsh);
        }
        zzk zzkVar = this.zzsi;
        zzk.zzb(this.zzsh);
    }
}
