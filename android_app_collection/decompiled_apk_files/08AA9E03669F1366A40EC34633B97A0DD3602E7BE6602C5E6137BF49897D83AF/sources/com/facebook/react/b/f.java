package com.facebook.react.b;

import java.util.HashMap;
import java.util.Map;
/* compiled from: MapBuilder.java */
/* loaded from: classes.dex */
public class f {
    public static <K, V> HashMap<K, V> a() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> b() {
        return a();
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        b2.put(k4, v4);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        b2.put(k4, v4);
        b2.put(k5, v5);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        b2.put(k4, v4);
        b2.put(k5, v5);
        b2.put(k6, v6);
        return b2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6, K k7, V v7) {
        Map<K, V> b2 = b();
        b2.put(k, v);
        b2.put(k2, v2);
        b2.put(k3, v3);
        b2.put(k4, v4);
        b2.put(k5, v5);
        b2.put(k6, v6);
        b2.put(k7, v7);
        return b2;
    }

    public static <K, V> a<K, V> c() {
        return new a<>();
    }

    /* compiled from: MapBuilder.java */
    /* loaded from: classes.dex */
    public static final class a<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private Map f3178a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f3179b;

        private a() {
            this.f3178a = f.a();
            this.f3179b = true;
        }

        public a<K, V> a(K k, V v) {
            if (!this.f3179b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f3178a.put(k, v);
            return this;
        }

        public Map<K, V> a() {
            if (!this.f3179b) {
                throw new IllegalStateException("Underlying map has already been built");
            }
            this.f3179b = false;
            return this.f3178a;
        }
    }
}
