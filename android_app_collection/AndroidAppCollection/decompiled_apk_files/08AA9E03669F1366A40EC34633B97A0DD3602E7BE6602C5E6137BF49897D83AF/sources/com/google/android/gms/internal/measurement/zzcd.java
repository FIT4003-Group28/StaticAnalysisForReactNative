package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.config.GservicesValue;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.VisibleForTesting;
@VisibleForTesting
/* loaded from: classes.dex */
public final class zzcd<V> {
    private final V zzaab;
    private final GservicesValue<V> zzaac;

    private zzcd(GservicesValue<V> gservicesValue, V v) {
        Preconditions.checkNotNull(gservicesValue);
        this.zzaac = gservicesValue;
        this.zzaab = v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd<Float> zza(String str, float f, float f2) {
        return new zzcd<>(GservicesValue.value(str, Float.valueOf(0.5f)), Float.valueOf(0.5f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd<Integer> zza(String str, int i, int i2) {
        return new zzcd<>(GservicesValue.value(str, Integer.valueOf(i2)), Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd<Long> zza(String str, long j, long j2) {
        return new zzcd<>(GservicesValue.value(str, Long.valueOf(j2)), Long.valueOf(j));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd<String> zza(String str, String str2, String str3) {
        return new zzcd<>(GservicesValue.value(str, str3), str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static zzcd<Boolean> zza(String str, boolean z, boolean z2) {
        return new zzcd<>(GservicesValue.value(str, z2), Boolean.valueOf(z));
    }

    public final V get() {
        return this.zzaab;
    }
}
