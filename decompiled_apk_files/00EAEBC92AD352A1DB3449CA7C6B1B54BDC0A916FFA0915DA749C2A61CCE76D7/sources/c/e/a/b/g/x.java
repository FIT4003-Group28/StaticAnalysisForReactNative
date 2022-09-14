package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class x<TResult, TContinuationResult> implements b, d, e<TContinuationResult>, z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4651a;

    /* renamed from: b  reason: collision with root package name */
    private final g<TResult, TContinuationResult> f4652b;

    /* renamed from: c  reason: collision with root package name */
    private final c0<TContinuationResult> f4653c;

    public x(Executor executor, g<TResult, TContinuationResult> gVar, c0<TContinuationResult> c0Var) {
        this.f4651a = executor;
        this.f4652b = gVar;
        this.f4653c = c0Var;
    }

    @Override // c.e.a.b.g.b
    public final void a() {
        this.f4653c.f();
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        this.f4651a.execute(new y(this, hVar));
    }

    @Override // c.e.a.b.g.d
    public final void a(Exception exc) {
        this.f4653c.a(exc);
    }

    @Override // c.e.a.b.g.e
    public final void a(TContinuationResult tcontinuationresult) {
        this.f4653c.a((c0<TContinuationResult>) tcontinuationresult);
    }
}
