package c.a.a.x;

import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class g0 {

    /* renamed from: a  reason: collision with root package name */
    static c.a f2634a = c.a.a("nm", "ind", "ks", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.o a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        int i = 0;
        String str = null;
        c.a.a.v.j.h hVar = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2634a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                i = cVar.i();
            } else if (a2 == 2) {
                hVar = d.g(cVar, eVar);
            } else if (a2 != 3) {
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        return new c.a.a.v.k.o(str, i, hVar, z);
    }
}
