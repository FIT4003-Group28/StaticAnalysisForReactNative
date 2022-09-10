package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dzot  reason: default package */
/* loaded from: classes6.dex */
public final class dzot<K> extends dznk<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = 0;
    protected transient K[] a;
    protected transient boolean[] b;
    protected transient int c;
    protected transient boolean d;
    protected transient int e;
    protected transient int f;
    protected int g;
    protected transient dzrv<K> h;
    protected transient dzgz i;
    protected transient dzoq j;

    public dzot() {
        int g = dzgv.g(16, 0.75f);
        this.e = g;
        this.c = g - 1;
        this.f = dzgv.f(g, 0.75f);
        int i = this.e + 1;
        this.a = (K[]) new Object[i];
        this.b = new boolean[i];
    }

    private final int l() {
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
        K[] kArr = (K[]) new Object[i3];
        this.a = kArr;
        boolean[] zArr = new boolean[i3];
        this.b = zArr;
        int i4 = this.g;
        while (true) {
            int i5 = i4 - 1;
            if (i4 != 0) {
                Object readObject = objectInputStream.readObject();
                boolean readBoolean = objectInputStream.readBoolean();
                if (readObject == null) {
                    i = this.e;
                    this.d = true;
                } else {
                    int a = dzgv.a(readObject.hashCode());
                    int i6 = this.c;
                    while (true) {
                        i = a & i6;
                        if (kArr[i] != 0) {
                            a = i + 1;
                            i6 = this.c;
                        }
                    }
                }
                kArr[i] = readObject;
                zArr[i] = readBoolean;
                i4 = i5;
            } else {
                return;
            }
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        K[] kArr = this.a;
        boolean[] zArr = this.b;
        dzor dzorVar = new dzor(this);
        objectOutputStream.defaultWriteObject();
        int i = this.g;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                int a = dzorVar.a();
                objectOutputStream.writeObject(kArr[a]);
                objectOutputStream.writeBoolean(zArr[a]);
                i = i2;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzok
    public final /* bridge */ /* synthetic */ dzrv SZ() {
        if (this.j == null) {
            this.j = new dzoq(this);
        }
        return this.j;
    }

    @Override // defpackage.dznj
    public final boolean b(Object obj) {
        K k;
        if (obj == null) {
            if (!this.d) {
                return false;
            }
            return i();
        }
        K[] kArr = this.a;
        int a = dzgv.a(obj.hashCode()) & this.c;
        K k2 = kArr[a];
        if (k2 == null) {
            return false;
        }
        if (!obj.equals(k2)) {
            do {
                a = (a + 1) & this.c;
                k = kArr[a];
                if (k == null) {
                    return false;
                }
            } while (!obj.equals(k));
            return h(a);
        }
        return h(a);
    }

    @Override // defpackage.dznj, defpackage.dzgu
    public final void clear() {
        if (this.g == 0) {
            return;
        }
        this.g = 0;
        this.d = false;
        Arrays.fill(this.a, (Object) null);
    }

    @Override // defpackage.dznk, defpackage.dzgu
    public final boolean containsKey(Object obj) {
        K k;
        if (obj == null) {
            return this.d;
        }
        K[] kArr = this.a;
        int a = dzgv.a(obj.hashCode()) & this.c;
        K k2 = kArr[a];
        if (k2 == null) {
            return false;
        }
        if (obj.equals(k2)) {
            return true;
        }
        do {
            a = (a + 1) & this.c;
            k = kArr[a];
            if (k == null) {
                return false;
            }
        } while (!obj.equals(k));
        return true;
    }

    @Override // defpackage.dznk
    public final boolean d(boolean z) {
        boolean[] zArr = this.b;
        K[] kArr = this.a;
        if (!this.d || zArr[this.e] != z) {
            int i = this.e;
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    return false;
                }
                if (kArr[i2] != null && zArr[i2] == z) {
                    return true;
                }
                i = i2;
            }
        } else {
            return true;
        }
    }

    @Override // defpackage.dznk
    public final dzrv<K> e() {
        if (this.h == null) {
            this.h = new dzoo(this);
        }
        return this.h;
    }

    @Override // defpackage.dznk
    public final dzgz f() {
        if (this.i == null) {
            this.i = new dzol(this);
        }
        return this.i;
    }

    @Override // defpackage.dzoj
    public final boolean g(Object obj) {
        K k;
        if (obj == null) {
            if (!this.d) {
                return false;
            }
            return this.b[this.e];
        }
        K[] kArr = this.a;
        int a = dzgv.a(obj.hashCode()) & this.c;
        K k2 = kArr[a];
        if (k2 == null) {
            return false;
        }
        if (!obj.equals(k2)) {
            do {
                a = (a + 1) & this.c;
                k = kArr[a];
                if (k == null) {
                    return false;
                }
            } while (!obj.equals(k));
            return this.b[a];
        }
        return this.b[a];
    }

    public final boolean h(int i) {
        K k;
        int i2;
        boolean z = this.b[i];
        this.g--;
        K[] kArr = this.a;
        loop0: while (true) {
            int i3 = (i + 1) & this.c;
            while (true) {
                k = kArr[i3];
                if (k == null) {
                    break loop0;
                }
                int hashCode = k.hashCode();
                int i4 = this.c;
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
            boolean[] zArr = this.b;
            zArr[i] = zArr[i3];
            i = i3;
        }
        kArr[i] = null;
        if (this.g < this.f / 4 && (i2 = this.e) > 16) {
            j(i2 >> 1);
        }
        return z;
    }

    @Override // defpackage.dznk, java.util.Map
    public final int hashCode() {
        int i;
        K k;
        int l = l();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (true) {
            int i5 = l - 1;
            i = 1237;
            if (l == 0) {
                break;
            }
            while (true) {
                k = this.a[i2];
                if (k != null) {
                    break;
                }
                i2++;
            }
            if (this != k) {
                i4 = k.hashCode();
            }
            if (true == this.b[i2]) {
                i = 1231;
            }
            i4 ^= i;
            i3 += i4;
            i2++;
            l = i5;
        }
        if (this.d) {
            if (true == this.b[this.e]) {
                i = 1231;
            }
            return i3 + i;
        }
        return i3;
    }

    public final boolean i() {
        this.d = false;
        K[] kArr = this.a;
        int i = this.e;
        kArr[i] = null;
        boolean z = this.b[i];
        int i2 = this.g - 1;
        this.g = i2;
        if (i2 < this.f / 4 && i > 16) {
            j(i >> 1);
        }
        return z;
    }

    @Override // defpackage.dznk, java.util.Map
    public final boolean isEmpty() {
        return this.g == 0;
    }

    protected final void j(int i) {
        K k;
        K[] kArr = this.a;
        boolean[] zArr = this.b;
        int i2 = i - 1;
        int i3 = i + 1;
        K[] kArr2 = (K[]) new Object[i3];
        boolean[] zArr2 = new boolean[i3];
        int i4 = this.e;
        int l = l();
        while (true) {
            int i5 = l - 1;
            if (l != 0) {
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
                zArr2[a] = zArr[i4];
                l = i5;
            } else {
                zArr2[i] = zArr[this.e];
                this.e = i;
                this.c = i2;
                this.f = dzgv.f(i, 0.75f);
                this.a = kArr2;
                this.b = zArr2;
                return;
            }
        }
    }

    /* renamed from: k */
    public final dzot<K> clone() {
        try {
            dzot<K> dzotVar = (dzot) super.clone();
            dzotVar.h = null;
            dzotVar.i = null;
            dzotVar.j = null;
            dzotVar.d = this.d;
            dzotVar.a = (K[]) ((Object[]) this.a.clone());
            dzotVar.b = (boolean[]) this.b.clone();
            return dzotVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // defpackage.dznk, java.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        return keySet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dznk, java.util.Map
    public final void putAll(Map<? extends K, ? extends Boolean> map) {
        int min = (int) Math.min(1073741824L, Math.max(2L, dzgv.e((long) Math.ceil((this.g + map.size()) / 0.75f))));
        if (min > this.e) {
            j(min);
        }
        int size = map.size();
        Iterator<Map.Entry<? extends K, ? extends Boolean>> it = map.entrySet().iterator();
        if (map instanceof dzok) {
            while (true) {
                int i = size - 1;
                if (size == 0) {
                    return;
                }
                dzop dzopVar = (dzop) it.next();
                a(dzopVar.getKey(), dzopVar.a());
                size = i;
            }
        } else {
            while (true) {
                int i2 = size - 1;
                if (size == 0) {
                    return;
                }
                Map.Entry<? extends K, ? extends Boolean> next = it.next();
                put(next.getKey(), next.getValue());
                size = i2;
            }
        }
    }

    @Override // defpackage.dzgu, java.util.Map
    public final int size() {
        return this.g;
    }

    @Override // defpackage.dznk, java.util.Map
    public final /* bridge */ /* synthetic */ Collection<Boolean> values() {
        return values();
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004b  */
    @Override // defpackage.dznj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(K r6, boolean r7) {
        /*
            r5 = this;
            r0 = -1
            r1 = 1
            if (r6 != 0) goto L10
            boolean r2 = r5.d
            if (r2 == 0) goto Lb
            int r0 = r5.e
            goto L55
        Lb:
            r5.d = r1
            int r2 = r5.e
            goto L39
        L10:
            K[] r2 = r5.a
            int r3 = r6.hashCode()
            int r3 = defpackage.dzgv.a(r3)
            int r4 = r5.c
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
            int r4 = r5.c
            r3 = r3 & r4
            r4 = r2[r3]
            if (r4 == 0) goto L38
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L29
            goto L27
        L38:
            r2 = r3
        L39:
            K[] r3 = r5.a
            r3[r2] = r6
            boolean[] r6 = r5.b
            r6[r2] = r7
            int r6 = r5.g
            int r2 = r6 + 1
            r5.g = r2
            int r3 = r5.f
            if (r6 < r3) goto L55
            int r2 = r2 + r1
            r6 = 1061158912(0x3f400000, float:0.75)
            int r6 = defpackage.dzgv.g(r2, r6)
            r5.j(r6)
        L55:
            if (r0 >= 0) goto L59
            r6 = 0
            return r6
        L59:
            boolean[] r6 = r5.b
            boolean r1 = r6[r0]
            r6[r0] = r7
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dzot.a(java.lang.Object, boolean):boolean");
    }
}
