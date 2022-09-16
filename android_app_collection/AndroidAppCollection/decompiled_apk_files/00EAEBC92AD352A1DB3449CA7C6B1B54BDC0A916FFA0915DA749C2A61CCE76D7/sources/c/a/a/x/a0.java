package c.a.a.x;

import android.graphics.PointF;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class a0 {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2620a = c.a.a("nm", "p", "s", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.j a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        String str = null;
        c.a.a.v.j.m<PointF, PointF> mVar = null;
        c.a.a.v.j.f fVar = null;
        c.a.a.v.j.b bVar = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2620a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                mVar = a.b(cVar, eVar);
            } else if (a2 == 2) {
                fVar = d.e(cVar, eVar);
            } else if (a2 == 3) {
                bVar = d.c(cVar, eVar);
            } else if (a2 != 4) {
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        return new c.a.a.v.k.j(str, mVar, fVar, bVar, z);
    }
}
