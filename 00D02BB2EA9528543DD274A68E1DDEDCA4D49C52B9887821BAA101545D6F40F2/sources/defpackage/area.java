package defpackage;

import java.util.Arrays;
import java.util.List;
/* compiled from: PG */
/* renamed from: area  reason: default package */
/* loaded from: classes.dex */
public final class area {
    @dzsi
    public akra a;
    @dzsi
    public akra b;
    public float c;
    @dzsi
    public List<amvl> d;
    public float e;
    public float f;
    public float g;
    public float h;
    public int i;
    @dzsi
    public akra j;
    public boolean k;
    public boolean l;
    public float m;
    public float n;
    public long o;
    public long p;
    public float r;
    public float s;
    @dzsi
    private altv u;
    private boolean v;
    public float q = 1.0f;
    public boolean t = true;
    private final akra w = new akra();

    public area() {
        d();
    }

    @dzsi
    public final akra a() {
        akra akraVar = this.j;
        return akraVar == null ? this.a : akraVar;
    }

    public final void b(@dzsi area areaVar) {
        if (areaVar == null) {
            d();
            return;
        }
        c(areaVar.a, areaVar.e, areaVar.i, areaVar.k);
        this.b = areaVar.b;
        this.c = areaVar.c;
        this.d = areaVar.d;
        akra akraVar = areaVar.j;
        this.j = akraVar == null ? null : new akra(akraVar);
        this.g = areaVar.g;
        this.f = areaVar.f;
        this.h = areaVar.h;
        this.l = areaVar.l;
        this.u = null;
        this.v = false;
        this.m = areaVar.m;
        this.n = areaVar.n;
        this.r = areaVar.r;
        this.s = areaVar.s;
        this.q = areaVar.q;
        this.t = areaVar.t;
        this.o = areaVar.o;
        this.p = areaVar.p;
    }

    public final void c(@dzsi akra akraVar, float f, int i, boolean z) {
        this.a = akraVar == null ? null : new akra(akraVar);
        this.e = f;
        this.i = i;
        this.k = z;
    }

    public final void d() {
        this.a = null;
        this.b = null;
        this.e = 0.0f;
        this.g = 0.0f;
        this.f = 0.0f;
        this.h = -1.0f;
        this.i = -1;
        this.j = null;
        this.k = false;
        this.l = false;
        this.u = null;
        this.v = false;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0L;
        this.p = 0L;
        this.r = 1.0f;
        this.s = 1.0f;
        this.q = 1.0f;
        this.t = true;
    }

    public final boolean e() {
        return this.a != null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof area)) {
            return false;
        }
        area areaVar = (area) obj;
        if (dbsd.a(this.a, areaVar.a) && this.e == areaVar.e && this.g == areaVar.g && this.f == areaVar.f && this.h == areaVar.h && this.i == areaVar.i && dbsd.a(this.j, areaVar.j) && this.k == areaVar.k && this.l == areaVar.l) {
            altv altvVar = areaVar.u;
            if (dbsd.a(null, null)) {
                boolean z = areaVar.v;
                if (this.m == areaVar.m && this.n == areaVar.n && this.r == areaVar.r && this.s == areaVar.s && this.q == areaVar.q && this.t == areaVar.t && this.o == areaVar.o && this.p == areaVar.p) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean f(aksk akskVar) {
        if (!e()) {
            return false;
        }
        akra akraVar = this.a;
        dbsk.s(akraVar);
        akra a = a();
        dbsk.s(a);
        int r = this.i * ((int) a.r());
        this.w.t(a.a + r, a.b + r);
        if (akskVar.j(this.w)) {
            return true;
        }
        this.w.t(a.a - r, a.b - r);
        if (akskVar.j(this.w) || akskVar.j(akraVar)) {
            return true;
        }
        akra akraVar2 = this.b;
        return akraVar2 != null && akskVar.j(akraVar2);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.e), Float.valueOf(this.g), Float.valueOf(this.f), Float.valueOf(this.h), Integer.valueOf(this.i), Boolean.valueOf(this.k), Boolean.valueOf(this.l), null, false, Float.valueOf(this.m), Float.valueOf(this.n), Float.valueOf(this.r), Float.valueOf(this.s), Float.valueOf(this.q), Boolean.valueOf(this.t)});
    }

    public final String toString() {
        akra akraVar = this.a;
        if (akraVar == null) {
            return "Invalid point";
        }
        dbsb b = dbsc.b(this);
        b.b("@", akraVar.T());
        b.f("Accuracy (meters)", this.i);
        akra akraVar2 = this.j;
        if (akraVar2 != null) {
            b.b("Accuracy point", akraVar2.T());
        }
        b.h("Use angle", this.k);
        if (this.k) {
            b.e("Angle (degrees)", this.e);
        }
        b.h("Use GPS angle", this.l);
        if (this.l) {
            b.e("GPS angle (degrees)", this.h);
        }
        b.e("ThrobFactor", this.r);
        b.e("Height (meters)", this.m);
        b.b("Indoor level", null);
        b.h("Marker not on visible level", false);
        b.g("Absolute time of last location update (ms)", this.o);
        b.g("Relative time of last location update (ms)", this.p);
        b.e("Staleness (0=not stale, 1=stale)", this.n);
        b.e("Scaling factor", this.q);
        b.h("Currently displayed", this.t);
        b.b("Possible alternate locations", this.d);
        return b.toString();
    }

    public area(akra akraVar, float f, int i, boolean z) {
        c(akraVar, f, i, z);
    }

    public area(area areaVar) {
        b(areaVar);
    }
}
