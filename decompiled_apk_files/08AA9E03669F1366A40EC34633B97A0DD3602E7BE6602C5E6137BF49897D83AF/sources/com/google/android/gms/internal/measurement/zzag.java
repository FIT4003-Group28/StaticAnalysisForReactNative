package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import java.util.HashMap;
/* loaded from: classes.dex */
public final class zzag extends com.google.android.gms.analytics.zzi<zzag> {
    public String mCategory;
    public String zzuv;
    public long zzuw;
    public String zzux;

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("variableName", this.zzuv);
        hashMap.put("timeInMillis", Long.valueOf(this.zzuw));
        hashMap.put("category", this.mCategory);
        hashMap.put("label", this.zzux);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzag zzagVar) {
        zzag zzagVar2 = zzagVar;
        if (!TextUtils.isEmpty(this.zzuv)) {
            zzagVar2.zzuv = this.zzuv;
        }
        if (this.zzuw != 0) {
            zzagVar2.zzuw = this.zzuw;
        }
        if (!TextUtils.isEmpty(this.mCategory)) {
            zzagVar2.mCategory = this.mCategory;
        }
        if (!TextUtils.isEmpty(this.zzux)) {
            zzagVar2.zzux = this.zzux;
        }
    }
}
