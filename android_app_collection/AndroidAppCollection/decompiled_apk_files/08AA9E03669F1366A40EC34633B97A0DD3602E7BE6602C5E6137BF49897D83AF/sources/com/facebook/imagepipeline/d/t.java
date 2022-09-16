package com.facebook.imagepipeline.d;

import com.android.internal.util.Predicate;
/* compiled from: MemoryCache.java */
/* loaded from: classes.dex */
public interface t<K, V> {
    int a(Predicate<K> predicate);

    com.facebook.common.h.a<V> a(K k);

    com.facebook.common.h.a<V> a(K k, com.facebook.common.h.a<V> aVar);

    boolean b(Predicate<K> predicate);
}
