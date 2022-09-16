package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amrw  reason: default package */
/* loaded from: classes.dex */
public abstract class amrw extends AbstractCollection implements amxj {
    private transient Set a;
    private transient Set b;

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        f(obj, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        collection.getClass();
        if (collection instanceof amxj) {
            amxj amxjVar = (amxj) collection;
            if (amxjVar instanceof amrs) {
                amrs amrsVar = (amrs) amxjVar;
                if (!amrsVar.isEmpty()) {
                    for (int a = amrsVar.a.a(); a >= 0; a = amrsVar.a.e(a)) {
                        f(amrsVar.a.g(a), amrsVar.a.c(a));
                    }
                    return true;
                }
            } else if (!amxjVar.isEmpty()) {
                for (amxk amxkVar : amxjVar.j()) {
                    f(amxkVar.a, amxkVar.a());
                }
                return true;
            }
        } else if (!collection.isEmpty()) {
            return arey.n(this, collection.iterator());
        }
        return false;
    }

    public abstract int b();

    public int c(Object obj, int i) {
        throw null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amxj
    public final boolean contains(Object obj) {
        return a(obj) > 0;
    }

    public abstract Iterator d();

    public abstract Iterator e();

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        return amxp.f(this, obj);
    }

    public void f(Object obj, int i) {
        throw null;
    }

    public boolean h(Object obj, int i) {
        throw null;
    }

    @Override // java.util.Collection
    public final int hashCode() {
        return j().hashCode();
    }

    @Override // defpackage.amxj
    public final Set i() {
        Set set = this.a;
        if (set == null) {
            amxl amxlVar = new amxl(this);
            this.a = amxlVar;
            return amxlVar;
        }
        return set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        return j().isEmpty();
    }

    @Override // defpackage.amxj
    public final Set j() {
        Set set = this.b;
        if (set == null) {
            amxm amxmVar = new amxm(this);
            this.b = amxmVar;
            return amxmVar;
        }
        return set;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, defpackage.amxj
    public final boolean remove(Object obj) {
        return c(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection instanceof amxj) {
            collection = ((amxj) collection).i();
        }
        return i().removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        if (collection instanceof amxj) {
            collection = ((amxj) collection).i();
        }
        return i().retainAll(collection);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return j().toString();
    }
}
