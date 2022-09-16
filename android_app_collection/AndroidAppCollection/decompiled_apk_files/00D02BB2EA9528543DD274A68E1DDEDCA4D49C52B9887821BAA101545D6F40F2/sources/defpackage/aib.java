package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: PG */
/* renamed from: aib  reason: default package */
/* loaded from: classes.dex */
final class aib implements Set {
    final /* synthetic */ aif a;

    public aib(aif aifVar) {
        this.a = aifVar;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Set, java.util.Collection
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        aif aifVar = this.a;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!aifVar.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean equals(Object obj) {
        return aif.c(this, obj);
    }

    @Override // java.util.Set, java.util.Collection
    public final int hashCode() {
        int i = 0;
        for (int i2 = this.a.j - 1; i2 >= 0; i2--) {
            K i3 = this.a.i(i2);
            i += i3 == 0 ? 0 : i3.hashCode();
        }
        return i;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean isEmpty() {
        return this.a.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new aia(this.a);
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean remove(Object obj) {
        int g = this.a.g(obj);
        if (g >= 0) {
            this.a.m(g);
            return true;
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        aif aifVar = this.a;
        int i = aifVar.j;
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            aifVar.remove(it.next());
        }
        return i != aifVar.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        return this.a.a(collection);
    }

    @Override // java.util.Set, java.util.Collection
    public final int size() {
        return this.a.j;
    }

    @Override // java.util.Set, java.util.Collection
    public final Object[] toArray() {
        int i = this.a.j;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = this.a.i(i2);
        }
        return objArr;
    }

    @Override // java.util.Set, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        return (T[]) this.a.b(tArr, 0);
    }
}
