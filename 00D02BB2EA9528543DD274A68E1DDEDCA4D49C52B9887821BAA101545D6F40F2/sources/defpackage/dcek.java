package defpackage;

import java.lang.Comparable;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dcek  reason: default package */
/* loaded from: classes5.dex */
public final class dcek<K extends Comparable<?>, V> {
    private final List<Map.Entry<dclz<K>, V>> a = dchl.a();

    public final dcem<K, V> a() {
        Collections.sort(this.a, dclz.c().g(dcjh.KEY));
        dccx dccxVar = new dccx(this.a.size());
        dccx dccxVar2 = new dccx(this.a.size());
        for (int i = 0; i < this.a.size(); i++) {
            dclz<K> key = this.a.get(i).getKey();
            if (i > 0) {
                dclz<K> key2 = this.a.get(i - 1).getKey();
                if (key.r(key2) && !key.s(key2).p()) {
                    String valueOf = String.valueOf(key2);
                    String valueOf2 = String.valueOf(key);
                    StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
                    sb.append("Overlapping ranges: range ");
                    sb.append(valueOf);
                    sb.append(" overlaps with entry ");
                    sb.append(valueOf2);
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            dccxVar.g(key);
            dccxVar2.g(this.a.get(i).getValue());
        }
        return new dcem<>(dccxVar.f(), dccxVar2.f());
    }

    public final void b(dclz<K> dclzVar, V v) {
        dbsk.s(dclzVar);
        dbsk.s(v);
        dbsk.g(!dclzVar.p(), "Range must not be empty, but was %s", dclzVar);
        this.a.add(dcjz.p(dclzVar, v));
    }
}
