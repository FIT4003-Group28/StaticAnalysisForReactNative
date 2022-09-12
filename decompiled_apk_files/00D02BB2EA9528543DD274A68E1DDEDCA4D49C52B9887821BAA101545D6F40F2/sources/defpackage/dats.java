package defpackage;

import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dats  reason: default package */
/* loaded from: classes5.dex */
public final class dats<K, V> extends AbstractMap<K, V> implements Cloneable {
    int a;
    public Object[] b;

    public static <K, V> dats<K, V> a() {
        return new dats<>();
    }

    private final void f(int i, K k, V v) {
        Object[] objArr = this.b;
        objArr[i] = k;
        objArr[i + 1] = v;
    }

    private final V g(int i) {
        if (i < 0) {
            return null;
        }
        return (V) this.b[i];
    }

    private final int h(Object obj) {
        int i = this.a;
        int i2 = i + i;
        Object[] objArr = this.b;
        for (int i3 = 0; i3 < i2; i3 += 2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 == null) {
                    return i3;
                }
            } else if (obj.equals(obj2)) {
                return i3;
            }
        }
        return -2;
    }

    public final V b(int i) {
        if (i < 0 || i >= this.a) {
            return null;
        }
        return g(i + i + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.a = 0;
        this.b = null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return h(obj) != -2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        int i = this.a;
        int i2 = i + i;
        Object[] objArr = this.b;
        for (int i3 = 1; i3 < i2; i3 += 2) {
            Object obj2 = objArr[i3];
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    public final V d(int i) {
        int i2 = this.a;
        int i3 = i2 + i2;
        if (i < 0 || i >= i3) {
            return null;
        }
        V g = g(i + 1);
        Object[] objArr = this.b;
        int i4 = (i3 - i) - 2;
        if (i4 != 0) {
            System.arraycopy(objArr, i + 2, objArr, i, i4);
        }
        this.a--;
        f(i3 - 2, null, null);
        return g;
    }

    @Override // java.util.AbstractMap
    /* renamed from: e */
    public final dats<K, V> clone() {
        try {
            dats<K, V> datsVar = (dats) super.clone();
            Object[] objArr = this.b;
            if (objArr != null) {
                int length = objArr.length;
                Object[] objArr2 = new Object[length];
                datsVar.b = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
            }
            return datsVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return new datr(this);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        return g(h(obj) + 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        int h = h(k) >> 1;
        if (h == -1) {
            h = this.a;
        }
        if (h >= 0) {
            int i = h + 1;
            if (i >= 0) {
                Object[] objArr = this.b;
                int i2 = i + i;
                int length = objArr == null ? 0 : objArr.length;
                if (i2 > length) {
                    int i3 = ((length >> 1) * 3) + 1;
                    if (i3 % 2 != 0) {
                        i3++;
                    }
                    if (i3 >= i2) {
                        i2 = i3;
                    }
                    int i4 = this.a;
                    if (i4 == 0 || i2 != objArr.length) {
                        Object[] objArr2 = new Object[i2];
                        this.b = objArr2;
                        if (i4 != 0) {
                            System.arraycopy(objArr, 0, objArr2, 0, i4 + i4);
                        }
                    }
                }
                int i5 = h + h;
                V g = g(i5 + 1);
                f(i5, k, v);
                if (i > this.a) {
                    this.a = i;
                }
                return g;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        return d(h(obj));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.a;
    }

    public final V c(int i, V v) {
        int i2 = this.a;
        if (i < 0 || i >= i2) {
            throw new IndexOutOfBoundsException();
        }
        int i3 = i + i + 1;
        V g = g(i3);
        this.b[i3] = v;
        return g;
    }
}
