package com.google.android.gms.tagmanager;

import com.google.android.gms.tagmanager.DataLayer;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzga implements DataLayer.zzb {
    private final /* synthetic */ TagManager zzbcv;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzga(TagManager tagManager) {
        this.zzbcv = tagManager;
    }

    @Override // com.google.android.gms.tagmanager.DataLayer.zzb
    public final void zze(Map<String, Object> map) {
        Object obj = map.get(DataLayer.EVENT_KEY);
        if (obj != null) {
            this.zzbcv.zzdl(obj.toString());
        }
    }
}
