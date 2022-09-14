package com.google.android.gms.tagmanager;

import java.util.List;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzaz extends zzgh {
    private static final String ID = com.google.android.gms.internal.measurement.zza.DATA_LAYER_WRITE.toString();
    private static final String VALUE = com.google.android.gms.internal.measurement.zzb.VALUE.toString();
    private static final String zzaxx = com.google.android.gms.internal.measurement.zzb.CLEAR_PERSISTENT_DATA_LAYER_PREFIX.toString();
    private final DataLayer zzavu;

    public zzaz(DataLayer dataLayer) {
        super(ID, VALUE);
        this.zzavu = dataLayer;
    }

    @Override // com.google.android.gms.tagmanager.zzgh
    public final void zzf(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzc;
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(VALUE);
        if (zzmVar != null && zzmVar != zzgj.zzpd()) {
            Object zzh = zzgj.zzh(zzmVar);
            if (zzh instanceof List) {
                for (Object obj : (List) zzh) {
                    if (obj instanceof Map) {
                        this.zzavu.push((Map) obj);
                    }
                }
            }
        }
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzaxx);
        if (zzmVar2 == null || zzmVar2 == zzgj.zzpd() || (zzc = zzgj.zzc(zzmVar2)) == zzgj.zzpi()) {
            return;
        }
        this.zzavu.zzcr(zzc);
    }
}
