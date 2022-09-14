package c.a.a.x;

import c.a.a.x.k0.c;
/* loaded from: classes.dex */
public class c0 implements j0<c.a.a.z.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final c0 f2626a = new c0();

    private c0() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.a.a.x.j0
    /* renamed from: a */
    public c.a.a.z.d mo113a(c.a.a.x.k0.c cVar, float f2) {
        boolean z = cVar.A() == c.b.BEGIN_ARRAY;
        if (z) {
            cVar.a();
        }
        float h2 = (float) cVar.h();
        float h3 = (float) cVar.h();
        while (cVar.f()) {
            cVar.C();
        }
        if (z) {
            cVar.c();
        }
        return new c.a.a.z.d((h2 / 100.0f) * f2, (h3 / 100.0f) * f2);
    }
}
