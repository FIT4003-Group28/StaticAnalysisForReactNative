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
/* compiled from: PG */
/* renamed from: dzmd  reason: default package */
/* loaded from: classes.dex */
public final class dzmd<V> extends dzkp<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    public transient long[] a;
    public transient V[] b;
    public transient int c;
    public transient boolean d;
    public transient int e = -1;
    public transient int f = -1;
    public transient long[] g;
    public transient int h;
    public transient int i;
    public int j;
    protected transient dzmq<V> k;
    protected transient dzni l;
    protected transient dzrj<V> m;

    public dzmd() {
        int g = dzgv.g(16, 0.75f);
        this.h = g;
        this.c = g - 1;
        this.i = dzgv.f(g, 0.75f);
        int i = this.h + 1;
        this.a = new long[i];
        this.b = (V[]) new Object[i];
        this.g = new long[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        int i2;
        long[] jArr;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.j, 0.75f);
        this.h = g;
        this.i = dzgv.f(g, 0.75f);
        int i3 = this.h;
        this.c = i3 - 1;
        boolean z = true;
        int i4 = i3 + 1;
        long[] jArr2 = new long[i4];
        this.a = jArr2;
        V[] vArr = (V[]) new Object[i4];
        this.b = vArr;
        long[] jArr3 = new long[i4];
        this.g = jArr3;
        this.f = -1;
        this.e = -1;
        int i5 = this.j;
        int i6 = -1;
        while (true) {
            int i7 = i5 - 1;
            if (i5 == 0) {
                break;
            }
            long readLong = objectInputStream.readLong();
            Object readObject = objectInputStream.readObject();
            if (readLong == 0) {
                i2 = this.h;
                this.d = z;
            } else {
                int b = (int) dzgv.b(readLong);
                int i8 = this.c;
                while (true) {
                    i = i8 & b;
                    if (jArr2[i] == 0) {
                        break;
                    }
                    i8 = i + 1;
                    b = this.c;
                }
                i2 = i;
            }
            jArr2[i2] = readLong;
            vArr[i2] = readObject;
            if (this.e != -1) {
                long j = jArr3[i6];
                jArr = jArr2;
                jArr3[i6] = (((i2 & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr3[i2];
                jArr3[i2] = j2 ^ ((-4294967296L) & (((i6 & 4294967295L) << 32) ^ j2));
            } else {
                jArr = jArr2;
                this.e = i2;
                jArr3[i2] = jArr3[i2] | (-4294967296L);
            }
            i5 = i7;
            i6 = i2;
            jArr2 = jArr;
            z = true;
        }
        this.f = i6;
        if (i6 != -1) {
            jArr3[i6] = jArr3[i6] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        long[] jArr = this.a;
        V[] vArr = this.b;
        dzmb dzmbVar = new dzmb(this);
        objectOutputStream.defaultWriteObject();
        int i = this.j;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int c = dzmbVar.c();
                objectOutputStream.writeLong(jArr[c]);
                objectOutputStream.writeObject(vArr[c]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzkn, defpackage.dzlt
    public final V b(long j) {
        long j2;
        if (j == 0) {
            if (!this.d) {
                return null;
            }
            return k();
        }
        long[] jArr = this.a;
        int b = this.c & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return null;
        }
        if (j != j3) {
            do {
                b = (b + 1) & this.c;
                j2 = jArr[b];
                if (j2 == 0) {
                    return null;
                }
            } while (j != j2);
            return j(b);
        }
        return j(b);
    }

    @Override // defpackage.dzkn, defpackage.dzgu
    public final void clear() {
        if (this.j == 0) {
            return;
        }
        this.j = 0;
        this.d = false;
        Arrays.fill(this.a, 0L);
        Arrays.fill(this.b, (Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator<? super Long> comparator() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0035, code lost:
        return true;
     */
    @Override // defpackage.dzko, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r10) {
        /*
            r9 = this;
            V[] r0 = r9.b
            long[] r1 = r9.a
            boolean r2 = r9.d
            r3 = 1
            if (r2 == 0) goto L19
            int r2 = r9.h
            r2 = r0[r2]
            if (r2 != 0) goto L12
            if (r10 == 0) goto L18
            goto L19
        L12:
            boolean r2 = r2.equals(r10)
            if (r2 == 0) goto L19
        L18:
            return r3
        L19:
            int r2 = r9.h
        L1b:
            int r4 = r2 + (-1)
            if (r2 == 0) goto L38
            r5 = r1[r4]
            r7 = 0
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto L36
            r2 = r0[r4]
            if (r2 != 0) goto L2e
            if (r10 == 0) goto L35
            goto L36
        L2e:
            boolean r2 = r2.equals(r10)
            if (r2 != 0) goto L35
            goto L36
        L35:
            return r3
        L36:
            r2 = r4
            goto L1b
        L38:
            r10 = 0
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzmd.containsValue(java.lang.Object):boolean");
    }

    @Override // defpackage.dzko, defpackage.dzlt
    public final boolean d(long j) {
        long j2;
        if (j == 0) {
            return this.d;
        }
        long[] jArr = this.a;
        int b = this.c & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return false;
        }
        if (j == j3) {
            return true;
        }
        do {
            b = (b + 1) & this.c;
            j2 = jArr[b];
            if (j2 == 0) {
                return false;
            }
        } while (j != j2);
        return true;
    }

    @Override // defpackage.dzkp, defpackage.dzko, defpackage.dzmg
    public final /* bridge */ /* synthetic */ dznf e() {
        return keySet();
    }

    @Override // defpackage.dzkp, defpackage.dzko, defpackage.dzmg
    public final dzrj<V> f() {
        if (this.m == null) {
            this.m = new dzlu(this);
        }
        return this.m;
    }

    @Override // defpackage.dzkp
    public final dzni h() {
        if (this.l == null) {
            this.l = new dzly(this);
        }
        return this.l;
    }

    @Override // defpackage.dzlt
    public final V i(long j) {
        long j2;
        if (j == 0) {
            if (!this.d) {
                return null;
            }
            return this.b[this.h];
        }
        long[] jArr = this.a;
        int b = this.c & ((int) dzgv.b(j));
        long j3 = jArr[b];
        if (j3 == 0) {
            return null;
        }
        if (j != j3) {
            do {
                b = (b + 1) & this.c;
                j2 = jArr[b];
                if (j2 == 0) {
                    return null;
                }
            } while (j != j2);
            return this.b[b];
        }
        return this.b[b];
    }

    @Override // defpackage.dzko, java.util.Map
    public final boolean isEmpty() {
        return this.j == 0;
    }

    public final V j(int i) {
        long j;
        int i2;
        V[] vArr = this.b;
        V v = vArr[i];
        vArr[i] = null;
        this.j--;
        n(i);
        long[] jArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                j = jArr[i3];
                if (j == 0) {
                    break loop0;
                }
                int i4 = this.c;
                int b = ((int) dzgv.b(j)) & i4;
                if (i > i3) {
                    if (i >= b && b > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < b && b <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            jArr[i] = j;
            V[] vArr2 = this.b;
            vArr2[i] = vArr2[i3];
            o(i3, i);
            i = i3;
        }
        jArr[i] = 0;
        this.b[i] = null;
        if (this.j < this.i / 4 && (i2 = this.h) > 16) {
            s(i2 >> 1);
        }
        return v;
    }

    public final V k() {
        int i;
        this.d = false;
        V[] vArr = this.b;
        int i2 = this.h;
        V v = vArr[i2];
        vArr[i2] = null;
        this.j--;
        n(i2);
        if (this.j < this.i / 4 && (i = this.h) > 16) {
            s(i >> 1);
        }
        return v;
    }

    @Override // defpackage.dzkp, defpackage.dzko, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    public final V l(int i, V v) {
        V[] vArr = this.b;
        V v2 = vArr[i];
        vArr[i] = v;
        return v2;
    }

    public final void m(int i) {
        int i2;
        if (this.j == 1 || (i2 = this.f) == i) {
            return;
        }
        if (this.e == i) {
            long[] jArr = this.g;
            int i3 = (int) jArr[i];
            this.e = i3;
            jArr[i3] = (-4294967296L) | jArr[i3];
        } else {
            long[] jArr2 = this.g;
            long j = jArr2[i];
            int i4 = (int) (j >>> 32);
            int i5 = (int) j;
            long j2 = jArr2[i4];
            jArr2[i4] = j2 ^ (((j & 4294967295L) ^ j2) & 4294967295L);
            long j3 = jArr2[i5];
            jArr2[i5] = ((-4294967296L) & ((j & (-4294967296L)) ^ j3)) ^ j3;
        }
        long[] jArr3 = this.g;
        long j4 = jArr3[i2];
        jArr3[i2] = j4 ^ (((i & 4294967295L) ^ j4) & 4294967295L);
        jArr3[i] = ((i2 & 4294967295L) << 32) | 4294967295L;
        this.f = i;
    }

    protected final void n(int i) {
        if (this.j == 0) {
            this.f = -1;
            this.e = -1;
        } else if (this.e == i) {
            long[] jArr = this.g;
            int i2 = (int) jArr[i];
            this.e = i2;
            if (i2 < 0) {
                return;
            }
            jArr[i2] = (-4294967296L) | jArr[i2];
        } else if (this.f == i) {
            long[] jArr2 = this.g;
            int i3 = (int) (jArr2[i] >>> 32);
            this.f = i3;
            if (i3 < 0) {
                return;
            }
            jArr2[i3] = jArr2[i3] | 4294967295L;
        } else {
            long[] jArr3 = this.g;
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
    public final void o(int i, int i2) {
        if (this.j == 1) {
            this.f = i2;
            this.e = i2;
            this.g[i2] = -1;
        } else if (this.e == i) {
            this.e = i2;
            long[] jArr = this.g;
            int i3 = (int) jArr[i];
            long j = jArr[i3];
            jArr[i3] = ((-4294967296L) & (((4294967295L & i2) << 32) ^ j)) ^ j;
            jArr[i2] = jArr[i];
        } else if (this.f == i) {
            this.f = i2;
            long[] jArr2 = this.g;
            int i4 = (int) (jArr2[i] >>> 32);
            long j2 = jArr2[i4];
            jArr2[i4] = (4294967295L & ((i2 & 4294967295L) ^ j2)) ^ j2;
            jArr2[i2] = jArr2[i];
        } else {
            long[] jArr3 = this.g;
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

    @Override // defpackage.dzmr
    public final long p() {
        if (this.j == 0) {
            throw new NoSuchElementException();
        }
        return this.a[this.e];
    }

    @Override // defpackage.dzko, java.util.Map
    public final void putAll(Map<? extends Long, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.j + map.size()) / 0.75f))));
        if (min > this.h) {
            s(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dzmr
    public final long q() {
        if (this.j == 0) {
            throw new NoSuchElementException();
        }
        return this.a[this.f];
    }

    @Override // defpackage.dzmg
    /* renamed from: r */
    public final dzmq<V> v() {
        if (this.k == null) {
            this.k = new dzma(this);
        }
        return this.k;
    }

    public final void s(int i) {
        int b;
        long[] jArr;
        V[] vArr;
        long[] jArr2 = this.a;
        V[] vArr2 = this.b;
        int i2 = i - 1;
        int i3 = i + 1;
        long[] jArr3 = new long[i3];
        V[] vArr3 = (V[]) new Object[i3];
        int i4 = this.e;
        long[] jArr4 = this.g;
        long[] jArr5 = new long[i3];
        this.e = -1;
        int i5 = this.j;
        int i6 = -1;
        int i7 = -1;
        while (true) {
            int i8 = i5 - 1;
            if (i5 == 0) {
                break;
            }
            long j = jArr2[i4];
            if (j == 0) {
                b = i;
            } else {
                b = ((int) dzgv.b(j)) & i2;
                while (jArr3[b] != 0) {
                    b = (b + 1) & i2;
                }
            }
            jArr3[b] = jArr2[i4];
            vArr3[b] = vArr2[i4];
            if (i7 != -1) {
                long j2 = jArr5[i6];
                long[] jArr6 = jArr2;
                vArr = vArr2;
                jArr5[i6] = j2 ^ ((j2 ^ (b & 4294967295L)) & 4294967295L);
                long j3 = jArr5[b];
                jArr = jArr6;
                jArr5[b] = j3 ^ ((((i6 & 4294967295L) << 32) ^ j3) & (-4294967296L));
            } else {
                jArr = jArr2;
                vArr = vArr2;
                this.e = b;
                jArr5[b] = -1;
            }
            i6 = b;
            i5 = i8;
            jArr2 = jArr;
            int i9 = i4;
            i4 = (int) jArr4[i4];
            vArr2 = vArr;
            i7 = i9;
        }
        this.g = jArr5;
        this.f = i6;
        if (i6 != -1) {
            jArr5[i6] = jArr5[i6] | 4294967295L;
        }
        this.h = i;
        this.c = i2;
        this.i = dzgv.f(i, 0.75f);
        this.a = jArr3;
        this.b = vArr3;
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.j;
    }

    /* renamed from: t */
    public final dzmd<V> clone() {
        try {
            dzmd<V> dzmdVar = (dzmd) super.clone();
            dzmdVar.l = null;
            dzmdVar.m = null;
            dzmdVar.k = null;
            dzmdVar.d = this.d;
            dzmdVar.a = (long[]) this.a.clone();
            dzmdVar.b = (V[]) ((Object[]) this.b.clone());
            dzmdVar.g = (long[]) this.g.clone();
            return dzmdVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzkp, defpackage.dzko, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // defpackage.dzmr
    public final dzmr<V> w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzmr
    public final dzmr<V> x() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzmr
    public final dzmr<V> y() {
        throw new UnsupportedOperationException();
    }

    public final void z() {
        int g = dzgv.g(this.j, 0.75f);
        if (g < this.h && this.j <= dzgv.f(g, 0.75f)) {
            try {
                s(g);
            } catch (OutOfMemoryError unused) {
            }
        }
    }

    @Override // defpackage.dzko, java.util.Map
    public final int hashCode() {
        long j;
        int i = this.d ? this.j - 1 : this.j;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = i - 1;
            if (i == 0) {
                break;
            }
            while (true) {
                j = this.a[i3];
                if (j != 0) {
                    break;
                }
                i3++;
            }
            int d = dzgv.d(j);
            V v = this.b[i3];
            if (this != v) {
                d ^= v == null ? 0 : v.hashCode();
            }
            i4 += d;
            i3++;
            i = i5;
        }
        if (this.d) {
            V v2 = this.b[this.h];
            if (v2 != null) {
                i2 = v2.hashCode();
            }
            return i4 + i2;
        }
        return i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0075  */
    @Override // defpackage.dzkn, defpackage.dzlt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V a(long r11, V r13) {
        /*
            r10 = this;
            r0 = -1
            r1 = 0
            r3 = 1
            int r4 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r4 != 0) goto L15
            boolean r1 = r10.d
            if (r1 == 0) goto L10
            int r0 = r10.h
            goto L7f
        L10:
            r10.d = r3
            int r1 = r10.h
            goto L3a
        L15:
            long[] r4 = r10.a
            long r5 = defpackage.dzgv.b(r11)
            int r6 = (int) r5
            int r5 = r10.c
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L39
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 == 0) goto L37
        L29:
            int r5 = r5 + r3
            int r6 = r10.c
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L39
            int r8 = (r6 > r11 ? 1 : (r6 == r11 ? 0 : -1))
            if (r8 != 0) goto L29
        L37:
            r0 = r5
            goto L7f
        L39:
            r1 = r5
        L3a:
            long[] r2 = r10.a
            r2[r1] = r11
            V[] r11 = r10.b
            r11[r1] = r13
            int r11 = r10.j
            if (r11 != 0) goto L51
            r10.f = r1
            r10.e = r1
            long[] r12 = r10.g
            r4 = -1
            r12[r1] = r4
            goto L6d
        L51:
            long[] r12 = r10.g
            int r2 = r10.f
            r4 = r12[r2]
            long r6 = (long) r1
            r8 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r8
            long r6 = r6 ^ r4
            long r6 = r6 & r8
            long r4 = r4 ^ r6
            r12[r2] = r4
            long r4 = (long) r2
            long r4 = r4 & r8
            r2 = 32
            long r4 = r4 << r2
            long r4 = r4 | r8
            r12[r1] = r4
            r10.f = r1
        L6d:
            int r12 = r11 + 1
            r10.j = r12
            int r1 = r10.i
            if (r11 < r1) goto L7f
            int r12 = r12 + r3
            r11 = 1061158912(0x3f400000, float:0.75)
            int r11 = defpackage.dzgv.g(r12, r11)
            r10.s(r11)
        L7f:
            if (r0 >= 0) goto L83
            r11 = 0
            return r11
        L83:
            V[] r11 = r10.b
            r12 = r11[r0]
            r11[r0] = r13
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzmd.a(long, java.lang.Object):java.lang.Object");
    }
}
