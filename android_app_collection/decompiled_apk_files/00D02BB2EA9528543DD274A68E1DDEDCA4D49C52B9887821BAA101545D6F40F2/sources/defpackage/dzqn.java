package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
/* compiled from: PG */
/* renamed from: dzqn  reason: default package */
/* loaded from: classes.dex */
public final class dzqn<K, V> extends dznu<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient K[] b;
    public transient V[] c;
    public transient int d;
    public transient boolean e;
    public transient int f = -1;
    public transient int g = -1;
    public transient long[] h;
    public transient int i;
    public transient int j;
    public int k;
    protected transient dzra<K, V> l;
    protected transient dzry<K> m;
    protected transient dzrj<V> n;

    public dzqn() {
        int g = dzgv.g(16, 0.75f);
        this.i = g;
        this.d = g - 1;
        this.j = dzgv.f(g, 0.75f);
        int i = this.i + 1;
        this.b = (K[]) new Object[i];
        this.c = (V[]) new Object[i];
        this.h = new long[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        Object[] objArr;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.k, 0.75f);
        this.i = g;
        this.j = dzgv.f(g, 0.75f);
        int i2 = this.i;
        this.d = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        K[] kArr = (K[]) new Object[i3];
        this.b = kArr;
        V[] vArr = (V[]) new Object[i3];
        this.c = vArr;
        long[] jArr = new long[i3];
        this.h = jArr;
        this.g = -1;
        this.f = -1;
        int i4 = this.k;
        int i5 = -1;
        Object[] objArr2 = kArr;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            Object readObject = objectInputStream.readObject();
            Object readObject2 = objectInputStream.readObject();
            if (readObject != null) {
                int a = dzgv.a(readObject.hashCode());
                int i7 = this.d;
                while (true) {
                    i = a & i7;
                    if (objArr2[i] == null) {
                        break;
                    }
                    a = i + 1;
                    i7 = this.d;
                }
            } else {
                i = this.i;
                this.e = z;
            }
            objArr2[i] = readObject;
            vArr[i] = readObject2;
            if (this.f != -1) {
                long j = jArr[i5];
                objArr = objArr2;
                jArr[i5] = (((i & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i];
                jArr[i] = j2 ^ ((((i5 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                objArr = objArr2;
                this.f = i;
                jArr[i] = jArr[i] | (-4294967296L);
            }
            i4 = i6;
            i5 = i;
            z = true;
            objArr2 = (K[]) objArr;
        }
        this.g = i5;
        if (i5 != -1) {
            jArr[i5] = jArr[i5] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        K[] kArr = this.b;
        V[] vArr = this.c;
        dzql dzqlVar = new dzql(this);
        objectOutputStream.defaultWriteObject();
        int i = this.k;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int a = dzqlVar.a();
                objectOutputStream.writeObject(kArr[a]);
                objectOutputStream.writeObject(vArr[a]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dznt
    public final /* bridge */ /* synthetic */ dzrv a() {
        return keySet();
    }

    @Override // defpackage.dznt
    public final dzrj<V> b() {
        if (this.n == null) {
            this.n = new dzqe(this);
        }
        return this.n;
    }

    @Override // defpackage.dznr, defpackage.dzgu
    public final void clear() {
        if (this.k == 0) {
            return;
        }
        this.k = 0;
        this.e = false;
        Arrays.fill(this.b, (Object) null);
        Arrays.fill(this.c, (Object) null);
        this.g = -1;
        this.f = -1;
    }

    @Override // java.util.SortedMap
    public final Comparator<? super K> comparator() {
        return null;
    }

    @Override // defpackage.dznt, defpackage.dzgu
    public final boolean containsKey(Object obj) {
        K k;
        if (obj == null) {
            return this.e;
        }
        K[] kArr = this.b;
        int a = dzgv.a(obj.hashCode()) & this.d;
        K k2 = kArr[a];
        if (k2 == null) {
            return false;
        }
        if (obj.equals(k2)) {
            return true;
        }
        do {
            a = (a + 1) & this.d;
            k = kArr[a];
            if (k == null) {
                return false;
            }
        } while (!obj.equals(k));
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
        return true;
     */
    @Override // defpackage.dznt, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r6) {
        /*
            r5 = this;
            V[] r0 = r5.c
            K[] r1 = r5.b
            boolean r2 = r5.e
            r3 = 1
            if (r2 == 0) goto L19
            int r2 = r5.i
            r2 = r0[r2]
            if (r2 != 0) goto L12
            if (r6 == 0) goto L18
            goto L19
        L12:
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L19
        L18:
            return r3
        L19:
            int r2 = r5.i
        L1b:
            int r4 = r2 + (-1)
            if (r2 == 0) goto L34
            r2 = r1[r4]
            if (r2 == 0) goto L32
            r2 = r0[r4]
            if (r2 != 0) goto L2a
            if (r6 == 0) goto L31
            goto L32
        L2a:
            boolean r2 = r2.equals(r6)
            if (r2 != 0) goto L31
            goto L32
        L31:
            return r3
        L32:
            r2 = r4
            goto L1b
        L34:
            r6 = 0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzqn.containsValue(java.lang.Object):boolean");
    }

    @Override // defpackage.dznu
    public final dzry<K> d() {
        if (this.m == null) {
            this.m = new dzqi(this);
        }
        return this.m;
    }

    public final V e(int i) {
        K k;
        int i2;
        V[] vArr = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.k--;
        j(i);
        K[] kArr = this.b;
        loop0: while (true) {
            int i3 = (i + 1) & this.d;
            while (true) {
                k = kArr[i3];
                if (k == null) {
                    break loop0;
                }
                int hashCode = k.hashCode();
                int i4 = this.d;
                int a = dzgv.a(hashCode) & i4;
                if (i > i3) {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < a && a <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            kArr[i] = k;
            V[] vArr2 = this.c;
            vArr2[i] = vArr2[i3];
            k(i3, i);
            i = i3;
        }
        kArr[i] = null;
        this.c[i] = null;
        if (this.k < this.j / 4 && (i2 = this.i) > 16) {
            m(i2 >> 1);
        }
        return v;
    }

    public final V f() {
        int i;
        this.e = false;
        K[] kArr = this.b;
        int i2 = this.i;
        kArr[i2] = null;
        V[] vArr = this.c;
        V v = vArr[i2];
        vArr[i2] = null;
        this.k--;
        j(i2);
        if (this.k < this.j / 4 && (i = this.i) > 16) {
            m(i >> 1);
        }
        return v;
    }

    @Override // java.util.SortedMap
    public final K firstKey() {
        if (this.k == 0) {
            throw new NoSuchElementException();
        }
        return this.b[this.f];
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        K k;
        if (obj == null) {
            return this.e ? this.c[this.i] : this.a;
        }
        K[] kArr = this.b;
        int a = dzgv.a(obj.hashCode()) & this.d;
        K k2 = kArr[a];
        if (k2 == null) {
            return this.a;
        }
        if (!obj.equals(k2)) {
            do {
                a = (a + 1) & this.d;
                k = kArr[a];
                if (k == null) {
                    return this.a;
                }
            } while (!obj.equals(k));
            return this.c[a];
        }
        return this.c[a];
    }

    public final V h(int i, V v) {
        V[] vArr = this.c;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final void i(int i) {
        int i2;
        if (this.k == 1 || (i2 = this.g) == i) {
            return;
        }
        if (this.f == i) {
            long[] jArr = this.h;
            int i3 = (int) jArr[i];
            this.f = i3;
            jArr[i3] = (-4294967296L) | jArr[i3];
        } else {
            long[] jArr2 = this.h;
            long j = jArr2[i];
            int i4 = (int) (j >>> 32);
            int i5 = (int) j;
            long j2 = jArr2[i4];
            jArr2[i4] = j2 ^ (((j & 4294967295L) ^ j2) & 4294967295L);
            long j3 = jArr2[i5];
            jArr2[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
        }
        long[] jArr3 = this.h;
        long j4 = jArr3[i2];
        jArr3[i2] = j4 ^ (((i & 4294967295L) ^ j4) & 4294967295L);
        jArr3[i] = ((i2 & 4294967295L) << 32) | 4294967295L;
        this.g = i;
    }

    @Override // defpackage.dznt, java.util.Map
    public final boolean isEmpty() {
        return this.k == 0;
    }

    protected final void j(int i) {
        if (this.k == 0) {
            this.g = -1;
            this.f = -1;
        } else if (this.f == i) {
            long[] jArr = this.h;
            int i2 = (int) jArr[i];
            this.f = i2;
            if (i2 < 0) {
                return;
            }
            jArr[i2] = (-4294967296L) | jArr[i2];
        } else if (this.g == i) {
            long[] jArr2 = this.h;
            int i3 = (int) (jArr2[i] >>> 32);
            this.g = i3;
            if (i3 < 0) {
                return;
            }
            jArr2[i3] = jArr2[i3] | 4294967295L;
        } else {
            long[] jArr3 = this.h;
            long j = jArr3[i];
            int i4 = (int) (j >>> 32);
            int i5 = (int) j;
            long j2 = jArr3[i4];
            jArr3[i4] = (4294967295L & ((j & 4294967295L) ^ j2)) ^ j2;
            long j3 = jArr3[i5];
            jArr3[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(int i, int i2) {
        if (this.k == 1) {
            this.g = i2;
            this.f = i2;
            this.h[i2] = -1;
        } else if (this.f == i) {
            this.f = i2;
            long[] jArr = this.h;
            int i3 = (int) jArr[i];
            long j = jArr[i3];
            jArr[i3] = ((-4294967296L) & (((4294967295L & i2) << 32) ^ j)) ^ j;
            jArr[i2] = jArr[i];
        } else if (this.g == i) {
            this.g = i2;
            long[] jArr2 = this.h;
            int i4 = (int) (jArr2[i] >>> 32);
            long j2 = jArr2[i4];
            jArr2[i4] = (4294967295L & ((i2 & 4294967295L) ^ j2)) ^ j2;
            jArr2[i2] = jArr2[i];
        } else {
            long[] jArr3 = this.h;
            long j3 = jArr3[i];
            int i5 = (int) (j3 >>> 32);
            int i6 = (int) j3;
            long j4 = jArr3[i5];
            long j5 = i2 & 4294967295L;
            jArr3[i5] = ((j4 ^ j5) & 4294967295L) ^ j4;
            long j6 = jArr3[i6];
            jArr3[i6] = ((-4294967296L) & ((j5 << 32) ^ j6)) ^ j6;
            jArr3[i2] = j3;
        }
    }

    @Override // defpackage.dznu, defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.dzrb
    /* renamed from: l */
    public final dzra<K, V> o() {
        if (this.l == null) {
            this.l = new dzqk(this);
        }
        return this.l;
    }

    @Override // java.util.SortedMap
    public final K lastKey() {
        if (this.k == 0) {
            throw new NoSuchElementException();
        }
        return this.b[this.g];
    }

    public final void m(int i) {
        int i2;
        K[] kArr;
        V[] vArr;
        K[] kArr2 = this.b;
        V[] vArr2 = this.c;
        int i3 = i - 1;
        int i4 = i + 1;
        K[] kArr3 = (K[]) new Object[i4];
        V[] vArr3 = (V[]) new Object[i4];
        int i5 = this.f;
        long[] jArr = this.h;
        long[] jArr2 = new long[i4];
        int i6 = -1;
        this.f = -1;
        int i7 = this.k;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            int i10 = i7 - 1;
            if (i7 == 0) {
                break;
            }
            K k = kArr2[i5];
            if (k != null) {
                int a = dzgv.a(k.hashCode());
                while (true) {
                    i2 = a & i3;
                    if (kArr3[i2] == null) {
                        break;
                    }
                    a = i2 + 1;
                }
            } else {
                i2 = i;
            }
            kArr3[i2] = kArr2[i5];
            vArr3[i2] = vArr2[i5];
            if (i9 != i6) {
                long j = jArr2[i8];
                kArr = kArr2;
                vArr = vArr2;
                jArr2[i8] = j ^ ((j ^ (i2 & 4294967295L)) & 4294967295L);
                long j2 = jArr2[i2];
                int i11 = i2;
                jArr2[i11] = j2 ^ ((((i8 & 4294967295L) << 32) ^ j2) & (-4294967296L));
                i2 = i11;
            } else {
                kArr = kArr2;
                vArr = vArr2;
                this.f = i2;
                jArr2[i2] = -1;
            }
            i8 = i2;
            kArr2 = kArr;
            i7 = i10;
            i6 = -1;
            i9 = i5;
            i5 = (int) jArr[i5];
            vArr2 = vArr;
        }
        this.h = jArr2;
        this.g = i8;
        if (i8 != -1) {
            jArr2[i8] = jArr2[i8] | 4294967295L;
        }
        this.i = i;
        this.d = i3;
        this.j = dzgv.f(i, 0.75f);
        this.b = kArr3;
        this.c = vArr3;
    }

    /* renamed from: n */
    public final dzqn<K, V> clone() {
        try {
            dzqn<K, V> dzqnVar = (dzqn) super.clone();
            dzqnVar.m = null;
            dzqnVar.n = null;
            dzqnVar.l = null;
            dzqnVar.e = this.e;
            dzqnVar.b = (K[]) ((Object[]) this.b.clone());
            dzqnVar.c = (V[]) ((Object[]) this.c.clone());
            dzqnVar.h = (long[]) this.h.clone();
            return dzqnVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    public final void p() {
        int g = dzgv.g(this.k, 0.75f);
        if (g < this.i && this.k <= dzgv.f(g, 0.75f)) {
            try {
                m(g);
            } catch (OutOfMemoryError unused) {
            }
        }
    }

    @Override // defpackage.dznt, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.k + map.size()) / 0.75f))));
        if (min > this.i) {
            m(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dznr, java.util.Map
    public final V remove(Object obj) {
        K k;
        if (obj == null) {
            return this.e ? f() : this.a;
        }
        K[] kArr = this.b;
        int a = dzgv.a(obj.hashCode()) & this.d;
        K k2 = kArr[a];
        if (k2 == null) {
            return this.a;
        }
        if (!obj.equals(k2)) {
            do {
                a = (a + 1) & this.d;
                k = kArr[a];
                if (k == null) {
                    return this.a;
                }
            } while (!obj.equals(k));
            return e(a);
        }
        return e(a);
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.k;
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dznu, defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // defpackage.dznt, java.util.Map
    public final int hashCode() {
        K k;
        int i = this.e ? this.k - 1 : this.k;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                k = this.b[i3];
                if (k != null) {
                    break;
                }
                i3++;
            }
            if (this != k) {
                i5 = k.hashCode();
            }
            V v = this.c[i3];
            if (this != v) {
                i5 = (v == null ? 0 : v.hashCode()) ^ i5;
            }
            i4 += i5;
            i3++;
            i = i6;
        }
        if (this.e) {
            V v2 = this.c[this.i];
            if (v2 != null) {
                i2 = v2.hashCode();
            }
            return i4 + i2;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0075  */
    @Override // defpackage.dznr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V put(K r12, V r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 1
            if (r12 != 0) goto L11
            boolean r2 = r11.e
            if (r2 == 0) goto Lc
            int r0 = r11.i
            goto L7f
        Lc:
            r11.e = r1
            int r2 = r11.i
            goto L3a
        L11:
            K[] r2 = r11.b
            int r3 = r12.hashCode()
            int r3 = defpackage.dzgv.a(r3)
            int r4 = r11.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L39
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L2a
        L28:
            r0 = r3
            goto L7f
        L2a:
            int r3 = r3 + r1
            int r4 = r11.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L39
            boolean r4 = r4.equals(r12)
            if (r4 == 0) goto L2a
            goto L28
        L39:
            r2 = r3
        L3a:
            K[] r3 = r11.b
            r3[r2] = r12
            V[] r12 = r11.c
            r12[r2] = r13
            int r12 = r11.k
            if (r12 != 0) goto L51
            r11.g = r2
            r11.f = r2
            long[] r3 = r11.h
            r4 = -1
            r3[r2] = r4
            goto L6d
        L51:
            long[] r3 = r11.h
            int r4 = r11.g
            r5 = r3[r4]
            long r7 = (long) r2
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r7 = r7 & r9
            long r7 = r7 ^ r5
            long r7 = r7 & r9
            long r5 = r5 ^ r7
            r3[r4] = r5
            long r4 = (long) r4
            long r4 = r4 & r9
            r6 = 32
            long r4 = r4 << r6
            long r4 = r4 | r9
            r3[r2] = r4
            r11.g = r2
        L6d:
            int r2 = r12 + 1
            r11.k = r2
            int r3 = r11.j
            if (r12 < r3) goto L7f
            int r2 = r2 + r1
            r12 = 1061158912(0x3f400000, float:0.75)
            int r12 = defpackage.dzgv.g(r2, r12)
            r11.m(r12)
        L7f:
            if (r0 >= 0) goto L84
            V r12 = r11.a
            return r12
        L84:
            V[] r12 = r11.c
            r1 = r12[r0]
            r12[r0] = r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzqn.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
