package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aiy  reason: default package */
/* loaded from: classes2.dex */
public final class aiy<T> {
    Object a;
    ajc<T> b;
    public aje<Void> c = new aje<>();
    private boolean d;

    private final void d() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        aje<Void> ajeVar = this.c;
        if (ajeVar != null) {
            ajeVar.Pk(runnable, executor);
        }
    }

    public final void b(T t) {
        this.d = true;
        ajc<T> ajcVar = this.b;
        if (ajcVar == null || !ajcVar.b.b(t)) {
            return;
        }
        d();
    }

    public final void c(Throwable th) {
        this.d = true;
        ajc<T> ajcVar = this.b;
        if (ajcVar == null || !ajcVar.b(th)) {
            return;
        }
        d();
    }

    protected final void finalize() {
        aje<Void> ajeVar;
        ajc<T> ajcVar = this.b;
        if (ajcVar != null && !ajcVar.isDone()) {
            ajcVar.b(new aiz("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (ajeVar = this.c) == null) {
            return;
        }
        ajeVar.b(null);
    }
}
