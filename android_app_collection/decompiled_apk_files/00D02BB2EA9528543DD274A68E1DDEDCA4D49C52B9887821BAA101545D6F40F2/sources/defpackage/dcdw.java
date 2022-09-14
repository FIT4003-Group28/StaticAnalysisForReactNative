package defpackage;
/* compiled from: PG */
/* renamed from: dcdw  reason: default package */
/* loaded from: classes5.dex */
final class dcdw<K, V> extends dccr<V> {
    public final dcdn<K, V> a;

    public dcdw(dcdn<K, V> dcdnVar) {
        this.a = dcdnVar;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<V> iterator() {
        return new dcdt(this);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return obj != null && dcgh.c(iterator(), obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.dccr
    public final dcdc<V> v() {
        return new dcdu(this.a.entrySet().v());
    }

    @Override // defpackage.dccr
    Object writeReplace() {
        return new dcdv(this.a);
    }
}
