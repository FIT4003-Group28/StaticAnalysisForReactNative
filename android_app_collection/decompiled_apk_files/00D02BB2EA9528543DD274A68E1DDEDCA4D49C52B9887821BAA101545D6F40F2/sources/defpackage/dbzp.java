package defpackage;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: dbzp  reason: default package */
/* loaded from: classes.dex */
class dbzp<E> extends AbstractSet<E> implements Serializable {
    transient Object[] a;
    public transient int b;
    private transient Object c;
    private transient int[] d;
    private transient int e;

    public dbzp() {
        b(3);
    }

    public static <E> dbzp<E> a(int i) {
        return new dbzp<>(i);
    }

    private final void n(int i) {
        this.b = dbzq.h(this.b, 32 - Integer.numberOfLeadingZeros(i), 31);
    }

    private final int o() {
        return (1 << (this.b & 31)) - 1;
    }

    private final int p(int i, int i2, int i3, int i4) {
        Object b = dbzq.b(i2);
        int i5 = i2 - 1;
        if (i4 != 0) {
            dbzq.e(b, i3 & i5, i4 + 1);
        }
        Object obj = this.c;
        int[] iArr = this.d;
        for (int i6 = 0; i6 <= i; i6++) {
            int d = dbzq.d(obj, i6);
            while (d != 0) {
                int i7 = d - 1;
                int i8 = iArr[i7];
                int g = dbzq.g(i8, i) | i6;
                int i9 = g & i5;
                int d2 = dbzq.d(b, i9);
                dbzq.e(b, i9, d);
                iArr[i7] = dbzq.h(g, d2, i5);
                d = i8 & i;
            }
        }
        this.c = b;
        n(i5);
        return i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        int readInt = objectInputStream.readInt();
        if (readInt < 0) {
            StringBuilder sb = new StringBuilder(25);
            sb.append("Invalid size: ");
            sb.append(readInt);
            throw new InvalidObjectException(sb.toString());
        }
        b(readInt);
        for (int i = 0; i < readInt; i++) {
            add(objectInputStream.readObject());
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeInt(size());
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            objectOutputStream.writeObject(it.next());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(E e) {
        int min;
        if (c()) {
            d();
        }
        Set<E> e2 = e();
        if (e2 != null) {
            return e2.add(e);
        }
        int[] iArr = this.d;
        Object[] objArr = this.a;
        int i = this.e;
        int i2 = i + 1;
        int b = dccj.b(e);
        int o = o();
        int i3 = b & o;
        int d = dbzq.d(this.c, i3);
        if (d != 0) {
            int g = dbzq.g(b, o);
            int i4 = 0;
            while (true) {
                int i5 = d - 1;
                int i6 = iArr[i5];
                if (dbzq.g(i6, o) == g && dbsd.a(e, objArr[i5])) {
                    return false;
                }
                int i7 = i6 & o;
                i4++;
                if (i7 != 0) {
                    d = i7;
                } else if (i4 >= 9) {
                    return f().add(e);
                } else {
                    if (i2 > o) {
                        o = p(o, dbzq.f(o), b, i);
                    } else {
                        iArr[i5] = dbzq.h(i6, i2, o);
                    }
                }
            }
        } else if (i2 > o) {
            o = p(o, dbzq.f(o), b, i);
        } else {
            dbzq.e(this.c, i3, i2);
        }
        int length = this.d.length;
        if (i2 > length && (min = Math.min(1073741823, (Math.max(1, length >>> 1) + length) | 1)) != length) {
            i(min);
        }
        h(i, e, b, o);
        this.e = i2;
        g();
        return true;
    }

    public void b(int i) {
        dbsk.b(true, "Expected size must be >= 0");
        this.b = decl.h(i, 1, 1073741823);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        return this.c == null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (c()) {
            return;
        }
        g();
        Set<E> e = e();
        if (e != null) {
            this.b = decl.h(size(), 3, 1073741823);
            e.clear();
            this.c = null;
            this.e = 0;
            return;
        }
        Arrays.fill(this.a, 0, this.e, (Object) null);
        dbzq.c(this.c);
        Arrays.fill(this.d, 0, this.e, 0);
        this.e = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (c()) {
            return false;
        }
        Set<E> e = e();
        if (e != null) {
            return e.contains(obj);
        }
        int b = dccj.b(obj);
        int o = o();
        int d = dbzq.d(this.c, b & o);
        if (d == 0) {
            return false;
        }
        int g = dbzq.g(b, o);
        do {
            int i = d - 1;
            int i2 = this.d[i];
            if (dbzq.g(i2, o) == g && dbsd.a(obj, this.a[i])) {
                return true;
            }
            d = i2 & o;
        } while (d != 0);
        return false;
    }

    public int d() {
        dbsk.m(c(), "Arrays already allocated");
        int i = this.b;
        int a = dbzq.a(i);
        this.c = dbzq.b(a);
        n(a - 1);
        this.d = new int[i];
        this.a = new Object[i];
        return i;
    }

    final Set<E> e() {
        Object obj = this.c;
        if (obj instanceof Set) {
            return (Set) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Set<E> f() {
        LinkedHashSet linkedHashSet = new LinkedHashSet(o() + 1, 1.0f);
        int k = k();
        while (k >= 0) {
            linkedHashSet.add(this.a[k]);
            k = l(k);
        }
        this.c = linkedHashSet;
        this.d = null;
        this.a = null;
        g();
        return linkedHashSet;
    }

    final void g() {
        this.b += 32;
    }

    public void h(int i, E e, int i2, int i3) {
        this.d[i] = dbzq.h(i2, 0, i3);
        this.a[i] = e;
    }

    public void i(int i) {
        this.d = Arrays.copyOf(this.d, i);
        this.a = Arrays.copyOf(this.a, i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        Set<E> e = e();
        if (e != null) {
            return e.iterator();
        }
        return new dbzo(this);
    }

    public void j(int i, int i2) {
        int size = size() - 1;
        if (i < size) {
            Object[] objArr = this.a;
            Object obj = objArr[size];
            objArr[i] = obj;
            objArr[size] = null;
            int[] iArr = this.d;
            iArr[i] = iArr[size];
            iArr[size] = 0;
            int b = dccj.b(obj) & i2;
            int d = dbzq.d(this.c, b);
            int i3 = size + 1;
            if (d == i3) {
                dbzq.e(this.c, b, i + 1);
                return;
            }
            while (true) {
                int i4 = d - 1;
                int[] iArr2 = this.d;
                int i5 = iArr2[i4];
                int i6 = i5 & i2;
                if (i6 == i3) {
                    iArr2[i4] = dbzq.h(i5, i + 1, i2);
                    return;
                }
                d = i6;
            }
        } else {
            this.a[i] = null;
            this.d[i] = 0;
        }
    }

    public int k() {
        return isEmpty() ? -1 : 0;
    }

    public int l(int i) {
        int i2 = i + 1;
        if (i2 < this.e) {
            return i2;
        }
        return -1;
    }

    public int m(int i, int i2) {
        return i - 1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        if (c()) {
            return false;
        }
        Set<E> e = e();
        if (e != null) {
            return e.remove(obj);
        }
        int o = o();
        int i = dbzq.i(obj, null, o, this.c, this.d, this.a, null);
        if (i == -1) {
            return false;
        }
        j(i, o);
        this.e--;
        g();
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Set<E> e = e();
        return e != null ? e.size() : this.e;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        if (c()) {
            return new Object[0];
        }
        Set<E> e = e();
        return e != null ? e.toArray() : Arrays.copyOf(this.a, this.e);
    }

    public dbzp(int i) {
        b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (c()) {
            if (tArr.length > 0) {
                tArr[0] = null;
            }
            return tArr;
        }
        Set<E> e = e();
        if (e != null) {
            return (T[]) e.toArray(tArr);
        }
        Object[] objArr = this.a;
        int i = this.e;
        dbsk.u(0, i, objArr.length);
        int length = tArr.length;
        if (length < i) {
            tArr = (T[]) dclv.a(tArr, i);
        } else if (length > i) {
            tArr[i] = null;
        }
        System.arraycopy(objArr, 0, tArr, 0, i);
        return tArr;
    }
}
