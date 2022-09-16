package c.a.a.x;

import c.a.a.x.k0.c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class f0 {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2632a = c.a.a("nm", "hd", "it");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.n a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        boolean z = false;
        while (cVar.f()) {
            int a2 = cVar.a(f2632a);
            if (a2 == 0) {
                str = cVar.z();
            } else if (a2 == 1) {
                z = cVar.g();
            } else if (a2 != 2) {
                cVar.C();
            } else {
                cVar.a();
                while (cVar.f()) {
                    c.a.a.v.k.b a3 = g.a(cVar, eVar);
                    if (a3 != null) {
                        arrayList.add(a3);
                    }
                }
                cVar.c();
            }
        }
        return new c.a.a.v.k.n(str, arrayList, z);
    }
}
