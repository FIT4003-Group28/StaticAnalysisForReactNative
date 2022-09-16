package defpackage;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: cypr  reason: default package */
/* loaded from: classes5.dex */
public final class cypr {
    public cyer a;
    public cyes b;
    private final Map<cygg, cywm> e = new HashMap();
    private final Set<cygg> f = new HashSet();
    public final Set<cygg> c = new HashSet();
    public final dcen<cygg> d = dcep.N();

    public final cyps a() {
        cyer cyerVar = this.a;
        dbsk.s(cyerVar);
        dbsk.s(this.b);
        return new cyps(cyerVar, dcdn.r(this.e), dcep.K(this.f), dcep.K(this.c), this.d.f());
    }

    public final void b(cygg cyggVar) {
        this.f.add(cyggVar);
        this.c.remove(cyggVar);
    }

    public final void c(Collection<cygg> collection) {
        this.f.addAll(collection);
        this.c.removeAll(collection);
    }

    public final void d(cygg cyggVar, cywm cywmVar) {
        this.e.put(cyggVar, cywmVar);
        this.c.remove(cyggVar);
    }
}
