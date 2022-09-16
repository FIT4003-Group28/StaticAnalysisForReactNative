package defpackage;

import java.util.ArrayDeque;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: azef  reason: default package */
/* loaded from: classes2.dex */
public final class azef extends AtomicInteger implements ayom, aypg, aysb {
    private static final long serialVersionUID = 8080567949447303262L;
    final ayom a;
    final ayqe b;
    final int c;
    final int d;
    public final azoj e = new azoj();
    final ArrayDeque f = new ArrayDeque();
    ayrn g;
    public aypg h;
    volatile boolean i;
    int j;
    volatile boolean k;
    aysa l;
    int m;
    public final int n;

    public azef(ayom ayomVar, ayqe ayqeVar, int i, int i2, int i3) {
        this.a = ayomVar;
        this.b = ayqeVar;
        this.c = i;
        this.d = i2;
        this.n = i3;
    }

    @Override // defpackage.ayom
    public final void b(Throwable th) {
        if (azom.e(this.e, th)) {
            this.i = true;
            f();
            return;
        }
        azqc.d(th);
    }

    @Override // defpackage.ayom
    public final void c(Object obj) {
        if (this.j == 0) {
            this.g.k(obj);
        }
        f();
    }

    @Override // defpackage.aypg
    public final boolean e() {
        return this.k;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
        r12.m = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0087, code lost:
        if (r12.k == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0089, code lost:
        r0.d();
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0090, code lost:
        if (r7 != 1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009a, code lost:
        if (((java.lang.Throwable) r12.e.get()) != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009c, code lost:
        r7 = 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x009e, code lost:
        r0.d();
        h();
        r2.b(defpackage.azom.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ae, code lost:
        r6 = r12.l;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
        if (r6 != null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00b3, code lost:
        if (r7 != 2) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00bd, code lost:
        if (((java.lang.Throwable) r12.e.get()) != null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00c0, code lost:
        r0.d();
        h();
        r2.b(defpackage.azom.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cf, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00d0, code lost:
        r6 = r12.i;
        r8 = (defpackage.aysa) r1.poll();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00d8, code lost:
        if (r6 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00da, code lost:
        if (r8 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00e4, code lost:
        if (((java.lang.Throwable) r12.e.get()) == null) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00e6, code lost:
        r0.d();
        h();
        r2.b(defpackage.azom.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00f5, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f6, code lost:
        r2.sm();
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00f9, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00fa, code lost:
        if (r8 != null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x00fd, code lost:
        r12.l = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00ff, code lost:
        r6 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
        if (r6 == null) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0102, code lost:
        r8 = r6.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0106, code lost:
        if (r12.k != false) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0108, code lost:
        r9 = r6.d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x010a, code lost:
        if (r7 != 1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0114, code lost:
        if (((java.lang.Throwable) r12.e.get()) != null) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0117, code lost:
        r0.d();
        h();
        r2.b(defpackage.azom.d(r12.e));
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0126, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0128, code lost:
        r11 = r8.sl();
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x012c, code lost:
        if (r9 == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x012e, code lost:
        if (r11 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0130, code lost:
        r12.l = null;
        r12.m--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x013a, code lost:
        if (r11 != null) goto L81;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x013d, code lost:
        r2.c(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0141, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0142, code lost:
        defpackage.bapv.j(r6);
        defpackage.azom.e(r12.e, r6);
        r12.l = null;
        r12.m--;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0154, code lost:
        r0.d();
        h();
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x015a, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x015b, code lost:
        r5 = addAndGet(-r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0160, code lost:
        if (r5 != 0) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0162, code lost:
        return;
     */
    @Override // defpackage.aysb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f() {
        /*
            Method dump skipped, instructions count: 355
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azef.f():void");
    }

    @Override // defpackage.aysb
    public final void g(aysa aysaVar) {
        aysaVar.f();
        f();
    }

    final void h() {
        aysa aysaVar = this.l;
        if (aysaVar != null) {
            ayqi.c(aysaVar);
        }
        while (true) {
            aysa aysaVar2 = (aysa) this.f.poll();
            if (aysaVar2 == null) {
                return;
            }
            ayqi.c(aysaVar2);
        }
    }

    @Override // defpackage.aypg
    public final void qr() {
        if (this.k) {
            return;
        }
        this.k = true;
        this.h.qr();
        if (getAndIncrement() != 0) {
            return;
        }
        do {
            this.g.d();
            h();
        } while (decrementAndGet() != 0);
    }

    @Override // defpackage.ayom
    public final void sj(aypg aypgVar) {
        if (ayqi.h(this.h, aypgVar)) {
            this.h = aypgVar;
            if (aypgVar instanceof ayri) {
                ayri ayriVar = (ayri) aypgVar;
                int sk = ayriVar.sk(3);
                if (sk == 1) {
                    this.j = 1;
                    this.g = ayriVar;
                    this.i = true;
                    this.a.sj(this);
                    f();
                    return;
                } else if (sk == 2) {
                    this.j = 2;
                    this.g = ayriVar;
                    this.a.sj(this);
                    return;
                }
            }
            this.g = new azml(this.d);
            this.a.sj(this);
        }
    }

    @Override // defpackage.ayom
    public final void sm() {
        this.i = true;
        f();
    }
}
