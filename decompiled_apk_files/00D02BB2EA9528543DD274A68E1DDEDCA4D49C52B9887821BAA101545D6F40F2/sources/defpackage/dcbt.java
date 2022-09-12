package defpackage;

import java.util.Comparator;
import java.util.Set;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: dcbt  reason: default package */
/* loaded from: classes5.dex */
public abstract class dcbt<E> extends dcbs<E> implements SortedSet<E> {
    @Override // defpackage.dcbs
    protected /* bridge */ /* synthetic */ Set a() {
        throw null;
    }

    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return g().comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        return g().first();
    }

    protected abstract SortedSet<E> g();

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E e) {
        return g().headSet(e);
    }

    @Override // java.util.SortedSet
    public final E last() {
        return g().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E e, E e2) {
        return g().subSet(e, e2);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E e) {
        return g().tailSet(e);
    }
}
