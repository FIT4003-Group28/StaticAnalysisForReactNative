package defpackage;

import android.app.Application;
import com.google.android.apps.gmm.car.api.GmmCarProjectionStateEvent;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: crfy  reason: default package */
/* loaded from: classes5.dex */
public final class crfy implements crgy {
    public static final dcqe a = dcqe.c("crfy");
    public static final bvrj b = bvrj.BACKGROUND_THREADPOOL;
    static final long c = TimeUnit.SECONDS.toMillis(2);
    static final long d = TimeUnit.MINUTES.toMillis(5);
    public final bvjj e;
    public final cqat f;
    public final bvrb g;
    public final akfa h;
    public final vzc i;
    @dzsi
    public vvy j;
    public boolean k;
    @dzsi
    public GmmLocation l;
    private final btrm n;
    public int m = 2;
    private final Runnable o = new crfw(this);
    private final Runnable p = new crfx(this);

    public crfy(Application application, bvjj bvjjVar, btrm btrmVar, cqat cqatVar, bvrb bvrbVar, akfa akfaVar, Executor executor, Executor executor2) {
        this.e = bvjjVar;
        this.n = btrmVar;
        this.f = cqatVar;
        this.g = bvrbVar;
        this.h = akfaVar;
        this.i = new vzc(application, executor, executor2);
    }

    private final void f(Runnable runnable) {
        this.g.a(runnable, b, c);
    }

