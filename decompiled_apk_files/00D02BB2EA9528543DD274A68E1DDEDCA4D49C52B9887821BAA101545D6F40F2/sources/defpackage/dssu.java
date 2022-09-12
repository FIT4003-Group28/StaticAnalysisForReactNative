package defpackage;

import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dssu  reason: default package */
/* loaded from: classes.dex */
public final class dssu<E> extends dsoh<E> implements RandomAccess {
    public static final dssu<Object> b;
    private E[] c;
    private int d;

    static {
        dssu<Object> dssuVar = new dssu<>(new Object[0], 0);
        b = dssuVar;
        dssuVar.b();
    }

    public dssu() {
        this(new Object[10], 0);
    }

    private final void d(int i) {
        if (i < 0 || i >= this.d) {
            throw new IndexOutOfBoundsException(f(i));
        }
    }

    private final String f(int i) {
        int i2 = this.d;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i);
        sb.append(", Size:");
        sb.append(i2);
        return sb.toString();
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        int i2;
        SN();
        if (i < 0 || i > (i2 = this.d)) {
            throw new IndexOutOfBoundsException(f(i));
        }
        E[] eArr = this.c;
        if (i2 < eArr.length) {
            System.arraycopy(eArr, i, eArr, i + 1, i2 - i);
        } else {
            E[] eArr2 = (E[]) new Object[((i2 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i);
            System.arraycopy(this.c, i, eArr2, i + 1, this.d - i);
            this.c = eArr2;
        }
        this.c[i] = e;
        this.d++;
        this.modCount++;
    }

    @Override // defpackage.dsrj
    public final /* bridge */ /* synthetic */ dsrj e(int i) {
        if (i >= this.d) {
            return new dssu(Arrays.copyOf(this.c, i), this.d);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        d(i);
        return this.c[i];
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        int i2;
        SN();
        d(i);
        E[] eArr = this.c;
        E e = eArr[i];
        if (i < this.d - 1) {
            System.arraycopy(eArr, i + 1, eArr, i, (i2 - i) - 1);
        }
        this.d--;
        this.modCount++;
        return e;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        SN();
        d(i);
        E[] eArr = this.c;
        E e2 = eArr[i];
        eArr[i] = e;
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d;
    }

    private dssu(E[] eArr, int i) {
        this.c = eArr;
        this.d = i;
    }

    @Override // defpackage.dsoh, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(E e) {
        SN();
        int i = this.d;
        E[] eArr = this.c;
        if (i == eArr.length) {
            this.c = (E[]) Arrays.copyOf(eArr, ((i * 3) / 2) + 1);
        }
        E[] eArr2 = this.c;
        int i2 = this.d;
        this.d = i2 + 1;
        eArr2[i2] = e;
        this.modCount++;
        return true;
    }
}
