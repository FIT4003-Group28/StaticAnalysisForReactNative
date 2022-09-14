package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzz extends com.google.android.gms.analytics.zzi<zzz> {
    private String zztu;
    public int zztv;
    public int zztw;
    public int zztx;
    public int zzty;
    public int zztz;

    public final String getLanguage() {
        return this.zztu;
    }

    public final void setLanguage(String str) {
        this.zztu = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("language", this.zztu);
        hashMap.put("screenColors", Integer.valueOf(this.zztv));
        hashMap.put("screenWidth", Integer.valueOf(this.zztw));
        hashMap.put("screenHeight", Integer.valueOf(this.zztx));
        hashMap.put("viewportWidth", Integer.valueOf(this.zzty));
        hashMap.put("viewportHeight", Integer.valueOf(this.zztz));
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzz zzzVar) {
        zzz zzzVar2 = zzzVar;
        if (this.zztv != 0) {
            zzzVar2.zztv = this.zztv;
        }
        if (this.zztw != 0) {
            zzzVar2.zztw = this.zztw;
        }
        if (this.zztx != 0) {
            zzzVar2.zztx = this.zztx;
        }
        if (this.zzty != 0) {
            zzzVar2.zzty = this.zzty;
        }
        if (this.zztz != 0) {
            zzzVar2.zztz = this.zztz;
        }
        if (!TextUtils.isEmpty(this.zztu)) {
            zzzVar2.zztu = this.zztu;
        }
    }
}
