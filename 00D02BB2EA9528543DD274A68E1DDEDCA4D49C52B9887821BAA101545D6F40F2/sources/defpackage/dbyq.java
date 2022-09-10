package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbyq  reason: default package */
/* loaded from: classes.dex */
public abstract class dbyq<E> extends AbstractCollection<E> implements dclb<E> {
    private transient Set<E> a;
    private transient Set<dcla<E>> b;

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final boolean add(E e) {
        f(e, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection<? extends E> collection) {
        dbsk.s(collection);
        if (collection instanceof dclb) {
            dclb dclbVar = (dclb) collection;
            if (dclbVar instanceof dbyi) {
                dbyi dbyiVar = (dbyi) dclbVar;
                if (!dbyiVar.isEmpty()) {
                    for (int a = dbyiVar.a.a(); a >= 0; a = dbyiVar.a.b(a)) {
                        f(dbyiVar.a.c(a), dbyiVar.a.d(a));
                    }
                    return true;
                }
            } else if (!dclbVar.isEmpty()) {
                for (dcla<E> dclaVar : dclbVar.l()) {
                    f(dclaVar.a(), dclaVar.b());
                }
                return true;
            }
        } else if (!collection.isEmpty()) {
            return dcgh.g(this, collection.iterator());
        }
        return false;
    }

    public int b(Object obj, int i) {
        throw null;
    }

    public abstract Iterator<E> c();

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator<dcla<E>> d();

    public abstract int e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return dclh.a(this, obj);
    }

    public void f(E e, int i) {
        throw null;
    }

    public void h(E e) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return l().hashCode();
    }

    public boolean i(E e, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return l().isEmpty();
    }

    @Override // defpackage.dclb
    public final Set<E> j() {
        Set<E> set = this.a;
        if (set == null) {
            Set<E> k = k();
            this.a = k;
            return k;
        }
        return set;
    }

    public Set<E> k() {
        return new dbyo(this);
    }

    @Override // defpackage.dclb
    public final Set<dcla<E>> l() {
        Set<dcla<E>> set = this.b;
        if (set == null) {
            Set<dcla<E>> m = m();
            this.b = m;
            return m;
        }
        return set;
    }

    public Set<dcla<E>> m() {
        return new dbyp(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.dclb
    public final boolean remove(Object obj) {
        return b(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        if (collection instanceof dclb) {
            collection = ((dclb) collection).j();
        }
        return j().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        dbsk.s(collection);
        if (collection instanceof dclb) {
            collection = ((dclb) collection).j();
        }
        return j().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return l().toString();
    }
}
