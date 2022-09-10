package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dfat  reason: default package */
/* loaded from: classes6.dex */
public final class dfat implements dyey {
    private final Map<dfas, dbsg<dezh<?, ?>>> a = new HashMap();

    @Override // defpackage.dyey
    public final <ReqT, RespT> dyex<ReqT, RespT> a(dyib<ReqT, RespT> dyibVar, dyet dyetVar, dyeu dyeuVar) {
        dbsg<dezh<?, ?>> dbsgVar;
        dewj dewjVar = (dewj) dyetVar.e(dewk.a);
        dewr i = dewjVar.i();
        int e = ((dews) dyetVar.e(dews.a)).e();
        if (e == 0) {
            throw null;
        }
        if (e == 2) {
            String str = (String) dyetVar.e(dewv.a);
            if (str == null) {
                str = ((dews) dyetVar.e(dews.a)).b().a().a;
            }
            dezw dezwVar = new dezw(str, (dexa) dyetVar.e(dexa.a), dyibVar.b);
            synchronized (this.a) {
                dbsgVar = this.a.get(dezwVar);
                if (dbsgVar == null) {
                    dbsgVar = dbsg.j(i.a());
                    this.a.put(dezwVar, dbsgVar);
                }
            }
            if (dbsgVar.a()) {
                deze h = dezf.h();
                h.a = dbsgVar.b();
                h.b = dewjVar.e();
                dbsk.s(h.a);
                dbsk.s(h.b);
                final dezf dezfVar = new dezf(h);
                return dfbg.a(new dzsj(dezfVar) { // from class: dfar
                    private final dezf a;

                    {
                        this.a = dezfVar;
                    }

                    @Override // defpackage.dzsj
                    public final Object a() {
                        return dcdc.f(this.a);
                    }
                }).a(dyibVar, dyetVar, dyeuVar);
            }
        }
        return dyeuVar.a(dyibVar, dyetVar);
    }
}
