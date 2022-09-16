package defpackage;

import java.util.Comparator;
import java.util.NoSuchElementException;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dzqi  reason: default package */
/* loaded from: classes6.dex */
final class dzqi extends dzod {
    final /* synthetic */ dzqn a;

    public dzqi(dzqn dzqnVar) {
        this.a = dzqnVar;
    }

    @Override // defpackage.dzod, defpackage.dzoc, defpackage.dznw, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: c */
    public final dzrs iterator() {
        return new dzqh(this.a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.a.clear();
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // java.util.SortedSet
    public final Object first() {
        dzqn dzqnVar = this.a;
        if (dzqnVar.k == 0) {
            throw new NoSuchElementException();
        }
        return dzqnVar.b[dzqnVar.f];
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final Object last() {
        dzqn dzqnVar = this.a;
        if (dzqnVar.k == 0) {
            throw new NoSuchElementException();
        }
        return dzqnVar.b[dzqnVar.g];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        dzqn dzqnVar = this.a;
        int i = dzqnVar.k;
        dzqnVar.remove(obj);
        return this.a.k != i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.k;
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.SortedSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        throw new UnsupportedOperationException();
    }
}
