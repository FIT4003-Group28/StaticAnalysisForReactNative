package c.a.a.x;

import c.a.a.v.k.h;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
class v {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2680a = c.a.a("nm", "mm", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.h a(c.a.a.x.k0.c cVar) {
        String str = null;
        h.a aVar = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2680a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                aVar = h.a.a(cVar.i());
            } else if (a2 != 2) {
                cVar.B();
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        return new c.a.a.v.k.h(str, aVar, z);
    }
}
