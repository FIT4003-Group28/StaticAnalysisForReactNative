package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpcn  reason: default package */
/* loaded from: classes5.dex */
final class cpcn<TResult, TContinuationResult> implements cpcr, cpcl, cpci, cpcc {
    public final cpcp<TResult, TContinuationResult> a;
    private final Executor b;
    private final cpcx<TContinuationResult> c;

    public cpcn(Executor executor, cpcp<TResult, TContinuationResult> cpcpVar, cpcx<TContinuationResult> cpcxVar) {
        this.b = executor;
        this.a = cpcpVar;
        this.c = cpcxVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        this.b.execute(new cpcm(this, cpcqVar));
    }

    @Override // defpackage.cpcl
    public final void c(TContinuationResult tcontinuationresult) {
        this.c.t(tcontinuationresult);
    }

    @Override // defpackage.cpci
    public final void d(Exception exc) {
        this.c.u(exc);
    }

    @Override // defpackage.cpcc
    public final void e() {
        this.c.x();
    }
}
