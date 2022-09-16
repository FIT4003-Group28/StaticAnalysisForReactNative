package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
/* compiled from: PG */
/* renamed from: ahym  reason: default package */
/* loaded from: classes.dex */
public final class ahym {
    public final Context a;
    public final ahyh b;
    public final long c;
    public final boolean d;
    public View e;
    public int f;
    public ahyg g;
    public yye h;
    private final long i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;
    private int o;
    private final zas p;
    private Handler q;
    private final StringBuilder n = new StringBuilder(140);
    private final Runnable r = new Runnable() { // from class: ahyi
        /* JADX WARN: Code restructure failed: missing block: B:31:0x006f, code lost:
            if (r4 != false) goto L25;
         */
        /* JADX WARN: Type inference failed for: r2v1, types: [ahyl, ahyh] */
        /* JADX WARN: Type inference failed for: r6v1, types: [ahyl, ahyh] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                r11 = this;
                ahym r0 = defpackage.ahym.this
                r1 = 32
                ahyh r2 = r0.b     // Catch: java.lang.Throwable -> L90
                boolean r2 = r2.mZ()     // Catch: java.lang.Throwable -> L90
                boolean r3 = r0.j()     // Catch: java.lang.Throwable -> L90
                if (r3 != 0) goto L17
                if (r2 == 0) goto L13
                goto L17
            L13:
                r0.a(r1)
                return
            L17:
                r0.c()     // Catch: java.lang.Throwable -> L90
                boolean r3 = r0.d     // Catch: java.lang.Throwable -> L90
                if (r3 == 0) goto L31
                boolean r3 = r0.m()     // Catch: java.lang.Throwable -> L90
                if (r3 != 0) goto L31
                boolean r2 = r0.j()     // Catch: java.lang.Throwable -> L90
                if (r2 == 0) goto L2d
                r0.f()     // Catch: java.lang.Throwable -> L90
            L2d:
                r0.a(r1)
                return
            L31:
                r3 = 4
                boolean r4 = r0.h(r3)     // Catch: java.lang.Throwable -> L90
                r5 = 2
                boolean r6 = r0.h(r5)     // Catch: java.lang.Throwable -> L90
                r7 = 16
                r8 = 8
                if (r2 == 0) goto L53
                if (r6 == 0) goto L6d
                ahyh r6 = r0.b     // Catch: java.lang.Throwable -> L90
                android.content.Context r9 = r0.a     // Catch: java.lang.Throwable -> L90
                android.view.View r10 = r0.e     // Catch: java.lang.Throwable -> L90
                r6.d(r9, r10)     // Catch: java.lang.Throwable -> L90
                r0.a(r5)     // Catch: java.lang.Throwable -> L90
                r5 = 0
                r0.f = r5     // Catch: java.lang.Throwable -> L90
                goto L6d
            L53:
                boolean r5 = r0.k()     // Catch: java.lang.Throwable -> L90
                if (r5 == 0) goto L6d
                r0.a(r8)     // Catch: java.lang.Throwable -> L90
                long r5 = r0.c     // Catch: java.lang.Throwable -> L90
                r9 = 0
                int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
                if (r2 <= 0) goto L69
                if (r4 != 0) goto L69
                r0.g(r7)     // Catch: java.lang.Throwable -> L90
            L69:
                r0.g(r3)     // Catch: java.lang.Throwable -> L90
                goto L71
            L6d:
                if (r2 == 0) goto L8c
                if (r4 == 0) goto L8c
            L71:
                boolean r2 = r0.j()     // Catch: java.lang.Throwable -> L90
                if (r2 == 0) goto L89
                boolean r2 = r0.h(r8)     // Catch: java.lang.Throwable -> L90
                boolean r4 = r0.h(r7)     // Catch: java.lang.Throwable -> L90
                yye r5 = r0.h     // Catch: java.lang.Throwable -> L90
                r5.a(r2, r4)     // Catch: java.lang.Throwable -> L90
                r2 = 28
                r0.a(r2)     // Catch: java.lang.Throwable -> L90
            L89:
                r0.a(r3)     // Catch: java.lang.Throwable -> L90
            L8c:
                r0.a(r1)
                return
            L90:
                r2 = move-exception
                r0.a(r1)
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ahyi.run():void");
        }
    };
    private final ViewTreeObserver.OnGlobalLayoutListener s = new ahyj(this);

    public ahym(Context context, ahyh ahyhVar, zas zasVar, int i, int i2, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.a = context;
        this.b = ahyhVar;
        this.p = zasVar;
        this.c = i;
        this.i = i2;
        this.j = z;
        this.k = z2;
        this.l = z3;
        this.d = z4;
        this.m = z5;
    }

    private final void n(boolean z) {
        if (!z) {
            this.r.run();
            return;
        }
        if (j()) {
            lj.H(this.e, this.r);
        } else {
            if (this.q == null) {
                this.q = new Handler(Looper.getMainLooper());
            }
            this.q.post(this.r);
        }
        g(32);
    }

    public final void a(int i) {
        this.o = (i ^ (-1)) & this.o;
    }

    public final void b() {
        if (!h(4)) {
            return;
        }
        a(28);
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [ahyl, ahyh] */
    public final void c() {
        if (j()) {
            return;
        }
        g(1);
        View a = this.b.a(this.a);
        a.getClass();
        this.e = a;
        if (this.d) {
            f();
        }
        yye yyeVar = new yye(this.e);
        this.h = yyeVar;
        yyeVar.e = this.i;
        yyeVar.d = this.c;
        yyeVar.a(false, false);
        zas zasVar = this.p;
        if (zasVar != null) {
            this.h.h(zasVar);
        }
        ahyg ahygVar = this.g;
        if (ahygVar == null) {
            return;
        }
        ahygVar.d(this.b, this.e);
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [ahyl, ahyh] */
    public final void d() {
        boolean z;
        if (h(32)) {
            return;
        }
        boolean z2 = true;
        if (h(4)) {
            z2 = h(8) ? false : false;
            n(z2);
            return;
        }
        if (this.b.mZ() || !k()) {
            z2 = false;
        }
        if (!h(2)) {
            if (!z2) {
                return;
            }
        } else if (!z2) {
            z = this.l;
            n(z);
        }
        z = this.j;
        n(z);
    }

    public final void e(int i) {
        Integer.toBinaryString(i);
        g(2);
        this.f = i | this.f;
        d();
    }

    public final void f() {
        if (!h(64)) {
            this.e.getViewTreeObserver().addOnGlobalLayoutListener(this.s);
            g(64);
        }
    }

    public final void g(int i) {
        this.o = i | this.o;
    }

    public final boolean h(int i) {
        return (this.o & i) == i;
    }

    public final boolean i() {
        yye yyeVar = this.h;
        return yyeVar == null || yyeVar.d();
    }

    public final boolean j() {
        return h(1);
    }

    public final boolean k() {
        yye yyeVar = this.h;
        return yyeVar != null && yyeVar.e();
    }

    public final boolean l(int i) {
        return (this.f & i) == i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean m() {
        int i;
        int i2;
        boolean j = j();
        boolean z = j && lj.aj(this.e);
        if (j) {
            i = this.m ? this.e.getMeasuredWidth() : this.e.getWidth();
            i2 = this.m ? this.e.getMeasuredHeight() : this.e.getHeight();
        } else {
            i = 0;
            i2 = 0;
        }
        return j && z && i != 0 && i2 != 0;
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [ahyl, ahyh] */
    public final String toString() {
        this.n.setLength(0);
        StringBuilder sb = this.n;
        sb.append("Lazy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(" view:");
        sb.append(this.e);
        sb.append(" status: ");
        yye yyeVar = this.h;
        char c = '.';
        this.n.append(true != h(64) ? '.' : 'L');
        this.n.append(true != h(32) ? '.' : 'P');
        this.n.append(true != h(16) ? '.' : 'A');
        this.n.append(true != h(8) ? '.' : 'V');
        this.n.append(true != h(4) ? '.' : 'R');
        this.n.append(true != h(2) ? '.' : 'D');
        this.n.append(true != h(1) ? '.' : 'C');
        if (this.f != 0) {
            this.n.append(" user: ");
            for (int i = 7; i >= 0; i--) {
                this.n.append(true != l(1 << i) ? '.' : 'x');
                if (i % 4 == 0 && i > 0) {
                    this.n.append(' ');
                }
            }
        }
        this.n.append(" {");
        StringBuilder sb2 = this.n;
        ?? r2 = this.b;
        sb2.append((r2 == 0 || !r2.mZ()) ? '.' : (char) 10003);
        this.n.append((yyeVar == null || !this.h.e()) ? '.' : 'v');
        StringBuilder sb3 = this.n;
        if (yyeVar != null && this.h.d()) {
            c = 'h';
        }
        sb3.append(c);
        this.n.append('}');
        return this.n.toString();
    }
}
