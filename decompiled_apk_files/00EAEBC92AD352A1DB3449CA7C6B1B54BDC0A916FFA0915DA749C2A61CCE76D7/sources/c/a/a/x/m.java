package c.a.a.x;

import android.graphics.Path;
import c.a.a.x.k0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2661a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2662b = c.a.a("p", "k");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.d a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        Path.FillType fillType = Path.FillType.WINDING;
        String str = null;
        c.a.a.v.k.f fVar = null;
        c.a.a.v.j.c cVar2 = null;
        c.a.a.v.j.d dVar = null;
        c.a.a.v.j.f fVar2 = null;
        c.a.a.v.j.f fVar3 = null;
        boolean z = false;
        while (cVar.f()) {
            switch (cVar.a(f2661a)) {
                case 0:
                    str = cVar.z();
                    break;
                case 1:
                    int i = -1;
                    cVar.b();
                    while (cVar.f()) {
                        int a2 = cVar.a(f2662b);
                        if (a2 == 0) {
                            i = cVar.i();
                        } else if (a2 != 1) {
                            cVar.B();
                            cVar.C();
                        } else {
                            cVar2 = d.a(cVar, eVar, i);
                        }
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
                    fillType = cVar.i() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    z = cVar.g();
                    break;
                default:
                    cVar.B();
                    cVar.C();
                    break;
            }
        }
        return new c.a.a.v.k.d(str, fVar, fillType, cVar2, dVar, fVar2, fVar3, null, null, z);
    }
}
