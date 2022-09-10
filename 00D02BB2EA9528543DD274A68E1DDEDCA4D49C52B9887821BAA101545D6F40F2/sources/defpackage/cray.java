package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: cray  reason: default package */
/* loaded from: classes5.dex */
public class cray {
    public final amub a;
    @dzsi
    public final amuo b;
    public final boolean c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final amsx i;
    public final amsx j;
    public final boolean k;
    public final boolean l;
    public final int m;
    @dzsi
    public final amvw n;

    public cray(crax craxVar) {
        amub amubVar = craxVar.a;
        dbsk.s(amubVar);
        this.a = amubVar;
        this.b = craxVar.b;
        this.c = craxVar.c;
        this.d = craxVar.d;
        this.e = craxVar.e;
        this.f = craxVar.g;
        this.g = craxVar.h;
        this.h = craxVar.f;
        this.i = craxVar.i;
        this.j = craxVar.j;
        this.k = craxVar.l;
        this.l = craxVar.m;
        this.n = craxVar.n;
        this.m = craxVar.k;
    }

    public final int a() {
        return (int) Math.round(this.i.d());
    }

    public final int b() {
        return (int) Math.round(this.j.d());
    }

    public final double c() {
        int i;
        return (this.b == null || (i = this.g) == -1) ? dcyn.a : this.a.D - i;
    }

    @dzsi
    public final String d() {
        return amux.k(this.b);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cray)) {
            return false;
        }
        cray crayVar = (cray) obj;
        return dbsd.a(this.a, crayVar.a) && dbsd.a(this.b, crayVar.b) && this.d == crayVar.d && this.e == crayVar.e && this.f == crayVar.f && this.g == crayVar.g && dbsd.a(this.i, crayVar.i) && dbsd.a(this.j, crayVar.j) && dbsd.a(this.n, crayVar.n) && dbsd.a(Boolean.valueOf(this.k), Boolean.valueOf(crayVar.k)) && this.m == crayVar.m && dbsd.a(Boolean.valueOf(this.l), Boolean.valueOf(crayVar.l));
    }

    public final dpej f() {
        return this.a.O;
    }

    public final dpej g() {
        return this.a.N();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b, Integer.valueOf(this.d), Integer.valueOf(this.e), Integer.valueOf(this.f), Integer.valueOf(this.g), this.i, this.j, Boolean.valueOf(this.k), Boolean.valueOf(this.l), Integer.valueOf(this.m), this.n});
    }

    public final String toString() {
        dbsb d = dbsc.d(cray.class.getSimpleName());
        d.b("route", this.a);
        amuo amuoVar = this.b;
        d.f("curStep", amuoVar == null ? -1 : amuoVar.i);
        d.f("curSegment", this.d);
        d.f("metersToNextStep", this.e);
        d.f("secondsToNextStep", this.f);
        d.f("metersRemaining", this.g);
        d.f("metersRemainingToNextDestination", this.h);
        d.b("combinedSecondsRemaining", this.i);
        d.b("combinedSecondsRemainingToNextDestination", this.j);
        d.h("isOnRoute", this.k);
        d.h("routeCompletedSuccessfully", this.l);
        d.b("location", this.n);
        d.f("metersToEndOfCurrentJam", this.m);
        return d.toString();
    }

    @dzsi
    public final akru e(float f) {
        int i = this.d;
        if (i < 0) {
            amuo amuoVar = this.b;
            if (amuoVar == null) {
                return null;
            }
            i = amuoVar.j;
        }
        int i2 = i + 1;
        akrk w = this.a.w();
        if (i2 >= w.l()) {
            return null;
        }
        if (f >= 0.0f) {
            double K = this.a.K(i2);
            int l = w.l();
            amub amubVar = this.a;
            double d = f;
            Double.isNaN(d);
            return new akru(w, i2, Math.min(l, amubVar.aa(K + d) + 1));
        }
        return new akru(w, i2);
    }
}
