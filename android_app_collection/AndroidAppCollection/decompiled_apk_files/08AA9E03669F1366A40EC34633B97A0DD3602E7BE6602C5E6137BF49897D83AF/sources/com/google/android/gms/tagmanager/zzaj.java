package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
final class zzaj extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.CONTAINER_VERSION.toString();
    private final String version;

    public zzaj(String str) {
        super(ID, new String[0]);
        this.version = str;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return this.version == null ? zzgj.zzpj() : zzgj.zzj(this.version);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
