package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzwe {
    private zzm zzbbu;
    private final Map<String, zzm> zzbld;

    private zzwe() {
        this.zzbld = new HashMap();
    }

    public final zzwe zzb(String str, zzm zzmVar) {
        this.zzbld.put(str, zzmVar);
        return this;
    }

    public final zzwe zzm(zzm zzmVar) {
        this.zzbbu = zzmVar;
        return this;
    }

    public final zzwd zzrt() {
        return new zzwd(this.zzbld, this.zzbbu);
    }
}
