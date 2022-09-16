package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azfy  reason: default package */
/* loaded from: classes2.dex */
public final class azfy extends AtomicInteger implements ayom, aypg {
    private static final long serialVersionUID = 8600231336733376951L;
    final ayom a;
    final ayqe e;
    aypg g;
    volatile boolean h;
    final aypf b = new aypf();
    final azoj d = new azoj();
    final AtomicInteger c = new AtomicInteger(1);
    final AtomicReference f = new AtomicReference();

    public azfy(ayom ayomVar, ayqe ayqeVar) {
        this.a = ayomVar;
        this.e = ayqeVar;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        this.c.decrementAndGet();
        if (azom.e(this.d, th)) {
            this.b.qr();
            g();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        try {
            ayov ayovVar = (ayov) this.e.a(obj);
            ayrd.b(ayovVar, "The mapper returned a null SingleSource");
            this.c.getAndIncrement();
            azfx azfxVar = new azfx(this);
            if (this.h || !this.b.d(azfxVar)) {
                return;
            }
            ayovVar.W(azfxVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.g.qr();
            b(th);
        }
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.h;
    }

    final void f() {
        azml azmlVar = (azml) this.f.get();
        if (azmlVar != null) {
            azmlVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        if (getAndIncrement() == 0) {
            h();
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        this.h = true;
        this.g.qr();
        this.b.qr();
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.g, aypgVar)) {
            this.g = aypgVar;
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.c.decrementAndGet();
        g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        ayom ayomVar = this.a;
        AtomicInteger atomicInteger = this.c;
        AtomicReference atomicReference = this.f;
        int i = 1;
        while (!this.h) {
            if (((Throwable) this.d.get()) == null) {
                int i2 = atomicInteger.get();
                azml azmlVar = (azml) atomicReference.get();
                Object sl = azmlVar != null ? azmlVar.sl() : null;
                if (i2 == 0) {
                    if (sl == null) {
                        Throwable d = azom.d(this.d);
                        if (d != null) {
                            ayomVar.b(d);
                            return;
                        } else {
                            ayomVar.sm();
                            return;
                        }
                    }
                } else if (sl == null) {
                    i = addAndGet(-i);
                    if (i == 0) {
                        return;
                    }
                }
                ayomVar.c(sl);
            } else {
                Throwable d2 = azom.d(this.d);
                f();
                ayomVar.b(d2);
                return;
            }
        }
        f();
    }
}
