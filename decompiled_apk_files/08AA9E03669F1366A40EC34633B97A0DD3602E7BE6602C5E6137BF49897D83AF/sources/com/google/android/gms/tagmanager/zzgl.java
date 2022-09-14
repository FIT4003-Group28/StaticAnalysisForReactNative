package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzgl extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.UPPERCASE_STRING.toString();
    private static final String zzayh = com.google.android.gms.internal.measurement.zzb.ARG0.toString();

    public zzgl() {
        super(ID, zzayh);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj(zzgj.zzc(map.get(zzayh)).toUpperCase());
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
