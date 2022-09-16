package defpackage;

import android.app.Notification;
import android.app.Service;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ainq  reason: default package */
/* loaded from: classes.dex */
public final class ainq {
    private final ainx a;
    private final azqb b;
    private final azqb c;
    private Service d;
    private Notification e;
    private boolean f;
    private final List g;
    private final aacz h;

    public ainq(azqb azqbVar, aacz aaczVar, ainx ainxVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.c = azqbVar;
        aaczVar.getClass();
        this.h = aaczVar;
        azqbVar2.getClass();
        this.b = azqbVar2;
        this.a = ainxVar;
        this.g = new ArrayList();
    }

    private final synchronized void i(boolean z) {
        ajad ajadVar;
        iz izVar;
        if (z) {
            if (this.d == null && this.g.isEmpty() && (izVar = (ajadVar = (ajad) this.b.get()).b) != null) {
                if (izVar.k()) {
                    ajadVar.f(true);
                }
                izVar.i(new jc().a());
                ajad.b(izVar);
                izVar.d();
                ajadVar.b = null;
                aijb.a(aija.MEDIASESSION, "MediaSession released", new Object[0]);
            }
        }
    }

    private final boolean j() {
        if (this.f) {
            int i = this.a.a;
            return (i == 2 || i == 3) && this.e != null;
        }
        return false;
    }

    private static void k(Service service, Notification notification) {
        service.startForeground(2, notification);
    }

    public final synchronized void a() {
        Service service = this.d;
        if (service != null) {
            service.stopForeground(true);
        }
        for (Service service2 : this.g) {
            service2.stopForeground(true);
        }
        this.f = false;
        this.a.b();
        ((fq) this.c.get()).c(2);
        this.e = null;
    }

    public final synchronized void b(boolean z) {
        c(z);
    }

    public final synchronized void c(boolean z) {
        i(z);
    }

    public final synchronized void d(Service service) {
        if (!this.g.contains(service) && j()) {
            k(service, this.e);
        }
        this.g.add(service);
    }

    public final synchronized void e(Service service) {
        this.g.remove(service);
    }

    public final synchronized void f(Service service) {
        if (this.d != service && j() && service != null) {
            k(service, this.e);
        }
        this.d = service;
    }

    public final synchronized void g(Notification notification, boolean z) {
        boolean z2;
        this.e = notification;
        if (!z) {
            atfw atfwVar = this.h.b().k;
            if (atfwVar == null) {
                atfwVar = atfw.a;
            }
            apgu apguVar = atfwVar.y;
            if (apguVar == null) {
                apguVar = apgu.a;
            }
            if (!apguVar.b) {
                h();
                ((fq) this.c.get()).e(2, notification);
            }
        }
        Service service = this.d;
        if (service != null) {
            service.startForeground(2, notification);
            z2 = true;
        } else {
            z2 = false;
        }
        for (Service service2 : this.g) {
            service2.startForeground(2, notification);
            z2 = true;
        }
        this.f = true;
        this.a.c();
        if (z2) {
            return;
        }
        ((fq) this.c.get()).e(2, notification);
    }

    public final synchronized void h() {
        Service service = this.d;
        if (service != null) {
            service.stopForeground(false);
        }
        for (Service service2 : this.g) {
            service2.stopForeground(false);
        }
        this.f = false;
    }
}
