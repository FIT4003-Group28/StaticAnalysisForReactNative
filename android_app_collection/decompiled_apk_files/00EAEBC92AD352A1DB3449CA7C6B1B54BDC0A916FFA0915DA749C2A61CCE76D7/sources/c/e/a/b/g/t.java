package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class t<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4641a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4642b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private d f4643c;

    public t(Executor executor, d dVar) {
        this.f4641a = executor;
        this.f4643c = dVar;
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        if (hVar.e() || hVar.c()) {
            return;
        }
        synchronized (this.f4642b) {
            if (this.f4643c == null) {
                return;
            }
            this.f4641a.execute(new u(this, hVar));
        }
    }
}
