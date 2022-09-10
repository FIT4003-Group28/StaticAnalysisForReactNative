package defpackage;

import android.app.Application;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: xkl  reason: default package */
/* loaded from: classes7.dex */
public class xkl implements bzgh {
    private static final dcqe j = dcqe.c("xkl");
    public final Application a;
    public final byyp c;
    public final Executor f;
    @dzsi
    public xki g;
    public final vnk h;
    private final vns k;
    private final vwo m;
    public final bzgj b = new bzgj();
    private bzgf l = null;
    private boolean n = false;
    public boolean i = true;
    public final bzge d = new bzge();
    public final bzge e = new bzge();

    public xkl(Application application, byyp byypVar, vns vnsVar, Executor executor, vwo vwoVar, vnk vnkVar) {
        this.a = application;
        this.c = byypVar;
        this.k = vnsVar;
        this.m = vwoVar;
        this.f = executor;
        this.h = vnkVar;
    }

    public final boolean a() {
        return !this.b.c();
    }

    public final void b(boolean z) {
        e(z);
        vnk vnkVar = this.h;
        if (vnkVar != null) {
            vnkVar.bb(z);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0056, code lost:
        if (r4.a(r3) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c() {
        /*
            r7 = this;
            vnk r0 = r7.h
            vnu r0 = r0.l()
            vwn r0 = r0.d()
            android.app.Application r1 = r7.a
            boolean r2 = r0.t()
            r3 = 0
            if (r2 != 0) goto L14
            goto L22
        L14:
            amte r2 = r0.p()
            if (r2 == 0) goto L22
            int r0 = r0.e()
            amub r3 = r2.b(r0, r1)
        L22:
            r0 = 1
            r1 = 0
            if (r3 == 0) goto L5a
            vnk r2 = r7.h
            qbs r2 = r2.t()
            qbs r4 = defpackage.qbs.TRANSIT_TRIP_DETAILS
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L3c
            dqvj r2 = r3.h
            dqvj r4 = defpackage.dqvj.TRANSIT
            if (r2 != r4) goto L3c
            r2 = 1
            goto L3d
        L3c:
            r2 = 0
        L3d:
            byyp r4 = r7.c
            bzdk r4 = r4.c()
            bzdj r5 = r4.h()
            bzdj r6 = defpackage.bzdj.UNINITIALIZED
            if (r5 == r6) goto L59
            bzdj r6 = defpackage.bzdj.NOT_STARTED
            if (r5 != r6) goto L50
            goto L59
        L50:
            if (r2 == 0) goto L5a
            boolean r2 = r4.a(r3)
            if (r2 == 0) goto L5a
            goto L5b
        L59:
            return
        L5a:
            r0 = 0
        L5b:
            r7.e(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkl.c():void");
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.d.b(bzgfVar, bzgjVar, executor);
    }

    public final void e(boolean z) {
        if (this.n == z) {
            return;
        }
        if (this.h == null) {
            bvoo.h("Don't have fragment oneDirectionState.", new Object[0]);
        }
        this.n = z;
        if (z) {
            f();
            return;
        }
        this.b.b();
        this.d.a();
    }

    public final void f() {
        if (!this.b.c() || !this.n || this.i) {
            return;
        }
        if (this.l == null) {
            this.l = new bzgf(this) { // from class: xkj
                private final xkl a;

                {
                    this.a = this;
                }

                @Override // defpackage.bzgf
                public final void a() {
                    this.a.g();
                }
            };
        }
        this.c.d(this.l, this.b, this.f);
        g();
        this.d.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
        if (r1.a().a.G(r1.b()).equals(r4.a.a.G(r4.b)) == false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xkl.g():void");
    }
}
