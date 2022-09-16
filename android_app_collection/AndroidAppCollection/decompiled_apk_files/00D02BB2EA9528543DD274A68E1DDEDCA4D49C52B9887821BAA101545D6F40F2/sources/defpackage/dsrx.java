package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dsrx  reason: default package */
/* loaded from: classes.dex */
public final class dsrx extends dsoh<Long> implements RandomAccess, dsri, dsss {
    public static final dsrx b;
    private long[] c;
    private int d;

    static {
        dsrx dsrxVar = new dsrx(new long[0], 0);
        b = dsrxVar;
        dsrxVar.b();
    }

    public dsrx() {
        this(new long[10], 0);
    }

    private final void g(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(h(i));
        }
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

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        int i2;
        long longValue = ((Long) obj).longValue();
        SN();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(h(i));
        }
        long[] jArr = this.c;
        if (i2 < jArr.length) {
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        } else {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            System.arraycopy(this.c, i, jArr2, i + 1, this.d - i);
            this.c = jArr2;
        }
        this.c[i] = longValue;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        d(((Long) obj).longValue());
        return true;
    }

    @Override // defpackage.dsoh, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends Long> collection) {
        SN();
        dsrk.h(collection);
        if (!(collection instanceof dsrx)) {
            return super.addAll(collection);
        }
        dsrx dsrxVar = (dsrx) collection;
        int i = dsrxVar.d;
        if (i == 0) {
            return false;
        }
        int i2 = this.d;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.c;
            if (i3 > jArr.length) {
                this.c = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(dsrxVar.c, 0, this.c, this.d, dsrxVar.d);
            this.d = i3;
            this.modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // defpackage.dsri
    public final long c(int i) {
        g(i);
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // defpackage.dsri
    public final void d(long j) {
        SN();
        int i = this.d;
        long[] jArr = this.c;
        if (i == jArr.length) {
            long[] jArr2 = new long[((i * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.c = jArr2;
        }
        long[] jArr3 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        jArr3[i2] = j;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dsrx)) {
            return super.equals(obj);
        }
        dsrx dsrxVar = (dsrx) obj;
        if (this.d != dsrxVar.d) {
            return false;
        }
        long[] jArr = dsrxVar.c;
        for (int i = 0; i < this.d; i++) {
            if (this.c[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.dsrj
    /* renamed from: f */
    public final dsri e(int i) {
        if (i >= this.d) {
            return new dsrx(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return Long.valueOf(c(i));
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.d; i2++) {
            i = (i * 31) + dsrk.c(this.c[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.c[i2] == longValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        SN();
        g(i);
        long[] jArr = this.c;
        long j = jArr[i];
        if (i < this.d - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i, int i2) {
        SN();
        if (i2 >= i) {
            long[] jArr = this.c;
            System.arraycopy(jArr, i2, jArr, i, this.d - i2);
            this.d -= i2 - i;
            this.modCount++;
            return;
        }
        throw new IndexOutOfBoundsException("toIndex < fromIndex");
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        SN();
        g(i);
        long[] jArr = this.c;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private dsrx(long[] jArr, int i) {
        this.c = jArr;
        this.d = i;
    }
}
