package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class zzy extends com.google.android.gms.analytics.zzi<zzy> {
    private final Map<String, Object> zzsn = new HashMap();

    public final void set(String str, String str2) {
        Preconditions.checkNotEmpty(str);
        if (str != null && str.startsWith("&")) {
            str = str.substring(1);
        }
        Preconditions.checkNotEmpty(str, "Name can not be empty or \"&\"");
        this.zzsn.put(str, str2);
    }

    public final String toString() {
        return zza((Object) this.zzsn);
    }

    public final Map<String, Object> zzas() {
        return Collections.unmodifiableMap(this.zzsn);
    }

    @Override // com.google.android.gms.analytics.zzi
    public final /* synthetic */ void zzb(zzy zzyVar) {
        zzy zzyVar2 = zzyVar;
        Preconditions.checkNotNull(zzyVar2);
        zzyVar2.zzsn.putAll(this.zzsn);
    }
}
