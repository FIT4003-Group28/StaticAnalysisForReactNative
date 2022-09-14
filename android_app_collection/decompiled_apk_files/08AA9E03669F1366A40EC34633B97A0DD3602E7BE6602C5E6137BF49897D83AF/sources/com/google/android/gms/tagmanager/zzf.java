package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzf extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.ADVERTISING_TRACKING_ENABLED.toString();
    private final zza zzavk;

    public zzf(Context context) {
        this(zza.zzh(context));
    }

    @VisibleForTesting
    private zzf(zza zzaVar) {
        super(ID, new String[0]);
        this.zzavk = zzaVar;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        return zzgj.zzj(Boolean.valueOf(!this.zzavk.isLimitAdTrackingEnabled()));
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
