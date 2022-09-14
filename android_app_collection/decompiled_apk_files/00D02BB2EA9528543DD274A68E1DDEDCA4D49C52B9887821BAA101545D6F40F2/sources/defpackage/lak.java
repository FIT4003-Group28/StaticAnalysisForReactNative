package defpackage;
/* compiled from: PG */
/* renamed from: lak  reason: default package */
/* loaded from: classes7.dex */
public final class lak {
    public final cqkj a;
    public final ldl b;
    @dzsi
    public cqkf<lcz> c;
    public final nue d;
    public final ntr e = new laj(this);
    private final dxio<akox> f;
    private final btrm g;
    private final kyw h;

    public lak(cqkj cqkjVar, dxio<akox> dxioVar, btrm btrmVar, ldl ldlVar, kyw kywVar) {
        dbsk.s(cqkjVar);
        this.a = cqkjVar;
        dbsk.s(dxioVar);
        this.f = dxioVar;
        dbsk.s(btrmVar);
        this.g = btrmVar;
        this.b = ldlVar;
        this.h = kywVar;
        this.d = new nue();
    }

    public final void a(boolean z) {
        nue nueVar = this.d;
        nueVar.e = z;
        nud nudVar = nueVar.a;
        if (nudVar != null) {
            nudVar.setActive(z);
        }
    }

    public final boolean b() {
        nue nueVar = this.d;
        nud nudVar = nueVar.a;
        return nudVar != null ? nudVar.k : nueVar.e;
    }

    public final void c(float f) {
        float min = Math.min(21.0f, Math.max(3.0f, this.h.a() + f));
        kyw kywVar = this.h;
        synchronized (kywVar.d) {
            if (!kyw.o(min, kywVar.c)) {
                kywVar.c = min;
                float f2 = kywVar.a.a().n().k;
                if (kyw.o(f2, kywVar.c)) {
                    kywVar.b();
                } else {
                    int i = f2 > min ? 2 : 1;
                    if (kywVar.g != i) {
                        kywVar.e.g(f2, dcyn.a, min, dcyn.a);
                    } else {
                        kywVar.e.h(kywVar.c(), min, dcyn.a);
                    }
                    kywVar.f = kywVar.b.a();
                    kywVar.g = i;
                }
            }
        }
        this.f.a().r(this.h);
        this.g.b(new alhx(min));
        d();
    }

    public final void d() {
        nue nueVar = this.d;
        float a = (this.h.a() - 3.0f) / 18.0f;
        nueVar.g = a;
        nud nudVar = nueVar.a;
        if (nudVar != null) {
            nudVar.j(a);
        }
    }

    public final void e(boolean z) {
        this.b.e(z);
    }
}
