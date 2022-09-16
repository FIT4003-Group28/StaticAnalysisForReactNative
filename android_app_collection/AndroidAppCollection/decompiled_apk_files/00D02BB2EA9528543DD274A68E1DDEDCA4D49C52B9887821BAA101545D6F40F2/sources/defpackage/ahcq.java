package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ahcq  reason: default package */
/* loaded from: classes2.dex */
public final class ahcq implements degu<List<dldj>> {
    final /* synthetic */ ahcr a;

    public ahcq(ahcr ahcrVar) {
        this.a = ahcrVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        this.a.c.clear();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi List<dldj> list) {
        List<dldj> list2 = list;
        this.a.c.clear();
        if (list2 != null) {
            int i = 0;
            for (dldj dldjVar : list2) {
                ahcr ahcrVar = this.a;
                List<ahcn> list3 = ahcrVar.c;
                ahco ahcoVar = ahcrVar.a;
                btlu btluVar = ahcrVar.b;
                ahco.a(ahcoVar.a.a(), 1);
                agwa a = ahcoVar.b.a();
                ahco.a(a, 2);
                gdc a2 = ahcoVar.c.a();
                ahco.a(a2, 3);
                gga a3 = ahcoVar.d.a();
                ahco.a(a3, 4);
                isd a4 = ahcoVar.e.a();
                ahco.a(a4, 5);
                afzv a5 = ahcoVar.f.a();
                ahco.a(a5, 6);
                bvrb a6 = ahcoVar.g.a();
                ahco.a(a6, 7);
                ahco.a(ahcrVar, 8);
                ahco.a(btluVar, 10);
                ahco.a(dldjVar, 11);
                list3.add(new ahcn(a, a2, a3, a4, a5, a6, ahcrVar, i, btluVar, dldjVar));
                i++;
            }
        }
    }
}
