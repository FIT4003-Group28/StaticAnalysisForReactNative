package defpackage;

import com.google.android.libraries.social.populous.Person;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxzn  reason: default package */
/* loaded from: classes5.dex */
public final class cxzn implements degu<cyps> {
    final /* synthetic */ cxzs a;
    final /* synthetic */ dbtp b;
    final /* synthetic */ List c;
    final /* synthetic */ cxzq d;

    public cxzn(cxzq cxzqVar, cxzs cxzsVar, dbtp dbtpVar, List list) {
        this.d = cxzqVar;
        this.a = cxzsVar;
        this.b = dbtpVar;
        this.c = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cydx c = cydx.c(cyer.PEOPLE_STACK_LOOKUP_DATABASE, cyet.a(th));
        cxzs cxzsVar = this.a;
        dcdn<Object, Object> dcdnVar = dcmn.a;
        cxzt f = cxzu.f();
        f.c(true);
        f.d(dcep.K(this.c));
        f.b(dcdc.f(c));
        cxxs cxxsVar = (cxxs) f;
        cxxsVar.b = 3;
        cxxsVar.a = 0;
        cxzsVar.a(dcdnVar, f.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyps cypsVar) {
        dcdc<cygg> f;
        cyps cypsVar2 = cypsVar;
        if (cypsVar2.e.isEmpty()) {
            f = cypsVar2.d.v();
        } else {
            dccx F = dcdc.F();
            F.i(cypsVar2.d);
            F.i(cypsVar2.e);
            f = F.f();
        }
        dcdn<cygg, Person> a = this.d.a(cypsVar2, dcmr.a);
        cxzs cxzsVar = this.a;
        cxzt f2 = cxzu.f();
        f2.c(cypsVar2.d.isEmpty());
        f2.d(cypsVar2.c);
        cxxs cxxsVar = (cxxs) f2;
        cxxsVar.b = 3;
        cxxsVar.a = 0;
        f2.b(dcdc.e());
        cxzsVar.a(a, f2.a());
        if (!f.isEmpty()) {
            cxzq cxzqVar = this.d;
            cxzs cxzsVar2 = this.a;
            dbtp dbtpVar = this.b;
            dehn<cyps> a2 = cxzqVar.c.a(cxzqVar.a, f);
            cxzqVar.b(a2, cyer.PEOPLE_STACK_LOOKUP_RPC, dbtpVar);
            if (cypsVar2.d.isEmpty()) {
                return;
            }
            deha.q(a2, new cxzo(cxzqVar, cypsVar2, cxzsVar2, f), dege.a);
        }
    }
}
