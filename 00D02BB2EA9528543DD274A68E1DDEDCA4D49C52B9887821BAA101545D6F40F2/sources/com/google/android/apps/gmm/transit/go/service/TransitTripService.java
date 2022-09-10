package com.google.android.apps.gmm.transit.go.service;

import android.content.Intent;
import android.os.IBinder;
import com.google.android.apps.gmm.transit.go.service.TransitTripService;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class TransitTripService extends affo {
    public dxio<bvrv> a;
    public dxio<bwqv> b;
    public dxio<bzcb> c;
    public dxio<bzci> d;
    public dxio<bzfh> e;
    public dxio<gdo> f;
    public dxio<aued> g;
    public dehq h;

    private final synchronized void a(Intent intent) {
        try {
            if (((bzdo) this.c.a().c()).c.a() && !bzcj.c(intent)) {
                bzeg bzegVar = (bzeg) this.b.a().p(bwrj.TRANSIT_TRIP_PARAMS);
                if (bzegVar == null) {
                    stopSelf();
                } else {
                    bzcb a = this.c.a();
                    amte amteVar = bzegVar.a;
                    int i = bzegVar.b;
                    a.c = this.e.a().a(amteVar, bzegVar.c, i);
                    a.h = 3;
                }
            }
            for (bzch bzchVar : this.d.a().a) {
                if (bzchVar.b(intent)) {
                    bzchVar.a(intent);
                }
            }
            intent.getAction();
            throw new IllegalStateException("Can not handle intent");
        } catch (SecurityException unused) {
        } catch (Exception e) {
            b(e);
        }
    }

    private final void b(Exception exc) {
        bzdk c = this.c.a().c();
        if (c == null || ((bzdo) c).c != bzdj.STARTED) {
            return;
        }
        this.c.a().f(bzdd.a(exc));
    }

    @Override // android.app.Service
    @dzsi
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        dxiq.b(this);
        super.onCreate();
        this.f.a().b();
        this.g.a().a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        b(new IllegalStateException("Service destroyed"));
        this.f.a().e();
        this.a.a().a();
        this.h.execute(new Runnable(this) { // from class: bzcc
            private final TransitTripService a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.g.a().b();
            }
        });
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        intent.getAction();
        if (intent == null) {
            stopSelf();
            return 2;
        }
        a(intent);
        return 2;
    }
}
