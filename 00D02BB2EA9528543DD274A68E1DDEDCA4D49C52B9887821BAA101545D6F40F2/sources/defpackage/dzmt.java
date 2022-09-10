package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dzmt  reason: default package */
/* loaded from: classes6.dex */
public final class dzmt extends dzkv implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353130L;
    protected transient long[] a;
    protected int b;

    public dzmt() {
        this(16);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new long[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readLong();
        }
    }

    private final void v(int i) {
        long[] jArr = this.a;
        int i2 = this.b;
        int length = jArr.length;
        if (i > length) {
            long j = length;
            long[] jArr2 = new long[(int) Math.max(Math.min(j + j, 2147483639L), i)];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            jArr = jArr2;
        }
        this.a = jArr;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeLong(this.a[i]);
        }
    }

    @Override // defpackage.dzkv, defpackage.dzkr, defpackage.dzmy
    public final boolean b(long j) {
        v(this.b + 1);
        long[] jArr = this.a;
        int i = this.b;
        this.b = i + 1;
        jArr[i] = j;
        return true;
    }

    @Override // defpackage.dzkv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.b = 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dzmt dzmtVar = new dzmt(this.b);
        System.arraycopy(this.a, 0, dzmtVar.a, 0, this.b);
        dzmtVar.b = this.b;
        return dzmtVar;
    }

    @Override // defpackage.dzkr
    public final boolean d(long j) {
        int o = o(j);
        if (o == -1) {
            return false;
        }
        g(o);
        return true;
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final void e(int i, long j) {
        l(i);
        v(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            long[] jArr = this.a;
            System.arraycopy(jArr, i, jArr, i + 1, i2 - i);
        }
        this.a[i] = j;
        this.b++;
    }

    @Override // defpackage.dznd
    public final long f(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
        }
        return this.a[i];
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final long g(int i) {
        int i2 = this.b;
        if (i < i2) {
            long[] jArr = this.a;
            long j = jArr[i];
            int i3 = i2 - 1;
            this.b = i3;
            if (i != i3) {
                System.arraycopy(jArr, i + 1, jArr, i, i3 - i);
            }
            return j;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final long h(int i, long j) {
        if (i < this.b) {
            long[] jArr = this.a;
            long j2 = jArr[i];
            jArr[i] = j;
            return j2;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // defpackage.dzkv, defpackage.dznd
    public final void i(int i, int i2) {
        dzgs.a(this.b, i, i2);
        long[] jArr = this.a;
        System.arraycopy(jArr, i2, jArr, i, this.b - i2);
        this.b -= i2 - i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.dzkv
    public final dzne j(int i) {
        l(i);
        return new dzms(this, i);
    }

    @Override // defpackage.dzkv, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzkv
    public final int o(long j) {
        for (int i = 0; i < this.b; i++) {
            if (j == this.a[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override // defpackage.dzkv
    public final int p(long j) {
        int i = this.b;
        while (true) {
            int i2 = i - 1;
            if (i != 0) {
                if (j == this.a[i2]) {
                    return i2;
                }
                i = i2;
            } else {
                return -1;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int i;
        long[] jArr = this.a;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(Long.valueOf(jArr[i2]))) {
                jArr[i3] = jArr[i2];
                i3++;
            }
            i2++;
        }
        if (i != i3) {
            z = true;
        }
        this.b = i3;
        return z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    public dzmt(int i) {
        if (i >= 0) {
            this.a = new long[i];
            return;
        }
        throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
    }
}
