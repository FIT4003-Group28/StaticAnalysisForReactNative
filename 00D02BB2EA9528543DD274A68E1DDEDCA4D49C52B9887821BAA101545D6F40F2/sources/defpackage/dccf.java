package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dccf  reason: default package */
/* loaded from: classes.dex */
public final class dccf<K, V> extends AbstractMap<K, V> implements Serializable, dbyy {
    transient K[] a;
    transient V[] b;
    public transient int c;
    transient int d;
    public transient int e;
    public transient int[] f;
    public transient dbyy<V, K> g;
    private transient int[] h;
    private transient int[] i;
    private transient int[] j;
    private transient int[] k;
    private transient int l;
    private transient int[] m;
    private transient Set<K> n;
    private transient Set<V> o;
    private transient Set<Map.Entry<K, V>> p;

    private dccf() {
        n();
    }

    public static <K, V> dccf<K, V> a() {
        return new dccf<>();
    }

    private static int[] o(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private static int[] p(int[] iArr, int i) {
        int length = iArr.length;
        int[] copyOf = Arrays.copyOf(iArr, i);
        Arrays.fill(copyOf, length, i, -1);
        return copyOf;
    }

    private final void q(int i) {
        int length = this.j.length;
        if (length < i) {
            int e = dccq.e(length, i);
            this.a = (K[]) Arrays.copyOf(this.a, e);
            this.b = (V[]) Arrays.copyOf(this.b, e);
            this.j = p(this.j, e);
            this.k = p(this.k, e);
            this.m = p(this.m, e);
            this.f = p(this.f, e);
        }
        if (this.h.length < i) {
            int c = dccj.c(i);
            this.h = o(c);
            this.i = o(c);
            for (int i2 = 0; i2 < this.c; i2++) {
                int r = r(dccj.b(this.a[i2]));
                int[] iArr = this.j;
                int[] iArr2 = this.h;
                iArr[i2] = iArr2[r];
                iArr2[r] = i2;
                int r2 = r(dccj.b(this.b[i2]));
                int[] iArr3 = this.k;
                int[] iArr4 = this.i;
                iArr3[i2] = iArr4[r2];
                iArr4[r2] = i2;
            }
        }
    }

    private final int r(int i) {
        return i & (this.h.length - 1);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        n();
        dcmz.b(this, objectInputStream, readInt);
    }

    private final void t(int i, int i2) {
        dbsk.a(i != -1);
        int r = r(i2);
        int[] iArr = this.j;
        int[] iArr2 = this.h;
        iArr[i] = iArr2[r];
        iArr2[r] = i;
    }

    private final void u(int i, int i2) {
        dbsk.a(i != -1);
        int r = r(i2);
        int[] iArr = this.k;
        int[] iArr2 = this.i;
        iArr[i] = iArr2[r];
        iArr2[r] = i;
    }

    private final void v(int i, int i2) {
        dbsk.a(i != -1);
        int r = r(i2);
        int[] iArr = this.h;
        int i3 = iArr[r];
        if (i3 == i) {
            int[] iArr2 = this.j;
            iArr[r] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.j[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.a[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 32);
                sb.append("Expected to find entry with key ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 != i) {
                i4 = this.j[i3];
            } else {
                int[] iArr3 = this.j;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    private final void w(int i, int i2) {
        dbsk.a(i != -1);
        int r = r(i2);
        int[] iArr = this.i;
        int i3 = iArr[r];
        if (i3 == i) {
            int[] iArr2 = this.k;
            iArr[r] = iArr2[i];
            iArr2[i] = -1;
            return;
        }
        int i4 = this.k[i3];
        while (true) {
            int i5 = i3;
            i3 = i4;
            if (i3 == -1) {
                String valueOf = String.valueOf(this.b[i]);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Expected to find entry with value ");
                sb.append(valueOf);
                throw new AssertionError(sb.toString());
            } else if (i3 != i) {
                i4 = this.k[i3];
            } else {
                int[] iArr3 = this.k;
                iArr3[i5] = iArr3[i];
                iArr3[i] = -1;
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        dcmz.a(this, objectOutputStream);
    }

    private final void x(int i, int i2, int i3) {
        int i4;
        int i5;
        dbsk.a(i != -1);
        v(i, i2);
        w(i, i3);
        s(this.m[i], this.f[i]);
        int i6 = this.c - 1;
        if (i6 != i) {
            int i7 = this.m[i6];
            int i8 = this.f[i6];
            s(i7, i);
            s(i, i8);
            K[] kArr = this.a;
            K k = kArr[i6];
            V[] vArr = this.b;
            V v = vArr[i6];
            kArr[i] = k;
            vArr[i] = v;
            int r = r(dccj.b(k));
            int[] iArr = this.h;
            int i9 = iArr[r];
            if (i9 == i6) {
                iArr[r] = i;
            } else {
                int i10 = this.j[i9];
                while (true) {
                    i4 = i9;
                    i9 = i10;
                    if (i9 == i6) {
                        break;
                    }
                    i10 = this.j[i9];
                }
                this.j[i4] = i;
            }
            int[] iArr2 = this.j;
            iArr2[i] = iArr2[i6];
            iArr2[i6] = -1;
            int r2 = r(dccj.b(v));
            int[] iArr3 = this.i;
            int i11 = iArr3[r2];
            if (i11 == i6) {
                iArr3[r2] = i;
            } else {
                int i12 = this.k[i11];
                while (true) {
                    i5 = i11;
                    i11 = i12;
                    if (i11 == i6) {
                        break;
                    }
                    i12 = this.k[i11];
                }
                this.k[i5] = i;
            }
            int[] iArr4 = this.k;
            iArr4[i] = iArr4[i6];
            iArr4[i6] = -1;
        }
        K[] kArr2 = this.a;
        int i13 = this.c - 1;
        kArr2[i13] = null;
        this.b[i13] = null;
        this.c = i13;
        this.d++;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(Object obj) {
        return c(obj, dccj.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int c(Object obj, int i) {
        return f(obj, i, this.h, this.j, this.a);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, (Object) null);
        Arrays.fill(this.h, -1);
        Arrays.fill(this.i, -1);
        Arrays.fill(this.j, 0, this.c, -1);
        Arrays.fill(this.k, 0, this.c, -1);
        Arrays.fill(this.m, 0, this.c, -1);
        Arrays.fill(this.f, 0, this.c, -1);
        this.c = 0;
        this.e = -2;
        this.l = -2;
        this.d++;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return b(obj) != -1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsValue(Object obj) {
        return d(obj) != -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(Object obj) {
        return e(obj, dccj.b(obj));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int e(Object obj, int i) {
        return f(obj, i, this.i, this.k, this.b);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        Set<Map.Entry<K, V>> set = this.p;
        if (set == null) {
            dcby dcbyVar = new dcby(this);
            this.p = dcbyVar;
            return dcbyVar;
        }
        return set;
    }

    final int f(Object obj, int i, int[] iArr, int[] iArr2, Object[] objArr) {
        int i2 = iArr[r(i)];
        while (i2 != -1) {
            if (dbsd.a(objArr[i2], obj)) {
                return i2;
            }
            i2 = iArr2[i2];
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i, int i2) {
        x(i, i2, dccj.b(this.b[i]));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V get(Object obj) {
        int b = b(obj);
        if (b == -1) {
            return null;
        }
        return this.b[b];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h(int i, int i2) {
        x(i, dccj.b(this.a[i]), i2);
    }

    @Override // defpackage.dbyy
    public final dbyy<V, K> i() {
        dbyy<V, K> dbyyVar = this.g;
        if (dbyyVar == null) {
            dcbz dcbzVar = new dcbz(this);
            this.g = dcbzVar;
            return dcbzVar;
        }
        return dbyyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public final Set<V> values() {
        Set<V> set = this.o;
        if (set == null) {
            dccc dcccVar = new dccc(this);
            this.o = dcccVar;
            return dcccVar;
        }
        return set;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final K k(V v, K k) {
        int b = dccj.b(v);
        int e = e(v, b);
        if (e != -1) {
            K k2 = this.a[e];
            if (dbsd.a(k2, k)) {
                return k;
            }
            l(e, k);
            return k2;
        }
        int i = this.l;
        int b2 = dccj.b(k);
        dbsk.g(c(k, b2) == -1, "Key already present: %s", k);
        q(this.c + 1);
        K[] kArr = this.a;
        int i2 = this.c;
        kArr[i2] = k;
        this.b[i2] = v;
        t(i2, b2);
        u(this.c, b);
        int i3 = i == -2 ? this.e : this.f[i];
        s(i, this.c);
        s(this.c, i3);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set<K> keySet() {
        Set<K> set = this.n;
        if (set == null) {
            dccb dccbVar = new dccb(this);
            this.n = dccbVar;
            return dccbVar;
        }
        return set;
    }

    public final void l(int i, K k) {
        dbsk.a(i != -1);
        int c = c(k, dccj.b(k));
        int i2 = this.l;
        if (c == -1) {
            if (i2 == i) {
                i2 = this.m[i];
            } else if (i2 == this.c) {
                i2 = c;
            }
            if (i == -2) {
                c = this.f[-2];
            } else if (this.c != -2) {
                c = -2;
            }
            s(this.m[i], this.f[i]);
            v(i, dccj.b(this.a[i]));
            this.a[i] = k;
            t(i, dccj.b(k));
            s(i2, i);
            s(i, c);
            return;
        }
        String valueOf = String.valueOf(k);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
        sb.append("Key already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    public final void m(int i, V v) {
        dbsk.a(i != -1);
        int b = dccj.b(v);
        if (e(v, b) == -1) {
            w(i, dccj.b(this.b[i]));
            this.b[i] = v;
            u(i, b);
            return;
        }
        String valueOf = String.valueOf(v);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Value already present in map: ");
        sb.append(valueOf);
        throw new IllegalArgumentException(sb.toString());
    }

    final void n() {
        dbzb.d(16, "expectedSize");
        int c = dccj.c(16);
        this.c = 0;
        this.a = (K[]) new Object[16];
        this.b = (V[]) new Object[16];
        this.h = o(c);
        this.i = o(c);
        this.j = o(16);
        this.k = o(16);
        this.e = -2;
        this.l = -2;
        this.m = o(16);
        this.f = o(16);
    }

    @Override // java.util.AbstractMap, java.util.Map, defpackage.dbyy
    public final V put(K k, V v) {
        int b = dccj.b(k);
        int c = c(k, b);
        if (c != -1) {
            V v2 = this.b[c];
            if (dbsd.a(v2, v)) {
                return v;
            }
            m(c, v);
            return v2;
        }
        int b2 = dccj.b(v);
        dbsk.g(e(v, b2) == -1, "Value already present: %s", v);
        q(this.c + 1);
        K[] kArr = this.a;
        int i = this.c;
        kArr[i] = k;
        this.b[i] = v;
        t(i, b);
        u(this.c, b2);
        s(this.l, this.c);
        s(this.c, -2);
        this.c++;
        this.d++;
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final V remove(Object obj) {
        int b = dccj.b(obj);
        int c = c(obj, b);
        if (c == -1) {
            return null;
        }
        V v = this.b[c];
        g(c, b);
        return v;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.c;
    }

    private final void s(int i, int i2) {
        if (i == -2) {
            this.e = i2;
        } else {
            this.f[i] = i2;
        }
        if (i2 == -2) {
            this.l = i;
        } else {
            this.m[i2] = i;
        }
    }
}
