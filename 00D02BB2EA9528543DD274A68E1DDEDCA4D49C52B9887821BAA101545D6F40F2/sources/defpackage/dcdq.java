package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdq  reason: default package */
/* loaded from: classes5.dex */
abstract class dcdq<K, V> extends dcep<Map.Entry<K, V>> {
    @Override // defpackage.dccr
    public final boolean SI() {
        return b().c();
    }

    public abstract dcdn<K, V> b();

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            V v = b().get(entry.getKey());
            if (v != null && v.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dcep, java.util.Collection, java.util.Set
    public final int hashCode() {
        return b().hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return b().size();
    }

    @Override // defpackage.dcep
    public final boolean w() {
        return b().SK();
    }

    @Override // defpackage.dcep, defpackage.dccr
    Object writeReplace() {
        return new dcdo(b());
    }
}
