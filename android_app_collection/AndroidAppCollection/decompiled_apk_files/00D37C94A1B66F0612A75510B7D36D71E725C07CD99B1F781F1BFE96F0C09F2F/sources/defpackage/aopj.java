package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: aopj  reason: default package */
/* loaded from: classes.dex */
public final class aopj extends aonn implements RandomAccess, aopq, aorc {
    public static final aopj b;
    private int[] c;
    private int d;

    static {
        aopj aopjVar = new aopj(new int[0], 0);
        b = aopjVar;
        aopjVar.b();
    }

    public aopj() {
        this(new int[10], 0);
    }

    private final String h(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    private final void i(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        sg();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        int[] iArr = this.c;
        if (i2 < iArr.length) {
            System.arraycopy(iArr, i, iArr, i + 1, i2 - i);
        } else {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i);
            System.arraycopy(this.c, i, iArr2, i + 1, this.d - i);
            this.c = iArr2;
        }
        this.c[i] = intValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.aonn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        sg();
        aopv.h(collection);
        if (!(collection instanceof aopj)) {
            return super.addAll(collection);
        }
        aopj aopjVar = (aopj) collection;
        int i = aopjVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.c;
            if (i3 > iArr.length) {
                this.c = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(aopjVar.c, 0, this.c, this.d, aopjVar.d);
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

    @Override // defpackage.aopq
    public final int d(int i) {
        i(i);
        return this.c[i];
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aopj)) {
            return super.equals(obj);
        }
        aopj aopjVar = (aopj) obj;
        if (this.d != aopjVar.d) {
            return false;
        }
        int[] iArr = aopjVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.aopu
    /* renamed from: f */
    public final aopq e(int i) {
        if (i >= this.d) {
            return new aopj(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // defpackage.aopq
    public final void g(int i) {
        sg();
        int i2 = this.d;
        int[] iArr = this.c;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[((i2 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.c = iArr2;
        }
        int[] iArr3 = this.c;
        int i3 = this.d;
        this.d = i3 + 1;
        iArr3[i3] = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Integer.valueOf(d(i));
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + this.c[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        sg();
        i(i);
        int[] iArr = this.c;
        int i3 = iArr[i];
        if (i < this.d - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        sg();
        if (i2 >= i) {
            int[] iArr = this.c;
            System.arraycopy(iArr, i2, iArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        sg();
        i(i);
        int[] iArr = this.c;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private aopj(int[] iArr, int i) {
        this.c = iArr;
        this.d = i;
    }

    @Override // defpackage.aonn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        g(((Integer) obj).intValue());
        return true;
    }
}
