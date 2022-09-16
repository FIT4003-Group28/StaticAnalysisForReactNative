package c.a.a.t.c;

import java.util.List;
/* loaded from: classes.dex */
public class e extends f<Integer> {
    public e(List<c.a.a.z.a<Integer>> list) {
        super(list);
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    Integer mo103a(c.a.a.z.a<Integer> aVar, float f2) {
        return Integer.valueOf(b(aVar, f2));
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<Integer>) aVar, f2);
    }

    int b(c.a.a.z.a<Integer> aVar, float f2) {
        Integer num;
        if (aVar.f2703b == null || aVar.f2704c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c.a.a.z.c<A> cVar = this.f2393e;
        return (cVar == 0 || (num = (Integer) cVar.a(aVar.f2706e, aVar.f2707f.floatValue(), aVar.f2703b, aVar.f2704c, f2, d(), e())) == null) ? c.a.a.y.g.a(aVar.f(), aVar.c(), f2) : num.intValue();
    }

    public int i() {
        return b(a(), c());
    }
}
