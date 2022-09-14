package com.google.android.gms.tagmanager;

import android.content.Context;
import java.util.Map;
/* loaded from: classes.dex */
final class zzi extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.APP_ID.toString();
    private final Context zzqx;

    public zzi(Context context) {
        super(ID, new String[0]);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj(this.zzqx.getPackageName());
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
