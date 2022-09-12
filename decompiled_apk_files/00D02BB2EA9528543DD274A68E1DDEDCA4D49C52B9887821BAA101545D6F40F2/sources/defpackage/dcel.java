package defpackage;

import java.io.Serializable;
import java.lang.Comparable;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcel  reason: default package */
/* loaded from: classes5.dex */
final class dcel<K extends Comparable<?>, V> implements Serializable {
    private static final long serialVersionUID = 0;
    private final dcdn<dclz<K>, V> a;

    public dcel(dcdn<dclz<K>, V> dcdnVar) {
        this.a = dcdnVar;
    }

    Object readResolve() {
        if (!this.a.isEmpty()) {
            dcek dcekVar = new dcek();
            dcpd<Map.Entry<dclz<K>, V>> it = this.a.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<dclz<K>, V> next = it.next();
                dcekVar.b(next.getKey(), next.getValue());
            }
            return dcekVar.a();
        }
        return dcem.a;
    }
}
