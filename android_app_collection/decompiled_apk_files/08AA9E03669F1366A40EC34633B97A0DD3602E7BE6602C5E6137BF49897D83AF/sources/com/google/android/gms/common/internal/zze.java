package com.google.android.gms.common.internal;

import android.support.v4.i.g;
import java.util.HashMap;
/* loaded from: classes.dex */
final class zze extends g<K, V> {
    private final /* synthetic */ ExpirableLruCache zzss;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zze(ExpirableLruCache expirableLruCache, int i) {
        super(i);
        this.zzss = expirableLruCache;
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // android.support.v4.i.g
    protected final V create(K k) {
        return this.zzss.create(k);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.support.v4.i.g
    public final void entryRemoved(boolean z, K k, V v, V v2) {
        Object obj;
        boolean zzct;
        HashMap hashMap;
        boolean zzcu;
        HashMap hashMap2;
        this.zzss.entryRemoved(z, k, v, v2);
        obj = this.zzss.mLock;
        synchronized (obj) {
            if (v2 == 0) {
                try {
                    zzct = this.zzss.zzct();
                    if (zzct) {
                        hashMap = this.zzss.zzsq;
                        hashMap.remove(k);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (v2 == 0) {
                zzcu = this.zzss.zzcu();
                if (zzcu) {
                    hashMap2 = this.zzss.zzsr;
                    hashMap2.remove(k);
                }
            }
        }
    }

    @Override // android.support.v4.i.g
    protected final int sizeOf(K k, V v) {
        return this.zzss.sizeOf(k, v);
    }
}
