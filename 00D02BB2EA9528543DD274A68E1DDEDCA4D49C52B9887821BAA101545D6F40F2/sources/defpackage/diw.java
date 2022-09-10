package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: diw  reason: default package */
/* loaded from: classes6.dex */
public final class diw {
    public final ScheduledExecutorService a;
    public final gga b;
    public final dbsg<? extends czc> c;
    public final czh d;
    public final int e;
    @dzsi
    private fd j = null;
    @dzsi
    public czv f = null;
    @dzsi
    public ScheduledFuture<?> g = null;
    public boolean h = false;
    public final e i = new e() { // from class: com.google.android.apps.gmm.ar.common.launcher.ArSessionPersister$1
        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
            diw diwVar = diw.this;
            if (diwVar.f == null) {
                czt b = diwVar.c.b().b();
                diw diwVar2 = diw.this;
                diwVar2.f = b.a(diwVar2.d, czs.INERTIAL_FOREGROUND);
            }
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
            czv czvVar = diw.this.f;
            if (czvVar != null) {
                czvVar.c();
                diw.this.f = null;
            }
        }

        @Override // defpackage.f
        public final void f(m mVar) {
        }
    };
    private final e k = new e() { // from class: com.google.android.apps.gmm.ar.common.launcher.ArSessionPersister$2
        @Override // defpackage.f
        public final void a(m mVar) {
        }

        @Override // defpackage.f
        public final void b(m mVar) {
            diw diwVar = diw.this;
            dbsk.l(diwVar.c.a());
            if (diwVar.f == null && diwVar.b.aZ) {
                diwVar.f = diwVar.c.b().b().a(diwVar.d, czs.INERTIAL_FOREGROUND);
            }
            if (!diwVar.h) {
                diwVar.b.g.a(diwVar.i);
                diwVar.h = true;
            }
        }

        @Override // defpackage.f
        public final void c(m mVar) {
        }

        @Override // defpackage.f
        public final void d(m mVar) {
        }

        @Override // defpackage.f
        public final void e(m mVar) {
        }

        @Override // defpackage.f
        public final void f(m mVar) {
            final diw diwVar = diw.this;
            dbsk.l(diwVar.g == null);
            if (diwVar.f == null) {
                diwVar.b();
            } else {
                diwVar.g = diwVar.a.schedule(new Runnable(diwVar) { // from class: div
                    private final diw a;

                    {
                        this.a = diwVar;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.b();
                    }
                }, diwVar.e, TimeUnit.SECONDS);
            }
            diw.this.c();
        }
    };

    public diw(dehq dehqVar, gga ggaVar, dbsg<? extends czc> dbsgVar, czh czhVar, int i) {
        this.a = dehqVar;
        this.b = ggaVar;
        this.c = dbsgVar;
        this.d = czhVar;
        this.e = i;
    }

    public final void a(fd fdVar) {
        bvrj.UI_THREAD.c();
        c();
        this.j = fdVar;
        fdVar.Z.a(this.k);
        ScheduledFuture<?> scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.g = null;
        }
    }

    public final void b() {
        czv czvVar = this.f;
        if (czvVar != null) {
            czvVar.c();
            this.f = null;
        }
        ScheduledFuture<?> scheduledFuture = this.g;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
            this.g = null;
        }
        if (this.h) {
            this.b.g.b(this.i);
            this.h = false;
        }
        c();
    }

    public final void c() {
        fd fdVar = this.j;
        if (fdVar != null) {
            fdVar.Z.b(this.k);
            this.j = null;
        }
    }
}
