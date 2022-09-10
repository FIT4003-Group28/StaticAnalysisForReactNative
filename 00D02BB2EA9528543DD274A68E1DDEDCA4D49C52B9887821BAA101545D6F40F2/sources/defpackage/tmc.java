package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: tmc  reason: default package */
/* loaded from: classes7.dex */
public abstract class tmc {
    final HashMap<String, tlu> b = new HashMap<>();

    public abstract tme a();

    public abstract dccx<String> b();

    public abstract dcdc<String> c();

    public abstract tmd d();

    public abstract void e(btlu btluVar);

    public abstract void f(dcdn<String, tlv> dcdnVar);

    public abstract void g(tme tmeVar);

    public final tmd h() {
        dcdg p = dcdn.p();
        for (Map.Entry<String, tlu> entry : this.b.entrySet()) {
            tlu value = entry.getValue();
            value.k(a());
            p.f(entry.getKey(), value.e());
        }
        f(p.b());
        return d();
    }

    public final void i(Iterable<tlu> iterable) {
        for (tlu tluVar : iterable) {
            j(tluVar);
        }
    }

    public final void j(tlu tluVar) {
        this.b.put(tluVar.b(), tluVar);
        if (!c().contains(tluVar.b())) {
            b().g(tluVar.b());
        }
    }
}
