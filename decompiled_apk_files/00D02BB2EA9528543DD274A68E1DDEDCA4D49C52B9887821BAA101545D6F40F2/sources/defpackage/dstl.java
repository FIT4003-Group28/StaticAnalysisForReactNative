package defpackage;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dstl  reason: default package */
/* loaded from: classes.dex */
public class dstl<K extends Comparable<K>, V> extends AbstractMap<K, V> {
    public boolean c;
    private final int e;
    private volatile dstk f;
    public List<dsti> a = Collections.emptyList();
    public Map<K, V> b = Collections.emptyMap();
    public Map<K, V> d = Collections.emptyMap();

    public dstl(int i) {
        this.e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends dsqu> dstl<FieldDescriptorType, Object> a(int i) {
        return new dste(i);
    }

    private final int h(K k) {
        int size = this.a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = k.compareTo(this.a.get(size).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.a.get(i2).a);
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

    private final SortedMap<K, V> i() {
        g();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.d = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public final int b() {
        return this.a.size();
    }

    public final Map.Entry<K, V> c(int i) {
        return this.a.get(i);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        g();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return h(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.b.isEmpty() ? (Iterable<Map.Entry<K, V>>) dsth.b : this.b.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final V put(K k, V v) {
        g();
        int h = h(k);
        if (h >= 0) {
            return (V) this.a.get(h).setValue(v);
        }
        g();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.e);
        }
        int i = -(h + 1);
        if (i >= this.e) {
            return i().put(k, v);
        }
        int size = this.a.size();
        int i2 = this.e;
        if (size == i2) {
            dsti remove = this.a.remove(i2 - 1);
            i().put((K) remove.a, (V) remove.b);
        }
        this.a.add(i, new dsti(this, k, v));
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f == null) {
            this.f = new dstk(this);
        }
        return this.f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dstl)) {
            return super.equals(obj);
        }
        dstl dstlVar = (dstl) obj;
        int size = size();
        if (size != dstlVar.size()) {
            return false;
        }
        int b = b();
        if (b != dstlVar.b()) {
            return entrySet().equals(dstlVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!c(i).equals(dstlVar.c(i))) {
                return false;
            }
        }
        if (b == size) {
            return true;
        }
        return this.b.equals(dstlVar.b);
    }

    public final V f(int i) {
        g();
        V v = (V) this.a.remove(i).b;
        if (!this.b.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = i().entrySet().iterator();
            List<dsti> list = this.a;
            Map.Entry<K, V> next = it.next();
            list.add(new dsti(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    public final void g() {
        if (!this.c) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        if (h >= 0) {
            return (V) this.a.get(h).b;
        }
        return this.b.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        int b = b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += this.a.get(i2).hashCode();
        }
        return this.b.size() > 0 ? i + this.b.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        g();
        Comparable comparable = (Comparable) obj;
        int h = h(comparable);
        if (h >= 0) {
            return (V) f(h);
        }
        if (!this.b.isEmpty()) {
            return this.b.remove(comparable);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a.size() + this.b.size();
    }
}
