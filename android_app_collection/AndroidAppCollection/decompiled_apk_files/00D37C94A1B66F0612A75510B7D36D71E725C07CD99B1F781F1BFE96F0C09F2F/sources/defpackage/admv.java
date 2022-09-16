package defpackage;
/* compiled from: PG */
/* renamed from: admv  reason: default package */
/* loaded from: classes.dex */
public final class admv implements airt {
    final /* synthetic */ admw a;
    private final /* synthetic */ int b;

    public admv(admw admwVar) {
        this.a = admwVar;
    }

    public admv(admw admwVar, int i) {
        this.b = i;
        this.a = admwVar;
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return this.b != 0 ? new aypg[]{airwVar.G().a.Z(new adms(this, 2, null)), airwVar.s().b.Z(new adms(this, null)), airwVar.ae(adch.n, adch.o).Z(new adms(this, 1, null))} : new aypg[]{airwVar.ao().Z(new ayqb() { // from class: admu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                admv admvVar = admv.this;
                ahhm ahhmVar = (ahhm) obj;
                adii b = admvVar.a.g.b();
                boolean z = false;
                if (ahhmVar.a() != null && ahhmVar.a().g != null) {
                    z = true;
                }
                b.n(z);
                String str = null;
                if (z && (ahhmVar.a().g.c & 32) != 0) {
                    str = ahhmVar.a().g.k;
                }
                b.b = str;
                b.f(admvVar.a.e.c());
                admvVar.a.h.c(b.a());
            }
        })};
    }
}
