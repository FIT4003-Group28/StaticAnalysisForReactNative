package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayxx  reason: default package */
/* loaded from: classes2.dex */
final class ayxx extends AtomicLong implements ayoa, bamf {
    private static final long serialVersionUID = -3176480756392482682L;
    final bame a;
    bamf b;
    boolean c;

    public ayxx(bame bameVar) {
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
        if (this.c) {
            return;
        }
        if (get() != 0) {
            this.a.c(obj);
            ayno.e(this, 1L);
            return;
        }
        b(new aypp("could not emit value due to lack of requests"));
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
