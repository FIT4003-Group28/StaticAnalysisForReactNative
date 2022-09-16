package defpackage;

import android.app.Application;
import android.app.PendingIntent;
import android.net.ConnectivityManager;
import android.os.Build;
import com.google.android.apps.gmm.locationsharing.reporting.LocationCollectedBroadcastReceiver;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* compiled from: PG */
/* renamed from: ajnm  reason: default package */
/* loaded from: classes2.dex */
public final class ajnm {
    private final Application a;
    private final cqat b;
    @dzsi
    private final ahwo c;
    private final bvjj d;
    private final ajkh e;
    private final ajzz f;
    private final ajmq g;
    private final bvrb h;
    @dzsi
    private bvpk i;
    @dzsi
    private ajni j;
    private eapd k;
    private final ajzx l = new ajnl(this);

    public ajnm(Application application, cqat cqatVar, @dzsi ahwo ahwoVar, bvjj bvjjVar, ajkh ajkhVar, ajzz ajzzVar, ajmq ajmqVar, bvrb bvrbVar) {
        this.a = application;
        this.b = cqatVar;
        this.c = ahwoVar;
        this.d = bvjjVar;
        this.e = ajkhVar;
        this.f = ajzzVar;
        this.g = ajmqVar;
        this.h = bvrbVar;
        this.k = new eapd(bvjjVar.w(bvjk.gs, 0L));
    }

    private final synchronized void g(ajni ajniVar) {
        e();
        if (ajniVar.d()) {
            this.g.a(ajniVar.h(), ajniVar.i(), ajniVar.j(), ajniVar.c(), ajniVar.g(), dbpy.a);
        } else {
            bvqd.a(this.g.c(ajniVar.h(), ajniVar.i(), ajniVar.j(), ajniVar.c(), ajniVar.g(), dbpy.a), this.h.h());
        }
    }

    private final synchronized void h() {
        ReentrantReadWriteLock.WriteLock writeLock;
        this.j = null;
        this.e.a(LocationCollectedBroadcastReceiver.a(this.a));
        bvpk bvpkVar = this.i;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        ajzz ajzzVar = this.f;
        ajzx ajzxVar = this.l;
        ajzzVar.a.writeLock().lock();
        if (!ajzzVar.e.contains(ajzxVar)) {
            writeLock = ajzzVar.a.writeLock();
        } else {
            boolean isEmpty = ajzzVar.e.isEmpty();
            ajzzVar.e.remove(ajzxVar);
            if (!isEmpty && ajzzVar.e.isEmpty()) {
                if (Build.VERSION.SDK_INT >= 24) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) ajzzVar.b.getSystemService("connectivity");
                    try {
                        ajzy ajzyVar = ajzzVar.c;
                        dbsk.s(ajzyVar);
                        connectivityManager.unregisterNetworkCallback(ajzyVar);
                    } catch (RuntimeException e) {
                        bvoo.i(e);
                    }
                } else {
                    try {
                        ajzzVar.b.unregisterReceiver(ajzzVar.d);
                    } catch (RuntimeException e2) {
                        bvoo.i(e2);
                    }
                }
            }
            writeLock = ajzzVar.a.writeLock();
        }
        writeLock.unlock();
        ahwo ahwoVar = this.c;
        if (ahwoVar != null) {
            ahwoVar.b();
            this.c.b();
        }
    }

    public final synchronized void a(dbsg<ajni> dbsgVar) {
        ajni ajniVar = this.j;
        ajni f = dbsgVar.f();
        this.j = f;
        if (f == null) {
            h();
            return;
        }
        if (!f.equals(ajniVar) && f.e()) {
            ajkh ajkhVar = this.e;
            eaow a = f.a();
            eaow eaowVar = new eaow(new eapd(this.b.b()), f.b());
            PendingIntent a2 = LocationCollectedBroadcastReceiver.a(this.a);
            a.r();
            eaowVar.r();
            if (ajkhVar.c.b() && ajkhVar.c.c() && ajkhVar.c.a.a().c()) {
                LocationRequest create = LocationRequest.create();
                create.setInterval(a.b);
                create.setFastestInterval(a.b);
                create.setMaxWaitTime(a.b);
                create.setPriority(102);
                create.setExpirationDuration(eaowVar.b);
                ajkhVar.b.m(create, a2);
            }
        } else if (!f.e()) {
            this.e.a(LocationCollectedBroadcastReceiver.a(this.a));
        }
        if (f.f()) {
            this.f.a(this.l);
        }
        c();
    }

    public final synchronized dbsg<ajni> b() {
        return dbsg.j(this.j);
    }

    public final synchronized void c() {
        bvpk bvpkVar = this.i;
        if (bvpkVar != null) {
            bvpkVar.b();
        }
        ajni ajniVar = this.j;
        if (ajniVar != null && !ajniVar.b().x(new eapd(this.b.b()))) {
            if (ajniVar.f() && !this.f.c()) {
                return;
            }
            ahwo ahwoVar = this.c;
            if (ahwoVar != null) {
                ajniVar.a().r();
                ahwoVar.b();
                ahwo ahwoVar2 = this.c;
                ajniVar.g().toString();
                ahwoVar2.b();
            }
            eaow k = ajniVar.a().k(new eaow(this.k, new eapd(this.b.b())));
            if (k.b <= 0) {
                g(ajniVar);
                bvpk a = bvpk.a(new Runnable(this) { // from class: ajnj
                    private final ajnm a;

                    {
                        this.a = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.d();
                    }
                });
                this.i = a;
                this.h.a(a, bvrj.UI_THREAD, ajniVar.a().b);
                return;
            }
            bvpk a2 = bvpk.a(new Runnable(this) { // from class: ajnk
                private final ajnm a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.d();
                }
            });
            this.i = a2;
            this.h.a(a2, bvrj.UI_THREAD, k.b);
            return;
        }
        h();
    }

    public final synchronized void d() {
        ajni ajniVar = this.j;
        if (ajniVar != null && !ajniVar.b().x(new eapd(this.b.b()))) {
            g(ajniVar);
            c();
            return;
        }
        h();
    }

    public final synchronized void e() {
        this.k = new eapd(this.b.b());
        this.d.Z(bvjk.gs, this.k.a);
    }

    public final synchronized eapd f() {
        return this.k;
    }
}
