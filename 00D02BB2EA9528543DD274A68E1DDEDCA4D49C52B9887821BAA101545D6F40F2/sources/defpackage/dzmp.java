package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzmp  reason: default package */
/* loaded from: classes.dex */
public final class dzmp<V> extends dzko<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient long[] a;
    protected transient V[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected int g;
    protected transient dzmf<V> h;
    protected transient dznf i;
    protected transient dzrj<V> j;

    public dzmp() {
        int g = dzgv.g(16, 0.75f);
        this.e = g;
        this.c = g - 1;
        this.f = dzgv.f(g, 0.75f);
        int i = this.e + 1;
        this.a = new long[i];
        this.b = (V[]) new Object[i];
    }

    private final int m() {
        return this.d ? this.g - 1 : this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        int i2;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.g, 0.75f);
        this.e = g;
        this.f = dzgv.f(g, 0.75f);
        int i3 = this.e;
        this.c = i3 - 1;
        int i4 = i3 + 1;
        long[] jArr = new long[i4];
        this.a = jArr;
        V[] vArr = (V[]) new Object[i4];
        this.b = vArr;
        int i5 = this.g;
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                long readLong = objectInputStream.readLong();
                Object readObject = objectInputStream.readObject();
                if (readLong == 0) {
                    i2 = this.e;
                    this.d = true;
                } else {
                    int b = (int) dzgv.b(readLong);
                    int i7 = this.c;
                    while (true) {
                        i = i7 & b;
                        if (jArr[i] == 0) {
                            break;
                        }
                        i7 = i + 1;
                        b = this.c;
                    }
                    i2 = i;
                }
                jArr[i2] = readLong;
                vArr[i2] = readObject;
                i5 = i6;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        long[] jArr = this.a;
        V[] vArr = this.b;
        dzmn dzmnVar = new dzmn(this);
        objectOutputStream.defaultWriteObject();
        int i = this.g;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int a = dzmnVar.a();
                objectOutputStream.writeLong(jArr[a]);
                objectOutputStream.writeObject(vArr[a]);
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
            return j();
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
            return h(b);
        }
        return h(b);
    }

    @Override // defpackage.dzkn, defpackage.dzgu
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.d = false;
        Arrays.fill(this.a, 0L);
        Arrays.fill(this.b, (Object) null);
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
            int r2 = r9.e
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
            int r2 = r9.e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzmp.containsValue(java.lang.Object):boolean");
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

    @Override // defpackage.dzko, defpackage.dzmg
    public final dznf e() {
        if (this.i == null) {
            this.i = new dzmk(this);
        }
        return this.i;
    }

    @Override // defpackage.dzko, defpackage.dzmg
    public final dzrj<V> f() {
        if (this.j == null) {
            this.j = new dzmh(this);
        }
        return this.j;
    }

    public final V h(int i) {
        long j;
        int i2;
        V[] vArr = this.b;
        V v = vArr[i];
        vArr[i] = null;
        this.g--;
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
            i = i3;
        }
        jArr[i] = 0;
        this.b[i] = null;
        if (this.g < this.f / 4 && (i2 = this.e) > 16) {
            k(i2 >> 1);
        }
        return v;
    }

    @Override // defpackage.dzko, java.util.Map
    public final int hashCode() {
        long j;
        int m = m();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            int i4 = m - 1;
            if (m == 0) {
                break;
            }
            while (true) {
                j = this.a[i2];
                if (j != 0) {
                    break;
                }
                i2++;
            }
            int d = dzgv.d(j);
            V v = this.b[i2];
            if (this != v) {
                d ^= v == null ? 0 : v.hashCode();
            }
            i3 += d;
            i2++;
            m = i4;
        }
        if (this.d) {
            V v2 = this.b[this.e];
            if (v2 != null) {
                i = v2.hashCode();
            }
            return i3 + i;
        }
        return i3;
    }

    @Override // defpackage.dzlt
    public final V i(long j) {
        long j2;
        if (j == 0) {
            if (!this.d) {
                return null;
            }
            return this.b[this.e];
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
        return this.g == 0;
    }

    public final V j() {
        this.d = false;
        V[] vArr = this.b;
        int i = this.e;
        V v = vArr[i];
        vArr[i] = null;
        int i2 = this.g - 1;
        this.g = i2;
        if (i2 < this.f / 4 && i > 16) {
            k(i >> 1);
        }
        return v;
    }

    protected final void k(int i) {
        long j;
        long[] jArr = this.a;
        V[] vArr = this.b;
        int i2 = i - 1;
        int i3 = i + 1;
        long[] jArr2 = new long[i3];
        V[] vArr2 = (V[]) new Object[i3];
        int i4 = this.e;
        int m = m();
        while (true) {
            int i5 = m - 1;
            if (m != 0) {
                do {
                    i4--;
                    j = jArr[i4];
                } while (j == 0);
                int b = ((int) dzgv.b(j)) & i2;
                if (jArr2[b] != 0) {
                    do {
                        b = (b + 1) & i2;
                    } while (jArr2[b] != 0);
                }
                jArr2[b] = jArr[i4];
                vArr2[b] = vArr[i4];
                m = i5;
            } else {
                vArr2[i] = vArr[this.e];
                this.e = i;
                this.c = i2;
                this.f = dzgv.f(i, 0.75f);
                this.a = jArr2;
                this.b = vArr2;
                return;
            }
        }
    }

    @Override // defpackage.dzko, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Long> keySet() {
        return keySet();
    }

    /* renamed from: l */
    public final dzmp<V> clone() {
        try {
            dzmp<V> dzmpVar = (dzmp) super.clone();
            dzmpVar.i = null;
            dzmpVar.j = null;
            dzmpVar.h = null;
            dzmpVar.d = this.d;
            dzmpVar.a = (long[]) this.a.clone();
            dzmpVar.b = (V[]) ((Object[]) this.b.clone());
            return dzmpVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzko, java.util.Map
    public final void putAll(Map<? extends Long, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.g + map.size()) / 0.75f))));
        if (min > this.e) {
            k(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.dzmg
    public final /* bridge */ /* synthetic */ dzrv v() {
        if (this.h == null) {
            this.h = new dzmm(this);
        }
        return this.h;
    }

    @Override // defpackage.dzko, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    @Override // defpackage.dzkn, defpackage.dzlt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V a(long r10, V r12) {
        /*
            r9 = this;
            r0 = -1
            r1 = 0
            r3 = 1
            int r4 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r4 != 0) goto L14
            boolean r1 = r9.d
            if (r1 == 0) goto Lf
            int r0 = r9.e
            goto L55
        Lf:
            r9.d = r3
            int r1 = r9.e
            goto L39
        L14:
            long[] r4 = r9.a
            long r5 = defpackage.dzgv.b(r10)
            int r6 = (int) r5
            int r5 = r9.c
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L38
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 == 0) goto L36
        L28:
            int r5 = r5 + r3
            int r6 = r9.c
            r5 = r5 & r6
            r6 = r4[r5]
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 == 0) goto L38
            int r8 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r8 != 0) goto L28
        L36:
            r0 = r5
            goto L55
        L38:
            r1 = r5
        L39:
            long[] r2 = r9.a
            r2[r1] = r10
            V[] r10 = r9.b
            r10[r1] = r12
            int r10 = r9.g
            int r11 = r10 + 1
            r9.g = r11
            int r1 = r9.f
            if (r10 < r1) goto L55
            int r11 = r11 + r3
            r10 = 1061158912(0x3f400000, float:0.75)
            int r10 = defpackage.dzgv.g(r11, r10)
            r9.k(r10)
        L55:
            if (r0 >= 0) goto L59
            r10 = 0
            return r10
        L59:
            V[] r10 = r9.b
            r11 = r10[r0]
            r10[r0] = r12
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzmp.a(long, java.lang.Object):java.lang.Object");
    }
}
