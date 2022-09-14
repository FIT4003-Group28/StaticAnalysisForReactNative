package com.google.android.gms.tagmanager;

import android.content.Context;
/* loaded from: classes.dex */
final class zzca implements Runnable {
    private final /* synthetic */ zzby zzayu;
    private final /* synthetic */ long zzayv;
    private final /* synthetic */ String zzayw;
    private final /* synthetic */ zzbz zzayx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzca(zzbz zzbzVar, zzby zzbyVar, long j, String str) {
        this.zzayx = zzbzVar;
        this.zzayu = zzbyVar;
        this.zzayv = j;
        this.zzayw = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcb zzcbVar;
        zzcb zzcbVar2;
        Context context;
        zzcbVar = this.zzayx.zzayt;
        if (zzcbVar == null) {
            zzfn zzox = zzfn.zzox();
            context = this.zzayx.zzqx;
            zzox.zza(context, this.zzayu);
            this.zzayx.zzayt = zzox.zzoy();
        }
        zzcbVar2 = this.zzayx.zzayt;
        zzcbVar2.zzb(this.zzayv, this.zzayw);
    }
}
