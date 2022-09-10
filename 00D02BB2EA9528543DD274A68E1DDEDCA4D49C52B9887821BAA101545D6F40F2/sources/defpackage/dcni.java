package defpackage;

import java.util.Comparator;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcni  reason: default package */
/* loaded from: classes5.dex */
public final class dcni<E> extends dcnh<E> implements SortedSet<E> {
    public dcni(SortedSet<E> sortedSet, dbsl<? super E> dbslVar) {
        super(sortedSet, dbslVar);
    }

    @Override // java.util.SortedSet
    public final Comparator<? super E> comparator() {
        return ((SortedSet) this.a).comparator();
    }

    @Override // java.util.SortedSet
    public final E first() {
        return (E) dcgh.j(this.a.iterator(), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> headSet(E e) {
        return new dcni(((SortedSet) this.a).headSet(e), this.b);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [E, java.lang.Object] */
    @Override // java.util.SortedSet
    public final E last() {
        SortedSet sortedSet = (SortedSet) this.a;
        while (true) {
            ?? r1 = (Object) sortedSet.last();
            if (this.b.a(r1)) {
                return r1;
            }
            sortedSet = sortedSet.headSet(r1);
        }
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> subSet(E e, E e2) {
        return new dcni(((SortedSet) this.a).subSet(e, e2), this.b);
    }

    @Override // java.util.SortedSet
    public final SortedSet<E> tailSet(E e) {
        return new dcni(((SortedSet) this.a).tailSet(e), this.b);
    }
}
