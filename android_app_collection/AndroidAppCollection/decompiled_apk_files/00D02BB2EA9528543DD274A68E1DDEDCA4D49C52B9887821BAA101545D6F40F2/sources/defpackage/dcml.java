package defpackage;
/* compiled from: PG */
/* renamed from: dcml  reason: default package */
/* loaded from: classes.dex */
final class dcml<K> extends dcep<K> {
    private final transient dcdn<K, ?> a;
    private final transient dcdc<K> b;

    public dcml(dcdn<K, ?> dcdnVar, dcdc<K> dcdcVar) {
        this.a = dcdnVar;
        this.b = dcdcVar;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        return this.b.A(objArr, i);
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<K> iterator() {
        return this.b.listIterator();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.get(obj) != null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.dcep, defpackage.dccr
    public final dcdc<K> v() {
        return this.b;
    }
}
