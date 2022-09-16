package com.google.android.gms.internal.measurement;

import java.util.Collections;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzwd {
    private final zzm zzbbu;
    private final Map<String, zzm> zzbld;

    private zzwd(Map<String, zzm> map, zzm zzmVar) {
        this.zzbld = map;
        this.zzbbu = zzmVar;
    }

    public static zzwe zzrs() {
        return new zzwe();
    }

    public final String toString() {
        String valueOf = String.valueOf(Collections.unmodifiableMap(this.zzbld));
        String valueOf2 = String.valueOf(this.zzbbu);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32 + String.valueOf(valueOf2).length());
        sb.append("Properties: ");
        sb.append(valueOf);
        sb.append(" pushAfterEvaluate: ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final void zza(String str, zzm zzmVar) {
        this.zzbld.put(str, zzmVar);
    }

    public final zzm zzop() {
        return this.zzbbu;
    }

    public final Map<String, zzm> zzrb() {
        return Collections.unmodifiableMap(this.zzbld);
    }
}
