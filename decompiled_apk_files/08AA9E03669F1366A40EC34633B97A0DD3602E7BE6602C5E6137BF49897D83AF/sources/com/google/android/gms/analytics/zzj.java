package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzj;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
public class zzj<T extends zzj> {
    private final zzk zzry;
    protected final zzg zzrz;
    private final List<zzh> zzsa;

    /* JADX INFO: Access modifiers changed from: protected */
    @VisibleForTesting
    public zzj(zzk zzkVar, Clock clock) {
        Preconditions.checkNotNull(zzkVar);
        this.zzry = zzkVar;
        this.zzsa = new ArrayList();
        zzg zzgVar = new zzg(this, clock);
        zzgVar.zzx();
        this.zzrz = zzgVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void zza(zzg zzgVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void zzd(zzg zzgVar) {
        for (zzh zzhVar : this.zzsa) {
            zzhVar.zza(this, zzgVar);
        }
    }

    public zzg zzi() {
        zzg zzo = this.zzrz.zzo();
        zzd(zzo);
        return zzo;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final zzk zzy() {
        return this.zzry;
    }
}
