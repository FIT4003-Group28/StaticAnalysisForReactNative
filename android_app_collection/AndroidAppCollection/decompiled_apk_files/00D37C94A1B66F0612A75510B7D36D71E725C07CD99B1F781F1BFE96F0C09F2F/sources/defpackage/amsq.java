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
/* compiled from: PG */
/* renamed from: amsq  reason: default package */
/* loaded from: classes.dex */
public final class amsq extends AbstractMap implements Serializable {
    public static final Object a = new Object();
    transient int[] b;
    transient Object[] c;
    transient Object[] d;
    public transient int e;
    public transient int f;
    private transient Object g;
    private transient Set h;
    private transient Set i;
    private transient Collection j;

    public amsq() {
        n(3);
    }

    public static amsq e() {
        return new amsq();
    }

    public static amsq f(int i) {
        return new amsq(i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        n(readInt);
        for (int i = 0; i < readInt; i++) {
            put(objectInputStream.readObject(), objectInputStream.readObject());
        }
    }

    private final int u(int i, int i2, int i3, int i4) {
        Object n = araa.n(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            araa.o(n, i3 & i5, i4 + 1);
        }
        Object i6 = i();
        int[] r = r();
        for (int i7 = 0; i7 <= i; i7++) {
            int m = araa.m(i6, i7);
            while (m != 0) {
                int i8 = m - 1;
                int i9 = r[i8];
                int i10 = araa.i(i9, i) | i7;
                int i11 = i10 & i5;
                int m2 = araa.m(n, i11);
                araa.o(n, i11, m);
                r[i8] = araa.j(i10, m2, i5);
                m = i9 & i;
            }
        }
        this.g = n;
        v(i5);
        return i5;
    }

    private final void v(int i) {
        this.e = araa.j(this.e, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator k = k();
        while (k.hasNext()) {
            Map.Entry entry = (Map.Entry) k.next();
            objectOutputStream.writeObject(entry.getKey());
            objectOutputStream.writeObject(entry.getValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return isEmpty() ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.f) {
            return i2;
        }
        return -1;
    }

    public final int c() {
        return (1 << (this.e & 31)) - 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        if (q()) {
            return;
        }
        m();
        Map l = l();
        if (l != null) {
            this.e = almu.s(size(), 3, 1073741823);
            l.clear();
            this.g = null;
            this.f = 0;
            return;
        }
        Arrays.fill(s(), 0, this.f, (Object) null);
        Arrays.fill(t(), 0, this.f, (Object) null);
        Object i = i();
        if (i instanceof byte[]) {
            Arrays.fill((byte[]) i, (byte) 0);
        } else if (i instanceof short[]) {
            Arrays.fill((short[]) i, (short) 0);
        } else {
            Arrays.fill((int[]) i, 0);
        }
        Arrays.fill(r(), 0, this.f, 0);
        this.f = 0;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        Map l = l();
        if (l != null) {
            return l.containsKey(obj);
        }
        return d(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        Map l = l();
        if (l == null) {
            for (int i = 0; i < this.f; i++) {
                if (akzj.f(obj, j(i))) {
                    return true;
                }
            }
            return false;
        }
        return l.containsValue(obj);
    }

    public final int d(Object obj) {
        if (q()) {
            return -1;
        }
        int G = arey.G(obj);
        int c = c();
        int m = araa.m(i(), G & c);
        if (m == 0) {
            return -1;
        }
        int i = araa.i(G, c);
        do {
            int i2 = m - 1;
            int i3 = r()[i2];
            if (araa.i(i3, c) == i && akzj.f(obj, g(i2))) {
                return i2;
            }
            m = i3 & c;
        } while (m != 0);
        return -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        Set set = this.i;
        if (set == null) {
            amsl amslVar = new amsl(this);
            this.i = amslVar;
            return amslVar;
        }
        return set;
    }

    public final Object g(int i) {
        return s()[i];
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        Map l = l();
        if (l != null) {
            return l.get(obj);
        }
        int d = d(obj);
        if (d != -1) {
            return j(d);
        }
        return null;
    }

    public final Object h(Object obj) {
        if (q()) {
            return a;
        }
        int c = c();
        int l = araa.l(obj, null, c, i(), r(), s(), null);
        if (l == -1) {
            return a;
        }
        Object j = j(l);
        o(l, c);
        this.f--;
        m();
        return j;
    }

    public final Object i() {
        Object obj = this.g;
        obj.getClass();
        return obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    public final Object j(int i) {
        return t()[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Iterator k() {
        Map l = l();
        if (l != null) {
            return l.entrySet().iterator();
        }
        return new amsj(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        Set set = this.h;
        if (set == null) {
            amsn amsnVar = new amsn(this);
            this.h = amsnVar;
            return amsnVar;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Map l() {
        Object obj = this.g;
        if (obj instanceof Map) {
            return (Map) obj;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void m() {
        this.e += 32;
    }

    final void n(int i) {
        aqxo.q(true, "Expected size must be >= 0");
        this.e = almu.s(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void o(int i, int i2) {
        Object i3 = i();
        int[] r = r();
        Object[] s = s();
        Object[] t = t();
        int size = size() - 1;
        if (i < size) {
            Object obj = s[size];
            s[i] = obj;
            t[i] = t[size];
            s[size] = null;
            t[size] = null;
            r[i] = r[size];
            r[size] = 0;
            int G = arey.G(obj) & i2;
            int m = araa.m(i3, G);
            int i4 = size + 1;
            if (m == i4) {
                araa.o(i3, G, i + 1);
                return;
            }
            while (true) {
                int i5 = m - 1;
                int i6 = r[i5];
                int i7 = i6 & i2;
                if (i7 == i4) {
                    r[i5] = araa.j(i6, i + 1, i2);
                    return;
                }
                m = i7;
            }
        } else {
            s[i] = null;
            t[i] = null;
            r[i] = 0;
        }
    }

    public final void p(int i, Object obj) {
        t()[i] = obj;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        int min;
        if (q()) {
            aqxo.z(q(), "Arrays already allocated");
            int i = this.e;
            int max = Math.max(4, arey.H(i + 1));
            this.g = araa.n(max);
            v(max - 1);
            this.b = new int[i];
            this.c = new Object[i];
            this.d = new Object[i];
        }
        Map l = l();
        if (l != null) {
            return l.put(obj, obj2);
        }
        int[] r = r();
        Object[] s = s();
        Object[] t = t();
        int i2 = this.f;
        int i3 = i2 + 1;
        int G = arey.G(obj);
        int c = c();
        int i4 = G & c;
        int m = araa.m(i(), i4);
        if (m != 0) {
            int i5 = araa.i(G, c);
            int i6 = 0;
            while (true) {
                int i7 = m - 1;
                int i8 = r[i7];
                if (araa.i(i8, c) == i5 && akzj.f(obj, s[i7])) {
                    Object obj3 = t[i7];
                    t[i7] = obj2;
                    return obj3;
                }
                int i9 = i8 & c;
                i6++;
                if (i9 != 0) {
                    m = i9;
                } else if (i6 >= 9) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap(c() + 1, 1.0f);
                    int a2 = a();
                    while (a2 >= 0) {
                        linkedHashMap.put(g(a2), j(a2));
                        a2 = b(a2);
                    }
                    this.g = linkedHashMap;
                    this.b = null;
                    this.c = null;
                    this.d = null;
                    m();
                    return linkedHashMap.put(obj, obj2);
                } else if (i3 > c) {
                    c = u(c, araa.k(c), G, i2);
                } else {
                    r[i7] = araa.j(i8, i3, c);
                }
            }
        } else if (i3 > c) {
            c = u(c, araa.k(c), G, i2);
        } else {
            araa.o(i(), i4, i3);
        }
        int length = r().length;
        if (i3 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            this.b = Arrays.copyOf(r(), min);
            this.c = Arrays.copyOf(s(), min);
            this.d = Arrays.copyOf(t(), min);
        }
        r()[i2] = araa.j(G, 0, c);
        s()[i2] = obj;
        p(i2, obj2);
        this.f = i3;
        m();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean q() {
        return this.g == null;
    }

    public final int[] r() {
        int[] iArr = this.b;
        iArr.getClass();
        return iArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        Map l = l();
        if (l != null) {
            return l.remove(obj);
        }
        Object h = h(obj);
        if (h != a) {
            return h;
        }
        return null;
    }

    public final Object[] s() {
        Object[] objArr = this.c;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        Map l = l();
        return l != null ? l.size() : this.f;
    }

    public final Object[] t() {
        Object[] objArr = this.d;
        objArr.getClass();
        return objArr;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Collection values() {
        Collection collection = this.j;
        if (collection == null) {
            amsp amspVar = new amsp(this);
            this.j = amspVar;
            return amspVar;
        }
        return collection;
    }

    public amsq(int i) {
        n(i);
    }
}
