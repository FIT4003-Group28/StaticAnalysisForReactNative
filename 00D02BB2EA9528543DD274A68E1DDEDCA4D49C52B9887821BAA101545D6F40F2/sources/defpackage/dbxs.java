package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxs  reason: default package */
/* loaded from: classes5.dex */
public final class dbxs extends dbxv implements NavigableMap {
    final /* synthetic */ dbye c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxs(dbye dbyeVar, NavigableMap navigableMap) {
        super(dbyeVar, navigableMap);
        this.c = dbyeVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dbxv
    /* renamed from: c */
    public final NavigableMap i() {
        return (NavigableMap) super.i();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry ceilingEntry(Object obj) {
        Map.Entry ceilingEntry = i().ceilingEntry(obj);
        if (ceilingEntry == null) {
            return null;
        }
        return b(ceilingEntry);
    }

    @Override // java.util.NavigableMap
    public final Object ceilingKey(Object obj) {
        return i().ceilingKey(obj);
    }

    final Map.Entry d(Iterator<Map.Entry> it) {
        if (!it.hasNext()) {
            return null;
        }
        Map.Entry next = it.next();
        Collection h = this.c.h();
        h.addAll((Collection) next.getValue());
        it.remove();
        return dcjz.p(next.getKey(), this.c.a(h));
    }

    @Override // java.util.NavigableMap
    public final NavigableSet descendingKeySet() {
        return ((dbxs) descendingMap()).keySet();
    }

    @Override // java.util.NavigableMap
    public final NavigableMap descendingMap() {
        return new dbxs(this.c, i().descendingMap());
    }

    @Override // defpackage.dbxv, defpackage.dbxo, defpackage.dcjy, java.util.AbstractMap, java.util.Map
    /* renamed from: e */
    public final NavigableSet keySet() {
        return (NavigableSet) super.keySet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.dbxv, defpackage.dcjy
    /* renamed from: f */
    public final NavigableSet j() {
        return new dbxt(this.c, i());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry firstEntry() {
        Map.Entry firstEntry = i().firstEntry();
        if (firstEntry == null) {
            return null;
        }
        return b(firstEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry floorEntry(Object obj) {
        Map.Entry floorEntry = i().floorEntry(obj);
        if (floorEntry == null) {
            return null;
        }
        return b(floorEntry);
    }

    @Override // java.util.NavigableMap
    public final Object floorKey(Object obj) {
        return i().floorKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap headMap(Object obj, boolean z) {
        return new dbxs(this.c, i().headMap(obj, z));
    }

    @Override // defpackage.dbxv, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap headMap(Object obj) {
        return headMap(obj, false);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry higherEntry(Object obj) {
        Map.Entry higherEntry = i().higherEntry(obj);
        if (higherEntry == null) {
            return null;
        }
        return b(higherEntry);
    }

    @Override // java.util.NavigableMap
    public final Object higherKey(Object obj) {
        return i().higherKey(obj);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lastEntry() {
        Map.Entry lastEntry = i().lastEntry();
        if (lastEntry == null) {
            return null;
        }
        return b(lastEntry);
    }

    @Override // java.util.NavigableMap
    public final Map.Entry lowerEntry(Object obj) {
        Map.Entry lowerEntry = i().lowerEntry(obj);
        if (lowerEntry == null) {
            return null;
        }
        return b(lowerEntry);
    }

    @Override // java.util.NavigableMap
    public final Object lowerKey(Object obj) {
        return i().lowerKey(obj);
    }

    @Override // java.util.NavigableMap
    public final NavigableSet navigableKeySet() {
        return keySet();
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollFirstEntry() {
        return d(entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final Map.Entry pollLastEntry() {
        return d(descendingMap().entrySet().iterator());
    }

    @Override // java.util.NavigableMap
    public final NavigableMap subMap(Object obj, boolean z, Object obj2, boolean z2) {
        return new dbxs(this.c, i().subMap(obj, z, obj2, z2));
    }

    @Override // defpackage.dbxv, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap subMap(Object obj, Object obj2) {
        return subMap(obj, true, obj2, false);
    }

    @Override // java.util.NavigableMap
    public final NavigableMap tailMap(Object obj, boolean z) {
        return new dbxs(this.c, i().tailMap(obj, z));
    }

    @Override // defpackage.dbxv, java.util.SortedMap, java.util.NavigableMap
    public final /* bridge */ /* synthetic */ SortedMap tailMap(Object obj) {
        return tailMap(obj, true);
    }
}
