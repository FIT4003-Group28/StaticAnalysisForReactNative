package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aywj  reason: default package */
/* loaded from: classes2.dex */
public final class aywj extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = 8600231336733376951L;
    final bame a;
    final ayqe g;
    bamf i;
    volatile boolean j;
    final int b = Integer.MAX_VALUE;
    final AtomicLong c = new AtomicLong();
    final aypf d = new aypf();
    final azoj f = new azoj();
    final AtomicInteger e = new AtomicInteger(1);
    final AtomicReference h = new AtomicReference();

    public aywj(bame bameVar, ayqe ayqeVar) {
        this.a = bameVar;
        this.g = ayqeVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.e.decrementAndGet();
        if (azom.e(this.f, th)) {
            this.d.qr();
            h();
            return;
        }
        azqc.d(th);
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [ayov, java.lang.Object] */
    @Override // defpackage.bame
    public final void c(Object obj) {
        try {
            ?? a = this.g.a(obj);
            this.e.getAndIncrement();
            aywi aywiVar = new aywi(this);
            if (this.j || !this.d.d(aywiVar)) {
                return;
            }
            a.W(aywiVar);
        } catch (Throwable th) {
            bapv.j(th);
            this.i.si();
            b(th);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final azml d() {
        azml azmlVar;
        do {
            azml azmlVar2 = (azml) this.h.get();
            if (azmlVar2 != null) {
                return azmlVar2;
            }
            azmlVar = new azml(aynx.a);
        } while (!this.h.compareAndSet(null, azmlVar));
        return azmlVar;
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.i, bamfVar)) {
            this.i = bamfVar;
            this.a.f(this);
            int i = this.b;
            if (i == Integer.MAX_VALUE) {
                bamfVar.sp(Long.MAX_VALUE);
            } else {
                bamfVar.sp(i);
            }
        }
    }

    final void g() {
        azml azmlVar = (azml) this.h.get();
        if (azmlVar != null) {
            azmlVar.d();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void h() {
        if (getAndIncrement() == 0) {
            i();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void i() {
        bame bameVar = this.a;
        AtomicInteger atomicInteger = this.e;
        AtomicReference atomicReference = this.h;
        int i = 1;
        do {
            long j = this.c.get();
            long j2 = 0;
            while (j2 != j) {
                if (!this.j) {
                    if (((Throwable) this.f.get()) == null) {
                        int i2 = atomicInteger.get();
                        azml azmlVar = (azml) atomicReference.get();
                        Object sl = azmlVar != null ? azmlVar.sl() : null;
                        if (i2 == 0) {
                            if (sl == null) {
                                Throwable d = azom.d(this.f);
                                if (d != null) {
                                    bameVar.b(d);
                                    return;
                                } else {
                                    bameVar.sm();
                                    return;
                                }
                            }
                        } else if (sl == null) {
                            break;
                        }
                        bameVar.c(sl);
                        j2++;
                    } else {
                        Throwable d2 = azom.d(this.f);
                        g();
                        bameVar.b(d2);
                        return;
                    }
                } else {
                    g();
                    return;
                }
            }
            if (j2 == j) {
                if (!this.j) {
                    if (((Throwable) this.f.get()) == null) {
                        int i3 = atomicInteger.get();
                        azml azmlVar2 = (azml) atomicReference.get();
                        boolean z = azmlVar2 == null || azmlVar2.j();
                        if (i3 == 0 && z) {
                            Throwable d3 = azom.d(this.f);
                            if (d3 != null) {
                                bameVar.b(d3);
                                return;
                            } else {
                                bameVar.sm();
                                return;
                            }
                        }
                    } else {
                        Throwable d4 = azom.d(this.f);
                        g();
                        bameVar.b(d4);
                        return;
                    }
                } else {
                    g();
                    return;
                }
            }
            if (j2 != 0) {
                ayno.e(this.c, j2);
                if (this.b != Integer.MAX_VALUE) {
                    this.i.sp(j2);
                }
            }
            i = addAndGet(-i);
        } while (i != 0);
    }

    @Override // defpackage.bamf
    public final void si() {
        this.j = true;
        this.i.si();
        this.d.qr();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.e.decrementAndGet();
        h();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.c, j);
            h();
        }
    }
}
