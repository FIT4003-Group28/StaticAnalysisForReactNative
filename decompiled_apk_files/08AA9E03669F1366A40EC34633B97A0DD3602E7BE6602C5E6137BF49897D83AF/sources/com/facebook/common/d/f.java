package com.facebook.common.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* compiled from: ImmutableMap.java */
/* loaded from: classes.dex */
public class f<K, V> extends HashMap<K, V> {
    private f(Map<? extends K, ? extends V> map) {
        super(map);
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        HashMap hashMap = new HashMap();
        hashMap.put(k, v);
        hashMap.put(k2, v2);
        hashMap.put(k3, v3);
        hashMap.put(k4, v4);
        return Collections.unmodifiableMap(hashMap);
    }

    public static <K, V> f<K, V> a(Map<? extends K, ? extends V> map) {
        return new f<>(map);
    }
}
