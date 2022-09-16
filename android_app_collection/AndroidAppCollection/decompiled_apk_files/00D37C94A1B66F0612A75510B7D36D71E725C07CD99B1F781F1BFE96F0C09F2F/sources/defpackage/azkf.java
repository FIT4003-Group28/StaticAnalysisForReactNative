package defpackage;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: azkf  reason: default package */
/* loaded from: classes2.dex */
abstract class azkf extends AtomicInteger implements Runnable, ayoa, bamf {
    private static final long serialVersionUID = 9222303586456402150L;
    final int a;
    final int b;
    final azmk c;
    final ayoq d;
    bamf e;
    volatile boolean f;
    Throwable g;
    final AtomicLong h = new AtomicLong();
    volatile boolean i;
    int j;

    public azkf(int i, azmk azmkVar, ayoq ayoqVar) {
        this.a = i;
        this.c = azmkVar;
        this.b = i - (i >> 2);
        this.d = ayoqVar;
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.f) {
            azqc.d(th);
            return;
        }
        this.g = th;
        this.f = true;
        d();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.f) {
            return;
        }
        if (!this.c.k(obj)) {
            this.e.si();
            b(new aypp("Queue is full?!"));
            return;
        }
        d();
    }

    final void d() {
        if (getAndIncrement() == 0) {
            this.d.a(this);
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.i) {
            this.i = true;
            this.e.si();
            this.d.qr();
            if (getAndIncrement() != 0) {
                return;
            }
            this.c.d();
        }
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.f) {
            return;
        }
        this.f = true;
        d();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.h, j);
            d();
        }
    }
}
