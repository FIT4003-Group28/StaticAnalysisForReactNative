package defpackage;

import java.util.concurrent.atomic.AtomicLong;
/* compiled from: PG */
/* renamed from: ayxr  reason: default package */
/* loaded from: classes2.dex */
final class ayxr extends aznz implements ayoa {
    private static final long serialVersionUID = -2514538129242366402L;
    final bame a;
    final ayrm b;
    bamf c;
    volatile boolean d;
    volatile boolean e;
    Throwable f;
    final AtomicLong g = new AtomicLong();
    boolean h;

    public ayxr(bame bameVar, int i) {
        this.a = bameVar;
        this.b = new azml(i);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        this.f = th;
        this.e = true;
        if (this.h) {
            this.a.b(th);
        } else {
            g();
        }
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        this.b.k(obj);
        if (this.h) {
            this.a.c(null);
        } else {
            g();
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.c, bamfVar)) {
            this.c = bamfVar;
            this.a.f(this);
            bamfVar.sp(Long.MAX_VALUE);
        }
    }

    final void g() {
        if (getAndIncrement() == 0) {
            ayrm ayrmVar = this.b;
            bame bameVar = this.a;
            int i = 1;
            while (!h(this.e, ayrmVar.j(), bameVar)) {
                long j = this.g.get();
                long j2 = 0;
                while (j2 != j) {
                    boolean z = this.e;
                    Object sl = ayrmVar.sl();
                    boolean z2 = sl == null;
                    if (h(z, z2, bameVar)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    bameVar.c(sl);
                    j2++;
                }
                if (j2 == j && h(this.e, ayrmVar.j(), bameVar)) {
                    return;
                }
                if (j2 != 0 && j != Long.MAX_VALUE) {
                    this.g.addAndGet(-j2);
                }
                i = addAndGet(-i);
                if (i == 0) {
                    return;
                }
            }
        }
    }

    final boolean h(boolean z, boolean z2, bame bameVar) {
        if (this.d) {
            this.b.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            Throwable th = this.f;
            if (th != null) {
                this.b.d();
                bameVar.b(th);
                return true;
            } else if (!z2) {
                return false;
            } else {
                bameVar.sm();
                return true;
            }
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.b.j();
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.d) {
            this.d = true;
            this.c.si();
            if (getAndIncrement() != 0) {
                return;
            }
            this.b.d();
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        if ((i & 2) != 0) {
            this.h = true;
            return 2;
        }
        return 0;
    }

    @Override // defpackage.ayrn
    public final Object sl() {
        return this.b.sl();
    }

    @Override // defpackage.bame
    public final void sm() {
        this.e = true;
        if (this.h) {
            this.a.sm();
        } else {
            g();
        }
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (this.h || !azof.h(j)) {
            return;
        }
        ayno.a(this.g, j);
        g();
    }
}
