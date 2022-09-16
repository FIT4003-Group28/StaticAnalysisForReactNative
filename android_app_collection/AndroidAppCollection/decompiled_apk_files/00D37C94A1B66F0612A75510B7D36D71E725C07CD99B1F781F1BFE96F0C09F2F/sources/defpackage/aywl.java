package defpackage;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: aywl  reason: default package */
/* loaded from: classes2.dex */
final class aywl extends aznz implements ayoa {
    private static final long serialVersionUID = -3096000382929934955L;
    final bame a;
    final ayqe b;
    final int c;
    final int d;
    bamf f;
    ayrn g;
    volatile boolean h;
    volatile boolean i;
    Iterator k;
    int l;
    int m;
    final AtomicReference j = new AtomicReference();
    final AtomicLong e = new AtomicLong();

    public aywl(bame bameVar, ayqe ayqeVar, int i) {
        this.a = bameVar;
        this.b = ayqeVar;
        this.c = i;
        this.d = i - (i >> 2);
    }

    @Override // defpackage.bame
    public final void b(Throwable th) {
        if (this.h || !azom.e(this.j, th)) {
            azqc.d(th);
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.bame
    public final void c(Object obj) {
        if (this.h) {
            return;
        }
        if (this.m != 0 || this.g.k(obj)) {
            h();
        } else {
            b(new aypp("Queue is full?!"));
        }
    }

    @Override // defpackage.ayrn
    public final void d() {
        this.k = null;
        this.g.d();
    }

    @Override // defpackage.ayoa, defpackage.bame
    public final void f(bamf bamfVar) {
        if (azof.i(this.f, bamfVar)) {
            this.f = bamfVar;
            if (bamfVar instanceof ayrk) {
                ayrk ayrkVar = (ayrk) bamfVar;
                int sk = ayrkVar.sk(3);
                if (sk == 1) {
                    this.m = 1;
                    this.g = ayrkVar;
                    this.h = true;
                    this.a.f(this);
                    return;
                } else if (sk == 2) {
                    this.m = 2;
                    this.g = ayrkVar;
                    this.a.f(this);
                    bamfVar.sp(this.c);
                    return;
                }
            }
            this.g = new azmk(this.c);
            this.a.f(this);
            bamfVar.sp(this.c);
        }
    }

    final void g(boolean z) {
        if (z) {
            int i = this.l + 1;
            if (i != this.d) {
                this.l = i;
                return;
            }
            this.l = 0;
            this.f.sp(i);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
        if (r13 != r9) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f7, code lost:
        r4 = r18.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fd, code lost:
        if (r3.j() == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00ff, code lost:
        if (r6 != null) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0101, code lost:
        r15 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0103, code lost:
        r15 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0108, code lost:
        if (i(r4, r15, r2, r3) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x010b, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x010e, code lost:
        if (r13 == 0) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0117, code lost:
        if (r9 == Long.MAX_VALUE) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0119, code lost:
        r18.e.addAndGet(-r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x011f, code lost:
        if (r6 == null) goto L57;
     */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object, java.lang.Iterable] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    final void h() {
        /*
            Method dump skipped, instructions count: 300
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aywl.h():void");
    }

    final boolean i(boolean z, boolean z2, bame bameVar, ayrn ayrnVar) {
        if (this.i) {
            this.k = null;
            ayrnVar.d();
            return true;
        } else if (!z) {
            return false;
        } else {
            if (((Throwable) this.j.get()) == null) {
                if (!z2) {
                    return false;
                }
                bameVar.sm();
                return true;
            }
            Throwable d = azom.d(this.j);
            this.k = null;
            ayrnVar.d();
            bameVar.b(d);
            return true;
        }
    }

    @Override // defpackage.ayrn
    public final boolean j() {
        return this.k == null && this.g.j();
    }

    @Override // defpackage.bamf
    public final void si() {
        if (!this.i) {
            this.i = true;
            this.f.si();
            if (getAndIncrement() != 0) {
                return;
            }
            this.g.d();
        }
    }

    @Override // defpackage.ayrj
    public final int sk(int i) {
        return ((i & 1) == 0 || this.m != 1) ? 0 : 1;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.lang.Iterable] */
    @Override // defpackage.ayrn
    public final Object sl() {
        Iterator it = this.k;
        while (true) {
            if (it == null) {
                Object sl = this.g.sl();
                if (sl != null) {
                    it = this.b.a(sl).iterator();
                    if (it.hasNext()) {
                        this.k = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        ayrd.b(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.k = null;
        }
        return next;
    }

    @Override // defpackage.bame
    public final void sm() {
        if (this.h) {
            return;
        }
        this.h = true;
        h();
    }

    @Override // defpackage.bamf
    public final void sp(long j) {
        if (azof.h(j)) {
            ayno.a(this.e, j);
            h();
        }
    }
}
