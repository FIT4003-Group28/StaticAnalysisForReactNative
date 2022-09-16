package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzbu extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.GTM_VERSION.toString();

    public zzbu() {
        super(ID, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj("4.00");
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
