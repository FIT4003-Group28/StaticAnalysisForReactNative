package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class n<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4627a;

    /* renamed from: b  reason: collision with root package name */
    private final a<TResult, h<TContinuationResult>> f4628b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f4629c;

    public n(Executor executor, a<TResult, h<TContinuationResult>> aVar, c0<TContinuationResult> c0Var) {
        this.f4627a = executor;
        this.f4628b = aVar;
        this.f4629c = c0Var;
    }

    @Override // c.e.a.b.g.b
    public final void a() {
        this.f4629c.f();
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        this.f4627a.execute(new o(this, hVar));
    }

    @Override // c.e.a.b.g.d
    public final void a(Exception exc) {
        this.f4629c.a(exc);
    }

    @Override // c.e.a.b.g.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f4629c.a((c0<TContinuationResult>) tcontinuationresult);
    }
}
