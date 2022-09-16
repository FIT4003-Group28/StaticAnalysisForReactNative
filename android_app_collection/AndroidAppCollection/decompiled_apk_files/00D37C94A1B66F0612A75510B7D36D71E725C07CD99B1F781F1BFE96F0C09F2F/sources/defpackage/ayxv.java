package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayxv  reason: default package */
/* loaded from: classes2.dex */
final class ayxv extends AtomicLong implements ayoa, bamf {
    private static final long serialVersionUID = -6246093802440953054L;
    final bame a;
    bamf b;
    boolean c;

    public ayxv(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.c) {
            azqc.d(th);
            return;
        }
        this.c = true;
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!this.c && get() != 0) {
            this.a.c(obj);
            ayno.e(this, 1L);
        }
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.b, bamfVar)) {
            this.b = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.b.si();
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.c) {
            return;
        }
        this.c = true;
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this, j);
        }
    }
}
