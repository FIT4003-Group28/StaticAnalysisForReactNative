package defpackage;

import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: pii  reason: default package */
/* loaded from: classes7.dex */
public final class pii<V> extends pim<V> {
    public final bwrg<phz> a;
    public final dspy<dfok, V> b;
    private final akfa c;
    private final dehp d;

    public pii(bwrh<phz> bwrhVar, dehp dehpVar, akfa akfaVar, pfb<V> pfbVar, dspy<dfok, V> dspyVar) {
        this.c = akfaVar;
        this.d = dehpVar;
        this.a = bwrhVar.a((dssr) phz.e.cu(7), bwre.PERSISTENT_FILE, pfbVar.c.name());
        this.b = dspyVar;
    }

    @Override // defpackage.pim
    public final dehn<dcdc<pfm<V>>> a() {
        return this.d.c(new Callable(this) { // from class: pig
            private final pii a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                pii piiVar = this.a;
                return piiVar.d(piiVar.c());
            }
        });
    }

    @Override // defpackage.pim
    public final void b(final pfm<V> pfmVar) {
        final String o = this.c.o();
        if (o == null) {
            deha.c();
        } else {
            this.d.c(new Callable(this, pfmVar, o) { // from class: pih
                private final pii a;
                private final pfm b;
                private final String c;

                {
                    this.a = this;
                    this.b = pfmVar;
                    this.c = o;
                }

                @Override // java.util.concurrent.Callable
                public final Object call() {
                    phw phwVar;
                    pii piiVar = this.a;
                    pfm pfmVar2 = this.b;
                    String str = this.c;
                    phz c = piiVar.c();
                    if (c == null) {
                        phwVar = phz.e.bZ();
                        dfoc dfocVar = pfmVar2.a;
                        if (phwVar.c) {
                            phwVar.bF();
                            phwVar.c = false;
                        }
                        phz phzVar = (phz) phwVar.b;
                        dfocVar.getClass();
                        phzVar.b = dfocVar;
                        int i = phzVar.a | 1;
                        phzVar.a = i;
                        str.getClass();
                        phzVar.a = i | 2;
                        phzVar.c = str;
                    } else {
                        dsqp dsqpVar = (dsqp) c.cu(5);
                        dsqpVar.bC(c);
                        phwVar = (phw) dsqpVar;
                    }
                    phx bZ = phy.c.bZ();
                    dfok a = pfmVar2.a(piiVar.b);
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    phy phyVar = (phy) bZ.b;
                    a.getClass();
                    phyVar.b = a;
                    phyVar.a |= 1;
                    phy bK = bZ.bK();
                    if (phwVar.c) {
                        phwVar.bF();
                        phwVar.c = false;
                    }
                    phz phzVar2 = (phz) phwVar.b;
                    bK.getClass();
                    dsrj<phy> dsrjVar = phzVar2.d;
                    if (!dsrjVar.a()) {
                        phzVar2.d = dsqw.cl(dsrjVar);
                    }
                    phzVar2.d.add(bK);
                    return Boolean.valueOf(piiVar.a.f(phwVar.bK()));
                }
            });
        }
    }

    @dzsi
    public final synchronized phz c() {
        String o = this.c.o();
        if (o == null) {
            return null;
        }
        phz phzVar = this.a.i().a;
        if (phzVar != null) {
            if (!phzVar.c.equals(o)) {
                return null;
            }
        }
        return phzVar;
    }

    public final synchronized dcdc<pfm<V>> d(@dzsi phz phzVar) {
        if (phzVar == null) {
            return dcdc.e();
        }
        dccx F = dcdc.F();
        for (phy phyVar : phzVar.d) {
            dfok dfokVar = phyVar.b;
            if (dfokVar == null) {
                dfokVar = dfok.f;
            }
            F.g(pfl.a(dfokVar, this.b));
        }
        return F.f();
    }
}
