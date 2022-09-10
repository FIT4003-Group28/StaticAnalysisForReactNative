package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bvkx  reason: default package */
/* loaded from: classes.dex */
public class bvkx {
    public boolean b;
    public final bvrb c;
    public final btrm d;
    public final dxio<afei> e;
    public final bvqr f;
    public final bvqr g;
    public final bvqr h;
    public final bvqr i;
    public volatile CountDownLatch k;
    @dzsi
    public bvku l;
    public final bvpk n;
    public final btxc o;
    private final dxio<btvo> q;
    private volatile CountDownLatch r;
    private volatile CountDownLatch s;
    private final Executor t;
    private static final dcqe p = dcqe.c("bvkx");
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public final bvks j = new bvks();
    public boolean m = false;

    public bvkx(bvrb bvrbVar, btrm btrmVar, btxc btxcVar, dxio dxioVar, dxio dxioVar2) {
        dege degeVar = dege.a;
        this.t = degeVar;
        this.n = bvpk.a(new bvkr(this));
        this.c = bvrbVar;
        this.d = btrmVar;
        this.o = btxcVar;
        this.q = dxioVar;
        this.e = dxioVar2;
        this.l = null;
        this.f = new bvqr(degeVar);
        this.g = new bvqr(degeVar);
        this.h = new bvqr(degeVar);
        this.i = new bvqr(degeVar);
        this.k = new CountDownLatch(0);
        this.r = new CountDownLatch(0);
        this.s = new CountDownLatch(0);
    }

    private final void s(final Runnable runnable, final bvrj bvrjVar, final bvkw bvkwVar) {
        u(new Runnable(this, runnable, bvkwVar, bvrjVar) { // from class: bvko
            private final bvkx a;
            private final Runnable b;
            private final bvkw c;
            private final bvrj d;

            {
                this.a = this;
                this.b = runnable;
                this.c = bvkwVar;
                this.d = bvrjVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvkx bvkxVar = this.a;
                Runnable runnable2 = this.b;
                bvkw bvkwVar2 = this.c;
                bvrj bvrjVar2 = this.d;
                String valueOf = String.valueOf(runnable2);
                String valueOf2 = String.valueOf(bvkwVar2);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
                sb.append("Running delayed startup task: ");
                sb.append(valueOf);
                sb.append(" with task type: ");
                sb.append(valueOf2);
                sb.toString();
                bvkxVar.c.b(runnable2, bvrjVar2);
            }
        }, bvkwVar);
    }

    private final void t(Runnable runnable, Executor executor, bvkw bvkwVar) {
        u(new bvkv(runnable, executor, bvkwVar), bvkwVar);
    }

