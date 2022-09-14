package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class y5 extends p3<Long> implements h5, v6, RandomAccess {

    /* renamed from: e  reason: collision with root package name */
    private static final y5 f4538e;

    /* renamed from: c  reason: collision with root package name */
    private long[] f4539c;

    /* renamed from: d  reason: collision with root package name */
    private int f4540d;

    static {
        y5 y5Var = new y5(new long[0], 0);
        f4538e = y5Var;
        y5Var.j();
    }

    y5() {
        this(new long[10], 0);
    }

    private y5(long[] jArr, int i) {
        this.f4539c = jArr;
        this.f4540d = i;
    }

    private final void d(int i) {
        if (i < 0 || i >= this.f4540d) {
            throw new IndexOutOfBoundsException(e(i));
        }
    }

    private final String e(int i) {
        int i2 = this.f4540d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    public static y5 k() {
        return f4538e;
    }

    public final void a(long j) {
        a();
        int i = this.f4540d;
        long[] jArr = this.f4539c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.f4539c = jArr2;
        }
        long[] jArr3 = this.f4539c;
        int i2 = this.f4540d;
        this.f4540d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        a();
        if (i < 0 || i > (i2 = this.f4540d)) {
            throw new IndexOutOfBoundsException(e(i));
        }
        long[] jArr = this.f4539c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.f4539c, i, jArr2, i + 1, this.f4540d - i);
            this.f4539c = jArr2;
        }
        this.f4539c[i] = longValue;
        this.f4540d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        e5.a(collection);
        if (!(collection instanceof y5)) {
            return super.addAll(collection);
        }
        y5 y5Var = (y5) collection;
        int i = y5Var.f4540d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4540d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        long[] jArr = this.f4539c;
        if (i3 > jArr.length) {
            this.f4539c = Arrays.copyOf(jArr, i3);
        }
        System.arraycopy(y5Var.f4539c, 0, this.f4539c, this.f4540d, y5Var.f4540d);
        this.f4540d = i3;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // c.e.a.b.d.g.h5
    public final long b(int i) {
        d(i);
        return this.f4539c[i];
    }

    @Override // c.e.a.b.d.g.k5
    /* renamed from: c */
    public final h5 a(int i) {
        if (i >= this.f4540d) {
            return new y5(Arrays.copyOf(this.f4539c, i), this.f4540d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y5)) {
            return super.equals(obj);
        }
        y5 y5Var = (y5) obj;
        if (this.f4540d != y5Var.f4540d) {
            return false;
        }
        long[] jArr = y5Var.f4539c;
        for (int i = 0; i < this.f4540d; i++) {
            if (this.f4539c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return Long.valueOf(b(i));
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4540d; i2++) {
            i = (i * 31) + e5.a(this.f4539c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4539c[i] == longValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        a();
        d(i);
        long[] jArr = this.f4539c;
        long j = jArr[i];
        if (i < this.f4540d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.f4540d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f4540d; i++) {
            if (obj.equals(Long.valueOf(this.f4539c[i]))) {
                long[] jArr = this.f4539c;
                System.arraycopy(jArr, i + 1, jArr, i, (this.f4540d - i) - 1);
                this.f4540d--;
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
            long[] jArr = this.f4539c;
            System.arraycopy(jArr, i2, jArr, i, this.f4540d - i2);
            this.f4540d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        a();
        d(i);
        long[] jArr = this.f4539c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4540d;
    }
}