    @Override // defpackage.crgy
    public final void a(crgz crgzVar) {
        f(this.p);
        this.e.S(bvjk.dZ, true);
        btrm btrmVar = this.n;
        dceq a2 = dcet.a();
        a2.b(crmj.class, new crfz(0, crmj.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crmq.class, new crfz(1, crmq.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(crmk.class, new crfz(2, crmk.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(GmmCarProjectionStateEvent.class, new crfz(3, GmmCarProjectionStateEvent.class, this, bvrj.NAVIGATION_INTERNAL));
        a2.b(amqo.class, new crfz(4, amqo.class, this, bvrj.NAVIGATION_INTERNAL));
        btrmVar.g(this, a2.a());
        this.g.a(this.o, b, d);
        this.e.P(bvjk.dX);
    }

    @Override // defpackage.crgy
    public final void b(final boolean z) {
        this.n.a(this);
        final long b2 = this.f.b();
        f(new Runnable(this, z, b2) { // from class: crfv
            private final crfy a;
            private final boolean b;
            private final long c;

            {
                this.a = this;
                this.b = z;
                this.c = b2;
            }

            @Override // java.lang.Runnable
            public final void run() {
                crfy crfyVar = this.a;
                boolean z2 = this.b;
                long j = this.c;
                synchronized (crfyVar) {
                    crfyVar.k = false;
                    vvy vvyVar = crfyVar.j;
                    if (vvyVar == null) {
                        return;
                    }
                    crfyVar.j = null;
                    vvw vvwVar = vvyVar.f;
                    if (vvwVar == null) {
                        vvwVar = vvw.d;
                    }
                    int a2 = vvv.a(vvwVar.b);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    int i = true != z2 ? 5 : 7;
                    if ((a2 == 6 || a2 == 9) && i == 5) {
                        return;
                    }
                    vvy g = vze.g(vvyVar, j, null, i, crfyVar.l);
                    if (g == null) {
                        bvoo.h("directions is null in updateSessionStateAsync", new Object[0]);
                    } else {
                        crfyVar.i.b(vzd.NAVIGATION_RESTORE, g);
                    }
                }
            }
        });
        if (!z) {
            this.e.S(bvjk.dZ, false);
        }
    }

    public final synchronized void c(GmmCarProjectionStateEvent gmmCarProjectionStateEvent) {
        this.m = gmmCarProjectionStateEvent.isInProjectedMode() ? 3 : 2;
    }

    public final synchronized void d(amqo amqoVar) {
        this.l = amqoVar.a();
    }

    public final void e(crlz crlzVar, final int i) {
        final crqo crqoVar = crlzVar.b;
        final long b2 = this.f.b();
        f(new Runnable(this, crqoVar, i, b2) { // from class: crfu
            private final crfy a;
            private final crqo b;
            private final long c;
            private final int d;

            {
                this.a = this;
                this.b = crqoVar;
                this.d = i;
                this.c = b2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:31:0x00a1, code lost:
                if (r9 == 6) goto L25;
             */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r10 = this;
                    crfy r0 = r10.a
                    crqo r1 = r10.b
                    int r9 = r10.d
                    long r3 = r10.c
                    monitor-enter(r0)
                    vvy r2 = r0.j     // Catch: java.lang.Throwable -> Laa
                    if (r2 == 0) goto L3d
                    amuh r5 = r1.a     // Catch: java.lang.Throwable -> Laa
                    amub r5 = r5.k()     // Catch: java.lang.Throwable -> Laa
                    if (r5 != 0) goto L16
                    goto L3d
                L16:
                    dwaw r2 = r2.b     // Catch: java.lang.Throwable -> Laa
                    if (r2 != 0) goto L1c
                    dwaw r2 = defpackage.dwaw.j     // Catch: java.lang.Throwable -> Laa
                L1c:
                    dvzy r2 = r2.b     // Catch: java.lang.Throwable -> Laa
                    if (r2 != 0) goto L22
                    dvzy r2 = defpackage.dvzy.u     // Catch: java.lang.Throwable -> Laa
                L22:
                    dsrj<dpjx> r2 = r2.d     // Catch: java.lang.Throwable -> Laa
                    int r2 = r2.size()     // Catch: java.lang.Throwable -> Laa
                    int r5 = r5.ai()     // Catch: java.lang.Throwable -> Laa
                    if (r2 == r5) goto L3d
                    r2 = 0
                    r0.j = r2     // Catch: java.lang.Throwable -> Laa
                    vzc r2 = r0.i     // Catch: java.lang.Throwable -> Laa
                    vzd r5 = defpackage.vzd.NAVIGATION_RESTORE     // Catch: java.lang.Throwable -> Laa
                    r2.a(r5)     // Catch: java.lang.Throwable -> Laa
                    vzc r2 = r0.i     // Catch: java.lang.Throwable -> Laa
                    defpackage.vyw.b(r2)     // Catch: java.lang.Throwable -> Laa
                L3d:
                    vvy r2 = r0.j     // Catch: java.lang.Throwable -> Laa
                    if (r2 == 0) goto L4d
                    amuh r5 = r1.a     // Catch: java.lang.Throwable -> Laa
                    com.google.android.apps.gmm.map.model.location.GmmLocation r7 = r0.l     // Catch: java.lang.Throwable -> Laa
                    r6 = r9
                    vvy r1 = defpackage.vze.g(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> Laa
                    r0.j = r1     // Catch: java.lang.Throwable -> Laa
                    goto L81
                L4d:
                    bvjj r2 = r0.e     // Catch: java.lang.Throwable -> Laa
                    bvjk r5 = defpackage.bvjk.ea     // Catch: java.lang.Throwable -> Laa
                    r2.Z(r5, r3)     // Catch: java.lang.Throwable -> Laa
                    akfa r2 = r0.h     // Catch: java.lang.Throwable -> Laa
                    btlu r2 = r2.j()     // Catch: java.lang.Throwable -> Laa
                    boolean r2 = defpackage.btlu.n(r2)     // Catch: java.lang.Throwable -> Laa
                    if (r2 == 0) goto L71
                    amuh r1 = r1.a     // Catch: java.lang.Throwable -> Laa
                    int r5 = r0.m     // Catch: java.lang.Throwable -> Laa
                    com.google.android.apps.gmm.map.model.location.GmmLocation r7 = r0.l     // Catch: java.lang.Throwable -> Laa
                    r8 = 1
                    r2 = r3
                    r4 = r1
                    r6 = r9
                    vvy r1 = defpackage.vze.h(r2, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laa
                    r0.j = r1     // Catch: java.lang.Throwable -> Laa
                    goto L81
                L71:
                    amuh r1 = r1.a     // Catch: java.lang.Throwable -> Laa
                    int r5 = r0.m     // Catch: java.lang.Throwable -> Laa
                    com.google.android.apps.gmm.map.model.location.GmmLocation r7 = r0.l     // Catch: java.lang.Throwable -> Laa
                    r8 = 0
                    r2 = r3
                    r4 = r1
                    r6 = r9
                    vvy r1 = defpackage.vze.h(r2, r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Laa
                    r0.j = r1     // Catch: java.lang.Throwable -> Laa
                L81:
                    vvy r1 = r0.j     // Catch: java.lang.Throwable -> Laa
                    r2 = 6
                    if (r1 != 0) goto L8f
                    java.lang.String r1 = "currentDirections is null in scheduleDelayedUpdate"
                    r3 = 0
                    java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Laa
                    defpackage.bvoo.h(r1, r3)     // Catch: java.lang.Throwable -> Laa
                    goto La1
                L8f:
                    vzc r1 = r0.i     // Catch: java.lang.Throwable -> Laa
                    vzd r3 = defpackage.vzd.NAVIGATION_RESTORE     // Catch: java.lang.Throwable -> Laa
                    vvy r4 = r0.j     // Catch: java.lang.Throwable -> Laa
                    r1.b(r3, r4)     // Catch: java.lang.Throwable -> Laa
                    if (r9 == r2) goto La3
                    vvy r1 = r0.j     // Catch: java.lang.Throwable -> Laa
                    vzc r3 = r0.i     // Catch: java.lang.Throwable -> Laa
                    defpackage.vyw.a(r1, r3)     // Catch: java.lang.Throwable -> Laa
                La1:
                    if (r9 != r2) goto La8
                La3:
                    vzc r1 = r0.i     // Catch: java.lang.Throwable -> Laa
                    defpackage.vyw.b(r1)     // Catch: java.lang.Throwable -> Laa
                La8:
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                    return
                Laa:
                    r1 = move-exception
                    monitor-exit(r0)     // Catch: java.lang.Throwable -> Laa
                    throw r1
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.crfu.run():void");
            }
        });
    }
}
