package c.a.a.x;

import c.a.a.x.k0.c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class j {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2641a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2642b = c.a.a("shapes");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.d a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        ArrayList arrayList = new ArrayList();
        cVar.b();
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        double d3 = 0.0d;
        char c2 = 0;
        while (cVar.f()) {
            int a2 = cVar.a(f2641a);
            if (a2 == 0) {
                c2 = cVar.z().charAt(0);
            } else if (a2 == 1) {
                d2 = cVar.h();
            } else if (a2 == 2) {
                d3 = cVar.h();
            } else if (a2 == 3) {
                str = cVar.z();
            } else if (a2 == 4) {
                str2 = cVar.z();
            } else if (a2 != 5) {
                cVar.B();
                cVar.C();
            } else {
                cVar.b();
                while (cVar.f()) {
                    if (cVar.a(f2642b) != 0) {
                        cVar.B();
                        cVar.C();
                    } else {
                        cVar.a();
                        while (cVar.f()) {
                            arrayList.add((c.a.a.v.k.n) g.a(cVar, eVar));
                        }
                        cVar.c();
                    }
                }
                cVar.d();
            }
        }
        cVar.d();
        return new c.a.a.v.d(arrayList, c2, d2, d3, str, str2);
    }
}
