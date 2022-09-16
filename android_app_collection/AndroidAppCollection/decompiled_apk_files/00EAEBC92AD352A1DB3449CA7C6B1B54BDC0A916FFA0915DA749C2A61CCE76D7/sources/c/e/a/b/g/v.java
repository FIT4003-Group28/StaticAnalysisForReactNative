package c.e.a.b.g;

import java.util.concurrent.Executor;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class v<TResult> implements z<TResult> {

    /* renamed from: a  reason: collision with root package name */
    private final Executor f4646a;

    /* renamed from: b  reason: collision with root package name */
    private final Object f4647b = new Object();

    /* renamed from: c  reason: collision with root package name */
    private e<? super TResult> f4648c;

    public v(Executor executor, e<? super TResult> eVar) {
        this.f4646a = executor;
        this.f4648c = eVar;
    }

    @Override // c.e.a.b.g.z
    public final void a(h<TResult> hVar) {
        if (hVar.e()) {
            synchronized (this.f4647b) {
                if (this.f4648c == null) {
                    return;
                }
                this.f4646a.execute(new w(this, hVar));
            }
        }
    }
}
