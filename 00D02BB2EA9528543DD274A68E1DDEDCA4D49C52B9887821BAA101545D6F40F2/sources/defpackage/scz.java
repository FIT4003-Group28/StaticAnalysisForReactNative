package defpackage;

import java.util.ArrayList;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: scz  reason: default package */
/* loaded from: classes7.dex */
public final class scz implements degu<List<rzk>> {
    final /* synthetic */ deig a;
    final /* synthetic */ sdu b;
    final /* synthetic */ sdc c;
    final /* synthetic */ int d;

    public scz(sdc sdcVar, deig deigVar, sdu sduVar, int i) {
        this.c = sdcVar;
        this.a = deigVar;
        this.b = sduVar;
        this.d = i;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.k(th);
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<rzk> list) {
        List<rzk> list2 = list;
        if (list2 == null) {
            a(new NullPointerException());
            return;
        }
        sdc sdcVar = this.c;
        ArrayList arrayList = new ArrayList();
        for (rzk rzkVar : list2) {
            dcdc<rzl> b = rzkVar.b();
            int size = b.size();
            for (int i = 0; i < size; i++) {
                deig d = deig.d();
                qdp p = qdq.p();
                p.f(b.get(i).a());
                p.j(1);
                p.h(2);
                sdcVar.a.a().a(p.a(), false, new sda(d));
                arrayList.add(d);
            }
        }
        deha.q(deha.j(arrayList), new scy(this), dege.a);
    }
}
