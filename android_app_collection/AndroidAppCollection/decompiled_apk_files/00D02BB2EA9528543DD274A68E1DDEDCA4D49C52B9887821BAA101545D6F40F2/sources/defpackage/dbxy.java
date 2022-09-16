package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: dbxy  reason: default package */
/* loaded from: classes.dex */
class dbxy extends AbstractCollection {
    final Object a;
    Collection b;
    final dbxy c;
    final Collection d;
    final /* synthetic */ dbye e;

    public dbxy(dbye dbyeVar, Object obj, Collection collection, dbxy dbxyVar) {
        this.e = dbyeVar;
        this.a = obj;
        this.b = collection;
        this.c = dbxyVar;
        this.d = dbxyVar == null ? null : dbxyVar.b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        Collection collection;
        dbxy dbxyVar = this.c;
        if (dbxyVar != null) {
            dbxyVar.a();
            if (this.c.b != this.d) {
                throw new ConcurrentModificationException();
            }
        } else if (!this.b.isEmpty() || (collection = (Collection) this.e.a.get(this.a)) == null) {
        } else {
            this.b = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        a();
        boolean isEmpty = this.b.isEmpty();
        boolean add = this.b.add(obj);
        if (add) {
            dbye.z(this.e);
            if (!isEmpty) {
                return add;
            }
            c();
            return true;
        }
        return add;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean addAll = this.b.addAll(collection);
        if (!addAll) {
            return addAll;
        }
        dbye.B(this.e, this.b.size() - size);
        if (size != 0) {
            return addAll;
        }
        c();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dbxy dbxyVar = this.c;
        if (dbxyVar != null) {
            dbxyVar.b();
        } else if (!this.b.isEmpty()) {
        } else {
            this.e.a.remove(this.a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        dbxy dbxyVar = this.c;
        if (dbxyVar != null) {
            dbxyVar.c();
        } else {
            this.e.a.put(this.a, this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int size = size();
        if (size == 0) {
            return;
        }
        this.b.clear();
        dbye.C(this.e, size);
        b();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        a();
        return this.b.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        a();
        return this.b.containsAll(collection);
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        a();
        return this.b.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        a();
        return this.b.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a();
        return new dbxx(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        a();
        boolean remove = this.b.remove(obj);
        if (remove) {
            dbye.A(this.e);
            b();
        }
        return remove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        if (collection.isEmpty()) {
            return false;
        }
        int size = size();
        boolean removeAll = this.b.removeAll(collection);
        if (removeAll) {
            dbye.B(this.e, this.b.size() - size);
            b();
        }
        return removeAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        dbsk.s(collection);
        int size = size();
        boolean retainAll = this.b.retainAll(collection);
        if (retainAll) {
            dbye.B(this.e, this.b.size() - size);
            b();
        }
        return retainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        a();
        return this.b.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        a();
        return this.b.toString();
    }
}
