package com.google.android.gms.tagmanager;

import android.os.Build;
import java.util.Map;
/* loaded from: classes.dex */
final class zzfk extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.SDK_VERSION.toString();

    public zzfk() {
        super(ID, new String[0]);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }
}
