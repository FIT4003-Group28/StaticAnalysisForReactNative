package a.e;

import java.util.ConcurrentModificationException;
import java.util.Map;
/* loaded from: classes.dex */
public class g<K, V> {

    /* renamed from: e  reason: collision with root package name */
    static Object[] f161e;

    /* renamed from: f  reason: collision with root package name */
    static int f162f;

    /* renamed from: g  reason: collision with root package name */
    static Object[] f163g;

    /* renamed from: h  reason: collision with root package name */
    static int f164h;

    /* renamed from: b  reason: collision with root package name */
    int[] f165b;

    /* renamed from: c  reason: collision with root package name */
    Object[] f166c;

    /* renamed from: d  reason: collision with root package name */
    int f167d;

    public g() {
        this.f165b = c.f130a;
        this.f166c = c.f132c;
        this.f167d = 0;
    }

    public g(int i) {
        if (i == 0) {
            this.f165b = c.f130a;
            this.f166c = c.f132c;
        } else {
            e(i);
        }
        this.f167d = 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g(g<K, V> gVar) {
        this();
        if (gVar != 0) {
            a((g) gVar);
        }
    }

    private static int a(int[] iArr, int i, int i2) {
        try {
            return c.a(iArr, i, i2);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private static void a(int[] iArr, Object[] objArr, int i) {
        if (iArr.length == 8) {
            synchronized (g.class) {
                if (f164h < 10) {
                    objArr[0] = f163g;
                    objArr[1] = iArr;
                    for (int i2 = (i << 1) - 1; i2 >= 2; i2--) {
                        objArr[i2] = null;
                    }
                    f163g = objArr;
                    f164h++;
                }
            }
        } else if (iArr.length == 4) {
            synchronized (g.class) {
                if (f162f < 10) {
                    objArr[0] = f161e;
                    objArr[1] = iArr;
                    for (int i3 = (i << 1) - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f161e = objArr;
                    f162f++;
                }
            }
        }
    }

    private void e(int i) {
        if (i == 8) {
            synchronized (g.class) {
                if (f163g != null) {
                    Object[] objArr = f163g;
                    this.f166c = objArr;
                    f163g = (Object[]) objArr[0];
                    this.f165b = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f164h--;
                    return;
                }
            }
        } else if (i == 4) {
            synchronized (g.class) {
                if (f161e != null) {
                    Object[] objArr2 = f161e;
                    this.f166c = objArr2;
                    f161e = (Object[]) objArr2[0];
                    this.f165b = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f162f--;
                    return;
                }
            }
        }
        this.f165b = new int[i];
        this.f166c = new Object[i << 1];
    }

    int a() {
        int i = this.f167d;
        if (i == 0) {
            return -1;
        }
        int a2 = a(this.f165b, i, 0);
        if (a2 < 0 || this.f166c[a2 << 1] == null) {
            return a2;
        }
        int i2 = a2 + 1;
        while (i2 < i && this.f165b[i2] == 0) {
            if (this.f166c[i2 << 1] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = a2 - 1; i3 >= 0 && this.f165b[i3] == 0; i3--) {
            if (this.f166c[i3 << 1] == null) {
                return i3;
            }
        }
        return ~i2;
    }

    public int a(Object obj) {
        return obj == null ? a() : a(obj, obj.hashCode());
    }

    int a(Object obj, int i) {
        int i2 = this.f167d;
        if (i2 == 0) {
            return -1;
        }
        int a2 = a(this.f165b, i2, i);
        if (a2 < 0 || obj.equals(this.f166c[a2 << 1])) {
            return a2;
        }
        int i3 = a2 + 1;
        while (i3 < i2 && this.f165b[i3] == i) {
            if (obj.equals(this.f166c[i3 << 1])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = a2 - 1; i4 >= 0 && this.f165b[i4] == i; i4--) {
            if (obj.equals(this.f166c[i4 << 1])) {
                return i4;
            }
        }
        return ~i3;
    }

    public V a(int i, V v) {
        int i2 = (i << 1) + 1;
        Object[] objArr = this.f166c;
        V v2 = (V) objArr[i2];
        objArr[i2] = v;
        return v2;
    }

    public void a(int i) {
        int i2 = this.f167d;
        int[] iArr = this.f165b;
        if (iArr.length < i) {
            Object[] objArr = this.f166c;
            e(i);
            if (this.f167d > 0) {
                System.arraycopy(iArr, 0, this.f165b, 0, i2);
                System.arraycopy(objArr, 0, this.f166c, 0, i2 << 1);
            }
            a(iArr, objArr, i2);
        }
        if (this.f167d == i2) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public void a(g<? extends K, ? extends V> gVar) {
        int i = gVar.f167d;
        a(this.f167d + i);
        if (this.f167d != 0) {
            for (int i2 = 0; i2 < i; i2++) {
                put(gVar.b(i2), gVar.d(i2));
            }
        } else if (i > 0) {
            System.arraycopy(gVar.f165b, 0, this.f165b, 0, i);
            System.arraycopy(gVar.f166c, 0, this.f166c, 0, i << 1);
            this.f167d = i;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int b(Object obj) {
        int i = this.f167d * 2;
        Object[] objArr = this.f166c;
        if (obj == null) {
            for (int i2 = 1; i2 < i; i2 += 2) {
                if (objArr[i2] == null) {
                    return i2 >> 1;
                }
            }
            return -1;
        }
        for (int i3 = 1; i3 < i; i3 += 2) {
            if (obj.equals(objArr[i3])) {
                return i3 >> 1;
            }
        }
        return -1;
    }

    public K b(int i) {
        return (K) this.f166c[i << 1];
    }

    public V c(int i) {
        int i2;
        Object[] objArr = this.f166c;
        int i3 = i << 1;
        V v = (V) objArr[i3 + 1];
        int i4 = this.f167d;
        if (i4 <= 1) {
            a(this.f165b, objArr, i4);
            this.f165b = c.f130a;
            this.f166c = c.f132c;
            i2 = 0;
        } else {
            i2 = i4 - 1;
            int[] iArr = this.f165b;
            int i5 = 8;
            if (iArr.length <= 8 || i4 >= iArr.length / 3) {
                if (i < i2) {
                    int[] iArr2 = this.f165b;
                    int i6 = i + 1;
                    int i7 = i2 - i;
                    System.arraycopy(iArr2, i6, iArr2, i, i7);
                    Object[] objArr2 = this.f166c;
                    System.arraycopy(objArr2, i6 << 1, objArr2, i3, i7 << 1);
                }
                Object[] objArr3 = this.f166c;
                int i8 = i2 << 1;
                objArr3[i8] = null;
                objArr3[i8 + 1] = null;
            } else {
                if (i4 > 8) {
                    i5 = i4 + (i4 >> 1);
                }
                int[] iArr3 = this.f165b;
                Object[] objArr4 = this.f166c;
                e(i5);
                if (i4 != this.f167d) {
                    throw new ConcurrentModificationException();
                }
                if (i > 0) {
                    System.arraycopy(iArr3, 0, this.f165b, 0, i);
                    System.arraycopy(objArr4, 0, this.f166c, 0, i3);
                }
                if (i < i2) {
                    int i9 = i + 1;
                    int i10 = i2 - i;
                    System.arraycopy(iArr3, i9, this.f165b, i, i10);
                    System.arraycopy(objArr4, i9 << 1, this.f166c, i3, i10 << 1);
                }
            }
        }
        if (i4 == this.f167d) {
            this.f167d = i2;
            return v;
        }
        throw new ConcurrentModificationException();
    }

    public void clear() {
        int i = this.f167d;
        if (i > 0) {
            int[] iArr = this.f165b;
            Object[] objArr = this.f166c;
            this.f165b = c.f130a;
            this.f166c = c.f132c;
            this.f167d = 0;
            a(iArr, objArr, i);
        }
        if (this.f167d <= 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    public boolean containsKey(Object obj) {
        return a(obj) >= 0;
    }

    public boolean containsValue(Object obj) {
        return b(obj) >= 0;
    }

    public V d(int i) {
        return (V) this.f166c[(i << 1) + 1];
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof g) {
            g gVar = (g) obj;
            if (size() != gVar.size()) {
                return false;
            }
            for (int i = 0; i < this.f167d; i++) {
                try {
                    K b2 = b(i);
                    V d2 = d(i);
                    Object obj2 = gVar.get(b2);
                    if (d2 == null) {
                        if (obj2 != null || !gVar.containsKey(b2)) {
                            return false;
                        }
                    } else if (!d2.equals(obj2)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                    return false;
                }
            }
            return true;
        }
        if (obj instanceof Map) {
            Map map = (Map) obj;
            if (size() != map.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f167d; i2++) {
                try {
                    K b3 = b(i2);
                    V d3 = d(i2);
                    Object obj3 = map.get(b3);
                    if (d3 == null) {
                        if (obj3 != null || !map.containsKey(b3)) {
                            return false;
                        }
                    } else if (!d3.equals(obj3)) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused2) {
                }
            }
            return true;
        }
        return false;
    }

    public V get(Object obj) {
        return getOrDefault(obj, null);
    }

    public V getOrDefault(Object obj, V v) {
        int a2 = a(obj);
        return a2 >= 0 ? (V) this.f166c[(a2 << 1) + 1] : v;
    }

    public int hashCode() {
        int[] iArr = this.f165b;
        Object[] objArr = this.f166c;
        int i = this.f167d;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < i) {
            Object obj = objArr[i4];
            i3 += (obj == null ? 0 : obj.hashCode()) ^ iArr[i2];
            i2++;
            i4 += 2;
        }
        return i3;
    }

    public boolean isEmpty() {
        return this.f167d <= 0;
    }

    public V put(K k, V v) {
        int i;
        int a2;
        int i2 = this.f167d;
        if (k == null) {
            a2 = a();
            i = 0;
        } else {
            int hashCode = k.hashCode();
            i = hashCode;
            a2 = a(k, hashCode);
        }
        if (a2 >= 0) {
            int i3 = (a2 << 1) + 1;
            Object[] objArr = this.f166c;
            V v2 = (V) objArr[i3];
            objArr[i3] = v;
            return v2;
        }
        int i4 = ~a2;
        if (i2 >= this.f165b.length) {
            int i5 = 4;
            if (i2 >= 8) {
                i5 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i5 = 8;
            }
            int[] iArr = this.f165b;
            Object[] objArr2 = this.f166c;
            e(i5);
            if (i2 != this.f167d) {
                throw new ConcurrentModificationException();
            }
            int[] iArr2 = this.f165b;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr2, 0, this.f166c, 0, objArr2.length);
            }
            a(iArr, objArr2, i2);
        }
        if (i4 < i2) {
            int[] iArr3 = this.f165b;
            int i6 = i4 + 1;
            System.arraycopy(iArr3, i4, iArr3, i6, i2 - i4);
            Object[] objArr3 = this.f166c;
            System.arraycopy(objArr3, i4 << 1, objArr3, i6 << 1, (this.f167d - i4) << 1);
        }
        int i7 = this.f167d;
        if (i2 == i7) {
            int[] iArr4 = this.f165b;
            if (i4 < iArr4.length) {
                iArr4[i4] = i;
                Object[] objArr4 = this.f166c;
                int i8 = i4 << 1;
                objArr4[i8] = k;
                objArr4[i8 + 1] = v;
                this.f167d = i7 + 1;
                return null;
            }
        }
        throw new ConcurrentModificationException();
    }

    public V putIfAbsent(K k, V v) {
        V v2 = get(k);
        return v2 == null ? put(k, v) : v2;
    }

    public V remove(Object obj) {
        int a2 = a(obj);
        if (a2 >= 0) {
            return c(a2);
        }
        return null;
    }

    public boolean remove(Object obj, Object obj2) {
        int a2 = a(obj);
        if (a2 >= 0) {
            V d2 = d(a2);
            if (obj2 != d2 && (obj2 == null || !obj2.equals(d2))) {
                return false;
            }
            c(a2);
            return true;
        }
        return false;
    }

    public V replace(K k, V v) {
        int a2 = a(k);
        if (a2 >= 0) {
            return a(a2, (int) v);
        }
        return null;
    }

    public boolean replace(K k, V v, V v2) {
        int a2 = a(k);
        if (a2 >= 0) {
            V d2 = d(a2);
            if (d2 != v && (v == null || !v.equals(d2))) {
                return false;
            }
            a(a2, (int) v2);
            return true;
        }
        return false;
    }

    public int size() {
        return this.f167d;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f167d * 28);
        sb.append('{');
        for (int i = 0; i < this.f167d; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            K b2 = b(i);
            if (b2 != this) {
                sb.append(b2);
            } else {
                sb.append("(this Map)");
            }
            sb.append('=');
            V d2 = d(i);
            if (d2 != this) {
                sb.append(d2);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}
