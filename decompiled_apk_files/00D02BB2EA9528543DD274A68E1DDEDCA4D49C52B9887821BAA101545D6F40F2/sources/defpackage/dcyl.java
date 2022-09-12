package defpackage;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: PG */
/* renamed from: dcyl  reason: default package */
/* loaded from: classes5.dex */
final class dcyl<T> extends AbstractList<T> implements RandomAccess, Serializable {
    private static final long serialVersionUID = 1;
    private Object[][] a;
    private int b;

    public dcyl(int i) {
        this.a = new Object[(i >> 8) + 1];
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(T t) {
        int i = this.b >> 8;
        Object[][] objArr = this.a;
        if (i == objArr.length) {
            objArr = (Object[][]) Arrays.copyOf(objArr, i + i);
            this.a = objArr;
            objArr[i] = new Object[256];
        } else if (objArr[i] == null) {
            objArr[i] = new Object[256];
        }
        Object[] objArr2 = objArr[i];
        int i2 = this.b;
        objArr2[i2 & 255] = t;
        this.b = i2 + 1;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final T get(int i) {
        return (T) this.a[i >> 8][i & 255];
    }

    @Override // java.util.AbstractList, java.util.List
    public final T set(int i, T t) {
        Object[][] objArr = this.a;
        T t2 = (T) objArr[i];
        objArr[i >> 8][i & 255] = t;
        return t2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }
}
