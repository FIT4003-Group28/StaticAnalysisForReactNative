package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings;
import java.util.Map;
/* loaded from: classes.dex */
final class zzbc extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.DEVICE_ID.toString();
    private final Context zzqx;

    public zzbc(Context context) {
        super(ID, new String[0]);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String string = Settings.Secure.getString(this.zzqx.getContentResolver(), "android_id");
        return string == null ? zzgj.zzpj() : zzgj.zzj(string);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
