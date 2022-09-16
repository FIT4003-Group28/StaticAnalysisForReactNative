package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cpbw  reason: default package */
/* loaded from: classes5.dex */
final class cpbw<TResult, TContinuationResult> implements cpcr<TResult> {
    public final cpbu<TResult, TContinuationResult> a;
    public final cpcx<TContinuationResult> b;
    private final Executor c;

    public cpbw(Executor executor, cpbu<TResult, TContinuationResult> cpbuVar, cpcx<TContinuationResult> cpcxVar) {
        this.c = executor;
        this.a = cpbuVar;
        this.b = cpcxVar;
    }

    @Override // defpackage.cpcr
    public final void a(cpcq<TResult> cpcqVar) {
        this.c.execute(new cpbv(this, cpcqVar));
    }
}
