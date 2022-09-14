package c.a.a.x;

import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class b0 {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2623a = c.a.a("nm", "c", "o", "tr", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.k a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        String str = null;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.b bVar2 = null;
        c.a.a.v.j.l lVar = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2623a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                bVar = d.a(cVar, eVar, false);
            } else if (a2 == 2) {
                bVar2 = d.a(cVar, eVar, false);
            } else if (a2 == 3) {
                lVar = c.a(cVar, eVar);
            } else if (a2 != 4) {
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        return new c.a.a.v.k.k(str, bVar, bVar2, lVar, z);
    }
}
