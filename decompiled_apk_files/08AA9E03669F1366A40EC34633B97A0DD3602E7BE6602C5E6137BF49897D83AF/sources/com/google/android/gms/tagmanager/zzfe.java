package com.google.android.gms.tagmanager;

import com.google.android.gms.internal.measurement.zzwd;
import com.google.android.gms.internal.measurement.zzwh;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzfe implements zzfg {
    private final /* synthetic */ Map zzbbp;
    private final /* synthetic */ Map zzbbq;
    private final /* synthetic */ Map zzbbr;
    private final /* synthetic */ Map zzbbs;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzfe(zzfb zzfbVar, Map map, Map map2, Map map3, Map map4) {
        this.zzbbp = map;
        this.zzbbq = map2;
        this.zzbbr = map3;
        this.zzbbs = map4;
    }

    @Override // com.google.android.gms.tagmanager.zzfg
    public final void zza(zzwh zzwhVar, Set<zzwd> set, Set<zzwd> set2, zzeq zzeqVar) {
        List list = (List) this.zzbbp.get(zzwhVar);
        this.zzbbq.get(zzwhVar);
        if (list != null) {
            set.addAll(list);
            zzeqVar.zznv();
        }
        List list2 = (List) this.zzbbr.get(zzwhVar);
        this.zzbbs.get(zzwhVar);
        if (list2 != null) {
            set2.addAll(list2);
            zzeqVar.zznw();
        }
    }
}
