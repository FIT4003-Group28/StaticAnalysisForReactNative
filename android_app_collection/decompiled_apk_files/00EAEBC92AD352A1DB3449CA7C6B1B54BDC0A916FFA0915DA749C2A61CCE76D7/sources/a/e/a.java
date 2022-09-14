package a.e;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V> {
    f<K, V> i;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a.e.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public class C0005a extends f<K, V> {
        C0005a() {
        }

        @Override // a.e.f
        protected int a(Object obj) {
            return a.this.a(obj);
        }

        @Override // a.e.f
        protected Object a(int i, int i2) {
            return a.this.f166c[(i << 1) + i2];
        }

        @Override // a.e.f
        protected V a(int i, V v) {
            return a.this.a(i, (int) v);
        }

        @Override // a.e.f
        protected void a() {
            a.this.clear();
        }

        @Override // a.e.f
        protected void a(int i) {
            a.this.c(i);
        }

        @Override // a.e.f
        protected void a(K k, V v) {
            a.this.put(k, v);
        }

        @Override // a.e.f
        protected int b(Object obj) {
            return a.this.b(obj);
        }

        @Override // a.e.f
        protected Map<K, V> b() {
            return a.this;
        }

        @Override // a.e.f
        protected int c() {
            return a.this.f167d;
        }
    }

    public a() {
    }

    public a(int i) {
        super(i);
    }

    public a(g gVar) {
        super(gVar);
    }

    private f<K, V> b() {
        if (this.i == null) {
            this.i = new C0005a();
        }
        return this.i;
    }

    public boolean a(Collection<?> collection) {
        return f.c(this, collection);
    }

    @Override // java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        return b().d();
    }

    @Override // java.util.Map
    public Set<K> keySet() {
        return b().e();
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> map) {
        a(this.f167d + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public Collection<V> values() {
        return b().f();
    }
}
