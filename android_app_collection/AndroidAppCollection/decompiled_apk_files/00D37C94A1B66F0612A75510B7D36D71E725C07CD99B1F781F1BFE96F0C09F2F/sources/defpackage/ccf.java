package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ccf  reason: default package */
/* loaded from: classes2.dex */
public final class ccf {
    static final ccv a = ccv.a("k");

    public static List a(ccw ccwVar, bwx bwxVar, float f, ccs ccsVar, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (ccwVar.r() == 6) {
            bwxVar.d("Lottie doesn't support expressions.");
            return arrayList;
        }
        ccwVar.j();
        while (ccwVar.p()) {
            if (ccwVar.c(a) == 0) {
                if (ccwVar.r() == 1) {
                    ccwVar.i();
                    if (ccwVar.r() != 7) {
                        while (ccwVar.p()) {
                            arrayList.add(cce.a(ccwVar, bwxVar, f, ccsVar, true, z));
                        }
                    } else {
                        arrayList.add(cce.a(ccwVar, bwxVar, f, ccsVar, false, z));
                    }
                    ccwVar.k();
                } else {
                    arrayList.add(cce.a(ccwVar, bwxVar, f, ccsVar, false, z));
                }
            } else {
                ccwVar.o();
            }
        }
        ccwVar.l();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i;
        Object obj;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            cdi cdiVar = (cdi) list.get(i2);
            i2++;
            cdi cdiVar2 = (cdi) list.get(i2);
            cdiVar.h = Float.valueOf(cdiVar2.g);
            if (cdiVar.c == null && (obj = cdiVar2.b) != null) {
                cdiVar.c = obj;
                if (cdiVar instanceof bzf) {
                    ((bzf) cdiVar).a();
                }
            }
        }
        cdi cdiVar3 = (cdi) list.get(i);
        if ((cdiVar3.b == null || cdiVar3.c == null) && list.size() > 1) {
            list.remove(cdiVar3);
        }
    }
}
