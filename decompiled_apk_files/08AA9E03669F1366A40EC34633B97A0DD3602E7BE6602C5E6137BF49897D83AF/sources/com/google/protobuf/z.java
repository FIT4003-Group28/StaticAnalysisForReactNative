package com.google.protobuf;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: MapField.java */
/* loaded from: classes.dex */
public class z<K, V> implements ah {

    /* renamed from: b  reason: collision with root package name */
    private volatile boolean f4769b;

    /* renamed from: c  reason: collision with root package name */
    private volatile c f4770c;

    /* renamed from: d  reason: collision with root package name */
    private b<K, V> f4771d;
    private List<ab> e;
    private final a<K, V> f;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapField.java */
    /* loaded from: classes.dex */
    public interface a<K, V> {
        ab a();

        ab a(K k, V v);

        void a(ab abVar, Map<K, V> map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapField.java */
    /* loaded from: classes.dex */
    public enum c {
        MAP,
        LIST,
        BOTH
    }

    private ab a(K k, V v) {
        return this.f.a((a<K, V>) k, (K) v);
    }

    private void a(ab abVar, Map<K, V> map) {
        this.f.a(abVar, (Map) map);
    }

    private List<ab> a(b<K, V> bVar) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<K, V> entry : bVar.entrySet()) {
            arrayList.add(a((z<K, V>) entry.getKey(), (K) entry.getValue()));
        }
        return arrayList;
    }

