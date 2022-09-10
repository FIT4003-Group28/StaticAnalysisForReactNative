package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: amvw  reason: default package */
/* loaded from: classes.dex */
public final class amvw {
    public final boolean a;
    public final List<amvl> b;
    public final dznf c;

    public amvw() {
        this(false);
    }

    public static amvw i(long j, double d, double d2, double d3, double d4) {
        double d5 = 8.0d * d2;
        dzlb dzlbVar = new dzlb();
        double d6 = d5 / 2.0d;
        dzlbVar.a(j, d - d6);
        amvw amvwVar = new amvw(true);
        amvwVar.b(amvl.a(new akra(), 1.0f, 0.0f, new ahmp(d3, d4), new ahmp(d6, d2), dzlbVar, (float) d5).a());
        return amvwVar;
    }

    public final boolean a(long j) {
        return this.c.c(j);
    }

    public final void b(amvl amvlVar) {
        this.b.add(amvlVar);
        dznf dznfVar = this.c;
        dzna a = amvlVar.d().a();
        while (a.hasNext()) {
            ((dzkr) dznfVar).b(a.b());
        }
    }

    public final double c(long j, double d, double d2) {
        double d3 = dcyn.a;
        for (amvl amvlVar : this.b) {
            d3 += amvlVar.e(j, d, d2);
        }
        return d3;
    }

    public final double d(long j, double d, double d2) {
        double d3 = 0.0d;
        double d4 = 0.0d;
        for (amvl amvlVar : this.b) {
            if (amvlVar.d().c(j)) {
                d4 += amvlVar.e(j, d, d2);
                double b = amvlVar.b();
                Double.isNaN(b);
                d3 += b;
            }
        }
        return d3 == dcyn.a ? dcyn.a : d4 / d3;
    }

    public final double e(long j, double d) {
        return c(j, d, Double.POSITIVE_INFINITY);
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof amvw)) {
            return false;
        }
        amvw amvwVar = (amvw) obj;
        return dbsd.a(this.b, amvwVar.b) && dbsd.a(Boolean.valueOf(this.a), Boolean.valueOf(amvwVar.a));
    }

    public final double f(long j, double d) {
        return d(j, d, Double.POSITIVE_INFINITY);
    }

    public final double g() {
        double d = dcyn.a;
        for (amvl amvlVar : this.b) {
            double b = amvlVar.b();
            Double.isNaN(b);
            d += b;
        }
        return d;
    }

    public final double h() {
        double d = dcyn.a;
        for (amvl amvlVar : this.b) {
            if (amvlVar.i) {
                double b = amvlVar.b();
                Double.isNaN(b);
                d += b;
            }
        }
        return d;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return hashCode + hashCode + (this.a ? 1 : 0);
    }

    public final String toString() {
        dbsb b = dbsc.b(this);
        b.d("totalProbability", g());
        b.b("matchedRouteIds", this.c);
        b.h("isFake", this.a);
        b.b("contents", this.b.toString());
        return b.toString();
    }

    public amvw(boolean z) {
        this.b = new ArrayList();
        this.c = new dzmv();
        this.a = z;
    }
}
