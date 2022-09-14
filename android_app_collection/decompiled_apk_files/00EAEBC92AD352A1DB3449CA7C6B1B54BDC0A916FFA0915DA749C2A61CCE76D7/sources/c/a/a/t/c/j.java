package c.a.a.t.c;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class j extends f<PointF> {
    private final PointF l;

    public j(List<c.a.a.z.a<PointF>> list) {
        super(list);
        this.l = new PointF();
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    public PointF mo103a(c.a.a.z.a<PointF> aVar, float f2) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f2703b;
        if (pointF3 == null || (pointF = aVar.f2704c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        c.a.a.z.c<A> cVar = this.f2393e;
        if (cVar != 0 && (pointF2 = (PointF) cVar.a(aVar.f2706e, aVar.f2707f.floatValue(), pointF4, pointF5, f2, d(), e())) != null) {
            return pointF2;
        }
        PointF pointF6 = this.l;
        float f3 = pointF4.x;
        float f4 = pointF4.y;
        pointF6.set(f3 + ((pointF5.x - f3) * f2), f4 + (f2 * (pointF5.y - f4)));
        return this.l;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<PointF>) aVar, f2);
    }
}
