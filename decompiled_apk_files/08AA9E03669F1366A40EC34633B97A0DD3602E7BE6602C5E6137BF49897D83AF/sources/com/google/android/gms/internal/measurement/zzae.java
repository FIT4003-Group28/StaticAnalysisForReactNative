package com.google.android.gms.internal.measurement;

import android.text.TextUtils;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzae extends com.google.android.gms.analytics.zzi<zzae> {
    private String zzul;
    private int zzum;
    private int zzun;
    private String zzuo;
    private String zzup;
    private boolean zzuq;
    private boolean zzur;

    public zzae() {
        this(false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzae(boolean r5) {
        /*
            r4 = this;
            java.util.UUID r5 = java.util.UUID.randomUUID()
            long r0 = r5.getLeastSignificantBits()
            r2 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r0 = r0 & r2
            int r0 = (int) r0
            if (r0 == 0) goto L10
            goto L23
        L10:
            long r0 = r5.getMostSignificantBits()
            long r0 = r0 & r2
            int r0 = (int) r0
            if (r0 == 0) goto L19
            goto L23
        L19:
            java.lang.String r5 = "GAv4"
            java.lang.String r0 = "UUID.randomUUID() returned 0."
            android.util.Log.e(r5, r0)
            r0 = 2147483647(0x7fffffff, float:NaN)
        L23:
            r5 = 0
            r4.<init>(r5, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzae.<init>(boolean):void");
    }

    @VisibleForTesting
    private zzae(boolean z, int i) {
        Preconditions.checkNotZero(i);
        this.zzum = i;
        this.zzur = false;
    }

    public final String toString() {
        HashMap hashMap = new HashMap();
        hashMap.put("screenName", this.zzul);
        hashMap.put("interstitial", Boolean.valueOf(this.zzuq));
        hashMap.put("automatic", Boolean.valueOf(this.zzur));
        hashMap.put("screenId", Integer.valueOf(this.zzum));
        hashMap.put("referrerScreenId", Integer.valueOf(this.zzun));
        hashMap.put("referrerScreenName", this.zzuo);
        hashMap.put("referrerUri", this.zzup);
        return zza((Object) hashMap);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzae zzaeVar) {
        zzae zzaeVar2 = zzaeVar;
        if (!TextUtils.isEmpty(this.zzul)) {
            zzaeVar2.zzul = this.zzul;
        }
        if (this.zzum != 0) {
            zzaeVar2.zzum = this.zzum;
        }
        if (this.zzun != 0) {
            zzaeVar2.zzun = this.zzun;
        }
        if (!TextUtils.isEmpty(this.zzuo)) {
            zzaeVar2.zzuo = this.zzuo;
        }
        if (!TextUtils.isEmpty(this.zzup)) {
            String str = this.zzup;
            if (TextUtils.isEmpty(str)) {
                str = null;
            }
            zzaeVar2.zzup = str;
        }
        if (this.zzuq) {
            zzaeVar2.zzuq = this.zzuq;
        }
        if (this.zzur) {
            zzaeVar2.zzur = this.zzur;
        }
    }

    public final String zzbg() {
        return this.zzul;
    }

    public final int zzbh() {
        return this.zzum;
    }

    public final String zzbi() {
        return this.zzup;
    }
}
