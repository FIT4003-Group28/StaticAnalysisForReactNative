package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: mtc  reason: default package */
/* loaded from: classes7.dex */
public final class mtc implements msx {
    public static final eaow a = eaow.d(30);
    public final dcdc<ldm> b;
    public final ksr c;
    public final msv d;
    public final ckco e;
    public final kso f;
    public final Handler g = new Handler(Looper.getMainLooper());
    public msw h = msw.LOADING_DIRECTIONS;
    public boolean i = false;
    @dzsi
    public Runnable j;
    public final mri k;
    private final lzf l;
    private final Context m;

    public mtc(dcdc dcdcVar, lzf lzfVar, ksr ksrVar, Context context, final mri mriVar, msv msvVar, ckcw ckcwVar) {
        this.b = dcdcVar;
        this.l = lzfVar;
        this.c = ksrVar;
        this.m = context;
        this.k = mriVar;
        this.d = msvVar;
        mriVar.getClass();
        this.f = new kso(mriVar) { // from class: msy
            private final mri a;

            {
                this.a = mriVar;
            }

            @Override // defpackage.kso
            public final void a() {
                this.a.a();
            }
        };
        this.e = (ckco) ckcwVar.a(ckee.aD);
    }

    public static msw j(int i) {
        int i2 = i - 1;
        if (i2 != 0) {
            if (i2 == 1) {
                return msw.READY_TO_NAVIGATE;
            }
            if (i2 != 2) {
                return msw.LOAD_DIRECTIONS_PERMANENT_ERROR;
            }
            return msw.LOAD_DIRECTIONS_TRANSIENT_ERROR;
        }
        return msw.LOADING_DIRECTIONS;
    }

    @Override // defpackage.msx
    public final msw a() {
        return this.h;
    }

    @Override // defpackage.msx
    @dzsi
    public final amub b() {
        amte l = this.b.get(0).l();
        if (l == null) {
            return null;
        }
        return l.b(0, this.m);
    }

    @Override // defpackage.msx
    public final void c() {
        boolean z = true;
        dbsk.p(this.h == msw.READY_TO_NAVIGATE || this.h == msw.START_NAVIGATION_ERROR, "Can only call startNavigation() in READY_TO_NAVIGATE state, current state is %s", this.h);
        g(msw.STARTING_NAVIGATION);
        if (this.d == msv.INTENT_MULTIPLE_WAYPOINTS) {
            z = false;
        }
        lzf lzfVar = this.l;
        dcdc<ldm> dcdcVar = this.b;
        lze lzeVar = new lze(this) { // from class: msz
            private final mtc a;

            {
                this.a = this;
            }

            @Override // defpackage.lze
            public final void a() {
                mtc mtcVar = this.a;
                if (mtcVar.h == msw.STARTING_NAVIGATION) {
                    ldm ldmVar = mtcVar.b.get(0);
                    if (ldmVar.u() == 2) {
                        mtcVar.g(msw.START_NAVIGATION_ERROR);
                        if (mtcVar.d != msv.INTENT_MULTIPLE_WAYPOINTS) {
                            return;
                        }
                        mtcVar.e.a(3);
                        return;
                    }
                    mtcVar.g(mtc.j(ldmVar.u()));
                    mtcVar.i(ldmVar.u());
                }
            }
        };
        lyx c = lyy.c(new lzc(lzb.PRE_NAV_ROUTE_OVERVIEW));
        c.b(z);
        lzfVar.d(dcdcVar, 0, lzeVar, c.a());
    }

    @Override // defpackage.msx
    public final void d() {
        dbsk.p(this.h == msw.LOAD_DIRECTIONS_TRANSIENT_ERROR, "Can only call retryFetchDirections() in READY_TO_NAVIGATE state, current state is %s", this.h);
        g(msw.LOADING_DIRECTIONS);
        f();
    }

    @Override // defpackage.msx
    public final boolean e() {
        return this.c.g();
    }

    public final void f() {
        this.c.d(this.b, new ksu(this) { // from class: mta
            private final mtc a;

            {
                this.a = this;
            }

            @Override // defpackage.ksu
            public final void a(ldm ldmVar) {
                mtc mtcVar = this.a;
                if (mtcVar.h == msw.STARTING_NAVIGATION) {
                    return;
                }
                boolean g = mtcVar.g(mtc.j(ldmVar.u()));
                mtcVar.i(ldmVar.u());
                if (g) {
                    return;
                }
                mtcVar.k.a();
            }
        }, null);
    }

    public final boolean g(msw mswVar) {
        if (this.h == mswVar) {
            return false;
        }
        this.h = mswVar;
        h();
        this.k.a();
        return true;
    }

    public final void h() {
        if (!this.i || this.h != msw.READY_TO_NAVIGATE) {
            Runnable runnable = this.j;
            if (runnable == null) {
                return;
            }
            this.g.removeCallbacks(runnable);
            this.j = null;
        } else if (this.j != null) {
        } else {
            Runnable runnable2 = new Runnable(this) { // from class: mtb
                private final mtc a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    mtc mtcVar = this.a;
                    mtcVar.f();
                    Handler handler = mtcVar.g;
                    Runnable runnable3 = mtcVar.j;
                    dbsk.s(runnable3);
                    handler.postDelayed(runnable3, mtc.a.b);
                }
            };
            this.j = runnable2;
            this.g.postDelayed(runnable2, a.b);
        }
    }

    public final void i(int i) {
        if (this.d != msv.INTENT_MULTIPLE_WAYPOINTS) {
            return;
        }
        int i2 = i - 1;
        if (i2 == 1) {
            this.e.a(0);
        } else if (i2 == 2) {
            this.e.a(1);
        } else if (i2 != 3) {
        } else {
            this.e.a(2);
        }
    }
}
