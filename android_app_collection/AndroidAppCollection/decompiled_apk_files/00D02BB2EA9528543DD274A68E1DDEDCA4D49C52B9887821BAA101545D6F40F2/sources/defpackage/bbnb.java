package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bbnb  reason: default package */
/* loaded from: classes3.dex */
public final class bbnb implements degu<dibq> {
    final /* synthetic */ List a;
    final /* synthetic */ deig b;
    final /* synthetic */ bbnc c;

    public bbnb(bbnc bbncVar, List list, deig deigVar) {
        this.c = bbncVar;
        this.a = list;
        this.b = deigVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.b.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dibq dibqVar) {
        dibq dibqVar2 = dibqVar;
        List list = this.a;
        dpot dpotVar = dibqVar2.b;
        if (dpotVar == null) {
            dpotVar = dpot.m;
        }
        list.addAll(dpotVar.h);
        if (!dibqVar2.c.u()) {
            bbnc bbncVar = this.c;
            dpot dpotVar2 = dibqVar2.b;
            if (dpotVar2 == null) {
                dpotVar2 = dpot.m;
            }
            dpov dpovVar = dpotVar2.b;
            if (dpovVar == null) {
                dpovVar = dpov.f;
            }
            bbncVar.b(dpovVar, dibqVar2.c, this.b, this.a);
            return;
        }
        deig deigVar = this.b;
        dpot dpotVar3 = dibqVar2.b;
        if (dpotVar3 == null) {
            dpotVar3 = dpot.m;
        }
        dsqp dsqpVar = (dsqp) dpotVar3.cu(5);
        dsqpVar.bC(dpotVar3);
        dpoq dpoqVar = (dpoq) dsqpVar;
        if (dpoqVar.c) {
            dpoqVar.bF();
            dpoqVar.c = false;
        }
        ((dpot) dpoqVar.b).h = dpot.ck();
        dpoqVar.a(this.a);
        deigVar.j(dpoqVar.bK());
    }
}
