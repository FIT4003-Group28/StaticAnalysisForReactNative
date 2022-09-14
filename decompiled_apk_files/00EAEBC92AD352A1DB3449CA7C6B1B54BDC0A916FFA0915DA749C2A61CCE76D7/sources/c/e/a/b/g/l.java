package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l<TResult, TContinuationResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4622a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, TContinuationResult> f4623b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f4624c;

    public l(Executor executor, a<TResult, TContinuationResult> aVar, c0<TContinuationResult> c0Var) {
        this.f4622a = executor;
        this.f4623b = aVar;
        this.f4624c = c0Var;
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        this.f4622a.execute(new m(this, hVar));
    }
}
