package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzjs  reason: default package */
/* loaded from: classes.dex */
public final class dzjs<V> extends dzhx<V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient int[] a;
    protected transient V[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    public int g;
    protected transient dzji<V> h;
    protected transient dzkg i;
    protected transient dzrj<V> j;

    public dzjs() {
        this(16, null);
    }

    private final int o() {
        return this.d ? this.g - 1 : this.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.g, 0.75f);
        this.e = g;
        this.f = dzgv.f(g, 0.75f);
        int i2 = this.e;
        this.c = i2 - 1;
        int i3 = i2 + 1;
        int[] iArr = new int[i3];
        this.a = iArr;
        V[] vArr = (V[]) new Object[i3];
        this.b = vArr;
        int i4 = this.g;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                int readInt = objectInputStream.readInt();
                Object readObject = objectInputStream.readObject();
                if (readInt == 0) {
                    i = this.e;
                    this.d = true;
                } else {
                    int a = dzgv.a(readInt);
                    int i6 = this.c;
                    while (true) {
                        i = a & i6;
                        if (iArr[i] != 0) {
                            a = i + 1;
                            i6 = this.c;
                        }
                    }
                }
                iArr[i] = readInt;
                vArr[i] = readObject;
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        int[] iArr = this.a;
        V[] vArr = this.b;
        dzjq dzjqVar = new dzjq(this);
        objectOutputStream.defaultWriteObject();
        int i = this.g;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int b = dzjqVar.b();
                objectOutputStream.writeInt(iArr[b]);
                objectOutputStream.writeObject(vArr[b]);
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
            return j();
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
            return h(a);
        }
        return h(a);
    }

    @Override // defpackage.dzhv, defpackage.dzgu
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.d = false;
        Arrays.fill(this.a, 0);
        Arrays.fill(this.b, (Object) null);
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
            int r2 = r5.e
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
            int r2 = r5.e
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjs.containsValue(java.lang.Object):boolean");
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
    public final dzkg e() {
        if (this.i == null) {
            this.i = new dzjn(this);
        }
        return this.i;
    }

    @Override // defpackage.dzhx
    public final dzrj<V> f() {
        if (this.j == null) {
            this.j = new dzjk(this);
        }
        return this.j;
    }

    public final V h(int i) {
        int i2;
        int i3;
        V[] vArr = this.b;
        V v = vArr[i];
        vArr[i] = null;
        this.g--;
        int[] iArr = this.a;
        loop0: while (true) {
            int i4 = (i + 1) & this.c;
            while (true) {
                i2 = iArr[i4];
                if (i2 == 0) {
                    break loop0;
                }
                int i5 = this.c;
                int a = dzgv.a(i2) & i5;
                if (i > i4) {
                    if (i >= a && a > i4) {
                        break;
                    }
                    i4 = (i4 + 1) & i5;
                } else if (i < a && a <= i4) {
                    i4 = (i4 + 1) & i5;
                }
            }
            iArr[i] = i2;
            V[] vArr2 = this.b;
            vArr2[i] = vArr2[i4];
            i = i4;
        }
        iArr[i] = 0;
        this.b[i] = null;
        if (this.g < this.f / 4 && (i3 = this.e) > 16) {
            m(i3 >> 1);
        }
        return v;
    }

    @Override // defpackage.dzhx, java.util.Map
    public final int hashCode() {
        int i;
        int o = o();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = o - 1;
            if (o == 0) {
                break;
            }
            while (true) {
                i = this.a[i3];
                if (i != 0) {
                    break;
                }
                i3++;
            }
            V v = this.b[i3];
            if (this != v) {
                i ^= v == null ? 0 : v.hashCode();
            }
            i4 += i;
            i3++;
            o = i5;
        }
        if (this.d) {
            V v2 = this.b[this.e];
            if (v2 != null) {
                i2 = v2.hashCode();
            }
            return i4 + i2;
        }
        return i4;
    }

    @Override // defpackage.dziw
    public final V i(int i) {
        int i2;
        if (i == 0) {
            if (!this.d) {
                return null;
            }
            return this.b[this.e];
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
            m(i >> 1);
        }
        return v;
    }

    @Override // defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Set<Integer> keySet() {
        return keySet();
    }

    @Override // defpackage.dzjj
    /* renamed from: l */
    public final dzji<V> k() {
        if (this.h == null) {
            this.h = new dzjp(this);
        }
        return this.h;
    }

    protected final void m(int i) {
        int i2;
        int[] iArr = this.a;
        V[] vArr = this.b;
        int i3 = i - 1;
        int i4 = i + 1;
        int[] iArr2 = new int[i4];
        V[] vArr2 = (V[]) new Object[i4];
        int i5 = this.e;
        int o = o();
        while (true) {
            int i6 = o - 1;
            if (o != 0) {
                do {
                    i5--;
                    i2 = iArr[i5];
                } while (i2 == 0);
                int a = dzgv.a(i2) & i3;
                if (iArr2[a] != 0) {
                    do {
                        a = (a + 1) & i3;
                    } while (iArr2[a] != 0);
                }
                iArr2[a] = iArr[i5];
                vArr2[a] = vArr[i5];
                o = i6;
            } else {
                vArr2[i] = vArr[this.e];
                this.e = i;
                this.c = i3;
                this.f = dzgv.f(i, 0.75f);
                this.a = iArr2;
                this.b = vArr2;
                return;
            }
        }
    }

    /* renamed from: n */
    public final dzjs<V> clone() {
        try {
            dzjs<V> dzjsVar = (dzjs) super.clone();
            dzjsVar.i = null;
            dzjsVar.j = null;
            dzjsVar.h = null;
            dzjsVar.d = this.d;
            dzjsVar.a = (int[]) this.a.clone();
            dzjsVar.b = (V[]) ((Object[]) this.b.clone());
            return dzjsVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dzhx, java.util.Map
    public final void putAll(Map<? extends Integer, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.g + map.size()) / 0.75f))));
        if (min > this.e) {
            m(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.dzhx, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public dzjs(int i) {
        this(i, null);
    }

    public dzjs(int i, byte[] bArr) {
        if (i < 0) {
            throw new IllegalArgumentException("The expected number of elements must be nonnegative");
        }
        int g = dzgv.g(i, 0.75f);
        this.e = g;
        this.c = g - 1;
        this.f = dzgv.f(g, 0.75f);
        int i2 = this.e + 1;
        this.a = new int[i2];
        this.b = (V[]) new Object[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003f  */
    @Override // defpackage.dzhv, defpackage.dziw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V a(int r6, V r7) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 != 0) goto L10
            boolean r2 = r5.d
            if (r2 == 0) goto Lb
            int r0 = r5.e
            goto L49
        Lb:
            r5.d = r1
            int r2 = r5.e
            goto L2d
        L10:
            int[] r2 = r5.a
            int r3 = defpackage.dzgv.a(r6)
            int r4 = r5.c
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r6) goto L21
        L1f:
            r0 = r3
            goto L49
        L21:
            int r3 = r3 + r1
            int r4 = r5.c
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L2c
            if (r4 != r6) goto L21
            goto L1f
        L2c:
            r2 = r3
        L2d:
            int[] r3 = r5.a
            r3[r2] = r6
            V[] r6 = r5.b
            r6[r2] = r7
            int r6 = r5.g
            int r2 = r6 + 1
            r5.g = r2
            int r3 = r5.f
            if (r6 < r3) goto L49
            int r2 = r2 + r1
            r6 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.dzgv.g(r2, r6)
            r5.m(r6)
        L49:
            if (r0 >= 0) goto L4d
            r6 = 0
            return r6
        L4d:
            V[] r6 = r5.b
            r1 = r6[r0]
            r6[r0] = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzjs.a(int, java.lang.Object):java.lang.Object");
    }
}
