package defpackage;

import java.lang.Comparable;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: dcpc  reason: default package */
/* loaded from: classes5.dex */
public final class dcpc<K extends Comparable, V> implements dcmb<K, V> {
    public final NavigableMap<dcak<K>, dcpb<K, V>> a = new TreeMap();

    private dcpc() {
    }

    public static <K extends Comparable, V> dcpc<K, V> a() {
        return new dcpc<>();
    }

    private static <K extends Comparable, V> dclz<K> d(dclz<K> dclzVar, V v, Map.Entry<dcak<K>, dcpb<K, V>> entry) {
        dcak<K> dcakVar;
        if (entry == null || !entry.getValue().a.r(dclzVar) || !entry.getValue().b.equals(v)) {
            return dclzVar;
        }
        dclz<K> dclzVar2 = entry.getValue().a;
        int compareTo = dclzVar.b.compareTo(dclzVar2.b);
        int compareTo2 = dclzVar.c.compareTo(dclzVar2.c);
        if (compareTo <= 0 && compareTo2 >= 0) {
            return dclzVar;
        }
        if (compareTo >= 0 && compareTo2 <= 0) {
            return dclzVar2;
        }
        dcak<K> dcakVar2 = compareTo <= 0 ? dclzVar.b : dclzVar2.b;
        if (compareTo2 >= 0) {
            dcakVar = dclzVar.c;
        } else {
            dcakVar = dclzVar2.c;
        }
        return dclz.d(dcakVar2, dcakVar);
    }

    private final void f(dcak<K> dcakVar, dcak<K> dcakVar2, V v) {
        this.a.put(dcakVar, new dcpb(dclz.d(dcakVar, dcakVar2), v));
    }

    @Override // defpackage.dcmb
    public final void b(dclz<K> dclzVar, V v) {
        if (!dclzVar.p()) {
            dbsk.s(v);
            if (!dclzVar.p()) {
                Map.Entry<dcak<K>, dcpb<K, V>> lowerEntry = this.a.lowerEntry(dclzVar.b);
                if (lowerEntry != null) {
                    dcpb<K, V> value = lowerEntry.getValue();
                    if (value.a().compareTo(dclzVar.b) > 0) {
                        if (value.a().compareTo(dclzVar.c) > 0) {
                            f(dclzVar.c, value.a(), lowerEntry.getValue().b);
                        }
                        f(value.a.b, dclzVar.b, lowerEntry.getValue().b);
                    }
                }
                Map.Entry<dcak<K>, dcpb<K, V>> lowerEntry2 = this.a.lowerEntry(dclzVar.c);
                if (lowerEntry2 != null) {
                    dcpb<K, V> value2 = lowerEntry2.getValue();
                    if (value2.a().compareTo(dclzVar.c) > 0) {
                        f(dclzVar.c, value2.a(), lowerEntry2.getValue().b);
                    }
                }
                this.a.subMap(dclzVar.b, dclzVar.c).clear();
            }
            this.a.put(dclzVar.b, new dcpb(dclzVar, v));
        }
    }

    @Override // defpackage.dcmb
    public final void c(dclz<K> dclzVar, V v) {
        if (this.a.isEmpty()) {
            b(dclzVar, v);
            return;
        }
        dbsk.s(v);
        b(d(d(dclzVar, v, this.a.lowerEntry(dclzVar.b)), v, this.a.floorEntry(dclzVar.c)), v);
    }

    @Override // defpackage.dcmb
    public final Map<dclz<K>, V> e() {
        return new dcpa(this, this.a.values());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof dcmb) {
            return e().equals(((dcmb) obj).e());
        }
        return false;
    }

    public final int hashCode() {
        return e().hashCode();
    }

    public final String toString() {
        return this.a.values().toString();
    }
}
