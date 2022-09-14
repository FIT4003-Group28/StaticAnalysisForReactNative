package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class c5 extends p3<Integer> implements i5, v6, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final c5 f4080e;

    /* renamed from: c  reason: collision with root package name */
    private int[] f4081c;

    /* renamed from: d  reason: collision with root package name */
    private int f4082d;

    static {
        c5 c5Var = new c5(new int[0], 0);
        f4080e = c5Var;
        c5Var.j();
    }

    c5() {
        this(new int[10], 0);
    }

    private c5(int[] iArr, int i) {
        this.f4081c = iArr;
        this.f4082d = i;
    }

    private final void e(int i) {
        if (i < 0 || i >= this.f4082d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private final String f(int i) {
        int i2 = this.f4082d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static c5 k() {
        return f4080e;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        a();
        if (i < 0 || i > (i2 = this.f4082d)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        int[] iArr = this.f4081c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.f4081c, i, iArr2, i + 1, this.f4082d - i);
            this.f4081c = iArr2;
        }
        this.f4081c[i] = intValue;
        this.f4082d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        d(((Integer) obj).intValue());
        return true;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        e5.a(collection);
        if (!(collection instanceof c5)) {
            return super.addAll(collection);
        }
        c5 c5Var = (c5) collection;
        int i = c5Var.f4082d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4082d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        int[] iArr = this.f4081c;
        if (i3 > iArr.length) {
            this.f4081c = Arrays.copyOf(iArr, i3);
        }
        System.arraycopy(c5Var.f4081c, 0, this.f4081c, this.f4082d, c5Var.f4082d);
        this.f4082d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // c.e.a.b.d.g.k5
    /* renamed from: b */
    public final i5 a(int i) {
        if (i >= this.f4082d) {
            return new c5(Arrays.copyOf(this.f4081c, i), this.f4082d);
        }
        throw new IllegalArgumentException();
    }

    public final int c(int i) {
        e(i);
        return this.f4081c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i) {
        a();
        int i2 = this.f4082d;
        int[] iArr = this.f4081c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.f4081c = iArr2;
        }
        int[] iArr3 = this.f4081c;
        int i3 = this.f4082d;
        this.f4082d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return super.equals(obj);
        }
        c5 c5Var = (c5) obj;
        if (this.f4082d != c5Var.f4082d) {
            return false;
        }
        int[] iArr = c5Var.f4081c;
        for (int i = 0; i < this.f4082d; i++) {
            if (this.f4081c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Integer.valueOf(c(i));
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4082d; i2++) {
            i = (i * 31) + this.f4081c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4081c[i] == intValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        a();
        e(i);
        int[] iArr = this.f4081c;
        int i3 = iArr[i];
        if (i < this.f4082d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.f4082d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f4082d; i++) {
            if (obj.equals(Integer.valueOf(this.f4081c[i]))) {
                int[] iArr = this.f4081c;
                System.arraycopy(iArr, i + 1, iArr, i, (this.f4082d - i) - 1);
                this.f4082d--;
                ((AbstractList) this).modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        a();
        if (i2 >= i) {
            int[] iArr = this.f4081c;
            System.arraycopy(iArr, i2, iArr, i, this.f4082d - i2);
            this.f4082d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        a();
        e(i);
        int[] iArr = this.f4081c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4082d;
    }
}
