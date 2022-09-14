package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class f {

    /* loaded from: classes.dex */
    public static final class b<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private Map f5451a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f5452b;

        private b() {
            this.f5451a = f.b();
            this.f5452b = true;
        }

        public b<K, V> a(K k, V v) {
            if (this.f5452b) {
                this.f5451a.put(k, v);
                return this;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }

        public Map<K, V> a() {
            if (this.f5452b) {
                this.f5452b = false;
                return this.f5451a;
            }
            throw new IllegalStateException("Underlying map has already been built");
        }
    }

    public static <K, V> b<K, V> a() {
        return new b<>();
    }

    public static <K, V> Map<K, V> a(K k, V v) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        return c2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        c2.put(k2, v2);
        return c2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        c2.put(k2, v2);
        c2.put(k3, v3);
        return c2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        c2.put(k2, v2);
        c2.put(k3, v3);
        c2.put(k4, v4);
        return c2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        c2.put(k2, v2);
        c2.put(k3, v3);
        c2.put(k4, v4);
        c2.put(k5, v5);
        return c2;
    }

    public static <K, V> Map<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4, K k5, V v5, K k6, V v6) {
        Map<K, V> c2 = c();
        c2.put(k, v);
        c2.put(k2, v2);
        c2.put(k3, v3);
        c2.put(k4, v4);
        c2.put(k5, v5);
        c2.put(k6, v6);
        return c2;
    }

    public static <K, V> HashMap<K, V> b() {
        return new HashMap<>();
    }

    public static <K, V> Map<K, V> c() {
        return b();
    }
}
