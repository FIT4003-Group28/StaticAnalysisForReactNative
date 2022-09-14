package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
final class zzge extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.TIME.toString();

    public zzge() {
        super(ID, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj(Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
