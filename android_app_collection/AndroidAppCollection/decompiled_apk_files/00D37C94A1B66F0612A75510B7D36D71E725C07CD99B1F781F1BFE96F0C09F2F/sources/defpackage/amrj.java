package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amrj  reason: default package */
/* loaded from: classes.dex */
class amrj extends amre implements SortedSet {
    final /* synthetic */ amro c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amrj(amro amroVar, SortedMap sortedMap) {
        super(amroVar, sortedMap);
        this.c = amroVar;
    }

    public SortedMap b() {
        return (SortedMap) this.d;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return b().comparator();
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return b().firstKey();
    }

    public SortedSet headSet(Object obj) {
        return new amrj(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new amrj(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new amrj(this.c, b().tailMap(obj));
    }
}
