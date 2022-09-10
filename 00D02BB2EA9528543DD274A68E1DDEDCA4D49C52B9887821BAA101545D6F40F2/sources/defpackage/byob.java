package defpackage;

import android.app.PendingIntent;
import android.content.Intent;
import com.google.android.apps.gmm.base.service.workmanager.GmmWorkerWrapper;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.gmm.traffic.notification.service.AreaTrafficNotificationGeofenceReceiver;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.internal.ParcelableGeofence;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: byob  reason: default package */
/* loaded from: classes4.dex */
public final class byob implements bypq {
    private final byof a;
    private final ckcw b;
    private final btvo c;
    private final cqat d;
    private final pag e;
    private final auhi f;
    private final bvjj g;
    private final auhq h;
    private final axru i;
    private final byoe j;
    private final byrg k;
    private final bvrb l;
    @dzsi
    private dkql m;
    private final bvgh n;

    public byob(byof byofVar, ckcw ckcwVar, btvo btvoVar, cqat cqatVar, pag pagVar, bvjj bvjjVar, auhi auhiVar, auhq auhqVar, axru axruVar, bvgh bvghVar, byoe byoeVar, byrg byrgVar, bvrb bvrbVar) {
        this.b = ckcwVar;
        this.c = btvoVar;
        this.d = cqatVar;
        this.e = pagVar;
        this.g = bvjjVar;
        this.f = auhiVar;
        this.h = auhqVar;
        this.i = axruVar;
        this.a = byofVar;
        this.n = bvghVar;
        this.j = byoeVar;
        this.k = byrgVar;
        this.l = bvrbVar;
        this.m = (dkql) bvjjVar.L(bvjk.cZ, (dssr) dkql.k.cu(7), null);
    }

    private final void i(boolean z) {
        dehn a;
        synchronized (this) {
            dkql dkqlVar = this.m;
            if (dkqlVar != null) {
                if (f()) {
                    if (k()) {
                        bbo bboVar = new bbo();
                        bboVar.d(bypp.PERIODIC.ordinal());
                        try {
                            final byrg byrgVar = this.k;
                            long j = dkqlVar.b;
                            long j2 = dkqlVar.c;
                            try {
                                bboVar.e("worker_name_key", "AreaTrafficNotificationWorker");
                                bbp a2 = bboVar.a();
                                bbk bbkVar = new bbk();
                                int i = 1;
                                bbkVar.c = 1;
                                bbkVar.a = false;
                                final bci f = new bch(GmmWorkerWrapper.class, j, TimeUnit.SECONDS, j2, TimeUnit.SECONDS).d("traffic.notification.periodic").c(a2).b(bbkVar.a()).f();
                                bcl a3 = byrgVar.a.a();
                                if (!z) {
                                    i = 2;
                                }
                                a = deew.h(a3.f("traffic.notification.periodic", i, f).a(), new dbrn(byrgVar, f) { // from class: byre
                                    private final byrg a;
                                    private final bci b;

                                    {
                                        this.a = byrgVar;
                                        this.b = f;
                                    }

                                    @Override // defpackage.dbrn
                                    public final Object a(Object obj) {
                                        byrg byrgVar2 = this.a;
                                        try {
                                            return this.b.a;
                                        } catch (RuntimeException e) {
                                            byrgVar2.b.a().c(2, e);
                                            return bbx.c();
                                        }
                                    }
                                }, byrgVar.c);
                            } catch (RuntimeException e) {
                                byrgVar.b.a().c(2, e);
                                a = deha.a(bbx.c());
                            }
                            a.get();
                        } catch (InterruptedException | ExecutionException unused) {
                        }
                    }
                } else {
                    j();
                }
            }
        }
    }

