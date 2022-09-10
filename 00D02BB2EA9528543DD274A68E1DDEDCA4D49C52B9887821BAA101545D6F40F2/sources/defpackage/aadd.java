package defpackage;
/* compiled from: PG */
/* renamed from: aadd  reason: default package */
/* loaded from: classes2.dex */
public class aadd implements aadc {
    public final aaby a;
    public final aadk b;
    private final brzd c;
    private aaco d = new aaco();
    private boolean e;
    private boolean f;

    public aadd(cqhn cqhnVar, aabz aabzVar, brze brzeVar, aadk aadkVar, aadt aadtVar, aacw aacwVar, brzc brzcVar) {
        bwqv a = aabzVar.a.a();
        aabz.a(a, 1);
        akla a2 = aabzVar.b.a();
        aabz.a(a2, 2);
        aadg a3 = aabzVar.c.a();
        aabz.a(a3, 3);
        cbea a4 = aabzVar.d.a();
        aabz.a(a4, 4);
        cbqg a5 = aabzVar.e.a();
        aabz.a(a5, 5);
        aacj a6 = aabzVar.f.a();
        aabz.a(a6, 6);
        bsne a7 = aabzVar.g.a();
        aabz.a(a7, 7);
        aabz.a(aadtVar, 8);
        aabz.a(aacwVar, 9);
        this.a = new aaby(a, a2, a3, a4, a5, a6, a7, aadtVar, aacwVar);
        brzd a8 = brzeVar.a(false);
        this.c = a8;
        a8.g(brzcVar);
        a8.j(aadw.a(this.d));
        this.b = aadkVar;
    }

    @Override // defpackage.aadc
    public Boolean a() {
        return Boolean.valueOf(this.d.b().a());
    }

    @Override // defpackage.aadc
    public aabu b() {
        return this.a;
    }

    @Override // defpackage.aadc
    public jam c() {
        return this.b;
    }

    @Override // defpackage.aadc
    public Boolean d() {
        boolean z = true;
        boolean z2 = this.d.b().a() && this.d.b().b().b.size() > 0;
        if (!this.f || (!this.e && !z2)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f(aaco aacoVar) {
        this.d = aacoVar;
        aaby aabyVar = this.a;
        aabyVar.j();
        aabyVar.k(aacoVar);
        if (aacoVar.a()) {
            bsjm a = aadw.a(aacoVar);
            this.c.k(a);
            this.a.i(a);
            this.e = a.f();
            this.f = a.g();
        }
        this.b.p(aacoVar.a.a());
        cqkx.p(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g(bsjm bsjmVar) {
        this.c.k(bsjmVar);
        this.a.i(bsjmVar);
        this.e = bsjmVar.f();
        cqkx.p(this);
    }

    @Override // defpackage.aadc
    /* renamed from: h */
    public brzd e() {
        return this.c;
    }
}
