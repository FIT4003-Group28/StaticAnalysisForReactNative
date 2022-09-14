package com.google.android.gms.tagmanager;

import android.annotation.TargetApi;
import android.util.LruCache;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
@TargetApi(12)
/* loaded from: classes.dex */
final class zzdb<K, V> implements zzp<K, V> {
    private LruCache<K, V> zzazn;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzdb(int i, zzs<K, V> zzsVar) {
        this.zzazn = new zzdc(this, PKIFailureInfo.badCertTemplate, zzsVar);
    }

    @Override // com.google.android.gms.tagmanager.zzp
    public final V get(K k) {
        return this.zzazn.get(k);
    }

    @Override // com.google.android.gms.tagmanager.zzp
    public final void zza(K k, V v) {
        this.zzazn.put(k, v);
    }
}
