package c.a.a.x;

import c.a.a.v.b;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
public class h implements j0<c.a.a.v.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final h f2635a = new h();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f2636b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private h() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public c.a.a.v.b mo113a(c.a.a.x.k0.c cVar, float f2) {
        b.a aVar = b.a.CENTER;
        cVar.b();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        double d2 = 0.0d;
        double d3 = 0.0d;
        double d4 = 0.0d;
        double d5 = 0.0d;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (cVar.f()) {
            switch (cVar.a(f2636b)) {
                case 0:
                    str = cVar.z();
                    break;
                case 1:
                    str2 = cVar.z();
                    break;
                case 2:
                    d2 = cVar.h();
                    break;
                case 3:
                    int i4 = cVar.i();
                    if (i4 <= b.a.CENTER.ordinal() && i4 >= 0) {
                        aVar2 = b.a.values()[i4];
                        break;
                    } else {
                        aVar2 = b.a.CENTER;
                        break;
                    }
                case 4:
                    i = cVar.i();
                    break;
                case 5:
                    d3 = cVar.h();
                    break;
                case 6:
                    d4 = cVar.h();
                    break;
                case 7:
                    i2 = p.a(cVar);
                    break;
                case 8:
                    i3 = p.a(cVar);
                    break;
                case 9:
                    d5 = cVar.h();
                    break;
                case 10:
                    z = cVar.g();
                    break;
                default:
                    cVar.B();
                    cVar.C();
                    break;
            }
        }
        cVar.d();
        return new c.a.a.v.b(str, str2, d2, aVar2, i, d3, d4, i2, i3, d5, z);
    }
}
