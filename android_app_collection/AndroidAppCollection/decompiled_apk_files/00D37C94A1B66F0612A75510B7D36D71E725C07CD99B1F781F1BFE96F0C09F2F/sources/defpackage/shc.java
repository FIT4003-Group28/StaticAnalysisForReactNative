package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
/* compiled from: PG */
/* renamed from: shc  reason: default package */
/* loaded from: classes4.dex */
public final class shc implements List {
    public final int a;
    private final shi b;

    public shc(shi shiVar, int i) {
        this.b = shiVar;
        this.a = i;
    }

    @Override // java.util.List
    /* renamed from: a */
    public final shi get(int i) {
        try {
            shi clone = this.b.clone();
            clone.c = i;
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Could not clone the datum", e);
        }
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        shi shiVar = (shi) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
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
    public final boolean containsAll(Collection collection) {
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
    public final Iterator iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        throw new UnsupportedOperationException("Not supported as elements are created on the fly");
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        shi shiVar = (shi) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        return this.a;
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        throw new UnsupportedOperationException("No need for this yet?");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        throw new UnsupportedOperationException("No need for this yet?");
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        try {
            shi clone = this.b.clone();
            clone.c = -1;
            return new shb(this, clone);
        } catch (CloneNotSupportedException e) {
            throw new UnsupportedOperationException("Could not clone the datum", e);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("ImmutableList");
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException("No need for this yet?");
    }

    @Override // java.util.List, java.util.Collection
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        shi shiVar = (shi) obj;
        throw new UnsupportedOperationException("ImmutableList");
    }
}
