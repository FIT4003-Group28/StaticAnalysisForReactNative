package defpackage;

import com.google.android.libraries.social.populous.Person;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cxzq  reason: default package */
/* loaded from: classes5.dex */
public final class cxzq {
    public final ClientConfigInternal a;
    public final cypq b;
    public final cypq c;
    public final cyph d;
    private final cxyo e;

    public cxzq(ClientConfigInternal clientConfigInternal, cypq cypqVar, cypq cypqVar2, cyph cyphVar, cxyo cxyoVar) {
        this.a = clientConfigInternal;
        this.b = cypqVar;
        this.c = cypqVar2;
        this.d = cyphVar;
        this.e = cxyoVar;
    }

    public final dcdn<cygg, Person> a(cyps cypsVar, dcep<cygg> dcepVar) {
        dcdg p = dcdn.p();
        dcpd<Map.Entry<cygg, cywm>> it = cypsVar.b.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<cygg, cywm> next = it.next();
            if (!dcepVar.contains(next.getKey())) {
                p.f(next.getKey(), this.e.b(next.getValue()).b());
            }
        }
        return p.b();
    }

    public final void b(dehn<cyps> dehnVar, cyer cyerVar, dbtp dbtpVar) {
        deha.q(dehnVar, new cxzp(this, dbtpVar, cyerVar, dehnVar), dege.a);
    }
}
