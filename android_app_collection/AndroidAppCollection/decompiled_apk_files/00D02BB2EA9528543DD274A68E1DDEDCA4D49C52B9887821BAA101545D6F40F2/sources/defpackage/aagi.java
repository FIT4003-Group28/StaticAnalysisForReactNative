package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aagi  reason: default package */
/* loaded from: classes2.dex */
public final class aagi implements aaku {
    public final Executor d;
    public final aagb e;
    public final crzo<jjn> a = new crzo<>();
    private final crzo<Void> f = new crzo<>();
    private final crzo<diwb> g = new crzo<>();
    public final crzo<Void> b = new crzo<>();
    public final crzo<dbsg<gn>> c = new crzo<>();

    public aagi(aagb aagbVar, Executor executor) {
        this.e = aagbVar;
        this.d = executor;
    }

    @Override // defpackage.aaku
    public final void a(jjn jjnVar) {
        this.a.a(jjnVar);
    }

    @Override // defpackage.aaku
    public final void b(final Runnable runnable) {
        this.f.a.a(new crzp(runnable) { // from class: aage
            private final Runnable a;

            {
                this.a = runnable;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                this.a.run();
            }
        }, dege.a);
    }

    @Override // defpackage.aaku
    public final void c() {
        this.f.a(null);
    }

    @Override // defpackage.aaku
    public final void d(final mw<diwb> mwVar) {
        this.g.a.a(new crzp(mwVar) { // from class: aagf
            private final mw a;

            {
                this.a = mwVar;
            }

            @Override // defpackage.crzp
            public final void On(crzm crzmVar) {
                mw mwVar2 = this.a;
                diwb diwbVar = (diwb) crzmVar.l();
                dbsk.s(diwbVar);
                mwVar2.a(diwbVar);
            }
        }, dege.a);
    }

    @Override // defpackage.aaku
    public final void e(diwb diwbVar) {
        this.g.a(diwbVar);
    }

    @Override // defpackage.aaku
    public final void f(dbsg<gn> dbsgVar) {
        this.c.a(dbsgVar);
    }
}
