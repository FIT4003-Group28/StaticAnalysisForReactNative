package c.a.a.t.c;

import android.graphics.Path;
import android.graphics.PointF;
/* loaded from: classes.dex */
public class h extends c.a.a.z.a<PointF> {
    private Path o;
    private final c.a.a.z.a<PointF> p;

    public h(c.a.a.e eVar, c.a.a.z.a<PointF> aVar) {
        super(eVar, aVar.f2703b, aVar.f2704c, aVar.f2705d, aVar.f2706e, aVar.f2707f);
        this.p = aVar;
        h();
    }

    public void h() {
        T t;
        T t2 = this.f2704c;
        boolean z = (t2 == 0 || (t = this.f2703b) == 0 || !((PointF) t).equals(((PointF) t2).x, ((PointF) t2).y)) ? false : true;
        T t3 = this.f2704c;
        if (t3 == 0 || z) {
            return;
        }
        c.a.a.z.a<PointF> aVar = this.p;
        this.o = c.a.a.y.h.a((PointF) this.f2703b, (PointF) t3, aVar.m, aVar.n);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Path i() {
        return this.o;
    }
}
