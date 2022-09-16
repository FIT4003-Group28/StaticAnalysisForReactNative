package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* compiled from: PG */
/* renamed from: aim  reason: default package */
/* loaded from: classes.dex */
public class aim<K, V> {
    static Object[] d;
    static int e;
    static Object[] f;
    static int g;
    int[] h;
    Object[] i;
    public int j;

    public aim() {
        this.h = aii.a;
        this.i = aii.c;
        this.j = 0;
    }

    public aim(int i) {
        if (i == 0) {
            this.h = aii.a;
            this.i = aii.c;
        } else {
            b(i);
        }
        this.j = 0;
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return aii.e(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private final void b(int i) {
        if (i == 8) {
            synchronized (aim.class) {
                Object[] objArr = f;
                if (objArr != null) {
                    this.i = objArr;
                    f = (Object[]) objArr[0];
                    this.h = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    g--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (aim.class) {
                Object[] objArr2 = d;
                if (objArr2 != null) {
                    this.i = objArr2;
                    d = (Object[]) objArr2[0];
                    this.h = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    e--;
                    return;
                }
                i = 4;
            }
        }
        this.h = new int[i];
        this.i = new Object[i + i];
    }

    private static void c(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (aim.class) {
                if (g < 10) {
                    objArr[0] = f;
                    objArr[1] = iArr;
                    int i2 = i + i;
                    while (true) {
                        i2--;
                        if (i2 < 2) {
                            break;
                        }
                        objArr[i2] = null;
                    }
                    f = objArr;
                    g++;
                }
            }
        } else if (length != 4) {
        } else {
            synchronized (aim.class) {
                if (e < 10) {
                    objArr[0] = d;
                    objArr[1] = iArr;
                    int i3 = i + i;
                    while (true) {
                        i3--;
                        if (i3 < 2) {
                            break;
                        }
                        objArr[i3] = null;
                    }
                    d = objArr;
                    e++;
                }
            }
        }
    }

    public void clear() {
        int i = this.j;
        if (i > 0) {
            int[] iArr = this.h;
            Object[] objArr = this.i;
            this.h = aii.a;
            this.i = aii.c;
            this.j = 0;
            c(iArr, objArr, i);
        }
        if (this.j <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final boolean containsKey(Object obj) {
        return g(obj) >= 0;
    }

    public final boolean containsValue(Object obj) {
        return h(obj) >= 0;
    }

    final int d(Object obj, int i) {
        int i2 = this.j;
        if (i2 == 0) {
            return -1;
        }
        int a = a(this.h, i2, i);
        if (a < 0 || obj.equals(this.i[a + a])) {
            return a;
        }
        int i3 = a + 1;
        while (i3 < i2 && this.h[i3] == i) {
            if (obj.equals(this.i[i3 + i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a - 1; i4 >= 0 && this.h[i4] == i; i4--) {
            if (obj.equals(this.i[i4 + i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    final int e() {
        int i = this.j;
        if (i == 0) {
            return -1;
        }
        int a = a(this.h, i, 0);
        if (a < 0 || this.i[a + a] == null) {
            return a;
        }
        int i2 = a + 1;
        while (i2 < i && this.h[i2] == 0) {
            if (this.i[i2 + i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a - 1; i3 >= 0 && this.h[i3] == 0; i3--) {
            if (this.i[i3 + i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aim) {
            aim aimVar = (aim) obj;
            if (this.j != aimVar.j) {
                return false;
            }
            for (int i = 0; i < this.j; i++) {
                K i2 = i(i);
                V j = j(i);
                Object obj2 = aimVar.get(i2);
                if (j == null) {
                    if (obj2 != null || !aimVar.containsKey(i2)) {
                        return false;
                    }
                } else if (!j.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (this.j == map.size()) {
                for (int i3 = 0; i3 < this.j; i3++) {
                    K i4 = i(i3);
                    V j2 = j(i3);
                    Object obj3 = map.get(i4);
                    if (j2 == null) {
                        if (obj3 != null || !map.containsKey(i4)) {
                            return false;
                        }
                    } else if (!j2.equals(obj3)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public final void f(int i) {
        int i2 = this.j;
        int[] iArr = this.h;
        if (iArr.length < i) {
            Object[] objArr = this.i;
            b(i);
            if (this.j > 0) {
                System.arraycopy(iArr, 0, this.h, 0, i2);
                System.arraycopy(objArr, 0, this.i, 0, i2 + i2);
            }
            c(iArr, objArr, i2);
        }
        if (this.j == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public final int g(Object obj) {
        return obj == null ? e() : d(obj, obj.hashCode());
    }

    public final V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public final V getOrDefault(Object obj, V v) {
        int g2 = g(obj);
        return g2 >= 0 ? (V) this.i[g2 + g2 + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.h;
        Object[] objArr = this.i;
        int i = this.j;
        int i2 = 1;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            Object obj = objArr[i2];
            i4 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i3];
            i3++;
            i2 += 2;
        }
        return i4;
    }

    public final K i(int i) {
        return (K) this.i[i + i];
    }

    public final boolean isEmpty() {
        return this.j <= 0;
    }

    public final V j(int i) {
        return (V) this.i[i + i + 1];
    }

    public V k(int i, V v) {
        int i2 = i + i + 1;
        Object[] objArr = this.i;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public void l(aim<? extends K, ? extends V> aimVar) {
        int i = aimVar.j;
        f(this.j + i);
        if (this.j != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(aimVar.i(i2), aimVar.j(i2));
            }
        } else if (i > 0) {
            System.arraycopy(aimVar.h, 0, this.h, 0, i);
            System.arraycopy(aimVar.i, 0, this.i, 0, i + i);
            this.j = i;
        }
    }

    public V m(int i) {
        Object[] objArr = this.i;
        int i2 = i + i;
        V v = (V) objArr[i2 + 1];
        int i3 = this.j;
        if (i3 <= 1) {
            clear();
        } else {
            int i4 = i3 - 1;
            int[] iArr = this.h;
            int length = iArr.length;
            int i5 = 8;
            if (length <= 8 || i3 >= length / 3) {
                if (i < i4) {
                    int i6 = i + 1;
                    int i7 = i4 - i;
                    System.arraycopy(iArr, i6, iArr, i, i7);
                    Object[] objArr2 = this.i;
                    System.arraycopy(objArr2, i6 + i6, objArr2, i2, i7 + i7);
                }
                Object[] objArr3 = this.i;
                int i8 = i4 + i4;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i3 > 8) {
                    i5 = i3 + (i3 >> 1);
                }
                b(i5);
                if (i3 != this.j) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr, 0, this.h, 0, i);
                    System.arraycopy(objArr, 0, this.i, 0, i2);
                }
                if (i < i4) {
                    int i9 = i + 1;
                    int i10 = i4 - i;
                    System.arraycopy(iArr, i9, this.h, i, i10);
                    System.arraycopy(objArr, i9 + i9, this.i, i2, i10 + i10);
                }
            }
            if (i3 == this.j) {
                this.j = i4;
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return v;
    }

    public V put(K k, V v) {
        int i;
        int d2;
        int i2 = this.j;
        if (k == null) {
            d2 = e();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            d2 = d(k, hashCode);
        }
        if (d2 >= 0) {
            int i3 = d2 + d2 + 1;
            Object[] objArr = this.i;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = d2 ^ (-1);
        int[] iArr = this.h;
        int length = iArr.length;
        if (i2 >= length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            Object[] objArr2 = this.i;
            b(i5);
            if (i2 == this.j) {
                int[] iArr2 = this.h;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr2, 0, this.i, 0, objArr2.length);
                }
                c(iArr, objArr2, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i4 < i2) {
            int[] iArr3 = this.h;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.i;
            int i7 = this.j - i4;
            System.arraycopy(objArr3, i4 + i4, objArr3, i6 + i6, i7 + i7);
        }
        int i8 = this.j;
        if (i2 == i8) {
            int[] iArr4 = this.h;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.i;
                int i9 = i4 + i4;
                objArr4[i9] = k;
                objArr4[i9 + 1] = v;
                this.j = i8 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public final V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public final V remove(Object obj) {
        int g2 = g(obj);
        if (g2 >= 0) {
            return m(g2);
        }
        return null;
    }

    public final V replace(K k, V v) {
        int g2 = g(k);
        if (g2 >= 0) {
            return k(g2, v);
        }
        return null;
    }

    public final int size() {
        return this.j;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.j * 28);
        sb.append('{');
        for (int i = 0; i < this.j; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K i2 = i(i);
            if (i2 != this) {
                sb.append(i2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V j = j(i);
            if (j != this) {
                sb.append(j);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int h(Object obj) {
        int i = this.j;
        int i2 = i + i;
        Object[] objArr = this.i;
        if (obj == null) {
            for (int i3 = 1; i3 < i2; i3 += 2) {
                if (objArr[i3] == null) {
                    return i3 >> 1;
                }
            }
            return -1;
        }
        for (int i4 = 1; i4 < i2; i4 += 2) {
            if (obj.equals(objArr[i4])) {
                return i4 >> 1;
            }
        }
        return -1;
    }

    public final boolean remove(Object obj, Object obj2) {
        int g2 = g(obj);
        if (g2 >= 0) {
            V j = j(g2);
            if (obj2 != j && (obj2 == null || !obj2.equals(j))) {
                return false;
            }
            m(g2);
            return true;
        }
        return false;
    }

    public final boolean replace(K k, V v, V v2) {
        int g2 = g(k);
        if (g2 >= 0) {
            V j = j(g2);
            if (j != v && (v == null || !v.equals(j))) {
                return false;
            }
            k(g2, v2);
            return true;
        }
        return false;
    }
}
