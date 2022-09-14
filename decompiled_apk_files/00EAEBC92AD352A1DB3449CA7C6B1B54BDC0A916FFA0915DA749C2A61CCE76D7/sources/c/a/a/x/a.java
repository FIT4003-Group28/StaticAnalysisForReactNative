package c.a.a.x;

import android.graphics.PointF;
import c.a.a.x.k0.c;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2619a = c.a.a("k", "x", "y");

    public static c.a.a.v.j.e a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        ArrayList arrayList = new ArrayList();
        if (cVar.A() == c.b.BEGIN_ARRAY) {
            cVar.a();
            while (cVar.f()) {
                arrayList.add(w.a(cVar, eVar));
            }
            cVar.c();
            r.a(arrayList);
        } else {
            arrayList.add(new c.a.a.z.a(p.d(cVar, c.a.a.y.h.a())));
        }
        return new c.a.a.v.j.e(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.j.m<PointF, PointF> b(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        cVar.b();
        c.a.a.v.j.e eVar2 = null;
        boolean z = false;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.b bVar2 = null;
        while (cVar.A() != c.b.END_OBJECT) {
            int a2 = cVar.a(f2619a);
            if (a2 == 0) {
                eVar2 = a(cVar, eVar);
            } else if (a2 != 1) {
                if (a2 != 2) {
                    cVar.B();
                    cVar.C();
                } else if (cVar.A() == c.b.STRING) {
                    cVar.C();
                    z = true;
                } else {
                    bVar2 = d.c(cVar, eVar);
                }
            } else if (cVar.A() == c.b.STRING) {
                cVar.C();
                z = true;
            } else {
                bVar = d.c(cVar, eVar);
            }
        }
        cVar.d();
        if (z) {
            eVar.a("Lottie doesn't support expressions.");
        }
        return eVar2 != null ? eVar2 : new c.a.a.v.j.i(bVar, bVar2);
    }
}
