package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzbp extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.EVENT.toString();
    private final zzfb zzavv;

    public zzbp(zzfb zzfbVar) {
        super(ID, new String[0]);
        this.zzavv = zzfbVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzom = this.zzavv.zzom();
        return zzom == null ? zzgj.zzpj() : zzgj.zzj(zzom);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
