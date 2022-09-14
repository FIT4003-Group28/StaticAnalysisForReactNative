package c.e.a.b.d.g;

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
/* loaded from: classes.dex */
public class c7<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: b  reason: collision with root package name */
    private final int f4083b;

    /* renamed from: c  reason: collision with root package name */
    private List<l7> f4084c;

    /* renamed from: d  reason: collision with root package name */
    private Map<K, V> f4085d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f4086e;

    /* renamed from: f  reason: collision with root package name */
    private volatile o7 f4087f;

    /* renamed from: g  reason: collision with root package name */
    private Map<K, V> f4088g;

    /* renamed from: h  reason: collision with root package name */
    private volatile h7 f4089h;

    private c7(int i) {
        this.f4083b = i;
        this.f4084c = Collections.emptyList();
        this.f4085d = Collections.emptyMap();
        this.f4088g = Collections.emptyMap();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ c7(int i, f7 f7Var) {
        this(i);
    }

    private final int a(K k) {
        int size = this.f4084c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) this.f4084c.get(size).getKey());
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
            int compareTo2 = k.compareTo((Comparable) this.f4084c.get(i2).getKey());
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <FieldDescriptorType extends u4<FieldDescriptorType>> c7<FieldDescriptorType, Object> b(int i) {
        return new f7(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V c(int i) {
        f();
        V v = (V) this.f4084c.remove(i).getValue();
        if (!this.f4085d.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = g().entrySet().iterator();
            this.f4084c.add(new l7(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f() {
        if (!this.f4086e) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    private final SortedMap<K, V> g() {
        f();
        if (this.f4085d.isEmpty() && !(this.f4085d instanceof TreeMap)) {
            this.f4085d = new TreeMap();
            this.f4088g = ((TreeMap) this.f4085d).descendingMap();
        }
        return (SortedMap) this.f4085d;
    }

    public final V a(K k, V v) {
        f();
        int a2 = a((c7<K, V>) k);
        if (a2 >= 0) {
            return (V) this.f4084c.get(a2).setValue(v);
        }
        f();
        if (this.f4084c.isEmpty() && !(this.f4084c instanceof ArrayList)) {
            this.f4084c = new ArrayList(this.f4083b);
        }
        int i = -(a2 + 1);
        if (i >= this.f4083b) {
            return g().put(k, v);
        }
        int size = this.f4084c.size();
        int i2 = this.f4083b;
        if (size == i2) {
            l7 remove = this.f4084c.remove(i2 - 1);
            g().put((K) remove.getKey(), (V) remove.getValue());
        }
        this.f4084c.add(i, new l7(this, k, v));
        return null;
    }

    public final Map.Entry<K, V> a(int i) {
        return this.f4084c.get(i);
    }

    public void a() {
        if (!this.f4086e) {
            this.f4085d = this.f4085d.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4085d);
            this.f4088g = this.f4088g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f4088g);
            this.f4086e = true;
        }
    }

    public final boolean b() {
        return this.f4086e;
    }

    public final int c() {
        return this.f4084c.size();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        f();
        if (!this.f4084c.isEmpty()) {
            this.f4084c.clear();
        }
        if (!this.f4085d.isEmpty()) {
            this.f4085d.clear();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a((c7<K, V>) comparable) >= 0 || this.f4085d.containsKey(comparable);
    }

    public final Iterable<Map.Entry<K, V>> d() {
        return this.f4085d.isEmpty() ? g7.a() : this.f4085d.entrySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Set<Map.Entry<K, V>> e() {
        if (this.f4089h == null) {
            this.f4089h = new h7(this, null);
        }
        return this.f4089h;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f4087f == null) {
            this.f4087f = new o7(this, null);
        }
        return this.f4087f;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c7)) {
            return super.equals(obj);
        }
        c7 c7Var = (c7) obj;
        int size = size();
        if (size != c7Var.size()) {
            return false;
        }
        int c2 = c();
        if (c2 != c7Var.c()) {
            return entrySet().equals(c7Var.entrySet());
        }
        for (int i = 0; i < c2; i++) {
            if (!a(i).equals(c7Var.a(i))) {
                return false;
            }
        }
        if (c2 == size) {
            return true;
        }
        return this.f4085d.equals(c7Var.f4085d);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a((c7<K, V>) comparable);
        return a2 >= 0 ? (V) this.f4084c.get(a2).getValue() : this.f4085d.get(comparable);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int hashCode() {
        int c2 = c();
        int i = 0;
        for (int i2 = 0; i2 < c2; i2++) {
            i += this.f4084c.get(i2).hashCode();
        }
        return this.f4085d.size() > 0 ? i + this.f4085d.hashCode() : i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public /* synthetic */ Object put(Object obj, Object obj2) {
        return a((c7<K, V>) ((Comparable) obj), (Comparable) obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map
    public V remove(Object obj) {
        f();
        Comparable comparable = (Comparable) obj;
        int a2 = a((c7<K, V>) comparable);
        if (a2 >= 0) {
            return (V) c(a2);
        }
        if (!this.f4085d.isEmpty()) {
            return this.f4085d.remove(comparable);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.f4084c.size() + this.f4085d.size();
    }
}
