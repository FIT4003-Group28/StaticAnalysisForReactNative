package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aoon  reason: default package */
/* loaded from: classes.dex */
public final class aoon extends aonn implements RandomAccess, aopl, aorc {
    public static final aoon b;
    private double[] c;
    private int d;

    static {
        aoon aoonVar = new aoon(new double[0], 0);
        b = aoonVar;
        aoonVar.b();
    }

    public aoon() {
        this(new double[10], 0);
    }

    private final String g(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void h(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(g(i));
        }
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        sg();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(g(i));
        }
        double[] dArr = this.c;
        if (i2 < dArr.length) {
            System.arraycopy(dArr, i, dArr, i + 1, i2 - i);
        } else {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            System.arraycopy(this.c, i, dArr2, i + 1, this.d - i);
            this.c = dArr2;
        }
        this.c[i] = doubleValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aonn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        sg();
        aopv.h(collection);
        if (!(collection instanceof aoon)) {
            return super.addAll(collection);
        }
        aoon aoonVar = (aoon) collection;
        int i = aoonVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.c;
            if (i3 > dArr.length) {
                this.c = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(aoonVar.c, 0, this.c, this.d, aoonVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.aopu
    /* renamed from: d */
    public final aopl e(int i) {
        if (i >= this.d) {
            return new aoon(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aoon)) {
            return super.equals(obj);
        }
        aoon aoonVar = (aoon) obj;
        if (this.d != aoonVar.d) {
            return false;
        }
        double[] dArr = aoonVar.c;
        for (int i = 0; i < this.d; i++) {
            if (Double.doubleToLongBits(this.c[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    public final void f(double d) {
        sg();
        int i = this.d;
        double[] dArr = this.c;
        if (i == dArr.length) {
            double[] dArr2 = new double[((i * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.c = dArr2;
        }
        double[] dArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        dArr3[i2] = d;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        h(i);
        return Double.valueOf(this.c[i]);
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + aopv.c(Double.doubleToLongBits(this.c[i2]));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        sg();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        if (i < this.d - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        sg();
        if (i2 >= i) {
            double[] dArr = this.c;
            System.arraycopy(dArr, i2, dArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        sg();
        h(i);
        double[] dArr = this.c;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    public aoon(double[] dArr, int i) {
        this.c = dArr;
        this.d = i;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Double) obj).doubleValue());
        return true;
    }
}
