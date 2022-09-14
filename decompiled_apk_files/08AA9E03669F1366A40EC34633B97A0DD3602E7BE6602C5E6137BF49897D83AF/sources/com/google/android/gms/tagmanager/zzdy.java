package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
abstract class zzdy extends zzef {
    public zzdy(String str) {
        super(str);
    }

    @Override // com.google.android.gms.tagmanager.zzef
    protected final boolean zza(com.google.android.gms.internal.measurement.zzm zzmVar, com.google.android.gms.internal.measurement.zzm zzmVar2, Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        zzgi zzd = zzgj.zzd(zzmVar);
        zzgi zzd2 = zzgj.zzd(zzmVar2);
        if (zzd == zzgj.zzph() || zzd2 == zzgj.zzph()) {
            return false;
        }
        return zza(zzd, zzd2, map);
    }

    protected abstract boolean zza(zzgi zzgiVar, zzgi zzgiVar2, Map<String, com.google.android.gms.internal.measurement.zzm> map);
}
