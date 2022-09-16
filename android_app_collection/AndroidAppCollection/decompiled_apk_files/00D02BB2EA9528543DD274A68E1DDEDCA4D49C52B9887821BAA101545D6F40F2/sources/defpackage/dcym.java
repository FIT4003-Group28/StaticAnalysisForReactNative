package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dcym  reason: default package */
/* loaded from: classes5.dex */
final class dcym<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;
    private Object[] a;
    private int b;

    public dcym(int i) {
        this.a = new Object[Math.max(1, i)];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(T t) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            this.a = Arrays.copyOf(objArr, i + i);
        }
        Object[] objArr2 = this.a;
        int i2 = this.b;
        this.b = i2 + 1;
        objArr2[i2] = t;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.a[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        Object[] objArr = this.a;
        T t2 = (T) objArr[i];
        objArr[i] = t;
        return t2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}
