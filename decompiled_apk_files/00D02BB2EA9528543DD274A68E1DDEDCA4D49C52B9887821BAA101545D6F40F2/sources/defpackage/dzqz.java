package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzqz  reason: default package */
/* loaded from: classes.dex */
public final class dzqz<K, V> extends dznt<K, V> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient K[] b;
    protected transient V[] c;
    protected transient int d;
    protected transient boolean e;
    protected transient int f;
    protected transient int g;
    public int h;
    protected transient dzqp<K, V> i;
    protected transient dzrv<K> j;
    protected transient dzrj<V> k;

    public dzqz() {
        this(16);
    }

    private final int i() {
        return this.e ? this.h - 1 : this.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        int i;
        objectInputStream.defaultReadObject();
        int g = dzgv.g(this.h, 0.75f);
        this.f = g;
        this.g = dzgv.f(g, 0.75f);
        int i2 = this.f;
        this.d = i2 - 1;
        int i3 = i2 + 1;
        K[] kArr = (K[]) new Object[i3];
        this.b = kArr;
        V[] vArr = (V[]) new Object[i3];
        this.c = vArr;
        int i4 = this.h;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                Object readObject = objectInputStream.readObject();
                Object readObject2 = objectInputStream.readObject();
                if (readObject == null) {
                    i = this.f;
                    this.e = true;
                } else {
                    int a = dzgv.a(readObject.hashCode());
                    int i6 = this.d;
                    while (true) {
                        i = a & i6;
                        if (kArr[i] != 0) {
                            a = i + 1;
                            i6 = this.d;
                        }
                    }
                }
                kArr[i] = readObject;
                vArr[i] = readObject2;
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        K[] kArr = this.b;
        V[] vArr = this.c;
        dzqx dzqxVar = new dzqx(this);
        objectOutputStream.defaultWriteObject();
        int i = this.h;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int a = dzqxVar.a();
                objectOutputStream.writeObject(kArr[a]);
                objectOutputStream.writeObject(vArr[a]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dznt
    public final dzrv<K> a() {
        if (this.j == null) {
            this.j = new dzqu(this);
        }
        return this.j;
    }

    @Override // defpackage.dznt
    public final dzrj<V> b() {
        if (this.k == null) {
            this.k = new dzqr(this);
        }
        return this.k;
    }

    @Override // defpackage.dznr, defpackage.dzgu
    public final void clear() {
        if (this.h == 0) {
            return;
        }
        this.h = 0;
        this.e = false;
        Arrays.fill(this.b, (Object) null);
        Arrays.fill(this.c, (Object) null);
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
            int r2 = r5.f
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
            int r2 = r5.f
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzqz.containsValue(java.lang.Object):boolean");
    }

    public final V d(int i) {
        K k;
        int i2;
        V[] vArr = this.c;
        V v = vArr[i];
        vArr[i] = null;
        this.h--;
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
            i = i3;
        }
        kArr[i] = null;
        this.c[i] = null;
        if (this.h < this.g / 4 && (i2 = this.f) > 16) {
            f(i2 >> 1);
        }
        return v;
    }

    public final V e() {
        this.e = false;
        K[] kArr = this.b;
        int i = this.f;
        kArr[i] = null;
        V[] vArr = this.c;
        V v = vArr[i];
        vArr[i] = null;
        int i2 = this.h - 1;
        this.h = i2;
        if (i2 < this.g / 4 && i > 16) {
            f(i >> 1);
        }
        return v;
    }

    protected final void f(int i) {
        K k;
        K[] kArr = this.b;
        V[] vArr = this.c;
        int i2 = i - 1;
        int i3 = i + 1;
        K[] kArr2 = (K[]) new Object[i3];
        V[] vArr2 = (V[]) new Object[i3];
        int i4 = this.f;
        int i5 = i();
        while (true) {
            int i6 = i5 - 1;
            if (i5 != 0) {
                do {
                    i4--;
                    k = kArr[i4];
                } while (k == null);
                int a = dzgv.a(k.hashCode()) & i2;
                if (kArr2[a] != null) {
                    do {
                        a = (a + 1) & i2;
                    } while (kArr2[a] != null);
                }
                kArr2[a] = kArr[i4];
                vArr2[a] = vArr[i4];
                i5 = i6;
            } else {
                vArr2[i] = vArr[this.f];
                this.f = i;
                this.d = i2;
                this.g = dzgv.f(i, 0.75f);
                this.b = kArr2;
                this.c = vArr2;
                return;
            }
        }
    }

    @Override // defpackage.dzqq
    public final /* bridge */ /* synthetic */ dzrv g() {
        if (this.i == null) {
            this.i = new dzqw(this);
        }
        return this.i;
    }

    @Override // java.util.Map
    public final V get(Object obj) {
        K k;
        if (obj == null) {
            return this.e ? this.c[this.f] : this.a;
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

    /* renamed from: h */
    public final dzqz<K, V> clone() {
        try {
            dzqz<K, V> dzqzVar = (dzqz) super.clone();
            dzqzVar.j = null;
            dzqzVar.k = null;
            dzqzVar.i = null;
            dzqzVar.e = this.e;
            dzqzVar.b = (K[]) ((Object[]) this.b.clone());
            dzqzVar.c = (V[]) ((Object[]) this.c.clone());
            return dzqzVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dznt, java.util.Map
    public final int hashCode() {
        K k;
        int i = i();
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
            V v2 = this.c[this.f];
            if (v2 != null) {
                i2 = v2.hashCode();
            }
            return i4 + i2;
        }
        return i4;
    }

    @Override // defpackage.dznt, java.util.Map
    public final boolean isEmpty() {
        return this.h == 0;
    }

    @Override // defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    @Override // defpackage.dznt, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.h + map.size()) / 0.75f))));
        if (min > this.f) {
            f(min);
        }
        super.putAll(map);
    }

    @Override // defpackage.dznr, java.util.Map
    public final V remove(Object obj) {
        K k;
        if (obj == null) {
            return this.e ? e() : this.a;
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
            return d(a);
        }
        return d(a);
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.h;
    }

    @Override // defpackage.dznt, java.util.Map
    public final /* bridge */ /* synthetic */ Collection values() {
        return values();
    }

    public dzqz(int i) {
        int g = dzgv.g(i, 0.75f);
        this.f = g;
        this.d = g - 1;
        this.g = dzgv.f(g, 0.75f);
        int i2 = this.f + 1;
        this.b = (K[]) new Object[i2];
        this.c = (V[]) new Object[i2];
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.dznr, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final V put(K r6, V r7) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 != 0) goto L10
            boolean r2 = r5.e
            if (r2 == 0) goto Lb
            int r0 = r5.f
            goto L55
        Lb:
            r5.e = r1
            int r2 = r5.f
            goto L39
        L10:
            K[] r2 = r5.b
            int r3 = r6.hashCode()
            int r3 = defpackage.dzgv.a(r3)
            int r4 = r5.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L38
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L29
        L27:
            r0 = r3
            goto L55
        L29:
            int r3 = r3 + r1
            int r4 = r5.d
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L38
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L29
            goto L27
        L38:
            r2 = r3
        L39:
            K[] r3 = r5.b
            r3[r2] = r6
            V[] r6 = r5.c
            r6[r2] = r7
            int r6 = r5.h
            int r2 = r6 + 1
            r5.h = r2
            int r3 = r5.g
            if (r6 < r3) goto L55
            int r2 = r2 + r1
            r6 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.dzgv.g(r2, r6)
            r5.f(r6)
        L55:
            if (r0 >= 0) goto L5a
            V r6 = r5.a
            return r6
        L5a:
            V[] r6 = r5.c
            r1 = r6[r0]
            r6[r0] = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzqz.put(java.lang.Object, java.lang.Object):java.lang.Object");
    }
}
