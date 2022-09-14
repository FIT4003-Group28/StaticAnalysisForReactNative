package com.google.android.gms.tagmanager;

import java.util.Map;
/* loaded from: classes.dex */
abstract class zzgh extends zzbq {
    public zzgh(String str, String... strArr) {
        super(str, strArr);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        zzf(map);
        return zzgj.zzpj();
    }

    public abstract void zzf(Map<String, com.google.android.gms.internal.measurement.zzm> map);

    @Override // com.google.android.gms.tagmanager.zzbq
    public boolean zzme() {
        return false;
    }
}
