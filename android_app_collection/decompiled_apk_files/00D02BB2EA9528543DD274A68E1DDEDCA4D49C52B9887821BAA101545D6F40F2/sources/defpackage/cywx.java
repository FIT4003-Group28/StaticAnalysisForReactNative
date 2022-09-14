package defpackage;

import java.util.Iterator;
import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cywx  reason: default package */
/* loaded from: classes5.dex */
public final /* synthetic */ class cywx implements cywn {
    static final cywn a = new cywx();

    private cywx() {
    }

    @Override // defpackage.cywn
    public final void a(List list, cytq cytqVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            cywm cywmVar = (cywm) it.next();
            dcdc<dsgt> d = cywmVar.d(cytqVar.f.l);
            int size = d.size();
            for (int i = 0; i < size; i++) {
                dsgt dsgtVar = d.get(i);
                Iterator<dsii> it2 = dsgtVar.e.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        dsii next = it2.next();
                        if (next.a == 1 && !((String) next.b).isEmpty()) {
                            break;
                        }
                    } else {
                        cywmVar.i(dsgtVar, cyxa.a);
                        break;
                    }
                }
            }
        }
    }
}
