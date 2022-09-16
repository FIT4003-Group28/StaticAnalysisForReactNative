package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azny  reason: default package */
/* loaded from: classes2.dex */
public final class azny extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = -4945028590049415624L;
    final bame a;
    final azoj b = new azoj();
    final AtomicLong c = new AtomicLong();
    final AtomicReference d = new AtomicReference();
    final AtomicBoolean e = new AtomicBoolean();
    volatile boolean f;

    public azny(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.f = true;
        axzl.h(this.a, th, this, this.b);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        axzl.i(this.a, obj, this, this.b);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (this.e.compareAndSet(false, true)) {
            this.a.f(this);
            azof.j(this.d, this.c, bamfVar);
            return;
        }
        bamfVar.si();
        si();
        b(new IllegalStateException("§2.12 violated: onSubscribe must be called at most once"));
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.f) {
            azof.f(this.d);
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        this.f = true;
        axzl.f(this.a, this, this.b);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (j <= 0) {
            si();
            StringBuilder sb = new StringBuilder(79);
            sb.append("§3.9 violated: positive request amount required but it was ");
            sb.append(j);
            b(new IllegalArgumentException(sb.toString()));
            return;
        }
        azof.a(this.d, this.c, j);
    }
}