    private final void j() {
        if (k()) {
            byrg byrgVar = this.k;
            try {
                byrgVar.a.a().c("traffic.notification.periodic");
                byrgVar.a.a().c("traffic.notification.one_time");
            } catch (RuntimeException e) {
                byrgVar.b.a().a(2, e);
            }
        }
        bvrb bvrbVar = this.l;
        final byoe byoeVar = this.j;
        byoeVar.getClass();
        bvrbVar.b(new Runnable(byoeVar) { // from class: bynz
            private final byoe a;

            {
                this.a = byoeVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                GoogleApiClient googleApiClient;
                byoe byoeVar2 = this.a;
                bvrj.UI_THREAD.d();
                GoogleApiClient googleApiClient2 = byoeVar2.b;
                if (googleApiClient2 != null && googleApiClient2.blockingConnect(10L, TimeUnit.SECONDS).c == 0) {
                    try {
                        byoeVar2.c.b(byoeVar2.b, dcdc.f("atn_geofence_request_id")).g(10L, TimeUnit.SECONDS);
                        googleApiClient = byoeVar2.b;
                    } catch (Exception unused) {
                        googleApiClient = byoeVar2.b;
                    } catch (Throwable th) {
                        byoeVar2.b.disconnect();
                        throw th;
                    }
                    googleApiClient.disconnect();
                }
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    private final boolean k() {
        return iry.a(this.c, dkiq.AREA_TRAFFIC_NOTIFICATION);
    }

    @Override // defpackage.bypq
    public final void a() {
        i(false);
    }

    @Override // defpackage.bypq
    public final void b(bypp byppVar) {
        if (k()) {
            c(byppVar, new bbo());
        }
    }

    @Override // defpackage.bypq
    public final void c(bypp byppVar, bbo bboVar) {
        byrg byrgVar;
        dehn a;
        if (!k() || !this.f.s(dpyv.AREA_TRAFFIC.dm)) {
            return;
        }
        bboVar.d(byppVar.ordinal());
        try {
            final byrg byrgVar2 = this.k;
            try {
                bboVar.e("worker_name_key", "AreaTrafficNotificationWorker");
                bbp a2 = bboVar.a();
                bbk bbkVar = new bbk();
                bbkVar.c = 1;
                bbkVar.a = false;
                final bcb f = new bca(GmmWorkerWrapper.class).d("traffic.notification.one_time").c(a2).b(bbkVar.a()).f();
                a = deew.h(byrgVar2.a.a().d("traffic.notification.one_time", 1, f).a(), new dbrn(byrgVar2, f) { // from class: byrf
                    private final byrg a;
                    private final bcb b;

                    {
                        this.a = byrgVar2;
                        this.b = f;
                    }

                    @Override // defpackage.dbrn
                    public final Object a(Object obj) {
                        byrg byrgVar3 = this.a;
                        try {
                            return this.b.a;
                        } catch (RuntimeException e) {
                            byrgVar3.b.a().c(2, e);
                            return bbx.c();
                        }
                    }
                }, byrgVar2.c);
            } catch (RuntimeException e) {
                byrgVar.b.a().c(2, e);
                a = deha.a(bbx.c());
            }
            a.get();
        } catch (InterruptedException | ExecutionException unused) {
        }
    }

    @Override // defpackage.bypq
    public final dehn<byqf> d() {
        synchronized (this) {
            if (!this.f.s(dpyv.AREA_TRAFFIC.dm)) {
                return deha.a(byqf.ERROR_NO_RETRY);
            }
            dkfm bZ = dkfn.d.bZ();
            dutq a = this.e.a();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dkfn dkfnVar = (dkfn) bZ.b;
            a.getClass();
            dkfnVar.b = a;
            int i = dkfnVar.a | 1;
            dkfnVar.a = i;
            dkfnVar.a = i | 2;
            dkfnVar.c = false;
            dkfn bK = bZ.bK();
            long w = this.g.w(bvjk.da, 0L);
            long b = this.d.b();
            long seconds = TimeUnit.MILLISECONDS.toSeconds(b - w);
            synchronized (this) {
                dkql dkqlVar = this.m;
                if (dkqlVar != null && seconds < dkqlVar.d) {
                    return deha.a(byqf.ERROR_RETRY_ALLOWED);
                }
                this.g.Z(bvjk.da, b);
                if (seconds != 0) {
                    ((ckcp) this.b.a(ckht.U)).a(TimeUnit.SECONDS.toMinutes(seconds));
                }
                deig d = deig.d();
                this.n.a(bK, new byoa(d), bvrj.BACKGROUND_THREADPOOL);
                return d;
            }
        }
    }

    @Override // defpackage.bypq
    public final void e(btvr btvrVar) {
        dkql dkqlVar = btvrVar.a.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        synchronized (this) {
            dkql dkqlVar2 = this.m;
            if (dkqlVar2 != null && dkqlVar2.equals(dkqlVar)) {
                if (!this.f.s(dpyv.AREA_TRAFFIC.dm)) {
                    j();
                } else {
                    i(false);
                }
            }
            dsqp dsqpVar = (dsqp) dkqlVar.cu(5);
            dsqpVar.bC(dkqlVar);
            this.m = ((dkqk) dsqpVar).bK();
            i(true);
            this.g.al(bvjk.cZ, this.m);
        }
    }

    @Override // defpackage.bypq
    public final boolean f() {
        dkql dkqlVar = this.c.getNotificationsParameters().j;
        if (dkqlVar == null) {
            dkqlVar = dkql.k;
        }
        if (!dkqlVar.j || this.h.a()) {
            return this.f.s(dpyv.AREA_TRAFFIC.dm);
        }
        return false;
    }

    @Override // defpackage.bypq
    public final void g(GmmLocation gmmLocation) {
        dkql dkqlVar = dkql.k;
        synchronized (this) {
            dkql dkqlVar2 = this.m;
            if (dkqlVar2 != null) {
                dkqlVar = dkqlVar2;
            }
        }
        byoe byoeVar = this.j;
        bvrj.UI_THREAD.d();
        if (byoeVar.b == null) {
            byoeVar.d.a(byod.a(2));
            return;
        }
        try {
            cokg cokgVar = new cokg();
            cokgVar.a = "atn_geofence_request_id";
            cokgVar.b(gmmLocation.getLatitude(), gmmLocation.getLongitude(), dkqlVar.f);
            cokgVar.b = 2;
            cokgVar.c(TimeUnit.SECONDS.toMillis(dkqlVar.b + dkqlVar.c));
            ParcelableGeofence a = cokgVar.a();
            coko cokoVar = new coko();
            cokoVar.b(a);
            cokoVar.a = 2;
            GeofencingRequest a2 = cokoVar.a();
            Intent action = new Intent(byoeVar.a, AreaTrafficNotificationGeofenceReceiver.class).setAction("com.google.android.apps.gmm.traffic.notification.service.AreaTrafficNotificationGeofenceReceiver.ACTION_GEOFENCE_EXIT");
            try {
                if (byoeVar.b.blockingConnect(10L, TimeUnit.SECONDS).c != 0) {
                    byoeVar.d.a(byod.a(3));
                    return;
                }
                Status g = byoeVar.c.a(byoeVar.b, a2, PendingIntent.getBroadcast(byoeVar.a, 0, action, 134217728)).g(10L, TimeUnit.SECONDS);
                if (g.d()) {
                    byoeVar.d.a(byod.a(1));
                } else {
                    String str = g.h;
                    byoeVar.d.a(byod.a(5));
                }
            } catch (Exception e) {
                e.getMessage();
                byoeVar.d.a(byod.a(4));
            } finally {
                byoeVar.b.disconnect();
            }
        } catch (IllegalArgumentException e2) {
            e2.getMessage();
            byoeVar.d.a(byod.a(6));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0047, code lost:
        if (r4 >= r6.g) goto L44;
     */
    @Override // defpackage.bypq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int h(defpackage.dlef r10) {
        /*
            r9 = this;
            bvrj r0 = defpackage.bvrj.UI_THREAD
            r0.d()
            axru r0 = r9.i
            java.lang.String r1 = "android.permission.ACCESS_COARSE_LOCATION"
            boolean r0 = r0.a(r1)
            if (r0 != 0) goto L11
            r10 = 2
            return r10
        L11:
            byof r0 = r9.a
            bvrj r1 = defpackage.bvrj.UI_THREAD
            r1.d()
            ahtd r1 = r0.b     // Catch: java.lang.Exception -> L29
            dehn r1 = r1.a()     // Catch: java.lang.Exception -> L29
            r2 = 1000(0x3e8, double:4.94E-321)
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L29
            java.lang.Object r1 = r1.get(r2, r4)     // Catch: java.lang.Exception -> L29
            com.google.android.apps.gmm.map.model.location.GmmLocation r1 = (com.google.android.apps.gmm.map.model.location.GmmLocation) r1     // Catch: java.lang.Exception -> L29
            goto L2a
        L29:
            r1 = 0
        L2a:
            r2 = 0
            if (r1 == 0) goto L49
            long r4 = r0.a(r1)
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 < 0) goto L49
            btvo r6 = r0.a
            dkre r6 = r6.getNotificationsParameters()
            dkql r6 = r6.j
            if (r6 != 0) goto L42
            dkql r6 = defpackage.dkql.k
        L42:
            int r6 = r6.g
            long r6 = (long) r6
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 < 0) goto L5c
        L49:
            ahth r4 = r0.c
            dehn r4 = r4.a()
            r5 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r7 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.lang.Exception -> L5b
            java.lang.Object r4 = r4.get(r5, r7)     // Catch: java.lang.Exception -> L5b
            com.google.android.apps.gmm.map.model.location.GmmLocation r4 = (com.google.android.apps.gmm.map.model.location.GmmLocation) r4     // Catch: java.lang.Exception -> L5b
            r1 = r4
            goto L5c
        L5b:
        L5c:
            long r4 = r0.a(r1)
            ckcw r6 = r0.d
            ckha r7 = defpackage.ckht.W
            java.lang.Object r6 = r6.a(r7)
            ckcp r6 = (defpackage.ckcp) r6
            int r7 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r7 >= 0) goto L71
            r2 = -1
            goto L77
        L71:
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.SECONDS
            long r2 = r2.toMinutes(r4)
        L77:
            r6.a(r2)
            if (r1 != 0) goto L7d
            goto Lbe
        L7d:
            dlee r2 = r10.a
            if (r2 != 0) goto L83
            dlee r2 = defpackage.dlee.d
        L83:
            float r3 = r2.a
            float r4 = r2.b
            double r5 = (double) r3
            double r3 = (double) r4
            dcvs r3 = defpackage.dcvs.b(r5, r3)
            double r4 = r1.getLatitude()
            double r6 = r1.getLongitude()
            dcvs r1 = defpackage.dcvs.b(r4, r6)
            double r3 = r1.m(r3)
            btvo r0 = r0.a
            dkre r0 = r0.getNotificationsParameters()
            dkql r0 = r0.j
            if (r0 != 0) goto La9
            dkql r0 = defpackage.dkql.k
        La9:
            int r0 = r0.f
            float r0 = (float) r0
            float r1 = r2.c
            float r0 = java.lang.Math.max(r0, r1)
            double r0 = (double) r0
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto Lbe
            bypp r10 = defpackage.bypp.RECEIVED_STALE_NOTIFICATION
            r9.b(r10)
            r10 = 3
            return r10
        Lbe:
            btvo r0 = r9.c
            dkre r0 = r0.getNotificationsParameters()
            dkql r0 = r0.j
            if (r0 != 0) goto Lca
            dkql r0 = defpackage.dkql.k
        Lca:
            boolean r0 = r0.i
            if (r0 == 0) goto Ldd
            boolean r10 = r10.b
            if (r10 == 0) goto Ldd
            auhi r10 = r9.f
            dpyv r0 = defpackage.dpyv.AREA_TRAFFIC
            int r0 = r0.dm
            r10.o(r0)
            r10 = 4
            return r10
        Ldd:
            r10 = 1
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.byob.h(dlef):int");
    }
}
