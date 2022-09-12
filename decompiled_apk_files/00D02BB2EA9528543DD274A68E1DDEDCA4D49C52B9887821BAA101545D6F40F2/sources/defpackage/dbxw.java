package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxw  reason: default package */
/* loaded from: classes5.dex */
public class dbxw extends dbxr implements SortedSet {
    final /* synthetic */ dbye c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxw(dbye dbyeVar, SortedMap sortedMap) {
        super(dbyeVar, sortedMap);
        this.c = dbyeVar;
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
        return new dbxw(this.c, b().headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return b().lastKey();
    }

    public SortedSet subSet(Object obj, Object obj2) {
        return new dbxw(this.c, b().subMap(obj, obj2));
    }

    public SortedSet tailSet(Object obj) {
        return new dbxw(this.c, b().tailMap(obj));
    }
}
