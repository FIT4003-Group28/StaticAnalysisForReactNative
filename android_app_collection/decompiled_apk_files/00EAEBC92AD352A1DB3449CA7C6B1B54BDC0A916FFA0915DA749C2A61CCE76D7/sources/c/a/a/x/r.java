package c.a.a.x;

import c.a.a.x.k0.c;
import java.util.ArrayList;
import java.util.List;
/* loaded from: classes.dex */
class r {

    /* renamed from: a  reason: collision with root package name */
    static c.a f2672a = c.a.a("k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> List<c.a.a.z.a<T>> a(c.a.a.x.k0.c cVar, c.a.a.e eVar, float f2, j0<T> j0Var) {
        ArrayList arrayList = new ArrayList();
        if (cVar.A() == c.b.STRING) {
            eVar.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.b();
        while (cVar.f()) {
            if (cVar.a(f2672a) != 0) {
                cVar.C();
            } else if (cVar.A() == c.b.BEGIN_ARRAY) {
                cVar.a();
                if (cVar.A() == c.b.NUMBER) {
                    arrayList.add(q.a(cVar, eVar, f2, j0Var, false));
                } else {
                    while (cVar.f()) {
                        arrayList.add(q.a(cVar, eVar, f2, j0Var, true));
                    }
                }
                cVar.c();
            } else {
                arrayList.add(q.a(cVar, eVar, f2, j0Var, false));
            }
        }
        cVar.d();
        a(arrayList);
        return arrayList;
    }

    public static <T> void a(List<? extends c.a.a.z.a<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            c.a.a.z.a<T> aVar = list.get(i2);
            i2++;
            c.a.a.z.a<T> aVar2 = list.get(i2);
            aVar.f2707f = Float.valueOf(aVar2.f2706e);
            if (aVar.f2704c == null && (t = aVar2.f2703b) != null) {
                aVar.f2704c = t;
                if (aVar instanceof c.a.a.t.c.h) {
                    ((c.a.a.t.c.h) aVar).h();
                }
            }
        }
        c.a.a.z.a<T> aVar3 = list.get(i);
        if ((aVar3.f2703b == null || aVar3.f2704c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
