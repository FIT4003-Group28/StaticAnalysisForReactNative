package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class r<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4636a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4637b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private c<TResult> f4638c;

    public r(Executor executor, c<TResult> cVar) {
        this.f4636a = executor;
        this.f4638c = cVar;
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        synchronized (this.f4637b) {
            if (this.f4638c == null) {
                return;
            }
            this.f4636a.execute(new s(this, hVar));
        }
    }
}
