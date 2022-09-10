package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcnl  reason: default package */
/* loaded from: classes5.dex */
public final class dcnl<E> extends dcbt<E> implements NavigableSet<E>, Serializable {
    private static final long serialVersionUID = 0;
    private final NavigableSet<E> a;
    private final SortedSet<E> b;
    private transient dcnl<E> c;

    public dcnl(NavigableSet<E> navigableSet) {
        dbsk.s(navigableSet);
        this.a = navigableSet;
        this.b = Collections.unmodifiableSortedSet(navigableSet);
    }

    @Override // defpackage.dcbh, defpackage.dcbq
    protected final /* bridge */ /* synthetic */ Object SC() {
        return this.b;
    }

    @Override // defpackage.dcbt, defpackage.dcbs
    protected final /* bridge */ /* synthetic */ Set a() {
        return this.b;
    }

    @Override // defpackage.dcbs, defpackage.dcbh
    protected final /* bridge */ /* synthetic */ Collection b() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final E ceiling(E e) {
        return this.a.ceiling(e);
    }

    @Override // java.util.NavigableSet
    public final Iterator<E> descendingIterator() {
        return dcgh.a(this.a.descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> descendingSet() {
        dcnl<E> dcnlVar = this.c;
        if (dcnlVar == null) {
            dcnl<E> dcnlVar2 = new dcnl<>(this.a.descendingSet());
            this.c = dcnlVar2;
            dcnlVar2.c = this;
            return dcnlVar2;
        }
        return dcnlVar;
    }

    @Override // java.util.NavigableSet
    public final E floor(E e) {
        return this.a.floor(e);
    }

    @Override // defpackage.dcbt
    protected final SortedSet<E> g() {
        return this.b;
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> headSet(E e, boolean z) {
        return dcnm.t(this.a.headSet(e, z));
    }

    @Override // java.util.NavigableSet
    public final E higher(E e) {
        return this.a.higher(e);
    }

    @Override // java.util.NavigableSet
    public final E lower(E e) {
        return this.a.lower(e);
    }

    @Override // java.util.NavigableSet
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> subSet(E e, boolean z, E e2, boolean z2) {
        return dcnm.t(this.a.subSet(e, z, e2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet<E> tailSet(E e, boolean z) {
        return dcnm.t(this.a.tailSet(e, z));
    }
}