    private b<K, V> a(List<ab> list) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ab abVar : list) {
            a(abVar, (Map) linkedHashMap);
        }
        return new b<>(this, linkedHashMap);
    }

    public Map<K, V> a() {
        if (this.f4770c == c.LIST) {
            synchronized (this) {
                if (this.f4770c == c.LIST) {
                    this.f4771d = a(this.e);
                    this.f4770c = c.BOTH;
                }
            }
        }
        return Collections.unmodifiableMap(this.f4771d);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof z)) {
            return false;
        }
        return aa.a((Map) a(), (Map) ((z) obj).a());
    }

    public int hashCode() {
        return aa.a((Map) a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ab> b() {
        if (this.f4770c == c.MAP) {
            synchronized (this) {
                if (this.f4770c == c.MAP) {
                    this.e = a(this.f4771d);
                    this.f4770c = c.BOTH;
                }
            }
        }
        return Collections.unmodifiableList(this.e);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public List<ab> c() {
        if (this.f4770c != c.LIST) {
            if (this.f4770c == c.MAP) {
                this.e = a(this.f4771d);
            }
            this.f4771d = null;
            this.f4770c = c.LIST;
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ab d() {
        return this.f.a();
    }

    public boolean e() {
        return this.f4769b;
    }

    @Override // com.google.protobuf.ah
    public void f() {
        if (!e()) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: MapField.java */
    /* loaded from: classes.dex */
    public static class b<K, V> implements Map<K, V> {

        /* renamed from: a  reason: collision with root package name */
        private final ah f4772a;

        /* renamed from: b  reason: collision with root package name */
        private final Map<K, V> f4773b;

        b(ah ahVar, Map<K, V> map) {
            this.f4772a = ahVar;
            this.f4773b = map;
        }

        @Override // java.util.Map
        public int size() {
            return this.f4773b.size();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            return this.f4773b.isEmpty();
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            return this.f4773b.containsKey(obj);
        }

        @Override // java.util.Map
        public boolean containsValue(Object obj) {
            return this.f4773b.containsValue(obj);
        }

        @Override // java.util.Map
        public V get(Object obj) {
            return this.f4773b.get(obj);
        }

        @Override // java.util.Map
        public V put(K k, V v) {
            this.f4772a.f();
            t.a(k);
            t.a(v);
            return this.f4773b.put(k, v);
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            this.f4772a.f();
            return this.f4773b.remove(obj);
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f4772a.f();
            for (K k : map.keySet()) {
                t.a(k);
                t.a(map.get(k));
            }
            this.f4773b.putAll(map);
        }

        @Override // java.util.Map
        public void clear() {
            this.f4772a.f();
            this.f4773b.clear();
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            return new c(this.f4772a, this.f4773b.keySet());
        }

        @Override // java.util.Map
        public Collection<V> values() {
            return new a(this.f4772a, this.f4773b.values());
        }

        @Override // java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            return new c(this.f4772a, this.f4773b.entrySet());
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            return this.f4773b.equals(obj);
        }

        @Override // java.util.Map
        public int hashCode() {
            return this.f4773b.hashCode();
        }

        public String toString() {
            return this.f4773b.toString();
        }

        /* compiled from: MapField.java */
        /* loaded from: classes.dex */
        private static class a<E> implements Collection<E> {

            /* renamed from: a  reason: collision with root package name */
            private final ah f4774a;

            /* renamed from: b  reason: collision with root package name */
            private final Collection<E> f4775b;

            a(ah ahVar, Collection<E> collection) {
                this.f4774a = ahVar;
                this.f4775b = collection;
            }

            @Override // java.util.Collection
            public int size() {
                return this.f4775b.size();
            }

            @Override // java.util.Collection
            public boolean isEmpty() {
                return this.f4775b.isEmpty();
            }

            @Override // java.util.Collection
            public boolean contains(Object obj) {
                return this.f4775b.contains(obj);
            }

            @Override // java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new C0089b(this.f4774a, this.f4775b.iterator());
            }

            @Override // java.util.Collection
            public Object[] toArray() {
                return this.f4775b.toArray();
            }

            @Override // java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f4775b.toArray(tArr);
            }

            @Override // java.util.Collection
            public boolean add(E e) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean remove(Object obj) {
                this.f4774a.f();
                return this.f4775b.remove(obj);
            }

            @Override // java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f4775b.containsAll(collection);
            }

            @Override // java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f4774a.f();
                return this.f4775b.removeAll(collection);
            }

            @Override // java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f4774a.f();
                return this.f4775b.retainAll(collection);
            }

            @Override // java.util.Collection
            public void clear() {
                this.f4774a.f();
                this.f4775b.clear();
            }

            @Override // java.util.Collection
            public boolean equals(Object obj) {
                return this.f4775b.equals(obj);
            }

            @Override // java.util.Collection
            public int hashCode() {
                return this.f4775b.hashCode();
            }

            public String toString() {
                return this.f4775b.toString();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* compiled from: MapField.java */
        /* loaded from: classes.dex */
        public static class c<E> implements Set<E> {

            /* renamed from: a  reason: collision with root package name */
            private final ah f4778a;

            /* renamed from: b  reason: collision with root package name */
            private final Set<E> f4779b;

            c(ah ahVar, Set<E> set) {
                this.f4778a = ahVar;
                this.f4779b = set;
            }

            @Override // java.util.Set, java.util.Collection
            public int size() {
                return this.f4779b.size();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean isEmpty() {
                return this.f4779b.isEmpty();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean contains(Object obj) {
                return this.f4779b.contains(obj);
            }

            @Override // java.util.Set, java.util.Collection, java.lang.Iterable
            public Iterator<E> iterator() {
                return new C0089b(this.f4778a, this.f4779b.iterator());
            }

            @Override // java.util.Set, java.util.Collection
            public Object[] toArray() {
                return this.f4779b.toArray();
            }

            @Override // java.util.Set, java.util.Collection
            public <T> T[] toArray(T[] tArr) {
                return (T[]) this.f4779b.toArray(tArr);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean add(E e) {
                this.f4778a.f();
                return this.f4779b.add(e);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean remove(Object obj) {
                this.f4778a.f();
                return this.f4779b.remove(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean containsAll(Collection<?> collection) {
                return this.f4779b.containsAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean addAll(Collection<? extends E> collection) {
                this.f4778a.f();
                return this.f4779b.addAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean retainAll(Collection<?> collection) {
                this.f4778a.f();
                return this.f4779b.retainAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public boolean removeAll(Collection<?> collection) {
                this.f4778a.f();
                return this.f4779b.removeAll(collection);
            }

            @Override // java.util.Set, java.util.Collection
            public void clear() {
                this.f4778a.f();
                this.f4779b.clear();
            }

            @Override // java.util.Set, java.util.Collection
            public boolean equals(Object obj) {
                return this.f4779b.equals(obj);
            }

            @Override // java.util.Set, java.util.Collection
            public int hashCode() {
                return this.f4779b.hashCode();
            }

            public String toString() {
                return this.f4779b.toString();
            }
        }

        /* compiled from: MapField.java */
        /* renamed from: com.google.protobuf.z$b$b  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private static class C0089b<E> implements Iterator<E> {

            /* renamed from: a  reason: collision with root package name */
            private final ah f4776a;

            /* renamed from: b  reason: collision with root package name */
            private final Iterator<E> f4777b;

            C0089b(ah ahVar, Iterator<E> it) {
                this.f4776a = ahVar;
                this.f4777b = it;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f4777b.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                return this.f4777b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f4776a.f();
                this.f4777b.remove();
            }

            public boolean equals(Object obj) {
                return this.f4777b.equals(obj);
            }

            public int hashCode() {
                return this.f4777b.hashCode();
            }

            public String toString() {
                return this.f4777b.toString();
            }
        }
    }
}
