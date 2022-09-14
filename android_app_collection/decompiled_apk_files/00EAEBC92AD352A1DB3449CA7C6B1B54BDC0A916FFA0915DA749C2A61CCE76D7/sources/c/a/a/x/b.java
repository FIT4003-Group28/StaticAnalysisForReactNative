package c.a.a.x;

import c.a.a.x.k0.c;
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2621a = c.a.a("a");

    /* renamed from: b  reason: collision with root package name */
    private static c.a f2622b = c.a.a("fc", "sc", "sw", "t");

    public static c.a.a.v.j.k a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        cVar.b();
        c.a.a.v.j.k kVar = null;
        while (cVar.f()) {
            if (cVar.a(f2621a) != 0) {
                cVar.B();
                cVar.C();
            } else {
                kVar = b(cVar, eVar);
            }
        }
        cVar.d();
        return kVar == null ? new c.a.a.v.j.k(null, null, null, null) : kVar;
    }

    private static c.a.a.v.j.k b(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        cVar.b();
        c.a.a.v.j.a aVar = null;
        c.a.a.v.j.a aVar2 = null;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.b bVar2 = null;
        while (cVar.f()) {
            int a2 = cVar.a(f2622b);
            if (a2 == 0) {
                aVar = d.a(cVar, eVar);
            } else if (a2 == 1) {
                aVar2 = d.a(cVar, eVar);
            } else if (a2 == 2) {
                bVar = d.c(cVar, eVar);
            } else if (a2 != 3) {
                cVar.B();
                cVar.C();
            } else {
                bVar2 = d.c(cVar, eVar);
            }
        }
        cVar.d();
        return new c.a.a.v.j.k(aVar, aVar2, bVar, bVar2);
    }
}
