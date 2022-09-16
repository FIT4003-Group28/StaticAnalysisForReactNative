package defpackage;
/* compiled from: PG */
/* renamed from: fkf  reason: default package */
/* loaded from: classes3.dex */
public final class fkf extends ajtu {
    private final axnm b;

    public fkf(axnm axnmVar) {
        this.b = axnmVar;
    }

    @Override // defpackage.ajsr
    public final void a() {
        ((ajtp) this.b.get()).a();
    }

    @Override // defpackage.ajsr
    public final void b() {
        ((ajtp) this.b.get()).b();
    }

    @Override // defpackage.ajtu
    protected final boolean c() {
        ajto ajtoVar = this.a;
        aopa aopaVar = ((fkg) ajtoVar.a).h;
        aopa aopaVar2 = ((fkg) ajtoVar.b).h;
        arag aragVar = ((apvg) aopaVar.instance).f;
        if (aragVar == null) {
            aragVar = arag.a;
        }
        arag aragVar2 = ((apvg) aopaVar2.instance).f;
        if (aragVar2 == null) {
            aragVar2 = arag.a;
        }
        if (!aragVar.equals(aragVar2)) {
            ajtn a = ajto.a();
            a.j(ajtoVar.a);
            a.g(ajtoVar.b);
            a.b(ajtoVar.c);
            a.i(ajtoVar.d);
            a.h(ajtoVar.e);
            a.f(ajtoVar.f);
            a.e(ajtoVar.g);
            a.c(ajtoVar.h);
            a.d(ajtoVar.i);
            a.k(ajtoVar.j);
            a.l(ajtoVar.k);
            return ((ajtp) this.b.get()).d(a.a());
        }
        return false;
    }
}
