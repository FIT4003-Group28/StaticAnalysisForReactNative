package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzee extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.PLATFORM.toString();
    private static final com.google.android.gms.internal.measurement.zzm zzbac = zzgj.zzj("Android");

    public zzee() {
        super(ID, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzbac;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
