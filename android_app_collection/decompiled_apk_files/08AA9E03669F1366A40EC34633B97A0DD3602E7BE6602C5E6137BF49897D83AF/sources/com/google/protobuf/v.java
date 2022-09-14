package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
/* compiled from: LazyField.java */
/* loaded from: classes.dex */
public class v extends w {

    /* renamed from: b  reason: collision with root package name */
    private final ac f4759b;

    public v(ac acVar, p pVar, f fVar) {
        super(pVar, fVar);
        this.f4759b = acVar;
    }

    public ac a() {
        return a(this.f4759b);
    }

    @Override // com.google.protobuf.w
    public int hashCode() {
        return a().hashCode();
    }

    @Override // com.google.protobuf.w
    public boolean equals(Object obj) {
        return a().equals(obj);
    }

    public String toString() {
        return a().toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    public static class a<K> implements Map.Entry<K, Object> {

        /* renamed from: a  reason: collision with root package name */
        private Map.Entry<K, v> f4760a;

        private a(Map.Entry<K, v> entry) {
            this.f4760a = entry;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f4760a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            v value = this.f4760a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        public v a() {
            return this.f4760a.getValue();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (!(obj instanceof ac)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.f4760a.getValue().b((ac) obj);
        }
    }

    /* compiled from: LazyField.java */
    /* loaded from: classes.dex */
    static class b<K> implements Iterator<Map.Entry<K, Object>> {

        /* renamed from: a  reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f4761a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.f4761a = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4761a.hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f4761a.next();
            return next.getValue() instanceof v ? new a(next) : next;
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f4761a.remove();
        }
    }
}
