package defpackage;
/* compiled from: PG */
/* renamed from: qao  reason: default package */
/* loaded from: classes7.dex */
public final class qao extends qcr {
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public qbn e;
    public Integer f;
    public String g;
    public crmw h;
    public int i;
    private final dbsg<dnqh> j = dbpy.a;
    private Boolean k;
    private Boolean l;
    private Boolean m;
    private Boolean n;
    private Boolean o;
    private Boolean p;
    private Boolean q;
    private qbs r;
    private Boolean s;
    private duqc t;

    @Override // defpackage.qcr
    public final void b(@dzsi duqc duqcVar) {
        this.t = duqcVar;
    }

    @Override // defpackage.qcr
    public final void c(boolean z) {
        this.n = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void d(boolean z) {
        this.o = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void e(boolean z) {
        this.q = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void f(qbs qbsVar) {
        if (qbsVar != null) {
            this.r = qbsVar;
            return;
        }
        throw new NullPointerException("Null resultViewMode");
    }

    @Override // defpackage.qcr
    public final void g(boolean z) {
        this.m = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void h(boolean z) {
        this.l = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void i(boolean z) {
        this.p = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void j(boolean z) {
        this.k = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final void k(boolean z) {
        this.s = Boolean.valueOf(z);
    }

    @Override // defpackage.qcr
    public final qct a() {
        String str = this.k == null ? " showShareTripDialog" : "";
        if (this.a == null) {
            str = str.concat(" maySearch");
        }
        if (this.b == null) {
            str = String.valueOf(str).concat(" isMultimodalLeg");
        }
        if (this.i == 0) {
            str = String.valueOf(str).concat(" promoType");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" skipRouteSelection");
        }
        if (this.l == null) {
            str = String.valueOf(str).concat(" showFromMyLocation");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" show2wPromo");
        }
        if (this.m == null) {
            str = String.valueOf(str).concat(" shouldRefresh");
        }
        if (this.n == null) {
            str = String.valueOf(str).concat(" hasBeenOfferedRefinement");
        }
        if (this.o == null) {
            str = String.valueOf(str).concat(" popDirectionsOnNavExit");
        }
        if (this.p == null) {
            str = String.valueOf(str).concat(" showResumeNavigationNotification");
        }
        if (this.q == null) {
            str = String.valueOf(str).concat(" replaceTopmostDirectionsFragment");
        }
        if (this.r == null) {
            str = String.valueOf(str).concat(" resultViewMode");
        }
        if (this.s == null) {
            str = String.valueOf(str).concat(" showTransitGuidanceUpdate");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qap(this.j, this.k.booleanValue(), this.a.booleanValue(), this.b.booleanValue(), this.i, this.c.booleanValue(), this.l.booleanValue(), this.d.booleanValue(), this.m.booleanValue(), this.n.booleanValue(), this.o.booleanValue(), this.p.booleanValue(), this.q.booleanValue(), this.r, this.e, this.s.booleanValue(), this.f, this.g, this.t, this.h);
    }
}
