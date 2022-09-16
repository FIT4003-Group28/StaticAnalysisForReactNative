package c.a.a.x;

import android.graphics.PointF;
import c.a.a.v.k.i;
import c.a.a.x.k0.c;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class z {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f2683a = c.a.a("nm", "sy", "pt", "p", "r", "or", "os", "ir", "is", "hd");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c.a.a.v.k.i a(c.a.a.x.k0.c cVar, c.a.a.e eVar) {
        String str = null;
        i.a aVar = null;
        c.a.a.v.j.b bVar = null;
        c.a.a.v.j.m<PointF, PointF> mVar = null;
        c.a.a.v.j.b bVar2 = null;
        c.a.a.v.j.b bVar3 = null;
        c.a.a.v.j.b bVar4 = null;
        c.a.a.v.j.b bVar5 = null;
        c.a.a.v.j.b bVar6 = null;
        boolean z = false;
        while (cVar.f()) {
            switch (cVar.a(f2683a)) {
                case 0:
                    str = cVar.z();
                    break;
                case 1:
                    aVar = i.a.a(cVar.i());
                    break;
                case 2:
                    bVar = d.a(cVar, eVar, false);
                    break;
                case 3:
                    mVar = a.b(cVar, eVar);
                    break;
                case 4:
                    bVar2 = d.a(cVar, eVar, false);
                    break;
                case 5:
                    bVar4 = d.c(cVar, eVar);
                    break;
                case 6:
                    bVar6 = d.a(cVar, eVar, false);
                    break;
                case 7:
                    bVar3 = d.c(cVar, eVar);
                    break;
                case 8:
                    bVar5 = d.a(cVar, eVar, false);
                    break;
                case 9:
                    z = cVar.g();
                    break;
                default:
                    cVar.B();
                    cVar.C();
                    break;
            }
        }
        return new c.a.a.v.k.i(str, aVar, bVar, mVar, bVar2, bVar3, bVar4, bVar5, bVar6, z);
    }
}
