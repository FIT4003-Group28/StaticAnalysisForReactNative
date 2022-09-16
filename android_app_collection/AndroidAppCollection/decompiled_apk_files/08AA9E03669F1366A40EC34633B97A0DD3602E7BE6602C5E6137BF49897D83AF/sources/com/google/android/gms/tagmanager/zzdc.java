package com.google.android.gms.tagmanager;

import android.util.LruCache;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class zzdc extends LruCache<K, V> {
    private final /* synthetic */ zzs zzazo;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzdc(zzdb zzdbVar, int i, zzs zzsVar) {
        super(i);
        this.zzazo = zzsVar;
    }

    @Override // android.util.LruCache
    protected final int sizeOf(K k, V v) {
        return this.zzazo.sizeOf(k, v);
    }
}
