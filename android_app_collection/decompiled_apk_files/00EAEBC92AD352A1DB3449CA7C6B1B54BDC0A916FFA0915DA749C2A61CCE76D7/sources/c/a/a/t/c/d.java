package c.a.a.t.c;

import java.util.List;
/* loaded from: classes.dex */
public class d extends f<c.a.a.v.k.c> {
    private final c.a.a.v.k.c l;

    public d(List<c.a.a.z.a<c.a.a.v.k.c>> list) {
        super(list);
        int i = 0;
        c.a.a.v.k.c cVar = list.get(0).f2703b;
        i = cVar != null ? cVar.c() : i;
        this.l = new c.a.a.v.k.c(new float[i], new int[i]);
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    c.a.a.v.k.c mo103a(c.a.a.z.a<c.a.a.v.k.c> aVar, float f2) {
        this.l.a(aVar.f2703b, aVar.f2704c, f2);
        return this.l;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a  reason: collision with other method in class */
    /* bridge */ /* synthetic */ Object mo103a(c.a.a.z.a aVar, float f2) {
        return mo103a((c.a.a.z.a<c.a.a.v.k.c>) aVar, f2);
    }
}
