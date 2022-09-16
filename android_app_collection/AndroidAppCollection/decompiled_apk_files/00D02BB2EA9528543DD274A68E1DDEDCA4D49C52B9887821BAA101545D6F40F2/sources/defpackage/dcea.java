package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcea  reason: default package */
/* loaded from: classes5.dex */
final class dcea<K, V> extends dccr<Map.Entry<K, V>> {
    private static final long serialVersionUID = 0;
    final dced<K, V> a;

    public dcea(dced<K, V> dcedVar) {
        this.a = dcedVar;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<Map.Entry<K, V>> iterator() {
        return this.a.w();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return this.a.o();
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.F(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        return this.a.c;
    }
}
