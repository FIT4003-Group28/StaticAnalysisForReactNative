package a.b.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: b  reason: collision with root package name */
    c<K, V> f85b;

    /* renamed from: c  reason: collision with root package name */
    private c<K, V> f86c;

    /* renamed from: d  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f87d = new WeakHashMap<>();

    /* renamed from: e  reason: collision with root package name */
    private int f88e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f92e;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f91d;
        }
    }

    /* renamed from: a.b.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0004b<K, V> extends e<K, V> {
        C0004b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // a.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f91d;
        }

        @Override // a.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f92e;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: b  reason: collision with root package name */
        final K f89b;

        /* renamed from: c  reason: collision with root package name */
        final V f90c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f91d;

        /* renamed from: e  reason: collision with root package name */
        c<K, V> f92e;

        c(K k, V v) {
            this.f89b = k;
            this.f90c = v;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f89b.equals(cVar.f89b) && this.f90c.equals(cVar.f90c);
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f89b;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f90c;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            return this.f89b.hashCode() ^ this.f90c.hashCode();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f89b + "=" + this.f90c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f93b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f94c = true;

        d() {
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f93b;
            if (cVar == cVar2) {
                this.f93b = cVar2.f92e;
                this.f94c = this.f93b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            if (this.f94c) {
                return b.this.f85b != null;
            }
            c<K, V> cVar = this.f93b;
            return (cVar == null || cVar.f91d == null) ? false : true;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar;
            if (this.f94c) {
                this.f94c = false;
                cVar = b.this.f85b;
            } else {
                c<K, V> cVar2 = this.f93b;
                cVar = cVar2 != null ? cVar2.f91d : null;
            }
            this.f93b = cVar;
            return this.f93b;
        }
    }

    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements Iterator<Map.Entry<K, V>>, f<K, V> {

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f96b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f97c;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f96b = cVar2;
            this.f97c = cVar;
        }

        private c<K, V> a() {
            c<K, V> cVar = this.f97c;
            c<K, V> cVar2 = this.f96b;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // a.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f96b == cVar && cVar == this.f97c) {
                this.f97c = null;
                this.f96b = null;
            }
            c<K, V> cVar2 = this.f96b;
            if (cVar2 == cVar) {
                this.f96b = b(cVar2);
            }
            if (this.f97c == cVar) {
                this.f97c = a();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f97c != null;
        }

        @Override // java.util.Iterator
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f97c;
            this.f97c = a();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a(c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.f85b;
        while (cVar != null && !cVar.f89b.equals(k)) {
            cVar = cVar.f91d;
        }
        return cVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> a(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f88e++;
        c<K, V> cVar2 = this.f86c;
        if (cVar2 == null) {
            this.f85b = cVar;
            this.f86c = this.f85b;
            return cVar;
        }
        cVar2.f91d = cVar;
        cVar.f92e = cVar2;
        this.f86c = cVar;
        return cVar;
    }

    public Iterator<Map.Entry<K, V>> a() {
        C0004b c0004b = new C0004b(this.f86c, this.f85b);
        this.f87d.put(c0004b, false);
        return c0004b;
    }

    public V b(K k, V v) {
        c<K, V> a2 = a(k);
        if (a2 != null) {
            return a2.f90c;
        }
        a(k, v);
        return null;
    }

    public Map.Entry<K, V> b() {
        return this.f85b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f87d.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f86c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        Iterator<Map.Entry<K, V>> it = iterator();
        Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return !it.hasNext() && !it2.hasNext();
    }

    public int hashCode() {
        Iterator<Map.Entry<K, V>> it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += it.next().hashCode();
        }
        return i;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f85b, this.f86c);
        this.f87d.put(aVar, false);
        return aVar;
    }

    public V remove(K k) {
        c<K, V> a2 = a(k);
        if (a2 == null) {
            return null;
        }
        this.f88e--;
        if (!this.f87d.isEmpty()) {
            for (f<K, V> fVar : this.f87d.keySet()) {
                fVar.a(a2);
            }
        }
        c<K, V> cVar = a2.f92e;
        if (cVar != null) {
            cVar.f91d = a2.f91d;
        } else {
            this.f85b = a2.f91d;
        }
        c<K, V> cVar2 = a2.f91d;
        if (cVar2 != null) {
            cVar2.f92e = a2.f92e;
        } else {
            this.f86c = a2.f92e;
        }
        a2.f91d = null;
        a2.f92e = null;
        return a2.f90c;
    }

    public int size() {
        return this.f88e;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
