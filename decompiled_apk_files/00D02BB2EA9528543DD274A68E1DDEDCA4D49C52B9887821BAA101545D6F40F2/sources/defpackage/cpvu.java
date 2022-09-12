package defpackage;

import defpackage.cpwd;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cpvu  reason: default package */
/* loaded from: classes5.dex */
public final class cpvu<D extends cpwd<D>> implements List<D> {
    public final int a;
    private final D b;

    public cpvu(D d, int i) {
        this.b = d;
        this.a = i;
    }

    @Override // java.util.List
    /* renamed from: a */
    public final D get(int i) {
        try {
            D d = (D) this.b.clone();
            d.c = i;
            return d;
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Could not clone the datum", e);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        cpwd cpwdVar = (cpwd) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        cpwd cpwdVar = (cpwd) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection<? extends D> collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        throw new UnsupportedOperationException("Not supported as elements are created on the fly");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection<?> collection) {
        throw new UnsupportedOperationException("Not supported as elements are created on the fly");
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        throw new UnsupportedOperationException("Not supported as elements are created on the fly");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        return this.a <= 0;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator<D> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException("Not supported as elements are created on the fly");
    }

    @Override // java.util.List
    public final ListIterator<D> listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        cpwd cpwdVar = (cpwd) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List<D> subList(int i, int i2) {
        throw new UnsupportedOperationException("No need for this yet?");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException("No need for this yet?");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection<? extends D> collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final ListIterator<D> listIterator(int i) {
        try {
            cpwd clone = this.b.clone();
            clone.c = -1;
            return new cpvt(this, clone);
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Could not clone the datum", e);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final <D> D[] toArray(D[] dArr) {
        throw new UnsupportedOperationException("No need for this yet?");
    }
}
