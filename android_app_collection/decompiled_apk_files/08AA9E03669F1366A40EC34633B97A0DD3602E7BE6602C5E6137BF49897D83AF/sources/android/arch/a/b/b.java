package android.arch.a.b;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>> {

    /* renamed from: a  reason: collision with root package name */
    private c<K, V> f52a;

    /* renamed from: b  reason: collision with root package name */
    private c<K, V> f53b;

    /* renamed from: c  reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f54c = new WeakHashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f55d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public interface f<K, V> {
        void a_(c<K, V> cVar);
    }

    protected c<K, V> a(K k) {
        c<K, V> cVar = this.f52a;
        while (cVar != null && !cVar.f56a.equals(k)) {
            cVar = cVar.f58c;
        }
        return cVar;
    }

    public V a(K k, V v) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 != null) {
            return a2.f57b;
        }
        b(k, v);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public c<K, V> b(K k, V v) {
        c<K, V> cVar = new c<>(k, v);
        this.f55d++;
        if (this.f53b == null) {
            this.f52a = cVar;
            this.f53b = this.f52a;
            return cVar;
        }
        this.f53b.f58c = cVar;
        cVar.f59d = this.f53b;
        this.f53b = cVar;
        return cVar;
    }

    public V b(K k) {
        c<K, V> a2 = a((b<K, V>) k);
        if (a2 == null) {
            return null;
        }
        this.f55d--;
        if (!this.f54c.isEmpty()) {
            for (f<K, V> fVar : this.f54c.keySet()) {
                fVar.a_(a2);
            }
        }
        if (a2.f59d != null) {
            a2.f59d.f58c = a2.f58c;
        } else {
            this.f52a = a2.f58c;
        }
        if (a2.f58c != null) {
            a2.f58c.f59d = a2.f59d;
        } else {
            this.f53b = a2.f59d;
        }
        a2.f58c = null;
        a2.f59d = null;
        return a2.f57b;
    }

    public int a() {
        return this.f55d;
    }

    @Override // java.lang.Iterable
    public Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f52a, this.f53b);
        this.f54c.put(aVar, false);
        return aVar;
    }

    public Iterator<Map.Entry<K, V>> b() {
        C0001b c0001b = new C0001b(this.f53b, this.f52a);
        this.f54c.put(c0001b, false);
        return c0001b;
    }

    public b<K, V>.d c() {
        b<K, V>.d dVar = new d();
        this.f54c.put(dVar, false);
        return dVar;
    }

    public Map.Entry<K, V> d() {
        return this.f52a;
    }

    public Map.Entry<K, V> e() {
        return this.f53b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (a() != bVar.a()) {
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

    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    private static abstract class e<K, V> implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: a  reason: collision with root package name */
        c<K, V> f63a;

        /* renamed from: b  reason: collision with root package name */
        c<K, V> f64b;

        abstract c<K, V> a(c<K, V> cVar);

        abstract c<K, V> b(c<K, V> cVar);

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f63a = cVar2;
            this.f64b = cVar;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f64b != null;
        }

        @Override // android.arch.a.b.b.f
        public void a_(c<K, V> cVar) {
            if (this.f63a == cVar && cVar == this.f64b) {
                this.f64b = null;
                this.f63a = null;
            }
            if (this.f63a == cVar) {
                this.f63a = b(this.f63a);
            }
            if (this.f64b == cVar) {
                this.f64b = b();
            }
        }

        private c<K, V> b() {
            if (this.f64b == this.f63a || this.f63a == null) {
                return null;
            }
            return a(this.f64b);
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f64b;
            this.f64b = b();
            return cVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.a.b.b.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.f58c;
        }

        @Override // android.arch.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f59d;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: android.arch.a.b.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    private static class C0001b<K, V> extends e<K, V> {
        C0001b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // android.arch.a.b.b.e
        c<K, V> a(c<K, V> cVar) {
            return cVar.f59d;
        }

        @Override // android.arch.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f58c;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public class d implements f<K, V>, Iterator<Map.Entry<K, V>> {

        /* renamed from: b  reason: collision with root package name */
        private c<K, V> f61b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f62c;

        private d() {
            this.f62c = true;
        }

        @Override // android.arch.a.b.b.f
        public void a_(c<K, V> cVar) {
            if (cVar == this.f61b) {
                this.f61b = this.f61b.f59d;
                this.f62c = this.f61b == null;
            }
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f62c ? b.this.f52a != null : (this.f61b == null || this.f61b.f58c == null) ? false : true;
        }

        @Override // java.util.Iterator
        /* renamed from: a */
        public Map.Entry<K, V> next() {
            if (this.f62c) {
                this.f62c = false;
                this.f61b = b.this.f52a;
            } else {
                this.f61b = this.f61b != null ? this.f61b.f58c : null;
            }
            return this.f61b;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: SafeIterableMap.java */
    /* loaded from: classes.dex */
    public static class c<K, V> implements Map.Entry<K, V> {

        /* renamed from: a  reason: collision with root package name */
        final K f56a;

        /* renamed from: b  reason: collision with root package name */
        final V f57b;

        /* renamed from: c  reason: collision with root package name */
        c<K, V> f58c;

        /* renamed from: d  reason: collision with root package name */
        c<K, V> f59d;

        c(K k, V v) {
            this.f56a = k;
            this.f57b = v;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f56a;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return this.f57b;
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f56a + "=" + this.f57b;
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
            return this.f56a.equals(cVar.f56a) && this.f57b.equals(cVar.f57b);
        }
    }
}
