package defpackage;

import android.app.Application;
import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gmm.transit.go.service.TransitTripService;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: bzcb  reason: default package */
/* loaded from: classes4.dex */
public final class bzcb implements byyp {
    public final Application a;
    @dzsi
    public volatile bzem c;
    public final Executor g;
    private final bvrb i;
    private final cqat j;
    public final bzgj d = new bzgj();
    public boolean e = false;
    @dzsi
    public volatile bzeg f = null;
    public int h = 1;
    public final bzge b = new bzge();

    static {
        TimeUnit.SECONDS.toMillis(5L);
    }

    public bzcb(Application application, bvrb bvrbVar, Executor executor, bzca bzcaVar, cqat cqatVar) {
        this.a = application;
        this.i = bvrbVar;
        this.g = executor;
        coje.a(bzcaVar.a);
        this.j = cqatVar;
    }

    public final void a(final amte amteVar, final int i, final byyo byyoVar, final boolean z) {
        bvrj.UI_THREAD.c();
        int i2 = this.h;
        if (i2 != 0) {
            if (i2 == 2) {
                return;
            }
            final bzem bzemVar = this.c;
            if (bzemVar != null) {
                this.d.b();
                if (((bzdo) ((bzfg) bzemVar).r).c == bzdj.STARTED) {
                    this.h = 2;
                    bzemVar.d(new bzgf(this, bzemVar, amteVar, i, byyoVar, z) { // from class: bzby
                        private final bzcb a;
                        private final bzem b;
                        private final amte c;
                        private final int d;
                        private final byyo e;
                        private final boolean f;

                        {
                            this.a = this;
                            this.b = bzemVar;
                            this.c = amteVar;
                            this.d = i;
                            this.e = byyoVar;
                            this.f = z;
                        }

                        @Override // defpackage.bzgf
                        public final void a() {
                            bzcb bzcbVar = this.a;
                            bzem bzemVar2 = this.b;
                            amte amteVar2 = this.c;
                            int i3 = this.d;
                            byyo byyoVar2 = this.e;
                            boolean z2 = this.f;
                            if (((bzfg) bzemVar2).r.h() == bzdj.STOPPED) {
                                bzcbVar.d.b();
                                bzcbVar.c = null;
                                bzcbVar.h(amteVar2, i3, byyoVar2, z2);
                            }
                        }
                    }, this.d, this.g);
                    bzemVar.a(bzdd.b);
                    return;
                }
                this.c = null;
            }
            h(amteVar, i, byyoVar, z);
            return;
        }
        throw null;
    }

    @Override // defpackage.byyp
    public final void b(amte amteVar, int i, byyo byyoVar) {
        throw null;
    }

    @Override // defpackage.byyp
    public final bzdk c() {
        bzem bzemVar = this.c;
        return bzemVar != null ? ((bzfg) bzemVar).r : bzfg.a;
    }

    @Override // defpackage.bzgh
    public final void d(bzgf bzgfVar, bzgj bzgjVar, @dzsi Executor executor) {
        this.b.b(bzgfVar, bzgjVar, executor);
    }

    @Override // defpackage.byyp
    public final int e() {
        return (int) Math.max(0L, TimeUnit.MILLISECONDS.toSeconds(((bzdo) c()).a.a - this.j.b()));
    }

    @Override // defpackage.byyp
    public final void f(bzdd bzddVar) {
        bzem bzemVar = this.c;
        if (bzemVar != null) {
            bzemVar.a(bzddVar);
        }
    }

    @Override // defpackage.byyp
    public final void g(final byys byysVar) {
        bzem bzemVar = this.c;
        if (bzemVar != null) {
            final bzfg bzfgVar = (bzfg) bzemVar;
            bzfgVar.p(new Runnable(bzfgVar, byysVar) { // from class: bzfa
                private final bzfg a;
                private final byys b;

                {
                    this.a = bzfgVar;
                    this.b = byysVar;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    bzfg bzfgVar2 = this.a;
                    bzfgVar2.y = this.b;
                    bzfgVar2.q();
                }
            });
        }
    }

    public final void h(amte amteVar, int i, byyo byyoVar, boolean z) {
        this.h = 2;
        byyo byyoVar2 = byyo.EXPLICIT_START;
        if (byyoVar.ordinal() != 1) {
            bzeg a = bzeg.a(amteVar, i, byyoVar.e);
            if (a != null) {
                this.e = z;
                this.f = a;
                Application application = this.a;
                application.startService(new Intent(bzcj.a, Uri.EMPTY, application, TransitTripService.class));
                return;
            }
            cjxu.k(this.i, this.a, "Can not start guidance");
        }
    }
}
