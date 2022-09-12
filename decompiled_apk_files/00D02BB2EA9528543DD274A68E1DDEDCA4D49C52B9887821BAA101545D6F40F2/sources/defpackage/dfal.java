package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dfal  reason: default package */
/* loaded from: classes6.dex */
final class dfal extends dyeu {
    private final dayy<dyeu> a;
    private final String b;
    private final Executor c;

    public dfal(final dewz dewzVar, final dewy dewyVar, Executor executor) {
        this.b = dewyVar.b().getAuthority();
        this.c = dewyVar.d();
        this.a = new dayy<>(new deff(dewzVar, dewyVar) { // from class: dfab
            private final dewz a;
            private final dewy b;

            {
                this.a = dewzVar;
                this.b = dewyVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                return deha.a(this.a.a(this.b));
            }
        }, executor);
    }

    @Override // defpackage.dyeu
    public final <RequestT, ResponseT> dyex<RequestT, ResponseT> a(final dyib<RequestT, ResponseT> dyibVar, final dyet dyetVar) {
        if (csae.a.compareAndSet(false, true)) {
            dyyq.a(dsqa.c());
        }
        Executor executor = dyetVar.c;
        dehn<dyeu> a = this.a.a();
        dbrn dbrnVar = new dbrn(dyibVar, dyetVar) { // from class: dfac
            private final dyib a;
            private final dyet b;

            {
                this.a = dyibVar;
                this.b = dyetVar;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                return ((dyeu) obj).a(this.a, this.b);
            }
        };
        if (executor == null) {
            executor = this.c;
        }
        return new dfak(deew.h(a, dbrnVar, executor));
    }

    @Override // defpackage.dyeu
    public final String b() {
        return this.b;
    }
}
