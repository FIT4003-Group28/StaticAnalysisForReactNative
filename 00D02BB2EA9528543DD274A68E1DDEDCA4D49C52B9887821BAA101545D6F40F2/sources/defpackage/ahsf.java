package defpackage;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.gmm.location.rawlocationevents.AndroidLocationEvent;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.FusedLocationProviderApi;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationServices;
/* compiled from: PG */
/* renamed from: ahsf  reason: default package */
/* loaded from: classes2.dex */
public final class ahsf implements LocationListener, GoogleApiClient.ConnectionCallbacks, GoogleApiClient.OnConnectionFailedListener, ahsp {
    private static final dcqe f = dcqe.c("ahsf");
    public final GoogleApiClient a;
    public final FusedLocationProviderApi b;
    private final ahsn g;
    private final btrm h;
    @dzsi
    private ckcw i;
    private boolean j = true;
    private boolean k = false;
    public boolean c = false;
    public dqvj d = dqvj.WALK;
    public boolean e = false;
    private ahso l = ahso.GPS_AND_NETWORK;
    private boolean m = false;

    public ahsf(Context context, ahsn ahsnVar, btrm btrmVar) {
        bvrj.LOCATION_SENSORS.c();
        this.g = ahsnVar;
        this.b = LocationServices.FusedLocationApi;
        this.h = btrmVar;
        btsm c = btsm.c(context.getApplicationContext());
        c.g(LocationServices.API);
        c.h(this);
        c.i(this);
        Handler handler = new Handler();
        if (!c.f("setHandler")) {
            c.a.setHandler(handler);
        }
        this.a = c.e();
        dceq a = dcet.a();
        a.b(crhp.class, new ahsg(0, crhp.class, this, bvrj.LOCATION_SENSORS));
        a.b(crmj.class, new ahsg(1, crmj.class, this, bvrj.LOCATION_SENSORS));
        a.b(crhb.class, new ahsg(2, crhb.class, this, bvrj.LOCATION_SENSORS));
        a.b(byze.class, new ahsg(3, byze.class, this, bvrj.LOCATION_SENSORS));
        btrmVar.g(this, a.a());
    }

    private final void g() {
        bvrj.LOCATION_SENSORS.c();
        if (!this.a.isConnected()) {
            return;
        }
        int i = this.l == ahso.PASSIVE ? 105 : 100;
        LocationRequest create = LocationRequest.create();
        create.setInterval(1000L);
        create.setPriority(i);
        try {
            int i2 = ckfu.a;
            final ckcw ckcwVar = this.i;
            this.b.requestLocationUpdates(this.a, create, this).i(new cnon(ckcwVar) { // from class: ahse
                private final ckcw a;

                {
                    this.a = ckcwVar;
                }

                @Override // defpackage.cnon
                public final void Om(cnom cnomVar) {
                    ahou.a(this.a, 7, ((Status) cnomVar).d());
                }
            });
            this.i = null;
        } catch (SecurityException unused) {
        } catch (Exception e) {
            bvoo.f(new RuntimeException(e));
        }
        ahou.a(this.i, 7, false);
        this.i = null;
    }

    @Override // defpackage.cnpv
    public final void Ph(@dzsi Bundle bundle) {
        if (this.m) {
            try {
                g();
            } catch (SecurityException unused) {
            } catch (Exception e) {
                bvoo.f(new RuntimeException(e));
            }
        }
    }

    @Override // defpackage.cnsi
    public final void Pi(ConnectionResult connectionResult) {
        this.k = true;
        f();
        ahou.a(this.i, 7, false);
        this.i = null;
    }

    @Override // defpackage.cnpv
    public final void Pj(int i) {
    }

    @Override // defpackage.ahsp
    public final void a(ahso ahsoVar, @dzsi ckcw ckcwVar) {
        this.i = ckcwVar;
        int i = ckfu.a;
        bvrj.LOCATION_SENSORS.c();
        if (this.m) {
            bvoo.h("start() called when already started.", new Object[0]);
        }
        this.l = ahsoVar;
        this.m = true;
        if (!this.a.isConnecting()) {
            this.a.connect();
        }
    }

    @Override // defpackage.ahsp
    public final void b(ahso ahsoVar) {
        this.l = ahsoVar;
        g();
    }

    @Override // defpackage.ahsp
    public final void c() {
        g();
    }

    @Override // defpackage.ahsp
    public final void d() {
        int i = ckfu.a;
        bvrj.LOCATION_SENSORS.c();
        if (!this.m) {
            bvoo.h("stop() called when already stopped.", new Object[0]);
        }
        this.m = false;
        if (this.a.isConnected()) {
            try {
                this.b.removeLocationUpdates(this.a, this);
            } catch (SecurityException unused) {
            }
        }
        this.a.disconnect();
    }

    @Override // defpackage.ahsp
    public final boolean e() {
        bvrj.LOCATION_SENSORS.c();
        return this.j;
    }

    public final void f() {
        boolean z = this.j;
        boolean z2 = true;
        boolean z3 = this.c && this.d != dqvj.WALK;
        if (this.k || z3 || this.e) {
            z2 = false;
        }
        this.j = z2;
        if (z != z2) {
            this.g.x();
        }
    }

    @Override // com.google.android.gms.location.LocationListener
    public final void onLocationChanged(Location location) {
        if (location == null || !this.m) {
            return;
        }
        this.h.b(AndroidLocationEvent.fromLocation(location));
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.h("isStarted", this.m);
        b.b("preferredProviders", this.l);
        return b.toString();
    }
}
