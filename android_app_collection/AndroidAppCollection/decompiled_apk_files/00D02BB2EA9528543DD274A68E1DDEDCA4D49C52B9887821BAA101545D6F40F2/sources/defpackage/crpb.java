package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: crpb  reason: default package */
/* loaded from: classes5.dex */
public final class crpb {
    public final crpm a;
    public int b;
    public int c;
    @dzsi
    public amtz d;
    public dqvj e;
    public int f;
    public boolean g;
    private final cqat h;
    private long i = Long.MAX_VALUE;
    private int j = -1;
    private long k = -1;
    private int l = -1;
    private boolean m;
    private boolean n;

    public crpb(cqat cqatVar, crpm crpmVar) {
        this.h = cqatVar;
        this.a = crpmVar;
        dqvj c = dqvj.c(crpmVar.a.F);
        this.e = c == null ? dqvj.DRIVE : c;
    }

    public final boolean a() {
        return this.d != null;
    }

    public final int b() {
        dbsk.l(a());
        return this.j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(GmmLocation gmmLocation) {
        if (!gmmLocation.e()) {
            return false;
        }
        long j = this.k;
        if (j < 0 || !gmmLocation.y(j)) {
            return false;
        }
        if (gmmLocation.z(this.k) * 100.0d >= this.a.a.s) {
            return true;
        }
        gmmLocation.z(this.k);
        return false;
    }

    public final void d(GmmLocation gmmLocation) {
        long j = gmmLocation.j;
        if (this.a.a.v > 0 && !c(gmmLocation)) {
            this.i = Long.MAX_VALUE;
        } else if (this.i != Long.MAX_VALUE) {
        } else {
            ddww ddwwVar = this.a.a;
            this.i = j + (ddwwVar.v * ddwwVar.e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e(crqo crqoVar) {
        return f(crqoVar.b());
    }

    public final boolean f(cray crayVar) {
        long e = this.h.e();
        long j = this.i;
        amub amubVar = crayVar.a;
        int b = auee.b(this.a.c, amubVar.v);
        if (b != this.b) {
            this.b = b;
        }
        int i = amubVar.w;
        if (i != this.j) {
            this.j = i;
        }
        amuo amuoVar = crayVar.b;
        boolean z = false;
        int c = amuoVar == null ? 0 : auee.c(this.a.c, amuoVar.P);
        if (c != this.c) {
            this.c = c;
        }
        long j2 = amubVar.W;
        if (j2 != this.k) {
            this.k = j2;
        }
        amtz amtzVar = amubVar.K;
        if (amtzVar != this.d) {
            this.d = amtzVar;
        }
        dqvj dqvjVar = amubVar.h;
        if (!dqvjVar.equals(this.e)) {
            this.e = dqvjVar;
        }
        int c2 = (int) crayVar.c();
        int i2 = this.f;
        if (c2 != i2) {
            this.f = c2;
        } else {
            c2 = i2;
        }
        int i3 = crayVar.h;
        if (i3 == -1) {
            i3 = -1;
        }
        int i4 = this.l;
        if (i3 != i4) {
            this.l = i3;
        } else {
            i3 = i4;
        }
        boolean z2 = this.m;
        if (!z2 && c2 < this.a.e && e >= j) {
            this.m = true;
            z2 = true;
        }
        if (!this.g && c2 >= this.a.e && e >= j && z2) {
            this.g = true;
        }
        if (!this.n && i3 >= 0 && i3 < this.a.f) {
            this.n = true;
            int i5 = (e > j ? 1 : (e == j ? 0 : -1));
            z = true;
        }
        dbsb b2 = dbsc.b(this);
        b2.b("activeEiHash", Integer.toHexString(this.b));
        b2.f("activeTripIndex", this.j);
        b2.b("activeStepHash", Integer.toHexString(this.c));
        b2.g("activeTripId", this.k);
        b2.b("activeTripSource", this.d);
        b2.b("travelMode", this.e);
        b2.f("startToCurrentM", this.f);
        b2.f("currentToEndM", this.l);
        b2.h("wasInStartScrubbingZone", this.m);
        b2.h("hasLeftStartScrubbingZone", this.g);
        b2.h("hasEnteredEndScrubbingZone", this.n);
        return z;
    }

    public final boolean g() {
        return !this.g || this.n;
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.c();
        b.g("trustworthyHorizonRelativeMs", this.i);
        b.f("activeEiHash", this.b);
        b.f("activeTripIndex", this.j);
        b.f("activeStepHash", this.c);
        b.g("activeTripId", this.k);
        b.b("activeTripSource", this.d);
        b.b("travelMode", this.e);
        b.f("startToCurrentM", this.f);
        b.f("currentToEndM", this.l);
        b.h("wasInStartScrubbingZone", this.m);
        b.h("hasLeftStartScrubbingZone", this.g);
        b.h("hasEnteredEndScrubbingZone", this.n);
        return b.toString();
    }
}
