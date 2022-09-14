package defpackage;

import com.google.android.libraries.social.populous.Person;
import java.util.HashSet;
import java.util.List;
/* compiled from: PG */
/* renamed from: cxzo  reason: default package */
/* loaded from: classes5.dex */
final class cxzo implements degu<cyps> {
    final /* synthetic */ cyps a;
    final /* synthetic */ cxzs b;
    final /* synthetic */ List c;
    final /* synthetic */ cxzq d;

    public cxzo(cxzq cxzqVar, cyps cypsVar, cxzs cxzsVar, List list) {
        this.d = cxzqVar;
        this.a = cypsVar;
        this.b = cxzsVar;
        this.c = list;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        cydx c = cydx.c(cyer.PEOPLE_STACK_LOOKUP_RPC, cyet.a(th));
        cxzs cxzsVar = this.b;
        dcdn<Object, Object> dcdnVar = dcmn.a;
        cxzt f = cxzu.f();
        f.c(true);
        f.d(dcep.K(this.c));
        f.b(dcdc.f(c));
        cxxs cxxsVar = (cxxs) f;
        cxxsVar.b = 2;
        cxxsVar.a = Integer.valueOf(this.c.size());
        cxzsVar.a(dcdnVar, f.a());
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(cyps cypsVar) {
        dcep<cygg> K;
        cyps cypsVar2 = cypsVar;
        dcdn<cygg, Person> a = this.d.a(cypsVar2, this.a.e);
        cxzs cxzsVar = this.b;
        cxzt f = cxzu.f();
        f.c(true);
        dcep<cygg> dcepVar = this.a.e;
        if (dcepVar.isEmpty()) {
            K = cypsVar2.c;
        } else {
            HashSet hashSet = new HashSet(cypsVar2.c);
            hashSet.removeAll(dcepVar);
            K = dcep.K(hashSet);
        }
        f.d(K);
        cxxs cxxsVar = (cxxs) f;
        cxxsVar.b = 2;
        cxxsVar.a = Integer.valueOf(this.c.size());
        f.b(dcdc.e());
        cxzsVar.a(a, f.a());
    }
}
