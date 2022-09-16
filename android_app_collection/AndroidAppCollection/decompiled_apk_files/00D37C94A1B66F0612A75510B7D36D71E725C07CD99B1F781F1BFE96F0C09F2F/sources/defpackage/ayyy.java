package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayyy  reason: default package */
/* loaded from: classes2.dex */
final class ayyy extends AtomicInteger implements ayoa, bamf {
    private static final long serialVersionUID = -1776795561228106469L;
    final bame a;
    final aypx b;
    final ayrm c;
    final AtomicLong d;
    final int e;
    final int f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    bamf j;
    Object k;
    int l;

    public ayyy(bame bameVar, aypx aypxVar, Object obj, int i) {
        this.a = bameVar;
        this.b = aypxVar;
        this.k = obj;
        this.e = i;
        this.f = i - (i >> 2);
        azmk azmkVar = new azmk(i);
        this.c = azmkVar;
        azmkVar.k(obj);
        this.d = new AtomicLong();
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.i = th;
        this.h = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        try {
            Object a = this.b.a(this.k, obj);
            ayrd.b(a, "The accumulator returned a null value");
            this.k = a;
            this.c.k(a);
            d();
        } catch (Throwable th) {
            bapv.j(th);
            this.j.si();
            b(th);
        }
    }

    final void d() {
        Throwable th;
        if (getAndIncrement() != 0) {
            return;
        }
        bame bameVar = this.a;
        ayrm ayrmVar = this.c;
        int i = this.f;
        int i2 = this.l;
        int i3 = 1;
        do {
            long j = this.d.get();
            long j2 = 0;
            while (j2 != j) {
                if (this.g) {
                    ayrmVar.d();
                    return;
                }
                boolean z = this.h;
                if (!z || (th = this.i) == null) {
                    Object sl = ayrmVar.sl();
                    if (!z) {
                        if (sl == null) {
                            break;
                        }
                    } else if (sl == null) {
                        bameVar.sm();
                        return;
                    }
                    bameVar.c(sl);
                    j2++;
                    i2++;
                    if (i2 == i) {
                        this.j.sp(i);
                        i2 = 0;
                    }
                } else {
                    ayrmVar.d();
                    bameVar.b(th);
                    return;
                }
            }
            if (j2 == j && this.h) {
                Throwable th2 = this.i;
                if (th2 == null) {
                    if (ayrmVar.j()) {
                        bameVar.sm();
                        return;
                    }
                } else {
                    ayrmVar.d();
                    bameVar.b(th2);
                    return;
                }
            }
            if (j2 != 0) {
                ayno.e(this.d, j2);
            }
            this.l = i2;
            i3 = addAndGet(-i3);
        } while (i3 != 0);
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.j, bamfVar)) {
            this.j = bamfVar;
            this.a.f(this);
            bamfVar.sp(this.e - 1);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        this.g = true;
        this.j.si();
        if (getAndIncrement() == 0) {
            this.c.d();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.h) {
            return;
        }
        this.h = true;
        d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.d, j);
            d();
        }
    }
}
