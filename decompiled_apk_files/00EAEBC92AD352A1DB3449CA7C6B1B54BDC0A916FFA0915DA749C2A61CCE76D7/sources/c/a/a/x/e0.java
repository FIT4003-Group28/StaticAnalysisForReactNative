package c.a.a.x;

import android.graphics.Path;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class e0 {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2630a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.m a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        String str = null;
        c.a.a.v.j.a aVar = null;
        c.a.a.v.j.d dVar = null;
        int i = 1;
        boolean z = false;
        boolean z2 = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2630a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                aVar = d.a(cVar, eVar);
            } else if (a2 == 2) {
                dVar = d.d(cVar, eVar);
            } else if (a2 == 3) {
                z = cVar.g();
            } else if (a2 == 4) {
                i = cVar.i();
            } else if (a2 != 5) {
                cVar.B();
                cVar.C();
            } else {
                z2 = cVar.g();
            }
        }
        return new c.a.a.v.k.m(str, z, i == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVar, dVar, z2);
    }
}
