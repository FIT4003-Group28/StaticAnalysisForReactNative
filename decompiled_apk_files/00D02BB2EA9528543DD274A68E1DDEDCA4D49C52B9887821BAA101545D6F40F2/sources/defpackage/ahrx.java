package defpackage;

import android.location.LocationManager;
import android.os.Handler;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: ahrx  reason: default package */
/* loaded from: classes2.dex */
public final class ahrx implements ahsp {
    public final btrm a;
    public final LocationManager b;
    final ahsv c;
    @dzsi
    public ckcw e;
    public Looper d = null;
    private boolean i = false;
    private ahso j = ahso.GPS_AND_NETWORK;
    final ahrv f = new ahrv(this, "gps", 1);
    final ahrv g = new ahrv(this, "network", 3);
    final ahrv h = new ahrv(this, "passive", 5);

    public ahrx(btrm btrmVar, LocationManager locationManager, cqat cqatVar) {
        this.a = btrmVar;
        this.b = locationManager;
        this.c = new ahsv(new ahrw(this), locationManager, cqatVar, false);
    }

    private final void f() {
        bvrj.LOCATION_SENSORS.c();
        if (this.d == null) {
            this.d = new Handler().getLooper();
        }
        this.c.a();
        ahso ahsoVar = ahso.PASSIVE;
        int ordinal = this.j.ordinal();
        if (ordinal == 0) {
            this.h.a();
            this.f.b();
            this.g.b();
        } else if (ordinal == 1) {
            this.f.a();
            this.g.b();
            this.h.b();
        } else if (ordinal != 2) {
        } else {
            this.f.a();
            this.g.a();
            this.h.b();
        }
    }

    @Override // defpackage.ahsp
    public final void a(ahso ahsoVar, @dzsi ckcw ckcwVar) {
        this.e = ckcwVar;
        int i = ckfu.a;
        if (this.i) {
            return;
        }
        this.j = ahsoVar;
        f();
        this.i = true;
    }

    @Override // defpackage.ahsp
    public final void b(ahso ahsoVar) {
        this.j = ahsoVar;
        f();
    }

    @Override // defpackage.ahsp
    public final void c() {
        bvrj.LOCATION_SENSORS.c();
        f();
    }

    @Override // defpackage.ahsp
    public final void d() {
        int i = ckfu.a;
        bvrj.LOCATION_SENSORS.c();
        if (!this.i) {
            return;
        }
        this.h.b();
        this.f.b();
        this.g.b();
        this.c.b();
        this.i = false;
    }

    @Override // defpackage.ahsp
    public final boolean e() {
        return true;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isStarted", this.i);
        b.b("preferredProviders", this.j);
        b.b("gps", this.f.toString());
        b.b("network", this.g.toString());
        b.b("passive", this.h.toString());
        return b.toString();
    }
}
