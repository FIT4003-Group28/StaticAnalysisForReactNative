package defpackage;
/* compiled from: PG */
/* renamed from: hwt  reason: default package */
/* loaded from: classes.dex */
public final class hwt extends alio {
    final btrm a;
    final dbsg<algv> b;

    public hwt(btrm btrmVar, dbsg<algv> dbsgVar) {
        this.a = btrmVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.alio, defpackage.alja
    public final void a(akto aktoVar, akqq akqqVar, aliz alizVar) {
        alizVar.a();
        super.a(aktoVar, akqqVar, alizVar);
    }

    @Override // defpackage.alio, defpackage.alja
    public final void b(akto aktoVar, akqq akqqVar, aliz alizVar) {
        alizVar.a();
        super.b(aktoVar, akqqVar, alizVar);
    }

    @Override // defpackage.alio, defpackage.alja
    public final void c(aliz alizVar) {
        alizVar.a();
    }

    @Override // defpackage.alio, defpackage.alja
    public final void d(aliz alizVar) {
        alizVar.a();
        this.a.b(alhl.a);
    }

    @Override // defpackage.alio, defpackage.alja
    public final void e(alje aljeVar, aliz alizVar) {
        alizVar.a();
        this.a.b(new alhw(aljeVar));
    }

    @Override // defpackage.alio, defpackage.alja
    public final void f(float f, boolean z, aliz alizVar) {
        alizVar.a();
        this.a.b(alhy.a);
        if (z) {
            final alhx alhxVar = new alhx(f);
            bvor.a(this.b, new mw(alhxVar) { // from class: hws
                private final alhx a;

                {
                    this.a = alhxVar;
                }

                @Override // defpackage.mw
                public final void a(Object obj) {
                    ((algv) obj).a();
                }
            });
            this.a.b(alhxVar);
        }
    }

    @Override // defpackage.alio, defpackage.alja
    public final void g(aliz alizVar) {
        c(alizVar);
    }
}
