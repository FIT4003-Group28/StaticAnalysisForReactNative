package defpackage;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.SortedSet;
/* compiled from: PG */
/* renamed from: amri  reason: default package */
/* loaded from: classes.dex */
class amri extends amrb implements SortedMap {
    SortedSet d;
    final /* synthetic */ amro e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amri(amro amroVar, SortedMap sortedMap) {
        super(amroVar, sortedMap);
        this.e = amroVar;
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        return h().comparator();
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        return h().firstKey();
    }

    public SortedMap h() {
        return (SortedMap) this.a;
    }

    public SortedMap headMap(Object obj) {
        return new amri(this.e, h().headMap(obj));
    }

    @Override // defpackage.amxb
    /* renamed from: i */
    public SortedSet g() {
        return new amrj(this.e, h());
    }

    @Override // defpackage.amrb, defpackage.amxb, java.util.AbstractMap, java.util.Map
    /* renamed from: j */
    public SortedSet keySet() {
        SortedSet sortedSet = this.d;
        if (sortedSet == null) {
            SortedSet g = g();
            this.d = g;
            return g;
        }
        return sortedSet;
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        return h().lastKey();
    }

    public SortedMap subMap(Object obj, Object obj2) {
        return new amri(this.e, h().subMap(obj, obj2));
    }

    public SortedMap tailMap(Object obj) {
        return new amri(this.e, h().tailMap(obj));
    }
}
