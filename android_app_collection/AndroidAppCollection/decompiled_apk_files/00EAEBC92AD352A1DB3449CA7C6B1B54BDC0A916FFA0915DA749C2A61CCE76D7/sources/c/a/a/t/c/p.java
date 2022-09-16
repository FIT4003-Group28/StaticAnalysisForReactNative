package c.a.a.t.c;

import java.util.Collections;
/* loaded from: classes.dex */
public class p<K, A> extends a<K, A> {
    private final A l;

    public p(c.a.a.z.c<A> cVar) {
        this(cVar, null);
    }

    public p(c.a.a.z.c<A> cVar, A a2) {
        super(Collections.emptyList());
        new c.a.a.z.b();
        a(cVar);
        this.l = a2;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: a */
    A mo103a(c.a.a.z.a<K> aVar, float f2) {
        return mo102f();
    }

    @Override // c.a.a.t.c.a
    float b() {
        return 1.0f;
    }

    @Override // c.a.a.t.c.a
    /* renamed from: f */
    public A mo102f() {
        c.a.a.z.c<A> cVar = this.f2393e;
        A a2 = this.l;
        return cVar.a(0.0f, 0.0f, a2, a2, e(), e(), e());
    }

    @Override // c.a.a.t.c.a
    public void g() {
        if (this.f2393e != null) {
            super.g();
        }
    }
}
