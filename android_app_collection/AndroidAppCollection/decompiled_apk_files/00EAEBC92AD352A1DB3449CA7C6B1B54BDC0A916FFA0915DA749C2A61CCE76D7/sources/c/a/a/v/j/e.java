package c.a.a.v.j;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class e implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final List<c.a.a.z.a<PointF>> f2452a;

    public e(List<c.a.a.z.a<PointF>> list) {
        this.f2452a = list;
    }

    @Override // c.a.a.v.j.m
    /* renamed from: a */
    public c.a.a.t.c.a<PointF, PointF> mo104a() {
        return this.f2452a.get(0).g() ? new c.a.a.t.c.j(this.f2452a) : new c.a.a.t.c.i(this.f2452a);
    }

    @Override // c.a.a.v.j.m
    public List<c.a.a.z.a<PointF>> b() {
        return this.f2452a;
    }

    @Override // c.a.a.v.j.m
    public boolean c() {
        return this.f2452a.size() == 1 && this.f2452a.get(0).g();
    }
}
