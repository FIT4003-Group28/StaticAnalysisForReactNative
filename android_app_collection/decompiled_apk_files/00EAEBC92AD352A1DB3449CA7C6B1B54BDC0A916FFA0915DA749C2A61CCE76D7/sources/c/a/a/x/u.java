package c.a.a.x;

import c.a.a.v.k.g;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class u {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.g a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        char c2;
        cVar.b();
        g.a aVar = null;
        c.a.a.v.j.h hVar = null;
        c.a.a.v.j.d dVar = null;
        boolean z = false;
        while (cVar.f()) {
            String w = cVar.w();
            int hashCode = w.hashCode();
            char c3 = 65535;
            if (hashCode == 111) {
                if (w.equals("o")) {
                    c2 = 2;
                }
                c2 = 65535;
            } else if (hashCode == 3588) {
                if (w.equals("pt")) {
                    c2 = 1;
                }
                c2 = 65535;
            } else if (hashCode != 104433) {
                if (hashCode == 3357091 && w.equals("mode")) {
                    c2 = 0;
                }
                c2 = 65535;
            } else {
                if (w.equals("inv")) {
                    c2 = 3;
                }
                c2 = 65535;
            }
            if (c2 == 0) {
                String z2 = cVar.z();
                int hashCode2 = z2.hashCode();
                if (hashCode2 != 97) {
                    if (hashCode2 != 105) {
                        if (hashCode2 == 115 && z2.equals("s")) {
                            c3 = 1;
                        }
                    } else if (z2.equals("i")) {
                        c3 = 2;
                    }
                } else if (z2.equals("a")) {
                    c3 = 0;
                }
                if (c3 != 0) {
                    if (c3 == 1) {
                        aVar = g.a.MASK_MODE_SUBTRACT;
                    } else if (c3 != 2) {
                        c.a.a.y.d.b("Unknown mask mode " + w + ". Defaulting to Add.");
                    } else {
                        eVar.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                        aVar = g.a.MASK_MODE_INTERSECT;
                    }
                }
                aVar = g.a.MASK_MODE_ADD;
            } else if (c2 == 1) {
                hVar = d.g(cVar, eVar);
            } else if (c2 == 2) {
                dVar = d.d(cVar, eVar);
            } else if (c2 != 3) {
                cVar.C();
            } else {
                z = cVar.g();
            }
        }
        cVar.d();
        return new c.a.a.v.k.g(aVar, hVar, dVar, z);
    }
}
