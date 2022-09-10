package defpackage;

import java.util.LinkedList;
/* compiled from: PG */
/* renamed from: cysv  reason: default package */
/* loaded from: classes5.dex */
final class cysv extends cyta {
    final /* synthetic */ cytq a;
    final /* synthetic */ cyem b;
    final /* synthetic */ cywa c;
    final /* synthetic */ cyem d;
    final /* synthetic */ cytb e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cysv(cytb cytbVar, cytq cytqVar, cywa cywaVar, cyem cyemVar, cytq cytqVar2, cyem cyemVar2, cywa cywaVar2, cyem cyemVar3) {
        super(cytbVar, cytqVar, cywaVar, cyemVar);
        this.e = cytbVar;
        this.a = cytqVar2;
        this.b = cyemVar2;
        this.c = cywaVar2;
        this.d = cyemVar3;
    }

    @Override // defpackage.cyta
    public final void a(czfo czfoVar) {
        super.a(czfoVar);
        cydx c = cydx.c(cyer.PEOPLE_API_TOP_N, czfoVar.e());
        boolean b = dyaq.b() ? this.a.b(this.b) : false;
        cyem cyemVar = this.b;
        cytn i = cyto.i();
        cyte cyteVar = (cyte) i;
        cyteVar.a = czfoVar.a();
        i.e(this.e.g(czfoVar.c(), this.a, this.c, true, true, cyer.PEOPLE_API_TOP_N));
        cyteVar.c = czfoVar.f();
        cyteVar.b = c;
        i.f(b);
        cyteVar.d = czfoVar.g();
        i.d(czfoVar.h());
        i.g(3);
        cyemVar.a(i.h());
    }

    @Override // defpackage.cyta
    public final void b(cyzo cyzoVar) {
        cydx c = cydx.c(cyer.DEVICE_CONTACTS, cyzoVar.a());
        LinkedList<cyvs> linkedList = new LinkedList<>();
        dcdc<cyzl> b = cyzoVar.b();
        int size = b.size();
        for (int i = 0; i < size; i++) {
            linkedList.add(b.get(i).g().b());
        }
        boolean b2 = dyaq.b() ? this.a.b(this.d) : false;
        cyem cyemVar = this.d;
        cytn i2 = cyto.i();
        i2.e(this.e.c(linkedList, this.a, this.c, true, true, cyer.DEVICE_CONTACTS));
        i2.f(b2);
        ((cyte) i2).b = c;
        i2.g(2);
        cyemVar.a(i2.h());
    }
}
