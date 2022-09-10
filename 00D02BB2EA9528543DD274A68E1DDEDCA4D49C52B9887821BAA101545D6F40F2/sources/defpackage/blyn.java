package defpackage;
/* compiled from: PG */
/* renamed from: blyn  reason: default package */
/* loaded from: classes3.dex */
final class blyn implements blwv {
    final /* synthetic */ blyv a;

    public blyn(blyv blyvVar) {
        this.a = blyvVar;
    }

    @Override // defpackage.blwv
    public final void a() {
        this.a.k.p(3);
    }

    @Override // defpackage.blwv
    public final void b() {
        this.a.m = null;
    }

    @Override // defpackage.blwv
    public final void c(float f, float f2) {
        blyv blyvVar = this.a;
        blyvVar.o = f;
        blyvVar.p = f2;
        blyvVar.k.p(1);
    }

    @Override // defpackage.blwv
    public final void d() {
        this.a.m = blzn.e();
        this.a.k.p(2);
    }

    @Override // defpackage.blwv
    public final void e() {
        blyv blyvVar = this.a;
        if (blyvVar.ab().booleanValue()) {
            cjqy cjqyVar = blyvVar.f;
            cjte cjteVar = new cjte(deaf.SWIPE);
            cjta b = cjtd.b();
            b.d = dtxz.t;
            b.b = blyvVar.l;
            b.g(blyvVar.j.d);
            cjqyVar.m(cjteVar, b.a());
            blyvVar.ar(-1, true);
            blyvVar.q = blyvVar.o;
            blyvVar.o = 0.0f;
            blyvVar.p = 0.0f;
            blyvVar.s();
        }
    }
}
