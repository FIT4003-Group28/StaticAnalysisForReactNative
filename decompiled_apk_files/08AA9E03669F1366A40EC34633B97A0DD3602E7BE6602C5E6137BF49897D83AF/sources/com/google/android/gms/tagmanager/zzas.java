package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzas extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.CUSTOM_VAR.toString();
    private static final String NAME = com.google.android.gms.internal.measurement.zzb.NAME.toString();
    private static final String zzaxm = com.google.android.gms.internal.measurement.zzb.DEFAULT_VALUE.toString();
    private final DataLayer zzavu;

    public zzas(DataLayer dataLayer) {
        super(ID, NAME);
        this.zzavu = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        Object obj = this.zzavu.get(zzgj.zzc(map.get(NAME)));
        if (obj == null) {
            com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzaxm);
            return zzmVar != null ? zzmVar : zzgj.zzpj();
        }
        return zzgj.zzj(obj);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
