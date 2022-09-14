package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcer  reason: default package */
/* loaded from: classes.dex */
public final class dcer<K, V> extends dcep<Map.Entry<K, V>> {
    private final transient dcet<K, V> a;

    public dcer(dcet<K, V> dcetVar) {
        this.a = dcetVar;
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<Map.Entry<K, V>> iterator() {
        return this.a.w();
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return false;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return this.a.F(entry.getKey(), entry.getValue());
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((dced) this.a).c;
    }
}
