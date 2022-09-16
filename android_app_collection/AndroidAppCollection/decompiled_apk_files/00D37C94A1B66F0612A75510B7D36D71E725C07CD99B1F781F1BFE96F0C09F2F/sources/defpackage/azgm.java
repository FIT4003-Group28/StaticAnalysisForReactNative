package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: azgm  reason: default package */
/* loaded from: classes2.dex */
public final class azgm extends AtomicInteger implements aypg, ayok {
    private static final long serialVersionUID = -3852313036005250360L;
    final Object a;
    public final azml b;
    final azgl c;
    public volatile boolean d;
    public Throwable e;
    final AtomicBoolean f = new AtomicBoolean();
    final AtomicBoolean g = new AtomicBoolean();
    final AtomicReference h = new AtomicReference();

    public azgm(int i, azgl azglVar, Object obj) {
        this.b = new azml(i);
        this.c = azglVar;
        this.a = obj;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        azml azmlVar = this.b;
        ayom ayomVar = (ayom) this.h.get();
        int i = 1;
        while (true) {
            if (ayomVar != null) {
                while (true) {
                    boolean z = this.d;
                    Object sl = azmlVar.sl();
                    if (this.f.get()) {
                        this.b.d();
                        this.c.f(this.a);
                        this.h.lazySet(null);
                        return;
                    }
                    if (z) {
                        Throwable th = this.e;
                        if (th != null) {
                            this.b.d();
                            this.h.lazySet(null);
                            ayomVar.b(th);
                            return;
                        } else if (sl == null) {
                            this.h.lazySet(null);
                            ayomVar.sm();
                            return;
                        }
                    }
                    if (sl == null) {
                        break;
                    }
                    ayomVar.c(sl);
                }
            }
            i = addAndGet(-i);
            if (i == 0) {
                return;
            }
            if (ayomVar == null) {
                ayomVar = (ayom) this.h.get();
            }
        }
    }

    @Override // defpackage.ayok
    public final void az(ayom ayomVar) {
        if (this.g.compareAndSet(false, true)) {
            ayomVar.sj(this);
            this.h.lazySet(ayomVar);
            if (this.f.get()) {
                this.h.lazySet(null);
                return;
            } else {
                a();
                return;
            }
        }
        ayqj.h(new IllegalStateException("Only one Observer allowed!"), ayomVar);
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.f.get();
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (!this.f.compareAndSet(false, true) || getAndIncrement() != 0) {
            return;
        }
        this.h.lazySet(null);
        this.c.f(this.a);
    }
}
