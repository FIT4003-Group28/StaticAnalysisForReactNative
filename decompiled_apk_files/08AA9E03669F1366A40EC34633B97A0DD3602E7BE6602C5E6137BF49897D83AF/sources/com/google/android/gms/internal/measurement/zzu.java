package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzu extends com.google.android.gms.analytics.zzi<zzu> {
    private String zztg;
    private String zzth;
    private String zzti;
    private String zztj;

    public final void setAppId(String str) {
        this.zzti = str;
    }

    public final void setAppInstallerId(String str) {
        this.zztj = str;
    }

    public final void setAppName(String str) {
        this.zztg = str;
    }

    public final void setAppVersion(String str) {
        this.zzth = str;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("appName", this.zztg);
        hashMap.put("appVersion", this.zzth);
        hashMap.put("appId", this.zzti);
        hashMap.put("appInstallerId", this.zztj);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    /* renamed from: zza */
    public final void zzb(zzu zzuVar) {
        if (!TextUtils.isEmpty(this.zztg)) {
            zzuVar.zztg = this.zztg;
        }
        if (!TextUtils.isEmpty(this.zzth)) {
            zzuVar.zzth = this.zzth;
        }
        if (!TextUtils.isEmpty(this.zzti)) {
            zzuVar.zzti = this.zzti;
        }
        if (!TextUtils.isEmpty(this.zztj)) {
            zzuVar.zztj = this.zztj;
        }
    }

    public final String zzaf() {
        return this.zztg;
    }

    public final String zzag() {
        return this.zzth;
    }

    public final String zzah() {
        return this.zzti;
    }

    public final String zzai() {
        return this.zztj;
    }
}
