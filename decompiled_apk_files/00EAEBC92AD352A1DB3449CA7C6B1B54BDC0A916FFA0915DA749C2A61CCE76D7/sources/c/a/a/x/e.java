package c.a.a.x;

import android.graphics.PointF;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class e {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2629a = c.a.a("nm", "p", "s", "hd", "d");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.a a(c.a.a.x.k0.c cVar, c.a.a.e eVar, int i) {
        boolean z = i == 3;
        String str = null;
        c.a.a.v.j.m<PointF, PointF> mVar = null;
        c.a.a.v.j.f fVar = null;
        boolean z2 = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2629a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                mVar = a.b(cVar, eVar);
            } else if (a2 == 2) {
                fVar = d.e(cVar, eVar);
            } else if (a2 == 3) {
                z2 = cVar.g();
            } else if (a2 != 4) {
                cVar.B();
                cVar.C();
            } else {
                z = cVar.i() == 3;
            }
        }
        return new c.a.a.v.k.a(str, mVar, fVar, z, z2);
    }
}
