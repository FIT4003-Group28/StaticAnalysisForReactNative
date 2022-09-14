package c.e.a.b.d.g;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* loaded from: classes.dex */
final class o4 extends p3<Double> implements k5<Double>, v6, RandomAccess {

    /* renamed from: c  reason: collision with root package name */
    private double[] f4324c;

    /* renamed from: d  reason: collision with root package name */
    private int f4325d;

    static {
        new o4(new double[0], 0).j();
    }

    o4() {
        this(new double[10], 0);
    }

    private o4(double[] dArr, int i) {
        this.f4324c = dArr;
        this.f4325d = i;
    }

    private final void b(int i) {
        if (i < 0 || i >= this.f4325d) {
            throw new IndexOutOfBoundsException(c(i));
        }
    }

    private final String c(int i) {
        int i2 = this.f4325d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // c.e.a.b.d.g.k5
    public final /* synthetic */ k5<Double> a(int i) {
        if (i >= this.f4325d) {
            return new o4(Arrays.copyOf(this.f4324c, i), this.f4325d);
        }
        throw new IllegalArgumentException();
    }

    public final void a(double d2) {
        a();
        int i = this.f4325d;
        double[] dArr = this.f4324c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.f4324c = dArr2;
        }
        double[] dArr3 = this.f4324c;
        int i2 = this.f4325d;
        this.f4325d = i2 + 1;
        dArr3[i2] = d2;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        a();
        if (i < 0 || i > (i2 = this.f4325d)) {
            throw new IndexOutOfBoundsException(c(i));
        }
        double[] dArr = this.f4324c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.f4324c, i, dArr2, i + 1, this.f4325d - i);
            this.f4324c = dArr2;
        }
        this.f4324c[i] = doubleValue;
        this.f4325d++;
        ((AbstractList) this).modCount++;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* synthetic */ boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        e5.a(collection);
        if (!(collection instanceof o4)) {
            return super.addAll(collection);
        }
        o4 o4Var = (o4) collection;
        int i = o4Var.f4325d;
        if (i == 0) {
            return false;
        }
        int i2 = this.f4325d;
        if (Integer.MAX_VALUE - i2 < i) {
            throw new OutOfMemoryError();
        }
        int i3 = i2 + i;
        double[] dArr = this.f4324c;
        if (i3 > dArr.length) {
            this.f4324c = Arrays.copyOf(dArr, i3);
        }
        System.arraycopy(o4Var.f4324c, 0, this.f4324c, this.f4325d, o4Var.f4325d);
        this.f4325d = i3;
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
        if (!(obj instanceof o4)) {
            return super.equals(obj);
        }
        o4 o4Var = (o4) obj;
        if (this.f4325d != o4Var.f4325d) {
            return false;
        }
        double[] dArr = o4Var.f4324c;
        for (int i = 0; i < this.f4325d; i++) {
            if (Double.doubleToLongBits(this.f4324c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        b(i);
        return Double.valueOf(this.f4324c[i]);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.f4325d; i2++) {
            i = (i * 31) + e5.a(Double.doubleToLongBits(this.f4324c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i = 0; i < size; i++) {
            if (this.f4324c[i] == doubleValue) {
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
        double[] dArr = this.f4324c;
        double d2 = dArr[i];
        if (i < this.f4325d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.f4325d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // c.e.a.b.d.g.p3, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        a();
        for (int i = 0; i < this.f4325d; i++) {
            if (obj.equals(Double.valueOf(this.f4324c[i]))) {
                double[] dArr = this.f4324c;
                System.arraycopy(dArr, i + 1, dArr, i, (this.f4325d - i) - 1);
                this.f4325d--;
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
            double[] dArr = this.f4324c;
            System.arraycopy(dArr, i2, dArr, i, this.f4325d - i2);
            this.f4325d -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        a();
        b(i);
        double[] dArr = this.f4324c;
        double d2 = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4325d;
    }
}
