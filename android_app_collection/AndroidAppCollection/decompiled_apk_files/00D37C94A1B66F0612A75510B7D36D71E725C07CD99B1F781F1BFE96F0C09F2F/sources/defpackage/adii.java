package defpackage;
/* compiled from: PG */
/* renamed from: adii  reason: default package */
/* loaded from: classes.dex */
public final class adii {
    public String a;
    public String b;
    private Integer c;
    private Integer d;
    private Integer e;
    private Integer f;
    private Integer g;
    private Integer h;
    private adij i;
    private Integer j;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Integer p;
    private Long q;
    private Integer r;

    public adii() {
    }

    public adii(adik adikVar) {
        this.c = Integer.valueOf(adikVar.a);
        this.d = Integer.valueOf(adikVar.b);
        this.e = Integer.valueOf(adikVar.c);
        this.f = Integer.valueOf(adikVar.d);
        this.g = Integer.valueOf(adikVar.e);
        this.h = Integer.valueOf(adikVar.f);
        this.i = adikVar.g;
        this.j = Integer.valueOf(adikVar.h);
        this.k = Boolean.valueOf(adikVar.i);
        this.l = Boolean.valueOf(adikVar.j);
        this.m = Boolean.valueOf(adikVar.k);
        this.n = Boolean.valueOf(adikVar.l);
        this.o = Boolean.valueOf(adikVar.m);
        this.p = Integer.valueOf(adikVar.n);
        this.a = adikVar.o;
        this.b = adikVar.p;
        this.q = Long.valueOf(adikVar.q);
        this.r = Integer.valueOf(adikVar.r);
    }

    public final void b(int i) {
        this.f = Integer.valueOf(i);
    }

    public final void c(int i) {
        this.h = Integer.valueOf(i);
    }

    public final void d(int i) {
        this.g = Integer.valueOf(i);
    }

    public final void e(int i) {
        this.r = Integer.valueOf(i);
    }

    public final void f(long j) {
        this.q = Long.valueOf(j);
    }

    public final void g(int i) {
        this.j = Integer.valueOf(i);
    }

    public final void h(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    public final void i(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    public final void j(int i) {
        this.c = Integer.valueOf(i);
    }

    public final void k(int i) {
        this.e = Integer.valueOf(i);
    }

    public final void l(int i) {
        this.d = Integer.valueOf(i);
    }

    public final void m(adij adijVar) {
        if (adijVar != null) {
            this.i = adijVar;
            return;
        }
        throw new NullPointerException("Null pageType");
    }

    public final void n(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    public final void o(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    public final void p(int i) {
        this.p = Integer.valueOf(i);
    }

    public final void q(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    public final adik a() {
        Integer num = this.c;
        if (num == null || this.d == null || this.e == null || this.f == null || this.g == null || this.h == null || this.i == null || this.j == null || this.k == null || this.l == null || this.m == null || this.n == null || this.o == null || this.p == null || this.q == null || this.r == null) {
            StringBuilder sb = new StringBuilder();
            if (this.c == null) {
                sb.append(" mdxConnectionCountDay");
            }
            if (this.d == null) {
                sb.append(" mdxConnectionCountWeek");
            }
            if (this.e == null) {
                sb.append(" mdxConnectionCountMonth");
            }
            if (this.f == null) {
                sb.append(" castAvailableSessionCountDay");
            }
            if (this.g == null) {
                sb.append(" castAvailableSessionCountWeek");
            }
            if (this.h == null) {
                sb.append(" castAvailableSessionCountMonth");
            }
            if (this.i == null) {
                sb.append(" pageType");
            }
            if (this.j == null) {
                sb.append(" currentVideoDuration");
            }
            if (this.k == null) {
                sb.append(" fullScreen");
            }
            if (this.l == null) {
                sb.append(" hd");
            }
            if (this.m == null) {
                sb.append(" sd");
            }
            if (this.n == null) {
                sb.append(" playlistPlayback");
            }
            if (this.o == null) {
                sb.append(" videoControlsVisible");
            }
            if (this.p == null) {
                sb.append(" uncastedVideoCount");
            }
            if (this.q == null) {
                sb.append(" currentTime");
            }
            if (this.r == null) {
                sb.append(" casterCategory");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new adik(num.intValue(), this.d.intValue(), this.e.intValue(), this.f.intValue(), this.g.intValue(), this.h.intValue(), this.i, this.j.intValue(), this.k.booleanValue(), this.l.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.intValue(), this.a, this.b, this.q.longValue(), this.r.intValue());
    }
}
