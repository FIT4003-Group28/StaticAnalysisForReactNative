package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: aprf  reason: default package */
/* loaded from: classes2.dex */
final class aprf implements degu<List<akqi>> {
    final /* synthetic */ btlu a;
    final /* synthetic */ apri b;

    public aprf(apri apriVar, btlu btluVar) {
        this.b = apriVar;
        this.a = btluVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        ((ckcm) this.b.a.a(ckgp.m)).a(false);
        this.b.l(2, this.a);
        apri apriVar = this.b;
        btlu btluVar = this.a;
        dbsg.i("Failed to get merchantInfo");
        apriVar.m(btluVar);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(List<akqi> list) {
        List<akqi> list2 = list;
        ((ckcm) this.b.a.a(ckgp.m)).a(true);
        apri apriVar = this.b;
        btlu btluVar = this.a;
        if (list2.isEmpty()) {
            apriVar.h(new ArrayList(), btluVar);
        } else {
            apriVar.b.a(list2, new aprg(apriVar, btluVar));
        }
        dccx F = dcdc.F();
        for (akqi akqiVar : list2) {
            F.g(apri.k(dbsg.i(akqiVar), dbpy.a));
        }
        this.b.j(ddda.dj, F.f());
    }
}
