package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dbxv  reason: default package */
/* loaded from: classes5.dex */
public class dbxv extends dbxo implements SortedMap {
    SortedSet d;
    final /* synthetic */ dbye e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dbxv(dbye dbyeVar, SortedMap sortedMap) {
        super(dbyeVar, sortedMap);
        this.e = dbyeVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return i().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return i().firstKey();
    }

    @Override // defpackage.dcjy
    /* renamed from: g */
    public SortedSet j() {
        return new dbxw(this.e, i());
    }

    @Override // defpackage.dbxo, defpackage.dcjy, java.util.AbstractMap, java.util.Map
    /* renamed from: h */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet == null) {
            SortedSet j = j();
            this.d = j;
            return j;
        }
        return sortedSet;
    }

    public SortedMap headMap(Object obj) {
        return new dbxv(this.e, i().headMap(obj));
    }

    public SortedMap i() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return i().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new dbxv(this.e, i().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new dbxv(this.e, i().tailMap(obj));
    }
}
