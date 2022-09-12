package defpackage;

import java.io.PrintWriter;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bxrr  reason: default package */
/* loaded from: classes4.dex */
public final class bxrr implements bxtv {
    private static final awwt c;
    public final bxrf a;
    public final dbsg<dxio<aeaa>> b;
    private final awvy d;
    private final Executor e;

    static {
        awws u = awwt.u();
        u.t(dcdc.f("recent_history"));
        u.e(awvv.k);
        c = u.a();
    }

    public bxrr(awvy awvyVar, Executor executor, bxrf bxrfVar, dbsg<dxio<aeaa>> dbsgVar) {
        this.d = awvyVar;
        this.e = executor;
        this.a = bxrfVar;
        this.b = dbsgVar;
    }

    private final dehn<dcdc<dpte>> e(final dehn<awwb> dehnVar) {
        return deha.k(dehnVar, this.a.d()).b(new Callable(this, dehnVar) { // from class: bxrp
            private final bxrr a;
            private final dehn b;

            {
                this.a = this;
                this.b = dehnVar;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                bxrr bxrrVar = this.a;
                try {
                    return bxrrVar.a.b(dcdc.r(((dvhq) ((awwb) deha.r(this.b)).a(awvv.k).c(dvhq.d)).b));
                } catch (ExecutionException unused) {
                    return bxrrVar.a.b(dcdc.e());
                }
            }
        }, this.e);
    }

    @Override // defpackage.btph
    public final void NX(String str, PrintWriter printWriter) {
    }

    @Override // defpackage.bxtv
    public final dehn<dcdc<dpte>> a(boolean z) {
        deig d = deig.d();
        awvw f = awvx.f();
        f.e(c);
        this.d.c(f.a(), bvpj.b(new bxrq(this, z, d)), bvrj.BACKGROUND_THREADPOOL);
        return e(d);
    }

    @Override // defpackage.bxtv
    public final dehn<dcdc<dpte>> b() {
        awws t = c.t();
        t.m(20);
        awwt a = t.a();
        awvw f = awvx.f();
        f.e(a);
        return e(this.d.a(f.a()));
    }

    @Override // defpackage.bxtv
    public final dehn<dcdc<dpte>> d() {
        bxrf bxrfVar = this.a;
        bxrfVar.e();
        return bxrfVar.b.h();
    }
}