    private final void u(final Runnable runnable, bvkw bvkwVar) {
        bvkw bvkwVar2 = bvkw.ON_CLIENT_PARAMETERS_LOADED;
        int ordinal = bvkwVar.ordinal();
        if (ordinal == 0) {
            this.f.execute(runnable);
        } else if (ordinal == 1) {
            this.f.execute(new Runnable(this, runnable) { // from class: bvkp
                private final bvkx a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bvkx bvkxVar = this.a;
                    bvkxVar.g.execute(this.b);
                }
            });
        } else if (ordinal == 2) {
            this.f.execute(new Runnable(this, runnable) { // from class: bvkq
                private final bvkx a;
                private final Runnable b;

                {
                    this.a = this;
                    this.b = runnable;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bvkx bvkxVar = this.a;
                    bvkxVar.h.execute(this.b);
                }
            });
        } else if (ordinal == 3) {
            this.i.execute(runnable);
        } else {
            bvoo.h("Unsupported StartupTaskScheduleType: %s", bvkwVar);
        }
    }

    public final void a() {
        bvrj.UI_THREAD.c();
        l();
        this.b = false;
    }

    public final void b() {
        e();
        this.j.c();
    }

    public final void c() {
        bvrj.UI_THREAD.c();
        bvmn bvmnVar = bvmo.a;
        this.j.b();
    }

    public final void d() {
        this.c.b(new Runnable(this) { // from class: bvkn
            private final bvkx a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bvkx bvkxVar = this.a;
                bvmn bvmnVar = bvmo.a;
                bvkxVar.n(bvku.d(durz.EIT_MAIN, null, false));
            }
        }, bvrj.UI_THREAD);
    }

    public final void e() {
        CountDownLatch countDownLatch;
        f();
        g();
        c();
        bvrj.UI_THREAD.c();
        try {
            this.h.a();
            countDownLatch = this.s;
        } catch (IllegalStateException unused) {
            countDownLatch = this.s;
        } catch (Throwable th) {
            this.s.countDown();
            this.n.b();
            throw th;
        }
        countDownLatch.countDown();
        this.n.b();
        if (r()) {
            this.d.b(new bvkc());
        }
    }

    public final void f() {
        CountDownLatch countDownLatch;
        try {
            this.f.a();
            countDownLatch = this.k;
        } catch (IllegalStateException unused) {
            countDownLatch = this.k;
        } catch (Throwable th) {
            this.k.countDown();
            throw th;
        }
        countDownLatch.countDown();
    }

    public final void g() {
        bvrj.UI_THREAD.c();
        try {
            this.g.a();
            this.r.countDown();
            if (p(durz.EIT_SEARCH) && !q()) {
                return;
            }
            c();
        } catch (IllegalStateException unused) {
            this.r.countDown();
            if (p(durz.EIT_SEARCH) && !q()) {
                return;
            }
            c();
        } catch (Throwable th) {
            this.r.countDown();
            if (!p(durz.EIT_SEARCH) || q()) {
                c();
            }
            throw th;
        }
    }

    @Deprecated
    public final void h(Runnable runnable, bvrj bvrjVar) {
        String valueOf = String.valueOf(runnable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Scheduling ClientParametersLoaded task: ");
        sb.append(valueOf);
        sb.toString();
        s(runnable, bvrjVar, bvkw.ON_CLIENT_PARAMETERS_LOADED);
    }

    public final void i(Runnable runnable, Executor executor) {
        String valueOf = String.valueOf(runnable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
        sb.append("Scheduling ClientParametersLoaded task: ");
        sb.append(valueOf);
        sb.toString();
        t(runnable, executor, bvkw.ON_CLIENT_PARAMETERS_LOADED);
    }

    @Deprecated
    public final void j(Runnable runnable, bvrj bvrjVar, bvkw bvkwVar) {
        String valueOf = String.valueOf(runnable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Scheduling post startup task: ");
        sb.append(valueOf);
        sb.toString();
        s(runnable, bvrjVar, bvkwVar);
    }

    public final void k(Runnable runnable, Executor executor, bvkw bvkwVar) {
        String valueOf = String.valueOf(runnable);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 30);
        sb.append("Scheduling post startup task: ");
        sb.append(valueOf);
        sb.toString();
        t(runnable, executor, bvkwVar);
    }

    public final void l() {
        if (this.r.getCount() == 0) {
            this.g.b();
            this.r = new CountDownLatch(1);
        }
        if (this.s.getCount() == 0) {
            this.h.b();
            this.s = new CountDownLatch(1);
        }
        this.j.a();
    }

    public final boolean m() {
        bvku bvkuVar = this.l;
        if (bvkuVar == null) {
            return false;
        }
        bvjy bvjyVar = (bvjy) bvkuVar;
        durz durzVar = bvjyVar.a;
        if (bvjyVar.c || durzVar == durz.EIT_MAIN || durzVar == durz.EIT_SEARCH || durzVar == durz.EIT_DIRECTIONS) {
            return true;
        }
        return this.q.a().getBusinessMessagingParameters().v && (durzVar == durz.EIT_BUSINESS_MESSAGING_START_CONVERSATION || durzVar == durz.EIT_BUSINESS_MESSAGING_NOTIFICATION || durzVar == durz.EIT_BUSINESS_MESSAGING_MAPS_ONLY);
    }

    public final void n(bvku bvkuVar) {
        bvku bvkuVar2 = this.l;
        if (bvkuVar2 == null || !bvkuVar2.equals(bvkuVar)) {
            return;
        }
        bvmn bvmnVar = bvmo.a;
        e();
    }

    public final void o(@dzsi bvku bvkuVar) {
        bvku bvkuVar2 = this.l;
        if (bvkuVar2 == null || !bvkuVar2.equals(bvkuVar)) {
            return;
        }
        this.m = true;
        bvmn bvmnVar = bvmo.a;
    }

    public final boolean p(durz durzVar) {
        bvku bvkuVar = this.l;
        return bvkuVar != null && ((bvjy) bvkuVar).a == durzVar;
    }

    public final boolean q() {
        if (p(durz.EIT_SEARCH)) {
            afib afibVar = afib.PLACE;
            bvku bvkuVar = this.l;
            return bvkuVar != null && ((bvjy) bvkuVar).b == afibVar;
        }
        return false;
    }

    public final boolean r() {
        return this.q.a().getHomeScreenParameters().j;
    }
}
