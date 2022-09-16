package defpackage;

import java.util.Collection;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: afu  reason: default package */
/* loaded from: classes.dex */
final class afu implements Collection {
    final /* synthetic */ afw a;

    public afu(afw afwVar) {
        this.a = afwVar;
    }

    @Override // java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.e(obj) >= 0;
    }

    @Override // java.util.Collection
    public final boolean containsAll(Collection collection) {
        for (Object obj : collection) {
            if (!contains(obj)) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new afv(this.a);
    }

    @Override // java.util.Collection
    public final boolean remove(Object obj) {
        int e = this.a.e(obj);
        if (e >= 0) {
            this.a.g(e);
            return true;
        }
        return false;
    }

    @Override // java.util.Collection
    public final boolean removeAll(Collection collection) {
        int i = this.a.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (collection.contains(this.a.i(i2))) {
                this.a.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final boolean retainAll(Collection collection) {
        int i = this.a.j;
        int i2 = 0;
        boolean z = false;
        while (i2 < i) {
            if (!collection.contains(this.a.i(i2))) {
                this.a.g(i2);
                i2--;
                i--;
                z = true;
            }
            i2++;
        }
        return z;
    }

    @Override // java.util.Collection
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.Collection
    public final Object[] toArray() {
        int i = this.a.j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.a.i(i2);
        }
        return objArr;
    }

    @Override // java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 1);
    }
}
