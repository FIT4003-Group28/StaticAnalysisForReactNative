package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbe extends zzar {
    private final zzu zzsf;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzbe(zzat zzatVar) {
        super(zzatVar);
        this.zzsf = new zzu();
    }

    @Override // com.google.android.gms.internal.measurement.zzar
    protected final void zzac() {
        zzbw().zzz().zzb(this.zzsf);
        zzde zzca = zzca();
        String zzaf = zzca.zzaf();
        if (zzaf != null) {
            this.zzsf.setAppName(zzaf);
        }
        String zzag = zzca.zzag();
        if (zzag != null) {
            this.zzsf.setAppVersion(zzag);
        }
    }

    public final zzu zzdb() {
        zzch();
        return this.zzsf;
    }
}
