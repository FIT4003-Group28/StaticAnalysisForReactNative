package com.google.android.apps.gmm.offline.update;

import android.app.Application;
import android.app.Notification;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.gmm.offline.update.OfflineManualDownloadService;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class OfflineManualDownloadService extends affo {
    public static final dcqe a = dcqe.c("com.google.android.apps.gmm.offline.update.OfflineManualDownloadService");
    private static final long y = TimeUnit.HOURS.toMillis(2);
    public dehq b;
    public Executor c;
    public Executor d;
    public Application e;
    public crzm<avkc> f;
    public ckcw g;
    public gdo h;
    public avki i;
    public avzs j;
    public bvrv k;
    public bvjj l;
    public awfh m;
    public avty n;
    public akfa o;
    public avzj p;
    public away q;
    public awiq r;
    public awky s;
    public crzm<avzg> t;
    public avii w;
    public avfp x;
    private PowerManager.WakeLock z;
    public boolean u = false;
    public int v = 0;
    @dzsi
    private crzp<avkc> A = null;

    public final void a(final dbsg<avid> dbsgVar, final boolean z) {
        this.d.execute(new Runnable(this, dbsgVar, z) { // from class: awlf
            private final OfflineManualDownloadService a;
            private final dbsg b;
            private final boolean c;

            {
                this.a = this;
                this.b = dbsgVar;
                this.c = z;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.b(this.b, this.c);
            }
        });
    }

    public final void b(dbsg<avid> dbsgVar, boolean z) {
        bvrj.UI_THREAD.c();
        if (dbsgVar.a()) {
            dbsgVar.b().b(false);
        }
        int i = this.v - 1;
        this.v = i;
        if (i < 0) {
            dcqe.b.v(dcqz.SMALL);
        }
        if (z || this.v <= 0) {
            stopSelf();
            stopForeground(true);
            this.v = 0;
            try {
                this.z.release();
            } catch (RuntimeException unused) {
            }
        }
    }

    @Override // android.app.Service
    protected final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        if (this.A == null) {
            this.A = new crzp(this) { // from class: awkz
                private final OfflineManualDownloadService a;

                {
                    this.a = this;
                }

                @Override // defpackage.crzp
                public final void On(crzm crzmVar) {
                    OfflineManualDownloadService offlineManualDownloadService = this.a;
                    bvrj.UI_THREAD.c();
                    avkc avkcVar = (avkc) crzmVar.l();
                    dbsk.s(avkcVar);
                    boolean z = offlineManualDownloadService.u;
                    if (avkcVar.c() == 1) {
                        return;
                    }
                    if ((z && avkcVar.d() == 1) || offlineManualDownloadService.v <= 0) {
                        return;
                    }
                    offlineManualDownloadService.l.S(bvjk.eA, offlineManualDownloadService.u);
                    boolean z2 = false;
                    if (!offlineManualDownloadService.u && offlineManualDownloadService.m.f()) {
                        z2 = true;
                    }
                    try {
                        bbk bbkVar = new bbk();
                        bbkVar.c = z2 ? 3 : 2;
                        offlineManualDownloadService.s.a(new bbo(), bbkVar).get();
                        offlineManualDownloadService.b(dbpy.a, true);
                    } catch (InterruptedException | ExecutionException unused) {
                    }
                }
            };
        }
        this.f.d(this.A, this.d);
        this.x.a();
        this.g.f(ckhc.OFFLINE_SERVICE);
        this.i.A();
        this.h.b();
        this.w = new awlh(this);
        String canonicalName = OfflineManualDownloadService.class.getCanonicalName();
        dbsk.s(canonicalName);
        PowerManager.WakeLock newWakeLock = ((PowerManager) this.e.getSystemService("power")).newWakeLock(1, canonicalName);
        this.z = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @Override // android.app.Service
    public final void onDestroy() {
        crzm<avkc> crzmVar = this.f;
        crzp<avkc> crzpVar = this.A;
        dbsk.s(crzpVar);
        crzmVar.c(crzpVar);
        this.g.g(ckhc.OFFLINE_SERVICE);
        this.i.B();
        this.h.e();
        this.k.a();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        dbsg dbsgVar;
        dehn<btlu> a2;
        avid avidVar;
        if (intent == null || intent.getAction() == null) {
            bvoo.j(new RuntimeException("OfflineManualDownloadService restarted with null or actionless intent."));
            return 2;
        }
        this.u = intent.getBooleanExtra("OverrideWifiOnly", false);
        Bundle bundleExtra = intent.getBundleExtra("FetchBundle");
        if (bundleExtra != null) {
            awiq awiqVar = this.r;
            long j = bundleExtra.getLong("fetch_id");
            if (awiq.b.equals(bundleExtra.getString("process_id"))) {
                synchronized (awiqVar) {
                    avidVar = awiqVar.c.b(j);
                }
            } else {
                avidVar = null;
            }
            dbsgVar = dbsg.j(avidVar);
        } else {
            dbsgVar = dbpy.a;
        }
        bvrj.UI_THREAD.c();
        this.v++;
        auhk a3 = this.j.a();
        dbsk.s(a3);
        Notification notification = a3.c;
        this.l.P(bvjk.eA);
        startForeground(dpyv.OFFLINE_DOWNLOAD.dm, notification);
        this.z.acquire(y);
        if (this.m.b()) {
            a2 = this.t.j();
        } else {
            a2 = this.n.a();
        }
        deha.q(deha.h(a2, 10L, TimeUnit.SECONDS, this.b), new awlg(this, intent, dbsgVar), this.b);
        return 2;
    }

    @Override // android.app.Service, android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        super.onTrimMemory(i);
        ((ckco) this.g.a(ckia.h)).a(i);
    }
}
