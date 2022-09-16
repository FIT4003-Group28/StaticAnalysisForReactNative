package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@VisibleForTesting
/* loaded from: classes.dex */
public abstract class zzef extends zzbq {
    private static final String zzayh = com.google.android.gms.internal.measurement.zzb.ARG0.toString();
    private static final String zzbad = com.google.android.gms.internal.measurement.zzb.ARG1.toString();

    public zzef(String str) {
        super(str, zzayh, zzbad);
    }

    protected abstract boolean zza(com.google.android.gms.internal.measurement.zzm zzmVar, com.google.android.gms.internal.measurement.zzm zzmVar2, Map<String, com.google.android.gms.internal.measurement.zzm> map);

    @Override // com.google.android.gms.tagmanager.zzbq
    public final com.google.android.gms.internal.measurement.zzm zzd(Map<String, com.google.android.gms.internal.measurement.zzm> map) {
        boolean z;
        Iterator<com.google.android.gms.internal.measurement.zzm> it = map.values().iterator();
        while (true) {
            z = false;
            if (!it.hasNext()) {
                com.google.android.gms.internal.measurement.zzm zzmVar = map.get(zzayh);
                com.google.android.gms.internal.measurement.zzm zzmVar2 = map.get(zzbad);
                if (zzmVar != null && zzmVar2 != null) {
                    z = zza(zzmVar, zzmVar2, map);
                }
            } else if (it.next() == zzgj.zzpj()) {
                break;
            }
        }
        return zzgj.zzj(Boolean.valueOf(z));
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final boolean zzme() {
        return true;
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ String zznn() {
        return super.zznn();
    }

    @Override // com.google.android.gms.tagmanager.zzbq
    public final /* bridge */ /* synthetic */ Set zzno() {
        return super.zzno();
    }
}
