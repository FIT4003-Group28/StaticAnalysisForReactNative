package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
final class zzcv extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.INSTALL_REFERRER.toString();
    private static final String zzavl = com.google.android.gms.internal.measurement.zzb.COMPONENT.toString();
    private final Context zzqx;

    public zzcv(Context context) {
        super(ID, new String[0]);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzg = zzcw.zzg(this.zzqx, map.get(zzavl) != null ? zzgj.zzc(map.get(zzavl)) : null);
        return zzg != null ? zzgj.zzj(zzg) : zzgj.zzpj();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
