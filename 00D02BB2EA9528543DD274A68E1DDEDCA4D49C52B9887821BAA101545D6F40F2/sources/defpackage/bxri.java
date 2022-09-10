package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxri  reason: default package */
/* loaded from: classes4.dex */
public final class bxri implements bxtu {
    private static final awwt c;
    public final bxrf a;
    public final dbsg<dxio<aeaa>> b;
    private final awvy d;
    private final Executor e;
    private final dxio<akox> f;
    private final bxro g;

    static {
        awws u = awwt.u();
        u.t(dcdc.f("personalized_history"));
        u.e(awvv.I);
        c = u.a();
    }

    public bxri(awvy awvyVar, dbsg<dxio<aeaa>> dbsgVar, dxio<akox> dxioVar, bxro bxroVar, Executor executor, bxrf bxrfVar) {
        this.f = dxioVar;
        this.d = awvyVar;
        this.g = bxroVar;
        this.e = executor;
        this.a = bxrfVar;
        this.b = dbsgVar;
    }

    @Override // defpackage.bxtu
    public final dehn<dcdc<dpte>> a(boolean z) {
        final deig d = deig.d();
        awvw f = awvx.f();
        f.e(c);
        f.b(this.f.a().aa());
        this.d.c(f.a(), bvpj.b(new bxrh(this, z, d)), bvrj.BACKGROUND_THREADPOOL);
        return deha.k(d, this.a.d()).b(new Callable(this, d) { // from class: bxrg
            private final bxri a;
            private final dehn b;

            {
                this.a = this;
                this.b = d;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxri bxriVar = this.a;
                try {
                    return bxriVar.a.b(dcdc.r(((dvhq) ((awwb) deha.r(this.b)).a(awvv.I).c(dvhq.d)).b));
                } catch (ExecutionException unused) {
                    return bxriVar.a.b(dcdc.e());
                }
            }
        }, this.e);
    }

    @Override // defpackage.bxtu
    public final void b(dbsz<dcdc<dpte>> dbszVar, boolean z) {
        awvx a;
        bxro bxroVar = this.g;
        awvv<dvhq> awvvVar = awvv.I;
        boolean z2 = true;
        bxro.a(awvvVar, 1);
        bxro.a(bxroVar.a.a(), 2);
        awvy a2 = bxroVar.b.a();
        bxro.a(a2, 3);
        bxrf a3 = bxroVar.c.a();
        bxro.a(a3, 4);
        dxio a4 = ((dxjh) bxroVar.d).a();
        bxro.a(a4, 5);
        dbsg<dxio<aeaa>> a5 = bxroVar.e.a();
        bxro.a(a5, 6);
        bxrn bxrnVar = new bxrn(awvvVar, a2, a3, a4, a5);
        if (bxrnVar.i != bxrn.a) {
            z2 = false;
        }
        dbsk.m(z2, "Cannot restart ProgressiveHistoryHandler once started");
        bxrnVar.i = dbszVar;
        deha.q(bxrnVar.d.d(), new bxrm(bxrnVar), dege.a);
        awvy awvyVar = bxrnVar.c;
        awvw f = awvx.f();
        f.e(bxrnVar.g);
        if (bxrnVar.b == awvv.I) {
            f.b(bxrnVar.e.a().aa());
            a = f.a();
        } else {
            a = f.a();
        }
        awvyVar.c(a, bvpj.b(new bxrl(bxrnVar, z)), bvrj.BACKGROUND_THREADPOOL);
    }
}
