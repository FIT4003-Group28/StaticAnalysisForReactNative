package c.a.a.t.c;

import java.util.List;
/* loaded from: classes.dex */
public class k extends f<c.a.a.z.d> {
    private final c.a.a.z.d l;

    public k(List<c.a.a.z.a<c.a.a.z.d>> list) {
        super(list);
        this.l = new c.a.a.z.d();
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    public c.a.a.z.d mo103a(c.a.a.z.a<c.a.a.z.d> aVar, float f2) {
        c.a.a.z.d dVar;
        c.a.a.z.d dVar2;
        c.a.a.z.d dVar3 = aVar.f2703b;
        if (dVar3 == null || (dVar = aVar.f2704c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        c.a.a.z.d dVar4 = dVar3;
        c.a.a.z.d dVar5 = dVar;
        c.a.a.z.c<A> cVar = this.f2393e;
        if (cVar != 0 && (dVar2 = (c.a.a.z.d) cVar.a(aVar.f2706e, aVar.f2707f.floatValue(), dVar4, dVar5, f2, d(), e())) != null) {
            return dVar2;
        }
        this.l.b(c.a.a.y.g.c(dVar4.a(), dVar5.a(), f2), c.a.a.y.g.c(dVar4.b(), dVar5.b(), f2));
        return this.l;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    public /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<c.a.a.z.d>) aVar, f2);
    }
}
