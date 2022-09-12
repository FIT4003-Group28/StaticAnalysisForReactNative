package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcor  reason: default package */
/* loaded from: classes5.dex */
public final class dcor<E> extends dcoq<E> implements SortedSet<E> {
    private static final long serialVersionUID = 0;

    public dcor(SortedSet<E> sortedSet, Object obj) {
        super(sortedSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dcoq
    /* renamed from: c */
    public final SortedSet<E> b() {
        return (SortedSet) super.a();
    }

    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        Comparator<? super E> comparator;
        synchronized (this.g) {
            comparator = b().comparator();
        }
        return comparator;
    }

    @Override // java.util.SortedSet
    public final E first() {
        E first;
        synchronized (this.g) {
            first = b().first();
        }
        return first;
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E e) {
        SortedSet<E> c;
        synchronized (this.g) {
            c = dcos.c(b().headSet(e), this.g);
        }
        return c;
    }

    @Override // java.util.SortedSet
    public final E last() {
        E last;
        synchronized (this.g) {
            last = b().last();
        }
        return last;
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E e, E e2) {
        SortedSet<E> c;
        synchronized (this.g) {
            c = dcos.c(b().subSet(e, e2), this.g);
        }
        return c;
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E e) {
        SortedSet<E> c;
        synchronized (this.g) {
            c = dcos.c(b().tailSet(e), this.g);
        }
        return c;
    }
}
