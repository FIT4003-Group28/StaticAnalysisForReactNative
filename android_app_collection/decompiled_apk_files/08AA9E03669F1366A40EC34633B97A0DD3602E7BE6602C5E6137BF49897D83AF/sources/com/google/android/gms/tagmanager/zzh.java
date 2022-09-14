package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Map;
/* loaded from: classes.dex */
final class zzh extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.ADWORDS_CLICK_REFERRER.toString();
    private static final String zzavl = com.google.android.gms.internal.measurement.zzb.COMPONENT.toString();
    private static final String zzavm = com.google.android.gms.internal.measurement.zzb.CONVERSION_ID.toString();
    private final Context zzqx;

    public zzh(Context context) {
        super(ID, zzavm);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzavm);
        if (zzmVar == null) {
            return zzgj.zzpj();
        }
        String zzc = zzgj.zzc(zzmVar);
        com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzavl);
        String zzc2 = zzmVar2 != null ? zzgj.zzc(zzmVar2) : null;
        Context context = this.zzqx;
        String str = zzcw.zzayz.get(zzc);
        if (str == null) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("gtm_click_referrers", 0);
            str = sharedPreferences != null ? sharedPreferences.getString(zzc, "") : "";
            zzcw.zzayz.put(zzc, str);
        }
        String zzt = zzcw.zzt(str, zzc2);
        return zzt != null ? zzgj.zzj(zzt) : zzgj.zzpj();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
