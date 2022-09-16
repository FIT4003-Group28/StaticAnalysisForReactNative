package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: ayzp  reason: default package */
/* loaded from: classes2.dex */
final class ayzp extends AtomicBoolean implements ayoa, bamf {
    private static final long serialVersionUID = -5636543848937116287L;
    final bame a;
    boolean c;
    bamf d;
    final long b = 1;
    long e = 1;

    public ayzp(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (!this.c) {
            this.c = true;
            this.d.si();
            this.a.b(th);
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!this.c) {
            long j = this.e;
            long j2 = (-1) + j;
            this.e = j2;
            if (j <= 0) {
                return;
            }
            this.a.c(obj);
            if (j2 != 0) {
                return;
            }
            this.d.si();
            sm();
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.d, bamfVar)) {
            this.d = bamfVar;
            if (this.b == 0) {
                bamfVar.si();
                this.c = true;
                azoc.b(this.a);
                return;
            }
            this.a.f(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.d.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.c) {
            this.c = true;
            this.a.sm();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (!azof.h(j)) {
            return;
        }
        if (get() || !compareAndSet(false, true) || j < this.b) {
            this.d.sp(j);
        } else {
            this.d.sp(Long.MAX_VALUE);
        }
    }
}
