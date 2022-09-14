package c.d.j.n;

import android.util.Pair;
import c.d.j.o.c;
/* loaded from: classes.dex */
public class g extends d0<Pair<c.d.b.a.d, c.b>, c.d.d.h.a<c.d.j.k.b>> {

    /* renamed from: c  reason: collision with root package name */
    private final c.d.j.d.f f3428c;

    public g(c.d.j.d.f fVar, j0 j0Var) {
        super(j0Var);
        this.f3428c = fVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't rename method to resolve collision */
    @Override // c.d.j.n.d0
    /* renamed from: a */
    public Pair<c.d.b.a.d, c.b> mo143a(k0 k0Var) {
        return Pair.create(this.f3428c.a(k0Var.f(), k0Var.b()), k0Var.h());
    }

    @Override // c.d.j.n.d0
    public c.d.d.h.a<c.d.j.k.b> a(c.d.d.h.a<c.d.j.k.b> aVar) {
        return c.d.d.h.a.a((c.d.d.h.a) aVar);
    }
}
