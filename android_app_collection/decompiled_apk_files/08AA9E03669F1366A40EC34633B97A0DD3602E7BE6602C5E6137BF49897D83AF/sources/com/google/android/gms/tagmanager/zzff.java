package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwh;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzff implements zzfg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public zzff(zzfb zzfbVar) {
    }

    @Override // com.google.android.gms.tagmanager.zzfg
    public final void zza(zzwh zzwhVar, Set<zzwd> set, Set<zzwd> set2, zzeq zzeqVar) {
        set.addAll(zzwhVar.zzrf());
        set2.addAll(zzwhVar.zzrg());
        zzeqVar.zznx();
        zzeqVar.zzny();
    }
}
