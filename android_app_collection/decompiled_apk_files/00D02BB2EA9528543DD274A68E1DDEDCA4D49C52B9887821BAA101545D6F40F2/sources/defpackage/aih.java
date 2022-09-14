package defpackage;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aih  reason: default package */
/* loaded from: classes.dex */
public final class aih<E> implements Collection<E>, Set<E> {
    private static Object[] c;
    private static int d;
    private static Object[] e;
    private static int f;
    private static final Object g = new Object();
    private static final Object h = new Object();
    Object[] a;
    public int b;
    private int[] i;

    public aih() {
        this(0);
    }

    private final int d(int i) {
        try {
            return aii.e(this.i, this.b, i);
        } catch (ArrayIndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    private final int e(Object obj, int i) {
        int i2 = this.b;
        if (i2 == 0) {
            return -1;
        }
        int d2 = d(i);
        if (d2 < 0 || obj.equals(this.a[d2])) {
            return d2;
        }
        int i3 = d2 + 1;
        while (i3 < i2 && this.i[i3] == i) {
            if (obj.equals(this.a[i3])) {
                return i3;
            }
            i3++;
        }
        for (int i4 = d2 - 1; i4 >= 0 && this.i[i4] == i; i4--) {
            if (obj.equals(this.a[i4])) {
                return i4;
            }
        }
        return i3 ^ (-1);
    }

    private final int f() {
        int i = this.b;
        if (i == 0) {
            return -1;
        }
        int d2 = d(0);
        if (d2 < 0 || this.a[d2] == null) {
            return d2;
        }
        int i2 = d2 + 1;
        while (i2 < i && this.i[i2] == 0) {
            if (this.a[i2] == null) {
                return i2;
            }
            i2++;
        }
        for (int i3 = d2 - 1; i3 >= 0 && this.i[i3] == 0; i3--) {
            if (this.a[i3] == null) {
                return i3;
            }
        }
        return i2 ^ (-1);
    }

    private final void g(int i) {
        if (i == 8) {
            synchronized (h) {
                Object[] objArr = e;
                if (objArr != null) {
                    try {
                        this.a = objArr;
                        e = (Object[]) objArr[0];
                        int[] iArr = (int[]) objArr[1];
                        this.i = iArr;
                        if (iArr != null) {
                            objArr[1] = null;
                            objArr[0] = null;
                            f--;
                            return;
                        }
                    } catch (ClassCastException unused) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr[0] + " [1]=" + objArr[1]);
                    e = null;
                    f = 0;
                }
            }
        } else if (i == 4) {
            synchronized (g) {
                Object[] objArr2 = c;
                if (objArr2 != null) {
                    try {
                        this.a = objArr2;
                        c = (Object[]) objArr2[0];
                        int[] iArr2 = (int[]) objArr2[1];
                        this.i = iArr2;
                        if (iArr2 != null) {
                            objArr2[1] = null;
                            objArr2[0] = null;
                            d--;
                            return;
                        }
                    } catch (ClassCastException unused2) {
                    }
                    System.out.println("ArraySet Found corrupt ArraySet cache: [0]=" + objArr2[0] + " [1]=" + objArr2[1]);
                    c = null;
                    d = 0;
                }
                i = 4;
            }
        }
        this.i = new int[i];
        this.a = new Object[i];
    }

    private static void h(int[] iArr, Object[] objArr, int i) {
        int length = iArr.length;
        if (length == 8) {
            synchronized (h) {
                if (f < 10) {
                    objArr[0] = e;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    e = objArr;
                    f++;
                }
            }
        } else if (length != 4) {
        } else {
            synchronized (g) {
                if (d < 10) {
                    objArr[0] = c;
                    objArr[1] = iArr;
                    while (true) {
                        i--;
                        if (i < 2) {
                            break;
                        }
                        objArr[i] = null;
                    }
                    c = objArr;
                    d++;
                }
            }
        }
    }

    public final int a(Object obj) {
        return obj == null ? f() : e(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean add(E e2) {
        int i;
        int e3;
        int i2 = this.b;
        if (e2 == null) {
            e3 = f();
            i = 0;
        } else {
            int hashCode = e2.hashCode();
            i = hashCode;
            e3 = e(e2, hashCode);
        }
        if (e3 >= 0) {
            return false;
        }
        int i3 = e3 ^ (-1);
        int[] iArr = this.i;
        int length = iArr.length;
        if (i2 >= length) {
            int i4 = 4;
            if (i2 >= 8) {
                i4 = (i2 >> 1) + i2;
            } else if (i2 >= 4) {
                i4 = 8;
            }
            Object[] objArr = this.a;
            g(i4);
            if (i2 == this.b) {
                int[] iArr2 = this.i;
                if (iArr2.length > 0) {
                    System.arraycopy(iArr, 0, iArr2, 0, length);
                    System.arraycopy(objArr, 0, this.a, 0, objArr.length);
                }
                h(iArr, objArr, i2);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (i3 < i2) {
            int[] iArr3 = this.i;
            int i5 = i3 + 1;
            int i6 = i2 - i3;
            System.arraycopy(iArr3, i3, iArr3, i5, i6);
            Object[] objArr2 = this.a;
            System.arraycopy(objArr2, i3, objArr2, i5, i6);
        }
        int i7 = this.b;
        if (i2 == i7) {
            int[] iArr4 = this.i;
            if (i3 < iArr4.length) {
                iArr4[i3] = i;
                this.a[i3] = e2;
                this.b = i7 + 1;
                return true;
            }
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean addAll(Collection<? extends E> collection) {
        int size = this.b + collection.size();
        int i = this.b;
        int[] iArr = this.i;
        if (iArr.length < size) {
            Object[] objArr = this.a;
            g(size);
            int i2 = this.b;
            if (i2 > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i2);
                System.arraycopy(objArr, 0, this.a, 0, this.b);
            }
            h(iArr, objArr, this.b);
        }
        if (this.b == i) {
            boolean z = false;
            for (E e2 : collection) {
                z |= add(e2);
            }
            return true == z;
        }
        throw new ConcurrentModificationException();
    }

    public final E b(int i) {
        return (E) this.a[i];
    }

    public final void c(int i) {
        int i2 = this.b;
        Object[] objArr = this.a;
        Object obj = objArr[i];
        if (i2 <= 1) {
            clear();
            return;
        }
        int i3 = i2 - 1;
        int[] iArr = this.i;
        int length = iArr.length;
        int i4 = 8;
        if (length <= 8 || i2 >= length / 3) {
            if (i < i3) {
                int i5 = i + 1;
                int i6 = i3 - i;
                System.arraycopy(iArr, i5, iArr, i, i6);
                Object[] objArr2 = this.a;
                System.arraycopy(objArr2, i5, objArr2, i, i6);
            }
            this.a[i3] = null;
        } else {
            if (i2 > 8) {
                i4 = i2 + (i2 >> 1);
            }
            g(i4);
            if (i > 0) {
                System.arraycopy(iArr, 0, this.i, 0, i);
                System.arraycopy(objArr, 0, this.a, 0, i);
            }
            if (i < i3) {
                int i7 = i + 1;
                int i8 = i3 - i;
                System.arraycopy(iArr, i7, this.i, i, i8);
                System.arraycopy(objArr, i7, this.a, i, i8);
            }
        }
        if (i2 == this.b) {
            this.b = i3;
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.b;
        if (i != 0) {
            int[] iArr = this.i;
            Object[] objArr = this.a;
            this.i = aii.a;
            this.a = aii.c;
            this.b = 0;
            h(iArr, objArr, i);
        }
        if (this.b == 0) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (this.b == set.size()) {
                for (int i = 0; i < this.b; i++) {
                    try {
                        if (!set.contains(b(i))) {
                            return false;
                        }
                    } catch (ClassCastException | NullPointerException unused) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int[] iArr = this.i;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += iArr[i3];
        }
        return i2;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator<E> iterator() {
        return new aig(this);
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int a = a(obj);
        if (a >= 0) {
            c(a);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= remove(it.next());
        }
        return true == z;
    }

    @Override // java.util.Collection, java.util.Set
    public final boolean retainAll(Collection<?> collection) {
        boolean z = false;
        for (int i = this.b - 1; i >= 0; i--) {
            if (!collection.contains(this.a[i])) {
                c(i);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    @Override // java.util.Collection, java.util.Set
    public final Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.a, 0, objArr, 0, i);
        return objArr;
    }

    public final String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.b * 14);
        sb.append('{');
        for (int i = 0; i < this.b; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            E b = b(i);
            if (b != this) {
                sb.append(b);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public aih(int i) {
        if (i == 0) {
            this.i = aii.a;
            this.a = aii.c;
        } else {
            g(i);
        }
        this.b = 0;
    }

    @Override // java.util.Collection, java.util.Set
    public final <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.b) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.b));
        }
        System.arraycopy(this.a, 0, tArr, 0, this.b);
        int length = tArr.length;
        int i = this.b;
        if (length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
