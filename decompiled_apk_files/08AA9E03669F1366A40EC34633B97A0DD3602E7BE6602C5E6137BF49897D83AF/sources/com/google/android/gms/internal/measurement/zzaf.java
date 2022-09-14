package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzaf extends com.google.android.gms.analytics.zzi<zzaf> {
    public String zzus;
    public String zzut;
    public String zzuu;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("network", this.zzus);
        hashMap.put("action", this.zzut);
        hashMap.put("target", this.zzuu);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzaf zzafVar) {
        zzaf zzafVar2 = zzafVar;
        if (!TextUtils.isEmpty(this.zzus)) {
            zzafVar2.zzus = this.zzus;
        }
        if (!TextUtils.isEmpty(this.zzut)) {
            zzafVar2.zzut = this.zzut;
        }
        if (!TextUtils.isEmpty(this.zzuu)) {
            zzafVar2.zzuu = this.zzuu;
        }
    }
}
