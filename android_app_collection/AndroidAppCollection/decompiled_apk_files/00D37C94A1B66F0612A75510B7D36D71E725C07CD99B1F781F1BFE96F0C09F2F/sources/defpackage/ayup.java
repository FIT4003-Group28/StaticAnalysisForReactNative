package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayup  reason: default package */
/* loaded from: classes2.dex */
public abstract class ayup extends AtomicLong implements ayny, bamf {
    private static final long serialVersionUID = 7326289992464377023L;
    final bame a;
    final ayqm b = new ayqm();

    public ayup(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.ayny
    public final ayny b() {
        return new ayuw(this);
    }

    @Override // defpackage.ayny
    public final void c(ayqa ayqaVar) {
        d(new ayqg(ayqaVar));
    }

    @Override // defpackage.ayny
    public final void d(aypg aypgVar) {
        ayqi.f(this.b, aypgVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void f() {
        if (l()) {
            return;
        }
        try {
            this.a.sm();
        } finally {
            ayqi.c(this.b);
        }
    }

    public void g() {
        f();
    }

    public final void h(Throwable th) {
        if (!so(th)) {
            azqc.d(th);
        }
    }

    public void i() {
    }

    public void j() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean k(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        if (l()) {
            return false;
        }
        try {
            this.a.b(th);
            ayqi.c(this.b);
            return true;
        } catch (Throwable th2) {
            ayqi.c(this.b);
            throw th2;
        }
    }

    public final boolean l() {
        return this.b.e();
    }

    @Override // defpackage.bamf
    public final void si() {
        ayqi.c(this.b);
        j();
    }

    @Override // defpackage.ayny
    public boolean so(Throwable th) {
        return k(th);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this, j);
            i();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return String.format("%s{%s}", getClass().getSimpleName(), super.toString());
    }
}
