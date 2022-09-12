package defpackage;
/* compiled from: PG */
/* renamed from: amvy  reason: default package */
/* loaded from: classes2.dex */
public final class amvy extends amwa {
    private bvrt<dpad> A;
    private bvrt<dnpq> B;
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public doyd f;
    public String g;
    public String h;
    public String i;
    public Long j;
    public Long k;
    public String l;
    public bvrt<dgas> m;
    public bvrt<dgas> n;
    public bvrt<dowb> o;
    public bvrt<dotj> p;
    public dcdc<bvrt<dqts>> q;
    public int r;
    private Long s;
    private String t;
    private Boolean u;
    private Boolean v;
    private bvrt<dgas> w;
    private bvrt<dgas> x;
    private Float y;
    private Boolean z;

    public amvy() {
    }

    public amvy(amwb amwbVar) {
        amvz amvzVar = (amvz) amwbVar;
        this.s = Long.valueOf(amvzVar.a);
        this.t = amvzVar.b;
        this.a = amvzVar.c;
        this.b = amvzVar.d;
        this.c = amvzVar.e;
        this.d = amvzVar.f;
        this.e = amvzVar.g;
        this.f = amvzVar.h;
        this.u = Boolean.valueOf(amvzVar.i);
        this.g = amvzVar.j;
        this.h = amvzVar.k;
        this.v = Boolean.valueOf(amvzVar.l);
        this.i = amvzVar.m;
        this.j = amvzVar.n;
        this.k = amvzVar.o;
        this.l = amvzVar.p;
        this.r = amvzVar.B;
        this.m = amvzVar.q;
        this.w = amvzVar.r;
        this.x = amvzVar.s;
        this.n = amvzVar.t;
        this.y = Float.valueOf(amvzVar.u);
        this.z = Boolean.valueOf(amvzVar.v);
        this.o = amvzVar.w;
        this.A = amvzVar.x;
        this.p = amvzVar.y;
        this.B = amvzVar.z;
        this.q = amvzVar.A;
    }

    @Override // defpackage.amwa
    public final void b(String str) {
        if (str != null) {
            this.t = str;
            return;
        }
        throw new NullPointerException("Null captionText");
    }

    @Override // defpackage.amwa
    public final void c(long j) {
        this.s = Long.valueOf(j);
    }

    @Override // defpackage.amwa
    public final void d(boolean z) {
        this.u = Boolean.valueOf(z);
    }

    @Override // defpackage.amwa
    public final void e(boolean z) {
        this.v = Boolean.valueOf(z);
    }

    @Override // defpackage.amwa
    public final void f(boolean z) {
        this.z = Boolean.valueOf(z);
    }

    @Override // defpackage.amwa
    public final void g(float f) {
        this.y = Float.valueOf(f);
    }

    @Override // defpackage.amwa
    public final void h(bvrt<dgas> bvrtVar) {
        this.w = bvrtVar;
    }

    @Override // defpackage.amwa
    public final void i(bvrt<dpad> bvrtVar) {
        this.A = bvrtVar;
    }

    @Override // defpackage.amwa
    public final void j(bvrt<dgas> bvrtVar) {
        this.x = bvrtVar;
    }

    @Override // defpackage.amwa
    public final void k(bvrt<dnpq> bvrtVar) {
        this.B = bvrtVar;
    }

    @Override // defpackage.amwa
    public final amwb a() {
        String str = this.s == null ? " incidentId" : "";
        if (this.t == null) {
            str = str.concat(" captionText");
        }
        if (this.u == null) {
            str = String.valueOf(str).concat(" isAlongTheRoute");
        }
        if (this.v == null) {
            str = String.valueOf(str).concat(" isUserModerationEnabled");
        }
        if (this.y == null) {
            str = String.valueOf(str).concat(" speedMetersPerSecond");
        }
        if (this.z == null) {
            str = String.valueOf(str).concat(" shouldHaveIcon");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new amvz(this.s.longValue(), this.t, this.a, this.b, this.c, this.d, this.e, this.f, this.u.booleanValue(), this.g, this.h, this.v.booleanValue(), this.i, this.j, this.k, this.l, this.r, this.m, this.w, this.x, this.n, this.y.floatValue(), this.z.booleanValue(), this.o, this.A, this.p, this.B, this.q);
    }
}
