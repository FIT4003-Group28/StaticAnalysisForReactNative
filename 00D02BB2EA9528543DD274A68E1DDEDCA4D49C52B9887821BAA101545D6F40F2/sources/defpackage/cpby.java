package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpby  reason: default package */
/* loaded from: classes5.dex */
final class cpby<TResult, TContinuationResult> implements cpcr, cpcl, cpci, cpcc {
    public final cpbu<TResult, cpcq<TContinuationResult>> a;
    public final cpcx<TContinuationResult> b;
    private final Executor c;

    public cpby(Executor executor, cpbu<TResult, cpcq<TContinuationResult>> cpbuVar, cpcx<TContinuationResult> cpcxVar) {
        this.c = executor;
        this.a = cpbuVar;
        this.b = cpcxVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        this.c.execute(new cpbx(this, cpcqVar));
    }

    @Override // defpackage.cpcl
    public final void c(TContinuationResult tcontinuationresult) {
        this.b.t(tcontinuationresult);
    }

    @Override // defpackage.cpci
    public final void d(Exception exc) {
        this.b.u(exc);
    }

    @Override // defpackage.cpcc
    public final void e() {
        this.b.x();
    }
}
