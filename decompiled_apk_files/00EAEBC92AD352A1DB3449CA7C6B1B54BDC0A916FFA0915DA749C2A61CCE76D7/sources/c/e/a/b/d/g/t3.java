package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class t3 extends p3<Boolean> implements k5<Boolean>, v6, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private boolean[] f4421c;

    /* renamed from: d  reason: collision with root package name */
    private int f4422d;

    static {
        new t3(new boolean[0], 0).j();
    }

    t3() {
        this(new boolean[10], 0);
    }

    private t3(boolean[] zArr, int i) {
        this.f4421c = zArr;
        this.f4422d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4422d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.f4422d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // c.e.a.b.d.g.k5
    public final /* synthetic */ k5<Boolean> a(int i) {
        if (i >= this.f4422d) {
            return new t3(Arrays.copyOf(this.f4421c, i), this.f4422d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(boolean z) {
        a();
        int i = this.f4422d;
        boolean[] zArr = this.f4421c;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[((i * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.f4421c = zArr2;
        }
        boolean[] zArr3 = this.f4421c;
        int i2 = this.f4422d;
        this.f4422d = i2 + 1;
        zArr3[i2] = z;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i < 0 || i > (i2 = this.f4422d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        boolean[] zArr = this.f4421c;
        if (i2 < zArr.length) {
            System.arraycopy(zArr, i, zArr, i + 1, i2 - i);
        } else {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            System.arraycopy(this.f4421c, i, zArr2, i + 1, this.f4422d - i);
            this.f4421c = zArr2;
        }
        this.f4421c[i] = booleanValue;
        this.f4422d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Boolean) obj).booleanValue());
        return true;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        e5.a(collection);
        if (!(collection instanceof t3)) {
            return super.addAll(collection);
        }
        t3 t3Var = (t3) collection;
        int i = t3Var.f4422d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4422d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        boolean[] zArr = this.f4421c;
        if (i3 > zArr.length) {
            this.f4421c = Arrays.copyOf(zArr, i3);
        }
        System.arraycopy(t3Var.f4421c, 0, this.f4421c, this.f4422d, t3Var.f4422d);
        this.f4422d = i3;
        ((AbstractList) this).modCount++;
        return true;
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
        if (!(obj instanceof t3)) {
            return super.equals(obj);
        }
        t3 t3Var = (t3) obj;
        if (this.f4422d != t3Var.f4422d) {
            return false;
        }
        boolean[] zArr = t3Var.f4421c;
        for (int i = 0; i < this.f4422d; i++) {
            if (this.f4421c[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Boolean.valueOf(this.f4421c[i]);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4422d; i2++) {
            i = (i * 31) + e5.a(this.f4421c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4421c[i] == booleanValue) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        int i2;
        a();
        b(i);
        boolean[] zArr = this.f4421c;
        boolean z = zArr[i];
        if (i < this.f4422d - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.f4422d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f4422d; i++) {
            if (obj.equals(Boolean.valueOf(this.f4421c[i]))) {
                boolean[] zArr = this.f4421c;
                System.arraycopy(zArr, i + 1, zArr, i, (this.f4422d - i) - 1);
                this.f4422d--;
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
            boolean[] zArr = this.f4421c;
            System.arraycopy(zArr, i2, zArr, i, this.f4422d - i2);
            this.f4422d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        a();
        b(i);
        boolean[] zArr = this.f4421c;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4422d;
    }
}
