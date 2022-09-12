package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.widget.RemoteViews;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: arzd  reason: default package */
/* loaded from: classes2.dex */
public final class arzd {
    public static final dcqe a = dcqe.c("arzd");
    public static final long[] b = {0};
    public final Service c;
    public final arzw d;
    public final arzu e;
    public final in f;
    public final jzv g;
    public final asik h;
    public final dxio<cref> i;
    public final PendingIntent j;
    public final arzh k;
    public final aukk l;
    public final ausy m;
    public final Executor n;
    @dzsi
    public PendingIntent o;
    public boolean p;
    public boolean q;
    @dzsi
    public arzb r;

    public arzd(dxio<cref> dxioVar, Intent intent, arzu arzuVar, arzw arzwVar, jzv jzvVar, asik asikVar, arzh arzhVar, Service service, aukk aukkVar, ausy ausyVar, Executor executor) {
        this.i = dxioVar;
        dbsk.s(arzuVar);
        this.e = arzuVar;
        dbsk.s(arzwVar);
        this.d = arzwVar;
        dbsk.s(jzvVar);
        this.g = jzvVar;
        dbsk.s(asikVar);
        this.h = asikVar;
        dbsk.s(service);
        this.c = service;
        dbsk.s(arzhVar);
        this.k = arzhVar;
        dbsk.s(aukkVar);
        this.l = aukkVar;
        this.m = ausyVar;
        this.n = executor;
        this.f = in.a(service);
        this.j = PendingIntent.getService(service, 0, intent, 134217728);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        if (!bvrj.UI_THREAD.b()) {
            this.n.execute(new Runnable(this) { // from class: aryw
                private final arzd a;

                {
                    this.a = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.b();
                }
            });
        } else {
            b();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b() {
        dcqe.b.v(dcqz.LARGE);
        this.c.stopForeground(true);
        this.p = false;
        this.r = null;
    }

    public final void c() {
        this.f.b(dpyv.NAVIGATION_STATUS.dm);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(boolean z, boolean z2, long j, @dzsi cray crayVar, @dzsi amut amutVar) {
        final arzb arzbVar = this.r;
        if (arzbVar == null) {
            return;
        }
        ib ibVar = new ib(arzbVar.d.c.getApplicationContext());
        ibVar.t(2131231959);
        ibVar.q(true);
        ibVar.w = true;
        if (ako.b()) {
            ibVar.z = "navigation";
        }
        PendingIntent pendingIntent = arzbVar.d.o;
        if (pendingIntent != null) {
            ibVar.g = pendingIntent;
        }
        ibVar.k = 2;
        ibVar.t = "navigation_status_notification_group";
        if (z) {
            ibVar.y(b);
        }
        ibVar.r(!arzbVar.d.q);
        arzbVar.d.q = false;
        if (Build.VERSION.SDK_INT < 26) {
            ibVar.j(arzbVar.c());
        }
        arzbVar.c.a(ibVar, z2, j, crayVar, amutVar);
        if (ako.a()) {
            arzbVar.d.l.a(false);
            aujb e = arzbVar.d.m.e(dpyv.NAVIGATION_STATUS.dm);
            if (e == null) {
                return;
            }
            String b2 = e.a().b(z ? 1 : 0);
            if (b2 != null) {
                ibVar.G = b2;
            } else {
                bvoo.h("ChannelId for the navigation status notification type should be non null.", new Object[0]);
                ibVar.G = "OtherChannel";
            }
            arzbVar.c.e(ibVar);
        }
        ibVar.C = 1;
        final Notification b3 = ibVar.b();
        if (Build.VERSION.SDK_INT < 26) {
            RemoteViews b4 = arzbVar.b(R.layout.nav_lockscreen_notification, R.id.lockscreen_notification_container, R.id.lockscreen_notification_icon);
            arzbVar.c.f(b4);
            b3.contentView = b4;
            RemoteViews c = arzbVar.c();
            if (arzbVar.c.b()) {
                arzbVar.c.c(c);
                b3.bigContentView = c;
            }
            RemoteViews b5 = arzbVar.b(R.layout.nav_heads_up_notification, R.id.heads_up_notification_container, R.id.heads_up_notification_icon);
            arzbVar.c.d(b5);
            b3.headsUpContentView = b5;
        }
        if (!bvrj.UI_THREAD.b()) {
            arzbVar.d.n.execute(new Runnable(arzbVar, b3) { // from class: arza
                private final arzb a;
                private final Notification b;

                {
                    this.a = arzbVar;
                    this.b = b3;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.a.a(this.b);
                }
            });
        } else {
            arzbVar.a(b3);
        }
    }
}
