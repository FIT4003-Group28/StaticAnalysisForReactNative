package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: cncu  reason: default package */
/* loaded from: classes5.dex */
public final class cncu implements cnce {
    public final Context a;
    public final cnct b;
    public final cncc d;
    public final cncd e;
    private dehn<cmxn> g;
    public final Handler c = new cojb(Looper.getMainLooper());
    private final AtomicBoolean h = new AtomicBoolean(false);
    public volatile boolean f = false;

    public cncu(Context context, cncc cnccVar, cncd cncdVar, int i) {
        Intent component = new Intent().setComponent(cmwy.a);
        this.a = context;
        this.d = cnccVar;
        this.e = cncdVar;
        cnct cnctVar = new cnct(this);
        this.b = cnctVar;
        this.g = ajd.a(new aja(this) { // from class: cncm
            private final cncu a;

            {
                this.a = this;
            }

            @Override // defpackage.aja
            public final Object a(aiy aiyVar) {
                this.a.b.a = aiyVar;
                return "Start CallbackToFutureAdapter";
            }
        });
        aiy<cmxn> aiyVar = cnctVar.a;
        dbsk.s(aiyVar);
        try {
            if (cnjg.a.compare(Long.valueOf(je.a(context.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0))), 47093730L) >= 0) {
                try {
                    if (!cnxg.a().b(context, component, cnctVar, i)) {
                        e();
                        f(new cnah(ddid.GH_STARTUP_SERVICE_NOT_FOUND, "Gearhead Car Startup Service not found, or process cannot bind."), aiyVar);
                    }
                } catch (SecurityException e) {
                    f(new cnah(ddid.CLIENT_BIND_PERMISSION_INVALID, e), aiyVar);
                }
                aiyVar.a(new Runnable(this) { // from class: cncn
                    private final cncu a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.e();
                    }
                }, dege.a);
                return;
            }
            f(new cnah(ddid.GH_MIN_VERSION_INVALID, "Gearhead does not meet minversion."), aiyVar);
        } catch (PackageManager.NameNotFoundException unused) {
            f(new cnah(ddid.GH_NOT_INSTALLED, "Gearhead is not installed."), aiyVar);
        }
    }

    public static cncs h(Context context, cncc cnccVar, cncd cncdVar) {
        return new cncs(context, cnccVar, cncdVar);
    }

    public static void i(Handler handler, Runnable runnable) {
        if (Looper.myLooper() == handler.getLooper()) {
            runnable.run();
        } else {
            handler.post(runnable);
        }
    }

    private final synchronized dehn<cmxn> j() {
        return this.g;
    }

    @Override // defpackage.cnce
    public final dehn<Void> a() {
        return deew.h(j(), cnco.a, dege.a);
    }

    @Override // defpackage.cnce
    public final synchronized cmxn b() {
        dehn<cmxn> dehnVar = this.g;
        if (dehnVar == null || !dehnVar.isDone()) {
            throw new IllegalStateException("Client is not connected yet.");
        }
        try {
        } catch (CancellationException | ExecutionException e) {
            Throwable cause = e.getCause();
            if (cause instanceof IllegalStateException) {
                throw new IllegalStateException("Client is not connected.", cause);
            }
            if (cause instanceof cnai) {
                throw new IllegalStateException("Client connection failed.", cause);
            }
            throw new IllegalStateException("Client not connected.", cause);
        }
        return (cmxn) deha.r(this.g);
    }

    @Override // defpackage.cnce
    public final synchronized void c() {
        if (!this.h.compareAndSet(false, true)) {
            int i = cnjc.a;
            return;
        }
        int i2 = cnjc.a;
        if (!this.g.isDone()) {
            this.g.cancel(true);
        }
        e();
        this.g = deha.b(new IllegalStateException("Client has been disconnected and cannot be used."));
    }

    public final synchronized boolean d() {
        dbsk.l(this.g.isDone());
        return this.f;
    }

    public final void e() {
        int i = cnjc.a;
        cnxg.a().d(this.a, this.b);
    }

    public final void f(final cnai cnaiVar, aiy<cmxn> aiyVar) {
        if (cnjc.a("GH.GhCarClientCtor", 4)) {
            Throwable cause = cnaiVar.getCause();
            if (cause == null) {
                cnaiVar.getMessage();
            } else {
                cnaiVar.getMessage();
                cause.getClass();
                cause.getMessage();
            }
        }
        g(cnaiVar, aiyVar);
        i(this.c, new Runnable(this, cnaiVar) { // from class: cncp
            private final cncu a;
            private final cnai b;

            {
                this.a = this;
                this.b = cnaiVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cncu cncuVar = this.a;
                cncuVar.d.a(this.b);
            }
        });
    }

    public final synchronized void g(cnai cnaiVar, aiy<cmxn> aiyVar) {
        dehn<cmxn> dehnVar = this.g;
        if (dehnVar == null) {
            this.g = deha.b(cnaiVar);
            return;
        }
        if (!dehnVar.isDone() && aiyVar != null) {
            aiyVar.c(cnaiVar);
            return;
        }
        if (!cnep.a(this.g)) {
            return;
        }
        this.g = deha.b(cnaiVar);
    }
}
