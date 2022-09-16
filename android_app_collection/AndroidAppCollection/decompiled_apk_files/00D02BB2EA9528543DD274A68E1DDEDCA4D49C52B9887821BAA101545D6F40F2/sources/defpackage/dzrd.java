package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dzrd  reason: default package */
/* loaded from: classes6.dex */
public final class dzrd<K> extends dzoa<K> implements RandomAccess, Cloneable, Serializable {
    private static final long serialVersionUID = -7046029254386353131L;
    protected transient K[] a;
    protected int b;

    public dzrd() {
        this(16);
    }

    private final void i(int i) {
        int length = this.a.length;
        if (i > length) {
            long j = length;
            Object[] objArr = new Object[(int) Math.max(Math.min(j + j, 2147483639L), i)];
            System.arraycopy(this.a, 0, objArr, 0, this.b);
            this.a = (K[]) objArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = (K[]) new Object[this.b];
        for (int i = 0; i < this.b; i++) {
            this.a[i] = objectInputStream.readObject();
        }
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.b; i++) {
            objectOutputStream.writeObject(this.a[i]);
        }
    }

    @Override // defpackage.dzoa, java.util.List
    public final void add(int i, K k) {
        e(i);
        i(this.b + 1);
        int i2 = this.b;
        if (i != i2) {
            K[] kArr = this.a;
            System.arraycopy(kArr, i, kArr, i + 1, i2 - i);
        }
        this.a[i] = k;
        this.b++;
    }

    @Override // defpackage.dzoa, defpackage.dzrr
    public final void b(int i, int i2) {
        dzgs.a(this.b, i, i2);
        K[] kArr = this.a;
        System.arraycopy(kArr, i2, kArr, i, this.b - i2);
        int i3 = i2 - i;
        this.b -= i3;
        while (true) {
            int i4 = i3 - 1;
            if (i3 != 0) {
                this.a[this.b + i4] = null;
                i3 = i4;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.dzoa
    public final dzrs<K> c(int i) {
        e(i);
        return new dzrc(this, i);
    }

    @Override // defpackage.dzoa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    public final /* bridge */ /* synthetic */ Object clone() {
        dzrd dzrdVar = new dzrd(this.b);
        System.arraycopy(this.a, 0, dzrdVar.a, 0, this.b);
        dzrdVar.b = this.b;
        return dzrdVar;
    }

    @Override // java.util.List
    public final K get(int i) {
        if (i >= this.b) {
            throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
        }
        return this.a[i];
    }

    @Override // defpackage.dzoa, java.util.List
    public final int indexOf(Object obj) {
        for (int i = 0; i < this.b; i++) {
            if (obj == null) {
                if (this.a[i] == null) {
                    return i;
                }
            } else if (obj.equals(this.a[i])) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // defpackage.dzoa, java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        int i2 = this.b;
        while (true) {
            i = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            if (obj != null) {
                if (obj.equals(this.a[i])) {
                    break;
                }
                i2 = i;
            } else if (this.a[i] == null) {
                break;
            } else {
                i2 = i;
            }
        }
        return i;
    }

    @Override // defpackage.dzoa, java.util.List
    public final /* bridge */ /* synthetic */ ListIterator listIterator(int i) {
        return listIterator(i);
    }

    @Override // defpackage.dzoa, java.util.List
    public final K remove(int i) {
        int i2 = this.b;
        if (i < i2) {
            K[] kArr = this.a;
            K k = kArr[i];
            int i3 = i2 - 1;
            this.b = i3;
            if (i != i3) {
                System.arraycopy(kArr, i + 1, kArr, i, i3 - i);
            }
            this.a[this.b] = null;
            return k;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean removeAll(Collection<?> collection) {
        int i;
        K[] kArr = this.a;
        boolean z = false;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = this.b;
            if (i2 >= i) {
                break;
            }
            if (!collection.contains(kArr[i2])) {
                kArr[i3] = kArr[i2];
                i3++;
            }
            i2++;
        }
        Arrays.fill(kArr, i3, i, (Object) null);
        if (this.b != i3) {
            z = true;
        }
        this.b = i3;
        return z;
    }

    @Override // defpackage.dzoa, java.util.List
    public final K set(int i, K k) {
        if (i < this.b) {
            K[] kArr = this.a;
            K k2 = kArr[i];
            kArr[i] = k;
            return k2;
        }
        throw new IndexOutOfBoundsException("Index (" + i + ") is greater than or equal to list size (" + this.b + ")");
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    public dzrd(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("Initial capacity (" + i + ") is negative");
        }
        this.a = (K[]) new Object[i];
    }

    @Override // defpackage.dzoa, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(K k) {
        i(this.b + 1);
        K[] kArr = this.a;
        int i = this.b;
        this.b = i + 1;
        kArr[i] = k;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean remove(Object obj) {
        int indexOf = indexOf(obj);
        if (indexOf == -1) {
            return false;
        }
        remove(indexOf);
        return true;
    }
}
