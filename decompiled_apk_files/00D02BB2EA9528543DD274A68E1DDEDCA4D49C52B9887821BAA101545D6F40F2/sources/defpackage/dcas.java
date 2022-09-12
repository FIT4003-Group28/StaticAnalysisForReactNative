package defpackage;

import java.util.NavigableSet;
/* compiled from: PG */
/* renamed from: dcas  reason: default package */
/* loaded from: classes5.dex */
final class dcas<E> extends dcfc<E> {
    private final dcfc<E> a;

    public dcas(dcfc<E> dcfcVar) {
        super(dclu.d(dcfcVar.b).c());
        this.a = dcfcVar;
    }

    @Override // defpackage.dcfc, defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<E> iterator() {
        return this.a.descendingIterator();
    }

    @Override // defpackage.dcfc
    public final dcfc<E> SF() {
        return this.a;
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    /* renamed from: SG */
    public final dcpd<E> descendingIterator() {
        return this.a.iterator();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return this.a.SI();
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E ceiling(E e) {
        return this.a.floor(e);
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.contains(obj);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ NavigableSet descendingSet() {
        return this.a;
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E floor(E e) {
        return this.a.ceiling(e);
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E higher(E e) {
        return this.a.lower(e);
    }

    @Override // defpackage.dcfc
    public final dcfc<E> l() {
        throw new AssertionError("should never be called");
    }

    @Override // defpackage.dcfc, java.util.NavigableSet
    public final E lower(E e) {
        return this.a.higher(e);
    }

    @Override // defpackage.dcfc
    public final dcfc<E> m(E e, boolean z) {
        return this.a.headSet(e, z).descendingSet();
    }

    @Override // defpackage.dcfc
    public final dcfc<E> n(E e, boolean z, E e2, boolean z2) {
        return this.a.subSet(e2, z2, e, z).descendingSet();
    }

    @Override // defpackage.dcfc
    public final dcfc<E> o(E e, boolean z) {
        return this.a.tailSet(e, z).descendingSet();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }
}
