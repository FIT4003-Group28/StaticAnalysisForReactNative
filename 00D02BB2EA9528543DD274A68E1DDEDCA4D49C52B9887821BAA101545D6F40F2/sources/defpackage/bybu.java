package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: bybu  reason: default package */
/* loaded from: classes4.dex */
final class bybu implements Callable<List<? extends bqyh>> {
    final /* synthetic */ ahqs a;
    final /* synthetic */ List b;

    public bybu(ahqs ahqsVar, List list) {
        this.a = ahqsVar;
        this.b = list;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ List<? extends bqyh> call() {
        ahqs ahqsVar = this.a;
        List list = this.b;
        ahqr ahqrVar = (ahqr) ahqsVar;
        ahqs ahqsVar2 = ahqrVar.a;
        ArrayList<bqyh> arrayList = new ArrayList();
        dzru dzruVar = new dzru();
        dzrn it = ((dzru) ahqt.a(list)).iterator();
        while (it.hasNext()) {
            alyg D = ((ahqt) ahqsVar2).a.D((alyh) it.next());
            if (D != null && dzruVar.add(D.a())) {
                List<bqyo> list2 = ((bqxq) D).a;
                int size = list2.size();
                int size2 = list.size();
                for (int i = 0; i < size; i++) {
                    bqyo bqyoVar = list2.get(i);
                    int i2 = 0;
                    while (true) {
                        if (i2 >= size2) {
                            break;
                        } else if (bqyoVar.k((akrp) list.get(i2))) {
                            arrayList.add(bqyoVar);
                            break;
                        } else {
                            i2++;
                        }
                    }
                }
            }
        }
        if (arrayList.isEmpty()) {
            return new ArrayList();
        }
        dzru dzruVar2 = new dzru();
        dzru dzruVar3 = new dzru(arrayList);
        for (bqyh bqyhVar : arrayList) {
            ahqq.d(ahqrVar.a(bqyhVar), bqyhVar, dzruVar2, dzruVar3);
        }
        float r = (float) ((bqyh) arrayList.get(0)).b.r();
        float f = r * r;
        dzrn it2 = dzruVar3.iterator();
        while (it2.hasNext()) {
            bqyh bqyhVar2 = (bqyh) it2.next();
            akra b = ahqr.b(bqyhVar2);
            if (bqyhVar2.b.A(b) > f) {
                dzruVar2.add(new ahqq(ahqrVar, bqyhVar2, bqyhVar2.b, null, b, ahqrVar.a(bqyhVar2)));
            }
        }
        ArrayList arrayList2 = new ArrayList();
        dzrn it3 = dzruVar2.iterator();
        while (it3.hasNext()) {
            ahqq ahqqVar = (ahqq) it3.next();
            int i3 = 0;
            while (true) {
                if (i3 >= list.size()) {
                    break;
                } else if (ahqqVar.k((akrq) list.get(i3))) {
                    arrayList2.add(ahqqVar);
                    break;
                } else {
                    i3++;
                }
            }
        }
        return arrayList2;
    }
}
