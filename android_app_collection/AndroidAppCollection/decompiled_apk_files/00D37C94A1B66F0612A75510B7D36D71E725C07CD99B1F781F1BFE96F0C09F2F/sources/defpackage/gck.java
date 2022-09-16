package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
/* compiled from: PG */
/* renamed from: gck  reason: default package */
/* loaded from: classes3.dex */
public final class gck extends gcf implements fqc, fqb, gcd, aiza, gbz, ezg {
    public final gcc b;
    public final gcj c;
    private final yzf d;
    private final ezh e;
    private final gch f;
    private final acti g;
    private final Handler h;
    private final Runnable i;
    private boolean j;

    public gck(Activity activity, fqd fqdVar, ezh ezhVar, aacz aaczVar, gcc gccVar, gcj gcjVar, yzf yzfVar, gch gchVar, aizb aizbVar, acti actiVar, ntt nttVar, Handler handler) {
        super(activity, gccVar, nttVar);
        this.i = new Runnable() { // from class: gcg
            @Override // java.lang.Runnable
            public final void run() {
                gck.this.j();
            }
        };
        this.b = gccVar;
        this.c = gcjVar;
        this.d = yzfVar;
        this.e = ezhVar;
        this.f = gchVar;
        this.g = actiVar;
        this.h = handler;
        asxj asxjVar = aaczVar.b().e;
        if ((asxjVar == null ? asxj.a : asxjVar).z) {
            gccVar.c(1);
        }
        fqdVar.g(this);
        fqdVar.f(this);
        gccVar.b.add(this);
        aizbVar.a(this);
        yzfVar.a(gcjVar.a);
        gcjVar.a.a = this;
        if (fqdVar.b) {
            b();
        }
    }

    private final void l(ezx ezxVar, boolean z) {
        int b;
        if (!elk.l(ezxVar)) {
            return;
        }
        int a = this.c.a();
        if (z) {
            b = this.b.b(ezxVar, a, this.a);
        } else {
            gcc gccVar = this.b;
            zbb zbbVar = this.a;
            aqxo.p(elk.l(ezxVar));
            b = (gccVar.c.a || !ezxVar.b() || ezxVar.g()) ? gccVar.b(ezxVar, a, zbbVar) : elk.m(a, gccVar.g(a, zbbVar));
        }
        i(b);
    }

    private final void m(int i) {
        if (i == 1) {
            this.f.c();
        } else if (i != 2) {
        } else {
            this.f.b();
        }
    }

    @Override // defpackage.fqc
    public final void a() {
        this.d.disable();
        gcj gcjVar = this.c;
        gcjVar.e = null;
        gcjVar.b.removeCallbacks(gcjVar.c);
        this.e.j(this);
    }

    @Override // defpackage.fqc
    public final void b() {
        this.d.enable();
        j();
        this.e.i(this);
    }

    @Override // defpackage.gbz
    public final void c(int i) {
        ezx g = this.e.g();
        if (!elk.l(g)) {
            return;
        }
        gcc gccVar = this.b;
        aqxo.p(elk.l(g));
        int i2 = 1;
        aqxo.p(elk.k(i) || elk.j(i));
        if (gccVar.c.a || !g.b() || !g.a() || gccVar.f(i)) {
            i2 = 0;
        }
        m(i2);
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        l(this.e.g(), false);
    }

    @Override // defpackage.gcd
    public final void e() {
        l(this.e.g(), true);
    }

    @Override // defpackage.gcf
    public final void f() {
        if (this.j) {
            j();
        }
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        gcj gcjVar = this.c;
        gcjVar.d = true;
        gcjVar.g(configuration);
        if (this.a instanceof zbf) {
            j();
        } else {
            this.h.post(this.i);
            this.j = true;
        }
        this.c.d = false;
    }

    @Override // defpackage.gcf
    public final boolean h() {
        return k(false);
    }

    public final void i(int i) {
        gcj gcjVar = this.c;
        Integer num = gcjVar.e;
        if (num == null || num.intValue() != i) {
            gcjVar.b.removeCallbacks(gcjVar.c);
            gcjVar.b(i);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:44:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void j() {
        /*
            r8 = this;
            android.os.Handler r0 = r8.h
            java.lang.Runnable r1 = r8.i
            r0.removeCallbacks(r1)
            r0 = 0
            r8.j = r0
            ezh r1 = r8.e
            ezx r1 = r1.g()
            gcc r2 = r8.b
            gcj r3 = r8.c
            int r3 = r3.a()
            zbb r4 = r8.a
            boolean r5 = r1.g()
            r6 = 2
            if (r5 != 0) goto L6c
            boolean r5 = r1.e()
            if (r5 != 0) goto L6c
            boolean r5 = r1.d()
            if (r5 == 0) goto L2e
            goto L6c
        L2e:
            ezx r5 = defpackage.ezx.WATCH_WHILE_SLIDING_MINIMIZED_MAXIMIZED
            if (r1 != r5) goto L35
            ezx r5 = defpackage.ezx.WATCH_WHILE_MAXIMIZED
            goto L44
        L35:
            ezx r5 = defpackage.ezx.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED
            if (r1 != r5) goto L3c
            ezx r5 = defpackage.ezx.WATCH_WHILE_MINIMIZED
            goto L44
        L3c:
            ezx r5 = defpackage.ezx.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED
            if (r1 != r5) goto L43
            ezx r5 = defpackage.ezx.WATCH_WHILE_FULLSCREEN
            goto L44
        L43:
            r5 = r1
        L44:
            ezx r7 = defpackage.ezx.WATCH_WHILE_MAXIMIZED
            if (r5 != r7) goto L50
            boolean r4 = r2.e(r3, r4)
            if (r4 != 0) goto L50
            r2 = 2
            goto L6d
        L50:
            ojy r4 = r2.c
            boolean r4 = r4.a
            if (r4 == 0) goto L57
            goto L6c
        L57:
            aizb r4 = r2.a
            boolean r4 = r4.b
            if (r4 == 0) goto L5e
            goto L6c
        L5e:
            boolean r2 = r2.f(r3)
            if (r2 != 0) goto L6c
            boolean r2 = r5.a()
            if (r2 == 0) goto L6c
            r2 = 1
            goto L6d
        L6c:
            r2 = 0
        L6d:
            boolean r3 = r1.b()
            if (r3 != 0) goto L83
            if (r2 != r6) goto L83
            acti r3 = r8.g
            acte r4 = new acte
            actj r5 = defpackage.actj.FULLSCREEN_OPEN_BY_ROTATE
            r4.<init>(r5)
            r5 = 3
            r6 = 0
            r3.H(r5, r4, r6)
        L83:
            r8.m(r2)
            if (r2 != 0) goto L8b
            r8.l(r1, r0)
        L8b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gck.j():void");
    }

    @Override // defpackage.ezg
    public final void pa(ezx ezxVar) {
        l(ezxVar, true);
    }

    @Override // defpackage.ezg
    public final /* synthetic */ void pb(ezx ezxVar, ezx ezxVar2) {
        hqb.m(this, ezxVar2);
    }

    public final boolean k(boolean z) {
        return this.b.e(z ? this.c.a.b.c : this.c.a(), this.a);
    }
}
