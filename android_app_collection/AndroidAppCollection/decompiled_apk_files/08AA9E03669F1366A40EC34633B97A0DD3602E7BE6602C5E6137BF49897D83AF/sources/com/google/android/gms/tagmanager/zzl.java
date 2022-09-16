package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Map;
/* loaded from: classes.dex */
final class zzl extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.APP_VERSION_NAME.toString();
    private final Context zzqx;

    public zzl(Context context) {
        super(ID, new String[0]);
        this.zzqx = context;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        try {
            return zzgj.zzj(this.zzqx.getPackageManager().getPackageInfo(this.zzqx.getPackageName(), 0).versionName);
        } catch (PackageManager.NameNotFoundException e) {
            String packageName = this.zzqx.getPackageName();
            String message = e.getMessage();
            StringBuilder sb = new StringBuilder(String.valueOf(packageName).length() + 25 + String.valueOf(message).length());
            sb.append("Package name ");
            sb.append(packageName);
            sb.append(" not found. ");
            sb.append(message);
            zzdi.e(sb.toString());
            return zzgj.zzpj();
        }
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
