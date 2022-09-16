package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayxn  reason: default package */
/* loaded from: classes2.dex */
abstract class ayxn extends aznz implements Runnable, ayoa {
    private static final long serialVersionUID = -8241002408341274697L;
    final ayoq a;
    final int b;
    final int c;
    final AtomicLong d = new AtomicLong();
    bamf e;
    ayrn f;
    volatile boolean g;
    volatile boolean h;
    Throwable i;
    int j;
    long k;
    boolean l;

    public ayxn(ayoq ayoqVar, int i) {
        this.a = ayoqVar;
        this.b = i;
        this.c = i - (i >> 2);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h) {
            azqc.d(th);
            return;
        }
        this.i = th;
        this.h = true;
        l();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        if (this.j == 2) {
            l();
            return;
        }
        if (!this.f.k(obj)) {
            this.e.si();
            this.i = new aypp("Queue is full?!");
            this.h = true;
        }
        l();
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.f.d();
    }

    public abstract void g();

    public abstract void h();

    public abstract void i();

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.f.j();
    }

    final void l() {
        if (getAndIncrement() != 0) {
            return;
        }
        this.a.a(this);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m(boolean z, boolean z2, bame bameVar) {
        if (this.g) {
            d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.i;
            if (th != null) {
                this.g = true;
                d();
                bameVar.b(th);
                this.a.qr();
                return true;
            } else if (!z2) {
                return false;
            } else {
                this.g = true;
                bameVar.sm();
                this.a.qr();
                return true;
            }
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.l) {
            h();
        } else if (this.j == 1) {
            i();
        } else {
            g();
        }
    }

    @Override // defpackage.bamf
    public final void si() {
        if (this.g) {
            return;
        }
        this.g = true;
        this.e.si();
        this.a.qr();
        if (getAndIncrement() != 0) {
            return;
        }
        this.f.d();
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            this.l = true;
            return 2;
        }
        return 0;
    }

    @Override // defpackage.bame
    public final void sm() {
        if (!this.h) {
            this.h = true;
            l();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.d, j);
            l();
        }
    }
}
