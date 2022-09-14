package ezvcard.util;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
/* compiled from: ListMultimap.java */
/* loaded from: classes.dex */
public class g<K, V> implements Iterable<Map.Entry<K, List<V>>> {

    /* renamed from: a  reason: collision with root package name */
    private final Map<K, List<V>> f5619a;

    protected K a(K k) {
        return k;
    }

    public g() {
        this(new LinkedHashMap());
    }

    public g(g<K, V> gVar) {
        this(a((Map) gVar.f5619a));
    }

    private static <K, V> Map<K, List<V>> a(Map<K, List<V>> map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(map.size());
        for (Map.Entry<K, List<V>> entry : map.entrySet()) {
            linkedHashMap.put(entry.getKey(), new ArrayList(entry.getValue()));
        }
        return linkedHashMap;
    }

    public g(Map<K, List<V>> map) {
        this.f5619a = map;
    }

    public void a(K k, V v) {
        K a2 = a((g<K, V>) k);
        List<V> list = this.f5619a.get(a2);
        if (list == null) {
            list = new ArrayList<>();
            this.f5619a.put(a2, list);
        }
        list.add(v);
    }

    public void a(K k, Collection<V> collection) {
        if (collection.isEmpty()) {
            return;
        }
        K a2 = a((g<K, V>) k);
        List<V> list = this.f5619a.get(a2);
        if (list == null) {
            list = new ArrayList<>();
            this.f5619a.put(a2, list);
        }
        list.addAll(collection);
    }

    public List<V> b(K k) {
        K a2 = a((g<K, V>) k);
        List<V> list = this.f5619a.get(a2);
        if (list == null) {
            list = new ArrayList<>(0);
        }
        return new a(a2, list, null);
    }

    public V c(K k) {
        List<V> list = this.f5619a.get(a((g<K, V>) k));
        if (list == null) {
            return null;
        }
        return list.get(0);
    }

    public List<V> d(K k) {
        List<V> remove = this.f5619a.remove(a((g<K, V>) k));
        if (remove == null) {
            return Collections.emptyList();
        }
        List<V> unmodifiableList = Collections.unmodifiableList(new ArrayList(remove));
        remove.clear();
        return unmodifiableList;
    }

    public List<V> b(K k, V v) {
        List<V> d2 = d(k);
        if (v != null) {
            a((g<K, V>) k, (K) v);
        }
        return d2;
    }

    public List<V> r() {
        ArrayList arrayList = new ArrayList();
        for (List<V> list : this.f5619a.values()) {
            arrayList.addAll(list);
        }
        return Collections.unmodifiableList(arrayList);
    }

