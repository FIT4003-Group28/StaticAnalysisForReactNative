package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.util.VisibleForTesting;
import java.util.Collections;
import java.util.List;
import java.util.Map;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzwf {
    private final String version;
    private final List<zzwh> zzblb;
    private final Map<String, List<zzwd>> zzblc;
    private final int zzow;

    private zzwf(List<zzwh> list, Map<String, List<zzwd>> map, String str, int i) {
        this.zzblb = Collections.unmodifiableList(list);
        this.zzblc = Collections.unmodifiableMap(map);
        this.version = str;
        this.zzow = i;
    }

    public static zzwg zzru() {
        return new zzwg();
    }

    public final String getVersion() {
        return this.version;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzblb);
        String valueOf2 = String.valueOf(this.zzblc);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 17 + String.valueOf(valueOf2).length());
        sb.append("Rules: ");
        sb.append(valueOf);
        sb.append("  Macros: ");
        sb.append(valueOf2);
        return sb.toString();
    }

    public final List<zzwh> zzqz() {
        return this.zzblb;
    }

    public final Map<String, List<zzwd>> zzrv() {
        return this.zzblc;
    }
}
