package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bszm  reason: default package */
/* loaded from: classes4.dex */
public final class bszm<V> {
    public final bszo<dtd, V> a;
    public final bszp<dtd> b;
    public final bszq<dte, V> c;
    final /* synthetic */ bszs d;
    private final czw e;
    private final bszr<dte> f;

    public bszm(bszs bszsVar, czw czwVar, bszo<dtd, V> bszoVar, bszp<dtd> bszpVar, bszr<dte> bszrVar, bszq<dte, V> bszqVar) {
        this.d = bszsVar;
        this.e = czwVar;
        this.a = bszoVar;
        this.b = bszpVar;
        this.f = bszrVar;
        this.c = bszqVar;
    }

    public final boolean a() {
        return this.f.a(c());
    }

    public final void b(final V v) {
        d(new bszi(this, v) { // from class: bszj
            private final bszm a;
            private final Object b;

            {
                this.a = this;
                this.b = v;
            }

            @Override // defpackage.bszi
            public final void a(dssi dssiVar) {
                bszm bszmVar = this.a;
                bszmVar.a.a(dssiVar, this.b);
            }
        });
    }

    public final dte c() {
        dte dteVar = this.e.a().b;
        return dteVar == null ? dte.w : dteVar;
    }

    public final void d(final bszi<dtd> bsziVar) {
        bszs.aX(this.e.c(new dbrn(bsziVar) { // from class: bszl
            private final bszi a;

            {
                this.a = bsziVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                bszi bsziVar2 = this.a;
                dtm dtmVar = (dtm) obj;
                dsqp dsqpVar = (dsqp) dtmVar.cu(5);
                dsqpVar.bC(dtmVar);
                dtl dtlVar = (dtl) dsqpVar;
                dte dteVar = ((dtm) dtlVar.b).b;
                if (dteVar == null) {
                    dteVar = dte.w;
                }
                dsqp dsqpVar2 = (dsqp) dteVar.cu(5);
                dsqpVar2.bC(dteVar);
                dtd dtdVar = (dtd) dsqpVar2;
                bsziVar2.a(dtdVar);
                dte bK = dtdVar.bK();
                if (dtlVar.c) {
                    dtlVar.bF();
                    dtlVar.c = false;
                }
                dtm dtmVar2 = (dtm) dtlVar.b;
                bK.getClass();
                dtmVar2.b = bK;
                dtmVar2.a |= 1;
                return dtlVar.bK();
            }
        }, this.d.ai));
    }
}
