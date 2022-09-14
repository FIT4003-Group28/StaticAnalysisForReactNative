package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zze extends zzbq {
    private static final String ID = com.google.android.gms.internal.measurement.zza.ADVERTISER_ID.toString();
    private final zza zzavk;

    public zze(Context context) {
        this(zza.zzh(context));
    }

    @VisibleForTesting
    private zze(zza zzaVar) {
        super(ID, new String[0]);
        this.zzavk = zzaVar;
        this.zzavk.zzly();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        String zzly = this.zzavk.zzly();
        return zzly == null ? zzgj.zzpj() : zzgj.zzj(zzly);
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return false;
    }
}
