package c.a.a.v.j;

import android.graphics.PointF;
import java.util.List;
/* loaded from: classes.dex */
public class i implements m<PointF, PointF> {

    /* renamed from: a  reason: collision with root package name */
    private final b f2453a;

    /* renamed from: b  reason: collision with root package name */
    private final b f2454b;

    public i(b bVar, b bVar2) {
        this.f2453a = bVar;
        this.f2454b = bVar2;
    }

    @Override // c.a.a.v.j.m
    /* renamed from: a */
    public c.a.a.t.c.a<PointF, PointF> mo104a() {
        return new c.a.a.t.c.m(this.f2453a.mo104a(), this.f2454b.mo104a());
    }

    @Override // c.a.a.v.j.m
    public List<c.a.a.z.a<PointF>> b() {
        throw new UnsupportedOperationException("Cannot call getKeyframes on AnimatableSplitDimensionPathValue.");
    }

    @Override // c.a.a.v.j.m
    public boolean c() {
        return this.f2453a.c() && this.f2454b.c();
    }
}
