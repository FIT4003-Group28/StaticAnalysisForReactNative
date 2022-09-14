package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
abstract class zzfz extends zzef {
    public zzfz(String str) {
        super(str);
    }

    @Override // com.google.android.gms.tagmanager.zzef
    protected final boolean zza(com.google.android.gms.internal.measurement.zzm zzmVar, com.google.android.gms.internal.measurement.zzm zzmVar2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzc = zzgj.zzc(zzmVar);
        String zzc2 = zzgj.zzc(zzmVar2);
        if (zzc == zzgj.zzpi() || zzc2 == zzgj.zzpi()) {
            return false;
        }
        return zza(zzc, zzc2, map);
    }

    protected abstract boolean zza(String str, String str2, Map<String, com.google.android.gms.internal.measurement.zzm> map);
}
