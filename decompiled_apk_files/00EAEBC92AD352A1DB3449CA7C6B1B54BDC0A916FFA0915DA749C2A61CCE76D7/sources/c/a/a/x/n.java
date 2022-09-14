package c.a.a.x;

import c.a.a.v.k.p;
import c.a.a.x.k0.c;
import java.util.ArrayList;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static c.a f2663a = c.a.a("nm", "g", "o", "t", "s", "e", "w", "lc", "lj", "ml", "hd", "d");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2664b = c.a.a("p", "k");

    /* renamed from: c  reason: collision with root package name */
    private static final c.a f2665c = c.a.a("n", "v");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.e a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        ArrayList arrayList = new ArrayList();
        String str = null;
        c.a.a.v.k.f fVar = null;
        c.a.a.v.j.c cVar2 = null;
        c.a.a.v.j.d dVar = null;
        c.a.a.v.j.f fVar2 = null;
        c.a.a.v.j.f fVar3 = null;
        c.a.a.v.j.b bVar = null;
        p.b bVar2 = null;
        p.c cVar3 = null;
        float f2 = 0.0f;
        c.a.a.v.j.b bVar3 = null;
        boolean z = false;
        while (cVar.f()) {
            switch (cVar.a(f2663a)) {
                case 0:
                    str = cVar.z();
                    break;
                case 1:
                    int i = -1;
                    cVar.b();
                    while (cVar.f()) {
                        int a2 = cVar.a(f2664b);
                        c.a.a.v.j.c cVar4 = cVar2;
                        if (a2 == 0) {
                            i = cVar.i();
                        } else if (a2 != 1) {
                            cVar.B();
                            cVar.C();
                        } else {
                            cVar2 = d.a(cVar, eVar, i);
                        }
                        cVar2 = cVar4;
                    }
                    cVar.d();
                    break;
                case 2:
                    dVar = d.d(cVar, eVar);
                    break;
                case 3:
                    fVar = cVar.i() == 1 ? c.a.a.v.k.f.LINEAR : c.a.a.v.k.f.RADIAL;
                    break;
                case 4:
                    fVar2 = d.e(cVar, eVar);
                    break;
                case 5:
                    fVar3 = d.e(cVar, eVar);
                    break;
                case 6:
                    bVar = d.c(cVar, eVar);
                    break;
                case 7:
                    bVar2 = p.b.values()[cVar.i() - 1];
                    break;
                case 8:
                    cVar3 = p.c.values()[cVar.i() - 1];
                    break;
                case 9:
                    f2 = (float) cVar.h();
                    break;
                case 10:
                    z = cVar.g();
                    break;
                case 11:
                    cVar.a();
                    while (cVar.f()) {
                        cVar.b();
                        String str2 = null;
                        c.a.a.v.j.b bVar4 = null;
                        while (cVar.f()) {
                            int a3 = cVar.a(f2665c);
                            c.a.a.v.j.b bVar5 = bVar3;
                            if (a3 != 0) {
                                if (a3 != 1) {
                                    cVar.B();
                                    cVar.C();
                                } else {
                                    bVar4 = d.c(cVar, eVar);
                                }
                                bVar3 = bVar5;
                            } else {
                                str2 = cVar.z();
                            }
                        }
                        c.a.a.v.j.b bVar6 = bVar3;
                        cVar.d();
                        if (str2.equals("o")) {
                            bVar3 = bVar4;
                        } else {
                            if (str2.equals("d") || str2.equals("g")) {
                                eVar.a(true);
                                arrayList.add(bVar4);
                            }
                            bVar3 = bVar6;
                        }
                    }
                    c.a.a.v.j.b bVar7 = bVar3;
                    cVar.c();
                    if (arrayList.size() == 1) {
                        arrayList.add(arrayList.get(0));
                    }
                    bVar3 = bVar7;
                    break;
                default:
                    cVar.B();
                    cVar.C();
                    break;
            }
        }
        return new c.a.a.v.k.e(str, fVar, cVar2, dVar, fVar2, fVar3, bVar, bVar2, cVar3, f2, arrayList, bVar3, z);
    }
}
