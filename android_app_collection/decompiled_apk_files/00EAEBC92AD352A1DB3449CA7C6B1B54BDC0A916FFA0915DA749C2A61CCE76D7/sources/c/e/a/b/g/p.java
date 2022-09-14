package c.e.a.b.g;

import java.util.concurrent.Executor;
/* loaded from: classes.dex */
final class p<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4632a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4633b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private b f4634c;

    public p(Executor executor, b bVar) {
        this.f4632a = executor;
        this.f4634c = bVar;
    }

    @Override // c.e.a.b.g.z
    public final void a(h hVar) {
        if (hVar.c()) {
            synchronized (this.f4633b) {
                if (this.f4634c == null) {
                    return;
                }
                this.f4632a.execute(new q(this));
            }
        }
    }
}
