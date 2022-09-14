package c.a.a.x;

import c.a.a.v.k.q;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class i0 {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2640a = c.a.a("s", "e", "o", "nm", "m", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.q a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        String str = null;
        q.a aVar = null;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.b bVar2 = null;
        c.a.a.v.j.b bVar3 = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2640a);
            if (a2 == 0) {
                bVar = d.a(cVar, eVar, false);
            } else if (a2 == 1) {
                bVar2 = d.a(cVar, eVar, false);
            } else if (a2 == 2) {
                bVar3 = d.a(cVar, eVar, false);
            } else if (a2 == 3) {
                str = cVar.z();
            } else if (a2 == 4) {
                aVar = q.a.a(cVar.i());
            } else if (a2 != 5) {
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        return new c.a.a.v.k.q(str, aVar, bVar, bVar2, bVar3, z);
    }
}
