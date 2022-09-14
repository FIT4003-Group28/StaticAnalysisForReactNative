package c.d.j.f;

import c.d.b.b.e;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class c implements g {

    /* renamed from: a  reason: collision with root package name */
    private d f3281a;

    public c(d dVar) {
        this.f3281a = dVar;
    }

    public static c.d.b.b.e a(c.d.b.b.c cVar, c.d.b.b.d dVar) {
        return a(cVar, dVar, Executors.newSingleThreadExecutor());
    }

    public static c.d.b.b.e a(c.d.b.b.c cVar, c.d.b.b.d dVar, Executor executor) {
        return new c.d.b.b.e(dVar, cVar.h(), new e.c(cVar.k(), cVar.j(), cVar.f()), cVar.d(), cVar.c(), cVar.g(), cVar.e(), executor, cVar.i());
    }

    @Override // c.d.j.f.g
    public c.d.b.b.i a(c.d.b.b.c cVar) {
        return a(cVar, this.f3281a.a(cVar));
    }
}
