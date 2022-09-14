package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzac extends com.google.android.gms.analytics.zzi<zzac> {
    public String zzub;
    public boolean zzuc;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("description", this.zzub);
        hashMap.put("fatal", Boolean.valueOf(this.zzuc));
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzac zzacVar) {
        zzac zzacVar2 = zzacVar;
        if (!TextUtils.isEmpty(this.zzub)) {
            zzacVar2.zzub = this.zzub;
        }
        if (this.zzuc) {
            zzacVar2.zzuc = this.zzuc;
        }
    }
}
