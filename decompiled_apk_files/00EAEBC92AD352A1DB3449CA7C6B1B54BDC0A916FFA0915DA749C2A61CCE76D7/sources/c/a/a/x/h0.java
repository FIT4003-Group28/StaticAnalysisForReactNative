package c.a.a.x;

import c.a.a.v.k.p;
import c.a.a.x.k0.c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class h0 {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2637a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2638b = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.p a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        char c2;
        ArrayList arrayList = new ArrayList();
        String str = null;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.a aVar = null;
        c.a.a.v.j.d dVar = null;
        c.a.a.v.j.b bVar2 = null;
        p.b bVar3 = null;
        p.c cVar2 = null;
        float f2 = 0.0f;
        boolean z = false;
        while (cVar.f()) {
            int i = 1;
            switch (cVar.a(f2637a)) {
                case 0:
                    str = cVar.z();
                    break;
                case 1:
                    aVar = d.a(cVar, eVar);
                    break;
                case 2:
                    bVar2 = d.c(cVar, eVar);
                    break;
                case 3:
                    dVar = d.d(cVar, eVar);
                    break;
                case 4:
                    bVar3 = p.b.values()[cVar.i() - 1];
                    break;
                case 5:
                    cVar2 = p.c.values()[cVar.i() - 1];
                    break;
                case 6:
                    f2 = (float) cVar.h();
                    break;
                case 7:
                    z = cVar.g();
                    break;
                case 8:
                    cVar.a();
                    while (cVar.f()) {
                        cVar.b();
                        String str2 = null;
                        c.a.a.v.j.b bVar4 = null;
                        while (cVar.f()) {
                            int a2 = cVar.a(f2638b);
                            if (a2 == 0) {
                                str2 = cVar.z();
                            } else if (a2 != i) {
                                cVar.B();
                                cVar.C();
                            } else {
                                bVar4 = d.c(cVar, eVar);
                            }
                        }
                        cVar.d();
                        int hashCode = str2.hashCode();
                        if (hashCode == 100) {
                            if (str2.equals("d")) {
                                c2 = 1;
                            }
                            c2 = 65535;
                        } else if (hashCode != 103) {
                            if (hashCode == 111 && str2.equals("o")) {
                                c2 = 0;
                            }
                            c2 = 65535;
                        } else {
                            if (str2.equals("g")) {
                                c2 = 2;
                            }
                            c2 = 65535;
                        }
                        if (c2 == 0) {
                            bVar = bVar4;
                        } else if (c2 == 1 || c2 == 2) {
                            eVar.a(true);
                            arrayList.add(bVar4);
                        }
                        i = 1;
                    }
                    cVar.c();
                    if (arrayList.size() != 1) {
                        break;
                    } else {
                        arrayList.add(arrayList.get(0));
                        break;
                    }
                default:
                    cVar.C();
                    break;
            }
        }
        return new c.a.a.v.k.p(str, bVar, arrayList, aVar, dVar, bVar2, bVar3, cVar2, f2, z);
    }
}
