package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbzn  reason: default package */
/* loaded from: classes.dex */
public class dbzn<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Object a = new Object();
    public transient Object b;
    transient int[] c;
    transient Object[] d;
    transient Object[] e;
    public transient int f;
    public transient int g;
    private transient Set<K> h;
    private transient Set<Map.Entry<K, V>> i;
    private transient Collection<V> j;

    public dbzn() {
        c(3);
    }

    public static <K, V> dbzn<K, V> a() {
        return new dbzn<>();
    }

    public static <K, V> dbzn<K, V> b(int i) {
        return new dbzn<>(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        c(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final void t(int i) {
        this.f = dbzq.h(this.f, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int u(int i, int i2, int i3, int i4) {
        Object b = dbzq.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            dbzq.e(b, i3 & i5, i4 + 1);
        }
        Object obj = this.b;
        int[] iArr = this.c;
        for (int i6 = 0; i6 <= i; i6++) {
            int d = dbzq.d(obj, i6);
            while (d != 0) {
                int i7 = d - 1;
                int i8 = iArr[i7];
                int g = dbzq.g(i8, i) | i6;
                int i9 = g & i5;
                int d2 = dbzq.d(b, i9);
                dbzq.e(b, i9, d);
                iArr[i7] = dbzq.h(g, d2, i5);
                d = i8 & i;
            }
        }
        this.b = b;
        t(i5);
        return i5;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<Map.Entry<K, V>> s = s();
        while (s.hasNext()) {
            Map.Entry<K, V> next = s.next();
            objectOutputStream.writeObject(next.getKey());
            objectOutputStream.writeObject(next.getValue());
        }
    }

    public void c(int i) {
        dbsk.b(i >= 0, "Expected size must be >= 0");
        this.f = decl.h(i, 1, 1073741823);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        if (d()) {
            return;
        }
        j();
        Map<K, V> f = f();
        if (f != null) {
            this.f = decl.h(size(), 3, 1073741823);
            f.clear();
            this.b = null;
            this.g = 0;
            return;
        }
        Arrays.fill(this.d, 0, this.g, (Object) null);
        Arrays.fill(this.e, 0, this.g, (Object) null);
        dbzq.c(this.b);
        Arrays.fill(this.c, 0, this.g, 0);
        this.g = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map<K, V> f = f();
        if (f != null) {
            return f.containsKey(obj);
        }
        return m(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map<K, V> f = f();
        if (f == null) {
            for (int i = 0; i < this.g; i++) {
                if (dbsd.a(obj, this.e[i])) {
                    return true;
                }
            }
            return false;
        }
        return f.containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean d() {
        return this.b == null;
    }

    public int e() {
        dbsk.m(d(), "Arrays already allocated");
        int i = this.f;
        int a2 = dbzq.a(i);
        this.b = dbzq.b(a2);
        t(a2 - 1);
        this.c = new int[i];
        this.d = new Object[i];
        this.e = new Object[i];
        return i;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.i;
        if (set == null) {
            dbzi dbziVar = new dbzi(this);
            this.i = dbziVar;
            return dbziVar;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map<K, V> f() {
        Object obj = this.b;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    public Map<K, V> g(int i) {
        return new LinkedHashMap(i, 1.0f);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        Map<K, V> f = f();
        if (f != null) {
            return f.get(obj);
        }
        int m = m(obj);
        if (m != -1) {
            return (V) this.e[m];
        }
        return null;
    }

    public Map<K, V> h() {
        Map<K, V> g = g(i() + 1);
        int p = p();
        while (p >= 0) {
            g.put((K) this.d[p], (V) this.e[p]);
            p = q(p);
        }
        this.b = g;
        this.c = null;
        this.d = null;
        this.e = null;
        j();
        return g;
    }

    public final int i() {
        return (1 << (this.f & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f += 32;
    }

    public void k(int i, K k, V v, int i2, int i3) {
        this.c[i] = dbzq.h(i2, 0, i3);
        this.d[i] = k;
        this.e[i] = v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.h;
        if (set == null) {
            dbzk dbzkVar = new dbzk(this);
            this.h = dbzkVar;
            return dbzkVar;
        }
        return set;
    }

    public void l(int i) {
        this.c = Arrays.copyOf(this.c, i);
        this.d = Arrays.copyOf(this.d, i);
        this.e = Arrays.copyOf(this.e, i);
    }

    public final int m(Object obj) {
        if (d()) {
            return -1;
        }
        int b = dccj.b(obj);
        int i = i();
        int d = dbzq.d(this.b, b & i);
        if (d == 0) {
            return -1;
        }
        int g = dbzq.g(b, i);
        do {
            int i2 = d - 1;
            int i3 = this.c[i2];
            if (dbzq.g(i3, i) == g && dbsd.a(obj, this.d[i2])) {
                return i2;
            }
            d = i3 & i;
        } while (d != 0);
        return -1;
    }

    public final Object n(Object obj) {
        if (d()) {
            return a;
        }
        int i = i();
        int i2 = dbzq.i(obj, null, i, this.b, this.c, this.d, null);
        if (i2 == -1) {
            return a;
        }
        Object obj2 = this.e[i2];
        o(i2, i);
        this.g--;
        j();
        return obj2;
    }

    public void o(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.d;
            Object obj = objArr[size];
            objArr[i] = obj;
            Object[] objArr2 = this.e;
            objArr2[i] = objArr2[size];
            objArr[size] = null;
            objArr2[size] = null;
            int[] iArr = this.c;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int b = dccj.b(obj) & i2;
            int d = dbzq.d(this.b, b);
            int i3 = size + 1;
            if (d == i3) {
                dbzq.e(this.b, b, i + 1);
                return;
            }
            while (true) {
                int i4 = d - 1;
                int[] iArr2 = this.c;
                int i5 = iArr2[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    iArr2[i4] = dbzq.h(i5, i + 1, i2);
                    return;
                }
                d = i6;
            }
        } else {
            this.d[i] = null;
            this.e[i] = null;
            this.c[i] = 0;
        }
    }

    public int p() {
        return isEmpty() ? -1 : 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int u;
        int min;
        if (d()) {
            e();
        }
        Map<K, V> f = f();
        if (f != null) {
            return f.put(k, v);
        }
        int[] iArr = this.c;
        Object[] objArr = this.d;
        Object[] objArr2 = this.e;
        int i = this.g;
        int i2 = i + 1;
        int b = dccj.b(k);
        int i3 = i();
        int i4 = b & i3;
        int d = dbzq.d(this.b, i4);
        if (d != 0) {
            int g = dbzq.g(b, i3);
            int i5 = 0;
            while (true) {
                int i6 = d - 1;
                int i7 = iArr[i6];
                if (dbzq.g(i7, i3) == g && dbsd.a(k, objArr[i6])) {
                    V v2 = (V) objArr2[i6];
                    objArr2[i6] = v;
                    return v2;
                }
                int i8 = i7 & i3;
                i5++;
                if (i8 != 0) {
                    d = i8;
                } else if (i5 >= 9) {
                    return h().put(k, v);
                } else {
                    if (i2 > i3) {
                        u = u(i3, dbzq.f(i3), b, i);
                    } else {
                        iArr[i6] = dbzq.h(i7, i2, i3);
                    }
                }
            }
        } else if (i2 > i3) {
            u = u(i3, dbzq.f(i3), b, i);
        } else {
            dbzq.e(this.b, i4, i2);
            u = i3;
        }
        int length = this.c.length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            l(min);
        }
        k(i, k, v, b, u);
        this.g = i2;
        j();
        return null;
    }

    public int q(int i) {
        int i2 = i + 1;
        if (i2 < this.g) {
            return i2;
        }
        return -1;
    }

    public int r(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        Map<K, V> f = f();
        if (f != null) {
            return f.remove(obj);
        }
        V v = (V) n(obj);
        if (v != a) {
            return v;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator<Map.Entry<K, V>> s() {
        Map<K, V> f = f();
        if (f != null) {
            return f.entrySet().iterator();
        }
        return new dbzg(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map<K, V> f = f();
        return f != null ? f.size() : this.g;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection<V> values() {
        Collection<V> collection = this.j;
        if (collection == null) {
            dbzm dbzmVar = new dbzm(this);
            this.j = dbzmVar;
            return dbzmVar;
        }
        return collection;
    }

    public dbzn(int i) {
        c(i);
    }
}
