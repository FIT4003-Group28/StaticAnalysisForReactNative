package c.a.a.t.c;

import java.util.List;
/* loaded from: classes.dex */
public class c extends f<Float> {
    public c(List<c.a.a.z.a<Float>> list) {
        super(list);
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    Float mo103a(c.a.a.z.a<Float> aVar, float f2) {
        return Float.valueOf(b(aVar, f2));
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<Float>) aVar, f2);
    }

    float b(c.a.a.z.a<Float> aVar, float f2) {
        Float f3;
        if (aVar.f2703b == null || aVar.f2704c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c.a.a.z.c<A> cVar = this.f2393e;
        return (cVar == 0 || (f3 = (Float) cVar.a(aVar.f2706e, aVar.f2707f.floatValue(), aVar.f2703b, aVar.f2704c, f2, d(), e())) == null) ? c.a.a.y.g.c(aVar.e(), aVar.b(), f2) : f3.floatValue();
    }

    public float i() {
        return b(a(), c());
    }
}
