package defpackage;

import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agp  reason: default package */
/* loaded from: classes.dex */
public final class agp {
    public Object a;
    public agt b;
    public agu c = new agu();
    private boolean d;

    private final void e() {
        this.a = null;
        this.b = null;
        this.c = null;
    }

    public final void a(Runnable runnable, Executor executor) {
        agu aguVar = this.c;
        if (aguVar != null) {
            aguVar.qY(runnable, executor);
        }
    }

    public final void b() {
        this.d = true;
        agt agtVar = this.b;
        if (agtVar == null || !agtVar.b.cancel(true)) {
            return;
        }
        e();
    }

    public final void c(Object obj) {
        this.d = true;
        agt agtVar = this.b;
        if (agtVar == null || !agtVar.b.f(obj)) {
            return;
        }
        e();
    }

    public final void d(Throwable th) {
        this.d = true;
        agt agtVar = this.b;
        if (agtVar == null || !agtVar.b(th)) {
            return;
        }
        e();
    }

    protected final void finalize() {
        agu aguVar;
        agt agtVar = this.b;
        if (agtVar != null && !agtVar.isDone()) {
            agtVar.b(new agq("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.a));
        }
        if (this.d || (aguVar = this.c) == null) {
            return;
        }
        aguVar.f(null);
    }
}
