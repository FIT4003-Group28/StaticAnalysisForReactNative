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
/* renamed from: dzjg  reason: default package */
/* loaded from: classes.dex */
public final class dzjg<V> extends dzhy<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    public transient V[] b;
    protected transient int c;
    public transient boolean d;
    public transient int e = -1;
    protected transient int f = -1;
    public transient long[] g;
    public transient int h;
    public transient int i;
    public int j;
    protected transient dzjt<V> k;
    protected transient dzkh l;
    protected transient dzrj<V> m;

    public dzjg() {
        int g = dzgv.g(16, 0.75f);
        this.h = g;
        this.c = g - 1;
        this.i = dzgv.f(g, 0.75f);
        int i = this.h + 1;
        this.a = new int[i];
        this.b = (V[]) new Object[i];
        this.g = new long[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        int[] iArr;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.j, 0.75f);
        this.h = g;
        this.i = dzgv.f(g, 0.75f);
        int i2 = this.h;
        this.c = i2 - 1;
        boolean z = true;
        int i3 = i2 + 1;
        int[] iArr2 = new int[i3];
        this.a = iArr2;
        V[] vArr = (V[]) new Object[i3];
        this.b = vArr;
        long[] jArr = new long[i3];
        this.g = jArr;
        this.f = -1;
        this.e = -1;
        int i4 = this.j;
        int i5 = -1;
        while (true) {
            int i6 = i4 - 1;
            if (i4 == 0) {
                break;
            }
            int readInt = objectInputStream.readInt();
            Object readObject = objectInputStream.readObject();
            if (readInt != 0) {
                int a = dzgv.a(readInt);
                int i7 = this.c;
                while (true) {
                    i = a & i7;
                    if (iArr2[i] == 0) {
                        break;
                    }
                    a = i + 1;
                    i7 = this.c;
                }
            } else {
                i = this.h;
                this.d = z;
            }
            iArr2[i] = readInt;
            vArr[i] = readObject;
            if (this.e != -1) {
                long j = jArr[i5];
                iArr = iArr2;
                jArr[i5] = (((i & 4294967295L) ^ j) & 4294967295L) ^ j;
                long j2 = jArr[i];
                jArr[i] = j2 ^ ((((i5 & 4294967295L) << 32) ^ j2) & (-4294967296L));
            } else {
                iArr = iArr2;
                this.e = i;
                jArr[i] = jArr[i] | (-4294967296L);
            }
            i4 = i6;
            iArr2 = iArr;
            i5 = i;
            z = true;
        }
        this.f = i5;
        if (i5 != -1) {
            jArr[i5] = jArr[i5] | 4294967295L;
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int[] iArr = this.a;
        V[] vArr = this.b;
        dzje dzjeVar = new dzje(this);
        objectOutputStream.defaultWriteObject();
        int i = this.j;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int c = dzjeVar.c();
                objectOutputStream.writeInt(iArr[c]);
                objectOutputStream.writeObject(vArr[c]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzhv, defpackage.dziw
    public final V b(int i) {
        int i2;
        if (i == 0) {
            if (!this.d) {
                return null;
            }
            return l();
        }
        int[] iArr = this.a;
        int a = dzgv.a(i) & this.c;
        int i3 = iArr[a];
        if (i3 == 0) {
            return null;
        }
        if (i != i3) {
            do {
                a = (a + 1) & this.c;
                i2 = iArr[a];
                if (i2 == 0) {
                    return null;
                }
            } while (i != i2);
            return j(a);
        }
        return j(a);
    }

    @Override // defpackage.dzhv, defpackage.dzgu
    public final void clear() {
        if (this.j == 0) {
            return;
        }
        this.j = 0;
        this.d = false;
        Arrays.fill(this.a, 0);
        Arrays.fill(this.b, (Object) null);
        this.f = -1;
        this.e = -1;
    }

    @Override // java.util.SortedMap
    public final /* bridge */ /* synthetic */ Comparator<? super Integer> comparator() {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0031, code lost:
        return true;
     */
    @Override // defpackage.dzhx, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean containsValue(java.lang.Object r6) {
        /*
            r5 = this;
            V[] r0 = r5.b
            int[] r1 = r5.a
            boolean r2 = r5.d
            r3 = 1
            if (r2 == 0) goto L19
            int r2 = r5.h
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
            int r2 = r5.h
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjg.containsValue(java.lang.Object):boolean");
    }

    @Override // defpackage.dzhx, defpackage.dziw
    public final boolean d(int i) {
        int i2;
        if (i == 0) {
            return this.d;
        }
        int[] iArr = this.a;
        int a = dzgv.a(i) & this.c;
        int i3 = iArr[a];
        if (i3 == 0) {
            return false;
        }
        if (i == i3) {
            return true;
        }
        do {
            a = (a + 1) & this.c;
            i2 = iArr[a];
            if (i2 == 0) {
                return false;
            }
        } while (i != i2);
        return true;
    }

    @Override // defpackage.dzhx
    public final /* bridge */ /* synthetic */ dzkg e() {
        return keySet();
    }

    @Override // defpackage.dzhx
    public final dzrj<V> f() {
        if (this.m == null) {
            this.m = new dzix(this);
        }
        return this.m;
    }

    @Override // defpackage.dzhy
    public final dzkh h() {
        if (this.l == null) {
            this.l = new dzjb(this);
        }
        return this.l;
    }

    @Override // defpackage.dziw
    public final V i(int i) {
        int i2;
        if (i == 0) {
            if (!this.d) {
                return null;
            }
            return this.b[this.h];
        }
        int[] iArr = this.a;
        int a = dzgv.a(i) & this.c;
        int i3 = iArr[a];
        if (i3 == 0) {
            return null;
        }
        if (i != i3) {
            do {
                a = (a + 1) & this.c;
                i2 = iArr[a];
                if (i2 == 0) {
                    return null;
                }
            } while (i != i2);
            return this.b[a];
        }
        return this.b[a];
    }

    @Override // defpackage.dzhx, java.util.Map
    public final boolean isEmpty() {
        return this.j == 0;
    }

    public final V j(int i) {
        int i2;
        V[] vArr = this.b;
        V v = vArr[i];
        vArr[i] = null;
        this.j--;
        n(i);
        m(i);
        if (this.j < this.i / 4 && (i2 = this.h) > 16) {
            s(i2 >> 1);
        }
        return v;
    }

    @Override // defpackage.dzhy, defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    public final V l() {
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

    public final void m(int i) {
        int i2;
        int[] iArr = this.a;
        while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                i2 = iArr[i3];
                if (i2 == 0) {
                    iArr[i] = 0;
                    this.b[i] = null;
                    return;
                }
                int i4 = this.c;
                int a = dzgv.a(i2) & i4;
                if (i > i3) {
                    if (i >= a && a > i3) {
                        break;
                    }
                    i3 = (i3 + 1) & i4;
                } else if (i < a && a <= i3) {
                    i3 = (i3 + 1) & i4;
                }
            }
            iArr[i] = i2;
            V[] vArr = this.b;
            vArr[i] = vArr[i3];
            o(i3, i);
            i = i3;
        }
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

    @Override // defpackage.dzju
    public final int p() {
        if (this.j == 0) {
            throw new NoSuchElementException();
        }
        return this.a[this.e];
    }

    @Override // defpackage.dzhx, java.util.Map
    public final void putAll(Map<? extends Integer, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.j + map.size()) / 0.75f))));
        if (min > this.h) {
            s(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dzju
    public final int q() {
        if (this.j == 0) {
            throw new NoSuchElementException();
        }
        return this.a[this.f];
    }

    @Override // defpackage.dzju
    /* renamed from: r */
    public final dzjt<V> u() {
        if (this.k == null) {
            this.k = new dzjd(this);
        }
        return this.k;
    }

    public final void s(int i) {
        int i2;
        int[] iArr;
        V[] vArr;
        int[] iArr2 = this.a;
        V[] vArr2 = this.b;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr3 = new int[i4];
        V[] vArr3 = (V[]) new Object[i4];
        int i5 = this.e;
        long[] jArr = this.g;
        long[] jArr2 = new long[i4];
        int i6 = -1;
        this.e = -1;
        int i7 = this.j;
        int i8 = -1;
        int i9 = -1;
        while (true) {
            int i10 = i7 - 1;
            if (i7 == 0) {
                break;
            }
            int i11 = iArr2[i5];
            if (i11 != 0) {
                int a = dzgv.a(i11);
                while (true) {
                    i2 = a & i3;
                    if (iArr3[i2] == 0) {
                        break;
                    }
                    a = i2 + 1;
                }
            } else {
                i2 = i;
            }
            iArr3[i2] = iArr2[i5];
            vArr3[i2] = vArr2[i5];
            if (i9 != i6) {
                long j = jArr2[i8];
                iArr = iArr2;
                vArr = vArr2;
                jArr2[i8] = j ^ ((j ^ (i2 & 4294967295L)) & 4294967295L);
                long j2 = jArr2[i2];
                int i12 = i2;
                jArr2[i12] = j2 ^ ((((i8 & 4294967295L) << 32) ^ j2) & (-4294967296L));
                i2 = i12;
            } else {
                iArr = iArr2;
                vArr = vArr2;
                this.e = i2;
                jArr2[i2] = -1;
            }
            i8 = i2;
            iArr2 = iArr;
            i7 = i10;
            i6 = -1;
            i9 = i5;
            i5 = (int) jArr[i5];
            vArr2 = vArr;
        }
        this.g = jArr2;
        this.f = i8;
        if (i8 != -1) {
            jArr2[i8] = jArr2[i8] | 4294967295L;
        }
        this.h = i;
        this.c = i3;
        this.i = dzgv.f(i, 0.75f);
        this.a = iArr3;
        this.b = vArr3;
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.j;
    }

    /* renamed from: t */
    public final dzjg<V> clone() {
        try {
            dzjg<V> dzjgVar = (dzjg) super.clone();
            dzjgVar.l = null;
            dzjgVar.m = null;
            dzjgVar.k = null;
            dzjgVar.d = this.d;
            dzjgVar.a = (int[]) this.a.clone();
            dzjgVar.b = (V[]) ((Object[]) this.b.clone());
            dzjgVar.g = (long[]) this.g.clone();
            return dzjgVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzju
    public final dzju<V> v() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzhy, defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    @Override // defpackage.dzju
    public final dzju<V> w() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzju
    public final dzju<V> x() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.dzhx, java.util.Map
    public final int hashCode() {
        int i;
        int i2 = this.d ? this.j - 1 : this.j;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (true) {
            int i6 = i2 - 1;
            if (i2 == 0) {
                break;
            }
            while (true) {
                i = this.a[i4];
                if (i != 0) {
                    break;
                }
                i4++;
            }
            V v = this.b[i4];
            if (this != v) {
                i ^= v == null ? 0 : v.hashCode();
            }
            i5 += i;
            i4++;
            i2 = i6;
        }
        if (this.d) {
            V v2 = this.b[this.h];
            if (v2 != null) {
                i3 = v2.hashCode();
            }
            return i5 + i3;
        }
        return i5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0068  */
    @Override // defpackage.dzhv, defpackage.dziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V a(int r12, V r13) {
        /*
            r11 = this;
            r0 = -1
            r1 = 1
            if (r12 != 0) goto L10
            boolean r2 = r11.d
            if (r2 == 0) goto Lb
            int r0 = r11.h
            goto L72
        Lb:
            r11.d = r1
            int r2 = r11.h
            goto L2d
        L10:
            int[] r2 = r11.a
            int r3 = defpackage.dzgv.a(r12)
            int r4 = r11.c
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r12) goto L21
        L1f:
            r0 = r3
            goto L72
        L21:
            int r3 = r3 + r1
            int r4 = r11.c
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r12) goto L21
            goto L1f
        L2c:
            r2 = r3
        L2d:
            int[] r3 = r11.a
            r3[r2] = r12
            V[] r12 = r11.b
            r12[r2] = r13
            int r12 = r11.j
            if (r12 != 0) goto L44
            r11.f = r2
            r11.e = r2
            long[] r3 = r11.g
            r4 = -1
            r3[r2] = r4
            goto L60
        L44:
            long[] r3 = r11.g
            int r4 = r11.f
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
            r11.f = r2
        L60:
            int r2 = r12 + 1
            r11.j = r2
            int r3 = r11.i
            if (r12 < r3) goto L72
            int r2 = r2 + r1
            r12 = 1061158912(0x3f400000, float:0.75)
            int r12 = defpackage.dzgv.g(r2, r12)
            r11.s(r12)
        L72:
            if (r0 >= 0) goto L76
            r12 = 0
            return r12
        L76:
            V[] r12 = r11.b
            r1 = r12[r0]
            r12[r0] = r13
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjg.a(int, java.lang.Object):java.lang.Object");
    }
}
