package c.a.a.x;

import android.graphics.PointF;
import c.a.a.x.k0.c;
/* loaded from: classes.dex */
public class y implements j0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final y f2682a = new y();

    private y() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public PointF mo113a(c.a.a.x.k0.c cVar, float f2) {
        c.b A = cVar.A();
        if (A != c.b.BEGIN_ARRAY && A != c.b.BEGIN_OBJECT) {
            if (A == c.b.NUMBER) {
                PointF pointF = new PointF(((float) cVar.h()) * f2, ((float) cVar.h()) * f2);
                while (cVar.f()) {
                    cVar.C();
                }
                return pointF;
            }
            throw new IllegalArgumentException("Cannot convert json to point. Next token is " + A);
        }
        return p.d(cVar, f2);
    }
}
