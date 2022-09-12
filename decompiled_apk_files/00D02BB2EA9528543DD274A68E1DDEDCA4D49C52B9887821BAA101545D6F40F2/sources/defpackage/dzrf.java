package defpackage;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
/* compiled from: PG */
/* renamed from: dzrf  reason: default package */
/* loaded from: classes6.dex */
public final class dzrf<K> extends dzoc<K> implements Serializable, Cloneable {
    private static final long serialVersionUID = 1;
    public transient Object[] a;
    public int b;

    public dzrf() {
        Object[] objArr = dzrh.a;
        throw null;
    }

    private final int c(Object obj) {
        int i;
        int i2 = this.b;
        while (true) {
            i = i2 - 1;
            if (i2 == 0) {
                return -1;
            }
            Object obj2 = this.a[i];
            if (obj2 != null) {
                if (obj2.equals(obj)) {
                    break;
                }
                i2 = i;
            } else if (obj == null) {
                break;
            } else {
                i2 = i;
            }
        }
        return i;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.a = new Object[this.b];
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

    @Override // defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: a */
    public final dzrn<K> iterator() {
        return new dzre(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(K k) {
        if (c(k) != -1) {
            return false;
        }
        int i = this.b;
        if (i == this.a.length) {
            Object[] objArr = new Object[i == 0 ? 2 : i + i];
            while (true) {
                int i2 = i - 1;
                if (i == 0) {
                    break;
                }
                objArr[i2] = this.a[i2];
                i = i2;
            }
            this.a = objArr;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        objArr2[i3] = k;
        return true;
    }

    /* renamed from: b */
    public final dzrf<K> clone() {
        try {
            dzrf<K> dzrfVar = (dzrf) super.clone();
            dzrfVar.a = (Object[]) this.a.clone();
            return dzrfVar;
        } catch (CloneNotSupportedException unused) {
            throw new InternalError();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        Arrays.fill(this.a, 0, this.b, (Object) null);
        this.b = 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return c(obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int c = c(obj);
        if (c == -1) {
            return false;
        }
        int i = (this.b - c) - 1;
        for (int i2 = 0; i2 < i; i2++) {
            Object[] objArr = this.a;
            int i3 = c + i2;
            objArr[i3] = objArr[i3 + 1];
        }
        int i4 = this.b - 1;
        this.b = i4;
        this.a[i4] = null;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }

    public dzrf(Object[] objArr, int i) {
        this.a = objArr;
        this.b = i;
        int length = objArr.length;
        if (i <= length) {
            return;
        }
        throw new IllegalArgumentException("The provided size (" + i + ") is larger than or equal to the array size (" + length + ")");
    }
}
