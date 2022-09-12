package defpackage;

import java.util.Arrays;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcls  reason: default package */
/* loaded from: classes.dex */
public final class dcls<K> {
    transient Object[] a;
    transient int[] b;
    transient int c;
    transient int d;
    public transient int[] e;
    transient long[] f;
    private transient float g;
    private transient int h;

    public dcls() {
        m(3);
    }

    private static int[] o(int i) {
        int[] iArr = new int[i];
        Arrays.fill(iArr, -1);
        return iArr;
    }

    private final int p() {
        return this.e.length - 1;
    }

    private static int q(long j) {
        return (int) (j >>> 32);
    }

    private static long r(long j, int i) {
        return (j & (-4294967296L)) | (i & 4294967295L);
    }

    private final void s(int i) {
        if (this.e.length >= 1073741824) {
            this.h = Integer.MAX_VALUE;
            return;
        }
        int i2 = ((int) (i * this.g)) + 1;
        int[] o = o(i);
        long[] jArr = this.f;
        int length = o.length - 1;
        for (int i3 = 0; i3 < this.c; i3++) {
            int q = q(jArr[i3]);
            int i4 = q & length;
            int i5 = o[i4];
            o[i4] = i3;
            jArr[i3] = (q << 32) | (i5 & 4294967295L);
        }
        this.h = i2;
        this.e = o;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a() {
        return this.c == 0 ? -1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int b(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final K c(int i) {
        dbsk.z(i, this.c);
        return (K) this.a[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int d(int i) {
        dbsk.z(i, this.c);
        return this.b[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e(int i, int i2) {
        dbsk.z(i, this.c);
        this.b[i] = i2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final dcla<K> f(int i) {
        dbsk.z(i, this.c);
        return new dclr(this, i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(int i) {
        if (i > this.f.length) {
            h(i);
        }
        if (i >= this.h) {
            int highestOneBit = Integer.highestOneBit(i - 1);
            s(Math.max(2, highestOneBit + highestOneBit));
        }
    }

    final void h(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] copyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(copyOf, length, i, -1L);
        }
        this.f = copyOf;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int i(Object obj) {
        int b = dccj.b(obj);
        int i = this.e[p() & b];
        while (i != -1) {
            long j = this.f[i];
            if (q(j) == b && dbsd.a(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public final int j(Object obj) {
        int i = i(obj);
        if (i == -1) {
            return 0;
        }
        return this.b[i];
    }

    public final int k(Object obj, int i) {
        long[] jArr;
        long j;
        int p = p() & i;
        int i2 = this.e[p];
        if (i2 != -1) {
            int i3 = -1;
            while (true) {
                if (q(this.f[i2]) != i || !dbsd.a(obj, this.a[i2])) {
                    int i4 = (int) this.f[i2];
                    if (i4 == -1) {
                        break;
                    }
                    i3 = i2;
                    i2 = i4;
                } else {
                    int i5 = this.b[i2];
                    if (i3 == -1) {
                        this.e[p] = (int) this.f[i2];
                    } else {
                        long[] jArr2 = this.f;
                        jArr2[i3] = r(jArr2[i3], (int) jArr2[i2]);
                    }
                    int i6 = this.c - 1;
                    if (i2 < i6) {
                        Object[] objArr = this.a;
                        objArr[i2] = objArr[i6];
                        int[] iArr = this.b;
                        iArr[i2] = iArr[i6];
                        objArr[i6] = null;
                        iArr[i6] = 0;
                        long[] jArr3 = this.f;
                        long j2 = jArr3[i6];
                        jArr3[i2] = j2;
                        jArr3[i6] = -1;
                        int q = q(j2) & p();
                        int[] iArr2 = this.e;
                        int i7 = iArr2[q];
                        if (i7 != i6) {
                            while (true) {
                                jArr = this.f;
                                j = jArr[i7];
                                int i8 = (int) j;
                                if (i8 == i6) {
                                    break;
                                }
                                i7 = i8;
                            }
                            jArr[i7] = r(j, i2);
                        } else {
                            iArr2[q] = i2;
                        }
                    } else {
                        this.a[i2] = null;
                        this.b[i2] = 0;
                        this.f[i2] = -1;
                    }
                    this.c--;
                    this.d++;
                    return i5;
                }
            }
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int l(int i) {
        return k(this.a[i], q(this.f[i]));
    }

    final void m(int i) {
        dbsk.b(i >= 0, "Initial capacity must be non-negative");
        dbsk.b(true, "Illegal load factor");
        int c = dccj.c(i);
        this.e = o(c);
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, c);
    }

    public final void n(K k, int i) {
        dbzb.b(i, "count");
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int b = dccj.b(k);
        int p = p() & b;
        int i2 = this.c;
        int[] iArr2 = this.e;
        int i3 = iArr2[p];
        if (i3 == -1) {
            iArr2[p] = i2;
        } else {
            while (true) {
                long j = jArr[i3];
                if (q(j) == b && dbsd.a(k, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return;
                }
                int i5 = (int) j;
                if (i5 == -1) {
                    jArr[i3] = r(j, i2);
                    break;
                }
                i3 = i5;
            }
        }
        int i6 = Integer.MAX_VALUE;
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i7 = i2 + 1;
        int length = this.f.length;
        if (i7 > length) {
            int max = Math.max(1, length >>> 1) + length;
            if (max >= 0) {
                i6 = max;
            }
            if (i6 != length) {
                h(i6);
            }
        }
        this.f[i2] = (b << 32) | 4294967295L;
        this.a[i2] = k;
        this.b[i2] = i;
        this.c = i7;
        if (i2 >= this.h) {
            int length2 = this.e.length;
            s(length2 + length2);
        }
        this.d++;
    }

    public dcls(int i) {
        m(i);
    }

    public dcls(dcls<? extends K> dclsVar) {
        m(dclsVar.c);
        int a = dclsVar.a();
        while (a != -1) {
            n(dclsVar.c(a), dclsVar.d(a));
            a = dclsVar.b(a);
        }
    }
}
