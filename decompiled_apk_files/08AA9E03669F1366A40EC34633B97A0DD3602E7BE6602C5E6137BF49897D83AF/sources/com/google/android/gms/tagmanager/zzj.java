package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
/* loaded from: classes.dex */
final class zzj extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.APP_NAME.toString();
    private final Context zzqx;

    public zzj(Context context) {
        super(ID, new String[0]);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        try {
            PackageManager packageManager = this.zzqx.getPackageManager();
            return zzgj.zzj(packageManager.getApplicationLabel(packageManager.getApplicationInfo(this.zzqx.getPackageName(), 0)).toString());
        } catch (PackageManager.NameNotFoundException e) {
            zzdi.zza("App name is not found.", e);
            return zzgj.zzpj();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
