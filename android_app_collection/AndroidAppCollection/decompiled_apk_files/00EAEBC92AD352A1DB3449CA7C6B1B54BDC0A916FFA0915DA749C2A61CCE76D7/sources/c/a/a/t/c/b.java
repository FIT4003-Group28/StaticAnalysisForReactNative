package c.a.a.t.c;

import java.util.List;
/* loaded from: classes.dex */
public class b extends f<Integer> {
    public b(List<c.a.a.z.a<Integer>> list) {
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

    public int b(c.a.a.z.a<Integer> aVar, float f2) {
        Integer num;
        Integer num2 = aVar.f2703b;
        if (num2 == null || aVar.f2704c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        int intValue = num2.intValue();
        int intValue2 = aVar.f2704c.intValue();
        c.a.a.z.c<A> cVar = this.f2393e;
        return (cVar == 0 || (num = (Integer) cVar.a(aVar.f2706e, aVar.f2707f.floatValue(), Integer.valueOf(intValue), Integer.valueOf(intValue2), f2, d(), e())) == null) ? c.a.a.y.b.a(c.a.a.y.g.a(f2, 0.0f, 1.0f), intValue, intValue2) : num.intValue();
    }

    public int i() {
        return b(a(), c());
    }
}
