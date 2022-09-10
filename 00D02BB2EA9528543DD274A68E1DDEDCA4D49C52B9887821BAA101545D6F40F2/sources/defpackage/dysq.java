package defpackage;

import java.io.Closeable;
/* compiled from: PG */
/* renamed from: dysq  reason: default package */
/* loaded from: classes6.dex */
public final class dysq implements Closeable, dymg {
    public dysn a;
    public int b;
    public dyfs c;
    public dyox d;
    private final dyvi g;
    private final dyvr h;
    private boolean j;
    private dymb k;
    private long l;
    private int o;
    private int q = 1;
    private int i = 5;
    public dymb e = new dymb();
    private boolean m = false;
    private int n = -1;
    private boolean p = false;
    public volatile boolean f = false;

    public dysq(dysn dysnVar, dyfs dyfsVar, int i, dyvi dyviVar, dyvr dyvrVar) {
        this.a = dysnVar;
        this.c = dyfsVar;
        this.b = i;
        dbsk.t(dyviVar, "statsTraceCtx");
        this.g = dyviVar;
        this.h = dyvrVar;
    }

    private final boolean g() {
        return this.e.a == 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0124, code lost:
        throw defpackage.dyjb.j.g(java.lang.String.format("gRPC message exceeds maximum size %d: %d", java.lang.Integer.valueOf(r7.b), java.lang.Integer.valueOf(r7.i))).j();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0135, code lost:
        if (r7.p == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x013b, code lost:
        if (g() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x013d, code lost:
        close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0142, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void h() {
        /*
            Method dump skipped, instructions count: 329
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dysq.h():void");
    }

    private final boolean i() {
        int i = 0;
        try {
            if (this.k == null) {
                this.k = new dymb();
            }
            int i2 = 0;
            while (true) {
                try {
                    int i3 = this.i - this.k.a;
                    if (i3 <= 0) {
                        if (i2 <= 0) {
                            return true;
                        }
                        this.a.e(i2);
                        if (this.q != 2) {
                            return true;
                        }
                        this.g.e(i2);
                        this.o += i2;
                        return true;
                    }
                    int i4 = this.e.a;
                    if (i4 == 0) {
                        if (i2 > 0) {
                            this.a.e(i2);
                            if (this.q == 2) {
                                this.g.e(i2);
                                this.o += i2;
                            }
                        }
                        return false;
                    }
                    int min = Math.min(i3, i4);
                    i2 += min;
                    this.k.b(this.e.g(min));
                } catch (Throwable th) {
                    int i5 = i2;
                    th = th;
                    i = i5;
                    if (i > 0) {
                        this.a.e(i);
                        if (this.q == 2) {
                            this.g.e(i);
                            this.o += i;
                        }
                    }
                    throw th;
                }
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // defpackage.dymg
    public final void a(int i) {
        this.b = i;
    }

    @Override // defpackage.dymg
    public final void b(dyfs dyfsVar) {
        dbsk.m(true, "Already set full stream decompressor");
        this.c = dyfsVar;
    }

    @Override // defpackage.dymg
    public final void c(int i) {
        dbsk.b(true, "numMessages must be > 0");
        if (f()) {
            return;
        }
        this.l += i;
        h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable, defpackage.dymg
    public final void close() {
        if (f()) {
            return;
        }
        dymb dymbVar = this.k;
        boolean z = false;
        if (dymbVar != null && dymbVar.a > 0) {
            z = true;
        }
        try {
            dymb dymbVar2 = this.e;
            if (dymbVar2 != null) {
                dymbVar2.close();
            }
            dymb dymbVar3 = this.k;
            if (dymbVar3 != null) {
                dymbVar3.close();
            }
            this.d = null;
            this.e = null;
            this.k = null;
            this.a.g(z);
        } catch (Throwable th) {
            this.d = null;
            this.e = null;
            this.k = null;
            throw th;
        }
    }

    @Override // defpackage.dymg
    public final void d(dytj dytjVar) {
        boolean z;
        try {
            if (!f() && !this.p) {
                this.e.b(dytjVar);
                try {
                    h();
                    return;
                } catch (Throwable th) {
                    th = th;
                    z = false;
                    if (z) {
                        dytjVar.close();
                    }
                    throw th;
                }
            }
            dytjVar.close();
        } catch (Throwable th2) {
            th = th2;
            z = true;
        }
    }

    @Override // defpackage.dymg
    public final void e() {
        if (f()) {
            return;
        }
        if (g()) {
            close();
        } else {
            this.p = true;
        }
    }

    public final boolean f() {
        return this.e == null;
    }
}
