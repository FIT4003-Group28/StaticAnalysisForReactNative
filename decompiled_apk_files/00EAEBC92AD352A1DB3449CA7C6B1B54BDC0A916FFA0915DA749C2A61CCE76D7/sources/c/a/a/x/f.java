package c.a.a.x;

import android.graphics.Color;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
public class f implements j0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final f f2631a = new f();

    private f() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public Integer mo113a(c.a.a.x.k0.c cVar, float f2) {
        boolean z = cVar.A() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        double h2 = cVar.h();
        double h3 = cVar.h();
        double h4 = cVar.h();
        double h5 = cVar.h();
        if (z) {
            cVar.c();
        }
        if (h2 <= 1.0d && h3 <= 1.0d && h4 <= 1.0d && h5 <= 1.0d) {
            h2 *= 255.0d;
            h3 *= 255.0d;
            h4 *= 255.0d;
            h5 *= 255.0d;
        }
        return Integer.valueOf(Color.argb((int) h5, (int) h2, (int) h3, (int) h4));
    }
}
