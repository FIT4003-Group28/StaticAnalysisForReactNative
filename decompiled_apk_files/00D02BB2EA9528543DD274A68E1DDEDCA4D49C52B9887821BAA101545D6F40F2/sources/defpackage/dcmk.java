package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dcmk  reason: default package */
/* loaded from: classes.dex */
public final class dcmk<K, V> extends dcep<Map.Entry<K, V>> {
    public final transient Object[] a;
    public final transient int b;
    public final transient int c;
    private final transient dcdn<K, V> d;

    public dcmk(dcdn<K, V> dcdnVar, Object[] objArr, int i, int i2) {
        this.d = dcdnVar;
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.dccr
    public final int A(Object[] objArr, int i) {
        return v().A(objArr, i);
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<Map.Entry<K, V>> iterator() {
        return v().listIterator();
    }

    @Override // defpackage.dcep
    public final dcdc<Map.Entry<K, V>> SH() {
        return new dcmj(this);
    }

    @Override // defpackage.dccr
    public final boolean SI() {
        return true;
    }

    @Override // defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.d.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.c;
    }
}
