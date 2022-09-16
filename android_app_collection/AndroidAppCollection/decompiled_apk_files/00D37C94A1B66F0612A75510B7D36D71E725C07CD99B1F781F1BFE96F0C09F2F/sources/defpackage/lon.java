package defpackage;
/* compiled from: PG */
/* renamed from: lon  reason: default package */
/* loaded from: classes3.dex */
final class lon extends lg {
    private final lop a;
    private final ajsf b;

    public lon(lop lopVar, ajsf ajsfVar) {
        this.a = lopVar;
        this.b = ajsfVar;
        r();
    }

    private final void r() {
        if (this.b.b() > 0) {
            lop lopVar = this.a;
            lopVar.d.setVisibility(0);
            lopVar.m();
            if (lopVar.a != null) {
                return;
            }
            lopVar.a = new loo(lopVar);
            lopVar.c.f60J.aE(lopVar.a);
            return;
        }
        lop lopVar2 = this.a;
        lopVar2.d.setVisibility(8);
        lopVar2.f();
        loo looVar = lopVar2.a;
        if (looVar == null) {
            return;
        }
        lopVar2.c.f60J.aG(looVar);
        lopVar2.a = null;
    }

    @Override // defpackage.lg
    public final void c() {
        r();
    }

    @Override // defpackage.lg
    public final void d(int i, int i2) {
        r();
    }

    @Override // defpackage.lg
    public final void f(int i, int i2) {
        r();
    }

    @Override // defpackage.lg
    public final void g(int i, int i2) {
        r();
    }

    @Override // defpackage.lg
    public final void h(int i, int i2) {
        r();
    }
}
