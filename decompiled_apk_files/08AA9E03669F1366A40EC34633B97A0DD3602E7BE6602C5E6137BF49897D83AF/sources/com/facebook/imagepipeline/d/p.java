package com.facebook.imagepipeline.d;

import com.android.internal.util.Predicate;
/* compiled from: InstrumentedMemoryCache.java */
/* loaded from: classes.dex */
public class p<K, V> implements t<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final t<K, V> f2597a;

    /* renamed from: b  reason: collision with root package name */
    private final v f2598b;

    public p(t<K, V> tVar, v vVar) {
        this.f2597a = tVar;
        this.f2598b = vVar;
    }

    @Override // com.facebook.imagepipeline.d.t
    public com.facebook.common.h.a<V> a(K k) {
        com.facebook.common.h.a<V> a2 = this.f2597a.a((t<K, V>) k);
        if (a2 == null) {
            this.f2598b.a();
        } else {
            this.f2598b.a(k);
        }
        return a2;
    }

    @Override // com.facebook.imagepipeline.d.t
    public com.facebook.common.h.a<V> a(K k, com.facebook.common.h.a<V> aVar) {
        this.f2598b.b();
        return this.f2597a.a(k, aVar);
    }

    @Override // com.facebook.imagepipeline.d.t
    public int a(Predicate<K> predicate) {
        return this.f2597a.a((Predicate) predicate);
    }

    @Override // com.facebook.imagepipeline.d.t
    public boolean b(Predicate<K> predicate) {
        return this.f2597a.b(predicate);
    }
}
