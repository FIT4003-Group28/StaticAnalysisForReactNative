package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzec implements zzfw {
    private final /* synthetic */ zzeb zzazz;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzec(zzeb zzebVar) {
        this.zzazz = zzebVar;
    }

    @Override // com.google.android.gms.tagmanager.zzfw
    public final void zza(zzbw zzbwVar) {
        this.zzazz.zze(zzbwVar.zznp());
    }

    @Override // com.google.android.gms.tagmanager.zzfw
    public final void zzb(zzbw zzbwVar) {
        this.zzazz.zze(zzbwVar.zznp());
        long zznp = zzbwVar.zznp();
        StringBuilder sb = new StringBuilder(57);
        sb.append("Permanent failure dispatching hitId: ");
        sb.append(zznp);
        zzdi.v(sb.toString());
    }

    @Override // com.google.android.gms.tagmanager.zzfw
    public final void zzc(zzbw zzbwVar) {
        Clock clock;
        Clock clock2;
        long zznq = zzbwVar.zznq();
        if (zznq == 0) {
            zzeb zzebVar = this.zzazz;
            long zznp = zzbwVar.zznp();
            clock2 = this.zzazz.zzro;
            zzebVar.zzc(zznp, clock2.currentTimeMillis());
            return;
        }
        clock = this.zzazz.zzro;
        if (zznq + 14400000 >= clock.currentTimeMillis()) {
            return;
        }
        this.zzazz.zze(zzbwVar.zznp());
        long zznp2 = zzbwVar.zznp();
        StringBuilder sb = new StringBuilder(47);
        sb.append("Giving up on failed hitId: ");
        sb.append(zznp2);
        zzdi.v(sb.toString());
    }
}
