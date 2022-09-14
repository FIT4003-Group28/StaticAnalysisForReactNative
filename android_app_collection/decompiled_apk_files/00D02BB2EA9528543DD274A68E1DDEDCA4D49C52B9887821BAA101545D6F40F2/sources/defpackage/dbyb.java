package defpackage;

import java.util.Iterator;
import java.util.NavigableSet;
/* compiled from: PG */
/* renamed from: dbyb  reason: default package */
/* loaded from: classes5.dex */
final class dbyb extends dbyd implements NavigableSet {
    final /* synthetic */ dbye f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbyb(dbye dbyeVar, Object obj, NavigableSet navigableSet, dbxy dbxyVar) {
        super(dbyeVar, obj, navigableSet, dbxyVar);
        this.f = dbyeVar;
    }

    private final NavigableSet f(NavigableSet navigableSet) {
        dbye dbyeVar = this.f;
        Object obj = this.a;
        dbxy dbxyVar = this.c;
        if (dbxyVar == null) {
            dbxyVar = this;
        }
        return new dbyb(dbyeVar, obj, navigableSet, dbxyVar);
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return e().ceiling(obj);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dbyd
    /* renamed from: d */
    public final NavigableSet e() {
        return (NavigableSet) super.e();
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return new dbxx(this, e().descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return f(e().descendingSet());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return e().floor(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return f(e().headSet(obj, z));
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return e().higher(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return e().lower(obj);
    }

    @Override // java.util.NavigableSet
    public final Object pollFirst() {
        return dcgh.q(iterator());
    }

    @Override // java.util.NavigableSet
    public final Object pollLast() {
        return dcgh.q(descendingIterator());
    }

    @Override // java.util.NavigableSet
    public final NavigableSet subSet(Object obj, boolean z, Object obj2, boolean z2) {
        return f(e().subSet(obj, z, obj2, z2));
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return f(e().tailSet(obj, z));
    }
}
