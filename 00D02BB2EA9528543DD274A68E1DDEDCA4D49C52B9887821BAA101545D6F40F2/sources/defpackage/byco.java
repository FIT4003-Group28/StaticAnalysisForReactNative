package defpackage;
/* compiled from: PG */
/* renamed from: byco  reason: default package */
/* loaded from: classes.dex */
public final class byco implements bycs {
    private static final bvjk a = new bvjk("terms_accepted_logged", bvjk.c);
    private final gga b;
    private final bvjj c;
    private final bttf d;
    private final dxio<cjqy> e;
    private final dxio<cjqq> f;
    private final dxio<afha> g;

    public byco(gga ggaVar, bvjj bvjjVar, bttf bttfVar, dxio<cjqy> dxioVar, dxio<cjqq> dxioVar2, dxio<afha> dxioVar3) {
        this.b = ggaVar;
        this.c = bvjjVar;
        this.d = bttfVar;
        this.e = dxioVar;
        this.f = dxioVar2;
        this.g = dxioVar3;
    }

    private final String d() {
        if (bycr.a(this.d)) {
            return cjxr.l();
        }
        return cjxr.a(bycr.b(this.d));
    }

    @Override // defpackage.bycs
    public final void a() {
        this.b.D(gfk.aT(d(), bvuj.a));
    }

    @Override // defpackage.bycs
    public final void b() {
        this.g.a().r(d(), 4);
    }

    @Override // defpackage.bycs
    public final void c() {
        if (!bycr.a(this.d)) {
            bvjj bvjjVar = this.c;
            bvjk bvjkVar = a;
            if (bvjjVar.m(bvjkVar, false)) {
                return;
            }
            cjsx i = cjsy.i();
            i.b(ddda.cz);
            this.e.a().k(i.a());
            cjqp g = this.f.a().g();
            cjta cjtaVar = new cjta();
            cjtaVar.d = dtyc.b;
            cjtaVar.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g.d(cjtaVar.a());
            cjqp g2 = this.f.a().g();
            cjta cjtaVar2 = new cjta();
            cjtaVar2.d = dtyc.d;
            cjtaVar2.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g2.d(cjtaVar2.a());
            cjqp g3 = this.f.a().g();
            cjta cjtaVar3 = new cjta();
            cjtaVar3.d = dtyc.a;
            cjtaVar3.w(ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL);
            g3.d(cjtaVar3.a());
            this.c.S(bvjkVar, true);
        }
    }
}
