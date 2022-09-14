package c.a.a.t.c;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class i extends f<PointF> {
    private final PointF l;
    private final float[] m;
    private h n;
    private PathMeasure o;

    public i(List<? extends c.a.a.z.a<PointF>> list) {
        super(list);
        this.l = new PointF();
        this.m = new float[2];
        this.o = new PathMeasure();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // c.a.a.t.c.a
    /* renamed from: a */
    public PointF mo103a(c.a.a.z.a<PointF> aVar, float f2) {
        PointF pointF;
        h hVar = (h) aVar;
        Path i = hVar.i();
        if (i == null) {
            return aVar.f2703b;
        }
        c.a.a.z.c<A> cVar = this.f2393e;
        if (cVar != 0 && (pointF = (PointF) cVar.a(hVar.f2706e, hVar.f2707f.floatValue(), hVar.f2703b, hVar.f2704c, d(), f2, e())) != null) {
            return pointF;
        }
        if (this.n != hVar) {
            this.o.setPath(i, false);
            this.n = hVar;
        }
        PathMeasure pathMeasure = this.o;
        pathMeasure.getPosTan(f2 * pathMeasure.getLength(), this.m, null);
        PointF pointF2 = this.l;
        float[] fArr = this.m;
        pointF2.set(fArr[0], fArr[1]);
        return this.l;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<PointF>) aVar, f2);
    }
}
