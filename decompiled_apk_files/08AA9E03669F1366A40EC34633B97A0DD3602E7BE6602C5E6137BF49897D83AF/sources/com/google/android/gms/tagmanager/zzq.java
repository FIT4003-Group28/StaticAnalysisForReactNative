package com.google.android.gms.tagmanager;

import com.google.android.gms.common.util.VisibleForTesting;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
@VisibleForTesting
/* loaded from: classes.dex */
final class zzq<K, V> {
    @VisibleForTesting
    private final zzs<K, V> zzavs = new zzr(this);

    public static zzp<K, V> zza(int i, zzs<K, V> zzsVar) {
        return new zzdb(PKIFailureInfo.badCertTemplate, zzsVar);
    }
}
