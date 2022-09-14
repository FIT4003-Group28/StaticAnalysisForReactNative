package com.google.protobuf;

import com.google.protobuf.q;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SmallSortedMap.java */
/* loaded from: classes.dex */
public class ao<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a  reason: collision with root package name */
    private final int f4340a;

    /* renamed from: b  reason: collision with root package name */
    private List<ao<K, V>.b> f4341b;

    /* renamed from: c  reason: collision with root package name */
    private Map<K, V> f4342c;

    /* renamed from: d  reason: collision with root package name */
    private boolean f4343d;
    private volatile ao<K, V>.d e;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((ao<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends q.a<FieldDescriptorType>> ao<FieldDescriptorType, Object> a(int i) {
        return (ao<FieldDescriptorType, Object>) new ao<FieldDescriptorType, Object>(i) { // from class: com.google.protobuf.ao.1
            @Override // com.google.protobuf.ao, java.util.AbstractMap, java.util.Map
            public /* synthetic */ Object put(Object obj, Object obj2) {
                return super.a((AnonymousClass1) ((q.a) obj), (q.a) obj2);
            }

            @Override // com.google.protobuf.ao
            public void a() {
                if (!b()) {
                    for (int i2 = 0; i2 < c(); i2++) {
                        Map.Entry<FieldDescriptorType, Object> b2 = b(i2);
                        if (((q.a) b2.getKey()).p()) {
                            b2.setValue(Collections.unmodifiableList((List) b2.getValue()));
                        }
                    }
                    Iterator it = e().iterator();
                    while (it.hasNext()) {
                        Map.Entry entry = (Map.Entry) it.next();
                        if (((q.a) entry.getKey()).p()) {
                            entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                        }
                    }
                }
                super.a();
            }
        };
    }

    private ao(int i) {
        this.f4340a = i;
        this.f4341b = Collections.emptyList();
        this.f4342c = Collections.emptyMap();
    }

    public void a() {
        Map<K, V> unmodifiableMap;
        if (!this.f4343d) {
            if (this.f4342c.isEmpty()) {
                unmodifiableMap = Collections.emptyMap();
            } else {
                unmodifiableMap = Collections.unmodifiableMap(this.f4342c);
            }
            this.f4342c = unmodifiableMap;
            this.f4343d = true;
        }
    }

    public boolean b() {
        return this.f4343d;
    }

    public int c() {
        return this.f4341b.size();
    }

    public Map.Entry<K, V> b(int i) {
        return this.f4341b.get(i);
    }

    public int d() {
        return this.f4342c.size();
    }

    public Iterable<Map.Entry<K, V>> e() {
        if (this.f4342c.isEmpty()) {
            return a.a();
        }
        return this.f4342c.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4341b.size() + this.f4342c.size();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((ao<K, V>) comparable) >= 0 || this.f4342c.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((ao<K, V>) comparable);
        if (a2 >= 0) {
            return this.f4341b.get(a2).getValue();
        }
        return this.f4342c.get(comparable);
    }

    public V a(K k, V v) {
        f();
        int a2 = a((ao<K, V>) k);
        if (a2 >= 0) {
            return this.f4341b.get(a2).setValue(v);
        }
        h();
        int i = -(a2 + 1);
        if (i >= this.f4340a) {
            return g().put(k, v);
        }
        if (this.f4341b.size() == this.f4340a) {
            ao<K, V>.b remove = this.f4341b.remove(this.f4340a - 1);
            g().put((K) remove.getKey(), remove.getValue());
        }
        this.f4341b.add(i, new b(k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f4341b.isEmpty()) {
            this.f4341b.clear();
        }
        if (!this.f4342c.isEmpty()) {
            this.f4342c.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a((ao<K, V>) comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (!this.f4342c.isEmpty()) {
            return this.f4342c.remove(comparable);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public V c(int i) {
        f();
        V value = this.f4341b.remove(i).getValue();
        if (!this.f4342c.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f4341b.add(new b(this, it.next()));
            it.remove();
        }
        return value;
    }

    private int a(K k) {
        int size = this.f4341b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f4341b.get(size).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f4341b.get(i2).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.e == null) {
            this.e = new d();
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        if (this.f4343d) {
            throw new UnsupportedOperationException();
        }
    }

    private SortedMap<K, V> g() {
        f();
        if (this.f4342c.isEmpty() && !(this.f4342c instanceof TreeMap)) {
            this.f4342c = new TreeMap();
        }
        return (SortedMap) this.f4342c;
    }

    private void h() {
        f();
        if (!this.f4341b.isEmpty() || (this.f4341b instanceof ArrayList)) {
            return;
        }
        this.f4341b = new ArrayList(this.f4340a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class b implements Comparable<ao<K, V>.b>, Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private final K f4347b;

        /* renamed from: c  reason: collision with root package name */
        private V f4348c;

        b(ao aoVar, Map.Entry<K, V> entry) {
            this(entry.getKey(), entry.getValue());
        }

        b(K k, V v) {
            this.f4347b = k;
            this.f4348c = v;
        }

        @Override // java.util.Map.Entry
        /* renamed from: a */
        public K getKey() {
            return this.f4347b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f4348c;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(ao<K, V>.b bVar) {
            return getKey().compareTo(bVar.getKey());
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            ao.this.f();
            V v2 = this.f4348c;
            this.f4348c = v;
            return v2;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return a(this.f4347b, entry.getKey()) && a(this.f4348c, entry.getValue());
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int i = 0;
            int hashCode = this.f4347b == null ? 0 : this.f4347b.hashCode();
            if (this.f4348c != null) {
                i = this.f4348c.hashCode();
            }
            return hashCode ^ i;
        }

        public String toString() {
            return this.f4347b + "=" + this.f4348c;
        }

        private boolean a(Object obj, Object obj2) {
            if (obj == null) {
                return obj2 == null;
            }
            return obj.equals(obj2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public class d extends AbstractSet<Map.Entry<K, V>> {
        private d() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new c();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ao.this.size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = ao.this.get(entry.getKey());
            Object value = entry.getValue();
            return obj2 == value || (obj2 != null && obj2.equals(value));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry<K, V> entry) {
            if (!contains(entry)) {
                ao.this.a((ao) entry.getKey(), (K) entry.getValue());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                ao.this.remove(entry.getKey());
                return true;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            ao.this.clear();
        }
    }

    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    private class c implements Iterator<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private int f4350b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f4351c;

        /* renamed from: d  reason: collision with root package name */
        private Iterator<Map.Entry<K, V>> f4352d;

        private c() {
            this.f4350b = -1;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f4350b + 1 < ao.this.f4341b.size() || b().hasNext();
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            this.f4351c = true;
            int i = this.f4350b + 1;
            this.f4350b = i;
            if (i < ao.this.f4341b.size()) {
                return (Map.Entry) ao.this.f4341b.get(this.f4350b);
            }
            return b().next();
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.f4351c) {
                throw new IllegalStateException("remove() was called before next()");
            }
            this.f4351c = false;
            ao.this.f();
            if (this.f4350b < ao.this.f4341b.size()) {
                ao aoVar = ao.this;
                int i = this.f4350b;
                this.f4350b = i - 1;
                aoVar.c(i);
                return;
            }
            b().remove();
        }

        private Iterator<Map.Entry<K, V>> b() {
            if (this.f4352d == null) {
                this.f4352d = ao.this.f4342c.entrySet().iterator();
            }
            return this.f4352d;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SmallSortedMap.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private static final Iterator<Object> f4344a = new Iterator<Object>() { // from class: com.google.protobuf.ao.a.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return false;
            }

            @Override // java.util.Iterator
            public Object next() {
                throw new NoSuchElementException();
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };

        /* renamed from: b  reason: collision with root package name */
        private static final Iterable<Object> f4345b = new Iterable<Object>() { // from class: com.google.protobuf.ao.a.2
            @Override // java.lang.Iterable
            public Iterator<Object> iterator() {
                return a.f4344a;
            }
        };

        static <T> Iterable<T> a() {
            return (Iterable<T>) f4345b;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ao)) {
            return super.equals(obj);
        }
        ao aoVar = (ao) obj;
        int size = size();
        if (size != aoVar.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != aoVar.c()) {
            return entrySet().equals(aoVar.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!b(i).equals(aoVar.b(i))) {
                return false;
            }
        }
        if (c2 == size) {
            return true;
        }
        return this.f4342c.equals(aoVar.f4342c);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f4341b.get(i2).hashCode();
        }
        return d() > 0 ? i + this.f4342c.hashCode() : i;
    }
}
