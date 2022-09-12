package defpackage;

import android.location.Location;
import android.os.Build;
import android.os.Bundle;
import com.google.android.apps.gmm.location.model.QuantizedDeviceLocation;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.gms.location.FusedLocationProviderApi;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: amvs  reason: default package */
/* loaded from: classes.dex */
public final class amvs {
    public float a;
    public double b;
    public float c;
    @dzsi
    public Bundle d;
    public double e;
    public double f;
    @dzsi
    public String g;
    @dzsi
    public QuantizedDeviceLocation h;
    public float i;
    public long m;
    public long n;
    public long o;
    @dzsi
    public altv p;
    @dzsi
    public akra q;
    public amvu r;
    public amvt s;
    @dzsi
    public Location t;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public boolean u = false;
    public boolean v = false;
    public boolean w = false;
    public boolean x = false;
    public boolean y = false;
    public boolean z = false;
    public boolean A = false;
    public boolean B = false;

    public final void A(long j) {
        this.B = true;
        this.n = j;
    }

    public final void B(float f) {
        this.i = f;
        this.y = true;
    }

    public final void C(long j) {
        this.m = j;
        this.z = true;
    }

    public final boolean a() {
        return !Float.isNaN(this.j);
    }

    public final boolean b() {
        return !Float.isNaN(this.k);
    }

    public final boolean c() {
        return !Float.isNaN(this.l);
    }

    public final GmmLocation d() {
        if (this.q == null) {
            throw new IllegalStateException("latitude and longitude must be set");
        }
        return new GmmLocation(this);
    }

    public final amvu e() {
        if (this.r == null) {
            this.r = new amvu();
        }
        return this.r;
    }

    public final amvt f() {
        if (this.s == null) {
            this.s = new amvt();
        }
        return this.s;
    }

    public final boolean g() {
        amvt amvtVar = this.s;
        return amvtVar != null && amvtVar.b >= 0;
    }

    public final int h() {
        amvt amvtVar = this.s;
        if (amvtVar != null) {
            return amvtVar.b;
        }
        return -1;
    }

    public final boolean i() {
        amvt amvtVar = this.s;
        return amvtVar != null && amvtVar.c;
    }

    public final void j(Location location) {
        String string;
        int i;
        akqh a;
        if (location == null) {
            return;
        }
        if (location.hasAccuracy()) {
            n(location.getAccuracy());
        }
        if (location.hasAltitude()) {
            o(location.getAltitude());
        }
        if (location.hasBearing()) {
            p(location.getBearing());
        }
        v(location.getLatitude(), location.getLongitude());
        this.g = location.getProvider();
        if (location.hasSpeed()) {
            B(location.getSpeed());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            if (location.hasSpeedAccuracy()) {
                this.j = location.getSpeedAccuracyMetersPerSecond();
            }
            if (location.hasBearingAccuracy()) {
                this.k = location.getBearingAccuracyDegrees();
            }
            if (location.hasVerticalAccuracy()) {
                this.l = location.getVerticalAccuracyMeters();
            }
        } else if (location instanceof GmmLocation) {
            GmmLocation gmmLocation = (GmmLocation) location;
            if (gmmLocation.hasSpeedAccuracy()) {
                this.j = gmmLocation.getSpeedAccuracyMetersPerSecond();
            }
            if (gmmLocation.hasBearingAccuracy()) {
                this.k = gmmLocation.getBearingAccuracyDegrees();
            }
            if (gmmLocation.hasVerticalAccuracy()) {
                this.l = gmmLocation.getVerticalAccuracyMeters();
            }
        }
        q(location.getExtras());
        Bundle bundle = this.d;
        altv altvVar = null;
        if (bundle != null) {
            synchronized (bundle) {
                try {
                    string = bundle.getString(FusedLocationProviderApi.EXTRA_KEY_LEVEL_ID);
                    i = bundle.getInt(FusedLocationProviderApi.EXTRA_KEY_LEVEL_NUMBER_E3, Integer.MIN_VALUE);
                } catch (IllegalArgumentException unused) {
                }
            }
            if (string != null && (a = akqh.a(string)) != null) {
                altvVar = new altv(a, i);
            }
        }
        this.p = altvVar;
        if (altvVar != null) {
            Bundle bundle2 = new Bundle();
            bundle2.putInt("locationType", 3);
            bundle2.putString(FusedLocationProviderApi.EXTRA_KEY_LEVEL_ID, altvVar.a.o());
            bundle2.putInt(FusedLocationProviderApi.EXTRA_KEY_LEVEL_NUMBER_E3, altvVar.b);
            synchronized (bundle2) {
                Bundle bundle3 = this.d;
                if (bundle3 != null) {
                    bundle3.putAll(bundle2);
                } else {
                    this.d = new Bundle(bundle2);
                }
            }
        }
        if (location instanceof GmmLocation) {
            GmmLocation gmmLocation2 = (GmmLocation) location;
            this.B = true;
            this.n = gmmLocation2.j;
            if (gmmLocation2.c) {
                C(gmmLocation2.getTime());
            }
            if (gmmLocation2.d) {
                z(gmmLocation2.k);
            }
            k(gmmLocation2);
            amvt amvtVar = gmmLocation2.m;
            if (amvtVar != null) {
                this.s = new amvt(amvtVar);
            }
            this.u = gmmLocation2.n;
            QuantizedDeviceLocation quantizedDeviceLocation = gmmLocation2.e;
            if (quantizedDeviceLocation != null) {
                this.h = quantizedDeviceLocation;
            }
            Location location2 = gmmLocation2.o;
            if (location2 == null) {
                return;
            }
            this.t = location2;
            return;
        }
        C(location.getTime());
        z(TimeUnit.NANOSECONDS.toMillis(location.getElapsedRealtimeNanos()));
    }

    public final void k(GmmLocation gmmLocation) {
        amvu amvuVar = gmmLocation.l;
        if (amvuVar != null) {
            this.r = new amvu(amvuVar);
        }
    }

    public final void l() {
        this.c = 0.0f;
        this.x = false;
    }

    public final void m() {
        this.i = 0.0f;
        this.y = false;
    }

    public final void n(float f) {
        this.a = f;
        this.v = true;
    }

    public final void o(double d) {
        this.b = d;
        this.w = true;
    }

    public final void p(float f) {
        this.c = f;
        this.x = true;
    }

    public final void q(Bundle bundle) {
        if (bundle == null) {
            this.d = null;
            return;
        }
        synchronized (bundle) {
            this.d = new Bundle(bundle);
        }
    }

    public final void r(boolean z) {
        e().r = z;
    }

    public final void s(boolean z) {
        e().b = z;
    }

    public final void t() {
        if (this.s == null) {
            this.s = new amvt();
        }
    }

    public final void u(boolean z) {
        f().a = z;
    }

    public final void v(double d, double d2) {
        this.e = d;
        this.f = d2;
        this.q = akra.c((int) (d * 1000000.0d), (int) (d2 * 1000000.0d));
    }

    public final void w(@dzsi amvp amvpVar) {
        e().w = amvpVar;
    }

    public final void x(boolean z) {
        e().a = z;
    }

    public final void y(long j, double d) {
        e().l.a(j, d);
    }

    public final void z(long j) {
        this.A = true;
        this.o = j;
    }
}
