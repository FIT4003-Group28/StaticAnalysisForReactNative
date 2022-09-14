package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: pqb  reason: default package */
/* loaded from: classes.dex */
public final class pqb {
    @dzsi
    private Location a = null;
    @dzsi
    private Location b = null;
    private long c;
    private cjsw d;
    private cjsw e;
    private cjse f;

    public pqb() {
        h();
    }

    private final void h() {
        this.d = new cjsw(0.0f, 100.0f, 100);
        this.e = new cjsw(0.0f, 10000.0f, 100);
        this.f = new cjse();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ddmg b() {
        return this.d.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ddmg c() {
        return this.e.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ddmi d() {
        return this.f.b();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized float e() {
        Location location;
        Location location2 = this.a;
        if (location2 != null && (location = this.b) != null) {
            return location.distanceTo(location2);
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean f() {
        boolean z;
        if (this.d.a > 0) {
            if (this.e.a > 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void g() {
        h();
        this.a = null;
        this.b = null;
        this.c = 0L;
    }

    public final synchronized String toString() {
        dbsb b;
        b = dbsc.b(this);
        b.b("accuracyTracker", this.d);
        b.b("locationFixAgeTracker", this.e);
        b.b("locationDistanceTracker", this.f);
        return b.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(Location location, long j) {
        if (this.a == null) {
            this.a = location;
        } else {
            this.e.a((float) (j - this.c));
            this.f.a(location.distanceTo(this.b));
        }
        this.d.a(location.getAccuracy());
        this.b = location;
        this.c = j;
    }
}
