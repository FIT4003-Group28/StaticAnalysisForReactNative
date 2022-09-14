package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzaw {
    private final Map<String, String> zzsn;
    private final String zzue;
    private final long zzwh;
    private final String zzwi;
    private final boolean zzwj;
    private long zzwk;

    public zzaw(long j, String str, String str2, boolean z, long j2, Map<String, String> map) {
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotEmpty(str2);
        this.zzwh = 0L;
        this.zzue = str;
        this.zzwi = str2;
        this.zzwj = z;
        this.zzwk = j2;
        this.zzsn = map != null ? new HashMap<>(map) : Collections.emptyMap();
    }

    public final String zzaz() {
        return this.zzue;
    }

    public final void zzb(long j) {
        this.zzwk = j;
    }

    public final long zzco() {
        return this.zzwh;
    }

    public final String zzcp() {
        return this.zzwi;
    }

    public final boolean zzcq() {
        return this.zzwj;
    }

    public final long zzcr() {
        return this.zzwk;
    }

    public final Map<String, String> zzcs() {
        return this.zzsn;
    }
}
