package defpackage;

import java.util.Iterator;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxt  reason: default package */
/* loaded from: classes5.dex */
public final class dbxt extends dbxw implements NavigableSet {
    final /* synthetic */ dbye b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxt(dbye dbyeVar, NavigableMap navigableMap) {
        super(dbyeVar, navigableMap);
        this.b = dbyeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dbxw
    /* renamed from: a */
    public final NavigableMap b() {
        return (NavigableMap) super.b();
    }

    @Override // java.util.NavigableSet
    public final Object ceiling(Object obj) {
        return b().ceilingKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Iterator descendingIterator() {
        return descendingSet().iterator();
    }

    @Override // java.util.NavigableSet
    public final NavigableSet descendingSet() {
        return new dbxt(this.b, b().descendingMap());
    }

    @Override // java.util.NavigableSet
    public final Object floor(Object obj) {
        return b().floorKey(obj);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet headSet(Object obj, boolean z) {
        return new dbxt(this.b, b().headMap(obj, z));
    }

    @Override // defpackage.dbxw, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet headSet(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public final Object higher(Object obj) {
        return b().higherKey(obj);
    }

    @Override // java.util.NavigableSet
    public final Object lower(Object obj) {
        return b().lowerKey(obj);
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
        return new dbxt(this.b, b().subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.dbxw, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet subSet(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public final NavigableSet tailSet(Object obj, boolean z) {
        return new dbxt(this.b, b().tailMap(obj, z));
    }

    @Override // defpackage.dbxw, java.util.SortedSet, java.util.NavigableSet
    public final /* bridge */ /* synthetic */ SortedSet tailSet(Object obj) {
        return tailSet(obj, true);
    }
}
