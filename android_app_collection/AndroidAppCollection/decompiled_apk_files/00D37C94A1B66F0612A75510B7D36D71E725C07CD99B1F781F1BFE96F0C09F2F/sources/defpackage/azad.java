package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azad  reason: default package */
/* loaded from: classes2.dex */
final class azad extends AtomicReference implements ayre, bamf {
    private static final long serialVersionUID = -312246233408980075L;
    final bame a;
    final aypx b;
    final AtomicReference c = new AtomicReference();
    final AtomicLong d = new AtomicLong();
    final AtomicReference e = new AtomicReference();

    public azad(bame bameVar, aypx aypxVar) {
        this.a = bameVar;
        this.b = aypxVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        azof.f(this.e);
        this.a.b(th);
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (!e(obj)) {
            ((bamf) this.c.get()).sp(1L);
        }
    }

    @Override // defpackage.ayre
    public final boolean e(Object obj) {
        Object obj2 = get();
        if (obj2 != null) {
            try {
                Object a = this.b.a(obj, obj2);
                ayrd.b(a, "The combiner returned a null value");
                this.a.c(a);
                return true;
            } catch (Throwable th) {
                bapv.j(th);
                si();
                this.a.b(th);
            }
        }
        return false;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        azof.j(this.c, this.d, bamfVar);
    }

    @Override // defpackage.bamf
    public final void si() {
        azof.f(this.c);
        azof.f(this.e);
    }

    @Override // defpackage.bame
    public final void sm() {
        azof.f(this.e);
        this.a.sm();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        azof.a(this.c, this.d, j);
    }
}
