package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class x6<E> extends p3<E> implements RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final x6<Object> f4516e;

    /* renamed from: c  reason: collision with root package name */
    private E[] f4517c;

    /* renamed from: d  reason: collision with root package name */
    private int f4518d;

    static {
        x6<Object> x6Var = new x6<>(new Object[0], 0);
        f4516e = x6Var;
        x6Var.j();
    }

    private x6(E[] eArr, int i) {
        this.f4517c = eArr;
        this.f4518d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4518d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.f4518d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static <E> x6<E> k() {
        return (x6<E>) f4516e;
    }

    @Override // c.e.a.b.d.g.k5
    public final /* synthetic */ k5 a(int i) {
        if (i >= this.f4518d) {
            return new x6(Arrays.copyOf(this.f4517c, i), this.f4518d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, E e2) {
        int i2;
        a();
        if (i < 0 || i > (i2 = this.f4518d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        E[] eArr = this.f4517c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.f4517c, i, eArr2, i + 1, this.f4518d - i);
            this.f4517c = eArr2;
        }
        this.f4517c[i] = e2;
        this.f4518d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e2) {
        a();
        int i = this.f4518d;
        E[] eArr = this.f4517c;
        if (i == eArr.length) {
            this.f4517c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.f4517c;
        int i2 = this.f4518d;
        this.f4518d = i2 + 1;
        eArr2[i2] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        b(i);
        return this.f4517c[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        a();
        b(i);
        E[] eArr = this.f4517c;
        E e2 = eArr[i];
        if (i < this.f4518d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.f4518d--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E set(int i, E e2) {
        a();
        b(i);
        E[] eArr = this.f4517c;
        E e3 = eArr[i];
        eArr[i] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4518d;
    }
}