    public int s() {
        int i = 0;
        for (List<V> list : this.f5619a.values()) {
            i += list.size();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, List<V>>> iterator() {
        final Iterator<Map.Entry<K, List<V>>> it = this.f5619a.entrySet().iterator();
        return new Iterator<Map.Entry<K, List<V>>>() { // from class: ezvcard.util.g.1
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            /* renamed from: a */
            public Map.Entry<K, List<V>> next() {
                final Map.Entry entry = (Map.Entry) it.next();
                return new Map.Entry<K, List<V>>() { // from class: ezvcard.util.g.1.1
                    @Override // java.util.Map.Entry
                    public K getKey() {
                        return (K) entry.getKey();
                    }

                    @Override // java.util.Map.Entry
                    /* renamed from: a */
                    public List<V> getValue() {
                        return Collections.unmodifiableList((List) entry.getValue());
                    }

                    @Override // java.util.Map.Entry
                    /* renamed from: a */
                    public List<V> setValue(List<V> list) {
                        throw new UnsupportedOperationException();
                    }
                };
            }

            @Override // java.util.Iterator
            public void remove() {
                throw new UnsupportedOperationException();
            }
        };
    }

    public String toString() {
        return this.f5619a.toString();
    }

    public int hashCode() {
        return this.f5619a.hashCode();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.f5619a.equals(((g) obj).f5619a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ListMultimap.java */
    /* loaded from: classes.dex */
    public class a extends AbstractCollection<V> implements List<V> {

        /* renamed from: a  reason: collision with root package name */
        final K f5624a;

        /* renamed from: b  reason: collision with root package name */
        List<V> f5625b;

        /* renamed from: c  reason: collision with root package name */
        final g<K, V>.a f5626c;

        /* renamed from: d  reason: collision with root package name */
        final List<V> f5627d;

        a(K k, List<V> list, g<K, V>.a aVar) {
            this.f5624a = k;
            this.f5625b = list;
            this.f5626c = aVar;
            this.f5627d = aVar == null ? null : aVar.e();
        }

        @Override // java.util.List
        public boolean addAll(int i, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = e().addAll(i, collection);
            if (addAll && size == 0) {
                d();
            }
            return addAll;
        }

        @Override // java.util.List
        public V get(int i) {
            a();
            return e().get(i);
        }

        @Override // java.util.List
        public V set(int i, V v) {
            a();
            return e().set(i, v);
        }

        @Override // java.util.List
        public void add(int i, V v) {
            a();
            boolean isEmpty = e().isEmpty();
            e().add(i, v);
            if (isEmpty) {
                d();
            }
        }

        @Override // java.util.List
        public V remove(int i) {
            a();
            V remove = e().remove(i);
            b();
            return remove;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            a();
            return e().indexOf(obj);
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            a();
            return e().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            a();
            return new C0127a();
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i) {
            a();
            return new C0127a(i);
        }

        @Override // java.util.List
        public List<V> subList(int i, int i2) {
            a();
            return new a(c(), e().subList(i, i2), f() == null ? this : f());
        }

        void a() {
            List<V> list;
            if (this.f5626c != null) {
                this.f5626c.a();
                if (this.f5626c.e() == this.f5627d) {
                    return;
                }
                throw new ConcurrentModificationException();
            } else if (!this.f5625b.isEmpty() || (list = (List) g.this.f5619a.get(this.f5624a)) == null) {
            } else {
                this.f5625b = list;
            }
        }

        void b() {
            if (this.f5626c != null) {
                this.f5626c.b();
            } else if (!this.f5625b.isEmpty()) {
            } else {
                g.this.f5619a.remove(this.f5624a);
            }
        }

        K c() {
            return this.f5624a;
        }

        void d() {
            if (this.f5626c == null) {
                g.this.f5619a.put(this.f5624a, this.f5625b);
            } else {
                this.f5626c.d();
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            a();
            return this.f5625b.size();
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            a();
            return this.f5625b.equals(obj);
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            a();
            return this.f5625b.hashCode();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            a();
            return this.f5625b.toString();
        }

        List<V> e() {
            return this.f5625b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
        public Iterator<V> iterator() {
            a();
            return new C0127a();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean add(V v) {
            a();
            boolean isEmpty = this.f5625b.isEmpty();
            boolean add = this.f5625b.add(v);
            if (add && isEmpty) {
                d();
            }
            return add;
        }

        g<K, V>.a f() {
            return this.f5626c;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean addAll = this.f5625b.addAll(collection);
            if (addAll && size == 0) {
                d();
            }
            return addAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean contains(Object obj) {
            a();
            return this.f5625b.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean containsAll(Collection<?> collection) {
            a();
            return this.f5625b.containsAll(collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public void clear() {
            if (size() == 0) {
                return;
            }
            this.f5625b.clear();
            b();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean remove(Object obj) {
            a();
            boolean remove = this.f5625b.remove(obj);
            if (remove) {
                b();
            }
            return remove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            a();
            boolean removeAll = this.f5625b.removeAll(collection);
            if (removeAll) {
                b();
            }
            return removeAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean retainAll(Collection<?> collection) {
            a();
            boolean retainAll = this.f5625b.retainAll(collection);
            if (retainAll) {
                b();
            }
            return retainAll;
        }

        /* compiled from: ListMultimap.java */
        /* renamed from: ezvcard.util.g$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        private class C0127a implements ListIterator<V> {

            /* renamed from: a  reason: collision with root package name */
            final ListIterator<V> f5628a;

            /* renamed from: b  reason: collision with root package name */
            final List<V> f5629b;

            C0127a() {
                this.f5629b = a.this.f5625b;
                this.f5628a = a.this.f5625b.listIterator();
            }

            public C0127a(int i) {
                this.f5629b = a.this.f5625b;
                this.f5628a = a.this.f5625b.listIterator(i);
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return b().hasPrevious();
            }

            @Override // java.util.ListIterator
            public V previous() {
                return b().previous();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return b().nextIndex();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return b().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(V v) {
                b().set(v);
            }

            @Override // java.util.ListIterator
            public void add(V v) {
                boolean isEmpty = a.this.isEmpty();
                b().add(v);
                if (isEmpty) {
                    a.this.d();
                }
            }

            void a() {
                a.this.a();
                if (a.this.f5625b != this.f5629b) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public boolean hasNext() {
                a();
                return this.f5628a.hasNext();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public V next() {
                a();
                return this.f5628a.next();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public void remove() {
                this.f5628a.remove();
                a.this.b();
            }

            ListIterator<V> b() {
                a();
                return this.f5628a;
            }
        }
    }
}
