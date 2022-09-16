package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: ayzh  reason: default package */
/* loaded from: classes2.dex */
final class ayzh extends AtomicInteger implements ayre, bamf {
    private static final long serialVersionUID = -6270983465606289181L;
    final bame a;
    final AtomicReference b = new AtomicReference();
    final AtomicLong c = new AtomicLong();
    final ayzg d = new ayzg(this);
    final azoj e = new azoj();
    volatile boolean f;

    public ayzh(bame bameVar) {
        this.a = bameVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azof.f(this.d);
        axzl.h(this.a, th, this, this.e);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!e(obj)) {
            ((bamf) this.b.get()).sp(1L);
        }
    }

    @Override // defpackage.ayre
    public final boolean e(Object obj) {
        if (this.f) {
            axzl.i(this.a, obj, this, this.e);
            return true;
        }
        return false;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.j(this.b, this.c, bamfVar);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this.b);
        azof.f(this.d);
    }

    @Override // defpackage.bame
    public final void sm() {
        azof.f(this.d);
        axzl.f(this.a, this, this.e);
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.a(this.b, this.c, j);
    }
}
