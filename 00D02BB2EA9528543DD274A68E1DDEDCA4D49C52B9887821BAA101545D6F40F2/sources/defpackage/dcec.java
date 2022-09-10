package defpackage;
/* compiled from: PG */
/* renamed from: dcec  reason: default package */
/* loaded from: classes.dex */
final class dcec<K, V> extends dccr<V> {
    private static final long serialVersionUID = 0;
    private final transient dced<K, V> a;

    public dcec(dced<K, V> dcedVar) {
        this.a = dcedVar;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        dcpd<? extends dccr<V>> it = this.a.b.values().iterator();
        while (it.hasNext()) {
            i = it.next().A(objArr, i);
        }
        return i;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<V> iterator() {
        return new dcdy(this.a);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.a.E(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.c;
    }
}
